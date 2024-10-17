package com.inicio;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JFrame;

/**
 *
 * @author maico
 */
public class main {

    private static final String URL = "jdbc:mysql://localhost:3306/tuto_dec";
    private static final String USER = "root";  // Usuario de la base de datos
    private static final String PASSWORD = "12345";  // Contraseña de la base de datos
    private static Connection conexion = null;
    

    public static void main(String[] args) {

        try {
            // 1. Establecer conexión
            conexion = DriverManager.getConnection(URL, USER, PASSWORD);
            if (conexion != null) {
                System.out.println("Conexión exitosa a la base de datos");
            }
        } catch (SQLException e) {
            // Manejo de errores
            System.out.println("Error al conectarse a la base de datos");
            e.printStackTrace();
        }

        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                inicio inicio = new inicio();
                inicio.addWindowListener(new WindowAdapter() {
                    @Override
                    public void windowClosing(WindowEvent e) {
                        // Imprimir un mensaje cuando se cierra el JFrame
                        System.out.println("El JFrame se está cerrando");
                        
                        // Cerrar la conexión a la base de datos
                        if (conexion != null) {
                            try {
                                conexion.close();
                                System.out.println("Conexión cerrada");
                            } catch (SQLException ex) {
                                System.out.println("Error al cerrar la conexión");
                                ex.printStackTrace();
                            }
                        }
                    }
                });

                inicio.setVisible(true); // Mostrar la ventana
            }
        });
    }
}
