package forms;

import javax.swing.ImageIcon;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

public class facturar extends javax.swing.JFrame {

    conexion cn = new conexion();
    Connection cnn = cn.conectar();
    DefaultTableModel pedido;

    public facturar() {
        initComponents();
        this.setExtendedState(facturar.MAXIMIZED_BOTH);
        this.pedido = (DefaultTableModel) pedidos_tbl.getModel();
        cargar();
        descuento_txt.setText("0");
        generador();
    }

    //REFRESCAR LA TABLA
    public void refrescar() {
        try {
            pedido.setColumnCount(0);
            pedido.setRowCount(0);
            pedidos_tbl.revalidate();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error " + ex);
        }
    }

    //CARGAR LOS DATOS DE LA TABLA
    public void cargar() {
        refrescar();
        pedido.addColumn("Código");
        pedido.addColumn("Cliente");
        pedido.addColumn("Producto");
        pedido.addColumn("Total");

        this.pedidos_tbl.setModel(pedido);
        String consultageneral = "SELECT * FROM listo_facturar_vw;";

        String[] datosg = new String[6];
        try {
            Statement st = cnn.createStatement();
            ResultSet rs = st.executeQuery(consultageneral);
            while (rs.next()) {
                datosg[0] = rs.getString(1);
                datosg[1] = rs.getString(2);
                datosg[2] = rs.getString(3);
                datosg[3] = rs.getString(4);

                pedido.addRow(datosg);

            }

            pedidos_tbl.setModel(pedido);
        } catch (SQLException ex) {
            Logger.getLogger(log_form.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "error " + ex);
        }
    }

    //GENERAR CÓDIGO PARA LA FACTURA
    public void generador() {
        int codigo;
        String consulta = "SELECT MAX(Numero_factura) FROM factura";
        try {
            PreparedStatement prst = cnn.prepareStatement(consulta);
            ResultSet res = prst.executeQuery(consulta);

            if (res.next()) {
                codigo = res.getInt(1);
                codigo++;

                no_f_txt.setText(Integer.toString(codigo));
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "error" + ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        azul_pnl = new javax.swing.JPanel();
        scroll = new javax.swing.JScrollPane();
        blanco_pnl = new javax.swing.JPanel();
        titulo_lbl = new javax.swing.JLabel();
        grupo_m_lbl = new javax.swing.JLabel();
        facturar_btn = new javax.swing.JButton();
        datos_lbl = new javax.swing.JLabel();
        separador3 = new javax.swing.JSeparator();
        pedidos_scroll = new javax.swing.JScrollPane();
        pedidos_tbl = new javax.swing.JTable();
        pedido_lbl = new javax.swing.JLabel();
        pedido_txt = new javax.swing.JTextField();
        descuento_txt = new javax.swing.JTextField();
        descuento_lbl = new javax.swing.JLabel();
        total_lbl = new javax.swing.JLabel();
        total_txt = new javax.swing.JTextField();
        calcular_total_lbl_btn = new javax.swing.JLabel();
        descuento_lbl1 = new javax.swing.JLabel();
        subtotal_txt = new javax.swing.JTextField();
        imprimir_btn = new javax.swing.JButton();
        comprobante_txt = new javax.swing.JTextField();
        comp_lbl = new javax.swing.JLabel();
        no_f_lbl = new javax.swing.JLabel();
        no_f_txt = new javax.swing.JTextField();
        salir_lbl_btn = new javax.swing.JLabel();
        moneda_box = new javax.swing.JComboBox<>();
        moneda_lbl = new javax.swing.JLabel();
        verificar_comp_lbl = new javax.swing.JLabel();
        sec_lbl = new javax.swing.JLabel();
        secuencia_txt = new javax.swing.JTextField();
        id_txt = new javax.swing.JTextField();
        id_lbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconImage(new ImageIcon(getClass().getResource("/imgs/logo.png")).getImage());

        azul_pnl.setBackground(new java.awt.Color(8, 41, 138));

        scroll.setAutoscrolls(true);
        scroll.setVerifyInputWhenFocusTarget(false);

        blanco_pnl.setBackground(new java.awt.Color(255, 255, 255));

        titulo_lbl.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        titulo_lbl.setForeground(new java.awt.Color(0, 0, 102));
        titulo_lbl.setText("Facturar pedidos");

        grupo_m_lbl.setFont(new java.awt.Font("Candara Light", 1, 24)); // NOI18N
        grupo_m_lbl.setForeground(new java.awt.Color(0, 0, 102));
        grupo_m_lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/logo - 24x24.png"))); // NOI18N
        grupo_m_lbl.setText("Grupo M");

        facturar_btn.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        facturar_btn.setForeground(new java.awt.Color(0, 0, 102));
        facturar_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_save_32px.png"))); // NOI18N
        facturar_btn.setText("Facturar");
        facturar_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        facturar_btn.setContentAreaFilled(false);
        facturar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facturar_btnActionPerformed(evt);
            }
        });

