//AUTOR: RANSEL ENCARNACIÓN
package forms;

import javax.swing.*;
import java.sql.*;
import com.sun.java.swing.plaf.windows.WindowsLookAndFeel;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;

public class administrador extends javax.swing.JFrame {
    
    Connection cnn = conexion.conectar();
    entriptacion encriptador = new entriptacion();
    String epagu;
    String ceus;
    DefaultComboBoxModel dptos_bx;
    DefaultTableModel user;
    cargar_tabla_usuario ola = new cargar_tabla_usuario();
   

    public administrador() {
        initComponents();
        this.setExtendedState(this.getExtendedState() | administrador.MAXIMIZED_BOTH);
        this.dptos_bx = (DefaultComboBoxModel) dpto_puesto_ctl_box.getModel();
         this.user = (DefaultTableModel) usuarios_tbl.getModel();
         ola.cargar();
    }
    
    public void llenar_combo_dptos(){
        this.dpto_puesto_ctl_box.setModel(dptos_bx);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        apartados_tbd = new javax.swing.JTabbedPane();
        inicio_pnl = new javax.swing.JPanel();
        inicio_interno_pnl = new javax.swing.JPanel();
        gm_lbl = new javax.swing.JLabel();
        cerrar_sesion_btn = new javax.swing.JButton();
        detalles_sesion_pnl = new javax.swing.JPanel();
        id_empleado_sesion_txt = new javax.swing.JTextField();
        nom_apl_empleado_sesion_txt = new javax.swing.JTextField();
        usuario_empleado_sesion_txt = new javax.swing.JTextField();
        fecha_hora_sesion_txt = new javax.swing.JTextField();
        bienvenida_txt = new javax.swing.JTextField();
        usuarios_pnl = new javax.swing.JPanel();
        usuarios_sesiones_pnl = new javax.swing.JTabbedPane();
        usuarios_interno_pnl = new javax.swing.JPanel();
        gm_lbl_us = new javax.swing.JLabel();
        usuarios_lbl = new javax.swing.JLabel();
        control_usuarios_ed_pnl = new javax.swing.JPanel();
        clave_usuario_edus_txt = new javax.swing.JTextField();
        id_empleado_edus_txt = new javax.swing.JTextField();
        scroll_tbl_usuarios = new javax.swing.JScrollPane();
        usuarios_tbl = new javax.swing.JTable();
        acceso_usuario_edus_box = new javax.swing.JComboBox<>();
        nombre_usuario_edus_txt = new javax.swing.JTextField();
        editar_usuario_btn = new javax.swing.JButton();
        borrar_usuario_btn = new javax.swing.JButton();
        id_usuario_edus_txt1 = new javax.swing.JTextField();
        agregar_usuarios_pnl = new javax.swing.JPanel();
        nombre_empleado_agus_txt = new javax.swing.JTextField();
        id_empleado_agus_txt = new javax.swing.JTextField();
        apellido_empleado_agus_txt = new javax.swing.JTextField();
        nombre_usuario_agus_txt = new javax.swing.JTextField();
        clave_usuario_agus_txt = new javax.swing.JTextField();
        acceso_usuario_agus_box = new javax.swing.JComboBox<>();
        agregar_usuario_btn = new javax.swing.JButton();
        control_sesiones_pnl = new javax.swing.JPanel();
        gm_lbl14 = new javax.swing.JLabel();
        control_sesiones_lbl = new javax.swing.JLabel();
        scroll_sesiones = new javax.swing.JScrollPane();
        usuarios_tbl1 = new javax.swing.JTable();
        buscar_sesiones_txt = new javax.swing.JTextField();
        buscar_sesiones_box = new javax.swing.JComboBox<>();
        buscar_sesiones_btn = new javax.swing.JButton();
        reporte_sesiones_btn = new javax.swing.JButton();
        puestos_dptos_pnl = new javax.swing.JPanel();
        puestos_dptos_interno_pnl = new javax.swing.JPanel();
        gm_lbl2 = new javax.swing.JLabel();
        puestos_dptos_titulo = new javax.swing.JLabel();
        contol_puestos_pnl = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        puestos_tbl = new javax.swing.JTable();
        id_puesto_ctl_txt = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        desc_puesto_ctl_ta = new javax.swing.JTextArea();
        borrar_puesto_btn = new javax.swing.JButton();
        editar_puesto_btn = new javax.swing.JButton();
        nombre_puesto_ctl_txt = new javax.swing.JTextField();
        dpto_puesto_ctl_box = new javax.swing.JComboBox<>();
        contol_dptos_pnl = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        dptos_tbl = new javax.swing.JTable();
        id_dpto_ctl_txt = new javax.swing.JTextField();
        tipo_dpto_ctl_txt = new javax.swing.JComboBox<>();
        jScrollPane6 = new javax.swing.JScrollPane();
        desc_dpto_ctl_ta = new javax.swing.JTextArea();
        borrar_dpto_btn = new javax.swing.JButton();
        editar_dpto_btn = new javax.swing.JButton();
        nombre_dpto_ctl_txt = new javax.swing.JTextField();
        agregar_puesto_pnl = new javax.swing.JPanel();
        nombre_puesto_ag_txt = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        dpto_puesto_ag_txt = new javax.swing.JComboBox<>();
        agregar_puesto_btn = new javax.swing.JButton();
        agregar_dpto_pnl = new javax.swing.JPanel();
        agregar_dpto_btn = new javax.swing.JButton();
        nombre_dpto_ag_btn = new javax.swing.JTextField();
        tipo_dpto_ag_box = new javax.swing.JComboBox<>();
        jScrollPane7 = new javax.swing.JScrollPane();
        desc_dpro_ag_ta = new javax.swing.JTextArea();
        inventario_pnl = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        gm_lbl3 = new javax.swing.JLabel();
        puestos_dptos_titulo1 = new javax.swing.JLabel();
        control_inventario_pnl = new javax.swing.JPanel();
        tipo_inventario_buscar_box = new javax.swing.JComboBox<>();
        jScrollPane8 = new javax.swing.JScrollPane();
        inventario_tbl = new javax.swing.JTable();
        nmcti_txt = new javax.swing.JTextField();
        idcti_txt = new javax.swing.JTextField();
        cncti_txt = new javax.swing.JTextField();
        prcti_txt = new javax.swing.JTextField();
        ticti_box = new javax.swing.JComboBox<>();
        mdcti_box = new javax.swing.JComboBox<>();
        edmcti_btn = new javax.swing.JButton();
        brmcti_btn = new javax.swing.JButton();
        nuevo_inventario_btn = new javax.swing.JButton();
        agregar_material_pnl = new javax.swing.JPanel();
        pragi_txt = new javax.swing.JTextField();
        nmagi_txt = new javax.swing.JTextField();
        mdagi_txt = new javax.swing.JComboBox<>();
        cnagi_txt = new javax.swing.JTextField();
        tiagi_txt = new javax.swing.JComboBox<>();
        agregar_material_btn = new javax.swing.JButton();
        facturar_pnl = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        gm_lbl4 = new javax.swing.JLabel();
        puestos_dptos_titulo2 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        factura_facturar_txt = new javax.swing.JTextField();
        pedido_facturar_txt = new javax.swing.JTextField();
        total_facturar_txt = new javax.swing.JTextField();
        comprobante_facturar_txt = new javax.swing.JTextField();
        prefijo_comprobante_facturar_txt = new javax.swing.JTextField();
        secuencia_comprobante_facturar_txt = new javax.swing.JTextField();
        moneda_facturar_box = new javax.swing.JComboBox<>();
        facturar_btn = new javax.swing.JButton();
        rrhh_pnl = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel13 = new javax.swing.JPanel();
        gm_lbl5 = new javax.swing.JLabel();
        puestos_dptos_titulo3 = new javax.swing.JLabel();
        buscar_empleado_txt = new javax.swing.JTextField();
        buscar_empleado_box = new javax.swing.JComboBox<>();
        jScrollPane10 = new javax.swing.JScrollPane();
        empleados_tbl = new javax.swing.JTable();
        numero_emp_recursos_txt = new javax.swing.JTextField();
        nombre_recursos_txt = new javax.swing.JTextField();
        apellido_recursos_txt = new javax.swing.JTextField();
        cedula_recursos_txt = new javax.swing.JTextField();
        sexo_recurso_box = new javax.swing.JComboBox<>();
        edad_recursos_txt = new javax.swing.JTextField();
        nacimiento_recursos_dt = new com.toedter.calendar.JDateChooser();
        direccion_recursos_txt = new javax.swing.JTextField();
        estado_civil_recursos_box = new javax.swing.JComboBox<>();
        grados_recursos_box = new javax.swing.JComboBox<>();
        telefono_recursos_txt = new javax.swing.JTextField();
        salario_recursos_txt = new javax.swing.JTextField();
        puesto_recursos_box = new javax.swing.JComboBox<>();
        editar_empleado_btn = new javax.swing.JButton();
        borrar_empleado_btn = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jTextField23 = new javax.swing.JTextField();
        jTextField24 = new javax.swing.JTextField();
        jTextField25 = new javax.swing.JTextField();
        jComboBox12 = new javax.swing.JComboBox<>();
        jTextField16 = new javax.swing.JTextField();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jTextField17 = new javax.swing.JTextField();
        jComboBox8 = new javax.swing.JComboBox<>();
        jComboBox9 = new javax.swing.JComboBox<>();
        jTextField18 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jComboBox10 = new javax.swing.JComboBox<>();
        edmcti_btn2 = new javax.swing.JButton();
        otp = new javax.swing.JTextField();
        gastos_pnl = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        gm_lbl6 = new javax.swing.JLabel();
        puestos_dptos_titulo4 = new javax.swing.JLabel();
        control_gastos_pnl = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        gastos_tbl = new javax.swing.JTable();
        fecha1_gastos_dt = new com.toedter.calendar.JDateChooser();
        buscar_gastos_btn = new javax.swing.JButton();
        fecha2_gastos_dt = new com.toedter.calendar.JDateChooser();
        id_gastos_ed_txt = new javax.swing.JTextField();
        borrar_gastos_btn = new javax.swing.JButton();
        editar_gastos_btn = new javax.swing.JButton();
        proveedor_gastos_ed_txt = new javax.swing.JTextField();
        fecha_gastos_ed_dt = new com.toedter.calendar.JDateChooser();
        descripcion_gastos_ed_txt = new javax.swing.JTextField();
        total_gastos_ed_txt = new javax.swing.JTextField();
        agregar_gastos_pnl = new javax.swing.JPanel();
        proveedor_gastos_ag_txt = new javax.swing.JTextField();
        jDateChooser6 = new com.toedter.calendar.JDateChooser();
        desc_gastos_ag_txt = new javax.swing.JTextField();
        total_gasto_ag_txt = new javax.swing.JTextField();
        agregar_gasto_txt = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        gm_lbl7 = new javax.swing.JLabel();
        puestos_dptos_titulo5 = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        buscar_factura_btn = new javax.swing.JButton();
        codigo_factura_txt = new javax.swing.JTextField();
        mostrar_factura_btn = new javax.swing.JButton();
        buscar_factura_box = new javax.swing.JComboBox<>();
        buscar_factura_txt = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        gm_lbl8 = new javax.swing.JLabel();
        puestos_dptos_titulo6 = new javax.swing.JLabel();
        buscar_cliente_txt = new javax.swing.JTextField();
        jScrollPane13 = new javax.swing.JScrollPane();
        clientes_tbl = new javax.swing.JTable();
        buscar_cliente_box = new javax.swing.JComboBox<>();
        buscar_cliente_btn = new javax.swing.JButton();
        control_clientes_pnl = new javax.swing.JPanel();
        id_cliente_txt = new javax.swing.JTextField();
        rnc_cliente_txt = new javax.swing.JTextField();
        regmer_cliente_txt = new javax.swing.JTextField();
        nombre_cliente_txt = new javax.swing.JTextField();
        edad_cliente_txt = new javax.swing.JTextField();
        telefono_cliente_txt = new javax.swing.JTextField();
        referencias_bancarias_cliente_txt = new javax.swing.JTextField();
        representante_cliente_txt = new javax.swing.JTextField();
        referencias_credito_cliente_txt = new javax.swing.JTextField();
        agregar_cliente_btn = new javax.swing.JButton();
        borrar_cliente_btn = new javax.swing.JButton();
        editar_cliente_btn = new javax.swing.JButton();
        seleccion_operacion_box = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        gm_lbl9 = new javax.swing.JLabel();
        puestos_dptos_titulo7 = new javax.swing.JLabel();
        jScrollPane14 = new javax.swing.JScrollPane();
        prov_tbl = new javax.swing.JTable();
        buscar_prov_txt = new javax.swing.JTextField();
        buscar_prov_box = new javax.swing.JComboBox<>();
        buscar_prov_btn = new javax.swing.JButton();
        accioon_prov_box = new javax.swing.JComboBox<>();
        jPanel21 = new javax.swing.JPanel();
        jTextField43 = new javax.swing.JTextField();
        jTextField44 = new javax.swing.JTextField();
        jTextField45 = new javax.swing.JTextField();
        jTextField46 = new javax.swing.JTextField();
        jTextField47 = new javax.swing.JTextField();
        jTextField48 = new javax.swing.JTextField();
        jTextField49 = new javax.swing.JTextField();
        jTextField50 = new javax.swing.JTextField();
        jTextField51 = new javax.swing.JTextField();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        gm_lbl10 = new javax.swing.JLabel();
        puestos_dptos_titulo8 = new javax.swing.JLabel();
        jTextField52 = new javax.swing.JTextField();
        jComboBox16 = new javax.swing.JComboBox<>();
        jButton15 = new javax.swing.JButton();
        jScrollPane15 = new javax.swing.JScrollPane();
        jTable7 = new javax.swing.JTable();
        jComboBox17 = new javax.swing.JComboBox<>();
        jPanel23 = new javax.swing.JPanel();
        jTextField53 = new javax.swing.JTextField();
        jTextField54 = new javax.swing.JTextField();
        jTextField55 = new javax.swing.JTextField();
        jTextField56 = new javax.swing.JTextField();
        jTextField57 = new javax.swing.JTextField();
        jTextField58 = new javax.swing.JTextField();
        jTextField59 = new javax.swing.JTextField();
        jTextField60 = new javax.swing.JTextField();
        jTextField61 = new javax.swing.JTextField();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        gm_lbl11 = new javax.swing.JLabel();
        puestos_dptos_titulo9 = new javax.swing.JLabel();
        jTextField62 = new javax.swing.JTextField();
        jComboBox18 = new javax.swing.JComboBox<>();
        jButton19 = new javax.swing.JButton();
        jScrollPane16 = new javax.swing.JScrollPane();
        jTable8 = new javax.swing.JTable();
        jComboBox19 = new javax.swing.JComboBox<>();
        jPanel25 = new javax.swing.JPanel();
        jTextField63 = new javax.swing.JTextField();
        jTextField64 = new javax.swing.JTextField();
        jTextField65 = new javax.swing.JTextField();
        jTextField66 = new javax.swing.JTextField();
        jTextField69 = new javax.swing.JTextField();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jComboBox20 = new javax.swing.JComboBox<>();
        jPanel11 = new javax.swing.JPanel();
        jPanel28 = new javax.swing.JPanel();
        gm_lbl13 = new javax.swing.JLabel();
        puestos_dptos_titulo11 = new javax.swing.JLabel();
        jTextField74 = new javax.swing.JTextField();
        jComboBox24 = new javax.swing.JComboBox<>();
        jButton27 = new javax.swing.JButton();
        jScrollPane18 = new javax.swing.JScrollPane();
        jTable10 = new javax.swing.JTable();
        jComboBox25 = new javax.swing.JComboBox<>();
        jButton28 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        apartados_tbd.setBackground(new java.awt.Color(255, 255, 255));
        apartados_tbd.setForeground(new java.awt.Color(0, 0, 0));
        apartados_tbd.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        apartados_tbd.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N

        inicio_pnl.setBackground(new java.awt.Color(8, 41, 138));

        inicio_interno_pnl.setBackground(new java.awt.Color(255, 255, 255));

        gm_lbl.setFont(new java.awt.Font("Candara Light", 1, 24)); // NOI18N
        gm_lbl.setForeground(new java.awt.Color(0, 0, 102));
        gm_lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/logo - 24x24.png"))); // NOI18N
        gm_lbl.setText("Grupo M");

        cerrar_sesion_btn.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        cerrar_sesion_btn.setForeground(new java.awt.Color(102, 0, 0));
        cerrar_sesion_btn.setText("Cerrar Sesión");
        cerrar_sesion_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cerrar_sesion_btn.setContentAreaFilled(false);

        detalles_sesion_pnl.setBackground(new java.awt.Color(255, 255, 255));
        detalles_sesion_pnl.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)), "Detalles de la sesión", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 0, 24), new java.awt.Color(0, 0, 0))); // NOI18N

        id_empleado_sesion_txt.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        id_empleado_sesion_txt.setForeground(new java.awt.Color(0, 0, 0));
        id_empleado_sesion_txt.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)), "ID  Empleado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 18), new java.awt.Color(0, 0, 51))); // NOI18N
        id_empleado_sesion_txt.setOpaque(false);

        nom_apl_empleado_sesion_txt.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        nom_apl_empleado_sesion_txt.setForeground(new java.awt.Color(0, 0, 0));
        nom_apl_empleado_sesion_txt.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)), "Nombre y apellido", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 18), new java.awt.Color(0, 0, 51))); // NOI18N
        nom_apl_empleado_sesion_txt.setOpaque(false);
        nom_apl_empleado_sesion_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nom_apl_empleado_sesion_txtActionPerformed(evt);
            }
        });

        usuario_empleado_sesion_txt.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        usuario_empleado_sesion_txt.setForeground(new java.awt.Color(0, 0, 0));
        usuario_empleado_sesion_txt.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)), "Usuario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 18), new java.awt.Color(0, 0, 51))); // NOI18N
        usuario_empleado_sesion_txt.setOpaque(false);

        fecha_hora_sesion_txt.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        fecha_hora_sesion_txt.setForeground(new java.awt.Color(0, 0, 0));
        fecha_hora_sesion_txt.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)), "Fecha y hora", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 18), new java.awt.Color(0, 0, 51))); // NOI18N
        fecha_hora_sesion_txt.setOpaque(false);

        javax.swing.GroupLayout detalles_sesion_pnlLayout = new javax.swing.GroupLayout(detalles_sesion_pnl);
        detalles_sesion_pnl.setLayout(detalles_sesion_pnlLayout);
        detalles_sesion_pnlLayout.setHorizontalGroup(
            detalles_sesion_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detalles_sesion_pnlLayout.createSequentialGroup()
                .addComponent(id_empleado_sesion_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nom_apl_empleado_sesion_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usuario_empleado_sesion_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fecha_hora_sesion_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        detalles_sesion_pnlLayout.setVerticalGroup(
            detalles_sesion_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detalles_sesion_pnlLayout.createSequentialGroup()
                .addGroup(detalles_sesion_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id_empleado_sesion_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nom_apl_empleado_sesion_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usuario_empleado_sesion_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fecha_hora_sesion_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 10, Short.MAX_VALUE))
        );

        bienvenida_txt.setEditable(false);
        bienvenida_txt.setBackground(new java.awt.Color(255, 255, 255));
        bienvenida_txt.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        bienvenida_txt.setForeground(new java.awt.Color(0, 0, 0));
        bienvenida_txt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        javax.swing.GroupLayout inicio_interno_pnlLayout = new javax.swing.GroupLayout(inicio_interno_pnl);
        inicio_interno_pnl.setLayout(inicio_interno_pnlLayout);
        inicio_interno_pnlLayout.setHorizontalGroup(
            inicio_interno_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inicio_interno_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(inicio_interno_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(detalles_sesion_pnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cerrar_sesion_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, inicio_interno_pnlLayout.createSequentialGroup()
                        .addComponent(gm_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bienvenida_txt)))
                .addContainerGap())
        );
        inicio_interno_pnlLayout.setVerticalGroup(
            inicio_interno_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inicio_interno_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(inicio_interno_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bienvenida_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                    .addComponent(gm_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(detalles_sesion_pnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cerrar_sesion_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(453, 453, 453))
        );

        javax.swing.GroupLayout inicio_pnlLayout = new javax.swing.GroupLayout(inicio_pnl);
        inicio_pnl.setLayout(inicio_pnlLayout);
        inicio_pnlLayout.setHorizontalGroup(
            inicio_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inicio_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(inicio_interno_pnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        inicio_pnlLayout.setVerticalGroup(
            inicio_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inicio_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(inicio_interno_pnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        apartados_tbd.addTab("INICIO", inicio_pnl);

        usuarios_pnl.setBackground(new java.awt.Color(8, 41, 138));

        usuarios_sesiones_pnl.setBackground(new java.awt.Color(255, 255, 255));
        usuarios_sesiones_pnl.setForeground(new java.awt.Color(0, 0, 0));
        usuarios_sesiones_pnl.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N

        usuarios_interno_pnl.setBackground(new java.awt.Color(255, 255, 255));

        gm_lbl_us.setFont(new java.awt.Font("Candara Light", 1, 24)); // NOI18N
        gm_lbl_us.setForeground(new java.awt.Color(0, 0, 102));
        gm_lbl_us.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/logo - 24x24.png"))); // NOI18N
        gm_lbl_us.setText("Grupo M");

        usuarios_lbl.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        usuarios_lbl.setForeground(new java.awt.Color(0, 0, 0));
        usuarios_lbl.setText("Control de usuarios");

        control_usuarios_ed_pnl.setBackground(new java.awt.Color(255, 255, 255));
        control_usuarios_ed_pnl.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Control de usuarios", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N

        clave_usuario_edus_txt.setBackground(new java.awt.Color(255, 255, 255));
        clave_usuario_edus_txt.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        clave_usuario_edus_txt.setForeground(new java.awt.Color(0, 0, 0));
        clave_usuario_edus_txt.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)), "Clave", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 0, 18), new java.awt.Color(0, 0, 0))); // NOI18N
        clave_usuario_edus_txt.setCaretColor(new java.awt.Color(0, 0, 0));

        id_empleado_edus_txt.setEditable(false);
        id_empleado_edus_txt.setBackground(new java.awt.Color(255, 255, 255));
        id_empleado_edus_txt.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        id_empleado_edus_txt.setForeground(new java.awt.Color(0, 0, 0));
        id_empleado_edus_txt.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)), "ID Empleado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 0, 18), new java.awt.Color(0, 0, 0))); // NOI18N
        id_empleado_edus_txt.setCaretColor(new java.awt.Color(0, 0, 0));

        usuarios_tbl.setBackground(new java.awt.Color(255, 255, 255));
        usuarios_tbl.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        usuarios_tbl.setForeground(new java.awt.Color(0, 0, 0));
        usuarios_tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        scroll_tbl_usuarios.setViewportView(usuarios_tbl);

        acceso_usuario_edus_box.setBackground(new java.awt.Color(255, 255, 255));
        acceso_usuario_edus_box.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        acceso_usuario_edus_box.setForeground(new java.awt.Color(0, 0, 0));
        acceso_usuario_edus_box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Recursos Humanos", "Administrador", "Ventas", "Inventario" }));
        acceso_usuario_edus_box.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)), "Acceso", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 0, 18), new java.awt.Color(0, 0, 0))); // NOI18N

        nombre_usuario_edus_txt.setBackground(new java.awt.Color(255, 255, 255));
        nombre_usuario_edus_txt.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        nombre_usuario_edus_txt.setForeground(new java.awt.Color(0, 0, 0));
        nombre_usuario_edus_txt.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)), "Nombre de usuario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 0, 18), new java.awt.Color(0, 0, 0))); // NOI18N
        nombre_usuario_edus_txt.setCaretColor(new java.awt.Color(0, 0, 0));

        editar_usuario_btn.setBackground(new java.awt.Color(255, 255, 255));
        editar_usuario_btn.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        editar_usuario_btn.setForeground(new java.awt.Color(0, 102, 0));
        editar_usuario_btn.setText("Editar Usuario");
        editar_usuario_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        borrar_usuario_btn.setBackground(new java.awt.Color(255, 255, 255));
        borrar_usuario_btn.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        borrar_usuario_btn.setForeground(new java.awt.Color(102, 0, 0));
        borrar_usuario_btn.setText("Borrar Usuario");
        borrar_usuario_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        id_usuario_edus_txt1.setEditable(false);
        id_usuario_edus_txt1.setBackground(new java.awt.Color(255, 255, 255));
        id_usuario_edus_txt1.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        id_usuario_edus_txt1.setForeground(new java.awt.Color(0, 0, 0));
        id_usuario_edus_txt1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)), "ID Usuario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 0, 18), new java.awt.Color(0, 0, 0))); // NOI18N
        id_usuario_edus_txt1.setCaretColor(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout control_usuarios_ed_pnlLayout = new javax.swing.GroupLayout(control_usuarios_ed_pnl);
        control_usuarios_ed_pnl.setLayout(control_usuarios_ed_pnlLayout);
        control_usuarios_ed_pnlLayout.setHorizontalGroup(
            control_usuarios_ed_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(control_usuarios_ed_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(control_usuarios_ed_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(editar_usuario_btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scroll_tbl_usuarios)
                    .addGroup(control_usuarios_ed_pnlLayout.createSequentialGroup()
                        .addComponent(id_usuario_edus_txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(id_empleado_edus_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nombre_usuario_edus_txt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clave_usuario_edus_txt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(acceso_usuario_edus_box, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(borrar_usuario_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        control_usuarios_ed_pnlLayout.setVerticalGroup(
            control_usuarios_ed_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(control_usuarios_ed_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scroll_tbl_usuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(control_usuarios_ed_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(control_usuarios_ed_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(id_empleado_edus_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nombre_usuario_edus_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(clave_usuario_edus_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(acceso_usuario_edus_box, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(id_usuario_edus_txt1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editar_usuario_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(borrar_usuario_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        agregar_usuarios_pnl.setBackground(new java.awt.Color(255, 255, 255));
        agregar_usuarios_pnl.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Agregar Usuario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 18), new java.awt.Color(0, 0, 0))); // NOI18N

        nombre_empleado_agus_txt.setEditable(false);
        nombre_empleado_agus_txt.setBackground(new java.awt.Color(255, 255, 255));
        nombre_empleado_agus_txt.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        nombre_empleado_agus_txt.setForeground(new java.awt.Color(0, 0, 0));
        nombre_empleado_agus_txt.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)), "Nombre Empleado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 0, 18), new java.awt.Color(0, 0, 0))); // NOI18N
        nombre_empleado_agus_txt.setCaretColor(new java.awt.Color(0, 0, 0));

        id_empleado_agus_txt.setEditable(false);
        id_empleado_agus_txt.setBackground(new java.awt.Color(255, 255, 255));
        id_empleado_agus_txt.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        id_empleado_agus_txt.setForeground(new java.awt.Color(0, 0, 0));
        id_empleado_agus_txt.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)), "ID Empleado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 0, 18), new java.awt.Color(0, 0, 0))); // NOI18N
        id_empleado_agus_txt.setCaretColor(new java.awt.Color(0, 0, 0));

        apellido_empleado_agus_txt.setEditable(false);
        apellido_empleado_agus_txt.setBackground(new java.awt.Color(255, 255, 255));
        apellido_empleado_agus_txt.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        apellido_empleado_agus_txt.setForeground(new java.awt.Color(0, 0, 0));
        apellido_empleado_agus_txt.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)), "Apellido Empleado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 0, 18), new java.awt.Color(0, 0, 0))); // NOI18N
        apellido_empleado_agus_txt.setCaretColor(new java.awt.Color(0, 0, 0));

        nombre_usuario_agus_txt.setBackground(new java.awt.Color(255, 255, 255));
        nombre_usuario_agus_txt.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        nombre_usuario_agus_txt.setForeground(new java.awt.Color(0, 0, 0));
        nombre_usuario_agus_txt.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)), "Nombre de usuario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 0, 18), new java.awt.Color(0, 0, 0))); // NOI18N
        nombre_usuario_agus_txt.setCaretColor(new java.awt.Color(0, 0, 0));

        clave_usuario_agus_txt.setBackground(new java.awt.Color(255, 255, 255));
        clave_usuario_agus_txt.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        clave_usuario_agus_txt.setForeground(new java.awt.Color(0, 0, 0));
        clave_usuario_agus_txt.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)), "Clave", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 0, 18), new java.awt.Color(0, 0, 0))); // NOI18N
        clave_usuario_agus_txt.setCaretColor(new java.awt.Color(0, 0, 0));

        acceso_usuario_agus_box.setBackground(new java.awt.Color(255, 255, 255));
        acceso_usuario_agus_box.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        acceso_usuario_agus_box.setForeground(new java.awt.Color(0, 0, 0));
        acceso_usuario_agus_box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Recursos Humanos", "Administrador", "Ventas", "Inventario" }));
        acceso_usuario_agus_box.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)), "Acceso", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 0, 18), new java.awt.Color(0, 0, 0))); // NOI18N

        agregar_usuario_btn.setBackground(new java.awt.Color(255, 255, 255));
        agregar_usuario_btn.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        agregar_usuario_btn.setForeground(new java.awt.Color(0, 102, 0));
        agregar_usuario_btn.setText("Agregar Usuario");
        agregar_usuario_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        agregar_usuario_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregar_usuario_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout agregar_usuarios_pnlLayout = new javax.swing.GroupLayout(agregar_usuarios_pnl);
        agregar_usuarios_pnl.setLayout(agregar_usuarios_pnlLayout);
        agregar_usuarios_pnlLayout.setHorizontalGroup(
            agregar_usuarios_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(agregar_usuarios_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(agregar_usuarios_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(agregar_usuarios_pnlLayout.createSequentialGroup()
                        .addComponent(nombre_usuario_agus_txt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clave_usuario_agus_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(acceso_usuario_agus_box, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(agregar_usuarios_pnlLayout.createSequentialGroup()
                        .addComponent(id_empleado_agus_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nombre_empleado_agus_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(apellido_empleado_agus_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE))
                    .addComponent(agregar_usuario_btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        agregar_usuarios_pnlLayout.setVerticalGroup(
            agregar_usuarios_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, agregar_usuarios_pnlLayout.createSequentialGroup()
                .addGroup(agregar_usuarios_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id_empleado_agus_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombre_empleado_agus_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(apellido_empleado_agus_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(agregar_usuarios_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombre_usuario_agus_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clave_usuario_agus_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(acceso_usuario_agus_box, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(agregar_usuario_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout usuarios_interno_pnlLayout = new javax.swing.GroupLayout(usuarios_interno_pnl);
        usuarios_interno_pnl.setLayout(usuarios_interno_pnlLayout);
        usuarios_interno_pnlLayout.setHorizontalGroup(
            usuarios_interno_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(usuarios_interno_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(usuarios_interno_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(control_usuarios_ed_pnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(usuarios_interno_pnlLayout.createSequentialGroup()
                        .addComponent(gm_lbl_us, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(usuarios_lbl)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(agregar_usuarios_pnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        usuarios_interno_pnlLayout.setVerticalGroup(
            usuarios_interno_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(usuarios_interno_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(usuarios_interno_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gm_lbl_us)
                    .addComponent(usuarios_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(control_usuarios_ed_pnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(agregar_usuarios_pnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        usuarios_sesiones_pnl.addTab("Control", usuarios_interno_pnl);

        control_sesiones_pnl.setBackground(new java.awt.Color(255, 255, 255));

        gm_lbl14.setFont(new java.awt.Font("Candara Light", 1, 24)); // NOI18N
        gm_lbl14.setForeground(new java.awt.Color(0, 0, 102));
        gm_lbl14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/logo - 24x24.png"))); // NOI18N
        gm_lbl14.setText("Grupo M");

        control_sesiones_lbl.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        control_sesiones_lbl.setForeground(new java.awt.Color(0, 0, 0));
        control_sesiones_lbl.setText("Control de sesiones");

        usuarios_tbl1.setBackground(new java.awt.Color(255, 255, 255));
        usuarios_tbl1.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        usuarios_tbl1.setForeground(new java.awt.Color(0, 0, 0));
        usuarios_tbl1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        scroll_sesiones.setViewportView(usuarios_tbl1);

        buscar_sesiones_txt.setBackground(new java.awt.Color(255, 255, 255));
        buscar_sesiones_txt.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        buscar_sesiones_txt.setForeground(new java.awt.Color(0, 0, 0));
        buscar_sesiones_txt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        buscar_sesiones_box.setBackground(new java.awt.Color(255, 255, 255));
        buscar_sesiones_box.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        buscar_sesiones_box.setForeground(new java.awt.Color(0, 0, 0));
        buscar_sesiones_box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nombre de usuario", "Código de usuario", "Fecha", "Abiertas", "Cerradas", " " }));
        buscar_sesiones_box.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        buscar_sesiones_btn.setBackground(new java.awt.Color(255, 255, 255));
        buscar_sesiones_btn.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        buscar_sesiones_btn.setForeground(new java.awt.Color(0, 0, 0));
        buscar_sesiones_btn.setText("Buscar");
        buscar_sesiones_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        reporte_sesiones_btn.setBackground(new java.awt.Color(255, 255, 255));
        reporte_sesiones_btn.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        reporte_sesiones_btn.setForeground(new java.awt.Color(0, 0, 0));
        reporte_sesiones_btn.setText("Reporte de sesiones");
        reporte_sesiones_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout control_sesiones_pnlLayout = new javax.swing.GroupLayout(control_sesiones_pnl);
        control_sesiones_pnl.setLayout(control_sesiones_pnlLayout);
        control_sesiones_pnlLayout.setHorizontalGroup(
            control_sesiones_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(control_sesiones_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(control_sesiones_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(control_sesiones_pnlLayout.createSequentialGroup()
                        .addComponent(gm_lbl14, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(control_sesiones_lbl)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(scroll_sesiones, javax.swing.GroupLayout.DEFAULT_SIZE, 905, Short.MAX_VALUE)
                    .addGroup(control_sesiones_pnlLayout.createSequentialGroup()
                        .addComponent(buscar_sesiones_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buscar_sesiones_box, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buscar_sesiones_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(reporte_sesiones_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        control_sesiones_pnlLayout.setVerticalGroup(
            control_sesiones_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(control_sesiones_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(control_sesiones_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gm_lbl14)
                    .addComponent(control_sesiones_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(control_sesiones_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buscar_sesiones_box)
                    .addComponent(buscar_sesiones_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buscar_sesiones_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scroll_sesiones, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(reporte_sesiones_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(268, 268, 268))
        );

        usuarios_sesiones_pnl.addTab("Sesiones", control_sesiones_pnl);

        javax.swing.GroupLayout usuarios_pnlLayout = new javax.swing.GroupLayout(usuarios_pnl);
        usuarios_pnl.setLayout(usuarios_pnlLayout);
        usuarios_pnlLayout.setHorizontalGroup(
            usuarios_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(usuarios_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(usuarios_sesiones_pnl)
                .addContainerGap())
        );
        usuarios_pnlLayout.setVerticalGroup(
            usuarios_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(usuarios_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(usuarios_sesiones_pnl)
                .addContainerGap())
        );

        apartados_tbd.addTab("USUARIOS", usuarios_pnl);

        puestos_dptos_pnl.setBackground(new java.awt.Color(8, 41, 138));

        puestos_dptos_interno_pnl.setBackground(new java.awt.Color(255, 255, 255));

        gm_lbl2.setFont(new java.awt.Font("Candara Light", 1, 24)); // NOI18N
        gm_lbl2.setForeground(new java.awt.Color(0, 0, 102));
        gm_lbl2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/logo - 24x24.png"))); // NOI18N
        gm_lbl2.setText("Grupo M");

        puestos_dptos_titulo.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        puestos_dptos_titulo.setForeground(new java.awt.Color(0, 0, 0));
        puestos_dptos_titulo.setText("Puestos y Departamentos");

        contol_puestos_pnl.setBackground(new java.awt.Color(255, 255, 255));
        contol_puestos_pnl.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Control de puestos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N

        puestos_tbl.setBackground(new java.awt.Color(255, 255, 255));
        puestos_tbl.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        puestos_tbl.setForeground(new java.awt.Color(0, 0, 0));
        puestos_tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(puestos_tbl);

        id_puesto_ctl_txt.setEditable(false);
        id_puesto_ctl_txt.setBackground(new java.awt.Color(255, 255, 255));
        id_puesto_ctl_txt.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        id_puesto_ctl_txt.setForeground(new java.awt.Color(0, 0, 0));
        id_puesto_ctl_txt.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)), "ID", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        id_puesto_ctl_txt.setCaretColor(new java.awt.Color(0, 0, 0));

        desc_puesto_ctl_ta.setBackground(new java.awt.Color(255, 255, 255));
        desc_puesto_ctl_ta.setColumns(20);
        desc_puesto_ctl_ta.setRows(5);
        desc_puesto_ctl_ta.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)), "Descripción", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        jScrollPane2.setViewportView(desc_puesto_ctl_ta);

        borrar_puesto_btn.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        borrar_puesto_btn.setForeground(new java.awt.Color(102, 0, 0));
        borrar_puesto_btn.setText("Borrar");
        borrar_puesto_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        borrar_puesto_btn.setContentAreaFilled(false);

        editar_puesto_btn.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        editar_puesto_btn.setForeground(new java.awt.Color(0, 102, 0));
        editar_puesto_btn.setText("Editar");
        editar_puesto_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        editar_puesto_btn.setContentAreaFilled(false);

        nombre_puesto_ctl_txt.setEditable(false);
        nombre_puesto_ctl_txt.setBackground(new java.awt.Color(255, 255, 255));
        nombre_puesto_ctl_txt.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        nombre_puesto_ctl_txt.setForeground(new java.awt.Color(0, 0, 0));
        nombre_puesto_ctl_txt.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)), "Nombre", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        nombre_puesto_ctl_txt.setCaretColor(new java.awt.Color(0, 0, 0));

        dpto_puesto_ctl_box.setBackground(new java.awt.Color(255, 255, 255));
        dpto_puesto_ctl_box.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        dpto_puesto_ctl_box.setForeground(new java.awt.Color(0, 0, 0));
        dpto_puesto_ctl_box.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)), "Dpto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N

        javax.swing.GroupLayout contol_puestos_pnlLayout = new javax.swing.GroupLayout(contol_puestos_pnl);
        contol_puestos_pnl.setLayout(contol_puestos_pnlLayout);
        contol_puestos_pnlLayout.setHorizontalGroup(
            contol_puestos_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contol_puestos_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contol_puestos_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(contol_puestos_pnlLayout.createSequentialGroup()
                        .addComponent(id_puesto_ctl_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nombre_puesto_ctl_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dpto_puesto_ctl_box, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(borrar_puesto_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(editar_puesto_btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        contol_puestos_pnlLayout.setVerticalGroup(
            contol_puestos_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contol_puestos_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contol_puestos_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(contol_puestos_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(id_puesto_ctl_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nombre_puesto_ctl_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(dpto_puesto_ctl_box))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editar_puesto_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(borrar_puesto_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        contol_dptos_pnl.setBackground(new java.awt.Color(255, 255, 255));
        contol_dptos_pnl.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Control de departamentos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N

        dptos_tbl.setBackground(new java.awt.Color(255, 255, 255));
        dptos_tbl.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        dptos_tbl.setForeground(new java.awt.Color(0, 0, 0));
        dptos_tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(dptos_tbl);

        id_dpto_ctl_txt.setEditable(false);
        id_dpto_ctl_txt.setBackground(new java.awt.Color(255, 255, 255));
        id_dpto_ctl_txt.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        id_dpto_ctl_txt.setForeground(new java.awt.Color(0, 0, 0));
        id_dpto_ctl_txt.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)), "ID", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        id_dpto_ctl_txt.setCaretColor(new java.awt.Color(0, 0, 0));

        tipo_dpto_ctl_txt.setBackground(new java.awt.Color(255, 255, 255));
        tipo_dpto_ctl_txt.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        tipo_dpto_ctl_txt.setForeground(new java.awt.Color(0, 0, 0));
        tipo_dpto_ctl_txt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Directo", "Indirecto", "Administrativo", " " }));
        tipo_dpto_ctl_txt.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)), "Tipo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N

        desc_dpto_ctl_ta.setBackground(new java.awt.Color(255, 255, 255));
        desc_dpto_ctl_ta.setColumns(20);
        desc_dpto_ctl_ta.setRows(5);
        desc_dpto_ctl_ta.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)), "Descripción", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        jScrollPane6.setViewportView(desc_dpto_ctl_ta);

        borrar_dpto_btn.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        borrar_dpto_btn.setForeground(new java.awt.Color(102, 0, 0));
        borrar_dpto_btn.setText("Borrar");
        borrar_dpto_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        borrar_dpto_btn.setContentAreaFilled(false);

        editar_dpto_btn.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        editar_dpto_btn.setForeground(new java.awt.Color(0, 102, 0));
        editar_dpto_btn.setText("Editar");
        editar_dpto_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        editar_dpto_btn.setContentAreaFilled(false);

        nombre_dpto_ctl_txt.setEditable(false);
        nombre_dpto_ctl_txt.setBackground(new java.awt.Color(255, 255, 255));
        nombre_dpto_ctl_txt.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        nombre_dpto_ctl_txt.setForeground(new java.awt.Color(0, 0, 0));
        nombre_dpto_ctl_txt.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)), "Nombre", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        nombre_dpto_ctl_txt.setCaretColor(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout contol_dptos_pnlLayout = new javax.swing.GroupLayout(contol_dptos_pnl);
        contol_dptos_pnl.setLayout(contol_dptos_pnlLayout);
        contol_dptos_pnlLayout.setHorizontalGroup(
            contol_dptos_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contol_dptos_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contol_dptos_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)
                    .addComponent(jScrollPane6)
                    .addGroup(contol_dptos_pnlLayout.createSequentialGroup()
                        .addComponent(id_dpto_ctl_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nombre_dpto_ctl_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tipo_dpto_ctl_txt, 0, 129, Short.MAX_VALUE))
                    .addComponent(borrar_dpto_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(editar_dpto_btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        contol_dptos_pnlLayout.setVerticalGroup(
            contol_dptos_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contol_dptos_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contol_dptos_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(contol_dptos_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(id_dpto_ctl_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nombre_dpto_ctl_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tipo_dpto_ctl_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editar_dpto_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(borrar_dpto_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        agregar_puesto_pnl.setBackground(new java.awt.Color(255, 255, 255));
        agregar_puesto_pnl.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Agregar puestos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N

        nombre_puesto_ag_txt.setEditable(false);
        nombre_puesto_ag_txt.setBackground(new java.awt.Color(255, 255, 255));
        nombre_puesto_ag_txt.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        nombre_puesto_ag_txt.setForeground(new java.awt.Color(0, 0, 0));
        nombre_puesto_ag_txt.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)), "Nombre", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        nombre_puesto_ag_txt.setCaretColor(new java.awt.Color(0, 0, 0));

        jTextArea2.setBackground(new java.awt.Color(255, 255, 255));
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        jTextArea2.setForeground(new java.awt.Color(0, 0, 0));
        jTextArea2.setRows(5);
        jTextArea2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)), "Descripción", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        jScrollPane5.setViewportView(jTextArea2);

        dpto_puesto_ag_txt.setBackground(new java.awt.Color(255, 255, 255));
        dpto_puesto_ag_txt.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        dpto_puesto_ag_txt.setForeground(new java.awt.Color(0, 0, 0));
        dpto_puesto_ag_txt.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)), "Dpto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N

        agregar_puesto_btn.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        agregar_puesto_btn.setForeground(new java.awt.Color(0, 102, 0));
        agregar_puesto_btn.setText("Agregar");
        agregar_puesto_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        agregar_puesto_btn.setContentAreaFilled(false);

        javax.swing.GroupLayout agregar_puesto_pnlLayout = new javax.swing.GroupLayout(agregar_puesto_pnl);
        agregar_puesto_pnl.setLayout(agregar_puesto_pnlLayout);
        agregar_puesto_pnlLayout.setHorizontalGroup(
            agregar_puesto_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(agregar_puesto_pnlLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(agregar_puesto_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(agregar_puesto_pnlLayout.createSequentialGroup()
                        .addComponent(nombre_puesto_ag_txt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dpto_puesto_ag_txt, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(agregar_puesto_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        agregar_puesto_pnlLayout.setVerticalGroup(
            agregar_puesto_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, agregar_puesto_pnlLayout.createSequentialGroup()
                .addGroup(agregar_puesto_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                    .addGroup(agregar_puesto_pnlLayout.createSequentialGroup()
                        .addGroup(agregar_puesto_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nombre_puesto_ag_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dpto_puesto_ag_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(agregar_puesto_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        agregar_dpto_pnl.setBackground(new java.awt.Color(255, 255, 255));
        agregar_dpto_pnl.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Agregar departamentos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N

        agregar_dpto_btn.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        agregar_dpto_btn.setForeground(new java.awt.Color(0, 102, 0));
        agregar_dpto_btn.setText("Agregar");
        agregar_dpto_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        agregar_dpto_btn.setContentAreaFilled(false);

        nombre_dpto_ag_btn.setEditable(false);
        nombre_dpto_ag_btn.setBackground(new java.awt.Color(255, 255, 255));
        nombre_dpto_ag_btn.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        nombre_dpto_ag_btn.setForeground(new java.awt.Color(0, 0, 0));
        nombre_dpto_ag_btn.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)), "Nombre", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        nombre_dpto_ag_btn.setCaretColor(new java.awt.Color(0, 0, 0));

        tipo_dpto_ag_box.setBackground(new java.awt.Color(255, 255, 255));
        tipo_dpto_ag_box.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        tipo_dpto_ag_box.setForeground(new java.awt.Color(0, 0, 0));
        tipo_dpto_ag_box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Directo", "Indirecto", "Administrativo", " " }));
        tipo_dpto_ag_box.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)), "Tipo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N

        desc_dpro_ag_ta.setBackground(new java.awt.Color(255, 255, 255));
        desc_dpro_ag_ta.setColumns(20);
        desc_dpro_ag_ta.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        desc_dpro_ag_ta.setForeground(new java.awt.Color(0, 0, 0));
        desc_dpro_ag_ta.setRows(5);
        desc_dpro_ag_ta.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)), "Descripción", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        jScrollPane7.setViewportView(desc_dpro_ag_ta);

        javax.swing.GroupLayout agregar_dpto_pnlLayout = new javax.swing.GroupLayout(agregar_dpto_pnl);
        agregar_dpto_pnl.setLayout(agregar_dpto_pnlLayout);
        agregar_dpto_pnlLayout.setHorizontalGroup(
            agregar_dpto_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(agregar_dpto_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(agregar_dpto_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(agregar_dpto_pnlLayout.createSequentialGroup()
                        .addComponent(nombre_dpto_ag_btn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tipo_dpto_ag_box, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(agregar_dpto_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );
        agregar_dpto_pnlLayout.setVerticalGroup(
            agregar_dpto_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, agregar_dpto_pnlLayout.createSequentialGroup()
                .addGroup(agregar_dpto_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane7)
                    .addGroup(agregar_dpto_pnlLayout.createSequentialGroup()
                        .addGroup(agregar_dpto_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nombre_dpto_ag_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tipo_dpto_ag_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addComponent(agregar_dpto_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout puestos_dptos_interno_pnlLayout = new javax.swing.GroupLayout(puestos_dptos_interno_pnl);
        puestos_dptos_interno_pnl.setLayout(puestos_dptos_interno_pnlLayout);
        puestos_dptos_interno_pnlLayout.setHorizontalGroup(
            puestos_dptos_interno_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(puestos_dptos_interno_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(puestos_dptos_interno_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(agregar_puesto_pnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, puestos_dptos_interno_pnlLayout.createSequentialGroup()
                        .addComponent(gm_lbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(puestos_dptos_titulo)
                        .addGap(0, 65, Short.MAX_VALUE))
                    .addComponent(contol_puestos_pnl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(puestos_dptos_interno_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(contol_dptos_pnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(agregar_dpto_pnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        puestos_dptos_interno_pnlLayout.setVerticalGroup(
            puestos_dptos_interno_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, puestos_dptos_interno_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(puestos_dptos_interno_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gm_lbl2)
                    .addComponent(puestos_dptos_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(puestos_dptos_interno_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(contol_dptos_pnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(contol_puestos_pnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(puestos_dptos_interno_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(agregar_dpto_pnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(agregar_puesto_pnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout puestos_dptos_pnlLayout = new javax.swing.GroupLayout(puestos_dptos_pnl);
        puestos_dptos_pnl.setLayout(puestos_dptos_pnlLayout);
        puestos_dptos_pnlLayout.setHorizontalGroup(
            puestos_dptos_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(puestos_dptos_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(puestos_dptos_interno_pnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        puestos_dptos_pnlLayout.setVerticalGroup(
            puestos_dptos_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(puestos_dptos_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(puestos_dptos_interno_pnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        apartados_tbd.addTab("PUESTOS", puestos_dptos_pnl);

        inventario_pnl.setBackground(new java.awt.Color(8, 41, 138));

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));

        gm_lbl3.setFont(new java.awt.Font("Candara Light", 1, 24)); // NOI18N
        gm_lbl3.setForeground(new java.awt.Color(0, 0, 102));
        gm_lbl3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/logo - 24x24.png"))); // NOI18N
        gm_lbl3.setText("Grupo M");

        puestos_dptos_titulo1.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        puestos_dptos_titulo1.setForeground(new java.awt.Color(0, 0, 0));
        puestos_dptos_titulo1.setText("Inventario");

        control_inventario_pnl.setBackground(new java.awt.Color(255, 255, 255));
        control_inventario_pnl.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Control del inventario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 18), new java.awt.Color(0, 0, 0))); // NOI18N

        tipo_inventario_buscar_box.setBackground(new java.awt.Color(255, 255, 255));
        tipo_inventario_buscar_box.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        tipo_inventario_buscar_box.setForeground(new java.awt.Color(0, 0, 0));
        tipo_inventario_buscar_box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Tela", "Repuestos", "Combustible", "Empaque", "Quimicos", "Gastables", " " }));
        tipo_inventario_buscar_box.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        inventario_tbl.setBackground(new java.awt.Color(255, 255, 255));
        inventario_tbl.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        inventario_tbl.setForeground(new java.awt.Color(0, 0, 0));
        inventario_tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane8.setViewportView(inventario_tbl);

        nmcti_txt.setBackground(new java.awt.Color(255, 255, 255));
        nmcti_txt.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        nmcti_txt.setForeground(new java.awt.Color(0, 0, 0));
        nmcti_txt.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)), "Nombre", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N

        idcti_txt.setBackground(new java.awt.Color(255, 255, 255));
        idcti_txt.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        idcti_txt.setForeground(new java.awt.Color(0, 0, 0));
        idcti_txt.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)), "ID", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N

        cncti_txt.setBackground(new java.awt.Color(255, 255, 255));
        cncti_txt.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        cncti_txt.setForeground(new java.awt.Color(0, 0, 0));
        cncti_txt.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)), "Cantidad", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N

        prcti_txt.setBackground(new java.awt.Color(255, 255, 255));
        prcti_txt.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        prcti_txt.setForeground(new java.awt.Color(0, 0, 0));
        prcti_txt.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)), "Precio", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N

        ticti_box.setBackground(new java.awt.Color(255, 255, 255));
        ticti_box.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        ticti_box.setForeground(new java.awt.Color(0, 0, 0));
        ticti_box.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)), "Inventario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N

        mdcti_box.setBackground(new java.awt.Color(255, 255, 255));
        mdcti_box.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        mdcti_box.setForeground(new java.awt.Color(0, 0, 0));
        mdcti_box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yarda", "Unidad", "Galón", "Rollo", " " }));
        mdcti_box.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)), "Medida", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N

        edmcti_btn.setBackground(new java.awt.Color(255, 255, 255));
        edmcti_btn.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        edmcti_btn.setForeground(new java.awt.Color(0, 102, 0));
        edmcti_btn.setText("Editar Material");
        edmcti_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        brmcti_btn.setBackground(new java.awt.Color(255, 255, 255));
        brmcti_btn.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        brmcti_btn.setForeground(new java.awt.Color(102, 0, 0));
        brmcti_btn.setText("Borrar Material");
        brmcti_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        nuevo_inventario_btn.setBackground(new java.awt.Color(255, 255, 255));
        nuevo_inventario_btn.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        nuevo_inventario_btn.setForeground(new java.awt.Color(0, 102, 0));
        nuevo_inventario_btn.setText("Nuevo Inventario");
        nuevo_inventario_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        nuevo_inventario_btn.setContentAreaFilled(false);
        nuevo_inventario_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevo_inventario_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout control_inventario_pnlLayout = new javax.swing.GroupLayout(control_inventario_pnl);
        control_inventario_pnl.setLayout(control_inventario_pnlLayout);
        control_inventario_pnlLayout.setHorizontalGroup(
            control_inventario_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(control_inventario_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(control_inventario_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane8)
                    .addGroup(control_inventario_pnlLayout.createSequentialGroup()
                        .addComponent(idcti_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nmcti_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cncti_txt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(prcti_txt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mdcti_box, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ticti_box, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(edmcti_btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(brmcti_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(control_inventario_pnlLayout.createSequentialGroup()
                        .addComponent(tipo_inventario_buscar_box, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nuevo_inventario_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        control_inventario_pnlLayout.setVerticalGroup(
            control_inventario_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(control_inventario_pnlLayout.createSequentialGroup()
                .addGroup(control_inventario_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tipo_inventario_buscar_box)
                    .addComponent(nuevo_inventario_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(control_inventario_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idcti_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nmcti_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cncti_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prcti_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mdcti_box)
                    .addComponent(ticti_box, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edmcti_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(brmcti_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9))
        );

        agregar_material_pnl.setBackground(new java.awt.Color(255, 255, 255));
        agregar_material_pnl.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Agregar material", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 18), new java.awt.Color(0, 0, 0))); // NOI18N

        pragi_txt.setBackground(new java.awt.Color(255, 255, 255));
        pragi_txt.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        pragi_txt.setForeground(new java.awt.Color(0, 0, 0));
        pragi_txt.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)), "Precio", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N

        nmagi_txt.setBackground(new java.awt.Color(255, 255, 255));
        nmagi_txt.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        nmagi_txt.setForeground(new java.awt.Color(0, 0, 0));
        nmagi_txt.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)), "Nombre", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N

        mdagi_txt.setBackground(new java.awt.Color(255, 255, 255));
        mdagi_txt.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        mdagi_txt.setForeground(new java.awt.Color(0, 0, 0));
        mdagi_txt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yarda", "Unidad", "Galón", "Rollo", " " }));
        mdagi_txt.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)), "Medida", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N

        cnagi_txt.setBackground(new java.awt.Color(255, 255, 255));
        cnagi_txt.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        cnagi_txt.setForeground(new java.awt.Color(0, 0, 0));
        cnagi_txt.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)), "Cantidad", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N

        tiagi_txt.setBackground(new java.awt.Color(255, 255, 255));
        tiagi_txt.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        tiagi_txt.setForeground(new java.awt.Color(0, 0, 0));
        tiagi_txt.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)), "Inventario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N

        agregar_material_btn.setBackground(new java.awt.Color(255, 255, 255));
        agregar_material_btn.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        agregar_material_btn.setForeground(new java.awt.Color(0, 102, 0));
        agregar_material_btn.setText("Agregar Material");
        agregar_material_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout agregar_material_pnlLayout = new javax.swing.GroupLayout(agregar_material_pnl);
        agregar_material_pnl.setLayout(agregar_material_pnlLayout);
        agregar_material_pnlLayout.setHorizontalGroup(
            agregar_material_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(agregar_material_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(agregar_material_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(agregar_material_pnlLayout.createSequentialGroup()
                        .addComponent(nmagi_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cnagi_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pragi_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mdagi_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tiagi_txt, 0, 161, Short.MAX_VALUE))
                    .addComponent(agregar_material_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        agregar_material_pnlLayout.setVerticalGroup(
            agregar_material_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(agregar_material_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(agregar_material_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nmagi_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cnagi_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pragi_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mdagi_txt)
                    .addComponent(tiagi_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(agregar_material_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(agregar_material_pnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(control_inventario_pnl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel18Layout.createSequentialGroup()
                        .addComponent(gm_lbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(puestos_dptos_titulo1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gm_lbl3)
                    .addComponent(puestos_dptos_titulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(control_inventario_pnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(agregar_material_pnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout inventario_pnlLayout = new javax.swing.GroupLayout(inventario_pnl);
        inventario_pnl.setLayout(inventario_pnlLayout);
        inventario_pnlLayout.setHorizontalGroup(
            inventario_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inventario_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        inventario_pnlLayout.setVerticalGroup(
            inventario_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inventario_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        apartados_tbd.addTab("INVENTARIO", inventario_pnl);

        facturar_pnl.setBackground(new java.awt.Color(8, 41, 138));

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));

        gm_lbl4.setFont(new java.awt.Font("Candara Light", 1, 24)); // NOI18N
        gm_lbl4.setForeground(new java.awt.Color(0, 0, 102));
        gm_lbl4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/logo - 24x24.png"))); // NOI18N
        gm_lbl4.setText("Grupo M");

        puestos_dptos_titulo2.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        puestos_dptos_titulo2.setForeground(new java.awt.Color(0, 0, 0));
        puestos_dptos_titulo2.setText("Facturar  Pedidos");

        jScrollPane9.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane9.setForeground(new java.awt.Color(0, 0, 0));
        jScrollPane9.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N

        jTable1.setBackground(new java.awt.Color(255, 255, 255));
        jTable1.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        jTable1.setForeground(new java.awt.Color(0, 0, 0));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane9.setViewportView(jTable1);

        factura_facturar_txt.setBackground(new java.awt.Color(255, 255, 255));
        factura_facturar_txt.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        factura_facturar_txt.setForeground(new java.awt.Color(0, 0, 0));
        factura_facturar_txt.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)), "No.Factura", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 18), new java.awt.Color(0, 0, 0))); // NOI18N
        factura_facturar_txt.setCaretColor(new java.awt.Color(0, 0, 0));

        pedido_facturar_txt.setBackground(new java.awt.Color(255, 255, 255));
        pedido_facturar_txt.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        pedido_facturar_txt.setForeground(new java.awt.Color(0, 0, 0));
        pedido_facturar_txt.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)), "No.Pedido", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 18), new java.awt.Color(0, 0, 0))); // NOI18N
        pedido_facturar_txt.setCaretColor(new java.awt.Color(0, 0, 0));

        total_facturar_txt.setBackground(new java.awt.Color(255, 255, 255));
        total_facturar_txt.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        total_facturar_txt.setForeground(new java.awt.Color(0, 0, 0));
        total_facturar_txt.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)), "Total", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 18), new java.awt.Color(0, 0, 0))); // NOI18N
        total_facturar_txt.setCaretColor(new java.awt.Color(0, 0, 0));

        comprobante_facturar_txt.setBackground(new java.awt.Color(255, 255, 255));
        comprobante_facturar_txt.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        comprobante_facturar_txt.setForeground(new java.awt.Color(0, 0, 0));
        comprobante_facturar_txt.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)), "No.NCF", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 18), new java.awt.Color(0, 0, 0))); // NOI18N
        comprobante_facturar_txt.setCaretColor(new java.awt.Color(0, 0, 0));

        prefijo_comprobante_facturar_txt.setBackground(new java.awt.Color(255, 255, 255));
        prefijo_comprobante_facturar_txt.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        prefijo_comprobante_facturar_txt.setForeground(new java.awt.Color(0, 0, 0));
        prefijo_comprobante_facturar_txt.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)), "Pre-Fijo NCF", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 18), new java.awt.Color(0, 0, 0))); // NOI18N
        prefijo_comprobante_facturar_txt.setCaretColor(new java.awt.Color(0, 0, 0));

        secuencia_comprobante_facturar_txt.setBackground(new java.awt.Color(255, 255, 255));
        secuencia_comprobante_facturar_txt.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        secuencia_comprobante_facturar_txt.setForeground(new java.awt.Color(0, 0, 0));
        secuencia_comprobante_facturar_txt.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)), "Secuencia NCF", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 18), new java.awt.Color(0, 0, 0))); // NOI18N
        secuencia_comprobante_facturar_txt.setCaretColor(new java.awt.Color(0, 0, 0));

        moneda_facturar_box.setBackground(new java.awt.Color(255, 255, 255));
        moneda_facturar_box.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        moneda_facturar_box.setForeground(new java.awt.Color(0, 0, 0));
        moneda_facturar_box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DOP", "USD", " " }));
        moneda_facturar_box.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)), "Moneda", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 18), new java.awt.Color(0, 0, 0))); // NOI18N

        facturar_btn.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        facturar_btn.setForeground(new java.awt.Color(0, 102, 0));
        facturar_btn.setText("Facturar");
        facturar_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        facturar_btn.setContentAreaFilled(false);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(facturar_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(factura_facturar_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pedido_facturar_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(total_facturar_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE))
                            .addComponent(moneda_facturar_box, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(secuencia_comprobante_facturar_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(comprobante_facturar_txt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(prefijo_comprobante_facturar_txt))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel12Layout.createSequentialGroup()
                        .addComponent(gm_lbl4, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(puestos_dptos_titulo2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gm_lbl4)
                    .addComponent(puestos_dptos_titulo2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(factura_facturar_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pedido_facturar_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(total_facturar_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comprobante_facturar_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prefijo_comprobante_facturar_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(secuencia_comprobante_facturar_txt)
                    .addComponent(moneda_facturar_box))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(facturar_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(113, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout facturar_pnlLayout = new javax.swing.GroupLayout(facturar_pnl);
        facturar_pnl.setLayout(facturar_pnlLayout);
        facturar_pnlLayout.setHorizontalGroup(
            facturar_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(facturar_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        facturar_pnlLayout.setVerticalGroup(
            facturar_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(facturar_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        apartados_tbd.addTab("FACTURAR", facturar_pnl);

        rrhh_pnl.setBackground(new java.awt.Color(8, 41, 138));

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setForeground(new java.awt.Color(0, 0, 0));
        jTabbedPane1.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));

        gm_lbl5.setFont(new java.awt.Font("Candara Light", 1, 24)); // NOI18N
        gm_lbl5.setForeground(new java.awt.Color(0, 0, 102));
        gm_lbl5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/logo - 24x24.png"))); // NOI18N
        gm_lbl5.setText("Grupo M");

        puestos_dptos_titulo3.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        puestos_dptos_titulo3.setForeground(new java.awt.Color(0, 0, 0));
        puestos_dptos_titulo3.setText("Recursos Humanos");

        buscar_empleado_txt.setBackground(new java.awt.Color(255, 255, 255));
        buscar_empleado_txt.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        buscar_empleado_txt.setForeground(new java.awt.Color(0, 0, 0));
        buscar_empleado_txt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        buscar_empleado_txt.setCaretColor(new java.awt.Color(0, 0, 0));

        buscar_empleado_box.setBackground(new java.awt.Color(255, 255, 255));
        buscar_empleado_box.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        buscar_empleado_box.setForeground(new java.awt.Color(0, 0, 0));
        buscar_empleado_box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nombre", "Apellido", "Puesto", "Edad", "ID", " " }));
        buscar_empleado_box.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        empleados_tbl.setBackground(new java.awt.Color(255, 255, 255));
        empleados_tbl.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        empleados_tbl.setForeground(new java.awt.Color(0, 0, 0));
        empleados_tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane10.setViewportView(empleados_tbl);

        numero_emp_recursos_txt.setBackground(new java.awt.Color(255, 255, 255));
        numero_emp_recursos_txt.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        numero_emp_recursos_txt.setForeground(new java.awt.Color(0, 0, 0));
        numero_emp_recursos_txt.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)), "No.Empleado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 18), new java.awt.Color(0, 0, 0))); // NOI18N
        numero_emp_recursos_txt.setCaretColor(new java.awt.Color(0, 0, 0));

        nombre_recursos_txt.setBackground(new java.awt.Color(255, 255, 255));
        nombre_recursos_txt.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        nombre_recursos_txt.setForeground(new java.awt.Color(0, 0, 0));
        nombre_recursos_txt.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)), "Nombre", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 18), new java.awt.Color(0, 0, 0))); // NOI18N
        nombre_recursos_txt.setCaretColor(new java.awt.Color(0, 0, 0));

        apellido_recursos_txt.setBackground(new java.awt.Color(255, 255, 255));
        apellido_recursos_txt.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        apellido_recursos_txt.setForeground(new java.awt.Color(0, 0, 0));
        apellido_recursos_txt.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)), "Apellido", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 18), new java.awt.Color(0, 0, 0))); // NOI18N
        apellido_recursos_txt.setCaretColor(new java.awt.Color(0, 0, 0));

        cedula_recursos_txt.setBackground(new java.awt.Color(255, 255, 255));
        cedula_recursos_txt.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        cedula_recursos_txt.setForeground(new java.awt.Color(0, 0, 0));
        cedula_recursos_txt.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)), "Cédula", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 18), new java.awt.Color(0, 0, 0))); // NOI18N
        cedula_recursos_txt.setCaretColor(new java.awt.Color(0, 0, 0));

        sexo_recurso_box.setBackground(new java.awt.Color(255, 255, 255));
        sexo_recurso_box.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        sexo_recurso_box.setForeground(new java.awt.Color(0, 0, 0));
        sexo_recurso_box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "H" }));
        sexo_recurso_box.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)), "Sexo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 18), new java.awt.Color(0, 0, 0))); // NOI18N

        edad_recursos_txt.setBackground(new java.awt.Color(255, 255, 255));
        edad_recursos_txt.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        edad_recursos_txt.setForeground(new java.awt.Color(0, 0, 0));
        edad_recursos_txt.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)), "Edad", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 18), new java.awt.Color(0, 0, 0))); // NOI18N
        edad_recursos_txt.setCaretColor(new java.awt.Color(0, 0, 0));

        nacimiento_recursos_dt.setBackground(new java.awt.Color(255, 255, 255));
        nacimiento_recursos_dt.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)), "Nacimiento", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 18), new java.awt.Color(0, 0, 0))); // NOI18N
        nacimiento_recursos_dt.setForeground(new java.awt.Color(0, 0, 0));
        nacimiento_recursos_dt.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N

        direccion_recursos_txt.setBackground(new java.awt.Color(255, 255, 255));
        direccion_recursos_txt.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        direccion_recursos_txt.setForeground(new java.awt.Color(0, 0, 0));
        direccion_recursos_txt.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)), "Dirección", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 18), new java.awt.Color(0, 0, 0))); // NOI18N
        direccion_recursos_txt.setCaretColor(new java.awt.Color(0, 0, 0));

        estado_civil_recursos_box.setBackground(new java.awt.Color(255, 255, 255));
        estado_civil_recursos_box.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        estado_civil_recursos_box.setForeground(new java.awt.Color(0, 0, 0));
        estado_civil_recursos_box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Soltero", "Casado", "Unión Libre", "Separado", " " }));
        estado_civil_recursos_box.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)), "Estado Civil", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 18), new java.awt.Color(0, 0, 0))); // NOI18N

        grados_recursos_box.setBackground(new java.awt.Color(255, 255, 255));
        grados_recursos_box.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        grados_recursos_box.setForeground(new java.awt.Color(0, 0, 0));
        grados_recursos_box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Primaria", "Secundaria", "Universidad", " " }));
        grados_recursos_box.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)), "Grados Aprobados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 18), new java.awt.Color(0, 0, 0))); // NOI18N

        telefono_recursos_txt.setBackground(new java.awt.Color(255, 255, 255));
        telefono_recursos_txt.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        telefono_recursos_txt.setForeground(new java.awt.Color(0, 0, 0));
        telefono_recursos_txt.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)), "Teléfono", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 18), new java.awt.Color(0, 0, 0))); // NOI18N
        telefono_recursos_txt.setCaretColor(new java.awt.Color(0, 0, 0));

        salario_recursos_txt.setBackground(new java.awt.Color(255, 255, 255));
        salario_recursos_txt.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        salario_recursos_txt.setForeground(new java.awt.Color(0, 0, 0));
        salario_recursos_txt.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)), "Salario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 18), new java.awt.Color(0, 0, 0))); // NOI18N
        salario_recursos_txt.setCaretColor(new java.awt.Color(0, 0, 0));

        puesto_recursos_box.setBackground(new java.awt.Color(255, 255, 255));
        puesto_recursos_box.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        puesto_recursos_box.setForeground(new java.awt.Color(0, 0, 0));
        puesto_recursos_box.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)), "Puesto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 18), new java.awt.Color(0, 0, 0))); // NOI18N

        editar_empleado_btn.setBackground(new java.awt.Color(255, 255, 255));
        editar_empleado_btn.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        editar_empleado_btn.setForeground(new java.awt.Color(0, 102, 0));
        editar_empleado_btn.setText("Editar Empleado");
        editar_empleado_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        borrar_empleado_btn.setBackground(new java.awt.Color(255, 255, 255));
        borrar_empleado_btn.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        borrar_empleado_btn.setForeground(new java.awt.Color(102, 0, 0));
        borrar_empleado_btn.setText("Borrar Empleado");
        borrar_empleado_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane10)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(buscar_empleado_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buscar_empleado_box, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(gm_lbl5, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(puestos_dptos_titulo3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addComponent(grados_recursos_box, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(telefono_recursos_txt))
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addComponent(edad_recursos_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nacimiento_recursos_dt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel13Layout.createSequentialGroup()
                                .addComponent(numero_emp_recursos_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nombre_recursos_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addComponent(apellido_recursos_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cedula_recursos_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sexo_recurso_box, 0, 90, Short.MAX_VALUE))
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addComponent(direccion_recursos_txt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(estado_civil_recursos_box, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addComponent(salario_recursos_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(puesto_recursos_box, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addComponent(editar_empleado_btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(borrar_empleado_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel13Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {apellido_recursos_txt, nombre_recursos_txt});

        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gm_lbl5)
                    .addComponent(puestos_dptos_titulo3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(buscar_empleado_box, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                            .addComponent(buscar_empleado_txt))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(numero_emp_recursos_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(apellido_recursos_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cedula_recursos_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sexo_recurso_box, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombre_recursos_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(edad_recursos_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                            .addComponent(nacimiento_recursos_dt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(direccion_recursos_txt)))
                    .addComponent(estado_civil_recursos_box, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(grados_recursos_box, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(telefono_recursos_txt)
                        .addComponent(salario_recursos_txt)
                        .addComponent(puesto_recursos_box, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editar_empleado_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(borrar_empleado_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Editar", jPanel13);

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextField23.setBackground(new java.awt.Color(255, 255, 255));
        jTextField23.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jTextField23.setForeground(new java.awt.Color(0, 0, 0));
        jTextField23.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)), "Nombre", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 18), new java.awt.Color(0, 0, 0))); // NOI18N
        jTextField23.setCaretColor(new java.awt.Color(0, 0, 0));

        jTextField24.setBackground(new java.awt.Color(255, 255, 255));
        jTextField24.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jTextField24.setForeground(new java.awt.Color(0, 0, 0));
        jTextField24.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)), "Apellido", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 18), new java.awt.Color(0, 0, 0))); // NOI18N
        jTextField24.setCaretColor(new java.awt.Color(0, 0, 0));

        jTextField25.setBackground(new java.awt.Color(255, 255, 255));
        jTextField25.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jTextField25.setForeground(new java.awt.Color(0, 0, 0));
        jTextField25.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)), "Cédula", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 18), new java.awt.Color(0, 0, 0))); // NOI18N
        jTextField25.setCaretColor(new java.awt.Color(0, 0, 0));

        jComboBox12.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox12.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jComboBox12.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox12.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "H" }));
        jComboBox12.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)), "Sexo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 18), new java.awt.Color(0, 0, 0))); // NOI18N

        jTextField16.setBackground(new java.awt.Color(255, 255, 255));
        jTextField16.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jTextField16.setForeground(new java.awt.Color(0, 0, 0));
        jTextField16.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)), "Edad", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 18), new java.awt.Color(0, 0, 0))); // NOI18N
        jTextField16.setCaretColor(new java.awt.Color(0, 0, 0));

        jDateChooser2.setBackground(new java.awt.Color(255, 255, 255));
        jDateChooser2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)), "Nacimiento", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 18), new java.awt.Color(0, 0, 0))); // NOI18N
        jDateChooser2.setForeground(new java.awt.Color(0, 0, 0));
        jDateChooser2.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N

        jTextField17.setBackground(new java.awt.Color(255, 255, 255));
        jTextField17.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jTextField17.setForeground(new java.awt.Color(0, 0, 0));
        jTextField17.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)), "Dirección", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 18), new java.awt.Color(0, 0, 0))); // NOI18N
        jTextField17.setCaretColor(new java.awt.Color(0, 0, 0));

        jComboBox8.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox8.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jComboBox8.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Soltero", "Casado", "Unión Libre", "Separado", " " }));
        jComboBox8.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)), "Estado Civil", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 18), new java.awt.Color(0, 0, 0))); // NOI18N

        jComboBox9.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox9.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jComboBox9.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Primaria", "Secundaria", "Universidad", " " }));
        jComboBox9.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)), "Grados Aprobados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 18), new java.awt.Color(0, 0, 0))); // NOI18N

        jTextField18.setBackground(new java.awt.Color(255, 255, 255));
        jTextField18.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jTextField18.setForeground(new java.awt.Color(0, 0, 0));
        jTextField18.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)), "Teléfono", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 18), new java.awt.Color(0, 0, 0))); // NOI18N
        jTextField18.setCaretColor(new java.awt.Color(0, 0, 0));

        jTextField19.setBackground(new java.awt.Color(255, 255, 255));
        jTextField19.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jTextField19.setForeground(new java.awt.Color(0, 0, 0));
        jTextField19.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)), "Salario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 18), new java.awt.Color(0, 0, 0))); // NOI18N
        jTextField19.setCaretColor(new java.awt.Color(0, 0, 0));

        jComboBox10.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox10.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jComboBox10.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox10.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)), "Puesto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 18), new java.awt.Color(0, 0, 0))); // NOI18N

        edmcti_btn2.setBackground(new java.awt.Color(255, 255, 255));
        edmcti_btn2.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        edmcti_btn2.setForeground(new java.awt.Color(0, 102, 0));
        edmcti_btn2.setText("Agregar Empleado");
        edmcti_btn2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox12, 0, 137, Short.MAX_VALUE))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateChooser2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jComboBox9, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox10, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(edmcti_btn2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox12, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jTextField16)
                    .addComponent(jTextField17, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                    .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jDateChooser2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBox9, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField18)
                        .addComponent(jTextField19)
                        .addComponent(jComboBox10, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edmcti_btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        otp.setBackground(new java.awt.Color(255, 255, 255));
        otp.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        otp.setForeground(new java.awt.Color(0, 0, 0));
        otp.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        otp.setBorder(null);

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(otp)
                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(otp, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(311, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Agregar", jPanel14);

        javax.swing.GroupLayout rrhh_pnlLayout = new javax.swing.GroupLayout(rrhh_pnl);
        rrhh_pnl.setLayout(rrhh_pnlLayout);
        rrhh_pnlLayout.setHorizontalGroup(
            rrhh_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rrhh_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        rrhh_pnlLayout.setVerticalGroup(
            rrhh_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rrhh_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        apartados_tbd.addTab("RRHH", rrhh_pnl);

        gastos_pnl.setBackground(new java.awt.Color(8, 41, 138));

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));

        gm_lbl6.setFont(new java.awt.Font("Candara Light", 1, 24)); // NOI18N
        gm_lbl6.setForeground(new java.awt.Color(0, 0, 102));
        gm_lbl6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/logo - 24x24.png"))); // NOI18N
        gm_lbl6.setText("Grupo M");

        puestos_dptos_titulo4.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        puestos_dptos_titulo4.setForeground(new java.awt.Color(0, 0, 0));
        puestos_dptos_titulo4.setText("Control de los gastos");

        control_gastos_pnl.setBackground(new java.awt.Color(255, 255, 255));
        control_gastos_pnl.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Control de gastos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N

        gastos_tbl.setBackground(new java.awt.Color(255, 255, 255));
        gastos_tbl.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        gastos_tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane11.setViewportView(gastos_tbl);

        fecha1_gastos_dt.setBackground(new java.awt.Color(255, 255, 255));
        fecha1_gastos_dt.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Fecha 1", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        fecha1_gastos_dt.setForeground(new java.awt.Color(0, 0, 0));
        fecha1_gastos_dt.setDateFormatString("yyyy/MM/dd");
        fecha1_gastos_dt.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N

        buscar_gastos_btn.setBackground(new java.awt.Color(255, 255, 255));
        buscar_gastos_btn.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        buscar_gastos_btn.setForeground(new java.awt.Color(0, 0, 0));
        buscar_gastos_btn.setText("Buscar");
        buscar_gastos_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        fecha2_gastos_dt.setBackground(new java.awt.Color(255, 255, 255));
        fecha2_gastos_dt.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Fecha 2", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        fecha2_gastos_dt.setForeground(new java.awt.Color(0, 0, 0));
        fecha2_gastos_dt.setDateFormatString("yyyy/MM/dd");
        fecha2_gastos_dt.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N

        id_gastos_ed_txt.setBackground(new java.awt.Color(255, 255, 255));
        id_gastos_ed_txt.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        id_gastos_ed_txt.setForeground(new java.awt.Color(0, 0, 0));
        id_gastos_ed_txt.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Id", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N

        borrar_gastos_btn.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        borrar_gastos_btn.setForeground(new java.awt.Color(102, 0, 0));
        borrar_gastos_btn.setText("Borrar");
        borrar_gastos_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        borrar_gastos_btn.setContentAreaFilled(false);

        editar_gastos_btn.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        editar_gastos_btn.setForeground(new java.awt.Color(0, 102, 0));
        editar_gastos_btn.setText("Editar");
        editar_gastos_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        editar_gastos_btn.setContentAreaFilled(false);

        proveedor_gastos_ed_txt.setBackground(new java.awt.Color(255, 255, 255));
        proveedor_gastos_ed_txt.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        proveedor_gastos_ed_txt.setForeground(new java.awt.Color(0, 0, 0));
        proveedor_gastos_ed_txt.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Proveedor", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N

        fecha_gastos_ed_dt.setBackground(new java.awt.Color(255, 255, 255));
        fecha_gastos_ed_dt.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Fecha", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        fecha_gastos_ed_dt.setForeground(new java.awt.Color(0, 0, 0));
        fecha_gastos_ed_dt.setDateFormatString("yyyy/MM/dd");
        fecha_gastos_ed_dt.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N

        descripcion_gastos_ed_txt.setBackground(new java.awt.Color(255, 255, 255));
        descripcion_gastos_ed_txt.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        descripcion_gastos_ed_txt.setForeground(new java.awt.Color(0, 0, 0));
        descripcion_gastos_ed_txt.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Descripción", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N

        total_gastos_ed_txt.setBackground(new java.awt.Color(255, 255, 255));
        total_gastos_ed_txt.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        total_gastos_ed_txt.setForeground(new java.awt.Color(0, 0, 0));
        total_gastos_ed_txt.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Total", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N

        javax.swing.GroupLayout control_gastos_pnlLayout = new javax.swing.GroupLayout(control_gastos_pnl);
        control_gastos_pnl.setLayout(control_gastos_pnlLayout);
        control_gastos_pnlLayout.setHorizontalGroup(
            control_gastos_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(control_gastos_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(control_gastos_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 876, Short.MAX_VALUE)
                    .addGroup(control_gastos_pnlLayout.createSequentialGroup()
                        .addComponent(fecha1_gastos_dt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fecha2_gastos_dt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buscar_gastos_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(control_gastos_pnlLayout.createSequentialGroup()
                        .addComponent(id_gastos_ed_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(proveedor_gastos_ed_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fecha_gastos_ed_dt, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(descripcion_gastos_ed_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(total_gastos_ed_txt))
                    .addComponent(editar_gastos_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 876, Short.MAX_VALUE)
                    .addComponent(borrar_gastos_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        control_gastos_pnlLayout.setVerticalGroup(
            control_gastos_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(control_gastos_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(control_gastos_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(control_gastos_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(fecha1_gastos_dt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(fecha2_gastos_dt, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(buscar_gastos_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(control_gastos_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(control_gastos_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(id_gastos_ed_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(proveedor_gastos_ed_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(descripcion_gastos_ed_txt)
                    .addComponent(total_gastos_ed_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                    .addComponent(fecha_gastos_ed_dt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(21, 21, 21)
                .addComponent(editar_gastos_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(borrar_gastos_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        agregar_gastos_pnl.setBackground(new java.awt.Color(255, 255, 255));
        agregar_gastos_pnl.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Agregar gastos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N

        proveedor_gastos_ag_txt.setBackground(new java.awt.Color(255, 255, 255));
        proveedor_gastos_ag_txt.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        proveedor_gastos_ag_txt.setForeground(new java.awt.Color(0, 0, 0));
        proveedor_gastos_ag_txt.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Proveedor", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N

        jDateChooser6.setBackground(new java.awt.Color(255, 255, 255));
        jDateChooser6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Fecha", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        jDateChooser6.setForeground(new java.awt.Color(0, 0, 0));
        jDateChooser6.setDateFormatString("yyyy/MM/dd");
        jDateChooser6.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N

        desc_gastos_ag_txt.setBackground(new java.awt.Color(255, 255, 255));
        desc_gastos_ag_txt.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        desc_gastos_ag_txt.setForeground(new java.awt.Color(0, 0, 0));
        desc_gastos_ag_txt.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Descripción", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N

        total_gasto_ag_txt.setBackground(new java.awt.Color(255, 255, 255));
        total_gasto_ag_txt.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        total_gasto_ag_txt.setForeground(new java.awt.Color(0, 0, 0));
        total_gasto_ag_txt.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Total", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N

        agregar_gasto_txt.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        agregar_gasto_txt.setForeground(new java.awt.Color(0, 102, 0));
        agregar_gasto_txt.setText("Agregar");
        agregar_gasto_txt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        agregar_gasto_txt.setContentAreaFilled(false);

        javax.swing.GroupLayout agregar_gastos_pnlLayout = new javax.swing.GroupLayout(agregar_gastos_pnl);
        agregar_gastos_pnl.setLayout(agregar_gastos_pnlLayout);
        agregar_gastos_pnlLayout.setHorizontalGroup(
            agregar_gastos_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(agregar_gastos_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(agregar_gastos_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(agregar_gastos_pnlLayout.createSequentialGroup()
                        .addComponent(proveedor_gastos_ag_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateChooser6, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(desc_gastos_ag_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(total_gasto_ag_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE))
                    .addComponent(agregar_gasto_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 876, Short.MAX_VALUE))
                .addContainerGap())
        );
        agregar_gastos_pnlLayout.setVerticalGroup(
            agregar_gastos_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(agregar_gastos_pnlLayout.createSequentialGroup()
                .addGroup(agregar_gastos_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(agregar_gastos_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(desc_gastos_ag_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                        .addComponent(total_gasto_ag_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE))
                    .addGroup(agregar_gastos_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jDateChooser6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(proveedor_gastos_ag_txt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)))
                .addGap(19, 19, 19)
                .addComponent(agregar_gasto_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(control_gastos_pnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(gm_lbl6, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(puestos_dptos_titulo4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(agregar_gastos_pnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gm_lbl6)
                    .addComponent(puestos_dptos_titulo4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(control_gastos_pnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(agregar_gastos_pnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout gastos_pnlLayout = new javax.swing.GroupLayout(gastos_pnl);
        gastos_pnl.setLayout(gastos_pnlLayout);
        gastos_pnlLayout.setHorizontalGroup(
            gastos_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gastos_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        gastos_pnlLayout.setVerticalGroup(
            gastos_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gastos_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        apartados_tbd.addTab("GASTOS", gastos_pnl);

        jPanel7.setBackground(new java.awt.Color(8, 41, 138));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        gm_lbl7.setFont(new java.awt.Font("Candara Light", 1, 24)); // NOI18N
        gm_lbl7.setForeground(new java.awt.Color(0, 0, 102));
        gm_lbl7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/logo - 24x24.png"))); // NOI18N
        gm_lbl7.setText("Grupo M");

        puestos_dptos_titulo5.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        puestos_dptos_titulo5.setForeground(new java.awt.Color(0, 0, 0));
        puestos_dptos_titulo5.setText("Facturas");

        jTable4.setBackground(new java.awt.Color(255, 255, 255));
        jTable4.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane12.setViewportView(jTable4);

        buscar_factura_btn.setBackground(new java.awt.Color(255, 255, 255));
        buscar_factura_btn.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        buscar_factura_btn.setForeground(new java.awt.Color(0, 0, 0));
        buscar_factura_btn.setText("Buscar");
        buscar_factura_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        codigo_factura_txt.setBackground(new java.awt.Color(255, 255, 255));
        codigo_factura_txt.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        codigo_factura_txt.setForeground(new java.awt.Color(0, 0, 0));
        codigo_factura_txt.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Código de factura", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N

        mostrar_factura_btn.setBackground(new java.awt.Color(255, 255, 255));
        mostrar_factura_btn.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        mostrar_factura_btn.setForeground(new java.awt.Color(0, 0, 0));
        mostrar_factura_btn.setText("Mostrar");
        mostrar_factura_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        buscar_factura_box.setBackground(new java.awt.Color(255, 255, 255));
        buscar_factura_box.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        buscar_factura_box.setForeground(new java.awt.Color(0, 0, 0));
        buscar_factura_box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cliente", "Fecha", "Código", " ", " " }));
        buscar_factura_box.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        buscar_factura_txt.setBackground(new java.awt.Color(255, 255, 255));
        buscar_factura_txt.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        buscar_factura_txt.setForeground(new java.awt.Color(0, 0, 0));
        buscar_factura_txt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane12, javax.swing.GroupLayout.DEFAULT_SIZE, 910, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(buscar_factura_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buscar_factura_box, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buscar_factura_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(gm_lbl7, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(puestos_dptos_titulo5)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(codigo_factura_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 628, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mostrar_factura_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gm_lbl7)
                    .addComponent(puestos_dptos_titulo5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buscar_factura_box)
                    .addComponent(buscar_factura_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(buscar_factura_txt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codigo_factura_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mostrar_factura_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(334, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        apartados_tbd.addTab("FACTURAS", jPanel7);

        jPanel2.setBackground(new java.awt.Color(8, 41, 138));

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));

        gm_lbl8.setFont(new java.awt.Font("Candara Light", 1, 24)); // NOI18N
        gm_lbl8.setForeground(new java.awt.Color(0, 0, 102));
        gm_lbl8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/logo - 24x24.png"))); // NOI18N
        gm_lbl8.setText("Grupo M");

        puestos_dptos_titulo6.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        puestos_dptos_titulo6.setForeground(new java.awt.Color(0, 0, 0));
        puestos_dptos_titulo6.setText("Control de los clientes");

        buscar_cliente_txt.setBackground(new java.awt.Color(255, 255, 255));
        buscar_cliente_txt.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        buscar_cliente_txt.setForeground(new java.awt.Color(0, 0, 0));
        buscar_cliente_txt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        clientes_tbl.setBackground(new java.awt.Color(255, 255, 255));
        clientes_tbl.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        clientes_tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane13.setViewportView(clientes_tbl);

        buscar_cliente_box.setBackground(new java.awt.Color(255, 255, 255));
        buscar_cliente_box.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        buscar_cliente_box.setForeground(new java.awt.Color(0, 0, 0));
        buscar_cliente_box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nombre", "Representante", "RNC", "ID" }));
        buscar_cliente_box.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        buscar_cliente_btn.setBackground(new java.awt.Color(255, 255, 255));
        buscar_cliente_btn.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        buscar_cliente_btn.setForeground(new java.awt.Color(0, 0, 0));
        buscar_cliente_btn.setText("Buscar");
        buscar_cliente_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        control_clientes_pnl.setBackground(new java.awt.Color(255, 255, 255));
        control_clientes_pnl.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Control", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N

        id_cliente_txt.setBackground(new java.awt.Color(255, 255, 255));
        id_cliente_txt.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        id_cliente_txt.setForeground(new java.awt.Color(0, 0, 0));
        id_cliente_txt.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Id", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N

        rnc_cliente_txt.setBackground(new java.awt.Color(255, 255, 255));
        rnc_cliente_txt.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        rnc_cliente_txt.setForeground(new java.awt.Color(0, 0, 0));
        rnc_cliente_txt.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "RNC", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N

        regmer_cliente_txt.setBackground(new java.awt.Color(255, 255, 255));
        regmer_cliente_txt.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        regmer_cliente_txt.setForeground(new java.awt.Color(0, 0, 0));
        regmer_cliente_txt.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registro mercantil", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N

        nombre_cliente_txt.setBackground(new java.awt.Color(255, 255, 255));
        nombre_cliente_txt.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        nombre_cliente_txt.setForeground(new java.awt.Color(0, 0, 0));
        nombre_cliente_txt.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nombre", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N

        edad_cliente_txt.setBackground(new java.awt.Color(255, 255, 255));
        edad_cliente_txt.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        edad_cliente_txt.setForeground(new java.awt.Color(0, 0, 0));
        edad_cliente_txt.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Edad", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N

        telefono_cliente_txt.setBackground(new java.awt.Color(255, 255, 255));
        telefono_cliente_txt.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        telefono_cliente_txt.setForeground(new java.awt.Color(0, 0, 0));
        telefono_cliente_txt.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Teléfono", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N

        referencias_bancarias_cliente_txt.setBackground(new java.awt.Color(255, 255, 255));
        referencias_bancarias_cliente_txt.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        referencias_bancarias_cliente_txt.setForeground(new java.awt.Color(0, 0, 0));
        referencias_bancarias_cliente_txt.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Referencias bancarias", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N

        representante_cliente_txt.setBackground(new java.awt.Color(255, 255, 255));
        representante_cliente_txt.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        representante_cliente_txt.setForeground(new java.awt.Color(0, 0, 0));
        representante_cliente_txt.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Representante", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N

        referencias_credito_cliente_txt.setBackground(new java.awt.Color(255, 255, 255));
        referencias_credito_cliente_txt.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        referencias_credito_cliente_txt.setForeground(new java.awt.Color(0, 0, 0));
        referencias_credito_cliente_txt.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Referencias de crédito", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N

        agregar_cliente_btn.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        agregar_cliente_btn.setForeground(new java.awt.Color(0, 102, 0));
        agregar_cliente_btn.setText("Agregar cliente");
        agregar_cliente_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        agregar_cliente_btn.setContentAreaFilled(false);

        borrar_cliente_btn.setBackground(new java.awt.Color(102, 0, 0));
        borrar_cliente_btn.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        borrar_cliente_btn.setForeground(new java.awt.Color(102, 0, 0));
        borrar_cliente_btn.setText("Borrar");
        borrar_cliente_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        borrar_cliente_btn.setContentAreaFilled(false);
        borrar_cliente_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrar_cliente_btnActionPerformed(evt);
            }
        });

        editar_cliente_btn.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        editar_cliente_btn.setForeground(new java.awt.Color(153, 153, 0));
        editar_cliente_btn.setText("Editar");
        editar_cliente_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        editar_cliente_btn.setContentAreaFilled(false);

        javax.swing.GroupLayout control_clientes_pnlLayout = new javax.swing.GroupLayout(control_clientes_pnl);
        control_clientes_pnl.setLayout(control_clientes_pnlLayout);
        control_clientes_pnlLayout.setHorizontalGroup(
            control_clientes_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(control_clientes_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(control_clientes_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(agregar_cliente_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(control_clientes_pnlLayout.createSequentialGroup()
                        .addGroup(control_clientes_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(control_clientes_pnlLayout.createSequentialGroup()
                                .addGroup(control_clientes_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(edad_cliente_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                                    .addComponent(id_cliente_txt))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(control_clientes_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(rnc_cliente_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                                    .addComponent(telefono_cliente_txt)))
                            .addComponent(representante_cliente_txt))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(control_clientes_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(control_clientes_pnlLayout.createSequentialGroup()
                                .addComponent(regmer_cliente_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nombre_cliente_txt))
                            .addComponent(referencias_bancarias_cliente_txt)
                            .addComponent(referencias_credito_cliente_txt)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, control_clientes_pnlLayout.createSequentialGroup()
                        .addComponent(editar_cliente_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(borrar_cliente_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        control_clientes_pnlLayout.setVerticalGroup(
            control_clientes_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(control_clientes_pnlLayout.createSequentialGroup()
                .addGroup(control_clientes_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id_cliente_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rnc_cliente_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(regmer_cliente_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombre_cliente_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(control_clientes_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edad_cliente_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telefono_cliente_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(referencias_bancarias_cliente_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(control_clientes_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(representante_cliente_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(referencias_credito_cliente_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(agregar_cliente_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(control_clientes_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editar_cliente_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(borrar_cliente_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        seleccion_operacion_box.setBackground(new java.awt.Color(255, 255, 255));
        seleccion_operacion_box.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        seleccion_operacion_box.setForeground(new java.awt.Color(0, 102, 0));
        seleccion_operacion_box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Agregar cliente", "Editar o borrar cliente" }));
        seleccion_operacion_box.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(control_clientes_pnl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane13)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(buscar_cliente_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buscar_cliente_box, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buscar_cliente_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(gm_lbl8, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(puestos_dptos_titulo6)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(seleccion_operacion_box, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gm_lbl8)
                    .addComponent(puestos_dptos_titulo6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buscar_cliente_box)
                    .addComponent(buscar_cliente_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buscar_cliente_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(seleccion_operacion_box, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(control_clientes_pnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        apartados_tbd.addTab("CLIENTES", jPanel2);

        jPanel3.setBackground(new java.awt.Color(8, 41, 138));

        jPanel20.setBackground(new java.awt.Color(255, 255, 255));

        gm_lbl9.setFont(new java.awt.Font("Candara Light", 1, 24)); // NOI18N
        gm_lbl9.setForeground(new java.awt.Color(0, 0, 102));
        gm_lbl9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/logo - 24x24.png"))); // NOI18N
        gm_lbl9.setText("Grupo M");

        puestos_dptos_titulo7.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        puestos_dptos_titulo7.setForeground(new java.awt.Color(0, 0, 0));
        puestos_dptos_titulo7.setText("Control de proveedores");

        prov_tbl.setBackground(new java.awt.Color(255, 255, 255));
        prov_tbl.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        prov_tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane14.setViewportView(prov_tbl);

        buscar_prov_txt.setBackground(new java.awt.Color(255, 255, 255));
        buscar_prov_txt.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        buscar_prov_txt.setForeground(new java.awt.Color(0, 0, 0));
        buscar_prov_txt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        buscar_prov_box.setBackground(new java.awt.Color(255, 255, 255));
        buscar_prov_box.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        buscar_prov_box.setForeground(new java.awt.Color(0, 0, 0));
        buscar_prov_box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nombre", "Servicio", "RNC", "ID" }));
        buscar_prov_box.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        buscar_prov_btn.setBackground(new java.awt.Color(255, 255, 255));
        buscar_prov_btn.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        buscar_prov_btn.setForeground(new java.awt.Color(0, 0, 0));
        buscar_prov_btn.setText("Buscar");
        buscar_prov_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        accioon_prov_box.setBackground(new java.awt.Color(255, 255, 255));
        accioon_prov_box.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        accioon_prov_box.setForeground(new java.awt.Color(0, 102, 0));
        accioon_prov_box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Agregar proveedor", "Editar o borrar proveedor", " " }));
        accioon_prov_box.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel21.setBackground(new java.awt.Color(255, 255, 255));
        jPanel21.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Control", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N

        jTextField43.setBackground(new java.awt.Color(255, 255, 255));
        jTextField43.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jTextField43.setForeground(new java.awt.Color(0, 0, 0));
        jTextField43.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Id", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N

        jTextField44.setBackground(new java.awt.Color(255, 255, 255));
        jTextField44.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jTextField44.setForeground(new java.awt.Color(0, 0, 0));
        jTextField44.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "RNC", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N

        jTextField45.setBackground(new java.awt.Color(255, 255, 255));
        jTextField45.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jTextField45.setForeground(new java.awt.Color(0, 0, 0));
        jTextField45.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registro mercantil", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N

        jTextField46.setBackground(new java.awt.Color(255, 255, 255));
        jTextField46.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jTextField46.setForeground(new java.awt.Color(0, 0, 0));
        jTextField46.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nombre", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N

        jTextField47.setBackground(new java.awt.Color(255, 255, 255));
        jTextField47.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jTextField47.setForeground(new java.awt.Color(0, 0, 0));
        jTextField47.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Edad", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N

        jTextField48.setBackground(new java.awt.Color(255, 255, 255));
        jTextField48.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jTextField48.setForeground(new java.awt.Color(0, 0, 0));
        jTextField48.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Teléfono", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N

        jTextField49.setBackground(new java.awt.Color(255, 255, 255));
        jTextField49.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jTextField49.setForeground(new java.awt.Color(0, 0, 0));
        jTextField49.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Teléfono de ventas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N

        jTextField50.setBackground(new java.awt.Color(255, 255, 255));
        jTextField50.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jTextField50.setForeground(new java.awt.Color(0, 0, 0));
        jTextField50.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Servicio", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N

        jTextField51.setBackground(new java.awt.Color(255, 255, 255));
        jTextField51.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jTextField51.setForeground(new java.awt.Color(0, 0, 0));
        jTextField51.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Teléfono cuentas por cobrar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N

        jButton12.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jButton12.setForeground(new java.awt.Color(0, 102, 0));
        jButton12.setText("Agregar proveedor");
        jButton12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton12.setContentAreaFilled(false);

        jButton13.setBackground(new java.awt.Color(102, 0, 0));
        jButton13.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jButton13.setForeground(new java.awt.Color(102, 0, 0));
        jButton13.setText("Borrar");
        jButton13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton13.setContentAreaFilled(false);
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jButton14.setForeground(new java.awt.Color(153, 153, 0));
        jButton14.setText("Editar");
        jButton14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton14.setContentAreaFilled(false);

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel21Layout.createSequentialGroup()
                                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField47, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                                    .addComponent(jTextField43))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField44, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                                    .addComponent(jTextField48)))
                            .addComponent(jTextField50))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel21Layout.createSequentialGroup()
                                .addComponent(jTextField45, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField46))
                            .addComponent(jTextField49)
                            .addComponent(jTextField51)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                        .addComponent(jButton14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(gm_lbl9, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(puestos_dptos_titulo7)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane14)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(buscar_prov_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buscar_prov_box, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buscar_prov_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE))
                    .addComponent(jPanel21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(accioon_prov_box, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gm_lbl9)
                    .addComponent(puestos_dptos_titulo7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buscar_prov_box)
                    .addComponent(buscar_prov_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buscar_prov_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(accioon_prov_box, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        apartados_tbd.addTab("PROVEEDORES", jPanel3);

        jPanel9.setBackground(new java.awt.Color(8, 41, 138));

        jPanel22.setBackground(new java.awt.Color(255, 255, 255));

        gm_lbl10.setFont(new java.awt.Font("Candara Light", 1, 24)); // NOI18N
        gm_lbl10.setForeground(new java.awt.Color(0, 0, 102));
        gm_lbl10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/logo - 24x24.png"))); // NOI18N
        gm_lbl10.setText("Grupo M");

        puestos_dptos_titulo8.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        puestos_dptos_titulo8.setForeground(new java.awt.Color(0, 0, 0));
        puestos_dptos_titulo8.setText("Control de pedidos");

        jTextField52.setBackground(new java.awt.Color(255, 255, 255));
        jTextField52.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jTextField52.setForeground(new java.awt.Color(0, 0, 0));
        jTextField52.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jComboBox16.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox16.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jComboBox16.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox16.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cliente", "Vencimiento" }));
        jComboBox16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton15.setBackground(new java.awt.Color(255, 255, 255));
        jButton15.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jButton15.setForeground(new java.awt.Color(0, 0, 0));
        jButton15.setText("Buscar");
        jButton15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTable7.setBackground(new java.awt.Color(255, 255, 255));
        jTable7.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        jTable7.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane15.setViewportView(jTable7);

        jComboBox17.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox17.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jComboBox17.setForeground(new java.awt.Color(0, 102, 0));
        jComboBox17.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Agregar pedido", "Editar o borrar pedido" }));
        jComboBox17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel23.setBackground(new java.awt.Color(255, 255, 255));
        jPanel23.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Control", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N

        jTextField53.setBackground(new java.awt.Color(255, 255, 255));
        jTextField53.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jTextField53.setForeground(new java.awt.Color(0, 0, 0));
        jTextField53.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Id", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N

        jTextField54.setBackground(new java.awt.Color(255, 255, 255));
        jTextField54.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jTextField54.setForeground(new java.awt.Color(0, 0, 0));
        jTextField54.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "RNC", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N

        jTextField55.setBackground(new java.awt.Color(255, 255, 255));
        jTextField55.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jTextField55.setForeground(new java.awt.Color(0, 0, 0));
        jTextField55.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registro mercantil", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N

        jTextField56.setBackground(new java.awt.Color(255, 255, 255));
        jTextField56.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jTextField56.setForeground(new java.awt.Color(0, 0, 0));
        jTextField56.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nombre", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N

        jTextField57.setBackground(new java.awt.Color(255, 255, 255));
        jTextField57.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jTextField57.setForeground(new java.awt.Color(0, 0, 0));
        jTextField57.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Edad", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N

        jTextField58.setBackground(new java.awt.Color(255, 255, 255));
        jTextField58.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jTextField58.setForeground(new java.awt.Color(0, 0, 0));
        jTextField58.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Teléfono", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N

        jTextField59.setBackground(new java.awt.Color(255, 255, 255));
        jTextField59.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jTextField59.setForeground(new java.awt.Color(0, 0, 0));
        jTextField59.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Teléfono de ventas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N

        jTextField60.setBackground(new java.awt.Color(255, 255, 255));
        jTextField60.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jTextField60.setForeground(new java.awt.Color(0, 0, 0));
        jTextField60.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Servicio", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N

        jTextField61.setBackground(new java.awt.Color(255, 255, 255));
        jTextField61.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jTextField61.setForeground(new java.awt.Color(0, 0, 0));
        jTextField61.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Teléfono cuentas por cobrar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N

        jButton16.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jButton16.setForeground(new java.awt.Color(0, 102, 0));
        jButton16.setText("Agregar proveedor");
        jButton16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton16.setContentAreaFilled(false);

        jButton17.setBackground(new java.awt.Color(102, 0, 0));
        jButton17.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jButton17.setForeground(new java.awt.Color(102, 0, 0));
        jButton17.setText("Borrar");
        jButton17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton17.setContentAreaFilled(false);
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jButton18.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jButton18.setForeground(new java.awt.Color(153, 153, 0));
        jButton18.setText("Editar");
        jButton18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton18.setContentAreaFilled(false);

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel23Layout.createSequentialGroup()
                                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField57, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                                    .addComponent(jTextField53))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField54, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                                    .addComponent(jTextField58)))
                            .addComponent(jTextField60))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel23Layout.createSequentialGroup()
                                .addComponent(jTextField55, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField56))
                            .addComponent(jTextField59)
                            .addComponent(jTextField61)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                        .addComponent(jButton18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField53, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField54, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField55, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField56, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField57, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField58, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField59, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField60, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField61, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(gm_lbl10, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(puestos_dptos_titulo8)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane15)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(jTextField52, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox16, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton15, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE))
                    .addComponent(jPanel23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox17, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gm_lbl10)
                    .addComponent(puestos_dptos_titulo8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBox16)
                    .addComponent(jButton15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField52, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox17, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        apartados_tbd.addTab("PEDIDOS", jPanel9);

        jPanel10.setBackground(new java.awt.Color(8, 41, 138));

        jPanel24.setBackground(new java.awt.Color(255, 255, 255));

        gm_lbl11.setFont(new java.awt.Font("Candara Light", 1, 24)); // NOI18N
        gm_lbl11.setForeground(new java.awt.Color(0, 0, 102));
        gm_lbl11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/logo - 24x24.png"))); // NOI18N
        gm_lbl11.setText("Grupo M");

        puestos_dptos_titulo9.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        puestos_dptos_titulo9.setForeground(new java.awt.Color(0, 0, 0));
        puestos_dptos_titulo9.setText("Cuentas por pagar");

        jTextField62.setBackground(new java.awt.Color(255, 255, 255));
        jTextField62.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jTextField62.setForeground(new java.awt.Color(0, 0, 0));
        jTextField62.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jComboBox18.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox18.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jComboBox18.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox18.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Proveedor", "Servicio", "Factura", "Pagas" }));
        jComboBox18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton19.setBackground(new java.awt.Color(255, 255, 255));
        jButton19.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jButton19.setForeground(new java.awt.Color(0, 0, 0));
        jButton19.setText("Buscar");
        jButton19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTable8.setBackground(new java.awt.Color(255, 255, 255));
        jTable8.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        jTable8.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane16.setViewportView(jTable8);

        jComboBox19.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox19.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jComboBox19.setForeground(new java.awt.Color(0, 102, 0));
        jComboBox19.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Agregar cuenta por pagar", "Editar cuenta pendiente", " ", " ", " " }));
        jComboBox19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel25.setBackground(new java.awt.Color(255, 255, 255));
        jPanel25.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Control", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N

        jTextField63.setBackground(new java.awt.Color(255, 255, 255));
        jTextField63.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jTextField63.setForeground(new java.awt.Color(0, 0, 0));
        jTextField63.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Id", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N

        jTextField64.setBackground(new java.awt.Color(255, 255, 255));
        jTextField64.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jTextField64.setForeground(new java.awt.Color(0, 0, 0));
        jTextField64.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Proveedor", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N

        jTextField65.setBackground(new java.awt.Color(255, 255, 255));
        jTextField65.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jTextField65.setForeground(new java.awt.Color(0, 0, 0));
        jTextField65.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Factura", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N

        jTextField66.setBackground(new java.awt.Color(255, 255, 255));
        jTextField66.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jTextField66.setForeground(new java.awt.Color(0, 0, 0));
        jTextField66.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Total", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N

        jTextField69.setBackground(new java.awt.Color(255, 255, 255));
        jTextField69.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jTextField69.setForeground(new java.awt.Color(0, 0, 0));
        jTextField69.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Servicio", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N

        jButton20.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jButton20.setForeground(new java.awt.Color(0, 102, 0));
        jButton20.setText("Agregar proveedor");
        jButton20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton20.setContentAreaFilled(false);

        jButton21.setBackground(new java.awt.Color(102, 0, 0));
        jButton21.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jButton21.setForeground(new java.awt.Color(102, 0, 0));
        jButton21.setText("Borrar");
        jButton21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton21.setContentAreaFilled(false);
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        jButton22.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jButton22.setForeground(new java.awt.Color(153, 153, 0));
        jButton22.setText("Editar");
        jButton22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton22.setContentAreaFilled(false);

        jComboBox20.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox20.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jComboBox20.setForeground(new java.awt.Color(0, 102, 0));
        jComboBox20.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pendiente", "Paga" }));

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jComboBox20, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton20, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel25Layout.createSequentialGroup()
                        .addComponent(jTextField63, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField64, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField65, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField66, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE))
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addComponent(jButton22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jTextField69, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap())
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField63, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField64, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField65, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField66, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField69, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox20, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(gm_lbl11, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(puestos_dptos_titulo9)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane16)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(jTextField62, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox18, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton19, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE))
                    .addComponent(jComboBox19, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel25, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gm_lbl11)
                    .addComponent(puestos_dptos_titulo9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBox18)
                    .addComponent(jButton19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField62, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox19, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        apartados_tbd.addTab("CUENTAS P", jPanel10);

        jPanel11.setBackground(new java.awt.Color(8, 41, 138));

        jPanel28.setBackground(new java.awt.Color(255, 255, 255));

        gm_lbl13.setFont(new java.awt.Font("Candara Light", 1, 24)); // NOI18N
        gm_lbl13.setForeground(new java.awt.Color(0, 0, 102));
        gm_lbl13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/logo - 24x24.png"))); // NOI18N
        gm_lbl13.setText("Grupo M");

        puestos_dptos_titulo11.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        puestos_dptos_titulo11.setForeground(new java.awt.Color(0, 0, 0));
        puestos_dptos_titulo11.setText("Cuentas por pagar");

        jTextField74.setBackground(new java.awt.Color(255, 255, 255));
        jTextField74.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jTextField74.setForeground(new java.awt.Color(0, 0, 0));
        jTextField74.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jComboBox24.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox24.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jComboBox24.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox24.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cliente", "Factura", "Monto" }));
        jComboBox24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton27.setBackground(new java.awt.Color(255, 255, 255));
        jButton27.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jButton27.setForeground(new java.awt.Color(0, 0, 0));
        jButton27.setText("Buscar");
        jButton27.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTable10.setBackground(new java.awt.Color(255, 255, 255));
        jTable10.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        jTable10.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane18.setViewportView(jTable10);

        jComboBox25.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox25.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jComboBox25.setForeground(new java.awt.Color(0, 102, 0));
        jComboBox25.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pendiente", "Paga", " ", " ", " " }));
        jComboBox25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton28.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jButton28.setForeground(new java.awt.Color(0, 102, 0));
        jButton28.setText("Guardar estado");
        jButton28.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton28.setContentAreaFilled(false);
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addComponent(gm_lbl13, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(puestos_dptos_titulo11)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane18)
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addComponent(jTextField74, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox24, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton27, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE))
                    .addComponent(jComboBox25, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton28, javax.swing.GroupLayout.DEFAULT_SIZE, 910, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gm_lbl13)
                    .addComponent(puestos_dptos_titulo11, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBox24)
                    .addComponent(jButton27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField74, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox25, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(253, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        apartados_tbd.addTab("CUENTAS C", jPanel11);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(apartados_tbd)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(apartados_tbd)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
       
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
       
    }//GEN-LAST:event_jButton13ActionPerformed

    private void borrar_cliente_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrar_cliente_btnActionPerformed
        
    }//GEN-LAST:event_borrar_cliente_btnActionPerformed

    private void nuevo_inventario_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevo_inventario_btnActionPerformed
    
    }//GEN-LAST:event_nuevo_inventario_btnActionPerformed

    private void nom_apl_empleado_sesion_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nom_apl_empleado_sesion_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nom_apl_empleado_sesion_txtActionPerformed

    private void agregar_usuario_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregar_usuario_btnActionPerformed
        //AGREGAR USUARIO
        try{
        String clave = "RaNsEl22.12142926ty546545265366253rosario.garcia347647";
        String datos = clave_usuario_agus_txt.getText();
        epagu = encriptador.Encriptar(datos, clave);
        }catch(Exception ex){
            Logger.getLogger(this.getName()).log(Level.SEVERE, null, ex);
        }
        String empleado = id_empleado_agus_txt.getText();
        String usuario = nombre_usuario_agus_txt.getText();
        String clave = clave_usuario_agus_txt.getText();
        String acceso = acceso_usuario_agus_box.getSelectedItem().toString();
        String query = "INSERT INTO USUARIOS (ID_EMPLEADO, NOMBRE_USUARIO, CLAVE, ACCESO) VALUES(" + empleado + ", '" + usuario + "', '" + epagu + "', '" + acceso + "')";
        try {

            PreparedStatement prst = cnn.prepareStatement(query);
            prst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Usuario Registrado");
            id_empleado_agus_txt.setText("");
            nombre_usuario_agus_txt.setText("");
            clave_usuario_agus_txt.setText("");
            acceso_usuario_agus_box.setSelectedItem("Administrador");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error " + ex);
        }
    }//GEN-LAST:event_agregar_usuario_btnActionPerformed

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
            java.util.logging.Logger.getLogger(administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel(new WindowsLookAndFeel());
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(administrador.class.getName()).log(Level.SEVERE, null, ex);
                }
                new administrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> acceso_usuario_agus_box;
    private javax.swing.JComboBox<String> acceso_usuario_edus_box;
    private javax.swing.JComboBox<String> accioon_prov_box;
    private javax.swing.JButton agregar_cliente_btn;
    private javax.swing.JButton agregar_dpto_btn;
    private javax.swing.JPanel agregar_dpto_pnl;
    private javax.swing.JButton agregar_gasto_txt;
    private javax.swing.JPanel agregar_gastos_pnl;
    private javax.swing.JButton agregar_material_btn;
    private javax.swing.JPanel agregar_material_pnl;
    private javax.swing.JButton agregar_puesto_btn;
    private javax.swing.JPanel agregar_puesto_pnl;
    private javax.swing.JButton agregar_usuario_btn;
    private javax.swing.JPanel agregar_usuarios_pnl;
    public static javax.swing.JTabbedPane apartados_tbd;
    private javax.swing.JTextField apellido_empleado_agus_txt;
    private javax.swing.JTextField apellido_recursos_txt;
    public static javax.swing.JTextField bienvenida_txt;
    private javax.swing.JButton borrar_cliente_btn;
    private javax.swing.JButton borrar_dpto_btn;
    private javax.swing.JButton borrar_empleado_btn;
    private javax.swing.JButton borrar_gastos_btn;
    private javax.swing.JButton borrar_puesto_btn;
    private javax.swing.JButton borrar_usuario_btn;
    private javax.swing.JButton brmcti_btn;
    private javax.swing.JComboBox<String> buscar_cliente_box;
    private javax.swing.JButton buscar_cliente_btn;
    private javax.swing.JTextField buscar_cliente_txt;
    private javax.swing.JComboBox<String> buscar_empleado_box;
    private javax.swing.JTextField buscar_empleado_txt;
    private javax.swing.JComboBox<String> buscar_factura_box;
    private javax.swing.JButton buscar_factura_btn;
    private javax.swing.JTextField buscar_factura_txt;
    private javax.swing.JButton buscar_gastos_btn;
    private javax.swing.JComboBox<String> buscar_prov_box;
    private javax.swing.JButton buscar_prov_btn;
    private javax.swing.JTextField buscar_prov_txt;
    private javax.swing.JComboBox<String> buscar_sesiones_box;
    private javax.swing.JButton buscar_sesiones_btn;
    private javax.swing.JTextField buscar_sesiones_txt;
    private javax.swing.JTextField cedula_recursos_txt;
    private javax.swing.JButton cerrar_sesion_btn;
    private javax.swing.JTextField clave_usuario_agus_txt;
    private javax.swing.JTextField clave_usuario_edus_txt;
    private javax.swing.JTable clientes_tbl;
    private javax.swing.JTextField cnagi_txt;
    private javax.swing.JTextField cncti_txt;
    private javax.swing.JTextField codigo_factura_txt;
    private javax.swing.JTextField comprobante_facturar_txt;
    private javax.swing.JPanel contol_dptos_pnl;
    private javax.swing.JPanel contol_puestos_pnl;
    private javax.swing.JPanel control_clientes_pnl;
    private javax.swing.JPanel control_gastos_pnl;
    private javax.swing.JPanel control_inventario_pnl;
    private javax.swing.JLabel control_sesiones_lbl;
    private javax.swing.JPanel control_sesiones_pnl;
    private javax.swing.JPanel control_usuarios_ed_pnl;
    private javax.swing.JTextArea desc_dpro_ag_ta;
    private javax.swing.JTextArea desc_dpto_ctl_ta;
    private javax.swing.JTextField desc_gastos_ag_txt;
    private javax.swing.JTextArea desc_puesto_ctl_ta;
    private javax.swing.JTextField descripcion_gastos_ed_txt;
    private javax.swing.JPanel detalles_sesion_pnl;
    private javax.swing.JTextField direccion_recursos_txt;
    private javax.swing.JComboBox<String> dpto_puesto_ag_txt;
    private javax.swing.JComboBox<String> dpto_puesto_ctl_box;
    private javax.swing.JTable dptos_tbl;
    private javax.swing.JTextField edad_cliente_txt;
    private javax.swing.JTextField edad_recursos_txt;
    private javax.swing.JButton editar_cliente_btn;
    private javax.swing.JButton editar_dpto_btn;
    private javax.swing.JButton editar_empleado_btn;
    private javax.swing.JButton editar_gastos_btn;
    private javax.swing.JButton editar_puesto_btn;
    private javax.swing.JButton editar_usuario_btn;
    private javax.swing.JButton edmcti_btn;
    private javax.swing.JButton edmcti_btn2;
    private javax.swing.JTable empleados_tbl;
    private javax.swing.JComboBox<String> estado_civil_recursos_box;
    private javax.swing.JTextField factura_facturar_txt;
    private javax.swing.JButton facturar_btn;
    private javax.swing.JPanel facturar_pnl;
    private com.toedter.calendar.JDateChooser fecha1_gastos_dt;
    private com.toedter.calendar.JDateChooser fecha2_gastos_dt;
    private com.toedter.calendar.JDateChooser fecha_gastos_ed_dt;
    public static javax.swing.JTextField fecha_hora_sesion_txt;
    private javax.swing.JPanel gastos_pnl;
    private javax.swing.JTable gastos_tbl;
    private javax.swing.JLabel gm_lbl;
    private javax.swing.JLabel gm_lbl10;
    private javax.swing.JLabel gm_lbl11;
    private javax.swing.JLabel gm_lbl13;
    private javax.swing.JLabel gm_lbl14;
    private javax.swing.JLabel gm_lbl2;
    private javax.swing.JLabel gm_lbl3;
    private javax.swing.JLabel gm_lbl4;
    private javax.swing.JLabel gm_lbl5;
    private javax.swing.JLabel gm_lbl6;
    private javax.swing.JLabel gm_lbl7;
    private javax.swing.JLabel gm_lbl8;
    private javax.swing.JLabel gm_lbl9;
    private javax.swing.JLabel gm_lbl_us;
    private javax.swing.JComboBox<String> grados_recursos_box;
    private javax.swing.JTextField id_cliente_txt;
    private javax.swing.JTextField id_dpto_ctl_txt;
    private javax.swing.JTextField id_empleado_agus_txt;
    private javax.swing.JTextField id_empleado_edus_txt;
    public static javax.swing.JTextField id_empleado_sesion_txt;
    private javax.swing.JTextField id_gastos_ed_txt;
    private javax.swing.JTextField id_puesto_ctl_txt;
    private javax.swing.JTextField id_usuario_edus_txt1;
    private javax.swing.JTextField idcti_txt;
    private javax.swing.JPanel inicio_interno_pnl;
    private javax.swing.JPanel inicio_pnl;
    private javax.swing.JPanel inventario_pnl;
    private javax.swing.JTable inventario_tbl;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JComboBox<String> jComboBox10;
    private javax.swing.JComboBox<String> jComboBox12;
    private javax.swing.JComboBox<String> jComboBox16;
    private javax.swing.JComboBox<String> jComboBox17;
    private javax.swing.JComboBox<String> jComboBox18;
    private javax.swing.JComboBox<String> jComboBox19;
    private javax.swing.JComboBox<String> jComboBox20;
    private javax.swing.JComboBox<String> jComboBox24;
    private javax.swing.JComboBox<String> jComboBox25;
    private javax.swing.JComboBox<String> jComboBox8;
    private javax.swing.JComboBox<String> jComboBox9;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private com.toedter.calendar.JDateChooser jDateChooser6;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable10;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable7;
    private javax.swing.JTable jTable8;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField43;
    private javax.swing.JTextField jTextField44;
    private javax.swing.JTextField jTextField45;
    private javax.swing.JTextField jTextField46;
    private javax.swing.JTextField jTextField47;
    private javax.swing.JTextField jTextField48;
    private javax.swing.JTextField jTextField49;
    private javax.swing.JTextField jTextField50;
    private javax.swing.JTextField jTextField51;
    private javax.swing.JTextField jTextField52;
    private javax.swing.JTextField jTextField53;
    private javax.swing.JTextField jTextField54;
    private javax.swing.JTextField jTextField55;
    private javax.swing.JTextField jTextField56;
    private javax.swing.JTextField jTextField57;
    private javax.swing.JTextField jTextField58;
    private javax.swing.JTextField jTextField59;
    private javax.swing.JTextField jTextField60;
    private javax.swing.JTextField jTextField61;
    private javax.swing.JTextField jTextField62;
    private javax.swing.JTextField jTextField63;
    private javax.swing.JTextField jTextField64;
    private javax.swing.JTextField jTextField65;
    private javax.swing.JTextField jTextField66;
    private javax.swing.JTextField jTextField69;
    private javax.swing.JTextField jTextField74;
    private javax.swing.JComboBox<String> mdagi_txt;
    private javax.swing.JComboBox<String> mdcti_box;
    private javax.swing.JComboBox<String> moneda_facturar_box;
    private javax.swing.JButton mostrar_factura_btn;
    private com.toedter.calendar.JDateChooser nacimiento_recursos_dt;
    private javax.swing.JTextField nmagi_txt;
    private javax.swing.JTextField nmcti_txt;
    public static javax.swing.JTextField nom_apl_empleado_sesion_txt;
    private javax.swing.JTextField nombre_cliente_txt;
    private javax.swing.JTextField nombre_dpto_ag_btn;
    private javax.swing.JTextField nombre_dpto_ctl_txt;
    private javax.swing.JTextField nombre_empleado_agus_txt;
    private javax.swing.JTextField nombre_puesto_ag_txt;
    private javax.swing.JTextField nombre_puesto_ctl_txt;
    private javax.swing.JTextField nombre_recursos_txt;
    private javax.swing.JTextField nombre_usuario_agus_txt;
    private javax.swing.JTextField nombre_usuario_edus_txt;
    private javax.swing.JButton nuevo_inventario_btn;
    private javax.swing.JTextField numero_emp_recursos_txt;
    private javax.swing.JTextField otp;
    private javax.swing.JTextField pedido_facturar_txt;
    private javax.swing.JTextField pragi_txt;
    private javax.swing.JTextField prcti_txt;
    private javax.swing.JTextField prefijo_comprobante_facturar_txt;
    private javax.swing.JTable prov_tbl;
    private javax.swing.JTextField proveedor_gastos_ag_txt;
    private javax.swing.JTextField proveedor_gastos_ed_txt;
    private javax.swing.JComboBox<String> puesto_recursos_box;
    private javax.swing.JPanel puestos_dptos_interno_pnl;
    public static javax.swing.JPanel puestos_dptos_pnl;
    private javax.swing.JLabel puestos_dptos_titulo;
    private javax.swing.JLabel puestos_dptos_titulo1;
    private javax.swing.JLabel puestos_dptos_titulo11;
    private javax.swing.JLabel puestos_dptos_titulo2;
    private javax.swing.JLabel puestos_dptos_titulo3;
    private javax.swing.JLabel puestos_dptos_titulo4;
    private javax.swing.JLabel puestos_dptos_titulo5;
    private javax.swing.JLabel puestos_dptos_titulo6;
    private javax.swing.JLabel puestos_dptos_titulo7;
    private javax.swing.JLabel puestos_dptos_titulo8;
    private javax.swing.JLabel puestos_dptos_titulo9;
    private javax.swing.JTable puestos_tbl;
    private javax.swing.JTextField referencias_bancarias_cliente_txt;
    private javax.swing.JTextField referencias_credito_cliente_txt;
    private javax.swing.JTextField regmer_cliente_txt;
    private javax.swing.JButton reporte_sesiones_btn;
    private javax.swing.JTextField representante_cliente_txt;
    private javax.swing.JTextField rnc_cliente_txt;
    private javax.swing.JPanel rrhh_pnl;
    private javax.swing.JTextField salario_recursos_txt;
    private javax.swing.JScrollPane scroll_sesiones;
    private javax.swing.JScrollPane scroll_tbl_usuarios;
    private javax.swing.JTextField secuencia_comprobante_facturar_txt;
    private javax.swing.JComboBox<String> seleccion_operacion_box;
    private javax.swing.JComboBox<String> sexo_recurso_box;
    private javax.swing.JTextField telefono_cliente_txt;
    private javax.swing.JTextField telefono_recursos_txt;
    private javax.swing.JComboBox<String> tiagi_txt;
    private javax.swing.JComboBox<String> ticti_box;
    private javax.swing.JComboBox<String> tipo_dpto_ag_box;
    private javax.swing.JComboBox<String> tipo_dpto_ctl_txt;
    private javax.swing.JComboBox<String> tipo_inventario_buscar_box;
    private javax.swing.JTextField total_facturar_txt;
    private javax.swing.JTextField total_gasto_ag_txt;
    private javax.swing.JTextField total_gastos_ed_txt;
    public static javax.swing.JTextField usuario_empleado_sesion_txt;
    private javax.swing.JPanel usuarios_interno_pnl;
    private javax.swing.JLabel usuarios_lbl;
    public static javax.swing.JPanel usuarios_pnl;
    private javax.swing.JTabbedPane usuarios_sesiones_pnl;
    public static javax.swing.JTable usuarios_tbl;
    private javax.swing.JTable usuarios_tbl1;
    // End of variables declaration//GEN-END:variables
}
