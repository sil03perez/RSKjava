package forms;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class cuentas_pagar extends javax.swing.JFrame {

    DefaultTableModel cp;
    conexion cn = new conexion();
    Connection cnn = cn.conectar();

    public cuentas_pagar() {
        initComponents();
        this.cp = (DefaultTableModel) cp_tbl.getModel();
        cargar();
    }

    //MOSTRAR LAS CUENTAS POR PAGAR
    public void cargar() {
        ref();

        cp.addColumn("ID");
        cp.addColumn("Proveedor");
        cp.addColumn("Nombre");
        cp.addColumn("Descripción");
        cp.addColumn("Total");
        cp.addColumn("Estado");

        this.cp_tbl.setModel(cp);
        String consul;
        consul = "SELECT * FROM cuentas_p;";

        String[] datos;
        datos = new String[6];
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
                cp.addRow(datos);

            }

            cp_tbl.setModel(cp);
        } catch (SQLException ex) {
            Logger.getLogger(log_form.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "error " + ex);
        }
    }

    public void ref() {
        try {
            cp.setColumnCount(0);
            cp.setRowCount(0);
            cp_tbl.revalidate();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error " + ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        azul_pnl = new javax.swing.JPanel();
        blanco_pnl = new javax.swing.JPanel();
        gm_lbl = new javax.swing.JLabel();
        titulo_lbl = new javax.swing.JLabel();
        scroll = new javax.swing.JScrollPane();
        cp_tbl = new javax.swing.JTable();
        cod_factura_lbl = new javax.swing.JLabel();
        id_txt = new javax.swing.JTextField();
        pagada_btn = new javax.swing.JButton();
        registrar_btn = new javax.swing.JButton();
        atras_lbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        azul_pnl.setBackground(new java.awt.Color(0, 0, 102));

        blanco_pnl.setBackground(new java.awt.Color(255, 255, 255));

        gm_lbl.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        gm_lbl.setForeground(new java.awt.Color(0, 0, 102));
        gm_lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/logo - 24x24.png"))); // NOI18N
        gm_lbl.setText("Grupo M");

        titulo_lbl.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        titulo_lbl.setForeground(new java.awt.Color(0, 0, 102));
        titulo_lbl.setText("Cuentas por pagar");

        cp_tbl.setBackground(new java.awt.Color(255, 255, 255));
        cp_tbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cp_tbl.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        cp_tbl.setForeground(new java.awt.Color(0, 0, 0));
        cp_tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        cp_tbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cp_tblMouseClicked(evt);
            }
        });
        scroll.setViewportView(cp_tbl);

        cod_factura_lbl.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        cod_factura_lbl.setForeground(new java.awt.Color(0, 0, 102));
        cod_factura_lbl.setText("Código de la factura");

        id_txt.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        id_txt.setForeground(new java.awt.Color(0, 0, 0));
        id_txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        id_txt.setCaretColor(new java.awt.Color(0, 0, 0));
        id_txt.setOpaque(false);

        pagada_btn.setFont(new java.awt.Font("Lucida Console", 1, 14)); // NOI18N
        pagada_btn.setForeground(new java.awt.Color(0, 0, 102));
        pagada_btn.setText("Pagada");
        pagada_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pagada_btn.setContentAreaFilled(false);
        pagada_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pagada_btnActionPerformed(evt);
            }
        });

        registrar_btn.setFont(new java.awt.Font("Lucida Console", 1, 14)); // NOI18N
        registrar_btn.setForeground(new java.awt.Color(0, 0, 102));
        registrar_btn.setText("Registrar nueva cuenta");
        registrar_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        registrar_btn.setContentAreaFilled(false);
        registrar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrar_btnActionPerformed(evt);
            }
        });

        atras_lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_undo_24px.png"))); // NOI18N
        atras_lbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                atras_lblMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout blanco_pnlLayout = new javax.swing.GroupLayout(blanco_pnl);
        blanco_pnl.setLayout(blanco_pnlLayout);
        blanco_pnlLayout.setHorizontalGroup(
            blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(blanco_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(blanco_pnlLayout.createSequentialGroup()
                        .addComponent(scroll, javax.swing.GroupLayout.DEFAULT_SIZE, 648, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cod_factura_lbl)
                            .addComponent(pagada_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(id_txt)
                            .addComponent(registrar_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)))
                    .addGroup(blanco_pnlLayout.createSequentialGroup()
                        .addComponent(gm_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(titulo_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(atras_lbl)))
                .addContainerGap())
        );
        blanco_pnlLayout.setVerticalGroup(
            blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(blanco_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(gm_lbl)
                        .addComponent(titulo_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(atras_lbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(blanco_pnlLayout.createSequentialGroup()
                        .addComponent(cod_factura_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(id_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pagada_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(registrar_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(blanco_pnlLayout.createSequentialGroup()
                        .addComponent(scroll, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
                        .addContainerGap())))
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

    private void registrar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrar_btnActionPerformed
        //IR AL REGISTRO DE CUENTAS POR PAGAR
        nueva_cp frame = new nueva_cp();
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_registrar_btnActionPerformed

    private void atras_lblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atras_lblMouseClicked
        //PANTALLA DE VENTAS
        ventas frame = new ventas();
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_atras_lblMouseClicked

    private void cp_tblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cp_tblMouseClicked
        //LLENAR TXT ID
        try {

            String id = (String) cp.getValueAt(cp_tbl.getSelectedRow(), 0);

            id_txt.setText(id);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "error " + ex);
        }
    }//GEN-LAST:event_cp_tblMouseClicked

    private void pagada_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pagada_btnActionPerformed
        //ESTABLECER COMO PAGADA
        String consultacargo = "UPDATE cuentas_pagar SET estado = 'Pagada' WHERE id_cluenta = '" + id_txt.getText() + "';";
        PreparedStatement pss;
        try {
            pss = cnn.prepareStatement(consultacargo);
            pss.executeUpdate();

            JOptionPane.showMessageDialog(null, "Pagada");

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "error " + ex);
        }
    }//GEN-LAST:event_pagada_btnActionPerformed

  
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
            java.util.logging.Logger.getLogger(cuentas_pagar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cuentas_pagar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cuentas_pagar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cuentas_pagar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cuentas_pagar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel atras_lbl;
    private javax.swing.JPanel azul_pnl;
    private javax.swing.JPanel blanco_pnl;
    private javax.swing.JLabel cod_factura_lbl;
    private javax.swing.JTable cp_tbl;
    private javax.swing.JLabel gm_lbl;
    private javax.swing.JTextField id_txt;
    private javax.swing.JButton pagada_btn;
    private javax.swing.JButton registrar_btn;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JLabel titulo_lbl;
    // End of variables declaration//GEN-END:variables
}
