/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Admin
 */
public class conexion {
    
    public static Connection conectar(){
        
       Connection conectar = null;
        
        try{
        Class.forName("com.mysql.jdbc.Driver");
        conectar=DriverManager.getConnection("jdbc:mysql://localhost:3306/grupo_m","root", "");
        //JOptionPane.showMessageDialog(null, "Conexión exitosa", "Conexión a servidor", JOptionPane.INFORMATION_MESSAGE);
        
    }
    catch(ClassNotFoundException | SQLException e){
        
        JOptionPane.showMessageDialog(null, "Conexión fallida " + e, "Conexión", JOptionPane.ERROR_MESSAGE);
        
    }
        
        return conectar;
        
    }
        
}
