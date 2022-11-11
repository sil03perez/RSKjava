package forms;

import com.sun.java.swing.plaf.windows.WindowsLookAndFeel;
import java.awt.*;
import javax.swing.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class log_form extends javax.swing.JFrame {

    conexion sin = new conexion();
    Connection son = sin.conectar();

    public log_form() {
        initComponents();
//        this.setExtendedState(log_form.MAXIMIZED_BOTH);
    }

    //METODO PARA INICIAR SESION
    public void ingresar() {

        int resultado = 0;
        String pass = String.valueOf(pass_psw.getPassword());
        String user = usuario_fld.getText();
        String consulta = "SELECT * FROM LOGIN WHERE NOMBRE_USUARIO ='" + user + "'AND CLAVE ='" + pass + "' ";

        try {
            PreparedStatement prst = son.prepareStatement(consulta);
            ResultSet res = prst.executeQuery(consulta);

            if (res.next()) {

                String rol = res.getString("acceso");

                if (rol.equals("Ventas")) {
                    ventas form = new ventas();
                    form.setVisible(true);
                    this.dispose();
                } else if (rol.equals("Finanzas")) {
                    administrador form = new administrador();
                    form.setVisible(true);
                    this.dispose();
                } else if (rol.equals("Administrador")) {
                    administrador form = new administrador();
                    form.setVisible(true);
                    this.dispose();
                } else if (rol.equals("Inventario")) {
                    inventario_tb form = new inventario_tb();
                    form.setVisible(true);
                    this.dispose();
                } else if (rol.equals("Recursos Humanos")) {
                    recursos_humanos form = new recursos_humanos();
                    form.setVisible(true);
                    this.dispose();
                }

            } else {
                JOptionPane.showMessageDialog(null, "Revise los datos insertados");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al  iniciar sesión" + e.getMessage());
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        azul_pnl = new javax.swing.JPanel();
        blanco_pnl = new javax.swing.JPanel();
        titulo_lbl = new javax.swing.JLabel();
        usuario_logo = new javax.swing.JLabel();
        usuario_fld = new javax.swing.JTextField();
        pass_logo = new javax.swing.JLabel();
        pass_psw = new javax.swing.JPasswordField();
        salir = new javax.swing.JLabel();
        enviar_btn = new javax.swing.JButton();
        gm_lbl = new javax.swing.JLabel();
        separador = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Inicio de sesión");
        setIconImage(new ImageIcon(getClass().getResource("/imgs/logo.png")).getImage());
        setLocationByPlatform(true);
        setName("marco"); // NOI18N
        setResizable(false);

        azul_pnl.setBackground(new java.awt.Color(8, 41, 138));

        blanco_pnl.setBackground(new java.awt.Color(255, 255, 255));
        blanco_pnl.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(153, 153, 153), new java.awt.Color(0, 0, 0)));

        titulo_lbl.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        titulo_lbl.setForeground(new java.awt.Color(9, 0, 100));
        titulo_lbl.setText("System Log-In");

        usuario_logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        usuario_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_user_32px.png"))); // NOI18N

        usuario_fld.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        usuario_fld.setForeground(new java.awt.Color(0, 0, 0));
        usuario_fld.setText("Usuario");
        usuario_fld.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        usuario_fld.setOpaque(false);
        usuario_fld.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                usuario_fldMousePressed(evt);
            }
        });

        pass_logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pass_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_good_pincode_32px.png"))); // NOI18N

        pass_psw.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        pass_psw.setForeground(new java.awt.Color(0, 0, 0));
        pass_psw.setText("Contraseña");
        pass_psw.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        pass_psw.setOpaque(false);
        pass_psw.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pass_pswMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pass_pswMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pass_pswMouseExited(evt);
            }
        });

        salir.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        salir.setForeground(new java.awt.Color(9, 0, 100));
        salir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_exit_sign_32px_1.png"))); // NOI18N
        salir.setText("Salir");
        salir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salirMouseClicked(evt);
            }
        });

        enviar_btn.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        enviar_btn.setForeground(new java.awt.Color(9, 0, 100));
        enviar_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_sign_document_32px_2.png"))); // NOI18N
        enviar_btn.setText("Iniciar sesión");
        enviar_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        enviar_btn.setContentAreaFilled(false);
        enviar_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        enviar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviar_btnActionPerformed(evt);
            }
        });

        gm_lbl.setFont(new java.awt.Font("Candara Light", 1, 24)); // NOI18N
        gm_lbl.setForeground(new java.awt.Color(0, 0, 102));
        gm_lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/logo - 24x24.png"))); // NOI18N
        gm_lbl.setText("Grupo M");

        separador.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout blanco_pnlLayout = new javax.swing.GroupLayout(blanco_pnl);
        blanco_pnl.setLayout(blanco_pnlLayout);
        blanco_pnlLayout.setHorizontalGroup(
            blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(blanco_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, blanco_pnlLayout.createSequentialGroup()
                        .addComponent(gm_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(separador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(titulo_lbl)
                        .addGap(0, 269, Short.MAX_VALUE))
                    .addGroup(blanco_pnlLayout.createSequentialGroup()
                        .addComponent(usuario_logo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(usuario_fld))
                    .addComponent(salir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(enviar_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(blanco_pnlLayout.createSequentialGroup()
                        .addComponent(pass_logo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pass_psw)))
                .addContainerGap())
        );
        blanco_pnlLayout.setVerticalGroup(
            blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(blanco_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(gm_lbl)
                    .addComponent(separador)
                    .addComponent(titulo_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(usuario_logo, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(usuario_fld, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pass_logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pass_psw, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(enviar_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            .addComponent(azul_pnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(azul_pnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleName("marco");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseClicked
        //SALIR
        start pantalla = new start();
        pantalla.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_salirMouseClicked

    private void usuario_fldMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usuario_fldMousePressed
        // VACIAR EL PLACEHOLDER USER

        if (usuario_fld.getText().equals("Usuario")) {
            usuario_fld.setText("");
        } else {

        }


    }//GEN-LAST:event_usuario_fldMousePressed

    private void enviar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviar_btnActionPerformed
        //ENVIAR
       if ("ransel".equals(usuario_fld.getText())){
           administrador frame;
           frame = new administrador();
           frame.setVisible(true);
           administrador.apartados_tbd.setSelectedIndex(1);
           administrador.apartados_tbd.setEnabledAt(2, false);
       }
       else{
           
       }
    }//GEN-LAST:event_enviar_btnActionPerformed

    private void pass_pswMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pass_pswMouseClicked
        //VACIAR PLACEHOLDER PSW
        String pass = String.valueOf(pass_psw.getPassword());
        if (pass.equals("Contraseña")) {
            pass_psw.setText("");
        } else {

        }
    }//GEN-LAST:event_pass_pswMouseClicked

    private void pass_pswMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pass_pswMouseEntered
        //VER CONTRASEÑA
        pass_psw.setEchoChar((char) 0);
    }//GEN-LAST:event_pass_pswMouseEntered

    private void pass_pswMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pass_pswMouseExited
        //OCULTAR CONTRASEÑA
        pass_psw.setEchoChar('*');
    }//GEN-LAST:event_pass_pswMouseExited

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
            java.util.logging.Logger.getLogger(log_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(log_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(log_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(log_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel(new WindowsLookAndFeel());
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(administrador.class.getName()).log(Level.SEVERE, null, ex);
                }
                new log_form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel azul_pnl;
    private javax.swing.JPanel blanco_pnl;
    private javax.swing.JButton enviar_btn;
    private javax.swing.JLabel gm_lbl;
    private javax.swing.JLabel pass_logo;
    private javax.swing.JPasswordField pass_psw;
    private javax.swing.JLabel salir;
    private javax.swing.JSeparator separador;
    private javax.swing.JLabel titulo_lbl;
    private javax.swing.JTextField usuario_fld;
    private javax.swing.JLabel usuario_logo;
    // End of variables declaration//GEN-END:variables
}
