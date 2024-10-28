/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.inicio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 *
 * @author maico
 */
public class InfoMateria extends javax.swing.JFrame {
    private int idUsuario;
    private String nombre;
    private String materiastr;
    public InfoMateria(String materiastr,String nombre,int idUsuario) {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("informacion de la materia");
        this.nombre = nombre;
        this.materiastr = materiastr;
        this.idUsuario = idUsuario;
        materia.setText(this.materiastr);
        nombrep.setText (this.nombre);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        texto = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        materia = new javax.swing.JLabel();
        nombrep = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        texto.setColumns(20);
        texto.setRows(5);
        jScrollPane2.setViewportView(texto);

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel1.setText("Guardar");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        materia.setFont(new java.awt.Font("Segoe UI Black", 2, 18)); // NOI18N
        materia.setText("Materia");

        nombrep.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        nombrep.setText("jLabel2");

        jPanel3.setBackground(new java.awt.Color(153, 153, 255));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel3.setText("Volver al inicio");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(materia)
                    .addComponent(nombrep))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 161, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(nombrep)
                        .addGap(18, 18, 18)
                        .addComponent(materia)
                        .addGap(0, 213, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(88, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
 String materiaTexto = texto.getText();

if (materiaTexto.isEmpty()) {
    JOptionPane.showMessageDialog(this, "El campo de materia no puede estar vacío.", "Error", JOptionPane.ERROR_MESSAGE);
    return; // Salir si el campo está vacío
} else {
    // Consulta SQL para insertar datos en la tabla materias
    String urlMateria = "INSERT INTO materias (nombreMateria, descripcionMateria) VALUES (?, ?)";
    
    try {
        Connection con = conexion.obtenerconexion(); // Obtener la conexión
        PreparedStatement psMateria = con.prepareStatement(urlMateria, Statement.RETURN_GENERATED_KEYS);

        // Establecer los valores en el orden correcto
        psMateria.setString(1, this.materiastr); // nombre de la materia
        psMateria.setString(2, materiaTexto);     // descripción de la materia

        // Ejecutar la inserción
        int filasAfectadas = psMateria.executeUpdate();

        if (filasAfectadas > 0) {
            // Obtener las claves generadas (ID de la materia)
            ResultSet rs = psMateria.getGeneratedKeys();
            if (rs.next()) {
                int idMateria = rs.getInt(1); // idMateria generado
                JOptionPane.showMessageDialog(this, "Datos insertados correctamente. ID de materia: " + idMateria);

                // Cambiar idProfesor por id (de la tabla registro)
                String urlMateriasProfesor = "INSERT INTO materias_profesor (idProfesor, idMateria) VALUES (?, ?)";
                PreparedStatement psMateriasProfesor = con.prepareStatement(urlMateriasProfesor);
                
             
                // Cambiar this.idProfesor por el id correspondiente
                psMateriasProfesor.setInt(1, this.idUsuario); // Aquí asumo que 'this.id' es el ID del profesor correspondiente
                psMateriasProfesor.setInt(2, idMateria); 
                
                int filasAfectadasMP = psMateriasProfesor.executeUpdate();
                if (filasAfectadasMP > 0) {
                    JOptionPane.showMessageDialog(this, "Materia vinculada al profesor correctamente.");
                } else {
                    JOptionPane.showMessageDialog(this, "No se pudo vincular la materia al profesor.");
                }

                psMateriasProfesor.close(); // Cerrar el PreparedStatement
            } else {
                JOptionPane.showMessageDialog(this, "No se pudo obtener el ID de la materia.");
            }
            rs.close(); // Cerrar ResultSet
        } else {
            JOptionPane.showMessageDialog(this, "No se insertaron datos en la tabla materias.");
        }

        psMateria.close(); // Cerrar el PreparedStatement
        con.close(); // Cerrar la conexión

    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error al insertar datos: " + e.getMessage());
    }
}
// TODO add your handling code here:
    }//GEN-LAST:event_jLabel1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel materia;
    private javax.swing.JLabel nombrep;
    private javax.swing.JTextArea texto;
    // End of variables declaration//GEN-END:variables
}
