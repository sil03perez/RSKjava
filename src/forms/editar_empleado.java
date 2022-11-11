/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;
import javax.swing.ImageIcon;
import static forms.insert_empleado.cargo_txt;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class editar_empleado extends javax.swing.JFrame {
 conexion cn = new conexion();
    Connection cnn = cn.conectar();
    /**
     * Creates new form editar_empleado
     */
    public editar_empleado() {
        initComponents();
         this.setExtendedState(editar_empleado.MAXIMIZED_BOTH);
    }

    //METODO PARA GUARDAR LOS CAMBIOS
   public void guardar(){
        
       String id = codigo_txt.getText();
       String ced =  cedula_fld.getText();
       String nom =nombre_fld.getText();
       String ap  = apellido_fld.getText();
       String ed = edad_fld.getText();
       String sex = sexo_box.getSelectedItem().toString();
       String ec = estado_civil_box.getSelectedItem().toString();
       String dir = direccion_fld.getText();
       String tel =telefono_txt.getText();
       String ga = grados_box.getSelectedItem().toString();
       String apn = antecedentes_box.getSelectedItem().toString();
       String vih = vih_box.getSelectedItem().toString();
       String vis = vista_box.getSelectedItem().toString();
       String car = cargo_txt.getText();
       String sal = salario_txt.getText();
       
        String consulta = "UPDATE empleado SET cedula = '"+ced+"', Nombre = '"+nom+"', Apellido = '"+ap+"', Edad = '"+ed+"', sexo = '"+sex+"', estado_civil = '"+ec+"', direccion = '"+dir+"', telefono = '"+tel+"', Grados_aprobados = '"+ga+"', Antecedentes_penales = '"+apn+"', VIH = '"+vih+"', Vista = '"+vis+"', cargo = '"+car+"', salario = '"+sal+"' WHERE Id_empleado = '"+id+"'";
        
        try{
              PreparedStatement prst = cnn.prepareStatement(consulta);
               
            prst.executeUpdate();
            JOptionPane.showMessageDialog(null,"Exitoso");
           
                
        }
        catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null, "error " + e.getMessage());
        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        azul_pnl = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        blanco_pnl = new javax.swing.JPanel();
        gm_lbl = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        atras_lbl = new javax.swing.JLabel();
        cedula_lbl = new javax.swing.JLabel();
        nombre_lbl = new javax.swing.JLabel();
        nombre_fld = new javax.swing.JTextField();
        cedula_fld = new javax.swing.JTextField();
        sexo_lbl = new javax.swing.JLabel();
        sexo_box = new javax.swing.JComboBox<>();
        apellido_fld = new javax.swing.JTextField();
        apellido_lbl = new javax.swing.JLabel();
        edad_lbl = new javax.swing.JLabel();
        edad_fld = new javax.swing.JTextField();
        vista_box = new javax.swing.JComboBox<>();
        vista_lbl = new javax.swing.JLabel();
        direccion_lbl = new javax.swing.JLabel();
        antecedentes_lbl = new javax.swing.JLabel();
        antecedentes_box = new javax.swing.JComboBox<>();
        direccion_fld = new javax.swing.JTextField();
        estado_cv_lbl = new javax.swing.JLabel();
        vih_lbl = new javax.swing.JLabel();
        vih_box = new javax.swing.JComboBox<>();
        estado_civil_box = new javax.swing.JComboBox<>();
        grados_ap_lbl = new javax.swing.JLabel();
        puesto_lbl = new javax.swing.JLabel();
        cargo_txt = new javax.swing.JTextField();
        grados_box = new javax.swing.JComboBox<>();
        salario_lbl = new javax.swing.JLabel();
        salario_txt = new javax.swing.JTextField();
        telefono_lbl = new javax.swing.JLabel();
        telefono_txt = new javax.swing.JTextField();
        guardar_btn = new javax.swing.JLabel();
        codigo_lbl = new javax.swing.JLabel();
        codigo_txt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(new ImageIcon(getClass().getResource("/imgs/logo.png")).getImage());

        azul_pnl.setBackground(new java.awt.Color(8, 41, 138));

        blanco_pnl.setBackground(new java.awt.Color(255, 255, 255));

        gm_lbl.setFont(new java.awt.Font("Candara Light", 1, 24)); // NOI18N
        gm_lbl.setForeground(new java.awt.Color(0, 0, 102));
        gm_lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/logo - 24x24.png"))); // NOI18N
        gm_lbl.setText("Grupo M");

        titulo.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        titulo.setForeground(new java.awt.Color(9, 0, 100));
        titulo.setText("Editar empleados");

        atras_lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_left_2_24px.png"))); // NOI18N
        atras_lbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                atras_lblMouseClicked(evt);
            }
        });

        cedula_lbl.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        cedula_lbl.setForeground(new java.awt.Color(0, 0, 102));
        cedula_lbl.setText("Cédula");

        nombre_lbl.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        nombre_lbl.setForeground(new java.awt.Color(0, 0, 102));
        nombre_lbl.setText("Nombre");

        nombre_fld.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        nombre_fld.setForeground(new java.awt.Color(0, 0, 0));
        nombre_fld.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        nombre_fld.setOpaque(false);

        cedula_fld.setBackground(java.awt.Color.white);
        cedula_fld.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        cedula_fld.setForeground(new java.awt.Color(0, 0, 0));
        cedula_fld.setText("Cédula");
        cedula_fld.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        cedula_fld.setOpaque(false);

        sexo_lbl.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        sexo_lbl.setForeground(new java.awt.Color(0, 0, 102));
        sexo_lbl.setText("Sexo");

        sexo_box.setBackground(new java.awt.Color(255, 255, 255));
        sexo_box.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        sexo_box.setForeground(new java.awt.Color(0, 0, 0));
        sexo_box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "F", "M" }));
        sexo_box.setEditor(null);
        sexo_box.setInheritsPopupMenu(true);
        sexo_box.setOpaque(false);

        apellido_fld.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        apellido_fld.setForeground(new java.awt.Color(0, 0, 0));
        apellido_fld.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        apellido_fld.setOpaque(false);

        apellido_lbl.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        apellido_lbl.setForeground(new java.awt.Color(0, 0, 102));
        apellido_lbl.setText("Apellido");

        edad_lbl.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        edad_lbl.setForeground(new java.awt.Color(0, 0, 102));
        edad_lbl.setText("Edad");

        edad_fld.setBackground(java.awt.Color.white);
        edad_fld.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        edad_fld.setForeground(new java.awt.Color(0, 0, 0));
        edad_fld.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        edad_fld.setOpaque(false);

        vista_box.setBackground(java.awt.Color.white);
        vista_box.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        vista_box.setForeground(new java.awt.Color(0, 0, 0));
        vista_box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1/20", "2/20", "3/20", "4/20", "5/20", "6/20", "7/20", "8/20", "9/20", "10/20", "11/20", "12/20", "13/20", "14/20", "15/20", "16/20", "17/20", "18/20", "19/20", "20/20" }));
        vista_box.setOpaque(false);

        vista_lbl.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        vista_lbl.setForeground(new java.awt.Color(0, 0, 102));
        vista_lbl.setText("Vista");

        direccion_lbl.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        direccion_lbl.setForeground(new java.awt.Color(0, 0, 102));
        direccion_lbl.setText("Dirección");

        antecedentes_lbl.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        antecedentes_lbl.setForeground(new java.awt.Color(0, 0, 102));
        antecedentes_lbl.setText("Antecedentes penales");

        antecedentes_box.setBackground(java.awt.Color.white);
        antecedentes_box.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        antecedentes_box.setForeground(new java.awt.Color(0, 0, 0));
        antecedentes_box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Si", "No" }));
        antecedentes_box.setOpaque(false);

        direccion_fld.setBackground(java.awt.Color.white);
        direccion_fld.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        direccion_fld.setForeground(new java.awt.Color(0, 0, 0));
        direccion_fld.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        direccion_fld.setOpaque(false);

        estado_cv_lbl.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        estado_cv_lbl.setForeground(new java.awt.Color(0, 0, 102));
        estado_cv_lbl.setText("Estado civil");

        vih_lbl.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        vih_lbl.setForeground(new java.awt.Color(0, 0, 102));
        vih_lbl.setText("VIH");

        vih_box.setBackground(java.awt.Color.white);
        vih_box.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        vih_box.setForeground(new java.awt.Color(0, 0, 0));
        vih_box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Positivo", "Negativo" }));
        vih_box.setEditor(null);
        vih_box.setFocusable(false);
        vih_box.setOpaque(false);

        estado_civil_box.setBackground(java.awt.Color.white);
        estado_civil_box.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        estado_civil_box.setForeground(new java.awt.Color(0, 0, 0));
        estado_civil_box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Casado/a", "Soltero/a", "Unión libre" }));
        estado_civil_box.setOpaque(false);

        grados_ap_lbl.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        grados_ap_lbl.setForeground(new java.awt.Color(0, 0, 102));
        grados_ap_lbl.setText("Grados aprobados");

        puesto_lbl.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        puesto_lbl.setForeground(new java.awt.Color(0, 0, 102));
        puesto_lbl.setText("Puesto");

        cargo_txt.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        cargo_txt.setForeground(new java.awt.Color(0, 0, 0));
        cargo_txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        cargo_txt.setEnabled(false);
        cargo_txt.setOpaque(false);
        cargo_txt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cargo_txtMouseClicked(evt);
            }
        });
        cargo_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargo_txtActionPerformed(evt);
            }
        });

        grados_box.setBackground(java.awt.Color.white);
        grados_box.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        grados_box.setForeground(new java.awt.Color(0, 0, 0));
        grados_box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Primario", "Secundario", "Universitario" }));
        grados_box.setOpaque(false);

        salario_lbl.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        salario_lbl.setForeground(new java.awt.Color(0, 0, 102));
        salario_lbl.setText("Salario");

        salario_txt.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        salario_txt.setForeground(new java.awt.Color(0, 0, 0));
        salario_txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        salario_txt.setOpaque(false);

        telefono_lbl.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        telefono_lbl.setForeground(new java.awt.Color(0, 0, 102));
        telefono_lbl.setText("Teléfono");

        telefono_txt.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        telefono_txt.setForeground(new java.awt.Color(0, 0, 0));
        telefono_txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        telefono_txt.setOpaque(false);

        guardar_btn.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        guardar_btn.setForeground(new java.awt.Color(0, 0, 102));
        guardar_btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        guardar_btn.setText("Guardar cambios");
        guardar_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        guardar_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                guardar_btnMouseClicked(evt);
            }
        });

        codigo_lbl.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        codigo_lbl.setForeground(new java.awt.Color(0, 0, 102));
        codigo_lbl.setText("Código del empleado");

        codigo_txt.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        codigo_txt.setForeground(new java.awt.Color(0, 0, 0));
        codigo_txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        codigo_txt.setEnabled(false);
        codigo_txt.setOpaque(false);
        codigo_txt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                codigo_txtMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout blanco_pnlLayout = new javax.swing.GroupLayout(blanco_pnl);
        blanco_pnl.setLayout(blanco_pnlLayout);
        blanco_pnlLayout.setHorizontalGroup(
            blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(blanco_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(salario_txt, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(codigo_txt)
                    .addComponent(telefono_txt)
                    .addGroup(blanco_pnlLayout.createSequentialGroup()
                        .addComponent(gm_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(atras_lbl))
                    .addComponent(guardar_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(blanco_pnlLayout.createSequentialGroup()
                        .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(grados_box, 0, 279, Short.MAX_VALUE)
                            .addComponent(nombre_fld, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(apellido_fld, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(edad_fld, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(direccion_fld, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(estado_civil_box, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, blanco_pnlLayout.createSequentialGroup()
                                .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(nombre_lbl, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(apellido_lbl, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(edad_lbl, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(direccion_lbl, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(estado_cv_lbl, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(blanco_pnlLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(antecedentes_lbl)
                                    .addComponent(cedula_lbl)
                                    .addComponent(cedula_fld)
                                    .addComponent(sexo_lbl)
                                    .addComponent(vista_lbl)
                                    .addComponent(vista_box, 0, 305, Short.MAX_VALUE)
                                    .addComponent(sexo_box, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(blanco_pnlLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cargo_txt, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(antecedentes_box, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(vih_box, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(blanco_pnlLayout.createSequentialGroup()
                                        .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(vih_lbl)
                                            .addComponent(puesto_lbl))
                                        .addGap(0, 0, Short.MAX_VALUE))))))
                    .addGroup(blanco_pnlLayout.createSequentialGroup()
                        .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(grados_ap_lbl)
                            .addComponent(salario_lbl)
                            .addComponent(telefono_lbl)
                            .addComponent(codigo_lbl))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(24, 24, 24))
        );
        blanco_pnlLayout.setVerticalGroup(
            blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(blanco_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(atras_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(gm_lbl)
                        .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(codigo_lbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(codigo_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombre_lbl)
                    .addComponent(cedula_lbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombre_fld, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cedula_fld, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(apellido_lbl)
                    .addComponent(sexo_lbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(apellido_fld, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sexo_box, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edad_lbl)
                    .addComponent(vista_lbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edad_fld, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vista_box, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(direccion_lbl)
                    .addComponent(antecedentes_lbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(direccion_fld, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(antecedentes_box, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(estado_cv_lbl)
                    .addComponent(vih_lbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(estado_civil_box, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vih_box, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(grados_ap_lbl)
                    .addComponent(puesto_lbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(blanco_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(grados_box, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cargo_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(salario_lbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(salario_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(telefono_lbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(telefono_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(guardar_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jScrollPane1.setViewportView(blanco_pnl);

        javax.swing.GroupLayout azul_pnlLayout = new javax.swing.GroupLayout(azul_pnl);
        azul_pnl.setLayout(azul_pnlLayout);
        azul_pnlLayout.setHorizontalGroup(
            azul_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(azul_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 641, Short.MAX_VALUE)
                .addContainerGap())
        );
        azul_pnlLayout.setVerticalGroup(
            azul_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(azul_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 843, Short.MAX_VALUE)
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

    private void atras_lblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atras_lblMouseClicked
        //RECURSOS HUMANOS
        recursos_humanos frame = new recursos_humanos();
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_atras_lblMouseClicked

    private void cargo_txtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cargo_txtMouseClicked
        //MOSTRAR PANTALLA DE CARGOS
        cargos_edit_empl frame = new cargos_edit_empl();
        frame.setVisible(true);
    }//GEN-LAST:event_cargo_txtMouseClicked

    private void cargo_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargo_txtActionPerformed

    }//GEN-LAST:event_cargo_txtActionPerformed

    private void guardar_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardar_btnMouseClicked
        //GUARDAR CAMBIOS
        guardar();
    }//GEN-LAST:event_guardar_btnMouseClicked

    private void codigo_txtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_codigo_txtMouseClicked
        //MOSTRAR EMPLEADOS
        empleados_edit frame = new empleados_edit();
        frame.setVisible(true);
    }//GEN-LAST:event_codigo_txtMouseClicked

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
            java.util.logging.Logger.getLogger(editar_empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(editar_empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(editar_empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(editar_empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new editar_empleado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JComboBox<String> antecedentes_box;
    private javax.swing.JLabel antecedentes_lbl;
    public static javax.swing.JTextField apellido_fld;
    private javax.swing.JLabel apellido_lbl;
    private javax.swing.JLabel atras_lbl;
    private javax.swing.JPanel azul_pnl;
    private javax.swing.JPanel blanco_pnl;
    public static javax.swing.JTextField cargo_txt;
    public static javax.swing.JTextField cedula_fld;
    private javax.swing.JLabel cedula_lbl;
    private javax.swing.JLabel codigo_lbl;
    public static javax.swing.JTextField codigo_txt;
    public static javax.swing.JTextField direccion_fld;
    private javax.swing.JLabel direccion_lbl;
    public static javax.swing.JTextField edad_fld;
    private javax.swing.JLabel edad_lbl;
    public static javax.swing.JComboBox<String> estado_civil_box;
    private javax.swing.JLabel estado_cv_lbl;
    private javax.swing.JLabel gm_lbl;
    private javax.swing.JLabel grados_ap_lbl;
    public static javax.swing.JComboBox<String> grados_box;
    private javax.swing.JLabel guardar_btn;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTextField nombre_fld;
    private javax.swing.JLabel nombre_lbl;
    private javax.swing.JLabel puesto_lbl;
    private javax.swing.JLabel salario_lbl;
    public static javax.swing.JTextField salario_txt;
    public static javax.swing.JComboBox<String> sexo_box;
    private javax.swing.JLabel sexo_lbl;
    private javax.swing.JLabel telefono_lbl;
    public static javax.swing.JTextField telefono_txt;
    private javax.swing.JLabel titulo;
    public static javax.swing.JComboBox<String> vih_box;
    private javax.swing.JLabel vih_lbl;
    public static javax.swing.JComboBox<String> vista_box;
    private javax.swing.JLabel vista_lbl;
    // End of variables declaration//GEN-END:variables
}
