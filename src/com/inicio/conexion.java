
package com.inicio;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class conexion {
   
       public static Connection obtenerconexion() {
        Connection con = null;
        String url = "jdbc:mysql://localhost:3306/tutodec1"; // La URL de la base de datos
        String usuario = "root"; // El usuario de la base de datos
        String contraseña = "12345"; // La contraseña de la base de datos

        try {
            // Carga del driver de MySQL (puede variar según tu base de datos)
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, usuario, contraseña);
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Error en la conexión: " + ex.getMessage());
        }
        return con;
    }

    static PreparedStatement prepareStatement(String sql) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
            
        
               
    
    
     
    
    

