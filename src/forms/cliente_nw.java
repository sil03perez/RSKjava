
package forms;

import javax.swing.ImageIcon;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class cliente_nw extends javax.swing.JFrame {

    conexion cn = new conexion();
    Connection cnn = cn.conectar();
    
    public cliente_nw() {
        initComponents();
         
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        azul_pnl = new javax.swing.JPanel();
        blanco_pnl = new javax.swing.JPanel();
        gm_lbl = new javax.swing.JLabel();
        titulo_lbl = new javax.swing.JLabel();
        rnc_lbl = new javax.swing.JLabel();
        separador = new javax.swing.JSeparator();
        rnc_txt = new javax.swing.JTextField();
        registro_mercantil_lbl = new javax.swing.JLabel();
        registro_mercantil_txt = new javax.swing.JTextField();
        nombre_cliente_lbl = new javax.swing.JLabel();
        nombre_cliente_txt = new javax.swing.JTextField();
        tiempo_mercado_lbl = new javax.swing.JLabel();
        tiempo_en_mercado_txt = new javax.swing.JTextField();
        telefono_lbl = new javax.swing.JLabel();
        ref_bancarias_lbl = new javax.swing.JLabel();
        telefono_cliente_txt = new javax.swing.JTextField();
        referencia_bancaria_txt = new javax.swing.JTextField();
        ref_credito_lbl = new javax.swing.JLabel();
        referencia_credito_txt = new javax.swing.JTextField();
        direccion_cliente_lbl = new javax.swing.JLabel();
        direccion_cliente_txt = new javax.swing.JTextField();
        cedula_lbl = new javax.swing.JLabel();
        cedula_txt = new javax.swing.JTextField();
        nombre_representante_txt = new javax.swing.JTextField();
        apellido_rep_lbl = new javax.swing.JLabel();
        apellido_txt = new javax.swing.JTextField();
        edad_txt = new javax.swing.JTextField();
        direccion_rep_lbl = new javax.swing.JLabel();
        direccion_rep_txt = new javax.swing.JTextField();
        sexo_lbl = new javax.swing.JLabel();
        telefono_rep_txt = new javax.swing.JTextField();
        telefono_rep_lbl = new javax.swing.JLabel();
        estado_civil_lbl = new javax.swing.JLabel();
        edad_rep_lbl = new javax.swing.JLabel();
        nombre_rep_lbl = new javax.swing.JLabel();
        cliente_t_lbl = new javax.swing.JLabel();
        representante_t_lbl = new javax.swing.JLabel();
        guardar_btn = new javax.swing.JButton();
        consultar_btn = new javax.swing.JButton();
        estado_civil_box = new javax.swing.JComboBox<>();
        sexo_box = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconImage(new ImageIcon(getClass().getResource("/imgs/logo.png")).getImage());
        setResizable(false);

        azul_pnl.setBackground(new java.awt.Color(8, 41, 138));

        blanco_pnl.setBackground(new java.awt.Color(255, 255, 255));

        gm_lbl.setFont(new java.awt.Font("Candara Light", 1, 24)); // NOI18N
        gm_lbl.setForeground(new java.awt.Color(0, 0, 102));
        gm_lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/logo - 24x24.png"))); // NOI18N
        gm_lbl.setText("Grupo M");

        titulo_lbl.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        titulo_lbl.setForeground(new java.awt.Color(0, 0, 102));
        titulo_lbl.setText("Registro de clientes");

        rnc_lbl.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        rnc_lbl.setForeground(new java.awt.Color(0, 0, 102));
        rnc_lbl.setText("RNC");

        separador.setOrientation(javax.swing.SwingConstants.VERTICAL);

        rnc_txt.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        rnc_txt.setForeground(new java.awt.Color(0, 0, 0));
        rnc_txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        rnc_txt.setOpaque(false);

        registro_mercantil_lbl.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        registro_mercantil_lbl.setForeground(new java.awt.Color(0, 0, 102));
        registro_mercantil_lbl.setText("Registro mercantil");

        registro_mercantil_txt.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        registro_mercantil_txt.setForeground(new java.awt.Color(0, 0, 0));
        registro_mercantil_txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        registro_mercantil_txt.setOpaque(false);

        nombre_cliente_lbl.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        nombre_cliente_lbl.setForeground(new java.awt.Color(0, 0, 102));
        nombre_cliente_lbl.setText("Nombre");

        nombre_cliente_txt.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        nombre_cliente_txt.setForeground(new java.awt.Color(0, 0, 0));
        nombre_cliente_txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        nombre_cliente_txt.setOpaque(false);

        tiempo_mercado_lbl.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        tiempo_mercado_lbl.setForeground(new java.awt.Color(0, 0, 102));
        tiempo_mercado_lbl.setText("Tiempo en mercado");

        tiempo_en_mercado_txt.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        tiempo_en_mercado_txt.setForeground(new java.awt.Color(0, 0, 0));
        tiempo_en_mercado_txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        tiempo_en_mercado_txt.setOpaque(false);

        telefono_lbl.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        telefono_lbl.setForeground(new java.awt.Color(0, 0, 102));
        telefono_lbl.setText("Teléfono");

        ref_bancarias_lbl.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        ref_bancarias_lbl.setForeground(new java.awt.Color(0, 0, 102));
        ref_bancarias_lbl.setText("Referencias Banc");

        telefono_cliente_txt.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        telefono_cliente_txt.setForeground(new java.awt.Color(0, 0, 0));
        telefono_cliente_txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        telefono_cliente_txt.setOpaque(false);

        referencia_bancaria_txt.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        referencia_bancaria_txt.setForeground(new java.awt.Color(0, 0, 0));
        referencia_bancaria_txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        referencia_bancaria_txt.setOpaque(false);

        ref_credito_lbl.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        ref_credito_lbl.setForeground(new java.awt.Color(0, 0, 102));
        ref_credito_lbl.setText("Referencias Credit");

        referencia_credito_txt.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        referencia_credito_txt.setForeground(new java.awt.Color(0, 0, 0));
        referencia_credito_txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        referencia_credito_txt.setOpaque(false);

        direccion_cliente_lbl.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        direccion_cliente_lbl.setForeground(new java.awt.Color(0, 0, 102));
        direccion_cliente_lbl.setText("Dirección");

        direccion_cliente_txt.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        direccion_cliente_txt.setForeground(new java.awt.Color(0, 0, 0));
        direccion_cliente_txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        direccion_cliente_txt.setOpaque(false);

        cedula_lbl.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        cedula_lbl.setForeground(new java.awt.Color(0, 0, 102));
        cedula_lbl.setText("Cédula");

        cedula_txt.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        cedula_txt.setForeground(new java.awt.Color(0, 0, 0));
        cedula_txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        cedula_txt.setOpaque(false);

        nombre_representante_txt.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        nombre_representante_txt.setForeground(new java.awt.Color(0, 0, 0));
        nombre_representante_txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        nombre_representante_txt.setOpaque(false);

        apellido_rep_lbl.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        apellido_rep_lbl.setForeground(new java.awt.Color(0, 0, 102));
        apellido_rep_lbl.setText("Apellido");

        apellido_txt.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        apellido_txt.setForeground(new java.awt.Color(0, 0, 0));
        apellido_txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        apellido_txt.setOpaque(false);

        edad_txt.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        edad_txt.setForeground(new java.awt.Color(0, 0, 0));
        edad_txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        edad_txt.setOpaque(false);

        direccion_rep_lbl.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        direccion_rep_lbl.setForeground(new java.awt.Color(0, 0, 102));
        direccion_rep_lbl.setText("Dirección");

        direccion_rep_txt.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        direccion_rep_txt.setForeground(new java.awt.Color(0, 0, 0));
        direccion_rep_txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        direccion_rep_txt.setOpaque(false);

        sexo_lbl.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        sexo_lbl.setForeground(new java.awt.Color(0, 0, 102));
        sexo_lbl.setText("Sexo");

        telefono_rep_txt.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        telefono_rep_txt.setForeground(new java.awt.Color(0, 0, 0));
        telefono_rep_txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        telefono_rep_txt.setOpaque(false);

        telefono_rep_lbl.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        telefono_rep_lbl.setForeground(new java.awt.Color(0, 0, 102));
        telefono_rep_lbl.setText("Teléfono");

        estado_civil_lbl.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        estado_civil_lbl.setForeground(new java.awt.Color(0, 0, 102));
        estado_civil_lbl.setText("Estado civil");

        edad_rep_lbl.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        edad_rep_lbl.setForeground(new java.awt.Color(0, 0, 102));
        edad_rep_lbl.setText("Edad");

        nombre_rep_lbl.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        nombre_rep_lbl.setForeground(new java.awt.Color(0, 0, 102));
        nombre_rep_lbl.setText("Nombre");

        cliente_t_lbl.setFont(new java.awt.Font("Californian FB", 1, 18)); // NOI18N
        cliente_t_lbl.setForeground(new java.awt.Color(0, 0, 0));
        cliente_t_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cliente_t_lbl.setText("Cliente");
        cliente_t_lbl.setToolTipText("");

        representante_t_lbl.setFont(new java.awt.Font("Californian FB", 1, 18)); // NOI18N
        representante_t_lbl.setForeground(new java.awt.Color(0, 0, 0));
        representante_t_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        representante_t_lbl.setText("Representante legal");
        representante_t_lbl.setToolTipText("");

        guardar_btn.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        guardar_btn.setForeground(new java.awt.Color(0, 0, 102));
        guardar_btn.setText("Guardar");
        guardar_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        guardar_btn.setContentAreaFilled(false);
        guardar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardar_btnActionPerformed(evt);
            }
        });

        consultar_btn.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        consultar_btn.setForeground(new java.awt.Color(0, 0, 102));
        consultar_btn.setText("Consultar");
        consultar_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        consultar_btn.setContentAreaFilled(false);
        consultar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultar_btnActionPerformed(evt);
            }
        });

        estado_civil_box.setBackground(new java.awt.Color(255, 255, 255));
        estado_civil_box.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        estado_civil_box.setForeground(new java.awt.Color(0, 0, 0));
        estado_civil_box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Casado/a", "Soltero/a", "Unión libre", " " }));
        estado_civil_box.setOpaque(false);

        sexo_box.setBackground(new java.awt.Color(255, 255, 255));
        sexo_box.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        sexo_box.setForeground(new java.awt.Color(0, 0, 0));
        sexo_box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hombre", "Mujer", " " }));

        javax.swing.GroupLayout blanco_pnlLayout = new javax.swing.GroupLayout(blanco_pnl);
        blanco_pnl.setLayout(blanco_pnlLayout);
        blanco_pnlLayout.setHorizontalGroup(
            blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(blanco_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(guardar_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(blanco_pnlLayout.createSequentialGroup()
                        .addComponent(gm_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(titulo_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(blanco_pnlLayout.createSequentialGroup()
                        .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cliente_t_lbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, blanco_pnlLayout.createSequentialGroup()
                                .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rnc_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(registro_mercantil_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(registro_mercantil_txt)
                                    .addComponent(telefono_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(telefono_cliente_txt)
                                    .addComponent(ref_credito_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                                    .addComponent(referencia_credito_txt)
                                    .addComponent(rnc_txt))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(blanco_pnlLayout.createSequentialGroup()
                                        .addComponent(nombre_cliente_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                                        .addGap(20, 20, 20))
                                    .addComponent(nombre_cliente_txt)
                                    .addComponent(tiempo_mercado_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                                    .addComponent(tiempo_en_mercado_txt)
                                    .addComponent(ref_bancarias_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(referencia_bancaria_txt)
                                    .addComponent(direccion_cliente_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(direccion_cliente_txt))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(separador, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(blanco_pnlLayout.createSequentialGroup()
                                .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cedula_txt)
                                    .addComponent(cedula_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(apellido_rep_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(apellido_txt)
                                    .addComponent(direccion_rep_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                                    .addComponent(direccion_rep_txt)
                                    .addComponent(sexo_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(sexo_box, 0, 188, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nombre_representante_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                                    .addComponent(edad_txt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                                    .addComponent(telefono_rep_txt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                                    .addComponent(telefono_rep_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(estado_civil_lbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(edad_rep_lbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(nombre_rep_lbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(estado_civil_box, 0, 189, Short.MAX_VALUE)))
                            .addComponent(representante_t_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(consultar_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        blanco_pnlLayout.setVerticalGroup(
            blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(blanco_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gm_lbl)
                    .addComponent(titulo_lbl))
                .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(blanco_pnlLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(representante_t_lbl)
                            .addComponent(cliente_t_lbl))
                        .addGap(20, 20, 20)
                        .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(blanco_pnlLayout.createSequentialGroup()
                                .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(rnc_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nombre_cliente_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(rnc_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nombre_cliente_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(registro_mercantil_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tiempo_mercado_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(registro_mercantil_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tiempo_en_mercado_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(telefono_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ref_bancarias_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(telefono_cliente_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(referencia_bancaria_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ref_credito_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(direccion_cliente_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(referencia_credito_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(direccion_cliente_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(blanco_pnlLayout.createSequentialGroup()
                                .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cedula_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nombre_rep_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cedula_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nombre_representante_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(apellido_rep_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(edad_rep_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(apellido_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(edad_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(direccion_rep_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(estado_civil_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(direccion_rep_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                                    .addComponent(estado_civil_box, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(sexo_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(telefono_rep_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(telefono_rep_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sexo_box, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, blanco_pnlLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(separador, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(guardar_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(consultar_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void consultar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultar_btnActionPerformed
      //VER LOS CLIENTES
      datos_clientes f = new datos_clientes();
      f.setVisible(true);
      this.dispose();
    }//GEN-LAST:event_consultar_btnActionPerformed

    private void guardar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardar_btnActionPerformed
        //GUARDAR DATOS
        
        //VARIABLES A UTILIZAR
        
        //CLIENTE-
        String rnc = rnc_txt.getText();
        String rm = registro_mercantil_txt.getText();
        String nc = nombre_cliente_txt.getText();
        String tm = tiempo_en_mercado_txt.getText();
        String tc = telefono_cliente_txt.getText();
        String rb = referencia_bancaria_txt.getText();
        String rc = referencia_credito_txt.getText();
        String dc = direccion_cliente_txt.getText();
        
        //REPRESENTANTE LEGAL-
        
        String cdl = cedula_txt.getText();
        String nmb = nombre_representante_txt.getText();
        String apl = apellido_txt.getText();
        String edd = edad_txt.getText();
        String drp = direccion_rep_txt.getText();
        String est = estado_civil_box.getSelectedItem().toString();
        String tlr = telefono_rep_txt.getText();
        String sx = sexo_box.getSelectedItem().toString();
        
        //FIN DECLARACIÓN
        
        String query1 = "INSERT INTO `cliente` (`rnc_cliente`, `Id_cliente`, `registro_mercantil`, `nombre`, `tiempo_en_mercado`, `telefono`, `ref_bancarias`, `ref_credito`, `direccion`, `codigo_seguridad`, `cedula_representante`) VALUES ('"+rnc+"', NULL, '"+rm+"', '"+nc+"', '"+tm+"', '"+tc+"', '"+rb+"', '"+rc+"', '"+dc+"', 'NULL', '"+cdl+"');";
        String query2 = "INSERT INTO `representante_legal_cliente` (`cedula`, `nombre`, `apellido`, `edad`, `direccion`, `estado_civil`, `telefono`, `sexo`) VALUES ('"+cdl+"', '"+nmb+"', '"+apl+"', '"+edd+"', '"+drp+"', '"+est+"', '"+tlr+"', '"+sx+"');";
        
        PreparedStatement psq1;
        PreparedStatement psq2;
        
        try{
            
              psq1 = cnn.prepareStatement(query1);
              psq2 = cnn.prepareStatement(query2);
              
               psq2.executeUpdate();
               psq1.executeUpdate();
               
                JOptionPane.showMessageDialog(null, "Agregado");
            
        }
        catch(Exception ex){
            Logger.getLogger(start.class.getName()).log(Level.SEVERE, null, ex);
              JOptionPane.showMessageDialog(null, "Error "+ ex);
        }
    }//GEN-LAST:event_guardar_btnActionPerformed

    
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
            java.util.logging.Logger.getLogger(cliente_nw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cliente_nw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cliente_nw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cliente_nw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cliente_nw().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel apellido_rep_lbl;
    private javax.swing.JTextField apellido_txt;
    private javax.swing.JPanel azul_pnl;
    private javax.swing.JPanel blanco_pnl;
    private javax.swing.JLabel cedula_lbl;
    private javax.swing.JTextField cedula_txt;
    private javax.swing.JLabel cliente_t_lbl;
    private javax.swing.JButton consultar_btn;
    private javax.swing.JLabel direccion_cliente_lbl;
    private javax.swing.JTextField direccion_cliente_txt;
    private javax.swing.JLabel direccion_rep_lbl;
    private javax.swing.JTextField direccion_rep_txt;
    private javax.swing.JLabel edad_rep_lbl;
    private javax.swing.JTextField edad_txt;
    private javax.swing.JComboBox<String> estado_civil_box;
    private javax.swing.JLabel estado_civil_lbl;
    private javax.swing.JLabel gm_lbl;
    private javax.swing.JButton guardar_btn;
    private javax.swing.JLabel nombre_cliente_lbl;
    private javax.swing.JTextField nombre_cliente_txt;
    private javax.swing.JLabel nombre_rep_lbl;
    private javax.swing.JTextField nombre_representante_txt;
    private javax.swing.JLabel ref_bancarias_lbl;
    private javax.swing.JLabel ref_credito_lbl;
    private javax.swing.JTextField referencia_bancaria_txt;
    private javax.swing.JTextField referencia_credito_txt;
    private javax.swing.JLabel registro_mercantil_lbl;
    private javax.swing.JTextField registro_mercantil_txt;
    private javax.swing.JLabel representante_t_lbl;
    private javax.swing.JLabel rnc_lbl;
    private javax.swing.JTextField rnc_txt;
    private javax.swing.JSeparator separador;
    private javax.swing.JComboBox<String> sexo_box;
    private javax.swing.JLabel sexo_lbl;
    private javax.swing.JTextField telefono_cliente_txt;
    private javax.swing.JLabel telefono_lbl;
    private javax.swing.JLabel telefono_rep_lbl;
    private javax.swing.JTextField telefono_rep_txt;
    private javax.swing.JTextField tiempo_en_mercado_txt;
    private javax.swing.JLabel tiempo_mercado_lbl;
    private javax.swing.JLabel titulo_lbl;
    // End of variables declaration//GEN-END:variables
}
