package com.inicio;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class escogerPro extends javax.swing.JFrame {
    private JTable table;
    private JButton btnSeleccionar;
    private int idUsuario;
    private String materiaSeleccionada;

    public escogerPro(int idUsuario, String materiaSeleccionada) {
        this.idUsuario= idUsuario;
        this.materiaSeleccionada = materiaSeleccionada;
        initComponents();
        loadData();
    }

    private void initComponents() {
        setTitle("Seleccionar Profesor");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);

        table = new JTable();
        btnSeleccionar = new JButton("Seleccionar");

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.add(new JScrollPane(table));
        panel.add(btnSeleccionar);
        add(panel);

        btnSeleccionar.addActionListener(e -> seleccionarProfesor());
    }

    private void loadData() {
        String sql = "SELECT p.idProfesor, p.descripcionP, m.nombreMateria FROM profesor p " +
                     "JOIN materias_profesor mp ON p.idProfesor = mp.idProfesor " +
                     "JOIN materias m ON mp.idMateria = m.idMateria " +
                     "WHERE m.nombreMateria = ?";
        try (Connection con = conexion.obtenerconexion();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, materiaSeleccionada);
            ResultSet rs = ps.executeQuery();

            DefaultTableModel model = new DefaultTableModel(new String[]{"ID Profesor", "Descripción", "Materia"}, 0);
            while (rs.next()) {
                model.addRow(new Object[]{rs.getInt("idProfesor"), rs.getString("descripcionP"), rs.getString("nombreMateria")});
            }
            table.setModel(model);

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al cargar datos: " + e.getMessage());
        }
    }

    private void seleccionarProfesor() {
        int row = table.getSelectedRow();
        if (row != -1) {
            int idProfesor = (int) table.getValueAt(row, 0);
            String nombreMateria = (String) table.getValueAt(row, 2);
            guardarTutoria(idUsuario, idProfesor, nombreMateria);
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, selecciona un profesor.");
        }
    }

    private void guardarTutoria(int idEstudiante, int idProfesor, String nombreMateria) {
        String sql = "INSERT INTO tutoria (idEstudiante, idProfesor, idMateria, comentario) VALUES (?, ?, ?, ?)";
        try (Connection con = conexion.obtenerconexion();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, idEstudiante);
            ps.setInt(2, idProfesor);
            ps.setInt(3, obtenerIdMateria(nombreMateria));
            ps.setString(4, "");

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

    public static void main(String[] args) {
        int idEstudiante = 1;
        String materiaSeleccionada = "Nombre de la Materia"; // Reemplaza con el nombre real de la materia
        SwingUtilities.invokeLater(() -> {
            escogerPro frame = new escogerPro(idEstudiante, materiaSeleccionada);
            frame.setVisible(true);
        });
    }
}