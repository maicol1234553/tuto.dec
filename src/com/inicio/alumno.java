
package com.inicio;
import java.sql.ResultSet;
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
        jPanel12 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Bienvenido "+nombre);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel2.setText("porfavor escoge el semestre en el que se encuentra la materia que deseas recibir la tutoria ");

        jPanel2.setBackground(new java.awt.Color(102, 102, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));

        semestre1.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
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
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(semestre1, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(semestre1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(102, 102, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        jPanel3.setPreferredSize(new java.awt.Dimension(112, 64));

        semestre2.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
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
            .addComponent(semestre2, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(semestre2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(102, 102, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        jPanel4.setPreferredSize(new java.awt.Dimension(112, 64));

        semestre4.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
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
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(semestre4, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(semestre4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(102, 102, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        jPanel5.setPreferredSize(new java.awt.Dimension(112, 64));

        semestre3.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(semestre3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(semestre3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(102, 102, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        jPanel6.setPreferredSize(new java.awt.Dimension(112, 64));

        semestre5.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(semestre5, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(semestre5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(102, 102, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        jPanel7.setPreferredSize(new java.awt.Dimension(112, 64));

        semestre6.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(semestre6, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(semestre6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(102, 102, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        jPanel8.setPreferredSize(new java.awt.Dimension(112, 64));

        semestre7.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(semestre7, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(semestre7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel9.setBackground(new java.awt.Color(102, 102, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        jPanel9.setPreferredSize(new java.awt.Dimension(112, 64));

        semestre8.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(semestre8, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(semestre8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel10.setBackground(new java.awt.Color(102, 102, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        jPanel10.setPreferredSize(new java.awt.Dimension(112, 64));

        semestre9.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(0, 20, Short.MAX_VALUE)
                .addComponent(semestre9, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(semestre9, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        jPanel11.setBackground(new java.awt.Color(51, 51, 255));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel12.setBackground(new java.awt.Color(0, 0, 153));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
        );

        jLabel4.setText("ver mis tutorias");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(136, 136, 136))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 818, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(209, 209, 209)
                        .addComponent(jLabel4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(27, 27, 27))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 817, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void semestre1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_semestre1MouseClicked
                                       
   semestre1 sem1 = new semestre1(this.nombre, this.idUsuario);
String semestre = "semestre 1";

// Consulta SQL para verificar si el semestre ya está registrado
String sqlCheck = "SELECT semestre FROM estudiante WHERE idEstudiante = ?";

try {
    Connection con = conexion.obtenerconexion();
    PreparedStatement psCheck = con.prepareStatement(sqlCheck);
    
    // Establece el valor de idEstudiante en el PreparedStatement para la verificación
    psCheck.setInt(1, idUsuario);

    // Ejecuta la consulta de verificación
    ResultSet rs = psCheck.executeQuery();
    
    if (rs.next()) {
        String semestreRegistrado = rs.getString("semestre"); // Obtiene el semestre registrado

        // Si el semestre registrado es el mismo que el semestre actual
        if (semestre.equals(semestreRegistrado)) {
            // Abre directamente el semestre 7
            sem1.setVisible(true);
            this.setVisible(false);
        } else {
            // Si el semestre es diferente, pregunta si desea ver las materias de otro semestre
            int respuesta = JOptionPane.showConfirmDialog(this, 
                    "Tienes registrado el " + semestreRegistrado + ". ¿Deseas revisar las materias de " + semestre + "?",
                    "Confirmación", 
                    JOptionPane.YES_NO_OPTION);

            if (respuesta == JOptionPane.YES_OPTION) {
                // El usuario aceptó ver las materias de semestre 7, muestra la ventana sin insertar
                sem1.setVisible(true);
                this.setVisible(false);
            }
        }
    } else {
        // Si no hay ningún semestre registrado para este usuario, inserta el semestre actual
        String sqlInsert = "INSERT INTO estudiante (semestre, idEstudiante) VALUES (?, ?)";
        PreparedStatement psInsert = con.prepareStatement(sqlInsert);
        psInsert.setString(1, semestre);
        psInsert.setInt(2, idUsuario);

        int filasAfectadas = psInsert.executeUpdate();

        if (filasAfectadas > 0) {
            JOptionPane.showMessageDialog(this, "Datos insertados correctamente.");
        } else {
            JOptionPane.showMessageDialog(this, "No se insertaron datos.");
        }

        // Muestra la ventana del semestre 7
        sem1.setVisible(true);
        this.setVisible(false);

        psInsert.close();
    }

    // Cierra los recursos de verificación
    psCheck.close();
    rs.close();
    con.close();

} catch (SQLException e) {
    e.printStackTrace();
    JOptionPane.showMessageDialog(this, "Error al verificar o insertar datos: " + e.getMessage());
}
       
    }//GEN-LAST:event_semestre1MouseClicked
      
    
    private void semestre2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_semestre2MouseClicked
       semestre2 sem2 = new semestre2(this.nombre, this.idUsuario);
String semestre = "semestre 2";

// Consulta SQL para verificar si el semestre ya está registrado
String sqlCheck = "SELECT semestre FROM estudiante WHERE idEstudiante = ?";

try {
    Connection con = conexion.obtenerconexion();
    PreparedStatement psCheck = con.prepareStatement(sqlCheck);
    
    // Establece el valor de idEstudiante en el PreparedStatement para la verificación
    psCheck.setInt(1, idUsuario);

    // Ejecuta la consulta de verificación
    ResultSet rs = psCheck.executeQuery();
    
    if (rs.next()) {
        String semestreRegistrado = rs.getString("semestre"); // Obtiene el semestre registrado

        // Si el semestre registrado es el mismo que el semestre actual
        if (semestre.equals(semestreRegistrado)) {
            // Abre directamente el semestre 7
            sem2.setVisible(true);
            this.setVisible(false);
        } else {
            // Si el semestre es diferente, pregunta si desea ver las materias de otro semestre
            int respuesta = JOptionPane.showConfirmDialog(this, 
                    "Tienes registrado el " + semestreRegistrado + ". ¿Deseas revisar las materias de " + semestre + "?",
                    "Confirmación", 
                    JOptionPane.YES_NO_OPTION);

            if (respuesta == JOptionPane.YES_OPTION) {
                // El usuario aceptó ver las materias de semestre 7, muestra la ventana sin insertar
                sem2.setVisible(true);
                this.setVisible(false);
            }
        }
    } else {
        // Si no hay ningún semestre registrado para este usuario, inserta el semestre actual
        String sqlInsert = "INSERT INTO estudiante (semestre, idEstudiante) VALUES (?, ?)";
        PreparedStatement psInsert = con.prepareStatement(sqlInsert);
        psInsert.setString(1, semestre);
        psInsert.setInt(2, idUsuario);

        int filasAfectadas = psInsert.executeUpdate();

        if (filasAfectadas > 0) {
            JOptionPane.showMessageDialog(this, "Datos insertados correctamente.");
        } else {
            JOptionPane.showMessageDialog(this, "No se insertaron datos.");
        }

        // Muestra la ventana del semestre 7
        sem2.setVisible(true);
        this.setVisible(false);

        psInsert.close();
    }

    // Cierra los recursos de verificación
    psCheck.close();
    rs.close();
    con.close();

} catch (SQLException e) {
    e.printStackTrace();
    JOptionPane.showMessageDialog(this, "Error al verificar o insertar datos: " + e.getMessage());
}
    }//GEN-LAST:event_semestre2MouseClicked

    private void semestre3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_semestre3MouseClicked
    semestre3 sem3 = new semestre3(this.nombre, this.idUsuario);
String semestre = "semestre 3";

// Consulta SQL para verificar si el semestre ya está registrado
String sqlCheck = "SELECT semestre FROM estudiante WHERE idEstudiante = ?";

try {
    Connection con = conexion.obtenerconexion();
    PreparedStatement psCheck = con.prepareStatement(sqlCheck);
    
    // Establece el valor de idEstudiante en el PreparedStatement para la verificación
    psCheck.setInt(1, idUsuario);

    // Ejecuta la consulta de verificación
    ResultSet rs = psCheck.executeQuery();
    
    if (rs.next()) {
        String semestreRegistrado = rs.getString("semestre"); // Obtiene el semestre registrado

        // Si el semestre registrado es el mismo que el semestre actual
        if (semestre.equals(semestreRegistrado)) {
            // Abre directamente el semestre 7
            sem3.setVisible(true);
            this.setVisible(false);
        } else {
            // Si el semestre es diferente, pregunta si desea ver las materias de otro semestre
            int respuesta = JOptionPane.showConfirmDialog(this, 
                    "Tienes registrado el " + semestreRegistrado + ". ¿Deseas revisar las materias de " + semestre + "?",
                    "Confirmación", 
                    JOptionPane.YES_NO_OPTION);

            if (respuesta == JOptionPane.YES_OPTION) {
                // El usuario aceptó ver las materias de semestre 7, muestra la ventana sin insertar
                sem3.setVisible(true);
                this.setVisible(false);
            }
        }
    } else {
        // Si no hay ningún semestre registrado para este usuario, inserta el semestre actual
        String sqlInsert = "INSERT INTO estudiante (semestre, idEstudiante) VALUES (?, ?)";
        PreparedStatement psInsert = con.prepareStatement(sqlInsert);
        psInsert.setString(1, semestre);
        psInsert.setInt(2, idUsuario);

        int filasAfectadas = psInsert.executeUpdate();

        if (filasAfectadas > 0) {
            JOptionPane.showMessageDialog(this, "Datos insertados correctamente.");
        } else {
            JOptionPane.showMessageDialog(this, "No se insertaron datos.");
        }

        // Muestra la ventana del semestre 7
        sem3.setVisible(true);
        this.setVisible(false);

        psInsert.close();
    }

    // Cierra los recursos de verificación
    psCheck.close();
    rs.close();
    con.close();

} catch (SQLException e) {
    e.printStackTrace();
    JOptionPane.showMessageDialog(this, "Error al verificar o insertar datos: " + e.getMessage());
}
    }//GEN-LAST:event_semestre3MouseClicked

    private void semestre4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_semestre4MouseClicked
        semestre4 sem4 = new semestre4(this.nombre, this.idUsuario);
String semestre = "semestre 4";

// Consulta SQL para verificar si el semestre ya está registrado
String sqlCheck = "SELECT semestre FROM estudiante WHERE idEstudiante = ?";

try {
    Connection con = conexion.obtenerconexion();
    PreparedStatement psCheck = con.prepareStatement(sqlCheck);
    
    // Establece el valor de idEstudiante en el PreparedStatement para la verificación
    psCheck.setInt(1, idUsuario);

    // Ejecuta la consulta de verificación
    ResultSet rs = psCheck.executeQuery();
    
    if (rs.next()) {
        String semestreRegistrado = rs.getString("semestre"); // Obtiene el semestre registrado

        // Si el semestre registrado es el mismo que el semestre actual
        if (semestre.equals(semestreRegistrado)) {
            // Abre directamente el semestre 7
            sem4.setVisible(true);
            this.setVisible(false);
        } else {
            // Si el semestre es diferente, pregunta si desea ver las materias de otro semestre
            int respuesta = JOptionPane.showConfirmDialog(this, 
                    "Tienes registrado el " + semestreRegistrado + ". ¿Deseas revisar las materias de " + semestre + "?",
                    "Confirmación", 
                    JOptionPane.YES_NO_OPTION);

            if (respuesta == JOptionPane.YES_OPTION) {
                // El usuario aceptó ver las materias de semestre 7, muestra la ventana sin insertar
                sem4.setVisible(true);
                this.setVisible(false);
            }
        }
    } else {
        // Si no hay ningún semestre registrado para este usuario, inserta el semestre actual
        String sqlInsert = "INSERT INTO estudiante (semestre, idEstudiante) VALUES (?, ?)";
        PreparedStatement psInsert = con.prepareStatement(sqlInsert);
        psInsert.setString(1, semestre);
        psInsert.setInt(2, idUsuario);

        int filasAfectadas = psInsert.executeUpdate();

        if (filasAfectadas > 0) {
            JOptionPane.showMessageDialog(this, "Datos insertados correctamente.");
        } else {
            JOptionPane.showMessageDialog(this, "No se insertaron datos.");
        }

        // Muestra la ventana del semestre 7
        sem4.setVisible(true);
        this.setVisible(false);

        psInsert.close();
    }

    // Cierra los recursos de verificación
    psCheck.close();
    rs.close();
    con.close();

} catch (SQLException e) {
    e.printStackTrace();
    JOptionPane.showMessageDialog(this, "Error al verificar o insertar datos: " + e.getMessage());
}
    }//GEN-LAST:event_semestre4MouseClicked

    private void semestre5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_semestre5MouseClicked
        semestre5 sem5 = new semestre5(this.nombre, this.idUsuario);
String semestre = "semestre 5";

// Consulta SQL para verificar si el semestre ya está registrado
String sqlCheck = "SELECT semestre FROM estudiante WHERE idEstudiante = ?";

try {
    Connection con = conexion.obtenerconexion();
    PreparedStatement psCheck = con.prepareStatement(sqlCheck);
    
    // Establece el valor de idEstudiante en el PreparedStatement para la verificación
    psCheck.setInt(1, idUsuario);

    // Ejecuta la consulta de verificación
    ResultSet rs = psCheck.executeQuery();
    
    if (rs.next()) {
        String semestreRegistrado = rs.getString("semestre"); // Obtiene el semestre registrado

        // Si el semestre registrado es el mismo que el semestre actual
        if (semestre.equals(semestreRegistrado)) {
            // Abre directamente el semestre 7
            sem5.setVisible(true);
            this.setVisible(false);
        } else {
            // Si el semestre es diferente, pregunta si desea ver las materias de otro semestre
            int respuesta = JOptionPane.showConfirmDialog(this, 
                    "Tienes registrado el " + semestreRegistrado + ". ¿Deseas revisar las materias de " + semestre + "?",
                    "Confirmación", 
                    JOptionPane.YES_NO_OPTION);

            if (respuesta == JOptionPane.YES_OPTION) {
                // El usuario aceptó ver las materias de semestre 7, muestra la ventana sin insertar
                sem5.setVisible(true);
                this.setVisible(false);
            }
        }
    } else {
        // Si no hay ningún semestre registrado para este usuario, inserta el semestre actual
        String sqlInsert = "INSERT INTO estudiante (semestre, idEstudiante) VALUES (?, ?)";
        PreparedStatement psInsert = con.prepareStatement(sqlInsert);
        psInsert.setString(1, semestre);
        psInsert.setInt(2, idUsuario);

        int filasAfectadas = psInsert.executeUpdate();

        if (filasAfectadas > 0) {
            JOptionPane.showMessageDialog(this, "Datos insertados correctamente.");
        } else {
            JOptionPane.showMessageDialog(this, "No se insertaron datos.");
        }

        // Muestra la ventana del semestre 7
        sem5.setVisible(true);
        this.setVisible(false);

        psInsert.close();
    }

    // Cierra los recursos de verificación
    psCheck.close();
    rs.close();
    con.close();

} catch (SQLException e) {
    e.printStackTrace();
    JOptionPane.showMessageDialog(this, "Error al verificar o insertar datos: " + e.getMessage());
}
    }//GEN-LAST:event_semestre5MouseClicked

    private void semestre6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_semestre6MouseClicked
    // Código para el evento de abrir el semestre 7
semestre6 sem6 = new semestre6(this.nombre, this.idUsuario);
String semestre = "semestre 6";

// Consulta SQL para verificar si el semestre ya está registrado
String sqlCheck = "SELECT semestre FROM estudiante WHERE idEstudiante = ?";

try {
    Connection con = conexion.obtenerconexion();
    PreparedStatement psCheck = con.prepareStatement(sqlCheck);
    
    // Establece el valor de idEstudiante en el PreparedStatement para la verificación
    psCheck.setInt(1, idUsuario);

    // Ejecuta la consulta de verificación
    ResultSet rs = psCheck.executeQuery();
    
    if (rs.next()) {
        String semestreRegistrado = rs.getString("semestre"); // Obtiene el semestre registrado

        // Si el semestre registrado es el mismo que el semestre actual
        if (semestre.equals(semestreRegistrado)) {
            // Abre directamente el semestre 7
            sem6.setVisible(true);
            this.setVisible(false);
        } else {
            // Si el semestre es diferente, pregunta si desea ver las materias de otro semestre
            int respuesta = JOptionPane.showConfirmDialog(this, 
                    "Tienes registrado el " + semestreRegistrado + ". ¿Deseas revisar las materias de " + semestre + "?",
                    "Confirmación", 
                    JOptionPane.YES_NO_OPTION);

            if (respuesta == JOptionPane.YES_OPTION) {
                // El usuario aceptó ver las materias de semestre 7, muestra la ventana sin insertar
                sem6.setVisible(true);
                this.setVisible(false);
            }
        }
    } else {
        // Si no hay ningún semestre registrado para este usuario, inserta el semestre actual
        String sqlInsert = "INSERT INTO estudiante (semestre, idEstudiante) VALUES (?, ?)";
        PreparedStatement psInsert = con.prepareStatement(sqlInsert);
        psInsert.setString(1, semestre);
        psInsert.setInt(2, idUsuario);

        int filasAfectadas = psInsert.executeUpdate();

        if (filasAfectadas > 0) {
            JOptionPane.showMessageDialog(this, "Datos insertados correctamente.");
        } else {
            JOptionPane.showMessageDialog(this, "No se insertaron datos.");
        }

        // Muestra la ventana del semestre 7
        sem6.setVisible(true);
        this.setVisible(false);

        psInsert.close();
    }

    // Cierra los recursos de verificación
    psCheck.close();
    rs.close();
    con.close();

} catch (SQLException e) {
    e.printStackTrace();
    JOptionPane.showMessageDialog(this, "Error al verificar o insertar datos: " + e.getMessage());
}

    }//GEN-LAST:event_semestre6MouseClicked

    private void semestre7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_semestre7MouseClicked
         // Código para el evento de abrir el semestre 7
semestre7 sem7 = new semestre7(this.nombre, this.idUsuario);
String semestre = "semestre 7";

// Consulta SQL para verificar si el semestre ya está registrado
String sqlCheck = "SELECT semestre FROM estudiante WHERE idEstudiante = ?";

try {
    Connection con = conexion.obtenerconexion();
    PreparedStatement psCheck = con.prepareStatement(sqlCheck);
    
    // Establece el valor de idEstudiante en el PreparedStatement para la verificación
    psCheck.setInt(1, idUsuario);

    // Ejecuta la consulta de verificación
    ResultSet rs = psCheck.executeQuery();
    
    if (rs.next()) {
        String semestreRegistrado = rs.getString("semestre"); // Obtiene el semestre registrado

        // Si el semestre registrado es el mismo que el semestre actual
        if (semestre.equals(semestreRegistrado)) {
            // Abre directamente el semestre 7
            sem7.setVisible(true);
            this.setVisible(false);
        } else {
            // Si el semestre es diferente, pregunta si desea ver las materias de otro semestre
            int respuesta = JOptionPane.showConfirmDialog(this, 
                    "Tienes registrado el " + semestreRegistrado + ". ¿Deseas revisar las materias de " + semestre + "?",
                    "Confirmación", 
                    JOptionPane.YES_NO_OPTION);

            if (respuesta == JOptionPane.YES_OPTION) {
                // El usuario aceptó ver las materias de semestre 7, muestra la ventana sin insertar
                sem7.setVisible(true);
                this.setVisible(false);
            }
        }
    } else {
        // Si no hay ningún semestre registrado para este usuario, inserta el semestre actual
        String sqlInsert = "INSERT INTO estudiante (semestre, idEstudiante) VALUES (?, ?)";
        PreparedStatement psInsert = con.prepareStatement(sqlInsert);
        psInsert.setString(1, semestre);
        psInsert.setInt(2, idUsuario);

        int filasAfectadas = psInsert.executeUpdate();

        if (filasAfectadas > 0) {
            JOptionPane.showMessageDialog(this, "Datos insertados correctamente.");
        } else {
            JOptionPane.showMessageDialog(this, "No se insertaron datos.");
        }

        // Muestra la ventana del semestre 7
        sem7.setVisible(true);
        this.setVisible(false);

        psInsert.close();
    }

    // Cierra los recursos de verificación
    psCheck.close();
    rs.close();
    con.close();

} catch (SQLException e) {
    e.printStackTrace();
    JOptionPane.showMessageDialog(this, "Error al verificar o insertar datos: " + e.getMessage());
}

    }//GEN-LAST:event_semestre7MouseClicked

    private void semestre8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_semestre8MouseClicked
       semestre8 sem8 = new semestre8(this.nombre, this.idUsuario);
String semestre = "semestre 8";

// Consulta SQL para verificar si el semestre ya está registrado
String sqlCheck = "SELECT semestre FROM estudiante WHERE idEstudiante = ?";

try {
    Connection con = conexion.obtenerconexion();
    PreparedStatement psCheck = con.prepareStatement(sqlCheck);
    
    // Establece el valor de idEstudiante en el PreparedStatement para la verificación
    psCheck.setInt(1, idUsuario);

    // Ejecuta la consulta de verificación
    ResultSet rs = psCheck.executeQuery();
    
    if (rs.next()) {
        String semestreRegistrado = rs.getString("semestre"); // Obtiene el semestre registrado

        // Si el semestre registrado es el mismo que el semestre actual
        if (semestre.equals(semestreRegistrado)) {
            // Abre directamente el semestre 7
            sem8.setVisible(true);
            this.setVisible(false);
        } else {
            // Si el semestre es diferente, pregunta si desea ver las materias de otro semestre
            int respuesta = JOptionPane.showConfirmDialog(this, 
                    "Tienes registrado el " + semestreRegistrado + ". ¿Deseas revisar las materias de " + semestre + "?",
                    "Confirmación", 
                    JOptionPane.YES_NO_OPTION);

            if (respuesta == JOptionPane.YES_OPTION) {
                // El usuario aceptó ver las materias de semestre 7, muestra la ventana sin insertar
                sem8.setVisible(true);
                this.setVisible(false);
            }
        }
    } else {
        // Si no hay ningún semestre registrado para este usuario, inserta el semestre actual
        String sqlInsert = "INSERT INTO estudiante (semestre, idEstudiante) VALUES (?, ?)";
        PreparedStatement psInsert = con.prepareStatement(sqlInsert);
        psInsert.setString(1, semestre);
        psInsert.setInt(2, idUsuario);

        int filasAfectadas = psInsert.executeUpdate();

        if (filasAfectadas > 0) {
            JOptionPane.showMessageDialog(this, "Datos insertados correctamente.");
        } else {
            JOptionPane.showMessageDialog(this, "No se insertaron datos.");
        }

        // Muestra la ventana del semestre 7
        sem8.setVisible(true);
        this.setVisible(false);

        psInsert.close();
    }

    // Cierra los recursos de verificación
    psCheck.close();
    rs.close();
    con.close();

} catch (SQLException e) {
    e.printStackTrace();
    JOptionPane.showMessageDialog(this, "Error al verificar o insertar datos: " + e.getMessage());
}
    }//GEN-LAST:event_semestre8MouseClicked

    private void semestre9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_semestre9MouseClicked
      semestre9 sem9 = new semestre9(this.nombre, this.idUsuario);
String semestre = "semestre 9";

// Consulta SQL para verificar si el semestre ya está registrado
String sqlCheck = "SELECT semestre FROM estudiante WHERE idEstudiante = ?";

try {
    Connection con = conexion.obtenerconexion();
    PreparedStatement psCheck = con.prepareStatement(sqlCheck);
    
    // Establece el valor de idEstudiante en el PreparedStatement para la verificación
    psCheck.setInt(1, idUsuario);

    // Ejecuta la consulta de verificación
    ResultSet rs = psCheck.executeQuery();
    
    if (rs.next()) {
        String semestreRegistrado = rs.getString("semestre"); // Obtiene el semestre registrado

        // Si el semestre registrado es el mismo que el semestre actual
        if (semestre.equals(semestreRegistrado)) {
            // Abre directamente el semestre 7
            sem9.setVisible(true);
            this.setVisible(false);
        } else {
            // Si el semestre es diferente, pregunta si desea ver las materias de otro semestre
            int respuesta = JOptionPane.showConfirmDialog(this, 
                    "Tienes registrado el " + semestreRegistrado + ". ¿Deseas revisar las materias de " + semestre + "?",
                    "Confirmación", 
                    JOptionPane.YES_NO_OPTION);

            if (respuesta == JOptionPane.YES_OPTION) {
                // El usuario aceptó ver las materias de semestre 7, muestra la ventana sin insertar
                sem9.setVisible(true);
                this.setVisible(false);
            }
        }
    } else {
        // Si no hay ningún semestre registrado para este usuario, inserta el semestre actual
        String sqlInsert = "INSERT INTO estudiante (semestre, idEstudiante) VALUES (?, ?)";
        PreparedStatement psInsert = con.prepareStatement(sqlInsert);
        psInsert.setString(1, semestre);
        psInsert.setInt(2, idUsuario);

        int filasAfectadas = psInsert.executeUpdate();

        if (filasAfectadas > 0) {
            JOptionPane.showMessageDialog(this, "Datos insertados correctamente.");
        } else {
            JOptionPane.showMessageDialog(this, "No se insertaron datos.");
        }

        // Muestra la ventana del semestre 7
        sem9.setVisible(true);
        this.setVisible(false);

        psInsert.close();
    }

    // Cierra los recursos de verificación
    psCheck.close();
    rs.close();
    con.close();

} catch (SQLException e) {
    e.printStackTrace();
    JOptionPane.showMessageDialog(this, "Error al verificar o insertar datos: " + e.getMessage());
}
    }//GEN-LAST:event_semestre9MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        inicio inicio = new inicio();
        inicio.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel4MouseClicked

    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
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
