package com.inicio;

import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class escogerPro extends javax.swing.JFrame {
    private JTable table;
    private JButton btnRegistrarTutoria;
    private JButton btnSubirComentario;
    private JButton btnVolver;
    private JButton btnVerComentarios; // Nuevo botón para ver comentarios
    private JTextArea txtComentario;  // Área de texto para el comentario
    private int idUsuario;
    private String nombre;
    private String materiaSeleccionada;

    // Constructor
    public escogerPro(int idUsuario, String materiaSeleccionada, String nombre) {
        this.idUsuario = idUsuario;
        this.materiaSeleccionada = materiaSeleccionada;
        this.nombre = nombre;
        initComponents();
        loadData(); // Cargar los datos de los profesores y las materias
    }

    // Inicialización de los componentes del JFrame
    private void initComponents() {
        setTitle("Seleccionar Profesor");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null); // Centrar la ventana en la pantalla

        // Panel principal
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // Añadir espacio alrededor
        add(panel);

        // Título
        JLabel titleLabel = new JLabel("Seleccionar profesor", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
        panel.add(titleLabel);

        // Tabla
        table = new JTable();
        table.setFillsViewportHeight(true);
        JScrollPane tableScrollPane = new JScrollPane(table);
        tableScrollPane.setBorder(BorderFactory.createTitledBorder("Lista de Profesores"));
        panel.add(tableScrollPane);

        // Área para escribir un comentario
        JLabel comentarioLabel = new JLabel("Comentario sobre el docente:");
        panel.add(comentarioLabel);
        
        txtComentario = new JTextArea(4, 20); // 4 filas y 20 columnas para el área de texto
        JScrollPane commentScrollPane = new JScrollPane(txtComentario);
        panel.add(commentScrollPane);

        // Panel para los botones (ubicación inferior)
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 10)); // Alinear a la izquierda y espaciado
        panel.add(buttonPanel);

        // Botón de registrar tutoría
        btnRegistrarTutoria = new JButton("Registrar Tutoría");
        btnRegistrarTutoria.setBackground(new Color(76, 175, 80)); // Color verde
        btnRegistrarTutoria.setForeground(Color.WHITE); // Color de texto blanco
        btnRegistrarTutoria.setFocusPainted(false); // Sin borde al hacer foco
        buttonPanel.add(btnRegistrarTutoria); // Añadir el botón al panel

        // Botón de subir comentario
        btnSubirComentario = new JButton("Subir Comentario");
        btnSubirComentario.setBackground(new Color(33, 150, 243)); // Color azul
        btnSubirComentario.setForeground(Color.WHITE); // Color de texto blanco
        btnSubirComentario.setFocusPainted(false); // Sin borde al hacer foco
        buttonPanel.add(btnSubirComentario); // Añadir el botón al panel

        // Nuevo botón para ver los comentarios
        btnVerComentarios = new JButton("Ver Comentarios");
        btnVerComentarios.setBackground(new Color(255, 193, 7)); // Color amarillo
        btnVerComentarios.setForeground(Color.WHITE); // Color de texto blanco
        btnVerComentarios.setFocusPainted(false); // Sin borde al hacer foco
        buttonPanel.add(btnVerComentarios); // Añadir el botón al panel

        // Botón de volver
        btnVolver = new JButton("Volver");
        btnVolver.setBackground(new Color(255, 87, 34)); // Color rojo
        btnVolver.setForeground(Color.WHITE); // Color de texto blanco
        btnVolver.setFocusPainted(false); // Sin borde al hacer foco
        buttonPanel.add(btnVolver); // Añadir el botón al panel

        // Acción del botón de volver
        btnVolver.addActionListener(e -> volverALaVentanaAlumno());

        // Acción del botón de registrar tutoría
        btnRegistrarTutoria.addActionListener(e -> registrarTutoria());

        // Acción del botón de subir comentario
        btnSubirComentario.addActionListener(e -> subirComentario());

        // Acción del botón de ver comentarios
        btnVerComentarios.addActionListener(e -> verComentarios());
    }

    // Método para cargar los datos de profesores y materias desde la base de datos
    private void loadData() {
        String sql = "SELECT p.idProfesor, r.nombreUsuario, r.correoUsuario, " +
                     "p.DescripcionP, m.nombreMateria, m.descripcionMateria " +
                     "FROM profesor p " +
                     "JOIN registro r ON p.idProfesor = r.id " +  
                     "JOIN materias_profesor mp ON p.idProfesor = mp.idProfesor " +
                     "JOIN materias m ON mp.idMateria = m.idMateria " +
                     "WHERE m.nombreMateria = ?";
        try (Connection con = conexion.obtenerconexion();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, materiaSeleccionada);
            ResultSet rs = ps.executeQuery();

            DefaultTableModel model = new DefaultTableModel(new String[]{"ID Profesor", "Nombre Profesor", "Correo", "Info para el estudiante", "Materia", "Descripción Materia"}, 0);
            if (!rs.next()) {
                JOptionPane.showMessageDialog(this, "No se encontraron profesores para la materia seleccionada.");
            } else {
                do {
                    model.addRow(new Object[] {
                        rs.getInt("idProfesor"),  
                        rs.getString("nombreUsuario"),  
                        rs.getString("correoUsuario"),  
                        rs.getString("DescripcionP"),  
                        rs.getString("nombreMateria"),  
                        rs.getString("descripcionMateria")  
                    });
                } while (rs.next());
            }
            table.setModel(model);

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al cargar datos: " + e.getMessage());
        }
    }

    // Método para registrar la tutoría
    private void registrarTutoria() {
        int selectedRow = table.getSelectedRow();
        if (selectedRow != -1) {
            int idProfesor = (int) table.getValueAt(selectedRow, 0);
            int idMateria = obtenerIdMateria(materiaSeleccionada); // Obtener el id de la materia

            String sqlTutoria = "INSERT INTO tutoria (idEstudiante, idProfesor, idMateria) VALUES (?, ?, ?)";
            try (Connection con = conexion.obtenerconexion();
                 PreparedStatement psTutoria = con.prepareStatement(sqlTutoria)) {

                // Registrar tutoría
                psTutoria.setInt(1, idUsuario);
                psTutoria.setInt(2, idProfesor);
                psTutoria.setInt(3, idMateria);  // Usar el idMateria
                int rowsAffectedTutoria = psTutoria.executeUpdate();

                if (rowsAffectedTutoria > 0) {
                    JOptionPane.showMessageDialog(this, "Tutoría registrada con éxito.");
                } else {
                    JOptionPane.showMessageDialog(this, "No se pudo registrar la tutoría.");
                }

            } catch (SQLException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error al registrar tutoría: " + e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, selecciona un profesor para registrar la tutoría.");
        }
    }

    // Método para subir un comentario sobre el docente
    private void subirComentario() {
        String comentario = txtComentario.getText().trim(); // Obtener el comentario del área de texto

        if (comentario.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, escribe un comentario sobre el docente.");
            return;
        }

        int selectedRow = table.getSelectedRow();
        if (selectedRow != -1) {
            int idProfesor = (int) table.getValueAt(selectedRow, 0);
            int idMateria = obtenerIdMateria(materiaSeleccionada); // Obtener el id de la materia

            String sqlComentario = "INSERT INTO comentarios (idTutoria, comentario) VALUES ((SELECT MAX(idTutoria) FROM tutoria), ?)";

            try (Connection con = conexion.obtenerconexion();
                 PreparedStatement psComentario = con.prepareStatement(sqlComentario)) {

                // Subir comentario
                psComentario.setString(1, comentario);
                psComentario.executeUpdate();

                JOptionPane.showMessageDialog(this, "Comentario añadido con éxito.");
                txtComentario.setText(""); // Limpiar el área de texto después de subir el comentario

            } catch (SQLException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error al subir comentario: " + e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, selecciona un profesor para añadir el comentario.");
        }
    }

    // Método para ver los comentarios del profesor seleccionado
    private void verComentarios() {
        int selectedRow = table.getSelectedRow();
        if (selectedRow != -1) {
            int idProfesor = (int) table.getValueAt(selectedRow, 0);

            String sql = "SELECT c.comentario " +
                         "FROM comentarios c " +
                         "JOIN tutoria t ON c.idTutoria = t.idTutoria " +
                         "WHERE t.idProfesor = ?";

            try (Connection con = conexion.obtenerconexion();
                 PreparedStatement ps = con.prepareStatement(sql)) {

                ps.setInt(1, idProfesor);
                ResultSet rs = ps.executeQuery();

                StringBuilder comentarios = new StringBuilder();
                int contador = 1;  // Variable para numerar los comentarios
                while (rs.next()) {
                    comentarios.append("Comentario ").append(contador).append(":\n")
                               .append(rs.getString("comentario")).append("\n\n"); // Espacio adicional entre comentarios
                    contador++; // Incrementar el contador
                }

                if (comentarios.length() > 0) {
                    JOptionPane.showMessageDialog(this, comentarios.toString(), "Comentarios del Profesor", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "No hay comentarios disponibles para este profesor.");
                }

            } catch (SQLException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error al obtener los comentarios: " + e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, selecciona un profesor para ver los comentarios.");
        }
    }

    // Método para obtener el id de la materia seleccionada
    private int obtenerIdMateria(String materia) {
        String sql = "SELECT idMateria FROM materias WHERE nombreMateria = ?";
        try (Connection con = conexion.obtenerconexion();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, materia);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                return rs.getInt("idMateria");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return -1;
    }

    // Método para volver a la ventana anterior (de estudiantes)
    private void volverALaVentanaAlumno() {
        this.setVisible(false);
       // new AlumnoVentana(idUsuario).setVisible(true); // Suponiendo que tienes una clase llamada AlumnoVentana
    }
}
