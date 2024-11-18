package com.inicio;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class ComentariosProfesorFrame extends JFrame {
    private JTextArea comentariosArea;
        private int idUsuario;
        private String nombre;
    public ComentariosProfesorFrame(String nombre,int idUsuario) {
        setTitle("Comentarios del Profesor");
        setSize(400, 400); // Ajustamos el tamaño para el botón
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new BorderLayout());
        this.idUsuario=idUsuario;
        this.nombre=nombre;
        setLocationRelativeTo(null);

        // Área de texto para mostrar comentarios
        comentariosArea = new JTextArea();
        comentariosArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(comentariosArea);
        add(scrollPane, BorderLayout.CENTER);

        // Panel para el botón Volver
        JPanel panelBotones = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        JButton btnVolver = new JButton("Volver");
        panelBotones.add(btnVolver);
        add(panelBotones, BorderLayout.SOUTH);

        // Acción para el botón Volver
        btnVolver.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                materiasp materias =  new materiasp(nombre,idUsuario);
                materias.setVisible(true); // Regresar a la ventana materiasp
                dispose(); 
            }
        });

        cargarComentarios(idUsuario);
    }

    private void cargarComentarios(int idUsuario) {
        Connection con = conexion.obtenerconexion(); // Conexión a la base de datos

        if (con != null) {
            try {
                // Consulta para obtener los comentarios basados en el id del profesor
                String sql = """
                    SELECT c.comentario, c.fechaComentario
                    FROM comentarios c
                    JOIN tutoria t ON c.idTutoria = t.idTutoria
                    WHERE t.idProfesor = ?;
                """;
                PreparedStatement stmt = con.prepareStatement(sql);
                stmt.setInt(1, idUsuario); // Establecer el ID del profesor

                ResultSet rs = stmt.executeQuery();
                StringBuilder comentarios = new StringBuilder();

                int contador = 1;
                while (rs.next()) {
                    String comentario = rs.getString("comentario");
                    String fecha = rs.getString("fechaComentario");

                    // Construir la salida para el JTextArea
                    comentarios.append("Comentario ").append(contador).append(":\n")
                               .append(comentario).append("\n")
                               .append("Fecha: ").append(fecha).append("\n\n");
                    contador++;
                }

                if (comentarios.length() > 0) {
                    comentariosArea.setText(comentarios.toString());
                } else {
                    comentariosArea.setText("No hay comentarios para este profesor.");
                }

                rs.close();
                stmt.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Error al cargar comentarios: " + e.getMessage(),
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "No se pudo conectar a la base de datos.",
                    "Error de conexión", JOptionPane.ERROR_MESSAGE);
        }
    }

    
}
