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

/**
 *
 * @author Admin
 */
public final class inventario_tb extends javax.swing.JFrame {

    conexion cn = new conexion();
    Connection cnn = cn.conectar();
    DefaultTableModel general;
    DefaultTableModel tela;
    DefaultTableModel combustible;
    DefaultTableModel repuestos;
    DefaultTableModel quimicos;
    DefaultTableModel gastables;
    DefaultTableModel empaque;

    public inventario_tb() {
        initComponents();
        this.setExtendedState(inventario_tb.MAXIMIZED_BOTH);
        this.general = (DefaultTableModel) general_tbl.getModel();
        this.tela = (DefaultTableModel) tela_tbl.getModel();
        this.combustible = (DefaultTableModel) combustible_tbl.getModel();
        this.repuestos = (DefaultTableModel) repuestos_tbl.getModel();
        this.quimicos = (DefaultTableModel) quimicos_tbl.getModel();
        this.gastables = (DefaultTableModel) gastable_tbl.getModel();
        this.empaque = (DefaultTableModel) empaque_tbl.getModel();

        cargar_g();
        cargar_t();
        cargar_c();
        cargar_r();
        cargar_q();
        cargar_ga();
        cargar_e();

    }

    public void refrescarg() {
        //REFRESCAR GENERAL
        try {
            general.setColumnCount(0);
            general.setRowCount(0);
            general_tbl.revalidate();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error " + ex);
        }
    }

    public void refrescart() {
        //REFRESCARTELA
        try {
            tela.setColumnCount(0);
            tela.setRowCount(0);
            tela_tbl.revalidate();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error " + ex);
        }
    }

    public void refrescarc() {
        //REFRESCAR COMBUSTIBLE
        try {

            combustible.setColumnCount(0);
            combustible.setRowCount(0);
            combustible_tbl.revalidate();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error " + ex);
        }
    }

    public void refrescarr() {
        //REFRESCAR REPUESTOS
        try {

            repuestos.setColumnCount(0);
            repuestos.setRowCount(0);
            repuestos_tbl.revalidate();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error " + ex);
        }
    }

    public void refrescarq() {
        //REFRESCAR QUIMICOS
        try {

            quimicos.setColumnCount(0);
            quimicos.setRowCount(0);
            quimicos_tbl.revalidate();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error " + ex);
        }
    }

    public void refrescarga() {
        //REFRESCAR GASTABLES
        try {

            gastables.setColumnCount(0);
            gastables.setRowCount(0);
            gastable_tbl.revalidate();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error " + ex);
        }
    }

