/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.inicio;





import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author maico
 */
public class materiasp extends javax.swing.JFrame {
   
   private int idUsuario;
    private String nombre;
    public materiasp(String nombre, int idUsuario) {
        this.nombre = nombre ; 
       this.idUsuario = idUsuario;
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Materias de ingenieria en sistemas");
    }




    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        calmultivariado = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        estructurasinfo = new javax.swing.JLabel();
        fisica3 = new javax.swing.JLabel();
        arquitectura = new javax.swing.JLabel();
        fundamentosadmi = new javax.swing.JLabel();
        ingles2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        programacion1 = new javax.swing.JLabel();
        Caldiferencial = new javax.swing.JLabel();
        fisica1 = new javax.swing.JLabel();
        argumentativo = new javax.swing.JLabel();
        estadistica = new javax.swing.JLabel();
        pensamientocri1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        programacion2 = new javax.swing.JLabel();
        calintegral = new javax.swing.JLabel();
        ciudadania = new javax.swing.JLabel();
        fisica2 = new javax.swing.JLabel();
        ingles1 = new javax.swing.JLabel();
        comunicacion2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        algebralineal = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        pensamientoal = new javax.swing.JLabel();
        fundamentoselectronica = new javax.swing.JLabel();
        fundamentosing = new javax.swing.JLabel();
        discretas = new javax.swing.JLabel();
        pensamientosistemico = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        ecuadiferenciales = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        ingsoftware = new javax.swing.JLabel();
        operativos = new javax.swing.JLabel();
        sisinformacion = new javax.swing.JLabel();
        basesdedatos = new javax.swing.JLabel();
        planeacionestrategica = new javax.swing.JLabel();
        ingles3 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        matespeciales = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        ingsoftware2 = new javax.swing.JLabel();
        comudatos = new javax.swing.JLabel();
        networking = new javax.swing.JLabel();
        catedra = new javax.swing.JLabel();
        emprendimiento = new javax.swing.JLabel();
        ingles4 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        analisisnum = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        operativa = new javax.swing.JLabel();
        redesycomunicacion = new javax.swing.JLabel();
        cienciadedtaos = new javax.swing.JLabel();
        seginformatica = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        artificial = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        automatas = new javax.swing.JLabel();
        profundizacion1 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        gerencia = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        modelacion = new javax.swing.JLabel();
        profundizacion2 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        nombreL = new javax.swing.JLabel();
        materia = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.blue, java.awt.Color.blue, java.awt.Color.blue, java.awt.Color.blue));

        calmultivariado.setText("Cálculo multivario");
        calmultivariado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                calmultivariadoMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel2.setText("SEMESTRE 4");

        estructurasinfo.setText("Estructuras de información");
        estructurasinfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                estructurasinfoMouseClicked(evt);
            }
        });

        fisica3.setText("Fisica III (electricidad y magnetismo)");
        fisica3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fisica3MouseClicked(evt);
            }
        });

        arquitectura.setText("Arquitectura de computadores");
        arquitectura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                arquitecturaMouseClicked(evt);
            }
        });

        fundamentosadmi.setText("Fundamentos administrativos");
        fundamentosadmi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fundamentosadmiMouseClicked(evt);
            }
        });

        ingles2.setText("Ingles II");
        ingles2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ingles2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(calmultivariado)
                    .addComponent(estructurasinfo)
                    .addComponent(fisica3)
                    .addComponent(arquitectura)
                    .addComponent(fundamentosadmi)
                    .addComponent(ingles2))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(calmultivariado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(estructurasinfo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fisica3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(arquitectura)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fundamentosadmi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ingles2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(153, 153, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.blue, java.awt.Color.blue, java.awt.Color.blue, java.awt.Color.blue));

        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel8.setText("SEMESTRE 2");

        programacion1.setText("Programación I");
        programacion1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                programacion1MouseClicked(evt);
            }
        });

        Caldiferencial.setText("Cálculo diferencial");
        Caldiferencial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CaldiferencialMouseClicked(evt);
            }
        });

        fisica1.setText("Fisica I (Mecánica)");
        fisica1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fisica1MouseClicked(evt);
            }
        });

        argumentativo.setText("Razonamiento argumentativo ");
        argumentativo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                argumentativoMouseClicked(evt);
            }
        });

        estadistica.setText("Estadística, probabilidad e inferencia");
        estadistica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                estadisticaMouseClicked(evt);
            }
        });

        pensamientocri1.setText("Comunicación y pensamiento crítico I");
        pensamientocri1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pensamientocri1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(programacion1)
                            .addComponent(jLabel8)
                            .addComponent(Caldiferencial)
                            .addComponent(argumentativo))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fisica1)
                            .addComponent(estadistica)
                            .addComponent(pensamientocri1))
                        .addGap(0, 40, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Caldiferencial)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(programacion1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(argumentativo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fisica1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(estadistica)
                .addGap(5, 5, 5)
                .addComponent(pensamientocri1)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(153, 153, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.blue, java.awt.Color.blue, java.awt.Color.blue, java.awt.Color.blue));

        jLabel15.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel15.setText("SEMESTRE 3");

        programacion2.setText("Programación II");
        programacion2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                programacion2MouseClicked(evt);
            }
        });

        calintegral.setText("Cálculo integral");
        calintegral.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                calintegralMouseClicked(evt);
            }
        });

        ciudadania.setText("Ciudadania del siglo XXI");
        ciudadania.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ciudadaniaMouseClicked(evt);
            }
        });

        fisica2.setText("Física II (optica y ondas)");
        fisica2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fisica2MouseClicked(evt);
            }
        });

        ingles1.setText("Ingles I");
        ingles1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ingles1MouseClicked(evt);
            }
        });

        comunicacion2.setText("Comunicación y pensamiento crítico II");
        comunicacion2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comunicacion2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(programacion2)
                            .addComponent(jLabel15)
                            .addComponent(calintegral)
                            .addComponent(fisica2))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ciudadania)
                            .addComponent(comunicacion2)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(ingles1)))
                        .addGap(0, 34, Short.MAX_VALUE))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(calintegral)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(programacion2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fisica2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ciudadania)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ingles1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comunicacion2)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(153, 153, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.blue, java.awt.Color.blue, java.awt.Color.blue, java.awt.Color.blue));

        algebralineal.setText("Álgebra lineal");
        algebralineal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                algebralinealMouseClicked(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel23.setText("SEMESTRE 1");

        pensamientoal.setText("Pensamiento algorítmico");
        pensamientoal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pensamientoalMouseClicked(evt);
            }
        });

        fundamentoselectronica.setText("Fundamentos de electrónica");
        fundamentoselectronica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fundamentoselectronicaMouseClicked(evt);
            }
        });

        fundamentosing.setText("Fundamentos de ingeniería");
        fundamentosing.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fundamentosingMouseClicked(evt);
            }
        });

        discretas.setText("Matemáticas discretas");
        discretas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                discretasMouseClicked(evt);
            }
        });

        pensamientosistemico.setText("Pensamiento sistémico y automatización");
        pensamientosistemico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pensamientosistemicoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel23)
                    .addComponent(algebralineal)
                    .addComponent(pensamientoal)
                    .addComponent(fundamentoselectronica)
                    .addComponent(fundamentosing)
                    .addComponent(discretas)
                    .addComponent(pensamientosistemico))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(algebralineal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pensamientoal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fundamentoselectronica)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fundamentosing)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(discretas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pensamientosistemico)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(153, 153, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.blue, java.awt.Color.blue, java.awt.Color.blue, java.awt.Color.blue));

        ecuadiferenciales.setText("Ecuaciones diferenciales");
        ecuadiferenciales.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ecuadiferencialesMouseClicked(evt);
            }
        });

        jLabel30.setBackground(new java.awt.Color(153, 153, 255));
        jLabel30.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel30.setText("SEMESTRE 5");

        ingsoftware.setText("Ingenieria de software I");
        ingsoftware.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ingsoftwareMouseClicked(evt);
            }
        });

        operativos.setText("Sistemas operativos");
        operativos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                operativosMouseClicked(evt);
            }
        });

        sisinformacion.setText("Sistemas de información");
        sisinformacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sisinformacionMouseClicked(evt);
            }
        });

        basesdedatos.setText("Bases de datos ");
        basesdedatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                basesdedatosMouseClicked(evt);
            }
        });

        planeacionestrategica.setText("Planeacion estrategica");
        planeacionestrategica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                planeacionestrategicaMouseClicked(evt);
            }
        });

        ingles3.setText("Ingles III");
        ingles3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ingles3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel30)
                    .addComponent(ecuadiferenciales)
                    .addComponent(ingsoftware)
                    .addComponent(operativos)
                    .addComponent(sisinformacion)
                    .addComponent(basesdedatos)
                    .addComponent(planeacionestrategica)
                    .addComponent(ingles3))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ecuadiferenciales)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ingsoftware)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(operativos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sisinformacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(basesdedatos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(planeacionestrategica)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ingles3))
        );

        jPanel7.setBackground(new java.awt.Color(153, 153, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.blue, java.awt.Color.blue, java.awt.Color.blue, java.awt.Color.blue));

        matespeciales.setText("Matematicas especiales");
        matespeciales.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                matespecialesMouseClicked(evt);
            }
        });

        jLabel37.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel37.setText("SEMESTRE 6");

        ingsoftware2.setText("Ingenieria de software II");
        ingsoftware2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ingsoftware2MouseClicked(evt);
            }
        });

        comudatos.setText("Comunicacion de datos ");
        comudatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comudatosMouseClicked(evt);
            }
        });

        networking.setText("Networking");
        networking.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                networkingMouseClicked(evt);
            }
        });

        catedra.setText("Catedra generacion de XXI  ");
        catedra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                catedraMouseClicked(evt);
            }
        });

        emprendimiento.setText("Emprendimiento");
        emprendimiento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                emprendimientoMouseClicked(evt);
            }
        });

        ingles4.setText("Ingles IV");
        ingles4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ingles4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel37)
                    .addComponent(matespeciales)
                    .addComponent(ingsoftware2)
                    .addComponent(comudatos)
                    .addComponent(networking)
                    .addComponent(emprendimiento)
                    .addComponent(ingles4)
                    .addComponent(catedra))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel37)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(matespeciales)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ingsoftware2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comudatos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(networking)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(catedra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(emprendimiento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ingles4)
                .addGap(18, 18, 18))
        );

        jPanel8.setBackground(new java.awt.Color(153, 153, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.blue, java.awt.Color.blue, java.awt.Color.blue, java.awt.Color.blue));

        analisisnum.setText("Analisis numerico");
        analisisnum.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                analisisnumMouseClicked(evt);
            }
        });

        jLabel46.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel46.setText("SEMESTRE 7");

        operativa.setText("operativa");
        operativa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                operativaMouseClicked(evt);
            }
        });

        redesycomunicacion.setText("Redes y comunicacion");
        redesycomunicacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                redesycomunicacionMouseClicked(evt);
            }
        });

        cienciadedtaos.setText("ciencia de datos ");
        cienciadedtaos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cienciadedtaosMouseClicked(evt);
            }
        });

        seginformatica.setText("Seguridad informatica");
        seginformatica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                seginformaticaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel46)
                    .addComponent(analisisnum)
                    .addComponent(redesycomunicacion)
                    .addComponent(cienciadedtaos)
                    .addComponent(seginformatica)
                    .addComponent(operativa))
                .addContainerGap(97, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel46)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(analisisnum)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(operativa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(redesycomunicacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cienciadedtaos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(seginformatica, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel9.setBackground(new java.awt.Color(153, 153, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.blue, java.awt.Color.blue, java.awt.Color.blue, java.awt.Color.blue));

        artificial.setText("Inteligencia artificial");
        artificial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                artificialMouseClicked(evt);
            }
        });

        jLabel53.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel53.setText("SEMESTRE 8");

        automatas.setText("lenguajes automatas");
        automatas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                automatasMouseClicked(evt);
            }
        });

        profundizacion1.setText("profundizacion I");
        profundizacion1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                profundizacion1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel53)
                    .addComponent(artificial)
                    .addComponent(automatas)
                    .addComponent(profundizacion1))
                .addContainerGap(107, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel53)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(artificial)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(automatas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(profundizacion1)
                .addContainerGap(71, Short.MAX_VALUE))
        );

        jPanel10.setBackground(new java.awt.Color(153, 153, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.blue, java.awt.Color.blue, java.awt.Color.blue, java.awt.Color.blue));

        gerencia.setText("Gerencia de proyectos ");
        gerencia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gerenciaMouseClicked(evt);
            }
        });

        jLabel57.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel57.setText("SEMESTRE 9");

        modelacion.setText("modelacion");
        modelacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modelacionMouseClicked(evt);
            }
        });

        profundizacion2.setText("profundizacion Il");
        profundizacion2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                profundizacion2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel57)
                    .addComponent(gerencia)
                    .addComponent(modelacion)
                    .addComponent(profundizacion2))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel57)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gerencia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(modelacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(profundizacion2)
                .addContainerGap(114, Short.MAX_VALUE))
        );

        jPanel11.setBackground(new java.awt.Color(153, 153, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Volver");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
        );

        jPanel13.setBackground(new java.awt.Color(102, 102, 255));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/imagenes/ususario.jpg"))); // NOI18N
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe Print", 3, 18)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("TUTO DEC");

        nombreL.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        nombreL.setText(this.nombre);
        nombreL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nombreLMouseClicked(evt);
            }
        });

        materia.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        materia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        materia.setText("ESCOGE LA MATERIA QUE QUIERES ORIENTAR");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nombreL, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(materia, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(materia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(nombreL, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/imagenes/escudo.jpg"))); // NOI18N

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("VER COMENTARIOS");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addContainerGap())))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jLabel13)
                                .addGap(52, 52, 52)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19))))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void calmultivariadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calmultivariadoMouseClicked
        infoDocente info = new infoDocente ("Calculo multivariado ",this.nombre,this.idUsuario);
        info.setVisible(true);
        dispose();
    }//GEN-LAST:event_calmultivariadoMouseClicked

    private void algebralinealMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_algebralinealMouseClicked
        infoDocente info = new infoDocente ("algebra lineal",this.nombre,this.idUsuario);
        info.setVisible(true);
        dispose();
    }//GEN-LAST:event_algebralinealMouseClicked

    private void pensamientoalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pensamientoalMouseClicked
       infoDocente info = new infoDocente ("Pensamiento algoritmico",this.nombre,this.idUsuario);
        info.setVisible(true);
        dispose();
    }//GEN-LAST:event_pensamientoalMouseClicked

    private void fundamentoselectronicaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fundamentoselectronicaMouseClicked
         infoDocente info = new infoDocente ("Fundamentos de electronica",this.nombre,this.idUsuario);
        info.setVisible(true);
        dispose();
    }//GEN-LAST:event_fundamentoselectronicaMouseClicked

    private void fundamentosingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fundamentosingMouseClicked
         infoDocente info = new infoDocente ("Fundamentos de ingenieria",this.nombre,this.idUsuario);
        info.setVisible(true);
        dispose();
    }//GEN-LAST:event_fundamentosingMouseClicked

    private void discretasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_discretasMouseClicked
         infoDocente info = new infoDocente ("Matematicas discretas",this.nombre,this.idUsuario);
        info.setVisible(true);
        dispose();
    }//GEN-LAST:event_discretasMouseClicked

    private void pensamientosistemicoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pensamientosistemicoMouseClicked
         infoDocente info = new infoDocente ("Pensamiento sistemico y automatizacion",this.nombre,this.idUsuario);
        info.setVisible(true);
        dispose();
    }//GEN-LAST:event_pensamientosistemicoMouseClicked

    private void ecuadiferencialesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ecuadiferencialesMouseClicked
         infoDocente info = new infoDocente ("Ecuaciones diferenciales",this.nombre,this.idUsuario);
        info.setVisible(true);
        dispose();
    }//GEN-LAST:event_ecuadiferencialesMouseClicked

    private void ingles3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingles3MouseClicked
        infoDocente info = new infoDocente ("Ingles III",this.nombre,this.idUsuario);
        info.setVisible(true);
        dispose();
    }//GEN-LAST:event_ingles3MouseClicked

    private void matespecialesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_matespecialesMouseClicked
       infoDocente info = new infoDocente ("Matematicas especiales",this.nombre,this.idUsuario);
        info.setVisible(true);
        dispose();
    }//GEN-LAST:event_matespecialesMouseClicked

    private void analisisnumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_analisisnumMouseClicked
         infoDocente info = new infoDocente ("Analisis numerico",this.nombre,this.idUsuario);
        info.setVisible(true);
        dispose();
    }//GEN-LAST:event_analisisnumMouseClicked

    private void artificialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_artificialMouseClicked
         infoDocente info = new infoDocente ("Inteligencia Artificial",this.nombre,this.idUsuario);
        info.setVisible(true);
        dispose();
    }//GEN-LAST:event_artificialMouseClicked

    private void gerenciaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gerenciaMouseClicked
         infoDocente info = new infoDocente ("Gerencia de proyectos",this.nombre,this.idUsuario);
        info.setVisible(true);
        dispose();
    }//GEN-LAST:event_gerenciaMouseClicked

    private void fisica3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fisica3MouseClicked
    infoDocente info = new infoDocente ("Fisica (electricidad y magnestismo)",this.nombre,this.idUsuario);
        info.setVisible(true);
        dispose();
    }//GEN-LAST:event_fisica3MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
       inicio inicio = new inicio();
        inicio.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void CaldiferencialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CaldiferencialMouseClicked
    infoDocente info = new infoDocente ("Calculo diferencial",this.nombre,this.idUsuario);
        info.setVisible(true);
        dispose();
    }//GEN-LAST:event_CaldiferencialMouseClicked

    private void programacion1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_programacion1MouseClicked
    infoDocente info = new infoDocente ("Programacion I",this.nombre,this.idUsuario);
        info.setVisible(true);
        dispose();
    }//GEN-LAST:event_programacion1MouseClicked

    private void argumentativoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_argumentativoMouseClicked
    infoDocente info = new infoDocente ("Razonamiento argumentativo",this.nombre,this.idUsuario);
        info.setVisible(true);
        dispose();
    }//GEN-LAST:event_argumentativoMouseClicked

    private void fisica1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fisica1MouseClicked
    infoDocente info = new infoDocente ("Fisica (mecanica)",this.nombre,this.idUsuario);
        info.setVisible(true);
        dispose();
    }//GEN-LAST:event_fisica1MouseClicked

    private void estadisticaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_estadisticaMouseClicked
    infoDocente info = new infoDocente ("Estadistica probabilidad e inferencia ",this.nombre,this.idUsuario);
        info.setVisible(true);
        dispose();
    }//GEN-LAST:event_estadisticaMouseClicked

    private void pensamientocri1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pensamientocri1MouseClicked
    infoDocente info = new infoDocente ("Comunicacion y pensamiento critico I",this.nombre,this.idUsuario);
        info.setVisible(true);
        dispose();
    }//GEN-LAST:event_pensamientocri1MouseClicked

    private void calintegralMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calintegralMouseClicked
     infoDocente info = new infoDocente ("Calculo integral",this.nombre,this.idUsuario);
        info.setVisible(true);
        dispose();
    }//GEN-LAST:event_calintegralMouseClicked

    private void programacion2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_programacion2MouseClicked
    infoDocente info = new infoDocente ("Programacion II",this.nombre,this.idUsuario);
        info.setVisible(true);
        dispose();
    }//GEN-LAST:event_programacion2MouseClicked

    private void fisica2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fisica2MouseClicked
    infoDocente info = new infoDocente ("Fisica (optica y ondas)",this.nombre,this.idUsuario);
        info.setVisible(true);
        dispose();
    }//GEN-LAST:event_fisica2MouseClicked

    private void ciudadaniaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ciudadaniaMouseClicked
    infoDocente info = new infoDocente ("Ciudadania del siglo XXI",this.nombre,this.idUsuario);
        info.setVisible(true);
        dispose();
    }//GEN-LAST:event_ciudadaniaMouseClicked

    private void ingles1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingles1MouseClicked
    infoDocente info = new infoDocente ("Ingles I",this.nombre,this.idUsuario);
        info.setVisible(true);
        dispose();
    }//GEN-LAST:event_ingles1MouseClicked

    private void comunicacion2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comunicacion2MouseClicked
    infoDocente info = new infoDocente ("Comunicacion y pensamiento critico II",this.nombre,this.idUsuario);
        info.setVisible(true);
        dispose();
    }//GEN-LAST:event_comunicacion2MouseClicked

    private void estructurasinfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_estructurasinfoMouseClicked
    infoDocente info = new infoDocente ("Estructuras de informacion",this.nombre,this.idUsuario);
        info.setVisible(true);
        dispose();
    }//GEN-LAST:event_estructurasinfoMouseClicked

    private void arquitecturaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_arquitecturaMouseClicked
    infoDocente info = new infoDocente ("Arquitectura de computadores",this.nombre,this.idUsuario);
        info.setVisible(true);
        dispose();
    }//GEN-LAST:event_arquitecturaMouseClicked

    private void fundamentosadmiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fundamentosadmiMouseClicked
    infoDocente info = new infoDocente ("Fundamentos administrativos",this.nombre,this.idUsuario);
        info.setVisible(true);
        dispose();
    }//GEN-LAST:event_fundamentosadmiMouseClicked

    private void ingles2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingles2MouseClicked
    infoDocente info = new infoDocente ("Ingles II",this.nombre,this.idUsuario);
        info.setVisible(true);
        dispose();
    }//GEN-LAST:event_ingles2MouseClicked

    private void ingsoftwareMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingsoftwareMouseClicked
    infoDocente info = new infoDocente ("Ingenieria de software I",this.nombre,this.idUsuario);
        info.setVisible(true);
        dispose();
    }//GEN-LAST:event_ingsoftwareMouseClicked

    private void operativosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_operativosMouseClicked
    infoDocente info = new infoDocente ("Sistemas operativos",this.nombre,this.idUsuario);
        info.setVisible(true);
        dispose();
    }//GEN-LAST:event_operativosMouseClicked

    private void sisinformacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sisinformacionMouseClicked
    infoDocente info = new infoDocente ("Sistemas de informacion",this.nombre,this.idUsuario);
        info.setVisible(true);
        dispose();
    }//GEN-LAST:event_sisinformacionMouseClicked

    private void basesdedatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_basesdedatosMouseClicked
     infoDocente info = new infoDocente ("Bases de datos",this.nombre,this.idUsuario);
        info.setVisible(true);
        dispose();
    }//GEN-LAST:event_basesdedatosMouseClicked

    private void planeacionestrategicaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_planeacionestrategicaMouseClicked
    infoDocente info = new infoDocente ("Planeacion estrategica",this.nombre,this.idUsuario);
        info.setVisible(true);
        dispose();
    }//GEN-LAST:event_planeacionestrategicaMouseClicked

    private void ingsoftware2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingsoftware2MouseClicked
    infoDocente info = new infoDocente ("Ingenieria de software II",this.nombre,this.idUsuario);
        info.setVisible(true);
        dispose();
    }//GEN-LAST:event_ingsoftware2MouseClicked

    private void comudatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comudatosMouseClicked
    infoDocente info = new infoDocente ("Comunicacion de datos",this.nombre,this.idUsuario);
        info.setVisible(true);
        dispose();
    }//GEN-LAST:event_comudatosMouseClicked

    private void networkingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_networkingMouseClicked
    infoDocente info = new infoDocente ("Networking",this.nombre,this.idUsuario);
        info.setVisible(true);
        dispose();
    }//GEN-LAST:event_networkingMouseClicked

    private void catedraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_catedraMouseClicked
    infoDocente info = new infoDocente ("Catedra generacion siglo XXI",this.nombre,this.idUsuario);
        info.setVisible(true);
        dispose();
    }//GEN-LAST:event_catedraMouseClicked

    private void emprendimientoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emprendimientoMouseClicked
    infoDocente info = new infoDocente ("Emprendimiento",this.nombre,this.idUsuario);
        info.setVisible(true);
        dispose();
    }//GEN-LAST:event_emprendimientoMouseClicked

    private void ingles4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingles4MouseClicked
    infoDocente info = new infoDocente ("Ingles IV",this.nombre,this.idUsuario);
        info.setVisible(true);
        dispose();
    }//GEN-LAST:event_ingles4MouseClicked

    private void operativaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_operativaMouseClicked
    infoDocente info = new infoDocente ("Operativa",this.nombre,this.idUsuario);
        info.setVisible(true);
        dispose();
    }//GEN-LAST:event_operativaMouseClicked

    private void redesycomunicacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_redesycomunicacionMouseClicked
    infoDocente info = new infoDocente ("Redes y comunicacion",this.nombre,this.idUsuario);
        info.setVisible(true);
        dispose();
    }//GEN-LAST:event_redesycomunicacionMouseClicked

    private void cienciadedtaosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cienciadedtaosMouseClicked
    infoDocente info = new infoDocente ("Ciencia de datos",this.nombre,this.idUsuario);
        info.setVisible(true);
        dispose();
    }//GEN-LAST:event_cienciadedtaosMouseClicked

    private void seginformaticaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seginformaticaMouseClicked
    infoDocente info = new infoDocente ("Seguridad informatica",this.nombre,this.idUsuario);
        info.setVisible(true);
        dispose();
    }//GEN-LAST:event_seginformaticaMouseClicked

    private void automatasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_automatasMouseClicked
     infoDocente info = new infoDocente ("Lenguajes automatas",this.nombre,this.idUsuario);
        info.setVisible(true);
        dispose();
    }//GEN-LAST:event_automatasMouseClicked

    private void profundizacion1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profundizacion1MouseClicked
    infoDocente info = new infoDocente ("Profundizacion I",this.nombre,this.idUsuario);
        info.setVisible(true);
        dispose();
    }//GEN-LAST:event_profundizacion1MouseClicked

    private void modelacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modelacionMouseClicked
    infoDocente info = new infoDocente ("Modelacion",this.nombre,this.idUsuario);
        info.setVisible(true);
        dispose();
    }//GEN-LAST:event_modelacionMouseClicked

    private void profundizacion2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profundizacion2MouseClicked
   infoDocente info = new infoDocente ("Profundizacion II",this.nombre,this.idUsuario);
        info.setVisible(true);
        dispose();
    }//GEN-LAST:event_profundizacion2MouseClicked

    private void nombreLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombreLMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreLMouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        try {
        // Obtener la conexión usando tu clase 'conexion'
        Connection conn = conexion.obtenerconexion();

        if (conn != null) {
            // Consulta SQL para obtener los datos del usuario logueado
            String sql = "SELECT nombreUsuario, apellidoUsuario, correoUsuario, Usuario, Rol FROM registro WHERE id = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);

            // Supongamos que ya tienes el ID del usuario logueado
            stmt.setInt(1, this.idUsuario); // Método para obtener el ID del usuario logueado

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                // Extraer los datos del usuario de la consulta
                String nombre = rs.getString("nombreUsuario");
                String apellido = rs.getString("apellidoUsuario");
                String correo = rs.getString("correoUsuario");
                String usuario = rs.getString("Usuario");
                String rol = rs.getString("Rol");

                // Crear el JFrame y pasarle los datos
                PerfilUsuarioFrame perfilFrame = new PerfilUsuarioFrame(nombre, apellido, correo, usuario, rol);
                perfilFrame.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "No se encontraron datos para el usuario.");
            }

            // Cerrar conexiones
            rs.close();
            stmt.close();
            conn.close();
        } else {
            JOptionPane.showMessageDialog(this, "Error al conectar con la base de datos.");
        }
    } catch (SQLException ex) {
       
        JOptionPane.showMessageDialog(this, "Error al obtener los datos del usuario: " + ex.getMessage());
    }
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
      ComentariosProfesorFrame comentarios = new ComentariosProfesorFrame(this.nombre,this.idUsuario);
       comentarios.setVisible(true);
       dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Caldiferencial;
    private javax.swing.JLabel algebralineal;
    private javax.swing.JLabel analisisnum;
    private javax.swing.JLabel argumentativo;
    private javax.swing.JLabel arquitectura;
    private javax.swing.JLabel artificial;
    private javax.swing.JLabel automatas;
    private javax.swing.JLabel basesdedatos;
    private javax.swing.JLabel calintegral;
    private javax.swing.JLabel calmultivariado;
    private javax.swing.JLabel catedra;
    private javax.swing.JLabel cienciadedtaos;
    private javax.swing.JLabel ciudadania;
    private javax.swing.JLabel comudatos;
    private javax.swing.JLabel comunicacion2;
    private javax.swing.JLabel discretas;
    private javax.swing.JLabel ecuadiferenciales;
    private javax.swing.JLabel emprendimiento;
    private javax.swing.JLabel estadistica;
    private javax.swing.JLabel estructurasinfo;
    private javax.swing.JLabel fisica1;
    private javax.swing.JLabel fisica2;
    private javax.swing.JLabel fisica3;
    private javax.swing.JLabel fundamentosadmi;
    private javax.swing.JLabel fundamentoselectronica;
    private javax.swing.JLabel fundamentosing;
    private javax.swing.JLabel gerencia;
    private javax.swing.JLabel ingles1;
    private javax.swing.JLabel ingles2;
    private javax.swing.JLabel ingles3;
    private javax.swing.JLabel ingles4;
    private javax.swing.JLabel ingsoftware;
    private javax.swing.JLabel ingsoftware2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel materia;
    private javax.swing.JLabel matespeciales;
    private javax.swing.JLabel modelacion;
    private javax.swing.JLabel networking;
    private javax.swing.JLabel nombreL;
    private javax.swing.JLabel operativa;
    private javax.swing.JLabel operativos;
    private javax.swing.JLabel pensamientoal;
    private javax.swing.JLabel pensamientocri1;
    private javax.swing.JLabel pensamientosistemico;
    private javax.swing.JLabel planeacionestrategica;
    private javax.swing.JLabel profundizacion1;
    private javax.swing.JLabel profundizacion2;
    private javax.swing.JLabel programacion1;
    private javax.swing.JLabel programacion2;
    private javax.swing.JLabel redesycomunicacion;
    private javax.swing.JLabel seginformatica;
    private javax.swing.JLabel sisinformacion;
    // End of variables declaration//GEN-END:variables
}
