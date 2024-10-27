
package com.inicio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import javax.swing.JOptionPane;


public class alumno extends javax.swing.JFrame {
    private int idUsuario;
    private String nombre;
    public alumno(String nombre, int idUsuario) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        initComponents();
        setTitle("Seleccionar semestre");
        setLocationRelativeTo(null);
        
       
        
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        semestre1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        semestre2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        semestre4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        semestre3 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        semestre5 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        semestre6 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        semestre7 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        semestre8 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        semestre9 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));

        jLabel1.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Bienvenido "+nombre);

        jLabel2.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabel2.setText("porfavor escoge el semestre en el que se encuentra la materia que deseas recibir la tutoria ");

        semestre1.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        semestre1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        semestre1.setText("semestre 1");
        semestre1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        semestre1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                semestre1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(semestre1, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(semestre1, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
        );

        jPanel3.setPreferredSize(new java.awt.Dimension(112, 64));

        semestre2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        semestre2.setText("semestre 2");
        semestre2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                semestre2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(semestre2, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(semestre2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel4.setPreferredSize(new java.awt.Dimension(112, 64));

        semestre4.setText("semestre 4");
        semestre4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                semestre4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(semestre4, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(semestre4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel5.setPreferredSize(new java.awt.Dimension(112, 64));

        semestre3.setText("semestre 3");
        semestre3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                semestre3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(semestre3, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(semestre3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel6.setPreferredSize(new java.awt.Dimension(112, 64));

        semestre5.setText("semestre 5");
        semestre5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                semestre5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(semestre5, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(semestre5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel7.setPreferredSize(new java.awt.Dimension(112, 64));

        semestre6.setText("semestre 6");
        semestre6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                semestre6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(semestre6, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(semestre6, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
        );

        jPanel8.setPreferredSize(new java.awt.Dimension(112, 64));

        semestre7.setText("semestre 7");
        semestre7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                semestre7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(semestre7, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(semestre7, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
        );

        jPanel9.setPreferredSize(new java.awt.Dimension(112, 64));

        semestre8.setText("semestre 8");
        semestre8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                semestre8MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(semestre8, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(semestre8, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
        );

        jPanel10.setPreferredSize(new java.awt.Dimension(112, 64));

        semestre9.setText("semestre 9 ");
        semestre9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                semestre9MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(semestre9, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(semestre9, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
        );

        jLabel3.setText("Volver");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 818, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(176, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
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

    private void semestre1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_semestre1MouseClicked
                                       
   semestre1 sem1 = new semestre1(this.nombre, this.idUsuario);
sem1.setVisible(true);
this.setVisible(false);

// Aquí debes capturar el semestre seleccionado, en este caso es "semestre1"
String semestre = "semestre 1";

// Consulta SQL para insertar datos (el autoincremento en la tabla estudiante no aplica, ya que estás usando el mismo id de registro)
String sql = "INSERT INTO estudiante (semestre, idEstudiante) VALUES (?, ?)";

try {
    // Obtén la conexión a la base de datos
    Connection con = conexion.obtenerconexion();
    PreparedStatement ps = con.prepareStatement(sql);
    
    // Establece los valores en el PreparedStatement
    ps.setString(1, semestre);          // Coloca el semestre
    ps.setInt(2, idUsuario);            // Coloca el id del usuario (ya tienes este valor)
    
    // Ejecuta la inserción
    int filasAfectadas = ps.executeUpdate();
    
    // Verifica si se insertaron datos
    if (filasAfectadas > 0) {
        JOptionPane.showMessageDialog(this, "Datos insertados correctamente.");
    } else {
        JOptionPane.showMessageDialog(this, "No se insertaron datos.");
    }

    // Cierra los recursos
    ps.close();
    con.close();

} catch (SQLIntegrityConstraintViolationException e) {
    // Captura la excepción de restricción de integridad
    JOptionPane.showMessageDialog(this, "Ya tienes un semestre registrado.", "Error", JOptionPane.ERROR_MESSAGE);
} catch (SQLException e) {
    e.printStackTrace();
    JOptionPane.showMessageDialog(this, "Error al insertar datos: " + e.getMessage());
}

       
    }//GEN-LAST:event_semestre1MouseClicked
      
    
    private void semestre2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_semestre2MouseClicked
       semestre2 sem2 = new semestre2 (this.nombre,this.idUsuario);
       sem2.setVisible(true);
       this.setVisible(false);
       String semestre = "semestre 2";

// Consulta SQL para insertar datos (el autoincremento en la tabla estudiante no aplica, ya que estás usando el mismo id de registro)
String sql = "INSERT INTO estudiante (semestre, idEstudiante) VALUES (?, ?)";

try {
    // Obtén la conexión a la base de datos
    Connection con = conexion.obtenerconexion();
    PreparedStatement ps = con.prepareStatement(sql);
    
    // Establece los valores en el PreparedStatement
    ps.setString(1, semestre);          // Coloca el semestre
    ps.setInt(2, idUsuario);            // Coloca el id del usuario (ya tienes este valor)
    
    // Ejecuta la inserción
    int filasAfectadas = ps.executeUpdate();
    
    // Verifica si se insertaron datos
    if (filasAfectadas > 0) {
        JOptionPane.showMessageDialog(this, "Datos insertados correctamente.");
    } else {
        JOptionPane.showMessageDialog(this, "No se insertaron datos.");
    }

    // Cierra los recursos
    ps.close();
    con.close();

} catch (SQLIntegrityConstraintViolationException e) {
    // Captura la excepción de restricción de integridad
    JOptionPane.showMessageDialog(this, "Ya tienes un semestre registrado.", "Error", JOptionPane.ERROR_MESSAGE);
} catch (SQLException e) {
    e.printStackTrace();
    JOptionPane.showMessageDialog(this, "Error al insertar datos: " + e.getMessage());
}
    }//GEN-LAST:event_semestre2MouseClicked

    private void semestre3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_semestre3MouseClicked
        semestre3 sem3 = new semestre3(this.nombre,this.idUsuario);
       sem3.setVisible(true);
       this.setVisible(false);
       String semestre = "semestre 3";

// Consulta SQL para insertar datos (el autoincremento en la tabla estudiante no aplica, ya que estás usando el mismo id de registro)
String sql = "INSERT INTO estudiante (semestre, idEstudiante) VALUES (?, ?)";

try {
    // Obtén la conexión a la base de datos
    Connection con = conexion.obtenerconexion();
    PreparedStatement ps = con.prepareStatement(sql);
    
    // Establece los valores en el PreparedStatement
    ps.setString(1, semestre);          // Coloca el semestre
    ps.setInt(2, idUsuario);            // Coloca el id del usuario (ya tienes este valor)
    
    // Ejecuta la inserción
    int filasAfectadas = ps.executeUpdate();
    
    // Verifica si se insertaron datos
    if (filasAfectadas > 0) {
        JOptionPane.showMessageDialog(this, "Datos insertados correctamente.");
    } else {
        JOptionPane.showMessageDialog(this, "No se insertaron datos.");
    }

    // Cierra los recursos
    ps.close();
    con.close();

} catch (SQLIntegrityConstraintViolationException e) {
    // Captura la excepción de restricción de integridad
    JOptionPane.showMessageDialog(this, "Ya tienes un semestre registrado.", "Error", JOptionPane.ERROR_MESSAGE);
} catch (SQLException e) {
    e.printStackTrace();
    JOptionPane.showMessageDialog(this, "Error al insertar datos: " + e.getMessage());
}
    }//GEN-LAST:event_semestre3MouseClicked

    private void semestre4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_semestre4MouseClicked
        semestre4 sem4= new semestre4(this.nombre,this.idUsuario);
       sem4.setVisible(true);
       this.setVisible(false);
       String semestre = "semestre 4";

// Consulta SQL para insertar datos (el autoincremento en la tabla estudiante no aplica, ya que estás usando el mismo id de registro)
String sql = "INSERT INTO estudiante (semestre, idEstudiante) VALUES (?, ?)";

try {
    // Obtén la conexión a la base de datos
    Connection con = conexion.obtenerconexion();
    PreparedStatement ps = con.prepareStatement(sql);
    
    // Establece los valores en el PreparedStatement
    ps.setString(1, semestre);          // Coloca el semestre
    ps.setInt(2, idUsuario);            // Coloca el id del usuario (ya tienes este valor)
    
    // Ejecuta la inserción
    int filasAfectadas = ps.executeUpdate();
    
    // Verifica si se insertaron datos
    if (filasAfectadas > 0) {
        JOptionPane.showMessageDialog(this, "Datos insertados correctamente.");
    } else {
        JOptionPane.showMessageDialog(this, "No se insertaron datos.");
    }

    // Cierra los recursos
    ps.close();
    con.close();

} catch (SQLIntegrityConstraintViolationException e) {
    // Captura la excepción de restricción de integridad
    JOptionPane.showMessageDialog(this, "Ya tienes un semestre registrado.", "Error", JOptionPane.ERROR_MESSAGE);
} catch (SQLException e) {
    e.printStackTrace();
    JOptionPane.showMessageDialog(this, "Error al insertar datos: " + e.getMessage());
}
    }//GEN-LAST:event_semestre4MouseClicked

    private void semestre5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_semestre5MouseClicked
        semestre5 sem5= new semestre5(this.nombre,this.idUsuario);
       sem5.setVisible(true);
       this.setVisible(false);
       String semestre = "semestre 5";

// Consulta SQL para insertar datos (el autoincremento en la tabla estudiante no aplica, ya que estás usando el mismo id de registro)
String sql = "INSERT INTO estudiante (semestre, idEstudiante) VALUES (?, ?)";

try {
    // Obtén la conexión a la base de datos
    Connection con = conexion.obtenerconexion();
    PreparedStatement ps = con.prepareStatement(sql);
    
    // Establece los valores en el PreparedStatement
    ps.setString(1, semestre);          // Coloca el semestre
    ps.setInt(2, idUsuario);            // Coloca el id del usuario (ya tienes este valor)
    
    // Ejecuta la inserción
    int filasAfectadas = ps.executeUpdate();
    
    // Verifica si se insertaron datos
    if (filasAfectadas > 0) {
        JOptionPane.showMessageDialog(this, "Datos insertados correctamente.");
    } else {
        JOptionPane.showMessageDialog(this, "No se insertaron datos.");
    }

    // Cierra los recursos
    ps.close();
    con.close();

} catch (SQLIntegrityConstraintViolationException e) {
    // Captura la excepción de restricción de integridad
    JOptionPane.showMessageDialog(this, "Ya tienes un semestre registrado.", "Error", JOptionPane.ERROR_MESSAGE);
} catch (SQLException e) {
    e.printStackTrace();
    JOptionPane.showMessageDialog(this, "Error al insertar datos: " + e.getMessage());
}
    }//GEN-LAST:event_semestre5MouseClicked

    private void semestre6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_semestre6MouseClicked
      semestre6 sem6= new semestre6(this.nombre,this.idUsuario);
       sem6.setVisible(true);
       this.setVisible(false);
       String semestre = "semestre 6";

// Consulta SQL para insertar datos (el autoincremento en la tabla estudiante no aplica, ya que estás usando el mismo id de registro)
String sql = "INSERT INTO estudiante (semestre, idEstudiante) VALUES (?, ?)";

try {
    // Obtén la conexión a la base de datos
    Connection con = conexion.obtenerconexion();
    PreparedStatement ps = con.prepareStatement(sql);
    
    // Establece los valores en el PreparedStatement
    ps.setString(1, semestre);          // Coloca el semestre
    ps.setInt(2, idUsuario);            // Coloca el id del usuario (ya tienes este valor)
    
    // Ejecuta la inserción
    int filasAfectadas = ps.executeUpdate();
    
    // Verifica si se insertaron datos
    if (filasAfectadas > 0) {
        JOptionPane.showMessageDialog(this, "Datos insertados correctamente.");
    } else {
        JOptionPane.showMessageDialog(this, "No se insertaron datos.");
    }

    // Cierra los recursos
    ps.close();
    con.close();

} catch (SQLIntegrityConstraintViolationException e) {
    // Captura la excepción de restricción de integridad
    JOptionPane.showMessageDialog(this, "Ya tienes un semestre registrado.", "Error", JOptionPane.ERROR_MESSAGE);
} catch (SQLException e) {
    e.printStackTrace();
    JOptionPane.showMessageDialog(this, "Error al insertar datos: " + e.getMessage());
}
    }//GEN-LAST:event_semestre6MouseClicked

    private void semestre7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_semestre7MouseClicked
        semestre7 sem7= new semestre7(this.nombre,this.idUsuario);
       sem7.setVisible(true);
       this.setVisible(false);
       String semestre = "semestre 7";

// Consulta SQL para insertar datos (el autoincremento en la tabla estudiante no aplica, ya que estás usando el mismo id de registro)
String sql = "INSERT INTO estudiante (semestre, idEstudiante) VALUES (?, ?)";

try {
    // Obtén la conexión a la base de datos
    Connection con = conexion.obtenerconexion();
    PreparedStatement ps = con.prepareStatement(sql);
    
    // Establece los valores en el PreparedStatement
    ps.setString(1, semestre);          // Coloca el semestre
    ps.setInt(2, idUsuario);            // Coloca el id del usuario (ya tienes este valor)
    
    // Ejecuta la inserción
    int filasAfectadas = ps.executeUpdate();
    
    // Verifica si se insertaron datos
    if (filasAfectadas > 0) {
        JOptionPane.showMessageDialog(this, "Datos insertados correctamente.");
    } else {
        JOptionPane.showMessageDialog(this, "No se insertaron datos.");
    }

    // Cierra los recursos
    ps.close();
    con.close();

} catch (SQLIntegrityConstraintViolationException e) {
    // Captura la excepción de restricción de integridad
    JOptionPane.showMessageDialog(this, "Ya tienes un semestre registrado.", "Error", JOptionPane.ERROR_MESSAGE);
} catch (SQLException e) {
    e.printStackTrace();
    JOptionPane.showMessageDialog(this, "Error al insertar datos: " + e.getMessage());
}
    }//GEN-LAST:event_semestre7MouseClicked

    private void semestre8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_semestre8MouseClicked
        semestre8 sem8= new semestre8(this.nombre,this.idUsuario);
       sem8.setVisible(true);
       this.setVisible(false);
       String semestre = "semestre 8";

// Consulta SQL para insertar datos (el autoincremento en la tabla estudiante no aplica, ya que estás usando el mismo id de registro)
String sql = "INSERT INTO estudiante (semestre, idEstudiante) VALUES (?, ?)";

try {
    // Obtén la conexión a la base de datos
    Connection con = conexion.obtenerconexion();
    PreparedStatement ps = con.prepareStatement(sql);
    
    // Establece los valores en el PreparedStatement
    ps.setString(1, semestre);          // Coloca el semestre
    ps.setInt(2, idUsuario);            // Coloca el id del usuario (ya tienes este valor)
    
    // Ejecuta la inserción
    int filasAfectadas = ps.executeUpdate();
    
    // Verifica si se insertaron datos
    if (filasAfectadas > 0) {
        JOptionPane.showMessageDialog(this, "Datos insertados correctamente.");
    } else {
        JOptionPane.showMessageDialog(this, "No se insertaron datos.");
    }

    // Cierra los recursos
    ps.close();
    con.close();

} catch (SQLIntegrityConstraintViolationException e) {
    // Captura la excepción de restricción de integridad
    JOptionPane.showMessageDialog(this, "Ya tienes un semestre registrado.", "Error", JOptionPane.ERROR_MESSAGE);
} catch (SQLException e) {
    e.printStackTrace();
    JOptionPane.showMessageDialog(this, "Error al insertar datos: " + e.getMessage());
}
    }//GEN-LAST:event_semestre8MouseClicked

    private void semestre9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_semestre9MouseClicked
       semestre9 sem9= new semestre9(this.nombre,this.idUsuario);
       sem9.setVisible(true);
       this.setVisible(false);
       String semestre = "semestre 9";

// Consulta SQL para insertar datos (el autoincremento en la tabla estudiante no aplica, ya que estás usando el mismo id de registro)
String sql = "INSERT INTO estudiante (semestre, idEstudiante) VALUES (?, ?)";

try {
    // Obtén la conexión a la base de datos
    Connection con = conexion.obtenerconexion();
    PreparedStatement ps = con.prepareStatement(sql);
    
    // Establece los valores en el PreparedStatement
    ps.setString(1, semestre);          // Coloca el semestre
    ps.setInt(2, idUsuario);            // Coloca el id del usuario (ya tienes este valor)
    
    // Ejecuta la inserción
    int filasAfectadas = ps.executeUpdate();
    
    // Verifica si se insertaron datos
    if (filasAfectadas > 0) {
        JOptionPane.showMessageDialog(this, "Datos insertados correctamente.");
    } else {
        JOptionPane.showMessageDialog(this, "No se insertaron datos.");
    }

    // Cierra los recursos
    ps.close();
    con.close();

} catch (SQLIntegrityConstraintViolationException e) {
    // Captura la excepción de restricción de integridad
    JOptionPane.showMessageDialog(this, "Ya tienes un semestre registrado.", "Error", JOptionPane.ERROR_MESSAGE);
} catch (SQLException e) {
    e.printStackTrace();
    JOptionPane.showMessageDialog(this, "Error al insertar datos: " + e.getMessage());
}
    }//GEN-LAST:event_semestre9MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        inicio inicio = new inicio();
        inicio.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel3MouseClicked

    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel semestre1;
    private javax.swing.JLabel semestre2;
    private javax.swing.JLabel semestre3;
    private javax.swing.JLabel semestre4;
    private javax.swing.JLabel semestre5;
    private javax.swing.JLabel semestre6;
    private javax.swing.JLabel semestre7;
    private javax.swing.JLabel semestre8;
    private javax.swing.JLabel semestre9;
    // End of variables declaration//GEN-END:variables
}
