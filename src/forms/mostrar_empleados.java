package forms;

import java.awt.event.KeyEvent;
import java.sql.*;
import javax.swing.*;
import java.util.*;
import java.util.logging.*;

import javax.swing.table.DefaultTableModel;

public class mostrar_empleados extends javax.swing.JFrame {

    conexion sin = new conexion();
    Connection son = sin.conectar();
    DefaultTableModel ola;

    //METODO PARA MOSTRAR LOS DATOS EN LA TABLA
    public mostrar_empleados() {
        initComponents();
        this.setExtendedState(mostrar_empleados.MAXIMIZED_BOTH);
        this.ola = (DefaultTableModel) tabla_tbl.getModel();
        empleado("");
    }

    //METODOPARA REFRESCAR LA TABLA
    public void refrescar() {
        try {
            ola.setColumnCount(0);
            ola.setRowCount(0);
            tabla_tbl.revalidate();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error " + ex);
        }
    }

    //BUSQUEDA DE EMPLEADOS
    public void empleado(String valor) {

        valor = cargo_txt.getText();
        refrescar();
        ola.addColumn("Id");
        ola.addColumn("Cédula");
        ola.addColumn("Nombre");
        ola.addColumn("Apellido");
        ola.addColumn("Sexo");
        ola.addColumn("Cargo");
        ola.addColumn("Salario");
        ola.addColumn("Modificaciones de salario");

        this.tabla_tbl.setModel(ola);
        String query;
        if (valor.equals("")) {
            query = "SELECT * FROM reporte_empleado";
        } else {
            query = "SELECT * FROM reporte_empleado WHERE cargo LIKE '" + valor + "%'";

        }

        String[] datos = new String[8];
        try {
            Statement st = son.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                datos[5] = rs.getString(6);
                datos[6] = rs.getString(7);
                datos[7] = rs.getString(8);

                ola.addRow(datos);
            }

            tabla_tbl.setModel(ola);
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
        titulo_lbl = new javax.swing.JLabel();
        scroll_de_tabla = new javax.swing.JScrollPane();
        tabla_tbl = new javax.swing.JTable();
        codigo_lbl = new javax.swing.JLabel();
        buscar_btn = new javax.swing.JButton();
        grupo_m_lbl = new javax.swing.JLabel();
        salir_lbl_btn = new javax.swing.JLabel();
        cargo_txt = new javax.swing.JTextField();
        mostrar_cargos_lbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconImage(new ImageIcon(getClass().getResource("/imgs/logo.png")).getImage());
        setLocationByPlatform(true);

        azul_pnl.setBackground(new java.awt.Color(8, 41, 138));

        blanco_pnl.setBackground(new java.awt.Color(255, 255, 255));

        titulo_lbl.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        titulo_lbl.setForeground(new java.awt.Color(0, 0, 102));
        titulo_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo_lbl.setText("Datos de empleados");

        tabla_tbl.setBackground(new java.awt.Color(255, 255, 255));
        tabla_tbl.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        tabla_tbl.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        tabla_tbl.setForeground(new java.awt.Color(0, 0, 0));
        tabla_tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        scroll_de_tabla.setViewportView(tabla_tbl);

        codigo_lbl.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        codigo_lbl.setForeground(new java.awt.Color(0, 0, 102));
        codigo_lbl.setText("Cargo");

        buscar_btn.setBackground(new java.awt.Color(255, 255, 255));
        buscar_btn.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        buscar_btn.setForeground(new java.awt.Color(0, 0, 102));
        buscar_btn.setText("Buscar");
        buscar_btn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 102), 1, true));
        buscar_btn.setOpaque(false);
        buscar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscar_btnActionPerformed(evt);
            }
        });
        buscar_btn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                buscar_btnKeyPressed(evt);
            }
        });

        grupo_m_lbl.setFont(new java.awt.Font("Candara Light", 1, 24)); // NOI18N
        grupo_m_lbl.setForeground(new java.awt.Color(0, 0, 102));
        grupo_m_lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/logo - 24x24.png"))); // NOI18N
        grupo_m_lbl.setText("Grupo M");

        salir_lbl_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_undo_24px.png"))); // NOI18N
        salir_lbl_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salir_lbl_btnMouseClicked(evt);
            }
        });

        cargo_txt.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        cargo_txt.setForeground(new java.awt.Color(0, 0, 0));
        cargo_txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        cargo_txt.setCaretColor(new java.awt.Color(0, 0, 0));
        cargo_txt.setOpaque(false);
        cargo_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cargo_txtKeyPressed(evt);
            }
        });

        mostrar_cargos_lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_expand_arrow_24px_1.png"))); // NOI18N
        mostrar_cargos_lbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        mostrar_cargos_lbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mostrar_cargos_lblMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout blanco_pnlLayout = new javax.swing.GroupLayout(blanco_pnl);
        blanco_pnl.setLayout(blanco_pnlLayout);
        blanco_pnlLayout.setHorizontalGroup(
            blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(blanco_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scroll_de_tabla, javax.swing.GroupLayout.DEFAULT_SIZE, 840, Short.MAX_VALUE)
                    .addGroup(blanco_pnlLayout.createSequentialGroup()
                        .addComponent(cargo_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mostrar_cargos_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buscar_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE))
                    .addGroup(blanco_pnlLayout.createSequentialGroup()
                        .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(codigo_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(blanco_pnlLayout.createSequentialGroup()
                                .addComponent(grupo_m_lbl)
                                .addGap(18, 18, 18)
                                .addComponent(titulo_lbl)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(salir_lbl_btn)))
                .addContainerGap())
        );
        blanco_pnlLayout.setVerticalGroup(
            blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(blanco_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(grupo_m_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(titulo_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(salir_lbl_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29)
                .addComponent(codigo_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(mostrar_cargos_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(buscar_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(cargo_txt))
                .addGap(18, 18, 18)
                .addComponent(scroll_de_tabla, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE)
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

    //EVENTO PARA BUSCAR EMPLEADOS
    private void buscar_btnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscar_btnKeyPressed
        try {
            if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                String B = cargo_txt.getText() + "";
                empleado(B);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "error" + ex);
        }

    }//GEN-LAST:event_buscar_btnKeyPressed

    //BOTON DE BUSCAR
    private void buscar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscar_btnActionPerformed
        empleado("");
    }//GEN-LAST:event_buscar_btnActionPerformed

    //BOTON DE SALIR
    private void salir_lbl_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salir_lbl_btnMouseClicked
        // ATRAS
        recursos_humanos frm = new recursos_humanos();
        frm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_salir_lbl_btnMouseClicked

    private void mostrar_cargos_lblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mostrar_cargos_lblMouseClicked
        //MOSTRAR CARGOS
        cargos frame = new cargos();
        frame.setVisible(true);
    }//GEN-LAST:event_mostrar_cargos_lblMouseClicked

    //BOTON PARA MOSTRAR LOS EMPLEADOS
    private void cargo_txtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cargo_txtKeyPressed
        empleado("");
    }//GEN-LAST:event_cargo_txtKeyPressed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mostrar_empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mostrar_empleados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel azul_pnl;
    private javax.swing.JPanel blanco_pnl;
    private javax.swing.JButton buscar_btn;
    public static javax.swing.JTextField cargo_txt;
    private javax.swing.JLabel codigo_lbl;
    private javax.swing.JLabel grupo_m_lbl;
    private javax.swing.JLabel mostrar_cargos_lbl;
    private javax.swing.JLabel salir_lbl_btn;
    private javax.swing.JScrollPane scroll_de_tabla;
    private javax.swing.JTable tabla_tbl;
    private javax.swing.JLabel titulo_lbl;
    // End of variables declaration//GEN-END:variables
}
