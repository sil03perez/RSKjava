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
public class control_usuario extends javax.swing.JFrame {

    conexion cn = new conexion();
    Connection cnn = cn.conectar();
    DefaultTableModel user;

    public control_usuario() {
        initComponents();
        this.setExtendedState(control_usuario.MAXIMIZED_BOTH);
        this.user = (DefaultTableModel) usuarios_tbl.getModel();
        cargar();
    }

    //REFRESCAR LA TABLA
    public void refrescar() {
        try {
            user.setColumnCount(0);
            user.setRowCount(0);
            usuarios_tbl.revalidate();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error " + ex);
        }
    }

    //MOSTAR LOS USUARIOS
    public void cargar() {
        refrescar();
        user.addColumn("Código");
        user.addColumn("Empleado");
        user.addColumn("Usuario");
        user.addColumn("Clave");
        user.addColumn("Acceso");

        this.usuarios_tbl.setModel(user);
        String consul;
        consul = "SELECT * FROM usuarios_empleados";

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

                user.addRow(datos);

            }

            usuarios_tbl.setModel(user);
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
        titulo_lbl = new javax.swing.JLabel();
        atras_lbl = new javax.swing.JLabel();
        usuarios_scroll = new javax.swing.JScrollPane();
        usuarios_tbl = new javax.swing.JTable();
        cod_usu_lbl = new javax.swing.JLabel();
        empleado_txt = new javax.swing.JTextField();
        empleado_lbl = new javax.swing.JLabel();
        cod_usu_txt = new javax.swing.JTextField();
        usuario_lbl = new javax.swing.JLabel();
        usuario_txt = new javax.swing.JTextField();
        pass_lbl = new javax.swing.JLabel();
        acceso_lbl = new javax.swing.JLabel();
        modificar_btn = new javax.swing.JButton();
        pass_psw = new javax.swing.JPasswordField();
        borrar_btn = new javax.swing.JButton();
        acceso_lbl_btn = new javax.swing.JLabel();
        acceso_txt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconImage(new ImageIcon(getClass().getResource("/imgs/logo.png")).getImage());

        azul_pnl.setBackground(new java.awt.Color(8, 41, 138));

        blanco_pnl.setBackground(new java.awt.Color(255, 255, 255));

        gm_lbl.setFont(new java.awt.Font("Candara Light", 1, 24)); // NOI18N
        gm_lbl.setForeground(new java.awt.Color(0, 0, 102));
        gm_lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/logo - 24x24.png"))); // NOI18N
        gm_lbl.setText("Grupo M");

        titulo_lbl.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        titulo_lbl.setForeground(new java.awt.Color(0, 0, 102));
        titulo_lbl.setText("Control usuarios");

