package com.inicio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PerfilUsuarioFrame extends JFrame {

   
    private JTextField txtNombre;
    private JTextField txtApellido;
    private JTextField txtCorreo;
    private JTextField txtUsuario;
    private JLabel lblRol;
    private JButton btnActualizar;
    private JButton btnVolver;

    public PerfilUsuarioFrame(String nombre, String apellido, String correo, String usuario, String rol) {
        // Configuración del JFrame
        setTitle("Perfil de Usuario - TUTO DEC");
        setSize(600, 420);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Panel principal (con borde y color de fondo)
        JPanel panelPrincipal = new JPanel();
        panelPrincipal.setLayout(null);
        panelPrincipal.setBackground(new Color(228, 236, 247)); // Fondo suave

        // Encabezado
        JPanel encabezado = new JPanel();
        encabezado.setBackground(new Color(96, 125, 250)); // Azul del encabezado
        encabezado.setBounds(0, 0, 600, 60);
        encabezado.setLayout(new FlowLayout(FlowLayout.CENTER));

        JLabel lblTitulo = new JLabel("PERFIL DE USUARIO");
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 20));
        lblTitulo.setForeground(Color.WHITE);
        encabezado.add(lblTitulo);

        // Componentes de datos
        JLabel lblNombre = new JLabel("Nombre:");
        lblNombre.setFont(new Font("Arial", Font.BOLD, 14));
        lblNombre.setBounds(50, 100, 150, 25);
        txtNombre = new JTextField(nombre);
        txtNombre.setBounds(200, 100, 300, 25);

        JLabel lblApellido = new JLabel("Apellido:");
        lblApellido.setFont(new Font("Arial", Font.BOLD, 14));
        lblApellido.setBounds(50, 140, 150, 25);
        txtApellido = new JTextField(apellido);
        txtApellido.setBounds(200, 140, 300, 25);

        JLabel lblCorreo = new JLabel("Correo:");
        lblCorreo.setFont(new Font("Arial", Font.BOLD, 14));
        lblCorreo.setBounds(50, 180, 150, 25);
        txtCorreo = new JTextField(correo);
        txtCorreo.setBounds(200, 180, 300, 25);

        JLabel lblUsuario = new JLabel("Usuario:");
        lblUsuario.setFont(new Font("Arial", Font.BOLD, 14));
        lblUsuario.setBounds(50, 220, 150, 25);
        txtUsuario = new JTextField(usuario);
        txtUsuario.setBounds(200, 220, 300, 25);

        JLabel lblRolTexto = new JLabel("Rol:");
        lblRolTexto.setFont(new Font("Arial", Font.BOLD, 14));
        lblRolTexto.setBounds(50, 260, 150, 25);
        lblRol = new JLabel(rol);
        lblRol.setFont(new Font("Arial", Font.PLAIN, 14));
        lblRol.setBounds(200, 260, 300, 25);
        
        // Boton volver
        btnVolver= new JButton("VOLVER");
        btnVolver.setFont(new Font("Arial", Font.BOLD, 14));
        btnVolver.setBackground(new Color(96, 125, 250));
        btnVolver.setForeground(Color.WHITE);
        btnVolver.setBounds(230, 350, 140, 35);
        // Botón Actualizar
        btnActualizar = new JButton("Actualizar");
        btnActualizar.setFont(new Font("Arial", Font.BOLD, 14));
        btnActualizar.setBackground(new Color(96, 125, 250));
        btnActualizar.setForeground(Color.WHITE);
        btnActualizar.setBounds(230, 310, 140, 35);

        // Acción del botón Actualizar
        btnActualizar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                actualizarDatosUsuario();
            }
        });
        btnVolver.addActionListener(new ActionListener() {
   
        public void actionPerformed(ActionEvent e) {
         dispose(); // Cierra la ventana actual
        }
        });

        // Agregar componentes al panel principal
        panelPrincipal.add(lblNombre);
        panelPrincipal.add(txtNombre);
        panelPrincipal.add(lblApellido);
        panelPrincipal.add(txtApellido);
        panelPrincipal.add(lblCorreo);
        panelPrincipal.add(txtCorreo);
        panelPrincipal.add(lblUsuario);
        panelPrincipal.add(txtUsuario);
        panelPrincipal.add(lblRolTexto);
        panelPrincipal.add(lblRol);
        panelPrincipal.add(btnActualizar);
        panelPrincipal.add(btnVolver);
        panelPrincipal.add(encabezado);

        // Agregar panel al JFrame
        add(panelPrincipal);

        // Hacer visible
        setVisible(true);
    }

    // Método para manejar la actualización de datos
    private void actualizarDatosUsuario() {
        String nuevoNombre = txtNombre.getText().trim();
        String nuevoApellido = txtApellido.getText().trim();
        String nuevoCorreo = txtCorreo.getText().trim();
        String nuevoUsuario = txtUsuario.getText().trim();

        if (nuevoNombre.isEmpty() || nuevoApellido.isEmpty() || nuevoCorreo.isEmpty() || nuevoUsuario.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Todos los campos deben estar llenos", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            Connection conn = (Connection) conexion.obtenerconexion();

            if (conn != null) {
                String sql = "UPDATE registro SET nombreUsuario = ?, apellidoUsuario = ?, correoUsuario = ?, Usuario = ? WHERE Usuario = ?";
                PreparedStatement stmt = conn.prepareStatement(sql);

                stmt.setString(1, nuevoNombre);
                stmt.setString(2, nuevoApellido);
                stmt.setString(3, nuevoCorreo);
                stmt.setString(4, nuevoUsuario);
                stmt.setString(5, nuevoUsuario); // Asumimos que el campo "usuario" es único para identificar

                int filasActualizadas = stmt.executeUpdate();
                if (filasActualizadas > 0) {
                    JOptionPane.showMessageDialog(this, "Datos actualizados correctamente");
                } else {
                    JOptionPane.showMessageDialog(this, "Error al actualizar los datos", "Error", JOptionPane.ERROR_MESSAGE);
                }

                stmt.close();
                conn.close();
            } else {
                JOptionPane.showMessageDialog(this, "No se pudo conectar a la base de datos", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
