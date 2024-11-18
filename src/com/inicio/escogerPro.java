package com.inicio;

import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class escogerPro extends javax.swing.JFrame {
    private JTable table;
    private JButton btnRegistrarTutoria; // Botón registrar tutoría
    private JButton btnVolver; // Botón volver
    private JButton btnVerComentarios; // Botón para ver comentarios
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
        
        

        // Panel para los botones (ubicación inferior)
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 10)); // Alinear a la izquierda y espaciado
        panel.add(buttonPanel);
        // Botón de ver info para el estudiante
        JButton btnVerInfoEstudiante = new JButton("Ver Info Estudiante");
        btnVerInfoEstudiante.setBackground(new Color(33, 150, 243)); // Color azul
        btnVerInfoEstudiante.setForeground(Color.WHITE); // Color de texto blanco
        btnVerInfoEstudiante.setFocusPainted(false); // Sin borde al hacer foco
        buttonPanel.add(btnVerInfoEstudiante); // Añadir el botón al panel

        
        JButton btnVerInfoMateria = new JButton("Ver Info Materia");
        btnVerInfoMateria.setBackground(new Color(33, 150, 243)); // Color azul
        btnVerInfoMateria.setForeground(Color.WHITE); // Color de texto blanco
        btnVerInfoMateria.setFocusPainted(false); // Sin borde al hacer foco
        buttonPanel.add(btnVerInfoMateria); // Añadir el botón al panel
        // Botón de registrar tutoría
        btnRegistrarTutoria = new JButton("Registrar Tutoría");
        btnRegistrarTutoria.setBackground(new Color(76, 175, 80)); // Color verde
        btnRegistrarTutoria.setForeground(Color.WHITE); // Color de texto blanco
        btnRegistrarTutoria.setFocusPainted(false); // Sin borde al hacer foco
        buttonPanel.add(btnRegistrarTutoria); // Añadir el botón al panel

        // Botón de ver comentarios
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
        
        btnVerInfoMateria.addActionListener(e -> mostrarInfoMateria());
        
        btnVerInfoEstudiante.addActionListener(e -> mostrarInfoEstudiante());



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
                    model.addRow(new Object[]{
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
    
    // Método para mostrar la información completa de la materia
private void mostrarInfoMateria() {
    String sql = "SELECT descripcionMateria FROM materias WHERE nombreMateria = ?";
    try (Connection con = conexion.obtenerconexion();
         PreparedStatement ps = con.prepareStatement(sql)) {
        
        ps.setString(1, materiaSeleccionada); // Usamos materiaSeleccionada para obtener la información de la materia
        ResultSet rs = ps.executeQuery();
        
        if (rs.next()) {
            String descripcionMateria = rs.getString("descripcionMateria");
            
            // Crear un JFrame para mostrar la descripción de la materia
            JFrame infoMateriaFrame = new JFrame("Descripción de la Materia");
            infoMateriaFrame.setSize(400, 300);
            infoMateriaFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            infoMateriaFrame.setLocationRelativeTo(this);
            
            // Crear un JTextArea para mostrar la descripción
            JTextArea textArea = new JTextArea();
            textArea.setText("Descripción de la Materia:\n" + descripcionMateria);
            textArea.setEditable(false); // Hacerlo solo de lectura
            textArea.setLineWrap(true);
            textArea.setWrapStyleWord(true);
            
            JScrollPane scrollPane = new JScrollPane(textArea);
            infoMateriaFrame.add(scrollPane);
            infoMateriaFrame.setVisible(true);
        }
        
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error al obtener la información de la materia: " + e.getMessage());
    }
}
// Método para mostrar la información para el estudiante (descripción del profesor)
private void mostrarInfoEstudiante() {
    int selectedRow = table.getSelectedRow(); // Obtener la fila seleccionada en la tabla
    if (selectedRow != -1) {
        int idProfesor = (int) table.getValueAt(selectedRow, 0); // Obtener el ID del profesor seleccionado

        String sql = "SELECT DescripcionP FROM profesor WHERE idProfesor = ?";
        try (Connection con = conexion.obtenerconexion();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, idProfesor); // Consultar la descripción del profesor seleccionado
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                String descripcionProfesor = rs.getString("DescripcionP");

                // Crear un JFrame para mostrar la información del profesor
                JFrame infoProfesorFrame = new JFrame("Información para el Estudiante");
                infoProfesorFrame.setSize(400, 300);
                infoProfesorFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                infoProfesorFrame.setLocationRelativeTo(this);

                // Crear un JTextArea para mostrar la descripción del profesor
                JTextArea textArea = new JTextArea();
                textArea.setText("Información para el Estudiante:\n" + descripcionProfesor);
                textArea.setEditable(false); // Hacerlo solo de lectura
                textArea.setLineWrap(true);
                textArea.setWrapStyleWord(true);

                JScrollPane scrollPane = new JScrollPane(textArea);
                infoProfesorFrame.add(scrollPane);
                infoProfesorFrame.setVisible(true);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al obtener la información del profesor: " + e.getMessage());
        }
    } else {
        JOptionPane.showMessageDialog(this, "Por favor, selecciona un profesor para ver su información.");
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

                psTutoria.setInt(1, idUsuario);
                psTutoria.setInt(2, idProfesor);
                psTutoria.setInt(3, idMateria);
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
                int contador = 1;
                while (rs.next()) {
                    comentarios.append("Comentario ").append(contador).append(":\n")
                               .append(rs.getString("comentario")).append("\n\n");
                    contador++;
                }

                JFrame comentariosFrame = new JFrame("Comentarios del Profesor");
                comentariosFrame.setSize(400, 300);
                comentariosFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                comentariosFrame.setLocationRelativeTo(this);

                JTextArea textArea = new JTextArea();
                textArea.setText(comentarios.toString());
                textArea.setEditable(false);
                textArea.setLineWrap(true);
                textArea.setWrapStyleWord(true);

                JScrollPane scrollPane = new JScrollPane(textArea);
                scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

                comentariosFrame.add(scrollPane);
                comentariosFrame.setVisible(true);

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
        alumno alum = new alumno(this.nombre, this.idUsuario);
        alum.setVisible(true);
    }
}