        atras_lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_undo_24px.png"))); // NOI18N
        atras_lbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                atras_lblMouseClicked(evt);
            }
        });

        usuarios_tbl.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        usuarios_tbl.setForeground(new java.awt.Color(0, 0, 0));
        usuarios_tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        usuarios_tbl.setOpaque(false);
        usuarios_tbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usuarios_tblMouseClicked(evt);
            }
        });
        usuarios_scroll.setViewportView(usuarios_tbl);

        cod_usu_lbl.setFont(new java.awt.Font("Candara Light", 1, 18)); // NOI18N
        cod_usu_lbl.setForeground(new java.awt.Color(0, 0, 102));
        cod_usu_lbl.setText("Código del usuario");

        empleado_txt.setBackground(new java.awt.Color(255, 255, 255));
        empleado_txt.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        empleado_txt.setForeground(new java.awt.Color(0, 0, 0));
        empleado_txt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        empleado_txt.setCaretColor(new java.awt.Color(0, 0, 0));

        empleado_lbl.setFont(new java.awt.Font("Candara Light", 1, 18)); // NOI18N
        empleado_lbl.setForeground(new java.awt.Color(0, 0, 102));
        empleado_lbl.setText("Empleado");

        cod_usu_txt.setBackground(new java.awt.Color(255, 255, 255));
        cod_usu_txt.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        cod_usu_txt.setForeground(new java.awt.Color(0, 0, 0));
        cod_usu_txt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        cod_usu_txt.setCaretColor(new java.awt.Color(0, 0, 0));
        cod_usu_txt.setEnabled(false);

        usuario_lbl.setFont(new java.awt.Font("Candara Light", 1, 18)); // NOI18N
        usuario_lbl.setForeground(new java.awt.Color(0, 0, 102));
        usuario_lbl.setText("Nombre usuario");

        usuario_txt.setBackground(new java.awt.Color(255, 255, 255));
        usuario_txt.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        usuario_txt.setForeground(new java.awt.Color(0, 0, 0));
        usuario_txt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        usuario_txt.setCaretColor(new java.awt.Color(0, 0, 0));

        pass_lbl.setFont(new java.awt.Font("Candara Light", 1, 18)); // NOI18N
        pass_lbl.setForeground(new java.awt.Color(0, 0, 102));
        pass_lbl.setText("Contraseña");

        acceso_lbl.setFont(new java.awt.Font("Candara Light", 1, 18)); // NOI18N
        acceso_lbl.setForeground(new java.awt.Color(0, 0, 102));
        acceso_lbl.setText("Acceso");

        modificar_btn.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        modificar_btn.setForeground(new java.awt.Color(0, 0, 102));
        modificar_btn.setText("Modificar");
        modificar_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        modificar_btn.setContentAreaFilled(false);
        modificar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificar_btnActionPerformed(evt);
            }
        });

        pass_psw.setBackground(new java.awt.Color(255, 255, 255));
        pass_psw.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        pass_psw.setForeground(new java.awt.Color(0, 0, 0));
        pass_psw.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        pass_psw.setCaretColor(new java.awt.Color(0, 0, 0));
        pass_psw.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pass_pswMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pass_pswMouseExited(evt);
            }
        });

        borrar_btn.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        borrar_btn.setForeground(new java.awt.Color(153, 0, 0));
        borrar_btn.setText("Borrar");
        borrar_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        borrar_btn.setContentAreaFilled(false);
        borrar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrar_btnActionPerformed(evt);
            }
        });

        acceso_lbl_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_expand_arrow_24px_1.png"))); // NOI18N
        acceso_lbl_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        acceso_lbl_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                acceso_lbl_btnMouseClicked(evt);
            }
        });

        acceso_txt.setBackground(new java.awt.Color(255, 255, 255));
        acceso_txt.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        acceso_txt.setForeground(new java.awt.Color(0, 0, 0));
        acceso_txt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        acceso_txt.setCaretColor(new java.awt.Color(0, 0, 0));
        acceso_txt.setEnabled(false);

        javax.swing.GroupLayout blanco_pnlLayout = new javax.swing.GroupLayout(blanco_pnl);
        blanco_pnl.setLayout(blanco_pnlLayout);
        blanco_pnlLayout.setHorizontalGroup(
            blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(blanco_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(blanco_pnlLayout.createSequentialGroup()
                        .addComponent(usuarios_scroll, javax.swing.GroupLayout.DEFAULT_SIZE, 485, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usuario_lbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                            .addComponent(pass_lbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(acceso_lbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(usuario_txt)
                            .addComponent(pass_psw)
                            .addComponent(cod_usu_txt)
                            .addGroup(blanco_pnlLayout.createSequentialGroup()
                                .addComponent(acceso_txt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(acceso_lbl_btn))
                            .addComponent(cod_usu_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                            .addComponent(empleado_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(modificar_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(empleado_txt, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(borrar_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(blanco_pnlLayout.createSequentialGroup()
                        .addComponent(gm_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                    .addComponent(atras_lbl)
                    .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(gm_lbl)
                        .addComponent(titulo_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(usuarios_scroll)
                    .addGroup(blanco_pnlLayout.createSequentialGroup()
                        .addComponent(cod_usu_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cod_usu_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(empleado_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(empleado_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(usuario_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(usuario_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pass_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pass_psw, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(acceso_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(acceso_lbl_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(acceso_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(modificar_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(borrar_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    }//GEN-LAST:event_atras_lblMouseClicked

    private void modificar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificar_btnActionPerformed
        //MODIFICAR
        String cs = cod_usu_txt.getText();
        String ce = empleado_txt.getText();
        String ns = usuario_txt.getText();
        String ps = pass_psw.getText();
        String as = acceso_txt.getText();
        PreparedStatement pss;
        String mod = "UPDATE usuarios_empleados SET id_empleado = " + ce + ", usuario = '" + ns + "', passw = '" + ps + "', acceso = '" + as + "' WHERE codigo_usuario = " + cs + ";";
        try {
            pss = cnn.prepareStatement(mod);
            pss.executeUpdate();
            refrescar();
            cargar();
            JOptionPane.showMessageDialog(null, "Actualización exitosa");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "error " + ex);
        }
    }//GEN-LAST:event_modificar_btnActionPerformed

    private void usuarios_tblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usuarios_tblMouseClicked
        //LLENAR LOS TXT
        try {

            String cod = (String) user.getValueAt(usuarios_tbl.getSelectedRow(), 0);
            String emp = (String) user.getValueAt(usuarios_tbl.getSelectedRow(), 1);
            String usu = (String) user.getValueAt(usuarios_tbl.getSelectedRow(), 2);
            String psw = (String) user.getValueAt(usuarios_tbl.getSelectedRow(), 3);
            String rol = (String) user.getValueAt(usuarios_tbl.getSelectedRow(), 4);

            cod_usu_txt.setText(cod);
            empleado_txt.setText(emp);
            usuario_txt.setText(usu);
            pass_psw.setText(psw);
            acceso_txt.setText(rol);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "error " + ex);
        }
    }//GEN-LAST:event_usuarios_tblMouseClicked

    private void pass_pswMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pass_pswMouseEntered
        //VER CLAVE
        pass_psw.setEchoChar((char) 0);
    }//GEN-LAST:event_pass_pswMouseEntered

    private void pass_pswMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pass_pswMouseExited
        //OCULTAR CLAVE
        pass_psw.setEchoChar('*');
    }//GEN-LAST:event_pass_pswMouseExited

    private void borrar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrar_btnActionPerformed
        //BORRAR USUARIO
        PreparedStatement pssb;
        String codig = cod_usu_txt.getText();
        String queryb = "DELETE FROM usuarios_empleados WHERE codigo_usuario = " + codig;

        try {
            pssb = cnn.prepareStatement(queryb);
            pssb.executeUpdate();
            refrescar();
            cargar();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "error " + ex);
        }
    }//GEN-LAST:event_borrar_btnActionPerformed

    private void acceso_lbl_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_acceso_lbl_btnMouseClicked
        //MOSTRAR DEPARTAMENTOS
//        accesos_control_user frame = new accesos_control_user();
//        frame.setVisible(true);
    }//GEN-LAST:event_acceso_lbl_btnMouseClicked

    
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
            java.util.logging.Logger.getLogger(control_usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(control_usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(control_usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(control_usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new control_usuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel acceso_lbl;
    private javax.swing.JLabel acceso_lbl_btn;
    public static javax.swing.JTextField acceso_txt;
    private javax.swing.JLabel atras_lbl;
    private javax.swing.JPanel azul_pnl;
    private javax.swing.JPanel blanco_pnl;
    private javax.swing.JButton borrar_btn;
    private javax.swing.JLabel cod_usu_lbl;
    private javax.swing.JTextField cod_usu_txt;
    private javax.swing.JLabel empleado_lbl;
    private javax.swing.JTextField empleado_txt;
    private javax.swing.JLabel gm_lbl;
    private javax.swing.JButton modificar_btn;
    private javax.swing.JLabel pass_lbl;
    private javax.swing.JPasswordField pass_psw;
    private javax.swing.JLabel titulo_lbl;
    private javax.swing.JLabel usuario_lbl;
    private javax.swing.JTextField usuario_txt;
    private javax.swing.JScrollPane usuarios_scroll;
    private javax.swing.JTable usuarios_tbl;
    // End of variables declaration//GEN-END:variables
}
