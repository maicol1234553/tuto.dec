package com.inicio;

import java.sql.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;
import java.awt.*;
import javax.swing.table.TableCellRenderer;

public class escogerPro extends javax.swing.JFrame {
    private JTable table;
    private JButton btnSeleccionar;
    private JTextArea comentarioTextArea; // Campo de texto para el comentario
    private int idUsuario;
    private String materiaSeleccionada;

    // Constructor
    public escogerPro(int idUsuario, String materiaSeleccionada) {
        this.idUsuario = idUsuario;
        this.materiaSeleccionada = materiaSeleccionada;
        initComponents();
        loadData(); // Cargar los datos cuando se inicializa el JFrame
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
        JLabel titleLabel = new JLabel("Seleccionar Profesor", SwingConstants.CENTER);
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

        // Botón de seleccionar
        btnSeleccionar = new JButton("Seleccionar Profesor");
        btnSeleccionar.setBackground(new Color(76, 175, 80)); // Color verde
        btnSeleccionar.setForeground(Color.WHITE); // Color de texto blanco
        btnSeleccionar.setFocusPainted(false); // Sin borde al hacer foco
        btnSeleccionar.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0)); // Espaciado vertical
        panel.add(btnSeleccionar);

        // Acción del botón de seleccionar
        btnSeleccionar.addActionListener(e -> seleccionarProfesor());
    }

    // Carga los datos de profesores y materias desde la base de datos
    private void loadData() {
        String sql = "SELECT p.idProfesor, r.nombreUsuario, r.correoUsuario, " +
                     "p.DescripcionP, m.nombreMateria, m.descripcionMateria " +
                     "FROM profesor p " +
                     "JOIN registro r ON p.idProfesor = r.id " +  // Join con la tabla registro para obtener nombre y correo
                     "JOIN materias_profesor mp ON p.idProfesor = mp.idProfesor " +
                     "JOIN materias m ON mp.idMateria = m.idMateria " +
                     "WHERE m.nombreMateria = ?";
        try (Connection con = conexion.obtenerconexion();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, materiaSeleccionada);
            ResultSet rs = ps.executeQuery();
            
            // Actualizar el modelo de la tabla con las nuevas columnas (sin teléfono)
            DefaultTableModel model = new DefaultTableModel(new String[]{"ID Profesor", "Nombre Profesor", "Correo", "Descripción", "Materia", "Descripción Materia"}, 0);
            if (!rs.next()) {
                JOptionPane.showMessageDialog(this, "No se encontraron profesores para la materia seleccionada.");
            } else {
                do {
                    model.addRow(new Object[]{
                        rs.getInt("idProfesor"),  // ID del profesor
                        rs.getString("nombreUsuario"),  // Nombre del profesor (de la tabla registro)
                        rs.getString("correoUsuario"),  // Correo del profesor
                        rs.getString("DescripcionP"),  // Descripción del profesor
                        rs.getString("nombreMateria"),  // Nombre de la materia
                        rs.getString("descripcionMateria")  // Descripción de la materia
                    });
                } while (rs.next());
            }
            table.setModel(model);

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
            setWrapStyleWord(true); // Ajustar palabras completas, no cortar palabras
        }

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected,
                                                       boolean hasFocus, int row, int column) {
            setText(value != null ? value.toString() : ""); // Mostrar el texto en la celda
            setSize(table.getColumnModel().getColumn(column).getWidth(), getPreferredSize().height); // Ajustar ancho de la columna
            
            if (table.getRowHeight(row) != getPreferredSize().height) {
                table.setRowHeight(row, getPreferredSize().height); // Ajustar el alto de la fila basado en el contenido
            }

            return this;
        }
    }

    // Método para seleccionar un profesor y guardar la tutoría
    private void seleccionarProfesor() {
        int row = table.getSelectedRow();
        if (row != -1) {
            int idProfesor = (int) table.getValueAt(row, 0);
            String nombreMateria = (String) table.getValueAt(row, 4);
            String comentario = comentarioTextArea.getText(); // Obtener el comentario del área de texto

            // Guardar la tutoría con el comentario
            guardarTutoria(idUsuario, idProfesor, nombreMateria, comentario);
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, selecciona un profesor.");
        }
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

    // Método para obtener el ID de la materia a partir de su nombre
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
            JOptionPane.showMessageDialog(this, "Error al obtener ID de la materia: " + e.getMessage());
        }
        return 0;
    }
}
