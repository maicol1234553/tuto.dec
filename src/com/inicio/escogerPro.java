package com.inicio;

import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import javax.swing.table.TableCellRenderer;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class escogerPro extends javax.swing.JFrame {
    private JTable table;
    private JButton btnSeleccionar;
    
    private JButton btnVerComentarios; // Botón para ver comentarios
    private JTextArea comentarioTextArea; // Campo de texto para el comentario
    private int idUsuario;
    private String nombre ;
    private String materiaSeleccionada;
    private JButton btnVolver;

    // Constructor
    public escogerPro(int idUsuario, String materiaSeleccionada,String nombre) {
        this.idUsuario = idUsuario;
        this.materiaSeleccionada = materiaSeleccionada;
        this.nombre = nombre;
        initComponents();
        loadData(); // Cargar los datos cuando se inicializa el JFrame
        addTableMouseListener(); // Añadir el listener de ratón a la tabla
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
    JLabel titleLabel = new JLabel("Seleccionar profesor y ver comentarios", SwingConstants.CENTER);
    titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
    panel.add(titleLabel);

    // Tabla
    table = new JTable();
    table.setFillsViewportHeight(true);
    JScrollPane tableScrollPane = new JScrollPane(table);
    tableScrollPane.setBorder(BorderFactory.createTitledBorder("Lista de Profesores"));
    panel.add(tableScrollPane);

    // Área de comentario
    comentarioTextArea = new JTextArea(5, 20); // Área de texto para el comentario
    comentarioTextArea.setLineWrap(true);
    comentarioTextArea.setWrapStyleWord(true);
    JScrollPane comentarioScrollPane = new JScrollPane(comentarioTextArea);
    JPanel panelComentario = new JPanel();
    panelComentario.setLayout(new BoxLayout(panelComentario, BoxLayout.Y_AXIS));
    panelComentario.setBorder(BorderFactory.createTitledBorder("Escribe un comentario"));
    panelComentario.add(comentarioScrollPane);
    panel.add(panelComentario);

    // Panel para los botones (ubicación inferior)
    JPanel buttonPanel = new JPanel();
    buttonPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 10)); // Alinear a la izquierda y espaciado
    panel.add(buttonPanel);

    // Botón para ver comentarios
    btnVerComentarios = new JButton("Ver Comentarios");
    btnVerComentarios.setBackground(new Color(33, 150, 243)); // Color azul
    btnVerComentarios.setForeground(Color.WHITE); // Color de texto blanco
    btnVerComentarios.setFocusPainted(false); // Sin borde al hacer foco
    buttonPanel.add(btnVerComentarios); // Añadir el botón al panel

    // Botón de seleccionar
    btnSeleccionar = new JButton("Subir comentario");
    btnSeleccionar.setBackground(new Color(76, 175, 80)); // Color verde
    btnSeleccionar.setForeground(Color.WHITE); // Color de texto blanco
    btnSeleccionar.setFocusPainted(false); // Sin borde al hacer foco
    buttonPanel.add(btnSeleccionar); // Añadir el botón al panel

    // Botón de volver
    btnVolver = new JButton("Volver");
    btnVolver.setBackground(new Color(255, 87, 34)); // Color rojo
    btnVolver.setForeground(Color.WHITE); // Color de texto blanco
    btnVolver.setFocusPainted(false); // Sin borde al hacer foco
    buttonPanel.add(btnVolver); // Añadir el botón al panel

    // Acción del botón de volver
    btnVolver.addActionListener(e -> volverALaVentanaAlumno());

    // Acción del botón de seleccionar
    btnSeleccionar.addActionListener(e -> subirComentario());

    // Acción del botón de ver comentarios
    btnVerComentarios.addActionListener(e -> verComentarios());
}


    // Carga los datos de profesores y materias desde la base de datos
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

            // Ajustar la altura de las filas para mostrar el contenido completo
            for (int row = 0; row < table.getRowCount(); row++) {
                int rowHeight = table.getRowHeight();
                rowHeight = Math.max(rowHeight, table.getRowHeight(row) + 10); // Ajustar el tamaño para más espacio
                table.setRowHeight(row, rowHeight);
            }

            // Aplicar el renderizador de múltiples líneas a las columnas de Descripción
            table.getColumnModel().getColumn(3).setCellRenderer(new MultiLineTableCellRenderer()); // Columna de Descripción del profesor
            table.getColumnModel().getColumn(5).setCellRenderer(new MultiLineTableCellRenderer()); // Columna de Descripción de la materia

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al cargar datos: " + e.getMessage());
        }
    }

    // Renderizador personalizado para permitir múltiples líneas en el JTable
    public class MultiLineTableCellRenderer extends JTextArea implements TableCellRenderer {
        public MultiLineTableCellRenderer() {
            setLineWrap(true); // Permitir que el texto se envuelva en varias líneas
            setWrapStyleWord(true); // Ajustar palabras completas
        }

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected,
                                                       boolean hasFocus, int row, int column) {
            setText(value != null ? value.toString() : ""); // Mostrar el texto en la celda
            setSize(table.getColumnModel().getColumn(column).getWidth(), getPreferredSize().height); // Ajustar ancho de la columna

            // Ajustar la altura de la fila basada en el contenido
            int rowHeight = getPreferredSize().height;
            if (table.getRowHeight(row) != rowHeight) {
                table.setRowHeight(row, rowHeight); // Ajustar el alto de la fila basado en el contenido
            }

            return this;
        }
    }

    // Método para subir el comentario y guardar la tutoría
    private void subirComentario() {
        int row = table.getSelectedRow();
        if (row != -1) {
            int idProfesor = (int) table.getValueAt(row, 0);
            String nombreMateria = (String) table.getValueAt(row, 4);
            String comentario = comentarioTextArea.getText(); // Obtener el comentario del área de texto

            // Guardar la tutoría con el comentario
            guardarTutoria(idUsuario, idProfesor, nombreMateria, comentario);
            comentarioTextArea.setText(""); // Limpiar el área de texto del comentario
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, selecciona un profesor.");
        }
    }
        private void volverALaVentanaAlumno() {
    // Crear una nueva instancia del JFrame alumno
        alumno ventanaAlumno = new alumno(this.nombre,this.idUsuario);
        ventanaAlumno.setVisible(true); // Hacer visible la ventana
        dispose(); // Cerrar el JFrame actual
}
    // Método para guardar la tutoría en la base de datos
    private void guardarTutoria(int idEstudiante, int idProfesor, String nombreMateria, String comentario) {
        String sql = "INSERT INTO tutoria (idEstudiante, idProfesor, idMateria, comentario) VALUES (?, ?, ?, ?)";
        try (Connection con = conexion.obtenerconexion();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, idEstudiante);
            ps.setInt(2, idProfesor);
            ps.setInt(3, obtenerIdMateria(nombreMateria));
            ps.setString(4, comentario);  // Insertar el comentario

            int filasAfectadas = ps.executeUpdate();
            if (filasAfectadas > 0) {
                JOptionPane.showMessageDialog(this, "Tutoría guardada correctamente.");
            } else {
                JOptionPane.showMessageDialog(this, "No se pudo guardar la tutoría.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al guardar la tutoría: " + e.getMessage());
        }
    }

    // Método para obtener el ID de la materia a partir del nombre
    private int obtenerIdMateria(String nombreMateria) {
        String sql = "SELECT idMateria FROM materias WHERE nombreMateria = ?";
        try (Connection con = conexion.obtenerconexion();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, nombreMateria);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getInt("idMateria");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return -1; // Si no se encontró la materia
    }

    // Método para ver los comentarios de las tutorías
    private void verComentarios() {
        int row = table.getSelectedRow();
        if (row != -1) {
            int idProfesor = (int) table.getValueAt(row, 0);
            String comentarios = obtenerComentarios(idProfesor);
            JTextArea textAreaComentarios = new JTextArea(comentarios);
            textAreaComentarios.setEditable(false); // Hacer el área de texto solo lectura
            JOptionPane.showMessageDialog(this, new JScrollPane(textAreaComentarios), 
                "Comentarios del Profesor", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, selecciona un profesor.");
        }
    }

    // Método para obtener los comentarios de la base de datos
    private String obtenerComentarios(int idProfesor) {
        StringBuilder comentarios = new StringBuilder();
        String sql = "SELECT comentario FROM tutoria WHERE idProfesor = ?";
        try (Connection con = conexion.obtenerconexion();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, idProfesor);
            ResultSet rs = ps.executeQuery();
            int comentarioCount = 1; // Contador de comentarios
            while (rs.next()) {
                String comentario = rs.getString("comentario");
                comentarios.append("Comentario ").append(comentarioCount).append(": ").append(comentario).append("\n\n");
                comentarioCount++; // Incrementar el contador
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return "Error al obtener comentarios.";
        }
        return comentarios.toString().isEmpty() ? "No hay comentarios disponibles." : comentarios.toString();
    }

    // Método para añadir un listener al ratón para seleccionar una fila
    private void addTableMouseListener() {
        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int row = table.getSelectedRow();
                if (row != -1) {
                    String profesor = (String) table.getValueAt(row, 1);
                    String correo = (String) table.getValueAt(row, 2);
                    String descripcion = (String) table.getValueAt(row, 3);
                    String materia = (String) table.getValueAt(row, 4);
                    String message = String.format("Profesor: %s\nCorreo: %s\nDescripción: %s\nMateria: %s",
                            profesor, correo, descripcion, materia);
                    JOptionPane.showMessageDialog(escogerPro.this, message);
                }
            }
        });
    }
}
