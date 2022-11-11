/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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

/**
 *
 * @author Admin
 */
public class dptos_2 extends javax.swing.JFrame {

    DefaultTableModel depto;
    conexion cn = new conexion();
    Connection cnn = cn.conectar();

    /**
     * Creates new form dptos_2
     */
    public dptos_2() {
        initComponents();
        this.depto = (DefaultTableModel) dptos_tbl.getModel();
        cargar();
    }

    //MOSTRAR LOS DEPARTAMENTOS
    public void cargar() {
        ref();

        depto.addColumn("Nombre");

        this.dptos_tbl.setModel(depto);
        String consul;
        consul = "SELECT nombre_dpto FROM departamento;";

        String[] datos = new String[1];
        try {
            Statement st = cnn.createStatement();
            ResultSet rs = st.executeQuery(consul);
            while (rs.next()) {
                datos[0] = rs.getString(1);
                depto.addRow(datos);

            }

            dptos_tbl.setModel(depto);
        } catch (SQLException ex) {
            Logger.getLogger(log_form.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "error " + ex);
        }

    }

    //METODO PARA REFRESCAR
    public void ref() {
        try {
            depto.setColumnCount(0);
            depto.setRowCount(0);
            dptos_tbl.revalidate();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error " + ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        azul_pnl = new javax.swing.JPanel();
        blanco_pnl = new javax.swing.JPanel();
        dptos_scroll = new javax.swing.JScrollPane();
        dptos_tbl = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconImage(new ImageIcon(getClass().getResource("/imgs/logo.png")).getImage());
        setLocationByPlatform(true);

        azul_pnl.setBackground(new java.awt.Color(8, 41, 138));

        blanco_pnl.setBackground(new java.awt.Color(255, 255, 255));

        dptos_tbl.setBackground(new java.awt.Color(255, 255, 255));
        dptos_tbl.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        dptos_tbl.setForeground(new java.awt.Color(0, 0, 0));
        dptos_tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        dptos_tbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dptos_tblMouseClicked(evt);
            }
        });
        dptos_scroll.setViewportView(dptos_tbl);

        javax.swing.GroupLayout blanco_pnlLayout = new javax.swing.GroupLayout(blanco_pnl);
        blanco_pnl.setLayout(blanco_pnlLayout);
        blanco_pnlLayout.setHorizontalGroup(
            blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(blanco_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dptos_scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        blanco_pnlLayout.setVerticalGroup(
            blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(blanco_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dptos_scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout azul_pnlLayout = new javax.swing.GroupLayout(azul_pnl);
        azul_pnl.setLayout(azul_pnlLayout);
        azul_pnlLayout.setHorizontalGroup(
            azul_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(azul_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(blanco_pnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        azul_pnlLayout.setVerticalGroup(
            azul_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(azul_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(blanco_pnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(azul_pnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(azul_pnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dptos_tblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dptos_tblMouseClicked
        //LLENAR DPTO EN CARGO
        try {

            String nom = (String) depto.getValueAt(dptos_tbl.getSelectedRow(), 0);

            consult_cargo.dpto_nombre_txt.setText(nom);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "error " + ex);
        }
        this.dispose();
    }//GEN-LAST:event_dptos_tblMouseClicked

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
            java.util.logging.Logger.getLogger(dptos_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dptos_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dptos_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dptos_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dptos_2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel azul_pnl;
    private javax.swing.JPanel blanco_pnl;
    private javax.swing.JScrollPane dptos_scroll;
    private javax.swing.JTable dptos_tbl;
    // End of variables declaration//GEN-END:variables

}
