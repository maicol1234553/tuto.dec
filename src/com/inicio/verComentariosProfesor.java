package com.inicio;

import java.sql.*;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.TitledBorder;

public class verComentariosProfesor extends JFrame {
    private JTextArea comentariosTextArea; // Área de texto para mostrar comentarios
    private int idProfesor; // ID del profesor para obtener los comentarios

    // Constructor
    public verComentariosProfesor(int idProfesor) {
        this.idProfesor = idProfesor;
        initComponents();
        cargarComentarios(); // Cargar comentarios al inicializar
    }

    // Inicialización de componentes
    private void initComponents() {
        setTitle("Comentarios del Profesor");
        setSize(400, 300);
        setLocationRelativeTo(null); // Centrar la ventana
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Cerrar solo esta ventana

        // Panel principal
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.setBackground(new Color(240, 240, 240)); // Color de fondo claro

        // Área de texto para mostrar comentarios
        comentariosTextArea = new JTextArea();
        comentariosTextArea.setEditable(false); // No editable
        comentariosTextArea.setFont(new Font("Arial", Font.PLAIN, 14)); // Cambiar fuente
        comentariosTextArea.setLineWrap(true); // Ajustar línea
        comentariosTextArea.setWrapStyleWord(true); // Ajustar palabra
        comentariosTextArea.setBackground(new Color(255, 255, 255)); // Fondo blanco
        comentariosTextArea.setForeground(new Color(0, 0, 0)); // Texto negro

        JScrollPane scrollPane = new JScrollPane(comentariosTextArea);
        scrollPane.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createEtchedBorder(), "Comentarios", TitledBorder.CENTER, TitledBorder.TOP));

        panel.add(scrollPane, BorderLayout.CENTER);
        add(panel);
    }

    // Método para cargar los comentarios desde la base de datos
    private void cargarComentarios() {
        StringBuilder comentarios = new StringBuilder();
        String sql = "SELECT comentario FROM tutoria WHERE idProfesor = ?";
        try (Connection con = conexion.obtenerconexion();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, idProfesor);
            ResultSet rs = ps.executeQuery();
            int contador = 1; // Contador para los comentarios
            while (rs.next()) {
                comentarios.append("Comentario ").append(contador).append(": ").append(rs.getString("comentario")).append("\n\n");
                contador++; // Incrementar el contador
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al cargar los comentarios: " + e.getMessage());
        }

        // Si no hay comentarios, mostrar un mensaje
        if (comentarios.length() == 0) {
            comentariosTextArea.setText("No hay comentarios para este profesor.");
        } else {
            comentariosTextArea.setText(comentarios.toString());
        }
    }
}

