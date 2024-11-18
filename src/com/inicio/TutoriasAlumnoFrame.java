package com.inicio;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.ArrayList;

public class TutoriasAlumnoFrame extends JFrame {

    private String nombre;
    private JTable tablaTutorias;
    private JScrollPane scrollPane;
    private String[] columnas = {"Materia", "Profesor"};
    private JButton btnVolver, btnComentar;
    private int idEstudiante;
    private ArrayList<Integer> tutoriasIds; // Almacena los IDs de las tutorías para referenciarlos al comentar

    public TutoriasAlumnoFrame(int idEstudiante, String nombre) {
        setTitle("Mis Tutorías");
        setSize(700, 500);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        this.idEstudiante = idEstudiante;
        this.nombre = nombre;

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        // Panel superior con los botones
        JPanel panelBotones = new JPanel();
        btnVolver = new JButton("Volver");
        btnVolver.setFont(new Font("Arial", Font.BOLD, 14));
        btnVolver.setBackground(Color.LIGHT_GRAY);
        btnVolver.setPreferredSize(new Dimension(100, 30));
        btnVolver.addActionListener(e -> volver());
        panelBotones.add(btnVolver);

        btnComentar = new JButton("Comentar");
        btnComentar.setFont(new Font("Arial", Font.BOLD, 14));
        btnComentar.setBackground(Color.LIGHT_GRAY);
        btnComentar.setPreferredSize(new Dimension(120, 30));
        btnComentar.addActionListener(e -> comentarTutoria());
        panelBotones.add(btnComentar);

        panel.add(panelBotones, BorderLayout.NORTH);

        // Crear la tabla y el scrollPane
        tablaTutorias = new JTable();
        scrollPane = new JScrollPane(tablaTutorias);
        panel.add(scrollPane, BorderLayout.CENTER);

        // Cargar las tutorías
        cargarTutorias(idEstudiante);

        // Agregar el panel principal al JFrame
        add(panel);
        setVisible(true);
    }

    private void volver() {
        alumno alum = new alumno(this.nombre, this.idEstudiante);
        alum.setVisible(true);
        dispose();
    }

    private void cargarTutorias(int idEstudiante) {
        ArrayList<String[]> tutorias = new ArrayList<>();
        tutoriasIds = new ArrayList<>();

        String query = "SELECT t.idTutoria, m.nombreMateria, r.nombreUsuario " +
                       "FROM tutoria t " +
                       "JOIN materias m ON t.idMateria = m.idMateria " +
                       "JOIN profesor p ON t.idProfesor = p.idProfesor " +
                       "JOIN registro r ON p.idProfesor = r.id " +
                       "WHERE t.idEstudiante = ?";

        try (Connection conn = conexion.obtenerconexion();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setInt(1, idEstudiante);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                int idTutoria = rs.getInt("idTutoria");
                String materia = rs.getString("nombreMateria");
                String nombreProfesor = rs.getString("nombreUsuario");
                tutorias.add(new String[]{materia, nombreProfesor});
                tutoriasIds.add(idTutoria);
            }

            String[][] datos = new String[tutorias.size()][2];
            for (int i = 0; i < tutorias.size(); i++) {
                datos[i] = tutorias.get(i);
            }

            tablaTutorias.setModel(new javax.swing.table.DefaultTableModel(datos, columnas));
            tablaTutorias.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al cargar las tutorías: " + e.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void comentarTutoria() {
        int selectedRow = tablaTutorias.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Por favor, selecciona una tutoría para comentar.",
                    "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }

        int idTutoriaSeleccionada = tutoriasIds.get(selectedRow);

        String comentario = JOptionPane.showInputDialog(this, "Escribe tu comentario:",
                "Agregar Comentario", JOptionPane.PLAIN_MESSAGE);

        if (comentario != null && !comentario.trim().isEmpty()) {
            guardarComentario(idTutoriaSeleccionada, comentario);
        } else {
            JOptionPane.showMessageDialog(this, "El comentario no puede estar vacío.",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void guardarComentario(int idTutoria, String comentario) {
        String query = "INSERT INTO comentarios (idTutoria, comentario) VALUES (?, ?)";

        try (Connection conn = conexion.obtenerconexion();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setInt(1, idTutoria);
            stmt.setString(2, comentario);
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(this, "Comentario agregado con éxito.",
                    "Éxito", JOptionPane.INFORMATION_MESSAGE);

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al guardar el comentario: " + e.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}




