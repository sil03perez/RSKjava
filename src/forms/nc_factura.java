package forms;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class nc_factura extends javax.swing.JFrame {

    DefaultTableModel notac;
    conexion cn = new conexion();
    Connection cnn = cn.conectar();

    public nc_factura() {
        initComponents();

        this.notac = (DefaultTableModel) datos_nc_tbl.getModel();
        cargar();
    }

    //REFRESCAR LOS DATOS DE LA TABLA
    public void ref() {
        try {
            notac.setColumnCount(0);
            notac.setRowCount(0);
            datos_nc_tbl.revalidate();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error " + ex);
        }
    }

    //CARGAR LOS DATOS DE LA TABLA
    public void cargar() {
        ref();
        notac.addColumn("Factura");
        notac.addColumn("NCF");
        notac.addColumn("Total");
        notac.addColumn("Descuento");
        notac.addColumn("pedido");
        notac.addColumn("Producto");
        notac.addColumn("Cantidad");
        notac.addColumn("precio");
        notac.addColumn("Total pedido");

        this.datos_nc_tbl.setModel(notac);
        String consultageneral = "SELECT nf, nocom, total_factura, descuento, pedido, producto, cantidad, precio, total_pedido FROM bill2;";

        String[] datosg = new String[9];
        try {
            Statement st = cnn.createStatement();
            ResultSet rs = st.executeQuery(consultageneral);
            while (rs.next()) {
                datosg[0] = rs.getString(1);
                datosg[1] = rs.getString(2);
                datosg[2] = rs.getString(3);
                datosg[3] = rs.getString(4);
                datosg[4] = rs.getString(5);
                datosg[5] = rs.getString(6);
                datosg[6] = rs.getString(7);
                datosg[7] = rs.getString(8);
                datosg[8] = rs.getString(9);

                notac.addRow(datosg);

            }

            datos_nc_tbl.setModel(notac);
        } catch (SQLException ex) {
            Logger.getLogger(log_form.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "error " + ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        azul_pnl = new javax.swing.JPanel();
        blanco_pnl = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        datos_nc_tbl = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        azul_pnl.setBackground(new java.awt.Color(0, 0, 102));

        blanco_pnl.setBackground(new java.awt.Color(255, 255, 255));

        datos_nc_tbl.setBackground(new java.awt.Color(255, 255, 255));
        datos_nc_tbl.setFont(new java.awt.Font("Lucida Console", 0, 12)); // NOI18N
        datos_nc_tbl.setForeground(new java.awt.Color(0, 0, 0));
        datos_nc_tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        datos_nc_tbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                datos_nc_tblMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(datos_nc_tbl);

        javax.swing.GroupLayout blanco_pnlLayout = new javax.swing.GroupLayout(blanco_pnl);
        blanco_pnl.setLayout(blanco_pnlLayout);
        blanco_pnlLayout.setHorizontalGroup(
            blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(blanco_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 715, Short.MAX_VALUE)
                .addContainerGap())
        );
        blanco_pnlLayout.setVerticalGroup(
            blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(blanco_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 463, Short.MAX_VALUE)
                .addContainerGap())
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

    private void datos_nc_tblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_datos_nc_tblMouseClicked
        //LLENAR LOS CAMPOS DE NOTA DE CRÉDITO
        try {
            String fact = (String) notac.getValueAt(datos_nc_tbl.getSelectedRow(), 0);
            String ncf = (String) notac.getValueAt(datos_nc_tbl.getSelectedRow(), 1);
            String totf = (String) notac.getValueAt(datos_nc_tbl.getSelectedRow(), 2);
            String descu = (String) notac.getValueAt(datos_nc_tbl.getSelectedRow(), 3);
            String ped = (String) notac.getValueAt(datos_nc_tbl.getSelectedRow(), 4);
            String prod = (String) notac.getValueAt(datos_nc_tbl.getSelectedRow(), 5);
            String cant = (String) notac.getValueAt(datos_nc_tbl.getSelectedRow(), 6);
            String pre = (String) notac.getValueAt(datos_nc_tbl.getSelectedRow(), 7);
            String totp = (String) notac.getValueAt(datos_nc_tbl.getSelectedRow(), 8);

            nota_c.nfv_txt.setText(fact);
            nota_c.ncfv_txt.setText(ncf);
            nota_c.totalv_txt.setText(totf);
            nota_c.descv_txt.setText(descu);
            nota_c.cp_txt.setText(ped);
            nota_c.prod_txt.setText(prod);
            nota_c.cant_txt.setText(cant);
            nota_c.prodct_txt.setText(pre);
            nota_c.tp_txt.setText(totp);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "error " + ex);
        }
        this.dispose();
    }//GEN-LAST:event_datos_nc_tblMouseClicked

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
            java.util.logging.Logger.getLogger(nc_factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(nc_factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(nc_factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(nc_factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new nc_factura().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel azul_pnl;
    private javax.swing.JPanel blanco_pnl;
    private javax.swing.JTable datos_nc_tbl;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
