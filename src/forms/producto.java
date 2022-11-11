package forms;

import java.io.File;
import java.io.FileInputStream;
import javax.swing.*;
import java.sql.*;

public class producto extends javax.swing.JFrame {

    conexion sin = new conexion();
    Connection son = sin.conectar();

    public producto() {
        initComponents();
//        this.setExtendedState(producto.MAXIMIZED_BOTH);
    }

    //METODO PARA OBTENER IMAGENES
    public void archivo() {
        JFileChooser archivo = new JFileChooser();
        int ventana = archivo.showOpenDialog(null);
        if (ventana == JFileChooser.APPROVE_OPTION) {
            File fal = archivo.getSelectedFile();
            ruta_txt.setText(String.valueOf(fal));
        }
    }

    //METODO PARA INSERTAR PRODUCTOS
    public void agregar() {

        FileInputStream archivof;
        String consulta = "INSERT INTO `producto` (`nombre`, `estilo`, `size`, `color`, `Precio`, `moneda`, `proceso_proc`, `descripcion`, coste_produccion) VALUES (?,?,?,?,?,?,?,?,?)";
        String proceso = "Procesando";

        try {
            PreparedStatement prst = son.prepareStatement(consulta);
            archivof = new FileInputStream(ruta_txt.getText());
            prst.setString(1, producto_txt.getText());
            prst.setBinaryStream(2, archivof);
            prst.setString(3, size_txt.getText());
            prst.setString(4, color_txt.getText());
            prst.setString(5, precio_txt.getText());
            prst.setString(6, moneda_box.getSelectedItem().toString());
            prst.setString(7, proceso);
            prst.setString(8, descr_txt.getText());
            prst.setString(9, coste_prod_txt.getText());

            prst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Exitoso");

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "error " + ex.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        azul_panel = new javax.swing.JPanel();
        blanco_pnl = new javax.swing.JPanel();
        titulo_lbl = new javax.swing.JLabel();
        size_logo = new javax.swing.JLabel();
        producto_logo = new javax.swing.JLabel();
        color_logo = new javax.swing.JLabel();
        precio_logo = new javax.swing.JLabel();
        estilo_logo = new javax.swing.JLabel();
        producto_txt = new javax.swing.JTextField();
        size_txt = new javax.swing.JTextField();
        color_txt = new javax.swing.JTextField();
        ruta_txt = new javax.swing.JTextField();
        select_ar = new javax.swing.JButton();
        enviar_btn = new javax.swing.JButton();
        precio_txt = new javax.swing.JTextField();
        desc_logo = new javax.swing.JLabel();
        descr_txt = new javax.swing.JTextField();
        moneda_box = new javax.swing.JComboBox<>();
        coste_prod_lbl = new javax.swing.JLabel();
        coste_prod_txt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Insertar pedidos");
        setIconImage(new ImageIcon(getClass().getResource("/imgs/logo.png")).getImage());
        setIconImages(getIconImages());
        setLocationByPlatform(true);
        setName("Insertar productos"); // NOI18N
        setResizable(false);

        azul_panel.setBackground(new java.awt.Color(8, 41, 138));

        blanco_pnl.setBackground(new java.awt.Color(255, 255, 255));

        titulo_lbl.setFont(new java.awt.Font("Candara Light", 1, 24)); // NOI18N
        titulo_lbl.setForeground(new java.awt.Color(9, 0, 100));
        titulo_lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/logo - 24x24.png"))); // NOI18N
        titulo_lbl.setText("Grupo M");

        size_logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        size_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_page_size_24px.png"))); // NOI18N
        size_logo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        producto_logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        producto_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_product_24px.png"))); // NOI18N
        producto_logo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        color_logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        color_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_fill_drip_24px.png"))); // NOI18N
        color_logo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        precio_logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        precio_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_expensive_price_24px.png"))); // NOI18N
        precio_logo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        estilo_logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        estilo_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_bag_interior_24px.png"))); // NOI18N
        estilo_logo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        producto_txt.setFont(new java.awt.Font("Candara Light", 0, 24)); // NOI18N
        producto_txt.setForeground(new java.awt.Color(0, 0, 0));
        producto_txt.setText("Productos");
        producto_txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        producto_txt.setOpaque(false);
        producto_txt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                producto_txtMousePressed(evt);
            }
        });

        size_txt.setFont(new java.awt.Font("Candara Light", 0, 24)); // NOI18N
        size_txt.setForeground(new java.awt.Color(0, 0, 0));
        size_txt.setText("Size");
        size_txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        size_txt.setOpaque(false);
        size_txt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                size_txtMousePressed(evt);
            }
        });

        color_txt.setFont(new java.awt.Font("Candara Light", 0, 24)); // NOI18N
        color_txt.setForeground(new java.awt.Color(0, 0, 0));
        color_txt.setText("Color");
        color_txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        color_txt.setOpaque(false);
        color_txt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                color_txtMousePressed(evt);
            }
        });

        ruta_txt.setFont(new java.awt.Font("Candara Light", 0, 24)); // NOI18N
        ruta_txt.setForeground(new java.awt.Color(0, 0, 0));
        ruta_txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        ruta_txt.setOpaque(false);

        select_ar.setFont(new java.awt.Font("Candara Light", 0, 24)); // NOI18N
        select_ar.setForeground(new java.awt.Color(0, 0, 102));
        select_ar.setText("Diseño");
        select_ar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        select_ar.setContentAreaFilled(false);
        select_ar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        select_ar.setFocusPainted(false);
        select_ar.setFocusable(false);
        select_ar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                select_arActionPerformed(evt);
            }
        });

        enviar_btn.setFont(new java.awt.Font("Candara Light", 1, 24)); // NOI18N
        enviar_btn.setForeground(new java.awt.Color(0, 0, 51));
        enviar_btn.setText("Insertar el producto");
        enviar_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        enviar_btn.setContentAreaFilled(false);
        enviar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviar_btnActionPerformed(evt);
            }
        });

        precio_txt.setFont(new java.awt.Font("Candara Light", 0, 24)); // NOI18N
        precio_txt.setForeground(new java.awt.Color(0, 0, 0));
        precio_txt.setText("Precio");
        precio_txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        precio_txt.setOpaque(false);
        precio_txt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                precio_txtMousePressed(evt);
            }
        });

        desc_logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        desc_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_document_24px.png"))); // NOI18N
        desc_logo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        descr_txt.setFont(new java.awt.Font("Candara Light", 0, 24)); // NOI18N
        descr_txt.setForeground(new java.awt.Color(0, 0, 0));
        descr_txt.setText("Descripción");
        descr_txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        descr_txt.setOpaque(false);
        descr_txt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                descr_txtMousePressed(evt);
            }
        });

        moneda_box.setBackground(new java.awt.Color(255, 255, 255));
        moneda_box.setFont(new java.awt.Font("Candara Light", 0, 24)); // NOI18N
        moneda_box.setForeground(new java.awt.Color(0, 0, 0));
        moneda_box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "USD", "DOP" }));
        moneda_box.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        moneda_box.setOpaque(false);

        coste_prod_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        coste_prod_lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_expensive_price_24px.png"))); // NOI18N
        coste_prod_lbl.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        coste_prod_txt.setFont(new java.awt.Font("Candara Light", 0, 24)); // NOI18N
        coste_prod_txt.setForeground(new java.awt.Color(0, 0, 0));
        coste_prod_txt.setText("Coste de producción");
        coste_prod_txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        coste_prod_txt.setOpaque(false);
        coste_prod_txt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                coste_prod_txtMousePressed(evt);
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
                        .addComponent(titulo_lbl)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, blanco_pnlLayout.createSequentialGroup()
                        .addComponent(color_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(color_txt))
                    .addGroup(blanco_pnlLayout.createSequentialGroup()
                        .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(estilo_logo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(precio_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(blanco_pnlLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(select_ar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ruta_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(blanco_pnlLayout.createSequentialGroup()
                                .addComponent(precio_txt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(moneda_box, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(blanco_pnlLayout.createSequentialGroup()
                        .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(size_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(producto_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(producto_txt)
                            .addComponent(size_txt)))
                    .addComponent(enviar_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(blanco_pnlLayout.createSequentialGroup()
                        .addComponent(desc_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(descr_txt))
                    .addGroup(blanco_pnlLayout.createSequentialGroup()
                        .addComponent(coste_prod_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(coste_prod_txt)))
                .addContainerGap())
        );
        blanco_pnlLayout.setVerticalGroup(
            blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(blanco_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(producto_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(producto_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(size_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(size_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(color_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(color_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(precio_logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(precio_txt)
                    .addComponent(moneda_box))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ruta_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(estilo_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(select_ar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(desc_logo, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(descr_txt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(coste_prod_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(coste_prod_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(enviar_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout azul_panelLayout = new javax.swing.GroupLayout(azul_panel);
        azul_panel.setLayout(azul_panelLayout);
        azul_panelLayout.setHorizontalGroup(
            azul_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(azul_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(blanco_pnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        azul_panelLayout.setVerticalGroup(
            azul_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(azul_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(blanco_pnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(azul_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(azul_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //BOTON PARA SELECCIONAR LA IMG DEL PRODUCTO
    private void select_arActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_select_arActionPerformed
        archivo();
    }//GEN-LAST:event_select_arActionPerformed

    //BOTON PARA INSERTAR LOS PRODUCTOS EN LA BDD
    private void enviar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviar_btnActionPerformed
        agregar();
    }//GEN-LAST:event_enviar_btnActionPerformed

    private void producto_txtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_producto_txtMousePressed
        //VACIAR producto_txt
        if ("Productos".equals(producto_txt.getText())) {
            producto_txt.setText("");
        }
    }//GEN-LAST:event_producto_txtMousePressed

    private void size_txtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_size_txtMousePressed
        //VACIAR size_txt
        if ("Size".equals(size_txt.getText())) {
            size_txt.setText("");
        }
    }//GEN-LAST:event_size_txtMousePressed

    private void color_txtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_color_txtMousePressed
        //VACIAR color_txt
        if ("Color".equals(color_txt.getText())) {
            color_txt.setText("");
        }
    }//GEN-LAST:event_color_txtMousePressed

    private void precio_txtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_precio_txtMousePressed
        //VACIAR precio_txt
        if ("Precio".equals(precio_txt.getText())) {
            precio_txt.setText("");
        }
    }//GEN-LAST:event_precio_txtMousePressed

    private void descr_txtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_descr_txtMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_descr_txtMousePressed

    private void coste_prod_txtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_coste_prod_txtMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_coste_prod_txtMousePressed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new producto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel azul_panel;
    private javax.swing.JPanel blanco_pnl;
    private javax.swing.JLabel color_logo;
    private javax.swing.JTextField color_txt;
    private javax.swing.JLabel coste_prod_lbl;
    private javax.swing.JTextField coste_prod_txt;
    private javax.swing.JLabel desc_logo;
    private javax.swing.JTextField descr_txt;
    private javax.swing.JButton enviar_btn;
    private javax.swing.JLabel estilo_logo;
    private javax.swing.JComboBox<String> moneda_box;
    private javax.swing.JLabel precio_logo;
    private javax.swing.JTextField precio_txt;
    private javax.swing.JLabel producto_logo;
    private javax.swing.JTextField producto_txt;
    private javax.swing.JTextField ruta_txt;
    private javax.swing.JButton select_ar;
    private javax.swing.JLabel size_logo;
    private javax.swing.JTextField size_txt;
    private javax.swing.JLabel titulo_lbl;
    // End of variables declaration//GEN-END:variables
}
