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

public class ventas extends javax.swing.JFrame {

    public ventas() {
        initComponents();
        //EJECUTAR MAXIMIZADA
        this.setExtendedState(ventas.MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gm_lbl = new javax.swing.JLabel();
        jScrollBar1 = new javax.swing.JScrollBar();
        azul_pnl = new javax.swing.JPanel();
        blanco_pnl = new javax.swing.JPanel();
        add_producto_lbl = new javax.swing.JLabel();
        ver_producto_lbl = new javax.swing.JLabel();
        reporte_producto_lbl = new javax.swing.JLabel();
        ver_cliente_lbl = new javax.swing.JLabel();
        ver_pedido_lbl = new javax.swing.JLabel();
        añadir_pedido_lbl = new javax.swing.JLabel();
        pedido_tit_lbl = new javax.swing.JLabel();
        pedido_sep = new javax.swing.JSeparator();
        producto_tit_lbl = new javax.swing.JLabel();
        producto_sep = new javax.swing.JSeparator();
        cliente_tit_lbl = new javax.swing.JLabel();
        cliente_sep = new javax.swing.JSeparator();
        editar_cliente_lbl = new javax.swing.JLabel();
        reporte_cliente_lbl = new javax.swing.JLabel();
        editar_pedido_lbl = new javax.swing.JLabel();
        cerrar_sesion_lbl_btn = new javax.swing.JLabel();
        facturar_lbl_btn = new javax.swing.JLabel();
        pedidos_facturados_lbl_btn = new javax.swing.JLabel();
        gm_lbl2 = new javax.swing.JLabel();
        titulo_lbl = new javax.swing.JLabel();

        gm_lbl.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        gm_lbl.setForeground(new java.awt.Color(0, 0, 102));
        gm_lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/logo - 24x24.png"))); // NOI18N
        gm_lbl.setText("Grupo M");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ventas");
        setIconImage(
            new ImageIcon(getClass().getResource("/imgs/logo.png")).getImage());
        setLocationByPlatform(true);

        azul_pnl.setBackground(new java.awt.Color(8, 41, 138));

        blanco_pnl.setBackground(new java.awt.Color(255, 255, 255));

        add_producto_lbl.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        add_producto_lbl.setForeground(new java.awt.Color(0, 0, 102));
        add_producto_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add_producto_lbl.setText("Añadir");
        add_producto_lbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        add_producto_lbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add_producto_lblMouseClicked(evt);
            }
        });

        ver_producto_lbl.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        ver_producto_lbl.setForeground(new java.awt.Color(0, 0, 102));
        ver_producto_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ver_producto_lbl.setText("Consultar");
        ver_producto_lbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        ver_producto_lbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ver_producto_lblMouseClicked(evt);
            }
        });

        reporte_producto_lbl.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        reporte_producto_lbl.setForeground(new java.awt.Color(0, 0, 102));
        reporte_producto_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        reporte_producto_lbl.setText("Reporte");
        reporte_producto_lbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        reporte_producto_lbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reporte_producto_lblMouseClicked(evt);
            }
        });

        ver_cliente_lbl.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        ver_cliente_lbl.setForeground(new java.awt.Color(0, 0, 102));
        ver_cliente_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ver_cliente_lbl.setText("Clientes");
        ver_cliente_lbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        ver_cliente_lbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ver_cliente_lblMouseClicked(evt);
            }
        });

        ver_pedido_lbl.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        ver_pedido_lbl.setForeground(new java.awt.Color(0, 0, 102));
        ver_pedido_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ver_pedido_lbl.setText("Pedidos");
        ver_pedido_lbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        ver_pedido_lbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ver_pedido_lblMouseClicked(evt);
            }
        });

        añadir_pedido_lbl.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        añadir_pedido_lbl.setForeground(new java.awt.Color(0, 0, 102));
        añadir_pedido_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        añadir_pedido_lbl.setText("Añadir pedidos");
        añadir_pedido_lbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        añadir_pedido_lbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                añadir_pedido_lblMouseClicked(evt);
            }
        });

        pedido_tit_lbl.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        pedido_tit_lbl.setForeground(new java.awt.Color(0, 0, 102));
        pedido_tit_lbl.setText("Pedidos");

        producto_tit_lbl.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        producto_tit_lbl.setForeground(new java.awt.Color(0, 0, 102));
        producto_tit_lbl.setText("Productos");

        cliente_tit_lbl.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        cliente_tit_lbl.setForeground(new java.awt.Color(0, 0, 102));
        cliente_tit_lbl.setText("Clientes");

        editar_cliente_lbl.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        editar_cliente_lbl.setForeground(new java.awt.Color(0, 0, 102));
        editar_cliente_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        editar_cliente_lbl.setText("Editar clientes");
        editar_cliente_lbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        editar_cliente_lbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editar_cliente_lblMouseClicked(evt);
            }
        });

        reporte_cliente_lbl.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        reporte_cliente_lbl.setForeground(new java.awt.Color(0, 0, 102));
        reporte_cliente_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        reporte_cliente_lbl.setText("Reporte");
        reporte_cliente_lbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        reporte_cliente_lbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reporte_cliente_lblMouseClicked(evt);
            }
        });

        editar_pedido_lbl.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        editar_pedido_lbl.setForeground(new java.awt.Color(0, 0, 102));
        editar_pedido_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        editar_pedido_lbl.setText("Editar ");
        editar_pedido_lbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        editar_pedido_lbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editar_pedido_lblMouseClicked(evt);
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

        facturar_lbl_btn.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        facturar_lbl_btn.setForeground(new java.awt.Color(0, 0, 102));
        facturar_lbl_btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        facturar_lbl_btn.setText("Facturar");
        facturar_lbl_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        facturar_lbl_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                facturar_lbl_btnMouseClicked(evt);
            }
        });

        pedidos_facturados_lbl_btn.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        pedidos_facturados_lbl_btn.setForeground(new java.awt.Color(0, 0, 102));
        pedidos_facturados_lbl_btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pedidos_facturados_lbl_btn.setText("Pedidos facturados");
        pedidos_facturados_lbl_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        pedidos_facturados_lbl_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pedidos_facturados_lbl_btnMouseClicked(evt);
            }
        });

        gm_lbl2.setFont(new java.awt.Font("Candara Light", 1, 24)); // NOI18N
        gm_lbl2.setForeground(new java.awt.Color(0, 0, 102));
        gm_lbl2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/logo - 24x24.png"))); // NOI18N
        gm_lbl2.setText("Grupo M");

        titulo_lbl.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        titulo_lbl.setForeground(new java.awt.Color(0, 0, 102));
        titulo_lbl.setText("Ventas");

        javax.swing.GroupLayout blanco_pnlLayout = new javax.swing.GroupLayout(blanco_pnl);
        blanco_pnl.setLayout(blanco_pnlLayout);
        blanco_pnlLayout.setHorizontalGroup(
            blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(blanco_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pedido_sep)
                    .addComponent(editar_pedido_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(blanco_pnlLayout.createSequentialGroup()
                        .addComponent(añadir_pedido_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
                        .addGap(17, 17, 17)
                        .addComponent(ver_pedido_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE))
                    .addComponent(facturar_lbl_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(editar_cliente_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(producto_sep)
                    .addComponent(cliente_sep)
                    .addGroup(blanco_pnlLayout.createSequentialGroup()
                        .addComponent(ver_cliente_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
                        .addGap(17, 17, 17)
                        .addComponent(reporte_cliente_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE))
                    .addComponent(add_producto_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, blanco_pnlLayout.createSequentialGroup()
                        .addComponent(reporte_producto_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
                        .addGap(17, 17, 17)
                        .addComponent(ver_producto_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE))
                    .addComponent(pedidos_facturados_lbl_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cerrar_sesion_lbl_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(blanco_pnlLayout.createSequentialGroup()
                        .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pedido_tit_lbl)
                            .addComponent(producto_tit_lbl)
                            .addComponent(cliente_tit_lbl)
                            .addGroup(blanco_pnlLayout.createSequentialGroup()
                                .addComponent(gm_lbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(titulo_lbl)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        blanco_pnlLayout.setVerticalGroup(
            blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(blanco_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gm_lbl2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(titulo_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pedido_tit_lbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pedido_sep, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(añadir_pedido_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ver_pedido_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editar_pedido_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(facturar_lbl_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(producto_tit_lbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(producto_sep, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reporte_producto_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ver_producto_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(add_producto_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cliente_tit_lbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cliente_sep, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ver_cliente_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reporte_cliente_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editar_cliente_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(pedidos_facturados_lbl_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cerrar_sesion_lbl_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void añadir_pedido_lblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_añadir_pedido_lblMouseClicked
        //PANTALLA DE PEDIDO
        pedido frame = new pedido();
        frame.setVisible(true);
       
    }//GEN-LAST:event_añadir_pedido_lblMouseClicked

    private void ver_pedido_lblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ver_pedido_lblMouseClicked
        // CONSULTAR PEDIDOS
        consult_pedido frame = new consult_pedido();
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ver_pedido_lblMouseClicked

    private void ver_producto_lblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ver_producto_lblMouseClicked
        //PRODUCTOS
        productos_v frame = new productos_v();
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ver_producto_lblMouseClicked

    private void add_producto_lblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_producto_lblMouseClicked
        //AGREGAR PRODUCTOS
        producto frame = new producto();
        frame.setVisible(true);
    
    }//GEN-LAST:event_add_producto_lblMouseClicked

    private void editar_pedido_lblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editar_pedido_lblMouseClicked
        //IR A LA PANTALLA PARA  EDITAR  PEDIDOS
        editar_pedido frame = new editar_pedido();
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_editar_pedido_lblMouseClicked

    private void cerrar_sesion_lbl_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrar_sesion_lbl_btnMouseClicked
        //CERRAR SESION
        log_form fr = new log_form();
        fr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cerrar_sesion_lbl_btnMouseClicked

    private void reporte_producto_lblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reporte_producto_lblMouseClicked
        //REPORTE DE PRODUCTOS
        Connection cn = conexion.conectar();

        try {
            JasperReport jr = (JasperReport) JRLoader.loadObject(ventas.class.getResource("/reportes/producto.jasper"));
            Map parametros = new HashMap<>();
            parametros.put("Titulo", "Reporte producto");

            JasperPrint jp = JasperFillManager.fillReport(jr, parametros, cn);
            JasperViewer jv = new JasperViewer(jp, false);
            jv.setVisible(true);
        } catch (JRException ex) {
            JOptionPane.showMessageDialog(rootPane, ex);
        }

    }//GEN-LAST:event_reporte_producto_lblMouseClicked

    private void ver_cliente_lblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ver_cliente_lblMouseClicked
        //NUEVOS CLIENTES
        cliente_nw frma = new cliente_nw();
        frma.setVisible(true);
      
    }//GEN-LAST:event_ver_cliente_lblMouseClicked

    private void facturar_lbl_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_facturar_lbl_btnMouseClicked
        //FACTURAR PEDIDO
        facturar frame = new facturar();
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_facturar_lbl_btnMouseClicked

    private void reporte_cliente_lblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reporte_cliente_lblMouseClicked
        //REPORTE DE CLIENTES
        Connection cn = conexion.conectar();

        try {
            JasperReport jr = (JasperReport) JRLoader.loadObject(recursos_humanos.class.getResource("/reportes/clientes.jasper"));
            Map parametros = new HashMap<>();
            parametros.put("Titulo", "Cliente");

            JasperPrint jp = JasperFillManager.fillReport(jr, parametros, cn);
            JasperViewer jv = new JasperViewer(jp, false);
            jv.setVisible(true);
        } catch (JRException ex) {
            JOptionPane.showMessageDialog(rootPane, ex);
        }
    }//GEN-LAST:event_reporte_cliente_lblMouseClicked

    private void pedidos_facturados_lbl_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pedidos_facturados_lbl_btnMouseClicked
        // PEDIDOS FACTURADOS
        facturados frame = new facturados();
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_pedidos_facturados_lbl_btnMouseClicked

    private void editar_cliente_lblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editar_cliente_lblMouseClicked
        // DATOS CLIENTES
        datos_clientes frame = new datos_clientes();
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_editar_cliente_lblMouseClicked

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
            java.util.logging.Logger.getLogger(ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel add_producto_lbl;
    private javax.swing.JPanel azul_pnl;
    private javax.swing.JLabel añadir_pedido_lbl;
    private javax.swing.JPanel blanco_pnl;
    private javax.swing.JLabel cerrar_sesion_lbl_btn;
    private javax.swing.JSeparator cliente_sep;
    private javax.swing.JLabel cliente_tit_lbl;
    private javax.swing.JLabel editar_cliente_lbl;
    private javax.swing.JLabel editar_pedido_lbl;
    private javax.swing.JLabel facturar_lbl_btn;
    private javax.swing.JLabel gm_lbl;
    private javax.swing.JLabel gm_lbl2;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JSeparator pedido_sep;
    private javax.swing.JLabel pedido_tit_lbl;
    private javax.swing.JLabel pedidos_facturados_lbl_btn;
    private javax.swing.JSeparator producto_sep;
    private javax.swing.JLabel producto_tit_lbl;
    private javax.swing.JLabel reporte_cliente_lbl;
    private javax.swing.JLabel reporte_producto_lbl;
    private javax.swing.JLabel titulo_lbl;
    private javax.swing.JLabel ver_cliente_lbl;
    private javax.swing.JLabel ver_pedido_lbl;
    private javax.swing.JLabel ver_producto_lbl;
    // End of variables declaration//GEN-END:variables
}
