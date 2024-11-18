
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
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

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
            .addComponent(semestre1, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(semestre1, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
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
            .addComponent(semestre2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(semestre2, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(102, 102, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        jPanel4.setPreferredSize(new java.awt.Dimension(112, 64));

        semestre4.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        semestre4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
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
            .addComponent(semestre4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(semestre4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(102, 102, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        jPanel5.setPreferredSize(new java.awt.Dimension(112, 64));

        semestre3.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        semestre3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
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
            .addComponent(semestre3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(semestre3, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
        );

        jPanel6.setBackground(new java.awt.Color(102, 102, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        jPanel6.setPreferredSize(new java.awt.Dimension(112, 64));

        semestre5.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        semestre5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
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
            .addComponent(semestre5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(semestre5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
        );

        jPanel7.setBackground(new java.awt.Color(102, 102, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        jPanel7.setPreferredSize(new java.awt.Dimension(112, 64));

        semestre6.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        semestre6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
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
            .addComponent(semestre6, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(semestre6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
        );

        jPanel8.setBackground(new java.awt.Color(102, 102, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        jPanel8.setPreferredSize(new java.awt.Dimension(112, 64));

        semestre7.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        semestre7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
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
            .addComponent(semestre7, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(semestre7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
        );

        jPanel9.setBackground(new java.awt.Color(102, 102, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        jPanel9.setPreferredSize(new java.awt.Dimension(112, 64));

        semestre8.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        semestre8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
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
            .addComponent(semestre8, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(semestre8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
        );

        jPanel10.setBackground(new java.awt.Color(102, 102, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        jPanel10.setPreferredSize(new java.awt.Dimension(112, 64));

        semestre9.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        semestre9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
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
            .addComponent(semestre9, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(semestre9, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
        );

        jPanel11.setBackground(new java.awt.Color(102, 102, 255));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("VOLVER");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
        );

        jPanel12.setBackground(new java.awt.Color(102, 102, 255));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/imagenes/ususario.jpg"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText(nombre);

        jLabel8.setFont(new java.awt.Font("Segoe Print", 3, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("TUTO DEC");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 24, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 24, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 24, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 24, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel17.setBackground(new java.awt.Color(102, 102, 255));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("CICLO 1");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        );

        jPanel18.setBackground(new java.awt.Color(102, 102, 255));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("CICLO 2");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );

        jPanel20.setBackground(new java.awt.Color(102, 102, 255));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("CICLO 3 ");

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel21.setBackground(new java.awt.Color(102, 102, 255));

        jLabel9.setFont(new java.awt.Font("Roboto Black", 3, 12)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("VER MIS TUTORIAS");

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
        );

        jPanel22.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel2.setText("Porfavor escoga el semestre en el que se encuentra la materia que desea recibir la tutoria ");

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/imagenes/escudo.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(1, 1, 1))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator5.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator6.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator6.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                                .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                                .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE))
                            .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(149, 149, 149)
                                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(141, 141, 141))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(17, 17, 17)
                                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(26, 26, 26)
                                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(28, 28, 28)
                                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(33, 33, 33)
                                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(36, 36, 36)
                                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(31, 31, 31)
                                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(33, 33, 33)
                                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(35, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 733, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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

    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
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
