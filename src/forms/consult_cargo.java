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

public class consult_cargo extends javax.swing.JFrame {

    DefaultTableModel puestos;
    conexion cn = new conexion();
    Connection cnn = cn.conectar();
    
    public consult_cargo() {
        initComponents();
         this.setExtendedState(consult_cargo.MAXIMIZED_BOTH);
         this.puestos = (DefaultTableModel) cargos_tbl.getModel();
        cargar();
    }

    //MOSTRSR Y CARGAR DATOS
    public void cargar() {
        ref();

        puestos.addColumn("Nombre");
        puestos.addColumn("Código");
        puestos.addColumn("Departamento");

        this.cargos_tbl.setModel(puestos);
        String consul;
        consul = "SELECT * FROM puestos;";

        String[] datos = new String[3];
        try {
            Statement st = cnn.createStatement();
            ResultSet rs = st.executeQuery(consul);
            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                puestos.addRow(datos);

            }

            cargos_tbl.setModel(puestos);
        } catch (SQLException ex) {
            Logger.getLogger(log_form.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "error " + ex);
        }

    }

    public void ref() {
        try {
            puestos.setColumnCount(0);
            puestos.setRowCount(0);
            cargos_tbl.revalidate();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error " + ex);
        }
    }
    //FIN MOSTRAR Y CARGAR
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        azul_pnl = new javax.swing.JPanel();
        blanco_pnl = new javax.swing.JPanel();
        gm_lbl = new javax.swing.JLabel();
        titulo_lbl = new javax.swing.JLabel();
        cargos_scroll = new javax.swing.JScrollPane();
        cargos_tbl = new javax.swing.JTable();
        nombre_lbl = new javax.swing.JLabel();
        nombre_txt = new javax.swing.JTextField();
        dpto_lbl = new javax.swing.JLabel();
        dpto_nombre_txt = new javax.swing.JTextField();
        dtos_btn = new javax.swing.JButton();
        editar_btn = new javax.swing.JButton();
        borrar_btn = new javax.swing.JButton();
        codigo_txt = new javax.swing.JTextField();
        codigo_lbl = new javax.swing.JLabel();
        atras_lbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(new ImageIcon(getClass().getResource("/imgs/logo.png")).getImage());

        azul_pnl.setBackground(new java.awt.Color(8, 41, 138));

        blanco_pnl.setBackground(new java.awt.Color(255, 255, 255));

        gm_lbl.setFont(new java.awt.Font("Candara Light", 1, 24)); // NOI18N
        gm_lbl.setForeground(new java.awt.Color(0, 0, 102));
        gm_lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/logo - 24x24.png"))); // NOI18N
        gm_lbl.setText("Grupo M");

        titulo_lbl.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        titulo_lbl.setForeground(new java.awt.Color(0, 0, 102));
        titulo_lbl.setText("Puestos de trabajo");

        cargos_tbl.setBackground(new java.awt.Color(255, 255, 255));
        cargos_tbl.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        cargos_tbl.setForeground(new java.awt.Color(0, 0, 0));
        cargos_tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        cargos_tbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cargos_tblMouseClicked(evt);
            }
        });
        cargos_scroll.setViewportView(cargos_tbl);

        nombre_lbl.setFont(new java.awt.Font("Candara Light", 1, 18)); // NOI18N
        nombre_lbl.setForeground(new java.awt.Color(0, 0, 102));
        nombre_lbl.setText("Nombre del puesto");

        nombre_txt.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        nombre_txt.setForeground(new java.awt.Color(0, 0, 0));
        nombre_txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        nombre_txt.setCaretColor(new java.awt.Color(0, 0, 0));
        nombre_txt.setOpaque(false);

        dpto_lbl.setFont(new java.awt.Font("Candara Light", 1, 18)); // NOI18N
        dpto_lbl.setForeground(new java.awt.Color(0, 0, 102));
        dpto_lbl.setText("Departamento");

        dpto_nombre_txt.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        dpto_nombre_txt.setForeground(new java.awt.Color(0, 0, 0));
        dpto_nombre_txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        dpto_nombre_txt.setCaretColor(new java.awt.Color(0, 0, 0));
        dpto_nombre_txt.setOpaque(false);

        dtos_btn.setFont(new java.awt.Font("Candara Light", 1, 18)); // NOI18N
        dtos_btn.setForeground(new java.awt.Color(0, 0, 102));
        dtos_btn.setText("Editar dpto");
        dtos_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        dtos_btn.setContentAreaFilled(false);
        dtos_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dtos_btnActionPerformed(evt);
            }
        });

        editar_btn.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        editar_btn.setForeground(new java.awt.Color(0, 0, 102));
        editar_btn.setText("Guardar Cambios");
        editar_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        editar_btn.setContentAreaFilled(false);
        editar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editar_btnActionPerformed(evt);
            }
        });

        borrar_btn.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        borrar_btn.setForeground(new java.awt.Color(102, 0, 0));
        borrar_btn.setText("Borrar");
        borrar_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        borrar_btn.setContentAreaFilled(false);
        borrar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrar_btnActionPerformed(evt);
            }
        });

        codigo_txt.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        codigo_txt.setForeground(new java.awt.Color(0, 0, 0));
        codigo_txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        codigo_txt.setCaretColor(new java.awt.Color(0, 0, 0));
        codigo_txt.setEnabled(false);
        codigo_txt.setOpaque(false);

        codigo_lbl.setFont(new java.awt.Font("Candara Light", 1, 18)); // NOI18N
        codigo_lbl.setForeground(new java.awt.Color(0, 0, 102));
        codigo_lbl.setText("Código");

        atras_lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_left_2_24px.png"))); // NOI18N
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
                        .addComponent(gm_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(titulo_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(atras_lbl))
                    .addGroup(blanco_pnlLayout.createSequentialGroup()
                        .addComponent(cargos_scroll, javax.swing.GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(blanco_pnlLayout.createSequentialGroup()
                                .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nombre_lbl)
                                    .addComponent(dpto_lbl)
                                    .addComponent(dpto_nombre_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                                    .addComponent(nombre_txt))
                                .addGap(17, 17, 17)
                                .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(codigo_txt)
                                    .addGroup(blanco_pnlLayout.createSequentialGroup()
                                        .addComponent(codigo_lbl)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(dtos_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(editar_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(borrar_btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        blanco_pnlLayout.setVerticalGroup(
            blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(blanco_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(gm_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(titulo_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(atras_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cargos_scroll, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE)
                    .addGroup(blanco_pnlLayout.createSequentialGroup()
                        .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(blanco_pnlLayout.createSequentialGroup()
                                .addComponent(codigo_lbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(codigo_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(blanco_pnlLayout.createSequentialGroup()
                                .addComponent(nombre_lbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nombre_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(12, 12, 12)
                        .addComponent(dpto_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dpto_nombre_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dtos_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(editar_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(borrar_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void borrar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrar_btnActionPerformed
        //ELIMINAR EL PUESTO DE TRABAJO SELECCIONADO
      String cod = codigo_txt.getText();
      String borrar = "DELETE FROM puestos WHERE id = "+cod;
       PreparedStatement pssb;
      try{
           pssb = cnn.prepareStatement(borrar);
                  pssb.executeUpdate();
                  
                  cargar();
            JOptionPane.showMessageDialog(null,"Eliminado");  
      }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "error " + ex);
      }
    }//GEN-LAST:event_borrar_btnActionPerformed

    private void dtos_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dtos_btnActionPerformed
        //MOSTRAR DEPARTAMENTOS
          dptos_2 frame = new dptos_2();
        frame.setVisible(true);
    }//GEN-LAST:event_dtos_btnActionPerformed

    private void cargos_tblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cargos_tblMouseClicked
        //LLENAR  TXT
        try{
            
            String nom = (String) puestos.getValueAt(cargos_tbl.getSelectedRow(), 0);
            String cod = (String) puestos.getValueAt(cargos_tbl.getSelectedRow(), 1);
            String dpt = (String) puestos.getValueAt(cargos_tbl.getSelectedRow(), 2);
            
            
            nombre_txt.setText(nom);
            codigo_txt.setText(cod);
            dpto_nombre_txt.setText(dpt);
           
            
        }catch(Exception ex){
             JOptionPane.showMessageDialog(null, "error " + ex);
        }
    }//GEN-LAST:event_cargos_tblMouseClicked

    private void editar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editar_btnActionPerformed
        //EDITAR EL PUESTO SELECCIONADO
          String cod = codigo_txt.getText();
            String nom  = nombre_txt.getText();
            String dep = dpto_nombre_txt.getText();
            
             PreparedStatement pss;
            String mod = "UPDATE puestos SET cargo = '"+nom+"', nombre_dpto = '"+dep+"' WHERE id = '"+cod+"';";
            try{
                  pss = cnn.prepareStatement(mod);
                  pss.executeUpdate();
                  
                  cargar();
            JOptionPane.showMessageDialog(null,"Actualización exitosa");
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, "error " + ex);
            }
    }//GEN-LAST:event_editar_btnActionPerformed

    private void atras_lblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atras_lblMouseClicked
        //ATRAS
  
    }//GEN-LAST:event_atras_lblMouseClicked

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
            java.util.logging.Logger.getLogger(consult_cargo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(consult_cargo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(consult_cargo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(consult_cargo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new consult_cargo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel atras_lbl;
    private javax.swing.JPanel azul_pnl;
    private javax.swing.JPanel blanco_pnl;
    private javax.swing.JButton borrar_btn;
    private javax.swing.JScrollPane cargos_scroll;
    private javax.swing.JTable cargos_tbl;
    private javax.swing.JLabel codigo_lbl;
    private javax.swing.JTextField codigo_txt;
    private javax.swing.JLabel dpto_lbl;
    public static javax.swing.JTextField dpto_nombre_txt;
    private javax.swing.JButton dtos_btn;
    private javax.swing.JButton editar_btn;
    private javax.swing.JLabel gm_lbl;
    private javax.swing.JLabel nombre_lbl;
    private javax.swing.JTextField nombre_txt;
    private javax.swing.JLabel titulo_lbl;
    // End of variables declaration//GEN-END:variables
}