    public void refrescare() {
        //REFRESCAR EMPAQUE
        try {

            empaque.setColumnCount(0);
            empaque.setRowCount(0);
            empaque_tbl.revalidate();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error " + ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        azul_pnl = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tipos_tbd_pnl = new javax.swing.JTabbedPane();
        general_pnl = new javax.swing.JPanel();
        general_scrll = new javax.swing.JScrollPane();
        general_tbl = new javax.swing.JTable();
        reporte_btn = new javax.swing.JButton();
        edit_inv_lbl = new javax.swing.JLabel();
        separador_inv = new javax.swing.JSeparator();
        codigo_materia_lbl = new javax.swing.JLabel();
        cod_txt = new javax.swing.JTextField();
        nombre_materia_lbl = new javax.swing.JLabel();
        nom_txt = new javax.swing.JTextField();
        cantidad_materia_lbl = new javax.swing.JLabel();
        can_txt = new javax.swing.JTextField();
        guardar_btn = new javax.swing.JButton();
        precio_materia_lbl = new javax.swing.JLabel();
        pre_txt = new javax.swing.JTextField();
        cerrar_btn = new javax.swing.JButton();
        borrar_btn = new javax.swing.JButton();
        umed_lbl = new javax.swing.JLabel();
        umed_txt = new javax.swing.JTextField();
        tipo_inv_lbl = new javax.swing.JLabel();
        tipo_inv_box = new javax.swing.JComboBox<>();
        tela_pnl = new javax.swing.JPanel();
        tela_scrll = new javax.swing.JScrollPane();
        tela_tbl = new javax.swing.JTable();
        reporte_tela_btn = new javax.swing.JButton();
        nueva_tela_lbl = new javax.swing.JLabel();
        separador = new javax.swing.JSeparator();
        nombre_tela_lbl = new javax.swing.JLabel();
        nombre_tela_txt = new javax.swing.JTextField();
        yardas_lbl = new javax.swing.JLabel();
        yardas_txt = new javax.swing.JTextField();
        precio_yarda_lbl = new javax.swing.JLabel();
        precio_yarda_txt = new javax.swing.JTextField();
        agregar_tela_btn = new javax.swing.JButton();
        combustible_pnl = new javax.swing.JPanel();
        combustible_scrll = new javax.swing.JScrollPane();
        combustible_tbl = new javax.swing.JTable();
        reporte_combustible_btn = new javax.swing.JButton();
        nuevo_combustible_lbl = new javax.swing.JLabel();
        separador_c = new javax.swing.JSeparator();
        nombre_combustible_lbl = new javax.swing.JLabel();
        nombre_combustible_txt = new javax.swing.JTextField();
        galones_lbl = new javax.swing.JLabel();
        galones_txt = new javax.swing.JTextField();
        precio_galon_lbl = new javax.swing.JLabel();
        precio_galon_txt = new javax.swing.JTextField();
        agregar_combustible_btn = new javax.swing.JButton();
        unidad_med_lbl = new javax.swing.JLabel();
        unidad_med_txt = new javax.swing.JTextField();
        repuestos_pnl = new javax.swing.JPanel();
        repuestos_scrll = new javax.swing.JScrollPane();
        repuestos_tbl = new javax.swing.JTable();
        reporte_repuestos_btn = new javax.swing.JButton();
        nuevo_rep_lbl = new javax.swing.JLabel();
        separador_r = new javax.swing.JSeparator();
        nombre_repuesto_lbl = new javax.swing.JLabel();
        nombre_repuesto_txt = new javax.swing.JTextField();
        unidades_lbl = new javax.swing.JLabel();
        unidad_txt = new javax.swing.JTextField();
        precio_unidad_lbl = new javax.swing.JLabel();
        precio_unidad_txt = new javax.swing.JTextField();
        agregar_repuesto_btn = new javax.swing.JButton();
        quimicos_pnl = new javax.swing.JPanel();
        quimicos_scrll = new javax.swing.JScrollPane();
        quimicos_tbl = new javax.swing.JTable();
        reporte_quimicos_btn = new javax.swing.JButton();
        nueva_tela_lbl4 = new javax.swing.JLabel();
        separador_quimico = new javax.swing.JSeparator();
        nombre_quimico_lbl = new javax.swing.JLabel();
        nombre_quimico_txt = new javax.swing.JTextField();
        cantidad_lbl = new javax.swing.JLabel();
        cantidad_txt = new javax.swing.JTextField();
        unidad_medida_lbl = new javax.swing.JLabel();
        unidad_medida_txt = new javax.swing.JTextField();
        agregar_quimico_btn = new javax.swing.JButton();
        precio_cantidad_lbl = new javax.swing.JLabel();
        precio_cantidad_txt = new javax.swing.JTextField();
        gastables_pnl = new javax.swing.JPanel();
        gastable_scrll = new javax.swing.JScrollPane();
        gastable_tbl = new javax.swing.JTable();
        reporte_gastables_btn = new javax.swing.JButton();
        nuevo_gastable_lbl = new javax.swing.JLabel();
        separador_g_txt = new javax.swing.JSeparator();
        nombre_g_lbl = new javax.swing.JLabel();
        nombre_g_txt = new javax.swing.JTextField();
        unidades_g_lbl = new javax.swing.JLabel();
        unidades_g_txt = new javax.swing.JTextField();
        precio_unidad_g_lbl = new javax.swing.JLabel();
        precio_unidad_g_txt = new javax.swing.JTextField();
        agregar_gastable_btn = new javax.swing.JButton();
        empaque_pnl = new javax.swing.JPanel();
        empaque_scrll = new javax.swing.JScrollPane();
        empaque_tbl = new javax.swing.JTable();
        reporte_empaque_btn = new javax.swing.JButton();
        nuevo_em_lbl = new javax.swing.JLabel();
        separador_e = new javax.swing.JSeparator();
        nombre_empaque_lbl = new javax.swing.JLabel();
        nombre_empaque_txt = new javax.swing.JTextField();
        unidades_empaque_lbl = new javax.swing.JLabel();
        unidades_empaque_txt = new javax.swing.JTextField();
        precio_unidad_empaque_lbl = new javax.swing.JLabel();
        precio_unidad_empaque_txt = new javax.swing.JTextField();
        agregar_tela_btn1 = new javax.swing.JButton();
        unidad_medida_e_lbl = new javax.swing.JLabel();
        unidad_medida_e_txt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconImage(new ImageIcon(getClass().getResource("/imgs/logo.png")).getImage());

        azul_pnl.setBackground(new java.awt.Color(8, 41, 138));

        jScrollPane1.setBackground(new java.awt.Color(8, 41, 138));
        jScrollPane1.setBorder(null);

        tipos_tbd_pnl.setBackground(new java.awt.Color(255, 255, 255));
        tipos_tbd_pnl.setForeground(new java.awt.Color(0, 0, 0));
        tipos_tbd_pnl.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N

        general_pnl.setBackground(new java.awt.Color(255, 255, 255));
        general_pnl.setForeground(new java.awt.Color(0, 0, 0));

        general_tbl.setBackground(new java.awt.Color(255, 255, 255));
        general_tbl.setFont(new java.awt.Font("Candara Light", 0, 18)); // NOI18N
        general_tbl.setForeground(new java.awt.Color(0, 0, 0));
        general_tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        general_tbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                general_tblMouseClicked(evt);
            }
        });
        general_scrll.setViewportView(general_tbl);

        reporte_btn.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        reporte_btn.setForeground(new java.awt.Color(0, 0, 102));
        reporte_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_sign_document_32px_2.png"))); // NOI18N
        reporte_btn.setText("Reporte");
        reporte_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        reporte_btn.setContentAreaFilled(false);
        reporte_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reporte_btnActionPerformed(evt);
            }
        });

        edit_inv_lbl.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        edit_inv_lbl.setForeground(new java.awt.Color(0, 0, 102));
        edit_inv_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        edit_inv_lbl.setText("Inventario general");

        codigo_materia_lbl.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        codigo_materia_lbl.setForeground(new java.awt.Color(0, 0, 102));
        codigo_materia_lbl.setText("Código");

        cod_txt.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        cod_txt.setForeground(new java.awt.Color(0, 0, 0));
        cod_txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        cod_txt.setCaretColor(new java.awt.Color(0, 0, 0));
        cod_txt.setEnabled(false);
        cod_txt.setOpaque(false);

        nombre_materia_lbl.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        nombre_materia_lbl.setForeground(new java.awt.Color(0, 0, 102));
        nombre_materia_lbl.setText("Nombre");

        nom_txt.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        nom_txt.setForeground(new java.awt.Color(0, 0, 0));
        nom_txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        nom_txt.setCaretColor(new java.awt.Color(0, 0, 0));
        nom_txt.setOpaque(false);

        cantidad_materia_lbl.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        cantidad_materia_lbl.setForeground(new java.awt.Color(0, 0, 102));
        cantidad_materia_lbl.setText("cantidad");

        can_txt.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        can_txt.setForeground(new java.awt.Color(0, 0, 0));
        can_txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        can_txt.setCaretColor(new java.awt.Color(0, 0, 0));
        can_txt.setOpaque(false);

        guardar_btn.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        guardar_btn.setForeground(new java.awt.Color(0, 0, 102));
        guardar_btn.setText("Actualizar");
        guardar_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        guardar_btn.setContentAreaFilled(false);
        guardar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardar_btnActionPerformed(evt);
            }
        });

        precio_materia_lbl.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        precio_materia_lbl.setForeground(new java.awt.Color(0, 0, 102));
        precio_materia_lbl.setText("Precio");

        pre_txt.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        pre_txt.setForeground(new java.awt.Color(0, 0, 0));
        pre_txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        pre_txt.setCaretColor(new java.awt.Color(0, 0, 0));
        pre_txt.setOpaque(false);

        cerrar_btn.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        cerrar_btn.setForeground(new java.awt.Color(102, 0, 0));
        cerrar_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_Logout_24px.png"))); // NOI18N
        cerrar_btn.setText("Cerrar sesión");
        cerrar_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cerrar_btn.setContentAreaFilled(false);
        cerrar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrar_btnActionPerformed(evt);
            }
        });

        borrar_btn.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        borrar_btn.setForeground(new java.awt.Color(153, 0, 0));
        borrar_btn.setText("Borrar");
        borrar_btn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        borrar_btn.setContentAreaFilled(false);
        borrar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrar_btnActionPerformed(evt);
            }
        });

        umed_lbl.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        umed_lbl.setForeground(new java.awt.Color(0, 0, 102));
        umed_lbl.setText("Unidad de medida");

        umed_txt.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        umed_txt.setForeground(new java.awt.Color(0, 0, 0));
        umed_txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        umed_txt.setCaretColor(new java.awt.Color(0, 0, 0));
        umed_txt.setOpaque(false);

        tipo_inv_lbl.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        tipo_inv_lbl.setForeground(new java.awt.Color(0, 0, 102));
        tipo_inv_lbl.setText("Tipo de inventario");

        tipo_inv_box.setBackground(new java.awt.Color(255, 255, 255));
        tipo_inv_box.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        tipo_inv_box.setForeground(new java.awt.Color(0, 0, 0));
        tipo_inv_box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tela", "Repuestos", "Químicos", "Combustible", "Empaque", "Materiales  gastables" }));

        javax.swing.GroupLayout general_pnlLayout = new javax.swing.GroupLayout(general_pnl);
        general_pnl.setLayout(general_pnlLayout);
        general_pnlLayout.setHorizontalGroup(
            general_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(general_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(general_scrll, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(general_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(can_txt, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cod_txt, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(separador_inv, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(edit_inv_lbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(reporte_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE)
                    .addComponent(codigo_materia_lbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nombre_materia_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nom_txt)
                    .addComponent(cantidad_materia_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pre_txt, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(precio_materia_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cerrar_btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(general_pnlLayout.createSequentialGroup()
                        .addComponent(guardar_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(borrar_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE))
                    .addComponent(umed_txt, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(umed_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tipo_inv_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tipo_inv_box, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        general_pnlLayout.setVerticalGroup(
            general_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(general_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(general_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(general_scrll, javax.swing.GroupLayout.DEFAULT_SIZE, 727, Short.MAX_VALUE)
                    .addGroup(general_pnlLayout.createSequentialGroup()
                        .addComponent(cerrar_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(reporte_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(edit_inv_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(separador_inv, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(codigo_materia_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cod_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nombre_materia_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nom_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cantidad_materia_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(can_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(precio_materia_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pre_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(umed_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(umed_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tipo_inv_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tipo_inv_box, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(general_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(guardar_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                            .addComponent(borrar_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );

        tipos_tbd_pnl.addTab("General", general_pnl);

        tela_pnl.setBackground(new java.awt.Color(255, 255, 255));
        tela_pnl.setForeground(new java.awt.Color(0, 0, 0));

        tela_tbl.setBackground(new java.awt.Color(255, 255, 255));
        tela_tbl.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        tela_tbl.setForeground(new java.awt.Color(0, 0, 0));
        tela_tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tela_scrll.setViewportView(tela_tbl);

        reporte_tela_btn.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        reporte_tela_btn.setForeground(new java.awt.Color(0, 0, 102));
        reporte_tela_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_sign_document_32px_2.png"))); // NOI18N
        reporte_tela_btn.setText("Reporte");
        reporte_tela_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        reporte_tela_btn.setContentAreaFilled(false);
        reporte_tela_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reporte_tela_btnActionPerformed(evt);
            }
        });

        nueva_tela_lbl.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        nueva_tela_lbl.setForeground(new java.awt.Color(0, 0, 102));
        nueva_tela_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nueva_tela_lbl.setText("Nueva tela");

        separador.setBackground(new java.awt.Color(0, 0, 0));

        nombre_tela_lbl.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        nombre_tela_lbl.setForeground(new java.awt.Color(0, 0, 102));
        nombre_tela_lbl.setText("Nombre");

        nombre_tela_txt.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        nombre_tela_txt.setForeground(new java.awt.Color(0, 0, 0));
        nombre_tela_txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        nombre_tela_txt.setCaretColor(new java.awt.Color(0, 0, 0));
        nombre_tela_txt.setOpaque(false);

        yardas_lbl.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        yardas_lbl.setForeground(new java.awt.Color(0, 0, 102));
        yardas_lbl.setText("Yardas");

        yardas_txt.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        yardas_txt.setForeground(new java.awt.Color(0, 0, 0));
        yardas_txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        yardas_txt.setCaretColor(new java.awt.Color(0, 0, 0));
        yardas_txt.setOpaque(false);

        precio_yarda_lbl.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        precio_yarda_lbl.setForeground(new java.awt.Color(0, 0, 102));
        precio_yarda_lbl.setText("Precio por yarda");

        precio_yarda_txt.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        precio_yarda_txt.setForeground(new java.awt.Color(0, 0, 0));
        precio_yarda_txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        precio_yarda_txt.setCaretColor(new java.awt.Color(0, 0, 0));
        precio_yarda_txt.setOpaque(false);

        agregar_tela_btn.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        agregar_tela_btn.setForeground(new java.awt.Color(0, 0, 102));
        agregar_tela_btn.setText("Agregar");
        agregar_tela_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        agregar_tela_btn.setContentAreaFilled(false);
        agregar_tela_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregar_tela_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tela_pnlLayout = new javax.swing.GroupLayout(tela_pnl);
        tela_pnl.setLayout(tela_pnlLayout);
        tela_pnlLayout.setHorizontalGroup(
            tela_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tela_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tela_scrll, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tela_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(reporte_tela_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)
                    .addComponent(nueva_tela_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(separador)
                    .addComponent(nombre_tela_txt)
                    .addComponent(yardas_txt)
                    .addComponent(precio_yarda_txt)
                    .addGroup(tela_pnlLayout.createSequentialGroup()
                        .addGroup(tela_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombre_tela_lbl)
                            .addComponent(yardas_lbl)
                            .addComponent(precio_yarda_lbl))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(agregar_tela_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        tela_pnlLayout.setVerticalGroup(
            tela_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tela_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tela_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tela_pnlLayout.createSequentialGroup()
                        .addComponent(reporte_tela_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(nueva_tela_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(separador, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nombre_tela_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nombre_tela_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(yardas_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(yardas_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(precio_yarda_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(precio_yarda_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(agregar_tela_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(tela_scrll, javax.swing.GroupLayout.DEFAULT_SIZE, 727, Short.MAX_VALUE))
                .addContainerGap())
        );

        tipos_tbd_pnl.addTab("Tela", tela_pnl);

        combustible_pnl.setBackground(new java.awt.Color(255, 255, 255));
        combustible_pnl.setForeground(new java.awt.Color(0, 0, 0));

        combustible_tbl.setBackground(new java.awt.Color(255, 255, 255));
        combustible_tbl.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        combustible_tbl.setForeground(new java.awt.Color(0, 0, 0));
        combustible_tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        combustible_scrll.setViewportView(combustible_tbl);

        reporte_combustible_btn.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        reporte_combustible_btn.setForeground(new java.awt.Color(0, 0, 102));
        reporte_combustible_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_sign_document_32px_2.png"))); // NOI18N
        reporte_combustible_btn.setText("Reporte");
        reporte_combustible_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        reporte_combustible_btn.setContentAreaFilled(false);
        reporte_combustible_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reporte_combustible_btnActionPerformed(evt);
            }
        });

        nuevo_combustible_lbl.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        nuevo_combustible_lbl.setForeground(new java.awt.Color(0, 0, 102));
        nuevo_combustible_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nuevo_combustible_lbl.setText("Nuevo combustible");

        separador_c.setBackground(new java.awt.Color(0, 0, 0));

        nombre_combustible_lbl.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        nombre_combustible_lbl.setForeground(new java.awt.Color(0, 0, 102));
        nombre_combustible_lbl.setText("Nombre");

        nombre_combustible_txt.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        nombre_combustible_txt.setForeground(new java.awt.Color(0, 0, 0));
        nombre_combustible_txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        nombre_combustible_txt.setCaretColor(new java.awt.Color(0, 0, 0));
        nombre_combustible_txt.setOpaque(false);

        galones_lbl.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        galones_lbl.setForeground(new java.awt.Color(0, 0, 102));
        galones_lbl.setText("Galónes/Tanques");

        galones_txt.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        galones_txt.setForeground(new java.awt.Color(0, 0, 0));
        galones_txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        galones_txt.setCaretColor(new java.awt.Color(0, 0, 0));
        galones_txt.setOpaque(false);

        precio_galon_lbl.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        precio_galon_lbl.setForeground(new java.awt.Color(0, 0, 102));
        precio_galon_lbl.setText("Precio unitario");

        precio_galon_txt.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        precio_galon_txt.setForeground(new java.awt.Color(0, 0, 0));
        precio_galon_txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        precio_galon_txt.setCaretColor(new java.awt.Color(0, 0, 0));
        precio_galon_txt.setOpaque(false);

        agregar_combustible_btn.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        agregar_combustible_btn.setForeground(new java.awt.Color(0, 0, 102));
        agregar_combustible_btn.setText("Agregar");
        agregar_combustible_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        agregar_combustible_btn.setContentAreaFilled(false);
        agregar_combustible_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregar_combustible_btnActionPerformed(evt);
            }
        });

        unidad_med_lbl.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        unidad_med_lbl.setForeground(new java.awt.Color(0, 0, 102));
        unidad_med_lbl.setText("Unidad de medida");

        unidad_med_txt.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        unidad_med_txt.setForeground(new java.awt.Color(0, 0, 0));
        unidad_med_txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        unidad_med_txt.setCaretColor(new java.awt.Color(0, 0, 0));
        unidad_med_txt.setOpaque(false);

        javax.swing.GroupLayout combustible_pnlLayout = new javax.swing.GroupLayout(combustible_pnl);
        combustible_pnl.setLayout(combustible_pnlLayout);
        combustible_pnlLayout.setHorizontalGroup(
            combustible_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(combustible_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(combustible_scrll, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(combustible_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(reporte_combustible_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
                    .addComponent(nuevo_combustible_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(separador_c)
                    .addComponent(nombre_combustible_txt)
                    .addComponent(galones_txt)
                    .addComponent(precio_galon_txt)
                    .addComponent(agregar_combustible_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(unidad_med_txt)
                    .addGroup(combustible_pnlLayout.createSequentialGroup()
                        .addGroup(combustible_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombre_combustible_lbl)
                            .addComponent(galones_lbl)
                            .addComponent(precio_galon_lbl)
                            .addComponent(unidad_med_lbl))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        combustible_pnlLayout.setVerticalGroup(
            combustible_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(combustible_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(combustible_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(combustible_pnlLayout.createSequentialGroup()
                        .addComponent(reporte_combustible_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(nuevo_combustible_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(separador_c, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nombre_combustible_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nombre_combustible_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(galones_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(galones_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(precio_galon_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(precio_galon_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(unidad_med_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(unidad_med_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(agregar_combustible_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(combustible_scrll, javax.swing.GroupLayout.DEFAULT_SIZE, 727, Short.MAX_VALUE))
                .addContainerGap())
        );

        tipos_tbd_pnl.addTab("Combustible", combustible_pnl);

        repuestos_pnl.setBackground(new java.awt.Color(255, 255, 255));
        repuestos_pnl.setForeground(new java.awt.Color(0, 0, 0));

        repuestos_tbl.setBackground(new java.awt.Color(255, 255, 255));
        repuestos_tbl.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        repuestos_tbl.setForeground(new java.awt.Color(0, 0, 0));
        repuestos_tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        repuestos_scrll.setViewportView(repuestos_tbl);

        reporte_repuestos_btn.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        reporte_repuestos_btn.setForeground(new java.awt.Color(0, 0, 102));
        reporte_repuestos_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_sign_document_32px_2.png"))); // NOI18N
        reporte_repuestos_btn.setText("Reporte");
        reporte_repuestos_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        reporte_repuestos_btn.setContentAreaFilled(false);
        reporte_repuestos_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reporte_repuestos_btnActionPerformed(evt);
            }
        });

        nuevo_rep_lbl.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        nuevo_rep_lbl.setForeground(new java.awt.Color(0, 0, 102));
        nuevo_rep_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nuevo_rep_lbl.setText("Nuevo repuesto");

        separador_r.setBackground(new java.awt.Color(0, 0, 0));

        nombre_repuesto_lbl.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        nombre_repuesto_lbl.setForeground(new java.awt.Color(0, 0, 102));
        nombre_repuesto_lbl.setText("Nombre");

        nombre_repuesto_txt.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        nombre_repuesto_txt.setForeground(new java.awt.Color(0, 0, 0));
        nombre_repuesto_txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        nombre_repuesto_txt.setCaretColor(new java.awt.Color(0, 0, 0));
        nombre_repuesto_txt.setOpaque(false);

        unidades_lbl.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        unidades_lbl.setForeground(new java.awt.Color(0, 0, 102));
        unidades_lbl.setText("Unidades");

        unidad_txt.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        unidad_txt.setForeground(new java.awt.Color(0, 0, 0));
        unidad_txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        unidad_txt.setCaretColor(new java.awt.Color(0, 0, 0));
        unidad_txt.setOpaque(false);

        precio_unidad_lbl.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        precio_unidad_lbl.setForeground(new java.awt.Color(0, 0, 102));
        precio_unidad_lbl.setText("Precio por unidad");

        precio_unidad_txt.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        precio_unidad_txt.setForeground(new java.awt.Color(0, 0, 0));
        precio_unidad_txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        precio_unidad_txt.setCaretColor(new java.awt.Color(0, 0, 0));
        precio_unidad_txt.setOpaque(false);

        agregar_repuesto_btn.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        agregar_repuesto_btn.setForeground(new java.awt.Color(0, 0, 102));
        agregar_repuesto_btn.setText("Agregar");
        agregar_repuesto_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        agregar_repuesto_btn.setContentAreaFilled(false);
        agregar_repuesto_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregar_repuesto_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout repuestos_pnlLayout = new javax.swing.GroupLayout(repuestos_pnl);
        repuestos_pnl.setLayout(repuestos_pnlLayout);
        repuestos_pnlLayout.setHorizontalGroup(
            repuestos_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(repuestos_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(repuestos_scrll, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(repuestos_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(reporte_repuestos_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
                    .addComponent(nuevo_rep_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(separador_r)
                    .addComponent(nombre_repuesto_txt)
                    .addComponent(unidad_txt)
                    .addComponent(precio_unidad_txt)
                    .addGroup(repuestos_pnlLayout.createSequentialGroup()
                        .addGroup(repuestos_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombre_repuesto_lbl)
                            .addComponent(unidades_lbl)
                            .addComponent(precio_unidad_lbl))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(agregar_repuesto_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        repuestos_pnlLayout.setVerticalGroup(
            repuestos_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(repuestos_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(repuestos_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(repuestos_scrll)
                    .addGroup(repuestos_pnlLayout.createSequentialGroup()
                        .addComponent(reporte_repuestos_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(nuevo_rep_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(separador_r, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nombre_repuesto_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nombre_repuesto_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(unidades_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(unidad_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(precio_unidad_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(precio_unidad_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(agregar_repuesto_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 298, Short.MAX_VALUE)))
                .addContainerGap())
        );

        tipos_tbd_pnl.addTab("Repuestos", repuestos_pnl);

        quimicos_pnl.setBackground(new java.awt.Color(255, 255, 255));
        quimicos_pnl.setForeground(new java.awt.Color(0, 0, 0));

        quimicos_tbl.setBackground(new java.awt.Color(255, 255, 255));
        quimicos_tbl.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        quimicos_tbl.setForeground(new java.awt.Color(0, 0, 0));
        quimicos_tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        quimicos_scrll.setViewportView(quimicos_tbl);

        reporte_quimicos_btn.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        reporte_quimicos_btn.setForeground(new java.awt.Color(0, 0, 102));
        reporte_quimicos_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_sign_document_32px_2.png"))); // NOI18N
        reporte_quimicos_btn.setText("Reporte");
        reporte_quimicos_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        reporte_quimicos_btn.setContentAreaFilled(false);
        reporte_quimicos_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reporte_quimicos_btnActionPerformed(evt);
            }
        });

        nueva_tela_lbl4.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        nueva_tela_lbl4.setForeground(new java.awt.Color(0, 0, 102));
        nueva_tela_lbl4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nueva_tela_lbl4.setText("Nuevo químico");

        nombre_quimico_lbl.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        nombre_quimico_lbl.setForeground(new java.awt.Color(0, 0, 102));
        nombre_quimico_lbl.setText("Nombre");

        nombre_quimico_txt.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        nombre_quimico_txt.setForeground(new java.awt.Color(0, 0, 0));
        nombre_quimico_txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        nombre_quimico_txt.setCaretColor(new java.awt.Color(0, 0, 0));
        nombre_quimico_txt.setOpaque(false);

        cantidad_lbl.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        cantidad_lbl.setForeground(new java.awt.Color(0, 0, 102));
        cantidad_lbl.setText("Cantidad");

        cantidad_txt.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        cantidad_txt.setForeground(new java.awt.Color(0, 0, 0));
        cantidad_txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        cantidad_txt.setCaretColor(new java.awt.Color(0, 0, 0));
        cantidad_txt.setOpaque(false);

        unidad_medida_lbl.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        unidad_medida_lbl.setForeground(new java.awt.Color(0, 0, 102));
        unidad_medida_lbl.setText("Unidad de medida");

        unidad_medida_txt.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        unidad_medida_txt.setForeground(new java.awt.Color(0, 0, 0));
        unidad_medida_txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        unidad_medida_txt.setCaretColor(new java.awt.Color(0, 0, 0));
        unidad_medida_txt.setOpaque(false);

        agregar_quimico_btn.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        agregar_quimico_btn.setForeground(new java.awt.Color(0, 0, 102));
        agregar_quimico_btn.setText("Agregar");
        agregar_quimico_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        agregar_quimico_btn.setContentAreaFilled(false);
        agregar_quimico_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregar_quimico_btnActionPerformed(evt);
            }
        });

        precio_cantidad_lbl.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        precio_cantidad_lbl.setForeground(new java.awt.Color(0, 0, 102));
        precio_cantidad_lbl.setText("Precio unitario");

        precio_cantidad_txt.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        precio_cantidad_txt.setForeground(new java.awt.Color(0, 0, 0));
        precio_cantidad_txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        precio_cantidad_txt.setCaretColor(new java.awt.Color(0, 0, 0));
        precio_cantidad_txt.setOpaque(false);

        javax.swing.GroupLayout quimicos_pnlLayout = new javax.swing.GroupLayout(quimicos_pnl);
        quimicos_pnl.setLayout(quimicos_pnlLayout);
        quimicos_pnlLayout.setHorizontalGroup(
            quimicos_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(quimicos_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(quimicos_scrll)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(quimicos_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(reporte_quimicos_btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE)
                    .addComponent(nueva_tela_lbl4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(separador_quimico)
                    .addComponent(nombre_quimico_txt)
                    .addComponent(cantidad_txt)
                    .addComponent(unidad_medida_txt)
                    .addComponent(agregar_quimico_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(precio_cantidad_txt)
                    .addGroup(quimicos_pnlLayout.createSequentialGroup()
                        .addGroup(quimicos_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombre_quimico_lbl)
                            .addComponent(cantidad_lbl)
                            .addComponent(unidad_medida_lbl)
                            .addComponent(precio_cantidad_lbl))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        quimicos_pnlLayout.setVerticalGroup(
            quimicos_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(quimicos_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(quimicos_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(quimicos_scrll, javax.swing.GroupLayout.DEFAULT_SIZE, 727, Short.MAX_VALUE)
                    .addGroup(quimicos_pnlLayout.createSequentialGroup()
                        .addComponent(reporte_quimicos_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(nueva_tela_lbl4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(separador_quimico, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nombre_quimico_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nombre_quimico_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cantidad_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cantidad_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(unidad_medida_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(unidad_medida_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(precio_cantidad_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(precio_cantidad_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(agregar_quimico_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        tipos_tbd_pnl.addTab("Químicos", quimicos_pnl);

        gastables_pnl.setBackground(new java.awt.Color(255, 255, 255));
        gastables_pnl.setForeground(new java.awt.Color(0, 0, 0));

        gastable_tbl.setBackground(new java.awt.Color(255, 255, 255));
        gastable_tbl.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        gastable_tbl.setForeground(new java.awt.Color(0, 0, 0));
        gastable_tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        gastable_scrll.setViewportView(gastable_tbl);

        reporte_gastables_btn.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        reporte_gastables_btn.setForeground(new java.awt.Color(0, 0, 102));
        reporte_gastables_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_sign_document_32px_2.png"))); // NOI18N
        reporte_gastables_btn.setText("Reporte");
        reporte_gastables_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        reporte_gastables_btn.setContentAreaFilled(false);
        reporte_gastables_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reporte_gastables_btnActionPerformed(evt);
            }
        });

        nuevo_gastable_lbl.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        nuevo_gastable_lbl.setForeground(new java.awt.Color(0, 0, 102));
        nuevo_gastable_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nuevo_gastable_lbl.setText("Nuevo gastable");

        nombre_g_lbl.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        nombre_g_lbl.setForeground(new java.awt.Color(0, 0, 102));
        nombre_g_lbl.setText("Nombre");

        nombre_g_txt.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        nombre_g_txt.setForeground(new java.awt.Color(0, 0, 0));
        nombre_g_txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        nombre_g_txt.setCaretColor(new java.awt.Color(0, 0, 0));
        nombre_g_txt.setOpaque(false);

        unidades_g_lbl.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        unidades_g_lbl.setForeground(new java.awt.Color(0, 0, 102));
        unidades_g_lbl.setText("Unidades");

        unidades_g_txt.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        unidades_g_txt.setForeground(new java.awt.Color(0, 0, 0));
        unidades_g_txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        unidades_g_txt.setCaretColor(new java.awt.Color(0, 0, 0));
        unidades_g_txt.setOpaque(false);

        precio_unidad_g_lbl.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        precio_unidad_g_lbl.setForeground(new java.awt.Color(0, 0, 102));
        precio_unidad_g_lbl.setText("Precio por unidad");

        precio_unidad_g_txt.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        precio_unidad_g_txt.setForeground(new java.awt.Color(0, 0, 0));
        precio_unidad_g_txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        precio_unidad_g_txt.setCaretColor(new java.awt.Color(0, 0, 0));
        precio_unidad_g_txt.setOpaque(false);

        agregar_gastable_btn.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        agregar_gastable_btn.setForeground(new java.awt.Color(0, 0, 102));
        agregar_gastable_btn.setText("Agregar");
        agregar_gastable_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        agregar_gastable_btn.setContentAreaFilled(false);
        agregar_gastable_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregar_gastable_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout gastables_pnlLayout = new javax.swing.GroupLayout(gastables_pnl);
        gastables_pnl.setLayout(gastables_pnlLayout);
        gastables_pnlLayout.setHorizontalGroup(
            gastables_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gastables_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gastable_scrll)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(gastables_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(reporte_gastables_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE)
                    .addComponent(nuevo_gastable_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(separador_g_txt)
                    .addComponent(nombre_g_txt)
                    .addComponent(unidades_g_txt)
                    .addComponent(precio_unidad_g_txt)
                    .addGroup(gastables_pnlLayout.createSequentialGroup()
                        .addGroup(gastables_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombre_g_lbl)
                            .addComponent(unidades_g_lbl)
                            .addComponent(precio_unidad_g_lbl))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(agregar_gastable_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        gastables_pnlLayout.setVerticalGroup(
            gastables_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gastables_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(gastables_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gastables_pnlLayout.createSequentialGroup()
                        .addComponent(reporte_gastables_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(nuevo_gastable_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(separador_g_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nombre_g_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nombre_g_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(unidades_g_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(unidades_g_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(precio_unidad_g_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(precio_unidad_g_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(agregar_gastable_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(gastable_scrll, javax.swing.GroupLayout.DEFAULT_SIZE, 727, Short.MAX_VALUE))
                .addContainerGap())
        );

        tipos_tbd_pnl.addTab("Gastables", gastables_pnl);

        empaque_pnl.setBackground(new java.awt.Color(255, 255, 255));
        empaque_pnl.setForeground(new java.awt.Color(0, 0, 0));

        empaque_tbl.setBackground(new java.awt.Color(255, 255, 255));
        empaque_tbl.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        empaque_tbl.setForeground(new java.awt.Color(0, 0, 0));
        empaque_tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        empaque_scrll.setViewportView(empaque_tbl);

        reporte_empaque_btn.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        reporte_empaque_btn.setForeground(new java.awt.Color(0, 0, 102));
        reporte_empaque_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_sign_document_32px_2.png"))); // NOI18N
        reporte_empaque_btn.setText("Reporte");
        reporte_empaque_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        reporte_empaque_btn.setContentAreaFilled(false);
        reporte_empaque_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reporte_empaque_btnActionPerformed(evt);
            }
        });

        nuevo_em_lbl.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        nuevo_em_lbl.setForeground(new java.awt.Color(0, 0, 102));
        nuevo_em_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nuevo_em_lbl.setText("Nuevo material de empaque");

        nombre_empaque_lbl.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        nombre_empaque_lbl.setForeground(new java.awt.Color(0, 0, 102));
        nombre_empaque_lbl.setText("Nombre");

        nombre_empaque_txt.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        nombre_empaque_txt.setForeground(new java.awt.Color(0, 0, 0));
        nombre_empaque_txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        nombre_empaque_txt.setCaretColor(new java.awt.Color(0, 0, 0));
        nombre_empaque_txt.setOpaque(false);

        unidades_empaque_lbl.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        unidades_empaque_lbl.setForeground(new java.awt.Color(0, 0, 102));
        unidades_empaque_lbl.setText("Unidades");

        unidades_empaque_txt.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        unidades_empaque_txt.setForeground(new java.awt.Color(0, 0, 0));
        unidades_empaque_txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        unidades_empaque_txt.setCaretColor(new java.awt.Color(0, 0, 0));
        unidades_empaque_txt.setOpaque(false);

        precio_unidad_empaque_lbl.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        precio_unidad_empaque_lbl.setForeground(new java.awt.Color(0, 0, 102));
        precio_unidad_empaque_lbl.setText("Precio por unidad");

        precio_unidad_empaque_txt.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        precio_unidad_empaque_txt.setForeground(new java.awt.Color(0, 0, 0));
        precio_unidad_empaque_txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        precio_unidad_empaque_txt.setCaretColor(new java.awt.Color(0, 0, 0));
        precio_unidad_empaque_txt.setOpaque(false);

        agregar_tela_btn1.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        agregar_tela_btn1.setForeground(new java.awt.Color(0, 0, 102));
        agregar_tela_btn1.setText("Agregar");
        agregar_tela_btn1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        agregar_tela_btn1.setContentAreaFilled(false);
        agregar_tela_btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregar_tela_btn1ActionPerformed(evt);
            }
        });

        unidad_medida_e_lbl.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        unidad_medida_e_lbl.setForeground(new java.awt.Color(0, 0, 102));
        unidad_medida_e_lbl.setText("Unidad de medida");

        unidad_medida_e_txt.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        unidad_medida_e_txt.setForeground(new java.awt.Color(0, 0, 0));
        unidad_medida_e_txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        unidad_medida_e_txt.setCaretColor(new java.awt.Color(0, 0, 0));
        unidad_medida_e_txt.setOpaque(false);

        javax.swing.GroupLayout empaque_pnlLayout = new javax.swing.GroupLayout(empaque_pnl);
        empaque_pnl.setLayout(empaque_pnlLayout);
        empaque_pnlLayout.setHorizontalGroup(
            empaque_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(empaque_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(empaque_scrll)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(empaque_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(reporte_empaque_btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE)
                    .addComponent(nuevo_em_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(separador_e)
                    .addComponent(nombre_empaque_txt)
                    .addComponent(unidades_empaque_txt)
                    .addComponent(precio_unidad_empaque_txt)
                    .addComponent(agregar_tela_btn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(unidad_medida_e_txt)
                    .addGroup(empaque_pnlLayout.createSequentialGroup()
                        .addGroup(empaque_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombre_empaque_lbl)
                            .addComponent(unidades_empaque_lbl)
                            .addComponent(precio_unidad_empaque_lbl)
                            .addComponent(unidad_medida_e_lbl))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        empaque_pnlLayout.setVerticalGroup(
            empaque_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(empaque_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(empaque_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(empaque_pnlLayout.createSequentialGroup()
                        .addComponent(reporte_empaque_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(nuevo_em_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(separador_e, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nombre_empaque_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nombre_empaque_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(unidades_empaque_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(unidades_empaque_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(precio_unidad_empaque_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(precio_unidad_empaque_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(unidad_medida_e_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(unidad_medida_e_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(agregar_tela_btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(empaque_scrll, javax.swing.GroupLayout.DEFAULT_SIZE, 727, Short.MAX_VALUE))
                .addContainerGap())
        );

        tipos_tbd_pnl.addTab("Empaque", empaque_pnl);

        jScrollPane1.setViewportView(tipos_tbd_pnl);

        javax.swing.GroupLayout azul_pnlLayout = new javax.swing.GroupLayout(azul_pnl);
        azul_pnl.setLayout(azul_pnlLayout);
        azul_pnlLayout.setHorizontalGroup(
            azul_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(azul_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 990, Short.MAX_VALUE)
                .addContainerGap())
        );
        azul_pnlLayout.setVerticalGroup(
            azul_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(azul_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
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

    public void cargar_g() {
        //CARGAR INVENTARIO GENERRAL
        refrescarg();
        general.addColumn("Código");
        general.addColumn("Nombre");
        general.addColumn("Tipo de inventario");
        general.addColumn("Cantidad");
        general.addColumn("Precio unitario");
        general.addColumn("Precio total");
        general.addColumn("Unidad de medida");

        this.general_tbl.setModel(general);
        String consultageneral = "SELECT * FROM inventario";

        String[] datosg = new String[7];
        try {
            Statement st = cnn.createStatement();
            ResultSet rs = st.executeQuery(consultageneral);
            while (rs.next()) {
                datosg[0] = rs.getString(1);
                datosg[1] = rs.getString(2);
                datosg[2] = rs.getString(3);
                datosg[3] = rs.getString(4);
                datosg[4] = rs.getString(5);
                datosg[5] = rs.getString(6);
                datosg[6] = rs.getString(7);

                general.addRow(datosg);

            }

            general_tbl.setModel(general);
        } catch (SQLException ex) {
            Logger.getLogger(log_form.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "error " + ex);
        }

    }

    public void cargar_t() {
        //CARGAR TELA
        refrescart();
        tela.addColumn("Código");
        tela.addColumn("Nombre");
        tela.addColumn("Tipo de inventario");
        tela.addColumn("Ccantidad");
        tela.addColumn("Precio unitario");
        tela.addColumn("Precio total");
        tela.addColumn("Unidad de medida");

        this.tela_tbl.setModel(tela);
        String consultatela = "SELECT * FROM inventario WHERE tipo = 'Tela';";

        String[] datost = new String[7];
        try {
            Statement st = cnn.createStatement();
            ResultSet rs = st.executeQuery(consultatela);
            while (rs.next()) {
                datost[0] = rs.getString(1);
                datost[1] = rs.getString(2);
                datost[2] = rs.getString(3);
                datost[3] = rs.getString(4);
                datost[4] = rs.getString(5);
                datost[5] = rs.getString(6);
                datost[6] = rs.getString(7);

                tela.addRow(datost);

            }

            tela_tbl.setModel(tela);
        } catch (SQLException ex) {
            Logger.getLogger(log_form.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "error " + ex);
        }
    }

    public void cargar_c() {
        //CARGAR COMBUSTIBLE
        refrescarc();
        combustible.addColumn("Código");
        combustible.addColumn("Nombre");
        combustible.addColumn("Tipo de inventario");
        combustible.addColumn("Ccantidad");
        combustible.addColumn("Precio unitario");
        combustible.addColumn("Precio total");
        combustible.addColumn("Unidad de medida");

        this.combustible_tbl.setModel(combustible);
        String consultacombustible = "SELECT * FROM inventario WHERE tipo = 'Combustible';";

        String[] datost = new String[7];
        try {
            Statement st = cnn.createStatement();
            ResultSet rs = st.executeQuery(consultacombustible);
            while (rs.next()) {
                datost[0] = rs.getString(1);
                datost[1] = rs.getString(2);
                datost[2] = rs.getString(3);
                datost[3] = rs.getString(4);
                datost[4] = rs.getString(5);
                datost[5] = rs.getString(6);
                datost[6] = rs.getString(7);

                combustible.addRow(datost);

            }

            combustible_tbl.setModel(combustible);
        } catch (SQLException ex) {
            Logger.getLogger(log_form.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "error " + ex);
        }
    }

    public void cargar_r() {
        //CARGAR REPUESTOS
        refrescarr();
        repuestos.addColumn("Código");
        repuestos.addColumn("Nombre");
        repuestos.addColumn("Tipo de inventario");
        repuestos.addColumn("Ccantidad");
        repuestos.addColumn("Precio unitario");
        repuestos.addColumn("Precio total");
        repuestos.addColumn("Unidad de medida");

        this.repuestos_tbl.setModel(repuestos);
        String consultarepuestos = "SELECT * FROM inventario WHERE tipo = 'Repuestos';";

        String[] datost = new String[7];
        try {
            Statement st = cnn.createStatement();
            ResultSet rs = st.executeQuery(consultarepuestos);
            while (rs.next()) {
                datost[0] = rs.getString(1);
                datost[1] = rs.getString(2);
                datost[2] = rs.getString(3);
                datost[3] = rs.getString(4);
                datost[4] = rs.getString(5);
                datost[5] = rs.getString(6);
                datost[6] = rs.getString(7);

                repuestos.addRow(datost);

            }

            repuestos_tbl.setModel(repuestos);
        } catch (SQLException ex) {
            Logger.getLogger(log_form.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "error " + ex);
        }
    }

    public void cargar_q() {
        //CARGAR QUIMICOS
        refrescarq();
        quimicos.addColumn("Código");
        quimicos.addColumn("Nombre");
        quimicos.addColumn("Tipo de inventario");
        quimicos.addColumn("Ccantidad");
        quimicos.addColumn("Precio unitario");
        quimicos.addColumn("Precio total");
        quimicos.addColumn("Unidad de medida");

        this.quimicos_tbl.setModel(quimicos);
        String consultaquimicos = "SELECT * FROM inventario WHERE tipo = 'Químicos';";

        String[] datost = new String[7];
        try {
            Statement st = cnn.createStatement();
            ResultSet rs = st.executeQuery(consultaquimicos);
            while (rs.next()) {
                datost[0] = rs.getString(1);
                datost[1] = rs.getString(2);
                datost[2] = rs.getString(3);
                datost[3] = rs.getString(4);
                datost[4] = rs.getString(5);
                datost[5] = rs.getString(6);
                datost[6] = rs.getString(7);

                quimicos.addRow(datost);

            }

            quimicos_tbl.setModel(quimicos);
        } catch (SQLException ex) {
            Logger.getLogger(log_form.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "error " + ex);
        }
    }

    public void cargar_ga() {
        //CARGAR GASTABLES
        refrescarga();
        gastables.addColumn("Código");
        gastables.addColumn("Nombre");
        gastables.addColumn("Tipo de inventario");
        gastables.addColumn("Ccantidad");
        gastables.addColumn("Precio unitario");
        gastables.addColumn("Precio total");
        gastables.addColumn("Unidad de medida");

        this.gastable_tbl.setModel(gastables);
        String consultagastables = "SELECT * FROM inventario WHERE tipo = 'Materiales  gastables';";

        String[] datost = new String[7];
        try {
            Statement st = cnn.createStatement();
            ResultSet rs = st.executeQuery(consultagastables);
            while (rs.next()) {
                datost[0] = rs.getString(1);
                datost[1] = rs.getString(2);
                datost[2] = rs.getString(3);
                datost[3] = rs.getString(4);
                datost[4] = rs.getString(5);
                datost[5] = rs.getString(6);
                datost[6] = rs.getString(7);

                gastables.addRow(datost);

            }

            gastable_tbl.setModel(gastables);
        } catch (SQLException ex) {
            Logger.getLogger(log_form.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "error " + ex);
        }
    }

    public void cargar_e() {
        //CARGAR EMPAQUE
        refrescare();
        empaque.addColumn("Código");
        empaque.addColumn("Nombre");
        empaque.addColumn("Tipo de inventario");
        empaque.addColumn("Ccantidad");
        empaque.addColumn("Precio unitario");
        empaque.addColumn("Precio total");
        empaque.addColumn("Unidad de medida");

        this.empaque_tbl.setModel(empaque);
        String consultaempaque = "SELECT * FROM inventario WHERE tipo = 'Empaque';";

        String[] datost = new String[7];
        try {
            Statement st = cnn.createStatement();
            ResultSet rs = st.executeQuery(consultaempaque);
            while (rs.next()) {
                datost[0] = rs.getString(1);
                datost[1] = rs.getString(2);
                datost[2] = rs.getString(3);
                datost[3] = rs.getString(4);
                datost[4] = rs.getString(5);
                datost[5] = rs.getString(6);
                datost[6] = rs.getString(7);

                empaque.addRow(datost);

            }

            empaque_tbl.setModel(empaque);
        } catch (SQLException ex) {
            Logger.getLogger(log_form.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "error " + ex);
        }
    }


    private void reporte_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reporte_btnActionPerformed
        //REPORTE DEL INVENTARIO GENERAL
        Connection cn = conexion.conectar();

        try {
            JasperReport jr = (JasperReport) JRLoader.loadObject(inventario_tb.class.getResource("/reportes/inventario_general.jasper"));
            Map parametros = new HashMap<>();
            parametros.put("Titulo", "Reporte inventario");

            JasperPrint jp = JasperFillManager.fillReport(jr, parametros, cn);
            JasperViewer jv = new JasperViewer(jp, false);
            jv.setVisible(true);
        } catch (JRException ex) {
            JOptionPane.showMessageDialog(rootPane, ex);
        }
    }//GEN-LAST:event_reporte_btnActionPerformed

    private void reporte_tela_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reporte_tela_btnActionPerformed
        //REPORTE DEL INVENTARIO DE TELA
        Connection cn = conexion.conectar();

        try {
            String tipo_inv = "Tela";
            JasperReport jr = (JasperReport) JRLoader.loadObject(inventario_tb.class.getResource("/reportes/inventario.jasper"));
            Map parametro = new HashMap<>();
            parametro.put("tipo", tipo_inv);
            JasperPrint jp = JasperFillManager.fillReport(jr, parametro, cn);
            JasperViewer jv = new JasperViewer(jp, false);
            jv.setVisible(true);
        } catch (JRException ex) {
            JOptionPane.showMessageDialog(rootPane, ex);
        }
    }//GEN-LAST:event_reporte_tela_btnActionPerformed

    private void agregar_tela_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregar_tela_btnActionPerformed
        //AGREGAR NUEVA TELA
        String nombret = nombre_tela_txt.getText();
        String yardast = yardas_txt.getText();
        String precioy = precio_yarda_txt.getText();
        Double pretotal = Double.parseDouble(precioy);
        Double preyar = Double.parseDouble(yardast);
        Double total = pretotal * preyar;
        String tipo = "Tela";

        String insertartela = "INSERT INTO inventario (materia, tipo, Cantidad_materia, precio_unidad, precio_total, unidad_medida) VALUES ('" + nombret + "', 'Tela', '" + yardast + "', '" + precioy + "', " + total + ", 'Yarda');";

        try {
            PreparedStatement prst = cnn.prepareStatement(insertartela);

            prst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Exitoso");
            cargar_t();
            cargar_g();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "error " + ex);
        }
    }//GEN-LAST:event_agregar_tela_btnActionPerformed

    private void reporte_combustible_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reporte_combustible_btnActionPerformed
        //REPORTE DEL INVENTARIO DE COMBUSTIBLE

        Connection cn = conexion.conectar();

        try {
            String tipo_inv = "Combustible";
            JasperReport jr = (JasperReport) JRLoader.loadObject(inventario_tb.class.getResource("/reportes/inventario.jasper"));
            Map parametro = new HashMap<>();
            parametro.put("tipo", tipo_inv);
            JasperPrint jp = JasperFillManager.fillReport(jr, parametro, cn);
            JasperViewer jv = new JasperViewer(jp, false);
            jv.setVisible(true);
        } catch (JRException ex) {
            JOptionPane.showMessageDialog(rootPane, ex);
        }
    }//GEN-LAST:event_reporte_combustible_btnActionPerformed

    private void agregar_combustible_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregar_combustible_btnActionPerformed
        //AGREGAR COMBBUSTIBLE

        String nombrec = nombre_combustible_txt.getText();
        String galones = galones_txt.getText();
        String preciog = precio_galon_txt.getText();
        String med = unidad_med_txt.getText();
        Double pretotal = Double.parseDouble(preciog);
        Double pregal = Double.parseDouble(galones);
        Double total = pretotal * pregal;

        String insertartela = "INSERT INTO inventario (materia, tipo, Cantidad_materia, precio_unidad, precio_total, unidad_medida) VALUES('" + nombrec + "', 'Combustible', '" + galones + "', '" + preciog + "', " + total + ", '" + med + "');";

        try {
            PreparedStatement prst = cnn.prepareStatement(insertartela);

            prst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Exitoso");
            cargar_c();
            cargar_g();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error " + ex);
        }

    }//GEN-LAST:event_agregar_combustible_btnActionPerformed

    private void reporte_repuestos_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reporte_repuestos_btnActionPerformed
        //REPORTE DEL INVENTARIO DE REPUESTOS
        Connection cn = conexion.conectar();

        try {
            String tipo_inv = "Repuestos";
            JasperReport jr = (JasperReport) JRLoader.loadObject(inventario_tb.class.getResource("/reportes/inventario.jasper"));
            Map parametro = new HashMap<>();
            parametro.put("tipo", tipo_inv);
            JasperPrint jp = JasperFillManager.fillReport(jr, parametro, cn);
            JasperViewer jv = new JasperViewer(jp, false);
            jv.setVisible(true);
        } catch (JRException ex) {
            JOptionPane.showMessageDialog(rootPane, ex);
        }
    }//GEN-LAST:event_reporte_repuestos_btnActionPerformed

    private void agregar_repuesto_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregar_repuesto_btnActionPerformed
        //AGREGAR NUEVO REPUESTO

        String nombrer = nombre_repuesto_txt.getText();
        String unidades = unidad_txt.getText();
        String preciou = precio_unidad_txt.getText();
        Double pretotal = Double.parseDouble(unidades);
        Double prerep = Double.parseDouble(preciou);
        Double total = pretotal * prerep;

        String insertarrepuesto = "INSERT INTO inventario (materia, tipo, Cantidad_materia, precio_unidad, precio_total, unidad_medida) VALUES ('" + nombrer + "', 'Repuestos', '" + unidades + "', '" + preciou + "', " + total + ", 'Unidad');";

        try {
            PreparedStatement prst = cnn.prepareStatement(insertarrepuesto);

            prst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Exitoso");
            cargar_r();
            cargar_g();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "error " + ex);
        }
    }//GEN-LAST:event_agregar_repuesto_btnActionPerformed

    private void reporte_quimicos_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reporte_quimicos_btnActionPerformed
        //REPORTE DE INVENTARIO DE QUIMICOS
        Connection cn = conexion.conectar();

        try {
            String tipo_inv = "Químicos";
            JasperReport jr = (JasperReport) JRLoader.loadObject(inventario_tb.class.getResource("/reportes/inventario.jasper"));
            Map parametro = new HashMap<>();
            parametro.put("tipo", tipo_inv);
            JasperPrint jp = JasperFillManager.fillReport(jr, parametro, cn);
            JasperViewer jv = new JasperViewer(jp, false);
            jv.setVisible(true);
        } catch (JRException ex) {
            JOptionPane.showMessageDialog(rootPane, ex);
        }
    }//GEN-LAST:event_reporte_quimicos_btnActionPerformed

    private void agregar_quimico_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregar_quimico_btnActionPerformed
        //AGREGAR NUEVO QUIMICO
        String nombreq = nombre_quimico_txt.getText();
        String cantidad = cantidad_txt.getText();
        String um = unidad_medida_txt.getText();
        String precioc = precio_cantidad_txt.getText();
        Double pretotal = Double.parseDouble(precioc);
        Double prequi = Double.parseDouble(cantidad);
        Double total = pretotal * prequi;

        String insertarquimico = "INSERT INTO inventario (materia, tipo, Cantidad_materia, precio_unidad, precio_total, unidad_medida) VALUES ('" + nombreq + "', 'Químicos', '" + cantidad + "', '" + precioc + "', " + total + ", '" + um + "');";

        try {
            PreparedStatement prst = cnn.prepareStatement(insertarquimico);

            prst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Exitoso");
            cargar_q();
            cargar_g();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "error " + ex);
        }
    }//GEN-LAST:event_agregar_quimico_btnActionPerformed

    private void reporte_gastables_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reporte_gastables_btnActionPerformed
        //REPORTE DE MATERIALES GASTABLES
        Connection cn = conexion.conectar();

        try {
            String tipo_inv = "Materiales  gastables";
            JasperReport jr = (JasperReport) JRLoader.loadObject(inventario_tb.class.getResource("/reportes/inventario.jasper"));
            Map parametro = new HashMap<>();
            parametro.put("tipo", tipo_inv);
            JasperPrint jp = JasperFillManager.fillReport(jr, parametro, cn);
            JasperViewer jv = new JasperViewer(jp, false);
            jv.setVisible(true);
        } catch (JRException ex) {
            JOptionPane.showMessageDialog(rootPane, ex);
        }
    }//GEN-LAST:event_reporte_gastables_btnActionPerformed

    private void agregar_gastable_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregar_gastable_btnActionPerformed
        //AGREGAR MATERIALES GASTABLES
        String nombreg = nombre_g_txt.getText();
        String cantidadg = unidades_g_txt.getText();
        String preciog = precio_unidad_g_txt.getText();
        Double pretotal = Double.parseDouble(preciog);
        Double precant = Double.parseDouble(cantidadg);
        Double total = pretotal * precant;

        String insertargastable = "INSERT INTO inventario (materia, tipo, Cantidad_materia, precio_unidad, precio_total, unidad_medida) VALUES ('" + nombreg + "', 'Materiales  gastables', '" + cantidadg + "', '" + preciog + "', " + total + ", 'Unidad');";

        try {
            PreparedStatement prst = cnn.prepareStatement(insertargastable);

            prst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Exitoso");
            cargar_ga();
            cargar_g();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "error " + ex);
        }
    }//GEN-LAST:event_agregar_gastable_btnActionPerformed

    private void reporte_empaque_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reporte_empaque_btnActionPerformed
        //REPORTE DE EMPAQUE
        Connection cn = conexion.conectar();

        try {
            String tipo_inv = "Empaque";
            JasperReport jr = (JasperReport) JRLoader.loadObject(inventario_tb.class.getResource("/reportes/inventario.jasper"));
            Map parametro = new HashMap<>();
            parametro.put("tipo", tipo_inv);
            JasperPrint jp = JasperFillManager.fillReport(jr, parametro, cn);
            JasperViewer jv = new JasperViewer(jp, false);
            jv.setVisible(true);
        } catch (JRException ex) {
            JOptionPane.showMessageDialog(rootPane, ex);
        }
    }//GEN-LAST:event_reporte_empaque_btnActionPerformed

    private void agregar_tela_btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregar_tela_btn1ActionPerformed
        //AGREGAR MATERIAL DE EMPAQUE
        String nombree = nombre_empaque_txt.getText();
        String cantidade = unidades_empaque_txt.getText();
        String ume = unidad_medida_e_txt.getText();
        String precioe = precio_unidad_empaque_txt.getText();
        Double pretotal = Double.parseDouble(precioe);
        Double precu = Double.parseDouble(cantidade);
        Double total = pretotal * precu;

        String insertargastable = "INSERT INTO inventario (materia, tipo, Cantidad_materia, precio_unidad, precio_total, unidad_medida) VALUES ('" + nombree + "', 'Empaque', '" + cantidade + "', '" + precioe + "', " + total + ", '" + ume + "');";

        try {
            PreparedStatement prst = cnn.prepareStatement(insertargastable);

            prst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Exitoso");
            cargar_e();
            cargar_g();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "error " + ex);
        }
    }//GEN-LAST:event_agregar_tela_btn1ActionPerformed

    private void guardar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardar_btnActionPerformed
        //GUARDAR CAMBIOS DEL INVENTARIO
        String codigo = cod_txt.getText();
        String nombre = nom_txt.getText();
        String cantidad = can_txt.getText();
        String precio = pre_txt.getText();
        String umed = umed_txt.getText();
        String tipo = tipo_inv_box.getSelectedItem().toString();
        Double cantd = Double.parseDouble(cantidad);
        Double prec = Double.parseDouble(precio);
        Double total = cantd * prec;

        String query = "UPDATE `inventario` SET materia = '" + nombre + "',Cantidad_materia ='" + cantidad + "',precio_unidad ='" + precio + "', unidad_medida = '" + umed + "', precio_total = " + total + ", tipo = '" + tipo + "'  WHERE codigo_materia = '" + codigo + "'";
        try {
            PreparedStatement prst = cnn.prepareStatement(query);

            prst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Editado");
            refrescarg();
            cargar_g();
            cargar_t();
            cargar_c();
            cargar_r();
            cargar_q();
            cargar_ga();
            cargar_e();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "error " + ex);
        }


    }//GEN-LAST:event_guardar_btnActionPerformed

    private void general_tblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_general_tblMouseClicked
        //LLENAR LOS TEXTFIELDS
        try {
            String cod = (String) general.getValueAt(general_tbl.getSelectedRow(), 0);
            String nom = (String) general.getValueAt(general_tbl.getSelectedRow(), 1);
            String tip = (String) general.getValueAt(general_tbl.getSelectedRow(), 2);
            String cant = (String) general.getValueAt(general_tbl.getSelectedRow(), 3);
            String pre = (String) general.getValueAt(general_tbl.getSelectedRow(), 4);
            String unidad = (String) general.getValueAt(general_tbl.getSelectedRow(), 6);
            cod_txt.setText(cod);
            nom_txt.setText(nom);
            can_txt.setText(cant);
            pre_txt.setText(pre);
            umed_txt.setText(unidad);
            tipo_inv_box.setSelectedItem(tip);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "error " + ex);
        }
    }//GEN-LAST:event_general_tblMouseClicked

    private void cerrar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrar_btnActionPerformed
        //CERRAR SESION
        log_form frame = new log_form();
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cerrar_btnActionPerformed

    private void borrar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrar_btnActionPerformed
        //borrar materia
        String codigo = cod_txt.getText();

        String query = "DELETE FROM inventario WHERE inventario.codigo_materia = " + codigo;

        try {
            PreparedStatement prst = cnn.prepareStatement(query);

            prst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Borrado");
            refrescarg();
            cargar_g();
            cargar_t();
            cargar_c();
            cargar_r();
            cargar_q();
            cargar_ga();
            cargar_e();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "error " + ex);
        }
    }//GEN-LAST:event_borrar_btnActionPerformed

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
            java.util.logging.Logger.getLogger(inventario_tb.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inventario_tb.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inventario_tb.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inventario_tb.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inventario_tb().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregar_combustible_btn;
    private javax.swing.JButton agregar_gastable_btn;
    private javax.swing.JButton agregar_quimico_btn;
    private javax.swing.JButton agregar_repuesto_btn;
    private javax.swing.JButton agregar_tela_btn;
    private javax.swing.JButton agregar_tela_btn1;
    private javax.swing.JPanel azul_pnl;
    private javax.swing.JButton borrar_btn;
    private javax.swing.JTextField can_txt;
    private javax.swing.JLabel cantidad_lbl;
    private javax.swing.JLabel cantidad_materia_lbl;
    private javax.swing.JTextField cantidad_txt;
    private javax.swing.JButton cerrar_btn;
    private javax.swing.JTextField cod_txt;
    private javax.swing.JLabel codigo_materia_lbl;
    private javax.swing.JPanel combustible_pnl;
    private javax.swing.JScrollPane combustible_scrll;
    private javax.swing.JTable combustible_tbl;
    private javax.swing.JLabel edit_inv_lbl;
    private javax.swing.JPanel empaque_pnl;
    private javax.swing.JScrollPane empaque_scrll;
    private javax.swing.JTable empaque_tbl;
    private javax.swing.JLabel galones_lbl;
    private javax.swing.JTextField galones_txt;
    private javax.swing.JScrollPane gastable_scrll;
    private javax.swing.JTable gastable_tbl;
    private javax.swing.JPanel gastables_pnl;
    private javax.swing.JPanel general_pnl;
    private javax.swing.JScrollPane general_scrll;
    private javax.swing.JTable general_tbl;
    public javax.swing.JButton guardar_btn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nom_txt;
    private javax.swing.JLabel nombre_combustible_lbl;
    private javax.swing.JTextField nombre_combustible_txt;
    private javax.swing.JLabel nombre_empaque_lbl;
    private javax.swing.JTextField nombre_empaque_txt;
    private javax.swing.JLabel nombre_g_lbl;
    private javax.swing.JTextField nombre_g_txt;
    private javax.swing.JLabel nombre_materia_lbl;
    private javax.swing.JLabel nombre_quimico_lbl;
    private javax.swing.JTextField nombre_quimico_txt;
    private javax.swing.JLabel nombre_repuesto_lbl;
    private javax.swing.JTextField nombre_repuesto_txt;
    private javax.swing.JLabel nombre_tela_lbl;
    private javax.swing.JTextField nombre_tela_txt;
    private javax.swing.JLabel nueva_tela_lbl;
    private javax.swing.JLabel nueva_tela_lbl4;
    private javax.swing.JLabel nuevo_combustible_lbl;
    private javax.swing.JLabel nuevo_em_lbl;
    private javax.swing.JLabel nuevo_gastable_lbl;
    private javax.swing.JLabel nuevo_rep_lbl;
    private javax.swing.JTextField pre_txt;
    private javax.swing.JLabel precio_cantidad_lbl;
    private javax.swing.JTextField precio_cantidad_txt;
    private javax.swing.JLabel precio_galon_lbl;
    private javax.swing.JTextField precio_galon_txt;
    private javax.swing.JLabel precio_materia_lbl;
    private javax.swing.JLabel precio_unidad_empaque_lbl;
    private javax.swing.JTextField precio_unidad_empaque_txt;
    private javax.swing.JLabel precio_unidad_g_lbl;
    private javax.swing.JTextField precio_unidad_g_txt;
    private javax.swing.JLabel precio_unidad_lbl;
    private javax.swing.JTextField precio_unidad_txt;
    private javax.swing.JLabel precio_yarda_lbl;
    private javax.swing.JTextField precio_yarda_txt;
    private javax.swing.JPanel quimicos_pnl;
    private javax.swing.JScrollPane quimicos_scrll;
    private javax.swing.JTable quimicos_tbl;
    private javax.swing.JButton reporte_btn;
    private javax.swing.JButton reporte_combustible_btn;
    private javax.swing.JButton reporte_empaque_btn;
    private javax.swing.JButton reporte_gastables_btn;
    private javax.swing.JButton reporte_quimicos_btn;
    private javax.swing.JButton reporte_repuestos_btn;
    private javax.swing.JButton reporte_tela_btn;
    private javax.swing.JPanel repuestos_pnl;
    private javax.swing.JScrollPane repuestos_scrll;
    private javax.swing.JTable repuestos_tbl;
    private javax.swing.JSeparator separador;
    private javax.swing.JSeparator separador_c;
    private javax.swing.JSeparator separador_e;
    private javax.swing.JSeparator separador_g_txt;
    private javax.swing.JSeparator separador_inv;
    private javax.swing.JSeparator separador_quimico;
    private javax.swing.JSeparator separador_r;
    private javax.swing.JPanel tela_pnl;
    private javax.swing.JScrollPane tela_scrll;
    private javax.swing.JTable tela_tbl;
    private javax.swing.JComboBox<String> tipo_inv_box;
    private javax.swing.JLabel tipo_inv_lbl;
    private javax.swing.JTabbedPane tipos_tbd_pnl;
    private javax.swing.JLabel umed_lbl;
    private javax.swing.JTextField umed_txt;
    private javax.swing.JLabel unidad_med_lbl;
    private javax.swing.JTextField unidad_med_txt;
    private javax.swing.JLabel unidad_medida_e_lbl;
    private javax.swing.JTextField unidad_medida_e_txt;
    private javax.swing.JLabel unidad_medida_lbl;
    private javax.swing.JTextField unidad_medida_txt;
    private javax.swing.JTextField unidad_txt;
    private javax.swing.JLabel unidades_empaque_lbl;
    private javax.swing.JTextField unidades_empaque_txt;
    private javax.swing.JLabel unidades_g_lbl;
    private javax.swing.JTextField unidades_g_txt;
    private javax.swing.JLabel unidades_lbl;
    private javax.swing.JLabel yardas_lbl;
    private javax.swing.JTextField yardas_txt;
    // End of variables declaration//GEN-END:variables
}
