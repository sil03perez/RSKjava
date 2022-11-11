package forms;

import static forms.facturar.comprobante_txt;
import static forms.facturar.secuencia_txt;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class nota_cr extends javax.swing.JFrame {

    conexion cn = new conexion();
    Connection cnn = cn.conectar();
    DefaultTableModel pedido;

    public nota_cr() {
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

                nf_txt.setText(Integer.toString(codigo));
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
                ncf_txt.setText(secdo);
            }
        } catch (Exception ex) {

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        azul_pnl = new javax.swing.JPanel();
        blanco_pnl = new javax.swing.JPanel();
        gm_lbl = new javax.swing.JLabel();
        separador_n_t = new javax.swing.JSeparator();
        titulo_lbl = new javax.swing.JLabel();
        nf_lbl = new javax.swing.JLabel();
        nf_txt = new javax.swing.JTextField();
        ncf_lbl = new javax.swing.JLabel();
        ncf_txt = new javax.swing.JTextField();
        facturav_lbl = new javax.swing.JLabel();
        facturav_txt = new javax.swing.JTextField();
        ncfm_lbl = new javax.swing.JLabel();
        ncfm_txt = new javax.swing.JTextField();
        descuento_lbl = new javax.swing.JLabel();
        descuento_txt = new javax.swing.JTextField();
        totalp_lbl = new javax.swing.JLabel();
        totalp_txt = new javax.swing.JTextField();
        tf_lbl = new javax.swing.JLabel();
        tf_txt = new javax.swing.JTextField();
        calcular_total_lbl_btn = new javax.swing.JLabel();
        totalv_lbl = new javax.swing.JLabel();
        totalv_txt = new javax.swing.JTextField();
        guardar_btn = new javax.swing.JButton();
        imprimir_btn = new javax.swing.JButton();
        cant_p_lbl = new javax.swing.JLabel();
        cant_p_txt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        azul_pnl.setBackground(new java.awt.Color(0, 0, 102));

        blanco_pnl.setBackground(new java.awt.Color(255, 255, 255));

        gm_lbl.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        gm_lbl.setForeground(new java.awt.Color(0, 0, 102));
        gm_lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/logo - 24x24.png"))); // NOI18N
        gm_lbl.setText("Grupo M");

        separador_n_t.setOrientation(javax.swing.SwingConstants.VERTICAL);

        titulo_lbl.setFont(new java.awt.Font("Lucida Console", 1, 14)); // NOI18N
        titulo_lbl.setForeground(new java.awt.Color(9, 0, 100));
        titulo_lbl.setText("Notas de crédito");

        nf_lbl.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        nf_lbl.setForeground(new java.awt.Color(0, 0, 102));
        nf_lbl.setText("Número factura");

        nf_txt.setEditable(false);
        nf_txt.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        nf_txt.setForeground(new java.awt.Color(0, 0, 0));
        nf_txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        nf_txt.setCaretColor(new java.awt.Color(0, 0, 0));
        nf_txt.setOpaque(false);

        ncf_lbl.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        ncf_lbl.setForeground(new java.awt.Color(0, 0, 102));
        ncf_lbl.setText("NCF");

        ncf_txt.setEditable(false);
        ncf_txt.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        ncf_txt.setForeground(new java.awt.Color(0, 0, 0));
        ncf_txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        ncf_txt.setCaretColor(new java.awt.Color(0, 0, 0));
        ncf_txt.setOpaque(false);

        facturav_lbl.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        facturav_lbl.setForeground(new java.awt.Color(0, 0, 102));
        facturav_lbl.setText("Factura modificada");

        facturav_txt.setEditable(false);
        facturav_txt.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        facturav_txt.setForeground(new java.awt.Color(0, 0, 0));
        facturav_txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        facturav_txt.setCaretColor(new java.awt.Color(0, 0, 0));
        facturav_txt.setOpaque(false);
        facturav_txt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                facturav_txtMouseClicked(evt);
            }
        });

        ncfm_lbl.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        ncfm_lbl.setForeground(new java.awt.Color(0, 0, 102));
        ncfm_lbl.setText("NCF modificado");

        ncfm_txt.setEditable(false);
        ncfm_txt.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        ncfm_txt.setForeground(new java.awt.Color(0, 0, 0));
        ncfm_txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        ncfm_txt.setCaretColor(new java.awt.Color(0, 0, 0));
        ncfm_txt.setOpaque(false);

        descuento_lbl.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        descuento_lbl.setForeground(new java.awt.Color(0, 0, 102));
        descuento_lbl.setText("Descuento en la  factura");

        descuento_txt.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        descuento_txt.setForeground(new java.awt.Color(0, 0, 0));
        descuento_txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        descuento_txt.setCaretColor(new java.awt.Color(0, 0, 0));
        descuento_txt.setOpaque(false);

        totalp_lbl.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        totalp_lbl.setForeground(new java.awt.Color(0, 0, 102));
        totalp_lbl.setText("Total del pedido");

        totalp_txt.setEditable(false);
        totalp_txt.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        totalp_txt.setForeground(new java.awt.Color(0, 0, 0));
        totalp_txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        totalp_txt.setCaretColor(new java.awt.Color(0, 0, 0));
        totalp_txt.setOpaque(false);

        tf_lbl.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        tf_lbl.setForeground(new java.awt.Color(0, 0, 102));
        tf_lbl.setText("Total de la factura");

        tf_txt.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        tf_txt.setForeground(new java.awt.Color(0, 0, 0));
        tf_txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        tf_txt.setCaretColor(new java.awt.Color(0, 0, 0));
        tf_txt.setOpaque(false);

        calcular_total_lbl_btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        calcular_total_lbl_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_calculator_24px.png"))); // NOI18N
        calcular_total_lbl_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        calcular_total_lbl_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                calcular_total_lbl_btnMouseClicked(evt);
            }
        });

        totalv_lbl.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        totalv_lbl.setForeground(new java.awt.Color(0, 0, 102));
        totalv_lbl.setText("Total anterior");

        totalv_txt.setEditable(false);
        totalv_txt.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        totalv_txt.setForeground(new java.awt.Color(0, 0, 0));
        totalv_txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        totalv_txt.setCaretColor(new java.awt.Color(0, 0, 0));
        totalv_txt.setOpaque(false);

        guardar_btn.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        guardar_btn.setForeground(new java.awt.Color(0, 0, 102));
        guardar_btn.setText("Guardar nota de crédito");
        guardar_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        guardar_btn.setContentAreaFilled(false);
        guardar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardar_btnActionPerformed(evt);
            }
        });

        imprimir_btn.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        imprimir_btn.setForeground(new java.awt.Color(0, 0, 102));
        imprimir_btn.setText("Imprimir nota de crédito");
        imprimir_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        imprimir_btn.setContentAreaFilled(false);
        imprimir_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imprimir_btnActionPerformed(evt);
            }
        });

        cant_p_lbl.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        cant_p_lbl.setForeground(new java.awt.Color(0, 0, 102));
        cant_p_lbl.setText("Cantidad del producto");

        cant_p_txt.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        cant_p_txt.setForeground(new java.awt.Color(0, 0, 0));
        cant_p_txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        cant_p_txt.setCaretColor(new java.awt.Color(0, 0, 0));
        cant_p_txt.setOpaque(false);

        javax.swing.GroupLayout blanco_pnlLayout = new javax.swing.GroupLayout(blanco_pnl);
        blanco_pnl.setLayout(blanco_pnlLayout);
        blanco_pnlLayout.setHorizontalGroup(
            blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(blanco_pnlLayout.createSequentialGroup()
                .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(blanco_pnlLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(gm_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(separador_n_t, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(titulo_lbl))
                    .addGroup(blanco_pnlLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(facturav_txt)
                            .addGroup(blanco_pnlLayout.createSequentialGroup()
                                .addComponent(facturav_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                                .addGap(137, 137, 137))
                            .addComponent(ncfm_txt)
                            .addGroup(blanco_pnlLayout.createSequentialGroup()
                                .addComponent(ncfm_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(169, 169, 169))
                            .addComponent(descuento_txt)
                            .addGroup(blanco_pnlLayout.createSequentialGroup()
                                .addComponent(descuento_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(89, 89, 89))
                            .addGroup(blanco_pnlLayout.createSequentialGroup()
                                .addComponent(totalp_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(153, 153, 153))
                            .addComponent(totalp_txt))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nf_txt, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, blanco_pnlLayout.createSequentialGroup()
                                .addComponent(nf_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
                                .addGap(169, 169, 169))
                            .addComponent(ncf_txt, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, blanco_pnlLayout.createSequentialGroup()
                                .addComponent(ncf_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(257, 257, 257))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, blanco_pnlLayout.createSequentialGroup()
                                .addComponent(tf_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(129, 129, 129))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, blanco_pnlLayout.createSequentialGroup()
                                .addComponent(tf_txt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(calcular_total_lbl_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, blanco_pnlLayout.createSequentialGroup()
                                .addComponent(totalv_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(169, 169, 169))
                            .addComponent(totalv_txt, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(blanco_pnlLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(guardar_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(imprimir_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(blanco_pnlLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cant_p_txt)
                            .addGroup(blanco_pnlLayout.createSequentialGroup()
                                .addComponent(cant_p_lbl)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        blanco_pnlLayout.setVerticalGroup(
            blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(blanco_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(blanco_pnlLayout.createSequentialGroup()
                        .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(gm_lbl)
                            .addComponent(separador_n_t, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(titulo_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(facturav_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(facturav_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ncfm_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ncfm_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(totalp_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(totalp_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(blanco_pnlLayout.createSequentialGroup()
                        .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(blanco_pnlLayout.createSequentialGroup()
                                .addComponent(nf_lbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nf_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(76, 76, 76))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, blanco_pnlLayout.createSequentialGroup()
                                .addComponent(ncf_lbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ncf_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(12, 12, 12)
                        .addComponent(totalv_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(totalv_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, blanco_pnlLayout.createSequentialGroup()
                        .addComponent(descuento_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(descuento_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, blanco_pnlLayout.createSequentialGroup()
                            .addComponent(tf_lbl)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tf_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(calcular_total_lbl_btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cant_p_lbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cant_p_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(guardar_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(imprimir_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
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

    private void imprimir_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imprimir_btnActionPerformed
        //IMPRIMIR NOTA DE CRÉDITO

    }//GEN-LAST:event_imprimir_btnActionPerformed

    private void guardar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardar_btnActionPerformed
        //GUARDAR NOTA DE CRÉDITO
        String factm = facturav_txt.getText();
        String ncfmod = ncfm_txt.getText();
        String tp = totalp_txt.getText();
        String des = descuento_txt.getText();
        String canp = cant_p_txt.getText();
        String nfn = nf_txt.getText();
        String ncfnc = ncf_txt.getText();
        String totalv = totalv_txt.getText();
        String totaln = tf_txt.getText();
        String pref = "B04";
        String ncfn = pref + ncfnc;
        String queryins = "INSERT INTO nota_credito VALUES(" + nfn + ", 3, " + ncfn + ", " + factm + ", " + ncfmod + ", " + canp + ", " + tp + ", " + des + ", " + totaln + ", CURDATE());";
        String actncf = "UPDATE comprobantes SET secuencia = " + ncfnc + " WHERE codigo = 3;";

        try {

            PreparedStatement prst = cnn.prepareStatement(queryins);
            PreparedStatement prs = cnn.prepareStatement(actncf);

            prst.executeUpdate();
            prs.executeUpdate();
            JOptionPane.showMessageDialog(null, "Nota de crédito realizada");

            //ESTABLECER 0 EN EL TXT DEL DESCUENTO LUEGO DE INSERTAR LA FACTURA
            descuento_txt.setText("0");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "error " + ex);
        }
    }//GEN-LAST:event_guardar_btnActionPerformed

    private void calcular_total_lbl_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calcular_total_lbl_btnMouseClicked
        //CALCULAR EL TOTAL
    }//GEN-LAST:event_calcular_total_lbl_btnMouseClicked

    private void facturav_txtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_facturav_txtMouseClicked
        //ABRIR PANTALLA DE DATOS FACTURA
        nc_factura frame = new nc_factura();
        frame.setVisible(true);
    }//GEN-LAST:event_facturav_txtMouseClicked

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
            java.util.logging.Logger.getLogger(nota_cr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(nota_cr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(nota_cr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(nota_cr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new nota_cr().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel azul_pnl;
    private javax.swing.JPanel blanco_pnl;
    private javax.swing.JLabel calcular_total_lbl_btn;
    private javax.swing.JLabel cant_p_lbl;
    public static javax.swing.JTextField cant_p_txt;
    private javax.swing.JLabel descuento_lbl;
    public static javax.swing.JTextField descuento_txt;
    private javax.swing.JLabel facturav_lbl;
    public static javax.swing.JTextField facturav_txt;
    private javax.swing.JLabel gm_lbl;
    private javax.swing.JButton guardar_btn;
    private javax.swing.JButton imprimir_btn;
    private javax.swing.JLabel ncf_lbl;
    private javax.swing.JTextField ncf_txt;
    private javax.swing.JLabel ncfm_lbl;
    public static javax.swing.JTextField ncfm_txt;
    private javax.swing.JLabel nf_lbl;
    private javax.swing.JTextField nf_txt;
    private javax.swing.JSeparator separador_n_t;
    private javax.swing.JLabel tf_lbl;
    private javax.swing.JTextField tf_txt;
    private javax.swing.JLabel titulo_lbl;
    private javax.swing.JLabel totalp_lbl;
    public static javax.swing.JTextField totalp_txt;
    private javax.swing.JLabel totalv_lbl;
    public static javax.swing.JTextField totalv_txt;
    // End of variables declaration//GEN-END:variables

}
