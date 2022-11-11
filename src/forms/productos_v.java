package forms;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class productos_v extends javax.swing.JFrame {

    conexion cn = new conexion();
    Connection cnn = cn.conectar();
    DefaultTableModel producto;

    public productos_v() {
        initComponents();
        this.setExtendedState(productos_v.MAXIMIZED_BOTH);
        this.producto = (DefaultTableModel) productos_tbl.getModel();
        tbl();
    }

    //REFRESCAR LA TABLA
    public void refrescar() {
        try {
            producto.setColumnCount(0);
            producto.setRowCount(0);
            productos_tbl.revalidate();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error " + ex);
        }
    }

    //MOSTRAR LOS PRODUCTOS
    public final void tbl() {

        refrescar();

        producto.addColumn("Código");
        producto.addColumn("Nombre");
        producto.addColumn("Estilo");
        producto.addColumn("Size");
        producto.addColumn("Color");
        producto.addColumn("Precio");
        producto.addColumn("proceso");

        this.productos_tbl.setModel(producto);
        String consul;
        consul = "SELECT * FROM producto";

        String[] datos = new String[7];
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

                producto.addRow(datos);

            }

            productos_tbl.setModel(producto);
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
        grupom_lbl = new javax.swing.JLabel();
        atras_lbl = new javax.swing.JLabel();
        titulo_lbl = new javax.swing.JLabel();
        scroll = new javax.swing.JScrollPane();
        productos_tbl = new javax.swing.JTable();
        editar_lbl = new javax.swing.JLabel();
        cod_txt = new javax.swing.JTextField();
        size_lbl = new javax.swing.JLabel();
        size_txt = new javax.swing.JTextField();
        cod_lbl = new javax.swing.JLabel();
        nombre_txt = new javax.swing.JTextField();
        precio_lbl = new javax.swing.JLabel();
        precio_txt = new javax.swing.JTextField();
        nombre_lbl = new javax.swing.JLabel();
        color_txt = new javax.swing.JTextField();
        color_lbl = new javax.swing.JLabel();
        estado_box = new javax.swing.JComboBox<>();
        estado_lbl = new javax.swing.JLabel();
        guardar_btn = new javax.swing.JButton();
        img_lbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("PRODUCTOS");
        setIconImage(
            new ImageIcon(getClass().getResource("/imgs/logo.png")).getImage());
        setLocationByPlatform(true);

        azul_pnl.setBackground(new java.awt.Color(8, 41, 138));

        blanco_pnl.setBackground(new java.awt.Color(255, 255, 255));

        grupom_lbl.setFont(new java.awt.Font("Candara Light", 1, 24)); // NOI18N
        grupom_lbl.setForeground(new java.awt.Color(0, 0, 102));
        grupom_lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/logo - 24x24.png"))); // NOI18N
        grupom_lbl.setText("Grupo M");

        atras_lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_undo_24px.png"))); // NOI18N
        atras_lbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                atras_lblMouseClicked(evt);
            }
        });

        titulo_lbl.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        titulo_lbl.setForeground(new java.awt.Color(0, 0, 102));
        titulo_lbl.setText("Consultar productos");

        productos_tbl.setBackground(new java.awt.Color(255, 255, 255));
        productos_tbl.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        productos_tbl.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        productos_tbl.setForeground(new java.awt.Color(0, 0, 102));
        productos_tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        productos_tbl.setEditingColumn(0);
        productos_tbl.setEditingRow(0);
        productos_tbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productos_tblMouseClicked(evt);
            }
        });
        scroll.setViewportView(productos_tbl);

        editar_lbl.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        editar_lbl.setForeground(new java.awt.Color(0, 0, 102));
        editar_lbl.setText("Editar");

        cod_txt.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        cod_txt.setForeground(new java.awt.Color(0, 0, 0));
        cod_txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        cod_txt.setEnabled(false);
        cod_txt.setOpaque(false);

        size_lbl.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        size_lbl.setForeground(new java.awt.Color(0, 0, 102));
        size_lbl.setText("Size");

        size_txt.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        size_txt.setForeground(new java.awt.Color(0, 0, 0));
        size_txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        size_txt.setOpaque(false);

        cod_lbl.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        cod_lbl.setForeground(new java.awt.Color(0, 0, 102));
        cod_lbl.setText("Código");

        nombre_txt.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        nombre_txt.setForeground(new java.awt.Color(0, 0, 0));
        nombre_txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        nombre_txt.setOpaque(false);

        precio_lbl.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        precio_lbl.setForeground(new java.awt.Color(0, 0, 102));
        precio_lbl.setText("Precio");

        precio_txt.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        precio_txt.setForeground(new java.awt.Color(0, 0, 0));
        precio_txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        precio_txt.setOpaque(false);

        nombre_lbl.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        nombre_lbl.setForeground(new java.awt.Color(0, 0, 102));
        nombre_lbl.setText("Nombre");

        color_txt.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        color_txt.setForeground(new java.awt.Color(0, 0, 0));
        color_txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        color_txt.setOpaque(false);

        color_lbl.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        color_lbl.setForeground(new java.awt.Color(0, 0, 102));
        color_lbl.setText("Color");

        estado_box.setBackground(new java.awt.Color(255, 255, 255));
        estado_box.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        estado_box.setForeground(new java.awt.Color(0, 0, 0));
        estado_box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Procesando", "Corte", "Costura", "Terminación", "Lavado", "Empaque", "Despacho" }));

        estado_lbl.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        estado_lbl.setForeground(new java.awt.Color(0, 0, 102));
        estado_lbl.setText("Estado");

        guardar_btn.setFont(new java.awt.Font("Candara Light", 1, 24)); // NOI18N
        guardar_btn.setForeground(new java.awt.Color(0, 0, 102));
        guardar_btn.setText("Guardar cambios");
        guardar_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        guardar_btn.setContentAreaFilled(false);
        guardar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardar_btnActionPerformed(evt);
            }
        });

        img_lbl.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 102), 1, true));

        javax.swing.GroupLayout blanco_pnlLayout = new javax.swing.GroupLayout(blanco_pnl);
        blanco_pnl.setLayout(blanco_pnlLayout);
        blanco_pnlLayout.setHorizontalGroup(
            blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(blanco_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(blanco_pnlLayout.createSequentialGroup()
                        .addComponent(grupom_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(titulo_lbl)
                        .addGap(204, 204, 204))
                    .addGroup(blanco_pnlLayout.createSequentialGroup()
                        .addComponent(scroll, javax.swing.GroupLayout.DEFAULT_SIZE, 783, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(blanco_pnlLayout.createSequentialGroup()
                        .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cod_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(editar_lbl)
                            .addComponent(cod_lbl))
                        .addGap(18, 18, 18)
                        .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombre_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombre_lbl))
                        .addGap(18, 18, 18)
                        .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(blanco_pnlLayout.createSequentialGroup()
                                .addComponent(precio_lbl)
                                .addGap(0, 246, Short.MAX_VALUE))
                            .addComponent(precio_txt)))
                    .addGroup(blanco_pnlLayout.createSequentialGroup()
                        .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(size_lbl)
                            .addComponent(size_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(color_txt)
                            .addGroup(blanco_pnlLayout.createSequentialGroup()
                                .addComponent(color_lbl)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, blanco_pnlLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(atras_lbl))
                    .addGroup(blanco_pnlLayout.createSequentialGroup()
                        .addComponent(estado_lbl)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(guardar_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(estado_box, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(img_lbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        blanco_pnlLayout.setVerticalGroup(
            blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(blanco_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(titulo_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(grupom_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(atras_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(blanco_pnlLayout.createSequentialGroup()
                        .addComponent(img_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(editar_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cod_lbl)
                            .addComponent(precio_lbl)
                            .addComponent(nombre_lbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cod_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombre_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(precio_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(color_lbl)
                            .addComponent(size_lbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(color_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(size_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(estado_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(estado_box, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(guardar_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE))
                    .addComponent(scroll))
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

    private void guardar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardar_btnActionPerformed
        //BOTÓN PARA GUARDAR LOS CAMBIOS
        String codigo = cod_txt.getText();
        String nombre = nombre_txt.getText();
        String precio = precio_txt.getText();
        String size = size_txt.getText();
        String color = color_txt.getText();
        String estado = estado_box.getSelectedItem().toString();

        String query = "UPDATE producto SET nombre = '" + nombre + "', size = '" + size + "', color = '" + color + "', Precio = '" + precio + "', proceso_proc = '" + estado + "' WHERE Codigo_producto = " + codigo + ";";

        try {
            PreparedStatement prst = cnn.prepareStatement(query);

            tbl();
            prst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Guardado");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "error " + ex);
        }
    }//GEN-LAST:event_guardar_btnActionPerformed

    private void productos_tblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productos_tblMouseClicked
        //LLENAR TEXTFIELDS

        try {
            String cod = (String) producto.getValueAt(productos_tbl.getSelectedRow(), 0);
            String nom = (String) producto.getValueAt(productos_tbl.getSelectedRow(), 1);
            String size = (String) producto.getValueAt(productos_tbl.getSelectedRow(), 3);
            String color = (String) producto.getValueAt(productos_tbl.getSelectedRow(), 4);
            String prec = (String) producto.getValueAt(productos_tbl.getSelectedRow(), 5);
            String proc = (String) producto.getValueAt(productos_tbl.getSelectedRow(), 6);

            cod_txt.setText(cod);
            nombre_txt.setText(nom);
            precio_txt.setText(prec);
            size_txt.setText(size);
            color_txt.setText(color);
            estado_box.setSelectedItem(proc);

            getImagenes();
           
              
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "error " + ex);
        }

    }//GEN-LAST:event_productos_tblMouseClicked

    private void atras_lblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atras_lblMouseClicked
        ventas newframe = new ventas();
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_atras_lblMouseClicked

    ArrayList < Imagen > getImagenes(){
       
          
        String cod = (String) producto.getValueAt(productos_tbl.getSelectedRow(), 0);
        ArrayList <Imagen> lista =  new ArrayList();
        try{
           Statement st = cnn.createStatement();
            ResultSet rs = st.executeQuery("SELECT estilo FROM producto WHERE Codigo_producto  = " + cod);
            while(rs.next()){
                Imagen imagen = new Imagen();
                Blob blob = rs.getBlob("estilo");
                byte[] data =  blob.getBytes(1, (int)blob.length());
                BufferedImage img = null;
                try{
                    img = ImageIO.read(new ByteArrayInputStream(data));
                }catch(IOException exi){
                    Logger.getLogger(productos_v.class.getName()).log(Level.SEVERE, null, exi);
                }
                


            imagen.setImagen(img);
            lista.add(imagen);
                
                img_lbl.setIcon(new ImageIcon(img.getScaledInstance(img_lbl.getWidth(),img_lbl.getHeight(),img.SCALE_DEFAULT)));
            }
            rs.close();
        }catch(SQLException ex){
             Logger.getLogger(productos_v.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }

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
            java.util.logging.Logger.getLogger(productos_v.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(productos_v.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(productos_v.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(productos_v.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new productos_v().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel atras_lbl;
    private javax.swing.JPanel azul_pnl;
    private javax.swing.JPanel blanco_pnl;
    private javax.swing.JLabel cod_lbl;
    private javax.swing.JTextField cod_txt;
    private javax.swing.JLabel color_lbl;
    private javax.swing.JTextField color_txt;
    private javax.swing.JLabel editar_lbl;
    private javax.swing.JComboBox<String> estado_box;
    private javax.swing.JLabel estado_lbl;
    private javax.swing.JLabel grupom_lbl;
    private javax.swing.JButton guardar_btn;
    private javax.swing.JLabel img_lbl;
    private javax.swing.JLabel nombre_lbl;
    private javax.swing.JTextField nombre_txt;
    private javax.swing.JLabel precio_lbl;
    private javax.swing.JTextField precio_txt;
    private javax.swing.JTable productos_tbl;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JLabel size_lbl;
    private javax.swing.JTextField size_txt;
    private javax.swing.JLabel titulo_lbl;
    // End of variables declaration//GEN-END:variables

    public class Imagen{
    Image imagen;
    public void setImagen(Image imagen){
        this.imagen = imagen;
    }
    
    public Image getImagen(){
        return imagen;
    }
  
    }
}


