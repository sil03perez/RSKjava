package forms;

import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

public class recursos_humanos extends javax.swing.JFrame {

    public recursos_humanos() {
        initComponents();
        this.setExtendedState(recursos_humanos.MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        azul_pnl = new javax.swing.JPanel();
        blanco_pnl = new javax.swing.JPanel();
        gm_lbl = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        consult_empl_lbl_btn = new javax.swing.JLabel();
        nuevos_empl_lbl_btn = new javax.swing.JLabel();
        cerrar_sesion_lbl_btn = new javax.swing.JLabel();
        nuevos_empl_lbl_btn1 = new javax.swing.JLabel();
        editar_lbl_btn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconImage(
            new ImageIcon(getClass().getResource("/imgs/logo.png")).getImage());

        azul_pnl.setBackground(new java.awt.Color(8, 41, 138));

        blanco_pnl.setBackground(new java.awt.Color(255, 255, 255));

        gm_lbl.setFont(new java.awt.Font("Candara Light", 1, 24)); // NOI18N
        gm_lbl.setForeground(new java.awt.Color(0, 0, 102));
        gm_lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/logo - 24x24.png"))); // NOI18N
        gm_lbl.setText("Grupo M");

        titulo.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        titulo.setForeground(new java.awt.Color(9, 0, 100));
        titulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_user_groups_24px.png"))); // NOI18N
        titulo.setText("Recursos Humamnos");

        consult_empl_lbl_btn.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        consult_empl_lbl_btn.setForeground(new java.awt.Color(0, 0, 102));
        consult_empl_lbl_btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        consult_empl_lbl_btn.setText("Empleados");
        consult_empl_lbl_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102)));
        consult_empl_lbl_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                consult_empl_lbl_btnMouseClicked(evt);
            }
        });

        nuevos_empl_lbl_btn.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        nuevos_empl_lbl_btn.setForeground(new java.awt.Color(0, 0, 102));
        nuevos_empl_lbl_btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nuevos_empl_lbl_btn.setText("Nuevos empleados");
        nuevos_empl_lbl_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102)));
        nuevos_empl_lbl_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nuevos_empl_lbl_btnMouseClicked(evt);
            }
        });

        cerrar_sesion_lbl_btn.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        cerrar_sesion_lbl_btn.setForeground(new java.awt.Color(102, 0, 0));
        cerrar_sesion_lbl_btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cerrar_sesion_lbl_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_Logout_24px.png"))); // NOI18N
        cerrar_sesion_lbl_btn.setText("Cerrar sesión");
        cerrar_sesion_lbl_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 0)));
        cerrar_sesion_lbl_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cerrar_sesion_lbl_btnMouseClicked(evt);
            }
        });

        nuevos_empl_lbl_btn1.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        nuevos_empl_lbl_btn1.setForeground(new java.awt.Color(0, 0, 102));
        nuevos_empl_lbl_btn1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nuevos_empl_lbl_btn1.setText("Reporte");
        nuevos_empl_lbl_btn1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102)));
        nuevos_empl_lbl_btn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nuevos_empl_lbl_btn1MouseClicked(evt);
            }
        });

        editar_lbl_btn.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        editar_lbl_btn.setForeground(new java.awt.Color(0, 0, 102));
        editar_lbl_btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        editar_lbl_btn.setText("Editar");
        editar_lbl_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102)));
        editar_lbl_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editar_lbl_btnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout blanco_pnlLayout = new javax.swing.GroupLayout(blanco_pnl);
        blanco_pnl.setLayout(blanco_pnlLayout);
        blanco_pnlLayout.setHorizontalGroup(
            blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(blanco_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cerrar_sesion_lbl_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(blanco_pnlLayout.createSequentialGroup()
                        .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(consult_empl_lbl_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                            .addComponent(nuevos_empl_lbl_btn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nuevos_empl_lbl_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                            .addComponent(editar_lbl_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)))
                    .addGroup(blanco_pnlLayout.createSequentialGroup()
                        .addComponent(gm_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        blanco_pnlLayout.setVerticalGroup(
            blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(blanco_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gm_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(consult_empl_lbl_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nuevos_empl_lbl_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nuevos_empl_lbl_btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editar_lbl_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cerrar_sesion_lbl_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void consult_empl_lbl_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_consult_empl_lbl_btnMouseClicked
        //VER EMPLEADOS
        mostrar_empleados fr = new mostrar_empleados();
        fr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_consult_empl_lbl_btnMouseClicked

    private void nuevos_empl_lbl_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nuevos_empl_lbl_btnMouseClicked
        //AÑADIR EMPLEADOS
        insert_empleado fr = new insert_empleado();
        fr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_nuevos_empl_lbl_btnMouseClicked

    private void cerrar_sesion_lbl_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrar_sesion_lbl_btnMouseClicked
        //CERRAR SESION
        log_form fr = new log_form();
        fr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cerrar_sesion_lbl_btnMouseClicked

    private void nuevos_empl_lbl_btn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nuevos_empl_lbl_btn1MouseClicked
        //REPORTE DE EMPLEADOS
        Connection cn = conexion.conectar();

        try {
            JasperReport jr = (JasperReport) JRLoader.loadObject(recursos_humanos.class.getResource("/reportes/empleados_oficial.jasper"));
            Map parametros = new HashMap<>();
            parametros.put("Titulo", "Reporte inventario");

            JasperPrint jp = JasperFillManager.fillReport(jr, parametros, cn);
            JasperViewer jv = new JasperViewer(jp, false);
            jv.setVisible(true);
        } catch (JRException ex) {
            JOptionPane.showMessageDialog(rootPane, ex);
        }
    }//GEN-LAST:event_nuevos_empl_lbl_btn1MouseClicked

    private void editar_lbl_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editar_lbl_btnMouseClicked
        //EDITAR EMPLEADOS
        editar_empleado frame = new editar_empleado();
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_editar_lbl_btnMouseClicked

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
            java.util.logging.Logger.getLogger(recursos_humanos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(recursos_humanos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(recursos_humanos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(recursos_humanos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new recursos_humanos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel azul_pnl;
    private javax.swing.JPanel blanco_pnl;
    private javax.swing.JLabel cerrar_sesion_lbl_btn;
    private javax.swing.JLabel consult_empl_lbl_btn;
    private javax.swing.JLabel editar_lbl_btn;
    private javax.swing.JLabel gm_lbl;
    private javax.swing.JLabel nuevos_empl_lbl_btn;
    private javax.swing.JLabel nuevos_empl_lbl_btn1;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
