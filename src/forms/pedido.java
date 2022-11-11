package forms;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class pedido extends javax.swing.JFrame {

    conexion cn = new conexion();
    Connection cnn = cn.conectar();

    public pedido() {
        initComponents();

//        this.setExtendedState(pedido.MAXIMIZED_BOTH);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        azul_pnl = new javax.swing.JPanel();
        blanco_pnl = new javax.swing.JPanel();
        gm_lbl = new javax.swing.JLabel();
        titulo_lbl = new javax.swing.JLabel();
        rnc_cliente_lbl = new javax.swing.JLabel();
        producto_lbl = new javax.swing.JLabel();
        rnc_txt = new javax.swing.JTextField();
        producto_txt = new javax.swing.JTextField();
        cantidad_txt = new javax.swing.JTextField();
        vencimiento_txt = new javax.swing.JTextField();
        cantidad_lbl = new javax.swing.JLabel();
        vencimiento_lbl = new javax.swing.JLabel();
        guardar_btn = new javax.swing.JButton();
        precio_txt = new javax.swing.JTextField();
        precio_lbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("REGISTRO DE PEDIDOS");
        setIconImage(
            new ImageIcon(getClass().getResource("/imgs/logo.png")).getImage());
        setLocationByPlatform(true);
        setResizable(false);

        azul_pnl.setBackground(new java.awt.Color(8, 41, 138));

        blanco_pnl.setBackground(new java.awt.Color(255, 255, 255));

        gm_lbl.setFont(new java.awt.Font("Candara Light", 1, 24)); // NOI18N
        gm_lbl.setForeground(new java.awt.Color(0, 0, 102));
        gm_lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/logo - 24x24.png"))); // NOI18N
        gm_lbl.setText("Grupo M");

        titulo_lbl.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        titulo_lbl.setForeground(new java.awt.Color(0, 0, 102));
        titulo_lbl.setText("Registrar pedidos");

        rnc_cliente_lbl.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        rnc_cliente_lbl.setForeground(new java.awt.Color(0, 0, 102));
        rnc_cliente_lbl.setText("Cliente");

        producto_lbl.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        producto_lbl.setForeground(new java.awt.Color(0, 0, 102));
        producto_lbl.setText("Producto");

        rnc_txt.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        rnc_txt.setForeground(new java.awt.Color(0, 0, 0));
        rnc_txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        rnc_txt.setEnabled(false);
        rnc_txt.setOpaque(false);
        rnc_txt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rnc_txtMouseClicked(evt);
            }
        });

        producto_txt.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        producto_txt.setForeground(new java.awt.Color(0, 0, 0));
        producto_txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        producto_txt.setEnabled(false);
        producto_txt.setOpaque(false);
        producto_txt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                producto_txtMouseClicked(evt);
            }
        });

        cantidad_txt.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        cantidad_txt.setForeground(new java.awt.Color(0, 0, 0));
        cantidad_txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        cantidad_txt.setOpaque(false);

        vencimiento_txt.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        vencimiento_txt.setForeground(new java.awt.Color(0, 0, 0));
        vencimiento_txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        vencimiento_txt.setOpaque(false);

        cantidad_lbl.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        cantidad_lbl.setForeground(new java.awt.Color(0, 0, 102));
        cantidad_lbl.setText("Cantidad");

        vencimiento_lbl.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        vencimiento_lbl.setForeground(new java.awt.Color(0, 0, 102));
        vencimiento_lbl.setText("vencimiento");

        guardar_btn.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        guardar_btn.setForeground(new java.awt.Color(0, 0, 102));
        guardar_btn.setText("Guardar");
        guardar_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        guardar_btn.setContentAreaFilled(false);
        guardar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardar_btnActionPerformed(evt);
            }
        });

        precio_txt.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        precio_txt.setForeground(new java.awt.Color(0, 0, 0));
        precio_txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        precio_txt.setEnabled(false);
        precio_txt.setOpaque(false);

        precio_lbl.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        precio_lbl.setForeground(new java.awt.Color(0, 0, 102));
        precio_lbl.setText("Precio");

        javax.swing.GroupLayout blanco_pnlLayout = new javax.swing.GroupLayout(blanco_pnl);
        blanco_pnl.setLayout(blanco_pnlLayout);
        blanco_pnlLayout.setHorizontalGroup(
            blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(blanco_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(precio_txt)
                    .addComponent(guardar_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(blanco_pnlLayout.createSequentialGroup()
                        .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rnc_cliente_lbl)
                            .addComponent(cantidad_lbl)
                            .addComponent(rnc_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE))
                        .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(blanco_pnlLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(blanco_pnlLayout.createSequentialGroup()
                                        .addComponent(producto_lbl)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(producto_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)))
                            .addGroup(blanco_pnlLayout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(vencimiento_lbl)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(blanco_pnlLayout.createSequentialGroup()
                        .addComponent(cantidad_txt)
                        .addGap(18, 18, 18)
                        .addComponent(vencimiento_txt))
                    .addGroup(blanco_pnlLayout.createSequentialGroup()
                        .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(blanco_pnlLayout.createSequentialGroup()
                                .addComponent(gm_lbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(titulo_lbl))
                            .addComponent(precio_lbl))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        blanco_pnlLayout.setVerticalGroup(
            blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, blanco_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(gm_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(titulo_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rnc_cliente_lbl)
                    .addComponent(producto_lbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rnc_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(producto_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(precio_lbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(precio_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cantidad_lbl)
                    .addComponent(vencimiento_lbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cantidad_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vencimiento_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(guardar_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void guardar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardar_btnActionPerformed
        //GUARDAR PEDIDO

        String query = "INSERT INTO pedido (rnc_cliente, producto, Cantidad, vencimiento, estado, total) VALUES (?,?,?,?,?,?)";
        String est_def = "Nuevo";

        String pretotal = precio_txt.getText();
        Double pretot2 = Double.parseDouble(pretotal);
        Double cantidad = Double.parseDouble(cantidad_txt.getText());
        Double total = pretot2 * cantidad;
        String total4 = String.valueOf(total);
        try {

            PreparedStatement prst = cnn.prepareStatement(query);

            prst.setString(1, rnc_txt.getText());
            prst.setString(2, producto_txt.getText());
            prst.setString(3, cantidad_txt.getText());
            prst.setString(4, vencimiento_txt.getText());
            prst.setString(5, est_def);
            prst.setString(6, total4);

            prst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Guardado");

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "error " + ex);
        }
    }//GEN-LAST:event_guardar_btnActionPerformed

    private void producto_txtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_producto_txtMouseClicked
        //MOSTRAR PRODUCTO 
        producto_ped frame = new producto_ped();
        frame.setVisible(true);
    }//GEN-LAST:event_producto_txtMouseClicked

    private void rnc_txtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rnc_txtMouseClicked
        //MOSTRAR CLIENTES
        cli_ped frame = new cli_ped();
        frame.setVisible(true);
    }//GEN-LAST:event_rnc_txtMouseClicked

    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(pedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pedido().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel azul_pnl;
    private javax.swing.JPanel blanco_pnl;
    private javax.swing.JLabel cantidad_lbl;
    private javax.swing.JTextField cantidad_txt;
    private javax.swing.JLabel gm_lbl;
    private javax.swing.JButton guardar_btn;
    private javax.swing.JLabel precio_lbl;
    public static javax.swing.JTextField precio_txt;
    private javax.swing.JLabel producto_lbl;
    public static javax.swing.JTextField producto_txt;
    private javax.swing.JLabel rnc_cliente_lbl;
    public static javax.swing.JTextField rnc_txt;
    private javax.swing.JLabel titulo_lbl;
    private javax.swing.JLabel vencimiento_lbl;
    private javax.swing.JTextField vencimiento_txt;
    // End of variables declaration//GEN-END:variables
}
