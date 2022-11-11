
package forms;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class proveedores extends javax.swing.JFrame {

    DefaultTableModel prov;
    conexion cn = new conexion();
    Connection cnn = cn.conectar();
    
    public proveedores() {
        initComponents();
        this.prov = (DefaultTableModel) prov_tbl.getModel();
        cargar();
    }
    
    //MOSTRAR DATOS
    public void cargar() {
        ref();

        prov.addColumn("Id");
        prov.addColumn("Nombre");
        prov.addColumn("RNC");
        prov.addColumn("Reg mercantil");
        prov.addColumn("Teléfono");
        prov.addColumn("Ventas");
        prov.addColumn("Tel cuentas por cobrar");
        prov.addColumn("Servicios");
        

        this.prov_tbl.setModel(prov);
        String consul;
        consul = "SELECT * FROM provedor;";

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
               
                prov.addRow(datos);

            }

            prov_tbl.setModel(prov);
        } catch (SQLException ex) {
            Logger.getLogger(log_form.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "error " + ex);
        }

    }

    public void ref() {
        try {
            prov.setColumnCount(0);
            prov.setRowCount(0);
            prov_tbl.revalidate();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error " + ex);
        }
    }

    public void insert(){
        //INSERTAR LOS DATOS
        String rnc = rnc_txt.getText();
        String nomb = nombre_txt.getText();
        String rem = reg_mer_txt.getText();
        String tele = tel_txt.getText();
        String cv = ventas_txt.getText();
        String ccp = cuentasc_txt.getText();
        String serp = serv_pro_txt.getText();
        
        String query = "INSERT INTO provedor (Nombre, rnc, registro_mercantil, teléfono, contacto_vendedor, contacto_cuenta_cobrar, servicio) VALUES('"+nomb+"', '"+rnc+"', '"+rem+"', '"+tele+"', '"+cv+"', '"+ccp+"', '"+serp+"')";
        
        try{
             PreparedStatement prst = cnn.prepareStatement(query);
            prst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Exitoso");
            cargar();

        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "error " + e.getMessage());
        
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        gm_lbl = new javax.swing.JLabel();
        titulo_lbl = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        prov_tbl = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        rnc_txt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        nombre_txt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        reg_mer_txt = new javax.swing.JTextField();
        tel_txt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ventas_txt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        serv_pro_txt = new javax.swing.JTextField();
        guardar_btn = new javax.swing.JButton();
        borrar_btn = new javax.swing.JButton();
        id_borrar_txt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cuentasc_txt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(8, 41, 138));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        gm_lbl.setFont(new java.awt.Font("Candara Light", 1, 24)); // NOI18N
        gm_lbl.setForeground(new java.awt.Color(0, 0, 102));
        gm_lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/logo - 24x24.png"))); // NOI18N
        gm_lbl.setText("Grupo M");

        titulo_lbl.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        titulo_lbl.setForeground(new java.awt.Color(9, 0, 100));
        titulo_lbl.setText("Proveedores");

        prov_tbl.setBackground(new java.awt.Color(255, 255, 255));
        prov_tbl.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        prov_tbl.setForeground(new java.awt.Color(0, 0, 0));
        prov_tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(prov_tbl);

        jLabel1.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("RNC");

        rnc_txt.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        rnc_txt.setForeground(new java.awt.Color(0, 0, 0));
        rnc_txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        rnc_txt.setOpaque(false);

        jLabel2.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 102));
        jLabel2.setText("Nombre");

        nombre_txt.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        nombre_txt.setForeground(new java.awt.Color(0, 0, 0));
        nombre_txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        nombre_txt.setOpaque(false);

        jLabel3.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 102));
        jLabel3.setText("Registro mercantil");

        reg_mer_txt.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        reg_mer_txt.setForeground(new java.awt.Color(0, 0, 0));
        reg_mer_txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        reg_mer_txt.setOpaque(false);

        tel_txt.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        tel_txt.setForeground(new java.awt.Color(0, 0, 0));
        tel_txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        tel_txt.setOpaque(false);

        jLabel4.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 102));
        jLabel4.setText("Teléfono");

        jLabel5.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 102));
        jLabel5.setText("Contacto dpto ventas");

        ventas_txt.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        ventas_txt.setForeground(new java.awt.Color(0, 0, 0));
        ventas_txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        ventas_txt.setOpaque(false);

        jLabel6.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 102));
        jLabel6.setText("Servicio/producto");

        serv_pro_txt.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        serv_pro_txt.setForeground(new java.awt.Color(0, 0, 0));
        serv_pro_txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        serv_pro_txt.setOpaque(false);

        guardar_btn.setBackground(new java.awt.Color(255, 255, 255));
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

        borrar_btn.setBackground(new java.awt.Color(255, 255, 255));
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

        id_borrar_txt.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        id_borrar_txt.setForeground(new java.awt.Color(102, 0, 0));
        id_borrar_txt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 0)));
        id_borrar_txt.setOpaque(false);

        jLabel7.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 102));
        jLabel7.setText("Contacto cuentas por cobrar");

        cuentasc_txt.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        cuentasc_txt.setForeground(new java.awt.Color(0, 0, 0));
        cuentasc_txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        cuentasc_txt.setOpaque(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 646, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rnc_txt)
                            .addComponent(nombre_txt)
                            .addComponent(reg_mer_txt)
                            .addComponent(tel_txt)
                            .addComponent(ventas_txt)
                            .addComponent(guardar_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(id_borrar_txt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(borrar_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cuentasc_txt)
                            .addComponent(serv_pro_txt)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6))
                                .addGap(0, 63, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(gm_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(titulo_lbl)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gm_lbl)
                    .addComponent(titulo_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rnc_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nombre_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(reg_mer_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tel_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ventas_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cuentasc_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(serv_pro_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(guardar_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(borrar_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                            .addComponent(id_borrar_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void borrar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrar_btnActionPerformed
      //BORRAR PROVEEDOR
    }//GEN-LAST:event_borrar_btnActionPerformed

    private void guardar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardar_btnActionPerformed
        //BOTÓN PARA INSERTAR LOS DATOS
        insert();
    }//GEN-LAST:event_guardar_btnActionPerformed

  
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
            java.util.logging.Logger.getLogger(proveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(proveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(proveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(proveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new proveedores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton borrar_btn;
    private javax.swing.JTextField cuentasc_txt;
    private javax.swing.JLabel gm_lbl;
    private javax.swing.JButton guardar_btn;
    private javax.swing.JTextField id_borrar_txt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nombre_txt;
    private javax.swing.JTable prov_tbl;
    private javax.swing.JTextField reg_mer_txt;
    private javax.swing.JTextField rnc_txt;
    private javax.swing.JTextField serv_pro_txt;
    private javax.swing.JTextField tel_txt;
    private javax.swing.JLabel titulo_lbl;
    private javax.swing.JTextField ventas_txt;
    // End of variables declaration//GEN-END:variables
}
