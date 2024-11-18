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
    private JButton btnVolver;
    private int idEstudiante;

    public TutoriasAlumnoFrame(int idEstudiante, String nombre) {
        // Configuración del JFrame
        setTitle("Mis Tutorías");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        this.idEstudiante = idEstudiante; // Guardar el idEstudiante
        this.nombre = nombre;  // Guardar el nombre del estudiante

        // Panel principal
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        // Crear el panel de encabezado para el botón "Volver"
        JPanel panelVolver = new JPanel();
        btnVolver = new JButton("Volver");
        btnVolver.setFont(new Font("Arial", Font.BOLD, 14));
        btnVolver.setBackground(Color.LIGHT_GRAY);
        btnVolver.setPreferredSize(new Dimension(100, 30)); // Tamaño ajustado para el botón
        btnVolver.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                volver();  // Llamada al método volver
            }
        });
        panelVolver.add(btnVolver);
        panel.add(panelVolver, BorderLayout.NORTH); // Añadir al panel en la parte superior

        // Crear la tabla y el scrollPane
        tablaTutorias = new JTable();
        scrollPane = new JScrollPane(tablaTutorias);
        panel.add(scrollPane, BorderLayout.CENTER);

        // Cargar las tutorías
        cargarTutorias(idEstudiante);

        // Agregar panel al JFrame
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

        // Consulta para obtener las tutorías del estudiante
        String query = "SELECT m.nombreMateria, r.nombreUsuario " +
                       "FROM tutoria t " +
                       "JOIN materias m ON t.idMateria = m.idMateria " +
                       "JOIN profesor p ON t.idProfesor = p.idProfesor " +
                       "JOIN registro r ON p.idProfesor = r.id " +
                       "WHERE t.idEstudiante = ?";  // Solo el parámetro idEstudiante

        try (Connection conn = conexion.obtenerconexion();  // Asegúrate de que 'Conexion' sea la clase correcta para la conexión
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, idEstudiante);  // Establece el id del estudiante en la consulta

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                String materia = rs.getString("nombreMateria");
                String nombreProfesor = rs.getString("nombreUsuario");
                tutorias.add(new String[]{materia, nombreProfesor});
            }

            // Cargar los datos en la tabla
            String[][] datos = new String[tutorias.size()][2];
            for (int i = 0; i < tutorias.size(); i++) {
                datos[i] = tutorias.get(i);
            }

            tablaTutorias.setModel(new javax.swing.table.DefaultTableModel(datos, columnas));

            // Agregar un listener para la selección de filas
            tablaTutorias.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            tablaTutorias.getSelectionModel().addListSelectionListener(e -> {
                int row = tablaTutorias.getSelectedRow();
                if (row != -1) {
                    System.out.println("Fila seleccionada: " + row);
                }
            });

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al cargar las tutorías: " + e.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}



