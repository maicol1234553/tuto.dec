
package com.inicio;
import java.util.Arrays;
import java.sql.*;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class inicio extends javax.swing.JFrame {
    

    int xMouse, yMouse;
    
    public inicio() {
        
        
        initComponents();
        setLocationRelativeTo(null);
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
        iniciarsesionjl = new javax.swing.JLabel();
        usuariojl = new javax.swing.JLabel();
        usuariotf = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        contraseñajl = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        contraseñatf = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        ingresarjl = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        registrarjl = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iniciarsesionjl.setFont(new java.awt.Font("Roboto Medium", 3, 36)); // NOI18N
        iniciarsesionjl.setText("INICIAR SESION ");
        jPanel1.add(iniciarsesionjl, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        usuariojl.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        usuariojl.setText("USUARIO");
        jPanel1.add(usuariojl, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        usuariotf.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        usuariotf.setForeground(new java.awt.Color(204, 204, 204));
        usuariotf.setText("Ingrese su nombre de usuario");
        usuariotf.setBorder(null);
        usuariotf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                usuariotfMousePressed(evt);
            }
        });
        usuariotf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuariotfActionPerformed(evt);
            }
        });
        jPanel1.add(usuariotf, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 360, 40));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 360, 10));

        contraseñajl.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        contraseñajl.setText("CONTRASEÑA");
        jPanel1.add(contraseñajl, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 360, 10));

        contraseñatf.setForeground(new java.awt.Color(204, 204, 255));
        contraseñatf.setText("********");
        contraseñatf.setBorder(null);
        contraseñatf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                contraseñatfMousePressed(evt);
            }
        });
        jPanel1.add(contraseñatf, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 360, 40));

        jPanel2.setBackground(new java.awt.Color(102, 102, 255));

        ingresarjl.setBackground(new java.awt.Color(153, 153, 255));
        ingresarjl.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        ingresarjl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ingresarjl.setText("INGRESAR");
        ingresarjl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ingresarjl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ingresarjlMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(ingresarjl, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(ingresarjl, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 400, -1, 42));

        jPanel3.setBackground(new java.awt.Color(102, 102, 255));

        registrarjl.setBackground(new java.awt.Color(102, 102, 255));
        registrarjl.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        registrarjl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        registrarjl.setText("REGISTRARSE");
        registrarjl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registrarjl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registrarjlMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(registrarjl, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(registrarjl, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 400, -1, -1));

        jPanel4.setBackground(new java.awt.Color(0, 0, 153));
        jPanel4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel4MouseDragged(evt);
            }
        });
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel4MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 850, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 37, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/imagenes/tu.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 30, 410, 470));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usuariotfMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usuariotfMousePressed
        if (usuariotf.getText().equals("Ingrese su nombre de usuario")) {
            usuariotf.setText("");
            usuariotf.setForeground(Color.black);
        }
        if (String.valueOf(contraseñatf.getPassword()).isEmpty()) {
            contraseñatf.setText("********");
            contraseñatf.setForeground(Color.gray);
        }
    }//GEN-LAST:event_usuariotfMousePressed

    private void usuariotfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuariotfActionPerformed
        
    }//GEN-LAST:event_usuariotfActionPerformed

    private void contraseñatfMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contraseñatfMousePressed
        if (String.valueOf(contraseñatf.getPassword()).equals("********")) {
            contraseñatf.setText("");
            contraseñatf.setForeground(Color.black);
        }
        if (usuariotf.getText().isEmpty()) {
            usuariotf.setText("Ingrese su nombre de usuario, por favor");
            usuariotf.setForeground(Color.gray);
        }
    }//GEN-LAST:event_contraseñatfMousePressed

    private void ingresarjlMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingresarjlMouseClicked
        
           String user = usuariotf.getText();
char[] pass = contraseñatf.getPassword();

// Incluye el campo 'id' autoincrementable en la consulta SQL
String url = "SELECT id, Usuario, nombreUsuario, contraseñaUsuario, Rol FROM registro WHERE Usuario = '"+user+"'";

try {    
    Connection con = conexion.obtenerconexion();
    PreparedStatement ps = con.prepareStatement(url);
    ResultSet rs = ps.executeQuery();

    if (rs.next()) {
        // Si el usuario existe, obtenemos su 'id' autoincrementable
        int idUsuario = rs.getInt("id");  // El id autoincrementable del usuario
        String u = rs.getString("Usuario");
        String p = rs.getString("contraseñaUsuario");
        String priv = rs.getString("Rol");
        String nombre = rs.getString("nombreUsuario");
        
        if (Arrays.equals(pass, p.toCharArray())) {
            // Lógica para diferenciar entre alumnos y profesores
            if (priv.equals("alumno")) {
                alumno ventanaAlumno = new alumno(nombre,idUsuario);
                ventanaAlumno.setVisible(true);
                this.setVisible(false);
            } else if (priv.equals("profesor")) {
                materiasp ventanaDocente = new materiasp(nombre,idUsuario);
                ventanaDocente.setVisible(true);
                this.setVisible(false);
            }
        } else {
            JOptionPane.showMessageDialog(null, "LA CONTRASEÑA ES INCORRECTA");
        }
    } else {
        // El usuario no existe
        JOptionPane.showMessageDialog(null, "EL USUARIO NO EXISTE");
    }
} catch (SQLException ex) {
    System.out.println(ex.toString());
}
       
       
    }//GEN-LAST:event_ingresarjlMouseClicked

    private void registrarjlMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrarjlMouseClicked
        opcion_registro registro = new opcion_registro();
        registro.setVisible(true);
        dispose();
        

    }//GEN-LAST:event_registrarjlMouseClicked

    private void jPanel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanel4MousePressed

    private void jPanel4MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse,y - yMouse );
    }//GEN-LAST:event_jPanel4MouseDragged
 public static void main(String[] args) {
    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            new inicio().setVisible(true);
        }
    });
}

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel contraseñajl;
    private javax.swing.JPasswordField contraseñatf;
    private javax.swing.JLabel ingresarjl;
    private javax.swing.JLabel iniciarsesionjl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel registrarjl;
    private javax.swing.JLabel usuariojl;
    private javax.swing.JTextField usuariotf;
    // End of variables declaration//GEN-END:variables
}
