/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import javax.swing.ImageIcon;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class datos_clientes extends javax.swing.JFrame {

    conexion cn = new conexion();
    Connection cnn = cn.conectar();
    DefaultTableModel crp;

    public datos_clientes() {

        initComponents();
        this.setExtendedState(datos_clientes.MAXIMIZED_BOTH);
        this.crp = (DefaultTableModel) clrp_tbl.getModel();
        cargar();
    }

    //REFRESCAR LA TABLA
    public void refrescar() {

        try {
            crp.setColumnCount(0);
            crp.setRowCount(0);
            clrp_tbl.revalidate();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error " + ex);
        }

    }

    //MOSTRAR LOS DATOS EN LA TABLA
    public void cargar() {

        refrescar();

        crp.addColumn("Id");
        crp.addColumn("RNC");
        crp.addColumn("Nombre");
        crp.addColumn("Teléfono");
        crp.addColumn("Dirección");
        crp.addColumn("Cédula del representante");
        crp.addColumn("Nombre");
        crp.addColumn("Apellido");

        this.clrp_tbl.setModel(crp);
        String consul;
        consul = "SELECT * FROM `datos_cliente_rep`";

        String[] datos = new String[8];
        try {
            Statement st = cnn.createStatement();
            ResultSet rs = st.executeQuery(consul);
            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                datos[5] = rs.getString(6);
                datos[6] = rs.getString(7);
                datos[7] = rs.getString(8);

                crp.addRow(datos);

            }

            clrp_tbl.setModel(crp);
        } catch (SQLException ex) {
            Logger.getLogger(log_form.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "error " + ex);

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        azul_pnl = new javax.swing.JPanel();
        blanco_pnl = new javax.swing.JPanel();
        gm_lbl = new javax.swing.JLabel();
        titulo_tabla_lbl = new javax.swing.JLabel();
        atras_lbl = new javax.swing.JLabel();
        scroll = new javax.swing.JScrollPane();
        clrp_tbl = new javax.swing.JTable();
        rnc_lbl = new javax.swing.JLabel();
        rnc_txt = new javax.swing.JTextField();
        borrar_btn = new javax.swing.JButton();
        cedula_lbl = new javax.swing.JLabel();
        cedula_txt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconImage(new ImageIcon(getClass().getResource("/imgs/logo.png")).getImage());

        azul_pnl.setBackground(new java.awt.Color(8, 41, 138));

        blanco_pnl.setBackground(new java.awt.Color(255, 255, 255));

        gm_lbl.setFont(new java.awt.Font("Candara Light", 1, 24)); // NOI18N
        gm_lbl.setForeground(new java.awt.Color(0, 0, 102));
        gm_lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/logo - 24x24.png"))); // NOI18N
        gm_lbl.setText("Grupo M");

        titulo_tabla_lbl.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        titulo_tabla_lbl.setForeground(new java.awt.Color(0, 0, 102));
        titulo_tabla_lbl.setText("Datos del cliente y su representante legal");

        atras_lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_undo_24px.png"))); // NOI18N
        atras_lbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                atras_lblMouseClicked(evt);
            }
        });

        clrp_tbl.setBackground(new java.awt.Color(255, 255, 255));
        clrp_tbl.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        clrp_tbl.setForeground(new java.awt.Color(0, 0, 0));
        clrp_tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        clrp_tbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clrp_tblMouseClicked(evt);
            }
        });
        scroll.setViewportView(clrp_tbl);

        rnc_lbl.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        rnc_lbl.setForeground(new java.awt.Color(0, 0, 102));
        rnc_lbl.setText("RNC");

        rnc_txt.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        rnc_txt.setForeground(new java.awt.Color(0, 0, 0));
        rnc_txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        rnc_txt.setEnabled(false);
        rnc_txt.setOpaque(false);

        borrar_btn.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        borrar_btn.setForeground(new java.awt.Color(153, 0, 0));
        borrar_btn.setText("BORRAR");
        borrar_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        borrar_btn.setContentAreaFilled(false);
        borrar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrar_btnActionPerformed(evt);
            }
        });

        cedula_lbl.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        cedula_lbl.setForeground(new java.awt.Color(0, 0, 102));
        cedula_lbl.setText("Representante");

        cedula_txt.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        cedula_txt.setForeground(new java.awt.Color(0, 0, 0));
        cedula_txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        cedula_txt.setEnabled(false);
        cedula_txt.setOpaque(false);

        javax.swing.GroupLayout blanco_pnlLayout = new javax.swing.GroupLayout(blanco_pnl);
        blanco_pnl.setLayout(blanco_pnlLayout);
        blanco_pnlLayout.setHorizontalGroup(
            blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(blanco_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(blanco_pnlLayout.createSequentialGroup()
                        .addComponent(gm_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(titulo_tabla_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(atras_lbl))
                    .addGroup(blanco_pnlLayout.createSequentialGroup()
                        .addComponent(scroll, javax.swing.GroupLayout.DEFAULT_SIZE, 733, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(blanco_pnlLayout.createSequentialGroup()
                                .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rnc_txt)
                                    .addGroup(blanco_pnlLayout.createSequentialGroup()
                                        .addComponent(rnc_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(143, 143, 143)))
                                .addGap(6, 6, 6))
                            .addComponent(cedula_txt)
                            .addGroup(blanco_pnlLayout.createSequentialGroup()
                                .addComponent(cedula_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(143, 143, 143))
                            .addComponent(borrar_btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        blanco_pnlLayout.setVerticalGroup(
            blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(blanco_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(gm_lbl)
                        .addComponent(titulo_tabla_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(atras_lbl))
                .addGap(6, 6, 6)
                .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scroll, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
                    .addGroup(blanco_pnlLayout.createSequentialGroup()
                        .addComponent(rnc_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rnc_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cedula_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cedula_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(borrar_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
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

    private void atras_lblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atras_lblMouseClicked
        //PANTALLA DE VENTAS
        ventas frame = new ventas();
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_atras_lblMouseClicked

    private void borrar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrar_btnActionPerformed
        //BORRAR CLIENTE
        String queryrep = "DELETE FROM representante_legal_cliente WHERE cedula_representante = '" + cedula_txt.getText() + "'";
        String querycli = "DELETE FROM cliente WHERE rnc_cliente = '" + rnc_txt.getText() + "'";

        try {
            PreparedStatement elrep = cnn.prepareStatement(queryrep);
            PreparedStatement elcli = cnn.prepareStatement(querycli);
            elrep.executeUpdate();
            elcli.executeUpdate();
            JOptionPane.showMessageDialog(null, "Eliminado");

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "error " + ex);
        }
    }//GEN-LAST:event_borrar_btnActionPerformed

    private void clrp_tblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clrp_tblMouseClicked
        //LLENAR TXT
        try {
            String cli = (String) crp.getValueAt(clrp_tbl.getSelectedRow(), 1);
            String rep = (String) crp.getValueAt(clrp_tbl.getSelectedRow(), 5);
            rnc_txt.setText(cli);
            cedula_txt.setText(rep);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "error " + ex);
        }
    }//GEN-LAST:event_clrp_tblMouseClicked

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
            java.util.logging.Logger.getLogger(datos_clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(datos_clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(datos_clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(datos_clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new datos_clientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel atras_lbl;
    private javax.swing.JPanel azul_pnl;
    private javax.swing.JPanel blanco_pnl;
    private javax.swing.JButton borrar_btn;
    private javax.swing.JLabel cedula_lbl;
    private javax.swing.JTextField cedula_txt;
    private javax.swing.JTable clrp_tbl;
    private javax.swing.JLabel gm_lbl;
    private javax.swing.JLabel rnc_lbl;
    private javax.swing.JTextField rnc_txt;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JLabel titulo_tabla_lbl;
    // End of variables declaration//GEN-END:variables
}
