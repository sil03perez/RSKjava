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
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class editar_pedido extends javax.swing.JFrame {

    conexion cn = new conexion();
    Connection cnn = cn.conectar();
    DefaultTableModel pedido;

    public editar_pedido() {
        initComponents();
        this.setExtendedState(editar_pedido.MAXIMIZED_BOTH);
        this.pedido = (DefaultTableModel) pedidos_tbl.getModel();
        mostrar_datos();

    }

    //REFRESCAR LA TABLA
    public void refrescar() {
        try {
            pedido.setColumnCount(0);
            pedido.setRowCount(0);
            pedidos_tbl.revalidate();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error " + ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        azul_pnl = new javax.swing.JPanel();
        blanco_pnl = new javax.swing.JPanel();
        gm_lbl1 = new javax.swing.JLabel();
        atras_lbl = new javax.swing.JLabel();
        titulo_lbl = new javax.swing.JLabel();
        numero_pedido_lbl = new javax.swing.JLabel();
        numero_pedido_txt = new javax.swing.JTextField();
        rnc_cliente_lbl = new javax.swing.JLabel();
        rnc_cliente_txt = new javax.swing.JTextField();
        producto_txt = new javax.swing.JTextField();
        producto_lbl = new javax.swing.JLabel();
        cantidad_txt = new javax.swing.JTextField();
        cantidad_lbl = new javax.swing.JLabel();
        vencimiento_lbl = new javax.swing.JLabel();
        vencimiento_txt = new javax.swing.JTextField();
        estado_box = new javax.swing.JComboBox<>();
        estado_lbl = new javax.swing.JLabel();
        guardar_btn = new javax.swing.JButton();
        pedido_scroll = new javax.swing.JScrollPane();
        pedidos_tbl = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconImage(new ImageIcon(getClass().getResource("/imgs/logo.png")).getImage());

        azul_pnl.setBackground(new java.awt.Color(8, 41, 138));

        blanco_pnl.setBackground(new java.awt.Color(255, 255, 255));

        gm_lbl1.setFont(new java.awt.Font("Candara Light", 1, 24)); // NOI18N
        gm_lbl1.setForeground(new java.awt.Color(0, 0, 102));
        gm_lbl1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/logo - 24x24.png"))); // NOI18N
        gm_lbl1.setText("Grupo M");

        atras_lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_undo_24px.png"))); // NOI18N
        atras_lbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                atras_lblMouseClicked(evt);
            }
        });

        titulo_lbl.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        titulo_lbl.setForeground(new java.awt.Color(0, 0, 102));
        titulo_lbl.setText("Editar pedidos");

        numero_pedido_lbl.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        numero_pedido_lbl.setForeground(new java.awt.Color(0, 0, 102));
        numero_pedido_lbl.setText("Número pedido");

        numero_pedido_txt.setBackground(new java.awt.Color(255, 255, 255));
        numero_pedido_txt.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        numero_pedido_txt.setForeground(new java.awt.Color(0, 0, 0));
        numero_pedido_txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        numero_pedido_txt.setEnabled(false);

        rnc_cliente_lbl.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        rnc_cliente_lbl.setForeground(new java.awt.Color(0, 0, 102));
        rnc_cliente_lbl.setText("RNC cliente");

        rnc_cliente_txt.setBackground(new java.awt.Color(255, 255, 255));
        rnc_cliente_txt.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        rnc_cliente_txt.setForeground(new java.awt.Color(0, 0, 0));
        rnc_cliente_txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));

        producto_txt.setBackground(new java.awt.Color(255, 255, 255));
        producto_txt.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        producto_txt.setForeground(new java.awt.Color(0, 0, 0));
        producto_txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        producto_txt.setEnabled(false);
        producto_txt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                producto_txtMouseClicked(evt);
            }
        });

        producto_lbl.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        producto_lbl.setForeground(new java.awt.Color(0, 0, 102));
        producto_lbl.setText("Producto");

        cantidad_txt.setBackground(new java.awt.Color(255, 255, 255));
        cantidad_txt.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        cantidad_txt.setForeground(new java.awt.Color(0, 0, 0));
        cantidad_txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));

        cantidad_lbl.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        cantidad_lbl.setForeground(new java.awt.Color(0, 0, 102));
        cantidad_lbl.setText("Cantidad");

        vencimiento_lbl.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        vencimiento_lbl.setForeground(new java.awt.Color(0, 0, 102));
        vencimiento_lbl.setText("Vencimiento");

        vencimiento_txt.setBackground(new java.awt.Color(255, 255, 255));
        vencimiento_txt.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        vencimiento_txt.setForeground(new java.awt.Color(0, 0, 0));
        vencimiento_txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));

        estado_box.setBackground(new java.awt.Color(255, 255, 255));
        estado_box.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        estado_box.setForeground(new java.awt.Color(0, 0, 0));
        estado_box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estado", "Nuevo", "En proceso", "Listo para facturar", "Finalizado", "Cancelado" }));
        estado_box.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));

        estado_lbl.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        estado_lbl.setForeground(new java.awt.Color(0, 0, 102));
        estado_lbl.setText("Estado");

        guardar_btn.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        guardar_btn.setForeground(new java.awt.Color(0, 0, 102));
        guardar_btn.setText("Guardar cambios");
        guardar_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        guardar_btn.setContentAreaFilled(false);
        guardar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardar_btnActionPerformed(evt);
            }
        });

        pedidos_tbl.setBackground(new java.awt.Color(255, 255, 255));
        pedidos_tbl.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        pedidos_tbl.setForeground(new java.awt.Color(0, 0, 0));
        pedidos_tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        pedidos_tbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pedidos_tblMouseClicked(evt);
            }
        });
        pedido_scroll.setViewportView(pedidos_tbl);

        javax.swing.GroupLayout blanco_pnlLayout = new javax.swing.GroupLayout(blanco_pnl);
        blanco_pnl.setLayout(blanco_pnlLayout);
        blanco_pnlLayout.setHorizontalGroup(
            blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(blanco_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(blanco_pnlLayout.createSequentialGroup()
                        .addComponent(gm_lbl1)
                        .addGap(18, 18, 18)
                        .addComponent(titulo_lbl)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(pedido_scroll))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(estado_box, 0, 267, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, blanco_pnlLayout.createSequentialGroup()
                        .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(producto_lbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(producto_txt, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rnc_cliente_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(numero_pedido_lbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(vencimiento_lbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cantidad_txt)
                            .addComponent(cantidad_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)))
                    .addComponent(vencimiento_txt)
                    .addComponent(rnc_cliente_txt)
                    .addComponent(numero_pedido_txt)
                    .addComponent(estado_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(guardar_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(blanco_pnlLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(atras_lbl)))
                .addContainerGap())
        );
        blanco_pnlLayout.setVerticalGroup(
            blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(blanco_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(atras_lbl)
                    .addGroup(blanco_pnlLayout.createSequentialGroup()
                        .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(gm_lbl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(titulo_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)))
                .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(blanco_pnlLayout.createSequentialGroup()
                        .addComponent(numero_pedido_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numero_pedido_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(rnc_cliente_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rnc_cliente_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(producto_lbl)
                            .addComponent(cantidad_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(producto_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cantidad_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(vencimiento_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vencimiento_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(estado_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(estado_box, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(guardar_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pedido_scroll))
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

    private void pedidos_tblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pedidos_tblMouseClicked
        //LLENAR LOS TXT

        try {

            String cod = (String) pedido.getValueAt(pedidos_tbl.getSelectedRow(), 0);
            String rnc = (String) pedido.getValueAt(pedidos_tbl.getSelectedRow(), 1);
            String pro = (String) pedido.getValueAt(pedidos_tbl.getSelectedRow(), 2);
            String can = (String) pedido.getValueAt(pedidos_tbl.getSelectedRow(), 3);
            String ven = (String) pedido.getValueAt(pedidos_tbl.getSelectedRow(), 4);
            String est = (String) pedido.getValueAt(pedidos_tbl.getSelectedRow(), 5);

            numero_pedido_txt.setText(cod);
            rnc_cliente_txt.setText(rnc);
            producto_txt.setText(pro);
            cantidad_txt.setText(can);
            vencimiento_txt.setText(ven);
            estado_box.setSelectedItem(est);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "error " + ex);
        }
    }

    public void mostrar_datos() {
        //MÉTODO PARA MOSTRARV LOS DATOS EN LA TABLA
        refrescar();

        pedido.addColumn("número del pedido");
        pedido.addColumn("RNC del cliente");
        pedido.addColumn("Código del producto");
        pedido.addColumn("Cantidad");
        pedido.addColumn("Vencimiento");
        pedido.addColumn("Estado");

        this.pedidos_tbl.setModel(pedido);
        String consul;
        consul = "SELECT * FROM `pedido` WHERE estado NOT LIKE 'Facturado';";

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
                datos[5] = rs.getString(6);

                pedido.addRow(datos);

            }

            pedidos_tbl.setModel(pedido);
        } catch (SQLException ex) {
            Logger.getLogger(log_form.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "error " + ex);
        }

    }//GEN-LAST:event_pedidos_tblMouseClicked

    private void guardar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardar_btnActionPerformed
        //GUARDAR

        String query = "update pedido set producto = ?, cantidad = ?,vencimiento = ?, estado = ? where Numero_pedido = ?;";

        try {
            PreparedStatement prst = cnn.prepareStatement(query);
            prst.setString(1, producto_txt.getText());
            prst.setString(2, cantidad_txt.getText());
            prst.setString(3, vencimiento_txt.getText());
            prst.setString(4, estado_box.getSelectedItem().toString());
            prst.setString(5, numero_pedido_txt.getText());

            prst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Editado");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "error " + ex);
        }

        refrescar();
        mostrar_datos();

    }//GEN-LAST:event_guardar_btnActionPerformed

    private void producto_txtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_producto_txtMouseClicked
        //MOSTRAR VPRO
        v_pro frame = new v_pro();
        frame.setVisible(true);
    }//GEN-LAST:event_producto_txtMouseClicked

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
            java.util.logging.Logger.getLogger(editar_pedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(editar_pedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(editar_pedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(editar_pedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new editar_pedido().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel atras_lbl;
    private javax.swing.JPanel azul_pnl;
    private javax.swing.JPanel blanco_pnl;
    private javax.swing.JLabel cantidad_lbl;
    private javax.swing.JTextField cantidad_txt;
    private javax.swing.JComboBox<String> estado_box;
    private javax.swing.JLabel estado_lbl;
    private javax.swing.JLabel gm_lbl1;
    private javax.swing.JButton guardar_btn;
    private javax.swing.JLabel numero_pedido_lbl;
    private javax.swing.JTextField numero_pedido_txt;
    private javax.swing.JScrollPane pedido_scroll;
    private javax.swing.JTable pedidos_tbl;
    private javax.swing.JLabel producto_lbl;
    public static javax.swing.JTextField producto_txt;
    private javax.swing.JLabel rnc_cliente_lbl;
    private javax.swing.JTextField rnc_cliente_txt;
    private javax.swing.JLabel titulo_lbl;
    private javax.swing.JLabel vencimiento_lbl;
    private javax.swing.JTextField vencimiento_txt;
    // End of variables declaration//GEN-END:variables
}
