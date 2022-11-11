package forms;

import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.ImageIcon;

public class registrar extends javax.swing.JFrame {

    //CONEXIÓN
    conexion sin = new conexion();
    Connection son = sin.conectar();

    public registrar() {
        initComponents();
        //MAXIMIZAR
//        this.setExtendedState(registrar.MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        panel_azul = new javax.swing.JPanel();
        blanco_pnl = new javax.swing.JPanel();
        id_fld = new javax.swing.JTextField();
        id_icono = new javax.swing.JLabel();
        usuario_icono = new javax.swing.JLabel();
        pass_logo = new javax.swing.JLabel();
        contra_psw = new javax.swing.JPasswordField();
        usuario_fld = new javax.swing.JTextField();
        enviar_btn = new javax.swing.JButton();
        rol_icono = new javax.swing.JLabel();
        gm_lbl = new javax.swing.JLabel();
        titulo_lbl = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconImage(new ImageIcon(getClass().getResource("/imgs/logo.png")).getImage());
        setLocationByPlatform(true);
        setResizable(false);

        panel_azul.setBackground(new java.awt.Color(8, 41, 138));

        blanco_pnl.setBackground(new java.awt.Color(255, 255, 255));

        id_fld.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        id_fld.setForeground(new java.awt.Color(0, 0, 0));
        id_fld.setText("Empleado");
        id_fld.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        id_fld.setCaretColor(new java.awt.Color(0, 0, 0));
        id_fld.setEnabled(false);
        id_fld.setOpaque(false);
        id_fld.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                id_fldMouseClicked(evt);
            }
        });

        id_icono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_orcid_32px.png"))); // NOI18N

        usuario_icono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_user_32px.png"))); // NOI18N

        pass_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_good_pincode_32px.png"))); // NOI18N

        contra_psw.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        contra_psw.setForeground(new java.awt.Color(0, 0, 0));
        contra_psw.setText("Contraseña");
        contra_psw.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        contra_psw.setOpaque(false);
        contra_psw.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                contra_pswMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                contra_pswMouseExited(evt);
            }
        });

        usuario_fld.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        usuario_fld.setForeground(new java.awt.Color(0, 0, 0));
        usuario_fld.setText("Usuario");
        usuario_fld.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        usuario_fld.setCaretColor(new java.awt.Color(0, 0, 0));
        usuario_fld.setOpaque(false);

        enviar_btn.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        enviar_btn.setForeground(new java.awt.Color(9, 0, 100));
        enviar_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_save_32px.png"))); // NOI18N
        enviar_btn.setText("Guardar usuario");
        enviar_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        enviar_btn.setContentAreaFilled(false);
        enviar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviar_btnActionPerformed(evt);
            }
        });

        rol_icono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_paperwork_32px.png"))); // NOI18N

        gm_lbl.setFont(new java.awt.Font("Candara Light", 1, 24)); // NOI18N
        gm_lbl.setForeground(new java.awt.Color(0, 0, 102));
        gm_lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/logo - 24x24.png"))); // NOI18N
        gm_lbl.setText("Grupo M");

        titulo_lbl.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        titulo_lbl.setForeground(new java.awt.Color(0, 0, 102));
        titulo_lbl.setText("Registro de Usuarios");

        jComboBox1.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox1.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Inventario", "Recursos Humanos", "Ventas", " " }));
        jComboBox1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)), "Acceso", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 0, 18), new java.awt.Color(0, 0, 0))); // NOI18N

        javax.swing.GroupLayout blanco_pnlLayout = new javax.swing.GroupLayout(blanco_pnl);
        blanco_pnl.setLayout(blanco_pnlLayout);
        blanco_pnlLayout.setHorizontalGroup(
            blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(blanco_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(enviar_btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, blanco_pnlLayout.createSequentialGroup()
                        .addComponent(id_icono)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(id_fld))
                    .addGroup(blanco_pnlLayout.createSequentialGroup()
                        .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pass_logo, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                            .addComponent(rol_icono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(contra_psw)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, blanco_pnlLayout.createSequentialGroup()
                        .addComponent(usuario_icono)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(usuario_fld))
                    .addGroup(blanco_pnlLayout.createSequentialGroup()
                        .addComponent(gm_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(titulo_lbl)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        blanco_pnlLayout.setVerticalGroup(
            blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(blanco_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gm_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(titulo_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(id_fld, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addComponent(id_icono, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(usuario_icono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(usuario_fld, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pass_logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(contra_psw, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(rol_icono, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addComponent(jComboBox1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addComponent(enviar_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout panel_azulLayout = new javax.swing.GroupLayout(panel_azul);
        panel_azul.setLayout(panel_azulLayout);
        panel_azulLayout.setHorizontalGroup(
            panel_azulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_azulLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(blanco_pnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel_azulLayout.setVerticalGroup(
            panel_azulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_azulLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(blanco_pnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_azul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_azul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //INSERTAR EL USUARIO EN LA BDD
    public void agregar_user() {

        String psw = String.valueOf(contra_psw.getPassword());
        String consulta = "INSERT INTO `usuarios_empleados` (`id_empleado`, `usuario`, `passw`, `acceso`) VALUES(?,?,?,?)";

        try {

            PreparedStatement prst = son.prepareStatement(consulta);

            prst.setString(1, id_fld.getText());
            prst.setString(2, usuario_fld.getText());
            prst.setString(3, psw);
//            prst.setString(4, rol_txt.getText());

            prst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Exitoso");
            id_fld.setText("");
            usuario_fld.setText("");
            contra_psw.setText("");
//            rol_txt.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error " + e.getMessage());
        }
    }
    private void enviar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviar_btnActionPerformed
        //BOTÓN PARA INSERTAR EL USUARIO
        agregar_user();
    }//GEN-LAST:event_enviar_btnActionPerformed

    private void contra_pswMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contra_pswMouseEntered
        //VER CONTRASEÑA
        contra_psw.setEchoChar((char) 0);
    }//GEN-LAST:event_contra_pswMouseEntered

    private void contra_pswMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contra_pswMouseExited
        //OCULTAR CONTRASEÑA
        contra_psw.setEchoChar('*');
    }//GEN-LAST:event_contra_pswMouseExited

    private void id_fldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_id_fldMouseClicked
        //MOSTRAR LOS EMPLEADOS
        empleados frame = new empleados();
        frame.setVisible(true);
    }//GEN-LAST:event_id_fldMouseClicked

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
            java.util.logging.Logger.getLogger(registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registrar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel blanco_pnl;
    private javax.swing.JPasswordField contra_psw;
    private javax.swing.JButton enviar_btn;
    private javax.swing.JLabel gm_lbl;
    public static javax.swing.JTextField id_fld;
    private javax.swing.JLabel id_icono;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel panel_azul;
    private javax.swing.JLabel pass_logo;
    private javax.swing.JLabel rol_icono;
    private javax.swing.JLabel titulo_lbl;
    private javax.swing.JTextField usuario_fld;
    private javax.swing.JLabel usuario_icono;
    // End of variables declaration//GEN-END:variables
}
