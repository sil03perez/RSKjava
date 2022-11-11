package forms;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class nota_c extends javax.swing.JFrame {

    conexion cn = new conexion();
    Connection cnn = cn.conectar();

    public nota_c() {
        initComponents();
        generador();
        ncf();
    }

    //GENERAR CÓDIGO PARA LA FACTURA
    public void generador() {
        int codigo;
        String consulta = "SELECT MAX(id_factura) FROM nota_credito";
        try {
            PreparedStatement prst = cnn.prepareStatement(consulta);
            ResultSet res = prst.executeQuery(consulta);

            if (res.next()) {
                codigo = res.getInt(1);
                codigo++;

                nc_txt.setText(Integer.toString(codigo));
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "error" + ex);
        }
    }

    //GENERAR LA SECUENCIA DEL NCF
    public void ncf() {
        String pref = "B04";
        int sec;
        String query = "SELECT MAX(secuencia) FROM comprobantes WHERE pre_fijo = '" + pref + "';";

        try {
            PreparedStatement prst = cnn.prepareStatement(query);
            ResultSet res = prst.executeQuery(query);

            if (res.next()) {
                sec = res.getInt(1);
                sec++;

                String secdo = String.format("%08d", sec);
                sec_txt.setText(secdo);
            }
        } catch (Exception ex) {

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        azul_pnl = new javax.swing.JPanel();
        blanco_pnl = new javax.swing.JPanel();
        grupo_m_lbl = new javax.swing.JLabel();
        titulo_lbl = new javax.swing.JLabel();
        factu_modificar_lbl = new javax.swing.JLabel();
        separador = new javax.swing.JSeparator();
        num_factura_lbl = new javax.swing.JLabel();
        nfv_txt = new javax.swing.JTextField();
        ncf_lbl = new javax.swing.JLabel();
        ncfv_txt = new javax.swing.JTextField();
        total_lbl = new javax.swing.JLabel();
        totalv_txt = new javax.swing.JTextField();
        descuento_lbl = new javax.swing.JLabel();
        descv_txt = new javax.swing.JTextField();
        separador2 = new javax.swing.JSeparator();
        datos_pedido_lbl = new javax.swing.JLabel();
        separador3 = new javax.swing.JSeparator();
        cod_pedido_lbl = new javax.swing.JLabel();
        cp_txt = new javax.swing.JTextField();
        producto_lbl = new javax.swing.JLabel();
        prod_txt = new javax.swing.JTextField();
        precio_producto_lbl = new javax.swing.JLabel();
        prodct_txt = new javax.swing.JTextField();
        total_pedido_lbl = new javax.swing.JLabel();
        tp_txt = new javax.swing.JTextField();
        nota_credito_lbl = new javax.swing.JLabel();
        nc_txt = new javax.swing.JTextField();
        ncf2_lbl = new javax.swing.JLabel();
        sec_txt = new javax.swing.JTextField();
        total_nota_credito_lbl = new javax.swing.JLabel();
        totalnc_txt = new javax.swing.JTextField();
        guardar_nota_credito_btn = new javax.swing.JButton();
        cant_txt = new javax.swing.JTextField();
        cantidad_lbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        azul_pnl.setBackground(new java.awt.Color(0, 0, 102));

        blanco_pnl.setBackground(new java.awt.Color(255, 255, 255));

        grupo_m_lbl.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        grupo_m_lbl.setForeground(new java.awt.Color(0, 0, 102));
        grupo_m_lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/logo - 24x24.png"))); // NOI18N
        grupo_m_lbl.setText("Grupo M");

        titulo_lbl.setFont(new java.awt.Font("Lucida Console", 1, 14)); // NOI18N
        titulo_lbl.setForeground(new java.awt.Color(0, 0, 102));
        titulo_lbl.setText("Facturar pedidos");

        factu_modificar_lbl.setFont(new java.awt.Font("Lucida Console", 1, 14)); // NOI18N
        factu_modificar_lbl.setForeground(new java.awt.Color(0, 0, 102));
        factu_modificar_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        factu_modificar_lbl.setText("Factura a modificar");

        num_factura_lbl.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        num_factura_lbl.setForeground(new java.awt.Color(0, 0, 102));
        num_factura_lbl.setText("Número factura");

        nfv_txt.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        nfv_txt.setForeground(new java.awt.Color(0, 0, 0));
        nfv_txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        nfv_txt.setCaretColor(new java.awt.Color(0, 0, 0));
        nfv_txt.setOpaque(false);
        nfv_txt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nfv_txtMouseClicked(evt);
            }
        });

        ncf_lbl.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        ncf_lbl.setForeground(new java.awt.Color(0, 0, 102));
        ncf_lbl.setText("NCF");

        ncfv_txt.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        ncfv_txt.setForeground(new java.awt.Color(0, 0, 0));
        ncfv_txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        ncfv_txt.setCaretColor(new java.awt.Color(0, 0, 0));
        ncfv_txt.setOpaque(false);

        total_lbl.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        total_lbl.setForeground(new java.awt.Color(0, 0, 102));
        total_lbl.setText("Total");

        totalv_txt.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        totalv_txt.setForeground(new java.awt.Color(0, 0, 0));
        totalv_txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        totalv_txt.setCaretColor(new java.awt.Color(0, 0, 0));
        totalv_txt.setOpaque(false);

        descuento_lbl.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        descuento_lbl.setForeground(new java.awt.Color(0, 0, 102));
        descuento_lbl.setText("Descuento");

        descv_txt.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        descv_txt.setForeground(new java.awt.Color(0, 0, 0));
        descv_txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        descv_txt.setCaretColor(new java.awt.Color(0, 0, 0));
        descv_txt.setOpaque(false);

        separador2.setBackground(new java.awt.Color(0, 0, 0));
        separador2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        datos_pedido_lbl.setFont(new java.awt.Font("Lucida Console", 1, 14)); // NOI18N
        datos_pedido_lbl.setForeground(new java.awt.Color(0, 0, 102));
        datos_pedido_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        datos_pedido_lbl.setText("Datos del pedido");

        cod_pedido_lbl.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        cod_pedido_lbl.setForeground(new java.awt.Color(0, 0, 102));
        cod_pedido_lbl.setText("Código del pedido");

        cp_txt.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        cp_txt.setForeground(new java.awt.Color(0, 0, 0));
        cp_txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        cp_txt.setCaretColor(new java.awt.Color(0, 0, 0));
        cp_txt.setOpaque(false);

        producto_lbl.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        producto_lbl.setForeground(new java.awt.Color(0, 0, 102));
        producto_lbl.setText("Producto");

        prod_txt.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        prod_txt.setForeground(new java.awt.Color(0, 0, 0));
        prod_txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        prod_txt.setCaretColor(new java.awt.Color(0, 0, 0));
        prod_txt.setOpaque(false);

        precio_producto_lbl.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        precio_producto_lbl.setForeground(new java.awt.Color(0, 0, 102));
        precio_producto_lbl.setText("Precio del producto");

        prodct_txt.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        prodct_txt.setForeground(new java.awt.Color(0, 0, 0));
        prodct_txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        prodct_txt.setCaretColor(new java.awt.Color(0, 0, 0));
        prodct_txt.setOpaque(false);

        total_pedido_lbl.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        total_pedido_lbl.setForeground(new java.awt.Color(0, 0, 102));
        total_pedido_lbl.setText("Total pedido");

        tp_txt.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        tp_txt.setForeground(new java.awt.Color(0, 0, 0));
        tp_txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        tp_txt.setCaretColor(new java.awt.Color(0, 0, 0));
        tp_txt.setOpaque(false);

        nota_credito_lbl.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        nota_credito_lbl.setForeground(new java.awt.Color(0, 0, 102));
        nota_credito_lbl.setText("Nota de crédito");

        nc_txt.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        nc_txt.setForeground(new java.awt.Color(0, 0, 0));
        nc_txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        nc_txt.setCaretColor(new java.awt.Color(0, 0, 0));
        nc_txt.setOpaque(false);

        ncf2_lbl.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        ncf2_lbl.setForeground(new java.awt.Color(0, 0, 102));
        ncf2_lbl.setText("NCF");

        sec_txt.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        sec_txt.setForeground(new java.awt.Color(0, 0, 0));
        sec_txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        sec_txt.setCaretColor(new java.awt.Color(0, 0, 0));
        sec_txt.setOpaque(false);

        total_nota_credito_lbl.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        total_nota_credito_lbl.setForeground(new java.awt.Color(0, 0, 102));
        total_nota_credito_lbl.setText("Total nota de crédito");

        totalnc_txt.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        totalnc_txt.setForeground(new java.awt.Color(0, 0, 0));
        totalnc_txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        totalnc_txt.setCaretColor(new java.awt.Color(0, 0, 0));
        totalnc_txt.setOpaque(false);

        guardar_nota_credito_btn.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        guardar_nota_credito_btn.setForeground(new java.awt.Color(0, 0, 102));
        guardar_nota_credito_btn.setText("Guardar nota de crédito");
        guardar_nota_credito_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        guardar_nota_credito_btn.setContentAreaFilled(false);

        cant_txt.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        cant_txt.setForeground(new java.awt.Color(0, 0, 0));
        cant_txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        cant_txt.setCaretColor(new java.awt.Color(0, 0, 0));
        cant_txt.setOpaque(false);

        cantidad_lbl.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        cantidad_lbl.setForeground(new java.awt.Color(0, 0, 102));
        cantidad_lbl.setText("Cantidad");

        javax.swing.GroupLayout blanco_pnlLayout = new javax.swing.GroupLayout(blanco_pnl);
        blanco_pnl.setLayout(blanco_pnlLayout);
        blanco_pnlLayout.setHorizontalGroup(
            blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(blanco_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(guardar_nota_credito_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(blanco_pnlLayout.createSequentialGroup()
                        .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(blanco_pnlLayout.createSequentialGroup()
                                    .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(separador, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(nfv_txt)
                                        .addComponent(ncfv_txt)
                                        .addComponent(totalv_txt)
                                        .addComponent(descv_txt)
                                        .addComponent(factu_modificar_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(blanco_pnlLayout.createSequentialGroup()
                                            .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(num_factura_lbl)
                                                .addComponent(ncf_lbl)
                                                .addComponent(total_lbl)
                                                .addComponent(descuento_lbl))
                                            .addGap(0, 0, Short.MAX_VALUE)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(separador2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                .addGroup(blanco_pnlLayout.createSequentialGroup()
                                    .addComponent(nc_txt)
                                    .addGap(26, 26, 26)))
                            .addGroup(blanco_pnlLayout.createSequentialGroup()
                                .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nota_credito_lbl)
                                    .addGroup(blanco_pnlLayout.createSequentialGroup()
                                        .addComponent(grupo_m_lbl)
                                        .addGap(18, 18, 18)
                                        .addComponent(titulo_lbl)))
                                .addGap(170, 170, 170)))
                        .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(blanco_pnlLayout.createSequentialGroup()
                                .addComponent(ncf2_lbl)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(sec_txt)
                            .addComponent(prodct_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
                            .addComponent(cp_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
                            .addComponent(separador3)
                            .addComponent(tp_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
                            .addComponent(datos_pedido_lbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(blanco_pnlLayout.createSequentialGroup()
                                .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cod_pedido_lbl)
                                    .addComponent(producto_lbl)
                                    .addComponent(total_pedido_lbl)
                                    .addComponent(precio_producto_lbl)
                                    .addComponent(prod_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cant_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addGroup(blanco_pnlLayout.createSequentialGroup()
                                        .addComponent(cantidad_lbl)
                                        .addGap(0, 0, Short.MAX_VALUE))))))
                    .addComponent(totalnc_txt)
                    .addGroup(blanco_pnlLayout.createSequentialGroup()
                        .addComponent(total_nota_credito_lbl)
                        .addGap(588, 588, 588)))
                .addContainerGap())
        );
        blanco_pnlLayout.setVerticalGroup(
            blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(blanco_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(titulo_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(grupo_m_lbl))
                .addGap(18, 18, 18)
                .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(blanco_pnlLayout.createSequentialGroup()
                        .addComponent(nota_credito_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nc_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(blanco_pnlLayout.createSequentialGroup()
                        .addComponent(ncf2_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sec_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(blanco_pnlLayout.createSequentialGroup()
                        .addComponent(datos_pedido_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(separador3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cod_pedido_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cp_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(producto_lbl)
                            .addComponent(cantidad_lbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(prod_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cant_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(precio_producto_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(prodct_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(total_pedido_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tp_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(blanco_pnlLayout.createSequentialGroup()
                        .addComponent(factu_modificar_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(blanco_pnlLayout.createSequentialGroup()
                                .addComponent(separador, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(num_factura_lbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nfv_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ncf_lbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ncfv_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(total_lbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(totalv_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(descuento_lbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(descv_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(separador2, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(total_nota_credito_lbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(totalnc_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(guardar_nota_credito_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void nfv_txtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nfv_txtMouseClicked
        //FACTURAS
        nc_factura frame = new nc_factura();
        frame.setVisible(true);
    }//GEN-LAST:event_nfv_txtMouseClicked

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
            java.util.logging.Logger.getLogger(nota_c.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(nota_c.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(nota_c.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(nota_c.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new nota_c().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel azul_pnl;
    private javax.swing.JPanel blanco_pnl;
    public static javax.swing.JTextField cant_txt;
    private javax.swing.JLabel cantidad_lbl;
    private javax.swing.JLabel cod_pedido_lbl;
    public static javax.swing.JTextField cp_txt;
    private javax.swing.JLabel datos_pedido_lbl;
    private javax.swing.JLabel descuento_lbl;
    public static javax.swing.JTextField descv_txt;
    private javax.swing.JLabel factu_modificar_lbl;
    private javax.swing.JLabel grupo_m_lbl;
    private javax.swing.JButton guardar_nota_credito_btn;
    public static javax.swing.JTextField nc_txt;
    private javax.swing.JLabel ncf2_lbl;
    private javax.swing.JLabel ncf_lbl;
    public static javax.swing.JTextField ncfv_txt;
    public static javax.swing.JTextField nfv_txt;
    private javax.swing.JLabel nota_credito_lbl;
    private javax.swing.JLabel num_factura_lbl;
    private javax.swing.JLabel precio_producto_lbl;
    public static javax.swing.JTextField prod_txt;
    public static javax.swing.JTextField prodct_txt;
    private javax.swing.JLabel producto_lbl;
    public static javax.swing.JTextField sec_txt;
    private javax.swing.JSeparator separador;
    private javax.swing.JSeparator separador2;
    private javax.swing.JSeparator separador3;
    private javax.swing.JLabel titulo_lbl;
    private javax.swing.JLabel total_lbl;
    private javax.swing.JLabel total_nota_credito_lbl;
    private javax.swing.JLabel total_pedido_lbl;
    public static javax.swing.JTextField totalnc_txt;
    public static javax.swing.JTextField totalv_txt;
    public static javax.swing.JTextField tp_txt;
    // End of variables declaration//GEN-END:variables
}
