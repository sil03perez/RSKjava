package forms;

import javax.swing.ImageIcon;

public class start extends javax.swing.JFrame {

    public start() {
        initComponents();
      //MAXIMIZAR
//        this.setExtendedState(start.MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        azul_pnl = new javax.swing.JPanel();
        blanco_pnl = new javax.swing.JPanel();
        gm_lbl = new javax.swing.JLabel();
        cr_lbl = new javax.swing.JLabel();
        welcome_lbl = new javax.swing.JLabel();
        is_lbl = new javax.swing.JLabel();
        salir_lbl_btn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("INICIO");
        setIconImage(new ImageIcon(getClass().getResource("/imgs/logo.png")).getImage());
        setLocationByPlatform(true);
        setName("inicio"); // NOI18N
        setResizable(false);

        azul_pnl.setBackground(new java.awt.Color(8, 41, 138));

        blanco_pnl.setBackground(new java.awt.Color(255, 255, 255));

        gm_lbl.setFont(new java.awt.Font("Candara Light", 1, 24)); // NOI18N
        gm_lbl.setForeground(new java.awt.Color(0, 0, 102));
        gm_lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/logo - 24x24.png"))); // NOI18N
        gm_lbl.setText("Grupo M");

        cr_lbl.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        cr_lbl.setForeground(new java.awt.Color(0, 0, 102));
        cr_lbl.setText("Creadores de valor");

        welcome_lbl.setFont(new java.awt.Font("Calibri Light", 3, 24)); // NOI18N
        welcome_lbl.setForeground(new java.awt.Color(0, 0, 102));
        welcome_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        welcome_lbl.setText("Bienvenid@");

        is_lbl.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        is_lbl.setForeground(new java.awt.Color(0, 0, 102));
        is_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        is_lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_login_32px.png"))); // NOI18N
        is_lbl.setText("Iniciar Sesión");
        is_lbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        is_lbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                is_lblMouseClicked(evt);
            }
        });

        salir_lbl_btn.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        salir_lbl_btn.setForeground(new java.awt.Color(0, 0, 102));
        salir_lbl_btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        salir_lbl_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_exit_sign_32px_1.png"))); // NOI18N
        salir_lbl_btn.setText("Salir");
        salir_lbl_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        salir_lbl_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salir_lbl_btnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout blanco_pnlLayout = new javax.swing.GroupLayout(blanco_pnl);
        blanco_pnl.setLayout(blanco_pnlLayout);
        blanco_pnlLayout.setHorizontalGroup(
            blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(blanco_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(is_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(blanco_pnlLayout.createSequentialGroup()
                        .addComponent(gm_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cr_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 282, Short.MAX_VALUE))
                    .addComponent(welcome_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(salir_lbl_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        blanco_pnlLayout.setVerticalGroup(
            blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(blanco_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gm_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cr_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(welcome_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(is_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(salir_lbl_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout azul_pnlLayout = new javax.swing.GroupLayout(azul_pnl);
        azul_pnl.setLayout(azul_pnlLayout);
        azul_pnlLayout.setHorizontalGroup(
            azul_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, azul_pnlLayout.createSequentialGroup()
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
            .addComponent(azul_pnl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(azul_pnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void is_lblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_is_lblMouseClicked
        //INICIARS ESIÓN
        log_form newframe = new log_form();
        newframe.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_is_lblMouseClicked

    private void salir_lbl_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salir_lbl_btnMouseClicked
        //SALIR
        System.exit(0);
    }//GEN-LAST:event_salir_lbl_btnMouseClicked

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
            java.util.logging.Logger.getLogger(start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new start().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel azul_pnl;
    private javax.swing.JPanel blanco_pnl;
    private javax.swing.JLabel cr_lbl;
    private javax.swing.JLabel gm_lbl;
    private javax.swing.JLabel is_lbl;
    private javax.swing.JLabel salir_lbl_btn;
    private javax.swing.JLabel welcome_lbl;
    // End of variables declaration//GEN-END:variables
}
