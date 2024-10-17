
package com.inicio;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class conexion {
    public static Connection obtenerconexion(){
        String url = "jdbc:mysql://localhost:3306/tuto_dec;"
               +"database = tuto_dec"
               +"user = root;" 
               +"password = 12345;";
        
        
        try {
            Connection con = DriverManager.getConnection(url);
            return con;
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            return null;
            
        }
            
        
               
    
    }
     
    
    
}
