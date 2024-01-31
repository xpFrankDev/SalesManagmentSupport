/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VentanasRST;

import Clases.ArchivosCotizacion;
import Clases.AvanceCot;
import Clases.Conectar;
import Clases.Cotizacion;
import Clases.FormaPago;
import Clases.Ganancia;
import Clases.Presupuesto;
import Clases.Propiedades;
import Clases.Seguimiento;
import Clases.Solicitud;
import Clases.Rutas;
import Clases.tools;
import Ventanas.cargando;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;
import rojerusan.RSNotifyFade;

/**
 *
 * @author soporte
 */
public class newCotizacion extends javax.swing.JFrame {

    Presupuesto p;
    Solicitud s;
    String ultimaRuta = "";
    Rutas rutas = new Rutas();
    DefaultTableModel modelo;
    cargando carga = new cargando();
    listarPresupuesto lp = new listarPresupuesto(this);
    public newCotizacion() {
        initComponents();
        changeIcon();
        iniciar();
    }

   

    public void changeIcon() {
        Image icon = new ImageIcon(getClass().getResource("/imgs/logo_rossetti.jpg")).getImage();
        setIconImage(icon);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCentral = new javax.swing.JPanel();
        panelHeader = new rojeru_san.rspanel.RSPanelGradiente();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        deleteFileButton2 = new rojeru_san.rsbutton.RSButtonRoundEffectIcon();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        idPresupuesto = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nameVendedor = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        fechaPresupuesto = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        nameCliente = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        numeroCot = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel15 = new javax.swing.JLabel();
        fechaCotizacion = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        formaPago = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaArchivo = new rojerusan.RSTableMetro();
        upFileButton = new rojeru_san.rsbutton.RSButtonRoundRippleIcon();
        deleteFileButton1 = new rojeru_san.rsbutton.RSButtonRoundEffectIcon();
        tipoPago = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        tiempoFabricacion = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        montoTxt = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        rSButtonIconShadow1 = new RSMaterialComponent.RSButtonIconShadow();
        rSButtonIconShadow2 = new RSMaterialComponent.RSButtonIconShadow();
        rSButtonIconShadow3 = new RSMaterialComponent.RSButtonIconShadow();
        jLabel3 = new javax.swing.JLabel();
        rSButtonRoundRipple1 = new rojeru_san.rsbutton.RSButtonRoundRipple();
        jScrollPane1 = new javax.swing.JScrollPane();
        nameProductoTxt = new javax.swing.JTextArea();
        jLabel24 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ingresar Nueva Cotización - SGDS");
        setUndecorated(true);
        setResizable(false);

        panelCentral.setBackground(new java.awt.Color(255, 255, 255));
        panelCentral.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        panelHeader.setColorPrimario(new java.awt.Color(161, 54, 48));
        panelHeader.setColorSecundario(new java.awt.Color(153, 153, 153));
        panelHeader.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panelHeaderMouseDragged(evt);
            }
        });
        panelHeader.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelHeaderMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                panelHeaderMouseReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ingresar Cotización");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/windowclose_104378.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        deleteFileButton2.setBackground(new java.awt.Color(153, 153, 153));
        deleteFileButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/windowclose_104378.png"))); // NOI18N
        deleteFileButton2.setText("        Borrar Todos Archivos");
        deleteFileButton2.setColorHover(new java.awt.Color(204, 0, 0));
        deleteFileButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteFileButton2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        deleteFileButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteFileButton2ActionPerformed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/logo_rossetti 48x48.jpg"))); // NOI18N

        javax.swing.GroupLayout panelHeaderLayout = new javax.swing.GroupLayout(panelHeader);
        panelHeader.setLayout(panelHeaderLayout);
        panelHeaderLayout.setHorizontalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHeaderLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(deleteFileButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelHeaderLayout.setVerticalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelHeaderLayout.createSequentialGroup()
                .addComponent(deleteFileButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(panelHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelHeaderLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Seleccione Presupuesto:");

        idPresupuesto.setEditable(false);
        idPresupuesto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        idPresupuesto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        idPresupuesto.setToolTipText("Presione F1 o la Lupa para buscar listado de Clientes");
        idPresupuesto.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        idPresupuesto.setOpaque(false);
        idPresupuesto.setSelectionColor(new java.awt.Color(161, 54, 48));
        idPresupuesto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                idPresupuestoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                idPresupuestoFocusLost(evt);
            }
        });
        idPresupuesto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                idPresupuestoMouseExited(evt);
            }
        });
        idPresupuesto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                idPresupuestoKeyReleased(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("--->");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Responsable:");

        nameVendedor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nameVendedor.setText("@Nombre Vendedor");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Fecha:");

        fechaPresupuesto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        fechaPresupuesto.setText("@Fecha");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("Cliente:");

        nameCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nameCliente.setText("@Nombre de Cliente");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setText("Número de Cot. Emitida:");

        numeroCot.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        numeroCot.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        numeroCot.setToolTipText("Presione F1 o la Lupa para Mostrar Listado de Cots.");
        numeroCot.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        numeroCot.setOpaque(false);
        numeroCot.setSelectionColor(new java.awt.Color(161, 54, 48));
        numeroCot.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                numeroCotFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                numeroCotFocusLost(evt);
            }
        });
        numeroCot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                numeroCotMouseExited(evt);
            }
        });
        numeroCot.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                numeroCotKeyReleased(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(161, 54, 48));
        jSeparator1.setForeground(new java.awt.Color(161, 54, 48));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setText("Fecha:");

        fechaCotizacion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        fechaCotizacion.setForeground(new java.awt.Color(161, 54, 48));
        fechaCotizacion.setText("@Fecha");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setText("Formago de Pago:");

        formaPago.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        formaPago.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        formaPago.setToolTipText("Presione F1 o la Lupa para buscar listado de Formas de Pago");
        formaPago.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        formaPago.setOpaque(false);
        formaPago.setSelectionColor(new java.awt.Color(161, 54, 48));
        formaPago.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formaPagoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                formaPagoFocusLost(evt);
            }
        });
        formaPago.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                formaPagoMouseExited(evt);
            }
        });
        formaPago.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                formaPagoKeyReleased(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(153, 153, 153));
        jLabel17.setText("Paso 1: Seleccione el Presupuesto Emitido");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(153, 153, 153));
        jLabel18.setText("Paso 2: Introduzca los datos de la Cotización Emitida");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Excel2_48x48.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        tablaArchivo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Archivos Seleccionados"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaArchivo.setBackgoundHead(new java.awt.Color(161, 54, 48));
        tablaArchivo.setBackgoundHover(new java.awt.Color(161, 54, 48));
        tablaArchivo.setColorPrimaryText(new java.awt.Color(161, 54, 48));
        tablaArchivo.setColorSecundaryText(new java.awt.Color(161, 54, 48));
        tablaArchivo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tablaArchivo.setFontHead(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        tablaArchivo.setFontRowHover(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tablaArchivo.setSelectionBackground(new java.awt.Color(161, 54, 48));
        jScrollPane3.setViewportView(tablaArchivo);

        upFileButton.setBackground(new java.awt.Color(77, 164, 98));
        upFileButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/attach_clip_1442.png"))); // NOI18N
        upFileButton.setText("Elejir Archivo");
        upFileButton.setColorHover(new java.awt.Color(51, 181, 229));
        upFileButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        upFileButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        upFileButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        upFileButton.setIconTextGap(2);
        upFileButton.setMargin(new java.awt.Insets(2, 10, 2, 16));
        upFileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upFileButtonActionPerformed(evt);
            }
        });

        deleteFileButton1.setBackground(new java.awt.Color(51, 181, 229));
        deleteFileButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/windowclose_104378.png"))); // NOI18N
        deleteFileButton1.setText("   Borrar Archivo");
        deleteFileButton1.setColorHover(new java.awt.Color(204, 0, 0));
        deleteFileButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteFileButton1.setEfecto(rojeru_san.rsbutton.RSButtonRoundEffectIcon.EFECTO.RIPLE);
        deleteFileButton1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        deleteFileButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteFileButton1ActionPerformed(evt);
            }
        });

        tipoPago.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tipoPago.setText("@Tipo de Pago Seleccionado");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19.setText("Tiempo de Fabricación");

        tiempoFabricacion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tiempoFabricacion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tiempoFabricacion.setToolTipText("");
        tiempoFabricacion.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        tiempoFabricacion.setOpaque(false);
        tiempoFabricacion.setSelectionColor(new java.awt.Color(161, 54, 48));
        tiempoFabricacion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tiempoFabricacionFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tiempoFabricacionFocusLost(evt);
            }
        });
        tiempoFabricacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tiempoFabricacionMouseExited(evt);
            }
        });
        tiempoFabricacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tiempoFabricacionKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tiempoFabricacionKeyTyped(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel20.setText("  Días habiles");

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel21.setText("Monto:");

        montoTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        montoTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        montoTxt.setToolTipText("Ejemplo: 15250.99, no incluya el simbo del Dolar");
        montoTxt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        montoTxt.setOpaque(false);
        montoTxt.setSelectionColor(new java.awt.Color(161, 54, 48));
        montoTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                montoTxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                montoTxtFocusLost(evt);
            }
        });
        montoTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                montoTxtMouseExited(evt);
            }
        });
        montoTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                montoTxtKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                montoTxtKeyTyped(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel22.setText("$");

        jLabel23.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(153, 153, 153));
        jLabel23.setText("- Use los decimales con punto \".\"");

        rSButtonIconShadow1.setBackground(new java.awt.Color(153, 153, 153));
        rSButtonIconShadow1.setBackgroundHover(new java.awt.Color(102, 102, 102));
        rSButtonIconShadow1.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SEARCH);
        rSButtonIconShadow1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonIconShadow1ActionPerformed(evt);
            }
        });

        rSButtonIconShadow2.setBackground(new java.awt.Color(153, 153, 153));
        rSButtonIconShadow2.setBackgroundHover(new java.awt.Color(102, 102, 102));
        rSButtonIconShadow2.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SEARCH);
        rSButtonIconShadow2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonIconShadow2ActionPerformed(evt);
            }
        });

        rSButtonIconShadow3.setBackground(new java.awt.Color(153, 153, 153));
        rSButtonIconShadow3.setBackgroundHover(new java.awt.Color(102, 102, 102));
        rSButtonIconShadow3.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SEARCH);
        rSButtonIconShadow3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonIconShadow3ActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/new-file_40454 (2).png"))); // NOI18N
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel3MouseExited(evt);
            }
        });

        rSButtonRoundRipple1.setBackground(new java.awt.Color(161, 54, 48));
        rSButtonRoundRipple1.setText("Generar Cotización");
        rSButtonRoundRipple1.setColorHover(new java.awt.Color(77, 164, 98));
        rSButtonRoundRipple1.setFont(new java.awt.Font("Roboto Bold", 1, 16)); // NOI18N
        rSButtonRoundRipple1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        rSButtonRoundRipple1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                rSButtonRoundRipple1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                rSButtonRoundRipple1MouseExited(evt);
            }
        });
        rSButtonRoundRipple1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonRoundRipple1ActionPerformed(evt);
            }
        });

        nameProductoTxt.setColumns(20);
        nameProductoTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nameProductoTxt.setLineWrap(true);
        nameProductoTxt.setRows(2);
        jScrollPane1.setViewportView(nameProductoTxt);

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel24.setText("Nombre del Producto:");

        javax.swing.GroupLayout panelCentralLayout = new javax.swing.GroupLayout(panelCentral);
        panelCentral.setLayout(panelCentralLayout);
        panelCentralLayout.setHorizontalGroup(
            panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelCentralLayout.createSequentialGroup()
                .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCentralLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addGroup(panelCentralLayout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(jLabel4)
                                .addGap(4, 4, 4)
                                .addComponent(idPresupuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(6, 6, 6)
                        .addComponent(rSButtonIconShadow1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel11)
                        .addGap(6, 6, 6)
                        .addComponent(nameCliente)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addGap(10, 10, 10)
                        .addComponent(nameVendedor)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel9)
                        .addGap(6, 6, 6)
                        .addComponent(fechaPresupuesto)
                        .addGap(127, 127, 127)
                        .addComponent(jLabel2))
                    .addGroup(panelCentralLayout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 678, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCentralLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 1149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCentralLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel14)
                        .addGap(10, 10, 10)
                        .addComponent(numeroCot, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(rSButtonIconShadow3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel15)
                        .addGap(18, 18, 18)
                        .addComponent(fechaCotizacion)
                        .addGap(140, 140, 140)
                        .addComponent(upFileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(deleteFileButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCentralLayout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelCentralLayout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabel16))
                            .addComponent(jLabel19)
                            .addGroup(panelCentralLayout.createSequentialGroup()
                                .addGap(105, 105, 105)
                                .addComponent(jLabel21)))
                        .addGap(10, 10, 10)
                        .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(formaPago, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tiempoFabricacion, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(montoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelCentralLayout.createSequentialGroup()
                                .addComponent(rSButtonIconShadow2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)
                                .addComponent(tipoPago, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelCentralLayout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel23)))
                        .addGap(13, 13, 13)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCentralLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(125, 125, 125)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(rSButtonRoundRipple1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 10, Short.MAX_VALUE))
        );
        panelCentralLayout.setVerticalGroup(
            panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCentralLayout.createSequentialGroup()
                .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3)
                        .addGroup(panelCentralLayout.createSequentialGroup()
                            .addGap(24, 24, 24)
                            .addComponent(rSButtonRoundRipple1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelCentralLayout.createSequentialGroup()
                        .addComponent(panelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelCentralLayout.createSequentialGroup()
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)
                                .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(idPresupuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelCentralLayout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(rSButtonIconShadow1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelCentralLayout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(jLabel5))
                            .addGroup(panelCentralLayout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(jLabel11))
                            .addGroup(panelCentralLayout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(nameCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelCentralLayout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelCentralLayout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(nameVendedor))
                            .addGroup(panelCentralLayout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelCentralLayout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(fechaPresupuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelCentralLayout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jLabel2)))
                        .addGap(34, 34, 34)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(upFileButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deleteFileButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelCentralLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(numeroCot, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rSButtonIconShadow3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fechaCotizacion, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelCentralLayout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelCentralLayout.createSequentialGroup()
                                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(23, 23, 23)
                                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(21, 21, 21)
                                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelCentralLayout.createSequentialGroup()
                                        .addComponent(formaPago, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(23, 23, 23)
                                        .addComponent(tiempoFabricacion, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(21, 21, 21)
                                        .addComponent(montoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelCentralLayout.createSequentialGroup()
                                        .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(rSButtonIconShadow2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(panelCentralLayout.createSequentialGroup()
                                                .addGap(1, 1, 1)
                                                .addComponent(tipoPago, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(panelCentralLayout.createSequentialGroup()
                                                .addGap(1, 1, 1)
                                                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGroup(panelCentralLayout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCentral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCentral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void idPresupuestoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_idPresupuestoFocusGained
        idPresupuesto.setBorder(new MatteBorder(0, 0, 2, 0, new Color(161, 54, 48)));
    }//GEN-LAST:event_idPresupuestoFocusGained

    private void idPresupuestoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_idPresupuestoFocusLost
        idPresupuesto.setBorder(new MatteBorder(0, 0, 1, 0, Color.BLACK));
    }//GEN-LAST:event_idPresupuestoFocusLost

    private void idPresupuestoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_idPresupuestoMouseExited

        //
    }//GEN-LAST:event_idPresupuestoMouseExited

    private void idPresupuestoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idPresupuestoKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_F1) {
            lp.setVisible(true);
        }
    }//GEN-LAST:event_idPresupuestoKeyReleased

    private void numeroCotFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_numeroCotFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_numeroCotFocusGained

    private void numeroCotFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_numeroCotFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_numeroCotFocusLost

    private void numeroCotMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_numeroCotMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_numeroCotMouseExited

    private void numeroCotKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numeroCotKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_numeroCotKeyReleased

    private void formaPagoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formaPagoFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_formaPagoFocusGained

    private void formaPagoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formaPagoFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_formaPagoFocusLost

    private void formaPagoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formaPagoMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_formaPagoMouseExited

    private void formaPagoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formaPagoKeyReleased
        if (evt.getKeyChar() == KeyEvent.VK_F1) {
            new listarFormasPago(this).setVisible(true);
        } else if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
            if (new tools().ComprobarNumeros(formaPago.getText())) {
                int id = Integer.parseInt(formaPago.getText());
                FormaPago fp = new FormaPago();
                int rsp = fp.buscarID(id);
                if (rsp == 1) {
                    formaPago.setText(fp.getId() + "");
                    tipoPago.setText(fp.getNombre());
                    tiempoFabricacion.requestFocus();
                } else {
                    JOptionPane.showMessageDialog(rootPane, "ID no encontrado");
                    formaPago.setText("");
                    tipoPago.setText("");
                }
            }
        }
    }//GEN-LAST:event_formaPagoKeyReleased

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        añadirArchivo();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void upFileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upFileButtonActionPerformed
        añadirArchivo();
    }//GEN-LAST:event_upFileButtonActionPerformed

    private void deleteFileButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteFileButton1ActionPerformed
        eliminarArchivo();
    }//GEN-LAST:event_deleteFileButton1ActionPerformed

    private void rSButtonRoundRipple1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonRoundRipple1ActionPerformed
        new Thread(this::generarCot).start();


    }//GEN-LAST:event_rSButtonRoundRipple1ActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
     
    new Thread(this::generarCot).start();
        
    }//GEN-LAST:event_jLabel3MouseClicked

    private void deleteFileButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteFileButton2ActionPerformed

        if (modelo.getRowCount() == 0) {
            JOptionPane.showMessageDialog(rootPane, "La Tabla ya se Encuentra Vacia", "¡Información!", JOptionPane.INFORMATION_MESSAGE);
        } else {
            int rsp = JOptionPane.showConfirmDialog(rootPane, "¿Quiere Eliminar Todos los Archivos?");
            if (rsp == 0) {
                vaciarTabla();
            }
        }


    }//GEN-LAST:event_deleteFileButton2ActionPerformed

    private void rSButtonRoundRipple1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSButtonRoundRipple1MouseEntered
    }//GEN-LAST:event_rSButtonRoundRipple1MouseEntered

    private void rSButtonRoundRipple1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSButtonRoundRipple1MouseExited
    }//GEN-LAST:event_rSButtonRoundRipple1MouseExited

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
    }//GEN-LAST:event_jLabel3MouseExited

    private void tiempoFabricacionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tiempoFabricacionFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_tiempoFabricacionFocusGained

    private void tiempoFabricacionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tiempoFabricacionFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_tiempoFabricacionFocusLost

    private void tiempoFabricacionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tiempoFabricacionMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_tiempoFabricacionMouseExited

    private void tiempoFabricacionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tiempoFabricacionKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tiempoFabricacionKeyReleased

    private void tiempoFabricacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tiempoFabricacionKeyTyped
        new tools().soloNumerosyCantidadDigitos(evt, tiempoFabricacion, 3);
    }//GEN-LAST:event_tiempoFabricacionKeyTyped

    private void montoTxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_montoTxtFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_montoTxtFocusGained

    private void montoTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_montoTxtFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_montoTxtFocusLost

    private void montoTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_montoTxtMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_montoTxtMouseExited

    private void montoTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_montoTxtKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_montoTxtKeyReleased

    private void montoTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_montoTxtKeyTyped
        new tools().soloDoubleyCantidadDigitos(evt, montoTxt, 10);

    }//GEN-LAST:event_montoTxtKeyTyped

    private void rSButtonIconShadow1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonIconShadow1ActionPerformed
        lp.llenarTabla();
        lp.setVisible(true);
    }//GEN-LAST:event_rSButtonIconShadow1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void panelHeaderMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelHeaderMouseReleased
        setOpacity((float) 1.0);
    }//GEN-LAST:event_panelHeaderMouseReleased
    int xx, yy;
    private void panelHeaderMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelHeaderMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - yy);
    }//GEN-LAST:event_panelHeaderMouseDragged

    private void panelHeaderMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelHeaderMousePressed
        setOpacity((float) 0.8);
        xx = evt.getX();
        yy = evt.getY();
    }//GEN-LAST:event_panelHeaderMousePressed

    private void rSButtonIconShadow2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonIconShadow2ActionPerformed
        new listarFormasPago(this).setVisible(true);
    }//GEN-LAST:event_rSButtonIconShadow2ActionPerformed

    private void rSButtonIconShadow3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonIconShadow3ActionPerformed
        new buscarCotStarsoft(this).setVisible(true);
    }//GEN-LAST:event_rSButtonIconShadow3ActionPerformed

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
            java.util.logging.Logger.getLogger(newCotizacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(newCotizacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(newCotizacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(newCotizacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                    //UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
                    new newCotizacion().setVisible(true);
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(newPresupuesto.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.rsbutton.RSButtonRoundEffectIcon deleteFileButton1;
    private rojeru_san.rsbutton.RSButtonRoundEffectIcon deleteFileButton2;
    private javax.swing.JLabel fechaCotizacion;
    private javax.swing.JLabel fechaPresupuesto;
    public static javax.swing.JTextField formaPago;
    public static javax.swing.JTextField idPresupuesto;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    public static javax.swing.JTextField montoTxt;
    private javax.swing.JLabel nameCliente;
    public javax.swing.JTextArea nameProductoTxt;
    private javax.swing.JLabel nameVendedor;
    public static javax.swing.JTextField numeroCot;
    private javax.swing.JPanel panelCentral;
    private rojeru_san.rspanel.RSPanelGradiente panelHeader;
    private RSMaterialComponent.RSButtonIconShadow rSButtonIconShadow1;
    private RSMaterialComponent.RSButtonIconShadow rSButtonIconShadow2;
    private RSMaterialComponent.RSButtonIconShadow rSButtonIconShadow3;
    private rojeru_san.rsbutton.RSButtonRoundRipple rSButtonRoundRipple1;
    private rojerusan.RSTableMetro tablaArchivo;
    public static javax.swing.JTextField tiempoFabricacion;
    public static javax.swing.JLabel tipoPago;
    private rojeru_san.rsbutton.RSButtonRoundRippleIcon upFileButton;
    // End of variables declaration//GEN-END:variables

    public void setPresupuesto(Presupuesto x) {
        this.p = (Presupuesto) x;
    }

    public void setSolicitud(Solicitud y) {
        this.s = (Solicitud) y;
    }
    int idSolicitud = 0;

    private void generarCot() {
        try {
            if (validarCampos()) {
                //Tomando los datos
                new Thread(this::mostrarCarga).start();
                int idPresupuesto = Integer.parseInt(newCotizacion.idPresupuesto.getText());
                String numCot = numeroCot.getText();
                String fechaCot = fechaCotizacion.getText();
                int idFormaPago = Integer.parseInt(formaPago.getText());
                String vendedor = (Main.getVendedor()).equals("vacio") ? "vacio" : Main.getVendedor();
                String tfabricacion = tiempoFabricacion.getText();
                Double monto = Double.parseDouble(montoTxt.getText());
                String nameProduct = nameProductoTxt.getText();
                //Realizamos el insert en la Base de Datos

                int rsp = new Cotizacion(
                        idPresupuesto, idFormaPago, numCot, vendedor, fechaCot, tfabricacion, monto, p.getCliente(),nameProduct
                ).insert();

                if (rsp == 1) {// Si se agrega sin problemas
                    idSolicitud = s.getId();

                    //AGREGAMOS NUEVO SEGUIMIENTO    
                    String ip = "0.0.0.0";

                    try {
                        ip = new tools().Obtener_ip();
                    } catch (UnknownHostException ex) {
                        Logger.getLogger(newPresupuesto.class.getName()).log(Level.SEVERE, null, ex);
                        JOptionPane.showMessageDialog(rootPane, "Error Obteniendo IP\n" + ex);
                    }

                    int idCliente = p.getIdCliente();
                    int lastCotizacion = new Cotizacion().getLastCotizacion();
                    int rsp2 = new Seguimiento(// Sustituir Franklin Parra x main.getVendedor()
                            idCliente, fechaCot, "Cotización", "Cot. Creada - Esperando por Cliente",
                            vendedor, lastCotizacion, ip
                    ).insert();

                    //ACTUALIZAMOS LA SOLICITUD ORIGINAL
                    s.setEstado("Cot. Creada - Esperando por Cliente");
                    s.setIdCot(lastCotizacion);
                    s.update();

                    //ACTIALIZAMOS EL ESTADO DEL PRESUPUESTO
                    p.setEstado("Cot. Creada - Esperando por Cliente");
                    p.update();

                    //AGREGAMOS VALORES EN REGISTRO GANANCIA
                    new Ganancia(lastCotizacion, monto).insert();

                    //AGREGAMOS LA PLANTILLA PARA CONTROLAR EL AVANCE DE LA COT
                    new AvanceCot(lastCotizacion).Insert();
                    
                     new Thread(this::ocultarCarga).start();
                    //SUBIMOS LOS ARCHIVOS
                    new Thread(this::subirArchivos).start();

                }

            }
        } catch (Exception e) {
            Logger.getLogger(Cotizacion.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(rootPane, e);
        }

       
    }

    private boolean validarCampos() {
        boolean llave = false;

        if (idPresupuesto.getText().length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Debe Seleccionar un Presupuesto Antes de Continuar");
        } else {
            if (numeroCot.getText().length() == 0) {
                JOptionPane.showMessageDialog(rootPane, "Ingrese un Numero de Cotización Antes de Continuar");
            } else {
                if (formaPago.getText().length() == 0) {
                    JOptionPane.showMessageDialog(rootPane, "Asigne un valor a la Forma de Pago para Continuar");
                } else {
                    if (modelo.getRowCount() == 0) {
                        JOptionPane.showMessageDialog(rootPane, "No Puede Continuar si no ha Subido al menos 1 archivo");
                    } else {
                        if (montoTxt.getText().length() == 0) {
                            JOptionPane.showMessageDialog(rootPane, "Ingrese el monto de la Cotización");
                        } else {
                            Cotizacion c = new Cotizacion().buscarNumCot(numeroCot.getText());
                           
                            if(c.getNumeroCot() != null ){
                               JOptionPane.showMessageDialog(rootPane, "Número de cotizacion ya ingresada previamente, ingrese otro o borre el actual");
                            }else{
                                if(nameProductoTxt.getText().length() < 1){
                                   JOptionPane.showMessageDialog(rootPane, "Ingrese el nombre del Producto"); 
                                }else{
                                     llave = true;
                                }
                               
                            }
                            
                        }

                    }
                }
            }
        }

        return llave;
    }

    void setDatos() {
        nameCliente.setText(p.getCliente());
        nameVendedor.setText(p.getResponsable());
        fechaPresupuesto.setText(p.getFechaIngreso());
        nameProductoTxt.setText(s.getDescripcion());
    }

    private void iniciar() {
        modelo = (DefaultTableModel) tablaArchivo.getModel();
        fechaCotizacion.setText(new Conectar("rstcot").getFechaServidor());
        deleteFileButton2.setVisible(false);
        jLabel2.setVisible(false);
    }

    private void eliminarArchivo() {
        if (tablaArchivo.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(rootPane, "Para eliminar algún archivo, antes debe seleccionar uno en la Tabla de Abajo");
        } else {
            int rsp = JOptionPane.showConfirmDialog(rootPane, "¿Seguro que desea ELiminar el Archivo Seleccionado?");
            if (rsp == 0) {
                DefaultTableModel modeloArchivo = (DefaultTableModel) tablaArchivo.getModel();
                modeloArchivo.removeRow(tablaArchivo.getSelectedRow());
            }

        }
    }

    private void agregarUltimaUbicacion(String archivo, String vendedor) {
        ultimaRuta = tomarRuta(archivo);//Cambiar Franklin Parra por el nombre del Usuario . main.getVendedor();
        String ruta = "\\\\atenea\\SGDS\\Data\\2. Usuarios\\" + vendedor + "\\1. Propiedades";
        new Propiedades(ruta).setPropert("last.location", ultimaRuta);

    }

    private String tomarRuta(String archivo) {
        String temp = "";
        String separador = Pattern.quote("\\");

        String[] partes = archivo.split(separador);
        for (int i = 0; i < partes.length - 1; i++) {

            if (i == partes.length - 2) {
                temp += partes[i] + "/";//Si es la ultimna carpeta de la ruta se Coloca /
            } else {
                temp += partes[i] + "\\";//Mientras no sea la ultima carpeta se coloca \
            }

        }
        return temp;
    }

    private void limpiarCampos() {
        idPresupuesto.setText("");
        nameCliente.setText("@Nombre de Cliente");
        nameVendedor.setText("@Nombre Vendedor");
        fechaPresupuesto.setText("@Fecha");
        montoTxt.setText("");
        numeroCot.setText("");
        formaPago.setText("");
        tiempoFabricacion.setText("");
        vaciarTabla();
        tipoPago.setText("@Tipo de Pago Seleccionado");
        nameProductoTxt.setText("");
    }

    private void vaciarTabla() {
        modelo.setRowCount(0);
    }

    private void subirArchivos() {
        //Guardamos las rutas primero en la Base de Datos antes de...

        guardarRutasBDD();

        //Ahora copiamos cada uno de los archivos en el servidor
        int rspx = 0;

        String rut = "\\\\atenea\\sgds\\Data\\1. Clientes\\" + nameCliente.getText() + "\\1. Solicitudes" + "\\" + idSolicitud + "\\2.Cotizacion\\";
        String ruta2 = "\\\\atenea\\sgds\\Data\\1. Clientes\\" + nameCliente.getText() + "\\2. Cotizaciones\\"+numeroCot.getText()+"\\";
        new tools().crearCarpeta(rut);new tools().crearCarpeta(ruta2);
        DefaultTableModel modelo = (DefaultTableModel) tablaArchivo.getModel();
        
        for (int i = 0; i < modelo.getRowCount(); i++) {
            String ruta = tablaArchivo.getValueAt(i, 0).toString();
            String nombreArchivo = new tools().getNombreArchivo(ruta);
            String extension = new tools().getExtesion(ruta);
            new tools().CopiarArchivo(ruta, rut);
            new tools().CopiarArchivo(rut+nombreArchivo+"."+extension, ruta2);
            
        }

        new Thread(this::ocultarCarga).start();
        new rojerusan.RSNotifyFade("¡¡SUCCESS!!", "COTIZACION Creada con Exito para el Presupuesto #" + idPresupuesto.getText()
                + " y Archivos subidos Exitosamente!", 7, RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.SUCCESS).setVisible(true);

        limpiarCampos();
        idPresupuesto.requestFocus();
    }

    private void guardarRutasBDD() {
        DefaultTableModel modelo = (DefaultTableModel) tablaArchivo.getModel();
        int lastCotizacion = new Cotizacion().getLastCotizacion();
        for (int i = 0; i < modelo.getRowCount(); i++) {
            String ruta = tablaArchivo.getValueAt(i, 0).toString();
            new ArchivosCotizacion(lastCotizacion, ruta).insert();
        }
    }

    private String getNombreArchivo(String ruta) {
        String temp = "";
        String separador = Pattern.quote("\\");
        String[] lista = ruta.split(separador);
        for (int i = lista.length - 1; i < lista.length; i++) {
            temp = lista[i];
            String separador2 = Pattern.quote(".");
            String[] lista2 = temp.split(separador2);
            for (int i2 = 0; i2 < lista2.length; i2++) {
                temp = lista2[0];
            }
        }
        return temp;
    }

    private void mostrarCarga() {
        carga.setVisible(true);
    }

    private void ocultarCarga() {
        carga.setVisible(false);
    }

    private void añadirArchivo() {
        ArrayList<String> archivo2 = new ArrayList();
        if (idPresupuesto.getText().length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Debe seleccionar un Presupuesto antes de Elejir un Archivo");
        } else {
            String archivo = "";//main.getVendedor()
            String vendedor = (Main.getVendedor()).equals("vacio") ? "vacio" : Main.getVendedor();

            ultimaRuta = new Propiedades().getLocation(vendedor);//Reemplazar el nombre por Main.getNameUser() Para hacerlo deacuerdo al user
            if (ultimaRuta.length() > 0) {
                archivo2 = (ArrayList<String>) rutas.getRutayArchivoJunto_MULTIPLE(ultimaRuta).clone();
            }

            if (archivo2 != null && archivo2.size() > 0) {

                for (String valor : archivo2) {
                    DefaultTableModel modeloArchivo = (DefaultTableModel) tablaArchivo.getModel();
                    modeloArchivo.addRow(new Object[]{valor});
                    agregarUltimaUbicacion(valor, vendedor);
                }

            }

        }
    }

}
