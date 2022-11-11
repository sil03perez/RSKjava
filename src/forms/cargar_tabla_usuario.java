/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package forms;

import static forms.administrador.usuarios_tbl;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
 
//ola
public class cargar_tabla_usuario {
    public static Connection cnn = conexion.conectar();
     public static DefaultTableModel user;
    public static void refrescar() {
        try {
            user.setColumnCount(0);
            user.setRowCount(0);
            usuarios_tbl.revalidate();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error " + ex);
        }
    }
    
     public static void cargar() {
        refrescar();
        user.addColumn("Código");
        user.addColumn("Empleado");
        user.addColumn("Usuario");
        user.addColumn("Clave");
        user.addColumn("Acceso");

        administrador.usuarios_tbl.setModel(user);
        String consul;
        consul = "SELECT * FROM usuario";

        String[] datos = new String[6];
        try {
            Statement st = cnn.createStatement();
            ResultSet rs = st.executeQuery(consul);
            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);

                user.addRow(datos);

            }

            administrador.usuarios_tbl.setModel(user);
        } catch (SQLException ex) {
            Logger.getLogger(log_form.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "error " + ex);
        }

    }
}