        datos_lbl.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        datos_lbl.setForeground(new java.awt.Color(0, 0, 102));
        datos_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        datos_lbl.setText("Datos del pedido");

        separador3.setBackground(new java.awt.Color(0, 0, 0));

        pedidos_tbl.setBackground(new java.awt.Color(255, 255, 255));
        pedidos_tbl.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        pedidos_tbl.setForeground(new java.awt.Color(0, 0, 0));
        pedidos_tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        pedidos_tbl.setOpaque(false);
        pedidos_tbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pedidos_tblMouseClicked(evt);
            }
        });
        pedidos_scroll.setViewportView(pedidos_tbl);

        pedido_lbl.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        pedido_lbl.setForeground(new java.awt.Color(0, 0, 102));
        pedido_lbl.setText("Pedido");

        pedido_txt.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        pedido_txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        pedido_txt.setOpaque(false);

        descuento_txt.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        descuento_txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        descuento_txt.setOpaque(false);

        descuento_lbl.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        descuento_lbl.setForeground(new java.awt.Color(0, 0, 102));
        descuento_lbl.setText("Porcentaje de descuento");

        total_lbl.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        total_lbl.setForeground(new java.awt.Color(0, 0, 102));
        total_lbl.setText("Total");

        total_txt.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        total_txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        total_txt.setOpaque(false);

        calcular_total_lbl_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_calculator_24px_1.png"))); // NOI18N
        calcular_total_lbl_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        calcular_total_lbl_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                calcular_total_lbl_btnMouseClicked(evt);
            }
        });

        descuento_lbl1.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        descuento_lbl1.setForeground(new java.awt.Color(0, 0, 102));
        descuento_lbl1.setText("Sub total");

        subtotal_txt.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        subtotal_txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        subtotal_txt.setOpaque(false);

        imprimir_btn.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        imprimir_btn.setForeground(new java.awt.Color(0, 0, 102));
        imprimir_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_print_24px.png"))); // NOI18N
        imprimir_btn.setText("Imprimir");
        imprimir_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        imprimir_btn.setContentAreaFilled(false);
        imprimir_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imprimir_btnActionPerformed(evt);
            }
        });

        comprobante_txt.setEditable(false);
        comprobante_txt.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        comprobante_txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        comprobante_txt.setOpaque(false);
        comprobante_txt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comprobante_txtMouseClicked(evt);
            }
        });

        comp_lbl.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        comp_lbl.setForeground(new java.awt.Color(0, 0, 102));
        comp_lbl.setText("Pre-Fijo NCF");

        no_f_lbl.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        no_f_lbl.setForeground(new java.awt.Color(0, 0, 102));
        no_f_lbl.setText("Número factura");

        no_f_txt.setEditable(false);
        no_f_txt.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        no_f_txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        no_f_txt.setOpaque(false);

        salir_lbl_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_left_2_24px.png"))); // NOI18N
        salir_lbl_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salir_lbl_btnMouseClicked(evt);
            }
        });

        moneda_box.setBackground(new java.awt.Color(255, 255, 255));
        moneda_box.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        moneda_box.setForeground(new java.awt.Color(0, 0, 0));
        moneda_box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DOP", "USD" }));
        moneda_box.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));

        moneda_lbl.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        moneda_lbl.setForeground(new java.awt.Color(0, 0, 102));
        moneda_lbl.setText("Moneda");

        verificar_comp_lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_done_24px.png"))); // NOI18N
        verificar_comp_lbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        verificar_comp_lbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verificar_comp_lblMouseClicked(evt);
            }
        });

        sec_lbl.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        sec_lbl.setForeground(new java.awt.Color(0, 0, 102));
        sec_lbl.setText("Secuencia NCF");

        secuencia_txt.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        secuencia_txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        secuencia_txt.setOpaque(false);

        id_txt.setEditable(false);
        id_txt.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        id_txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        id_txt.setOpaque(false);

        id_lbl.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        id_lbl.setForeground(new java.awt.Color(0, 0, 102));
        id_lbl.setText("ID");

        javax.swing.GroupLayout blanco_pnlLayout = new javax.swing.GroupLayout(blanco_pnl);
        blanco_pnl.setLayout(blanco_pnlLayout);
        blanco_pnlLayout.setHorizontalGroup(
            blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(blanco_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(separador3)
                    .addComponent(datos_lbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(blanco_pnlLayout.createSequentialGroup()
                        .addComponent(grupo_m_lbl)
                        .addGap(18, 18, 18)
                        .addComponent(titulo_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(salir_lbl_btn))
                    .addGroup(blanco_pnlLayout.createSequentialGroup()
                        .addComponent(pedidos_scroll, javax.swing.GroupLayout.DEFAULT_SIZE, 781, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(facturar_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(imprimir_btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(no_f_lbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pedido_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pedido_txt)
                            .addComponent(descuento_txt)
                            .addComponent(descuento_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                            .addComponent(total_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(subtotal_txt)
                            .addComponent(descuento_lbl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(no_f_txt)
                            .addComponent(moneda_lbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(moneda_box, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(blanco_pnlLayout.createSequentialGroup()
                                .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(total_txt)
                                    .addGroup(blanco_pnlLayout.createSequentialGroup()
                                        .addComponent(id_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(comprobante_txt)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(calcular_total_lbl_btn)
                                    .addComponent(verificar_comp_lbl)))
                            .addComponent(sec_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(secuencia_txt)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, blanco_pnlLayout.createSequentialGroup()
                                .addComponent(id_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comp_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        blanco_pnlLayout.setVerticalGroup(
            blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, blanco_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(titulo_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(grupo_m_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(salir_lbl_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(datos_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separador3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(blanco_pnlLayout.createSequentialGroup()
                        .addComponent(no_f_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(no_f_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pedido_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pedido_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(descuento_lbl1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(subtotal_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(descuento_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(descuento_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(total_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(total_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                            .addComponent(calcular_total_lbl_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comp_lbl)
                            .addComponent(id_lbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(verificar_comp_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(comprobante_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(id_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sec_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(secuencia_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(moneda_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(moneda_box, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(facturar_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(imprimir_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pedidos_scroll))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        scroll.setViewportView(blanco_pnl);

        javax.swing.GroupLayout azul_pnlLayout = new javax.swing.GroupLayout(azul_pnl);
        azul_pnl.setLayout(azul_pnlLayout);
        azul_pnlLayout.setHorizontalGroup(
            azul_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(azul_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scroll)
                .addContainerGap())
        );
        azul_pnlLayout.setVerticalGroup(
            azul_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(azul_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scroll, javax.swing.GroupLayout.DEFAULT_SIZE, 932, Short.MAX_VALUE)
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

    private void pedidos_tblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pedidos_tblMouseClicked
        //LLENAR TXT
        try {
            String cod = (String) pedido.getValueAt(pedidos_tbl.getSelectedRow(), 0);
            String tot = (String) pedido.getValueAt(pedidos_tbl.getSelectedRow(), 3);

            pedido_txt.setText(cod);
            subtotal_txt.setText(tot);
            descuento_txt.setText("0");

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "error " + ex);
        }
    }//GEN-LAST:event_pedidos_tblMouseClicked

    private void calcular_total_lbl_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calcular_total_lbl_btnMouseClicked
        //CALCULAR TOTAL DE LA FACTURA DEPENDIENDO EL DESCUENTO
        String porcentaje = descuento_txt.getText();
        String pretot = subtotal_txt.getText();
        Double porcd = Double.parseDouble(porcentaje);
        Double pretot1 = Double.parseDouble(pretot);

        Double decimalporc = porcd / 100;
        Double pretotal = decimalporc * pretot1;
        Double total = pretot1 - pretotal;
        String res = String.valueOf(total);
        total_txt.setText(res);

    }//GEN-LAST:event_calcular_total_lbl_btnMouseClicked

    private void facturar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facturar_btnActionPerformed
        //FACTURAR PEDIDO

        String ped = pedido_txt.getText();
        String desc = descuento_txt.getText();
        String tot = total_txt.getText();
        String tipo = id_txt.getText();
        String pref = comprobante_txt.getText();
        String secuencia = secuencia_txt.getText();
        String compo = pref + secuencia;
        String mon = moneda_box.getSelectedItem().toString();

        //INSERTAR LOS DATOS A FACTURA
        String query = "INSERT INTO factura(Fecha, Codigo_orden, descuento, precio_total, comprobante, no_comp, moneda) VALUES(CURDATE(), '" + ped + "', '" + desc + "', '" + tot + "', '" + tipo + "', '" + compo + "', '" + mon + "');";

        //ACTUALIZAR EL ESTADO DEL PEDIDO A FACTURADO
        String queryup = "UPDATE pedido SET estado = 'Facturado' WHERE Numero_pedido = '" + ped + "';";

        //CAMBIAR EL MÁXIMO DE LA SECUENCIA DE COMPROBANTES FISCALES
        String queryupcomp = "UPDATE comprobantes SET secuencia = " + secuencia + " WHERE codigo = '" + tipo + "';";

        try {

            PreparedStatement prst = cnn.prepareStatement(query);
            PreparedStatement prs = cnn.prepareStatement(queryup);
            PreparedStatement prscomp = cnn.prepareStatement(queryupcomp);

            prst.executeUpdate();
            prs.executeUpdate();
            prscomp.executeUpdate();
            JOptionPane.showMessageDialog(null, "Pedido facturado");
            cargar();

            //ESTABLECER 0 EN EL TXT DEL DESCUENTO LUEGO DE INSERTAR LA FACTURA
            descuento_txt.setText("0");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "error " + ex);
        }
    }//GEN-LAST:event_facturar_btnActionPerformed


    private void imprimir_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imprimir_btnActionPerformed
        //MOSTRAR FACTURA

        Connection cn = conexion.conectar();

        try {
            String factura = no_f_txt.getText();
            JasperReport jr = (JasperReport) JRLoader.loadObject(facturar.class.getResource("/reportes/factura.jasper"));
            Map parametro = new HashMap<>();
            parametro.put("factura", factura);
            JasperPrint jp = JasperFillManager.fillReport(jr, parametro, cnn);
            JasperViewer jv = new JasperViewer(jp, false);
            jv.setVisible(true);
        } catch (JRException ex) {
            JOptionPane.showMessageDialog(rootPane, ex);
        }
        generador();

    }//GEN-LAST:event_imprimir_btnActionPerformed

    private void salir_lbl_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salir_lbl_btnMouseClicked
        //PANTALLA DE VENTAS
        ventas frame = new ventas();
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_salir_lbl_btnMouseClicked

    private void comprobante_txtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comprobante_txtMouseClicked
        //MOSTRAR COMPROBANTES
        comprobantes frame = new comprobantes();
        frame.setVisible(true);
    }//GEN-LAST:event_comprobante_txtMouseClicked

    private void verificar_comp_lblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verificar_comp_lblMouseClicked
        //LLENAR LA SECUENCIA CON LA MAXIMA  PROVENIENTE DE LA TABLA +1
        String pref = comprobante_txt.getText();
        int sec;
        String query = "SELECT MAX(secuencia) FROM comprobantes WHERE pre_fijo = '" + pref + "';";

        try {
            PreparedStatement prst = cnn.prepareStatement(query);
            ResultSet res = prst.executeQuery(query);

            if (res.next()) {
                sec = res.getInt(1);
                sec++;

                String secdo = String.format("%08d", sec);
                secuencia_txt.setText(secdo);
            }
        } catch (Exception ex) {

        }
    }//GEN-LAST:event_verificar_comp_lblMouseClicked

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
            java.util.logging.Logger.getLogger(facturar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(facturar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(facturar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(facturar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new facturar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel azul_pnl;
    private javax.swing.JPanel blanco_pnl;
    private javax.swing.JLabel calcular_total_lbl_btn;
    private javax.swing.JLabel comp_lbl;
    public static javax.swing.JTextField comprobante_txt;
    private javax.swing.JLabel datos_lbl;
    private javax.swing.JLabel descuento_lbl;
    private javax.swing.JLabel descuento_lbl1;
    private javax.swing.JTextField descuento_txt;
    private javax.swing.JButton facturar_btn;
    private javax.swing.JLabel grupo_m_lbl;
    private javax.swing.JLabel id_lbl;
    public static javax.swing.JTextField id_txt;
    private javax.swing.JButton imprimir_btn;
    private javax.swing.JComboBox<String> moneda_box;
    private javax.swing.JLabel moneda_lbl;
    private javax.swing.JLabel no_f_lbl;
    private javax.swing.JTextField no_f_txt;
    private javax.swing.JLabel pedido_lbl;
    private javax.swing.JTextField pedido_txt;
    private javax.swing.JScrollPane pedidos_scroll;
    private javax.swing.JTable pedidos_tbl;
    private javax.swing.JLabel salir_lbl_btn;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JLabel sec_lbl;
    public static javax.swing.JTextField secuencia_txt;
    private javax.swing.JSeparator separador3;
    private javax.swing.JTextField subtotal_txt;
    private javax.swing.JLabel titulo_lbl;
    private javax.swing.JLabel total_lbl;
    private javax.swing.JTextField total_txt;
    private javax.swing.JLabel verificar_comp_lbl;
    // End of variables declaration//GEN-END:variables
}
