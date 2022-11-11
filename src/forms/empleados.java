package forms;

import javax.swing.ImageIcon;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class empleados extends javax.swing.JFrame {

    DefaultTableModel emp;
    conexion cn = new conexion();
    Connection cnn = cn.conectar();

    public empleados() {
        initComponents();
        this.emp = (DefaultTableModel) empl_tbl.getModel();
        cargar();
    }

    //MOSTRAR DATOS
    public void cargar() {
        ref();

        emp.addColumn("Id");
        emp.addColumn("Nombre");
        emp.addColumn("Apellido");

        this.empl_tbl.setModel(emp);
        String consul;
        consul = "SELECT Id_empleado, Nombre, Apellido FROM empleado;";

        String[] datos = new String[3];
        try {
            Statement st = cnn.createStatement();
            ResultSet rs = st.executeQuery(consul);
            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                emp.addRow(datos);

            }

            empl_tbl.setModel(emp);
        } catch (SQLException ex) {
            Logger.getLogger(log_form.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "error " + ex);
        }

    }

    public void ref() {
        try {
            emp.setColumnCount(0);
            emp.setRowCount(0);
            empl_tbl.revalidate();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error " + ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        azun_pnl = new javax.swing.JPanel();
        blanco_pnl = new javax.swing.JPanel();
        tabla_scroll = new javax.swing.JScrollPane();
        empl_tbl = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconImage(new ImageIcon(getClass().getResource("/imgs/logo.png")).getImage());

        azun_pnl.setBackground(new java.awt.Color(8, 41, 138));

        blanco_pnl.setBackground(new java.awt.Color(255, 255, 255));

        empl_tbl.setBackground(new java.awt.Color(255, 255, 255));
        empl_tbl.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        empl_tbl.setForeground(new java.awt.Color(0, 0, 0));
        empl_tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        empl_tbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                empl_tblMouseClicked(evt);
            }
        });
        tabla_scroll.setViewportView(empl_tbl);

        javax.swing.GroupLayout blanco_pnlLayout = new javax.swing.GroupLayout(blanco_pnl);
        blanco_pnl.setLayout(blanco_pnlLayout);
        blanco_pnlLayout.setHorizontalGroup(
            blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(blanco_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabla_scroll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        blanco_pnlLayout.setVerticalGroup(
            blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(blanco_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabla_scroll, javax.swing.GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout azun_pnlLayout = new javax.swing.GroupLayout(azun_pnl);
        azun_pnl.setLayout(azun_pnlLayout);
        azun_pnlLayout.setHorizontalGroup(
            azun_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(azun_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(blanco_pnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        azun_pnlLayout.setVerticalGroup(
            azun_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(azun_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(blanco_pnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(azun_pnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(azun_pnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void empl_tblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_empl_tblMouseClicked
        //LLENAR TEXTFIELDS
        try {

            String id = (String) emp.getValueAt(empl_tbl.getSelectedRow(), 0);

            registrar.id_fld.setText(id);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "error " + ex);
        }
        this.dispose();
    }//GEN-LAST:event_empl_tblMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new empleados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel azun_pnl;
    private javax.swing.JPanel blanco_pnl;
    private javax.swing.JTable empl_tbl;
    private javax.swing.JScrollPane tabla_scroll;
    // End of variables declaration//GEN-END:variables

}
