/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VentanasRST;

import Clases.AvanceCot;
import Clases.AvanceCotObs;
import Clases.Chofer;
import Clases.Conectar;
import Clases.Cotizacion;
import Clases.Despacho;
import Clases.Ganancia;
import Clases.PlaceHolder;
import Clases.Presupuesto;
import Clases.Seguimiento;
import Clases.Solicitud;
import Clases.Vehiculo;
import Clases.tools;
import Ventanas.cargando;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.net.UnknownHostException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.MatteBorder;
import rojerusan.RSNotifyFade;

/**
 *
 * @author soporte
 */
public class newDespacho extends javax.swing.JFrame {

    String estado = "";
    String numGuia = "";
    listarCotDespacho lcd = new listarCotDespacho(this);
    Cotizacion c;
    cargando carga = new cargando();
    Chofer cf;
    Vehiculo vh;
    listarChoferes lc = new listarChoferes(this);
    listarVehiculos lv = new listarVehiculos(this);
    Double montoADespachaRx, montoDespachadoPrevio = 0.0;
    Double toneladasx ;
    public newDespacho() {
        initComponents();
        changeIcon();
        new PlaceHolder("Ingrese la descripción si tiene alguna observación sobre el despacho", obsTxt);
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
        jLabel3 = new javax.swing.JLabel();
        numCot = new javax.swing.JTextField();
        buscarButton = new RSMaterialComponent.RSButtonIconShadow();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        estadoTxt = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        numGuiatxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        obsTxt = new javax.swing.JTextArea();
        rSButtonIconShadow1 = new RSMaterialComponent.RSButtonIconShadow();
        rSButtonMaterialRipple1 = new RSMaterialComponent.RSButtonMaterialRipple();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        choferTxt = new javax.swing.JTextField();
        vehiculoTxt = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        buscarChoferButton = new RSMaterialComponent.RSButtonIconShadow();
        buscarVehiculoButton = new RSMaterialComponent.RSButtonIconShadow();
        rSButtonIconShadow2 = new RSMaterialComponent.RSButtonIconShadow();
        rSButtonIconShadow3 = new RSMaterialComponent.RSButtonIconShadow();
        montoDespachadoTxt = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        toneladasTxt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ingresar Despacho - SDGS");
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(635, 626));
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
        jLabel1.setText("Ingresar Despacho");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/windowclose_104378.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/logo_rossetti 48x48.jpg"))); // NOI18N

        javax.swing.GroupLayout panelHeaderLayout = new javax.swing.GroupLayout(panelHeader);
        panelHeader.setLayout(panelHeaderLayout);
        panelHeaderLayout.setHorizontalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHeaderLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelHeaderLayout.setVerticalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
        );

        numCot.setEditable(false);
        numCot.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        numCot.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        numCot.setToolTipText(buscarButton.getToolTipText());
        numCot.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        numCot.setOpaque(false);
        numCot.setSelectionColor(new java.awt.Color(161, 54, 48));
        numCot.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                numCotFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                numCotFocusLost(evt);
            }
        });
        numCot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                numCotMouseExited(evt);
            }
        });
        numCot.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                numCotKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numCotKeyTyped(evt);
            }
        });

        buscarButton.setBackground(new java.awt.Color(153, 153, 153));
        buscarButton.setToolTipText("Presione F1 o en la Lupa para Buscar las OT. listas");
        buscarButton.setBackgroundHover(new java.awt.Color(102, 102, 102));
        buscarButton.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SEARCH);
        buscarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarButtonActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Seleccione # COT:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("# OT:");

        estadoTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        estadoTxt.setText("@OT");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Ingrese #Num Guia:");

        numGuiatxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        numGuiatxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        numGuiatxt.setText("003-000");
        numGuiatxt.setToolTipText("");
        numGuiatxt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        numGuiatxt.setOpaque(false);
        numGuiatxt.setSelectionColor(new java.awt.Color(161, 54, 48));
        numGuiatxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                numGuiatxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                numGuiatxtFocusLost(evt);
            }
        });
        numGuiatxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                numGuiatxtMouseExited(evt);
            }
        });
        numGuiatxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                numGuiatxtKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numGuiatxtKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Observación:");

        obsTxt.setColumns(20);
        obsTxt.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        obsTxt.setRows(5);
        jScrollPane1.setViewportView(obsTxt);

        rSButtonIconShadow1.setBackground(new java.awt.Color(161, 54, 48));
        rSButtonIconShadow1.setBackgroundHover(new java.awt.Color(77, 164, 98));
        rSButtonIconShadow1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rSButtonIconShadow1.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.DONE);

        rSButtonMaterialRipple1.setBackground(new java.awt.Color(161, 54, 48));
        rSButtonMaterialRipple1.setText("Ingresar Datos");
        rSButtonMaterialRipple1.setBackgroundHover(new java.awt.Color(77, 164, 98));
        rSButtonMaterialRipple1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rSButtonMaterialRipple1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialRipple1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("( Opcional )");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Seleccione Chofer:");

        choferTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        choferTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        choferTxt.setToolTipText("Presione F1 o la Lupa Para buscar ");
        choferTxt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        choferTxt.setOpaque(false);
        choferTxt.setSelectionColor(new java.awt.Color(161, 54, 48));
        choferTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                choferTxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                choferTxtFocusLost(evt);
            }
        });
        choferTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                choferTxtMouseExited(evt);
            }
        });
        choferTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                choferTxtKeyReleased(evt);
            }
        });

        vehiculoTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        vehiculoTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        vehiculoTxt.setToolTipText("Presione F1 o la Lupa Para buscar ");
        vehiculoTxt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        vehiculoTxt.setOpaque(false);
        vehiculoTxt.setSelectionColor(new java.awt.Color(161, 54, 48));
        vehiculoTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                vehiculoTxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                vehiculoTxtFocusLost(evt);
            }
        });
        vehiculoTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                vehiculoTxtMouseExited(evt);
            }
        });
        vehiculoTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                vehiculoTxtKeyReleased(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Seleccione Vehiculo:");

        buscarChoferButton.setBackground(new java.awt.Color(153, 153, 153));
        buscarChoferButton.setToolTipText("Presione Para buscar listados de Chofer");
        buscarChoferButton.setBackgroundHover(new java.awt.Color(102, 102, 102));
        buscarChoferButton.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SEARCH);
        buscarChoferButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarChoferButtonActionPerformed(evt);
            }
        });

        buscarVehiculoButton.setBackground(new java.awt.Color(153, 153, 153));
        buscarVehiculoButton.setToolTipText("Presione Para buscar listados de Vehiculos");
        buscarVehiculoButton.setBackgroundHover(new java.awt.Color(102, 102, 102));
        buscarVehiculoButton.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SEARCH);
        buscarVehiculoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarVehiculoButtonActionPerformed(evt);
            }
        });

        rSButtonIconShadow2.setBackground(new java.awt.Color(153, 153, 153));
        rSButtonIconShadow2.setToolTipText("Limpiar Campo de Chofer");
        rSButtonIconShadow2.setBackgroundHover(new java.awt.Color(161, 54, 48));
        rSButtonIconShadow2.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.CLEAR);
        rSButtonIconShadow2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonIconShadow2ActionPerformed(evt);
            }
        });

        rSButtonIconShadow3.setBackground(new java.awt.Color(153, 153, 153));
        rSButtonIconShadow3.setToolTipText("Limpiar Campo de Vehiculo");
        rSButtonIconShadow3.setBackgroundHover(new java.awt.Color(161, 54, 48));
        rSButtonIconShadow3.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.CLEAR);
        rSButtonIconShadow3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonIconShadow3ActionPerformed(evt);
            }
        });

        montoDespachadoTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        montoDespachadoTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        montoDespachadoTxt.setToolTipText("");
        montoDespachadoTxt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        montoDespachadoTxt.setOpaque(false);
        montoDespachadoTxt.setSelectionColor(new java.awt.Color(161, 54, 48));
        montoDespachadoTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                montoDespachadoTxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                montoDespachadoTxtFocusLost(evt);
            }
        });
        montoDespachadoTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                montoDespachadoTxtMouseExited(evt);
            }
        });
        montoDespachadoTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                montoDespachadoTxtKeyReleased(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("Monto a Despachar:");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("Peso en KGs");

        toneladasTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        toneladasTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        toneladasTxt.setToolTipText("");
        toneladasTxt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        toneladasTxt.setOpaque(false);
        toneladasTxt.setSelectionColor(new java.awt.Color(161, 54, 48));
        toneladasTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                toneladasTxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                toneladasTxtFocusLost(evt);
            }
        });
        toneladasTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                toneladasTxtMouseExited(evt);
            }
        });
        toneladasTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                toneladasTxtKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                toneladasTxtKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout panelCentralLayout = new javax.swing.GroupLayout(panelCentral);
        panelCentral.setLayout(panelCentralLayout);
        panelCentralLayout.setHorizontalGroup(
            panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelCentralLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCentralLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(10, 10, 10)
                        .addComponent(numCot, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buscarButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(estadoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCentralLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel10)
                        .addGap(21, 21, 21)
                        .addComponent(vehiculoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buscarVehiculoButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rSButtonIconShadow3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCentralLayout.createSequentialGroup()
                        .addGap(340, 340, 340)
                        .addComponent(jLabel6)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel7))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelCentralLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelCentralLayout.createSequentialGroup()
                                .addComponent(rSButtonIconShadow1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(rSButtonMaterialRipple1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(panelCentralLayout.createSequentialGroup()
                                    .addComponent(jLabel11)
                                    .addGap(18, 18, 18)
                                    .addComponent(montoDespachadoTxt)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel12)
                                    .addGap(18, 18, 18)
                                    .addComponent(toneladasTxt))
                                .addGroup(panelCentralLayout.createSequentialGroup()
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(21, 21, 21)
                                    .addComponent(choferTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(24, 24, 24)
                                    .addComponent(buscarChoferButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(rSButtonIconShadow2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(panelCentralLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(26, 26, 26)
                        .addComponent(numGuiatxt, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelCentralLayout.setVerticalGroup(
            panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCentralLayout.createSequentialGroup()
                .addComponent(panelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numCot, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(estadoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelCentralLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(numGuiatxt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(montoDespachadoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(toneladasTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelCentralLayout.createSequentialGroup()
                        .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buscarChoferButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelCentralLayout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(choferTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(rSButtonIconShadow2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelCentralLayout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(vehiculoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCentralLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rSButtonIconShadow3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(buscarVehiculoButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(7, 7, 7)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rSButtonIconShadow1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSButtonMaterialRipple1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCentral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCentral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void numCotFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_numCotFocusGained
        numCot.setBorder(new MatteBorder(0, 0, 2, 0, new Color(161, 54, 48)));
    }//GEN-LAST:event_numCotFocusGained

    private void numCotFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_numCotFocusLost
        numCot.setBorder(new MatteBorder(0, 0, 1, 0, Color.BLACK));
    }//GEN-LAST:event_numCotFocusLost

    private void numCotMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_numCotMouseExited

        //
    }//GEN-LAST:event_numCotMouseExited

    private void numCotKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numCotKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_F1) {
            lcd.setVisible(true);
        }
    }//GEN-LAST:event_numCotKeyReleased

    private void buscarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarButtonActionPerformed
        lcd.setVisible(true);

    }//GEN-LAST:event_buscarButtonActionPerformed

    private void numGuiatxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_numGuiatxtFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_numGuiatxtFocusGained

    private void numGuiatxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_numGuiatxtFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_numGuiatxtFocusLost

    private void numGuiatxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_numGuiatxtMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_numGuiatxtMouseExited

    private void numGuiatxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numGuiatxtKeyReleased
      if(numGuiatxt.getText().length() < 7){
          numGuiatxt.setText("003-000");
      }
    }//GEN-LAST:event_numGuiatxtKeyReleased

    private void rSButtonMaterialRipple1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialRipple1ActionPerformed
        if (validarDatos()) {
            toneladasx= Double.parseDouble(toneladasTxt.getText()); 
            new Thread(this::ingresarDatos).start();
        }
    }//GEN-LAST:event_rSButtonMaterialRipple1ActionPerformed

    private void choferTxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_choferTxtFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_choferTxtFocusGained

    private void choferTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_choferTxtFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_choferTxtFocusLost

    private void choferTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_choferTxtMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_choferTxtMouseExited

    private void choferTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_choferTxtKeyReleased
        if (evt.getKeyChar() == evt.VK_F1) {
            lc.setVisible(true);
        } else if (evt.getKeyChar() == evt.VK_ENTER) {
            String idTemp = choferTxt.getText();
            if (new tools().ComprobarNumeros(idTemp)) {
                cf = null;
                int id = Integer.parseInt(idTemp);
                cf = new Chofer(id).buscarID();
                if (cf != null) {
                    String nombreCompleto = cf.getNombres() + " " + cf.getApellidos();
                    choferTxt.setText(nombreCompleto.equals("null null") ? "" : nombreCompleto);
                }
            } else {
                choferTxt.setText("");
            }
        }
    }//GEN-LAST:event_choferTxtKeyReleased

    private void buscarChoferButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarChoferButtonActionPerformed
        lc.setVisible(true);
    }//GEN-LAST:event_buscarChoferButtonActionPerformed

    private void vehiculoTxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_vehiculoTxtFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_vehiculoTxtFocusGained

    private void vehiculoTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_vehiculoTxtFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_vehiculoTxtFocusLost

    private void vehiculoTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vehiculoTxtMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_vehiculoTxtMouseExited

    private void vehiculoTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_vehiculoTxtKeyReleased
        if (evt.getKeyChar() == evt.VK_F1) {
            lv.setVisible(true);
        } else if (evt.getKeyChar() == evt.VK_ENTER) {
            String idTemp = vehiculoTxt.getText();
            if (new tools().ComprobarNumeros(idTemp)) {
                vh = null;
                int id = Integer.parseInt(idTemp);
                vh = new Vehiculo(id).buscarID();
                if (vh != null) {
                    vehiculoTxt.setText(vh.getApodo());
                }
            } else {
                vehiculoTxt.setText("");
            }
        }
    }//GEN-LAST:event_vehiculoTxtKeyReleased

    private void buscarVehiculoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarVehiculoButtonActionPerformed
        lv.setVisible(true);
    }//GEN-LAST:event_buscarVehiculoButtonActionPerformed

    private void numCotKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numCotKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_numCotKeyTyped

    private void rSButtonIconShadow2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonIconShadow2ActionPerformed
        choferTxt.setText("");
    }//GEN-LAST:event_rSButtonIconShadow2ActionPerformed

    private void rSButtonIconShadow3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonIconShadow3ActionPerformed
        vehiculoTxt.setText("");
    }//GEN-LAST:event_rSButtonIconShadow3ActionPerformed
    int xx, yy;
    private void panelHeaderMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelHeaderMousePressed
        setOpacity((float) 0.8);
        xx = evt.getX();
        yy = evt.getY();
    }//GEN-LAST:event_panelHeaderMousePressed

    private void panelHeaderMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelHeaderMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - yy);
    }//GEN-LAST:event_panelHeaderMouseDragged

    private void panelHeaderMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelHeaderMouseReleased
        setOpacity((float) 1.0);
    }//GEN-LAST:event_panelHeaderMouseReleased

    private void montoDespachadoTxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_montoDespachadoTxtFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_montoDespachadoTxtFocusGained

    private void montoDespachadoTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_montoDespachadoTxtFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_montoDespachadoTxtFocusLost

    private void montoDespachadoTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_montoDespachadoTxtMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_montoDespachadoTxtMouseExited

    private void montoDespachadoTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_montoDespachadoTxtKeyReleased
        new tools().soloDoubleyCantidadDigitos(evt, montoDespachadoTxt, 10);
    }//GEN-LAST:event_montoDespachadoTxtKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked

    }//GEN-LAST:event_jLabel1MouseClicked

    private void toneladasTxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_toneladasTxtFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_toneladasTxtFocusGained

    private void toneladasTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_toneladasTxtFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_toneladasTxtFocusLost

    private void toneladasTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toneladasTxtMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_toneladasTxtMouseExited

    private void toneladasTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_toneladasTxtKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_toneladasTxtKeyReleased

    private void toneladasTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_toneladasTxtKeyTyped
      new tools().soloNumerosyCantidadDigitos(evt, toneladasTxt, 12);
    }//GEN-LAST:event_toneladasTxtKeyTyped

    private void numGuiatxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numGuiatxtKeyTyped
       if(numGuiatxt.getText().length() > 12){
           evt.consume();
       }
    }//GEN-LAST:event_numGuiatxtKeyTyped

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
            java.util.logging.Logger.getLogger(newDespacho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(newDespacho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(newDespacho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(newDespacho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(newPresupuesto.class.getName()).log(Level.SEVERE, null, ex);
                }
                new newDespacho().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private RSMaterialComponent.RSButtonIconShadow buscarButton;
    private RSMaterialComponent.RSButtonIconShadow buscarChoferButton;
    private RSMaterialComponent.RSButtonIconShadow buscarVehiculoButton;
    public static javax.swing.JTextField choferTxt;
    private javax.swing.JLabel estadoTxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTextField montoDespachadoTxt;
    public static javax.swing.JTextField numCot;
    public static javax.swing.JTextField numGuiatxt;
    private javax.swing.JTextArea obsTxt;
    private javax.swing.JPanel panelCentral;
    private rojeru_san.rspanel.RSPanelGradiente panelHeader;
    private RSMaterialComponent.RSButtonIconShadow rSButtonIconShadow1;
    private RSMaterialComponent.RSButtonIconShadow rSButtonIconShadow2;
    private RSMaterialComponent.RSButtonIconShadow rSButtonIconShadow3;
    private RSMaterialComponent.RSButtonMaterialRipple rSButtonMaterialRipple1;
    public static javax.swing.JTextField toneladasTxt;
    public static javax.swing.JTextField vehiculoTxt;
    // End of variables declaration//GEN-END:variables

    public void setCotizacion(Cotizacion c) {
        this.c = c;
        obtenerDatos();
    }

    private void obtenerDatos() {
        numCot.setText(c.getNumeroCot() + "");
        montoDespachadoPrevio = 0.0;
        estadoTxt.setText(c.getNumOt());
        DecimalFormat df = new DecimalFormat("#.00");
        ArrayList<Despacho> lista = (ArrayList) new Despacho().listarxCot(c.getID()).clone();
            
        for (Despacho d : lista) {
            montoDespachadoPrevio += d.getMontoDespachado();
        }

        if (montoDespachadoPrevio < 1) {

            montoDespachadoTxt.setText(df.format(c.getMontoOc()) + "");
            montoADespachaRx = c.getMontoOc();
            
        } else {
            montoADespachaRx = c.getMontoOc() - montoDespachadoPrevio;
            montoDespachadoTxt.setText(df.format(montoADespachaRx) + "");
        }

    }

    private boolean validarDatos() {
        boolean rsp = false;

        if (numCot.getText().length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Debe seleccionar una OT");
            numCot.requestFocus();
        } else {
            if (numGuiatxt.getText().length() == 0) {
                JOptionPane.showMessageDialog(rootPane, "Ingrese la Guia usada para el Despacho");
                numGuiatxt.requestFocus();
            } else {
                if (choferTxt.getText().length() == 0) {
                    JOptionPane.showMessageDialog(rootPane, "Seleccione Chofer");
                    choferTxt.requestFocus();
                } else {
                    if (vehiculoTxt.getText().length() == 0) {
                        JOptionPane.showMessageDialog(rootPane, "Seleccione Vehiculo");
                        vehiculoTxt.requestFocus();
                    } else {
                        if (montoDespachadoTxt.getText().length() == 0) {
                            JOptionPane.showMessageDialog(rootPane, "Ingrese el Monto Despachado");
                            montoDespachadoTxt.requestFocus();
                        } else {
                            Double despchadoTemp = Double.parseDouble(montoDespachadoTxt.getText());
                            if (despchadoTemp > montoADespachaRx) {
                                if (montoDespachadoPrevio < 1) {
                                    JOptionPane.showMessageDialog(rootPane, "El Monto Despachado no puede ser Mayor al Aceptado por la OC");
                                } else {
                                    JOptionPane.showMessageDialog(rootPane, "El Monto Despachado no puede ser Mayor al Restante por Despachar");
                                }

                                montoDespachadoTxt.requestFocus();
                            } else {
                                String numGuia = numGuiatxt.getText();
                                Despacho d = new Despacho().buscarxGuia(numGuia);
                                if (d.getId() > 0) {
                                    JOptionPane.showMessageDialog(rootPane, "Número de Guia ingresado previamente, favor ingrese otro");
                                } else {
                                    if (toneladasTxt.getText().length() < 1) {
                                        JOptionPane.showMessageDialog(rootPane, "Ingrese las Toneladas");
                                    } else {
                                        rsp = true;
                                    }

                                }

                            }
                        }
                    }
                }

            }
        }

        return rsp;
    }

    private void ingresarDatos() {
        new Thread(this::mostrarCarga).start();
        numGuia = numGuiatxt.getText();
        String fecha = new Conectar().getFechaServidor();
        String vendedor = (Main.getVendedor()).equals("vacio") ? "vacio" : Main.getVendedor();
        String ip = "";
        try {
            ip = new tools().Obtener_ip() == null ? "0.0.0.0" : new tools().Obtener_ip();
        } catch (UnknownHostException ex) {
            Logger.getLogger(newDespacho.class.getName()).log(Level.SEVERE, null, ex);
        }

        Double montoDespachadoTemp = Double.parseDouble(montoDespachadoTxt.getText());

        obtenerEstado();
        c.setEstado(estado);

        c.update();
        
            
        c.updateToneladas(c.getToneladas()+toneladasx);
        
        Presupuesto p = new Presupuesto().buscarID(c.getPresupuesto().getIdPresupuesto());
        p.setEstado(estado);
        p.update();

        Solicitud s = new Solicitud().buscarID(c.getPresupuesto().getSolicitud().getId());
        s.setEstado(estado);
        s.update();

        new Seguimiento(
                c.getIdCliente(), fecha, "Despacho", estado, vendedor, c.getID(), ip
        ).insert();

        String guia = numGuiatxt.getText();
        String obs = obsTxt.getText().length() == 0 ? "sin obs" : obsTxt.getText();
        String chofer = choferTxt.getText();
        String vehiculo = vehiculoTxt.getText();

        new Despacho(
                c.getID(), guia, obs, vendedor, fecha, chofer, vehiculo, montoDespachadoTemp,toneladasx
        ).insert();

        Ganancia g = new Ganancia().buscarxCot(c.getID());
        g.updateMontoDespachado(g.getDespachado() + montoDespachadoTemp);

        //ACTUALIZAR EL PROGRESO DEL DESPACHO
        AvanceCot aC = new AvanceCot().buscarIdCot(c.getID());
        Double montoOriginal = c.getMontoOc();
        DecimalFormat df = new DecimalFormat("#.00");
        String valorTemp = df.format((Double.parseDouble(aC.getDespacho()) + ((montoDespachadoTemp * 100) / montoOriginal)));
        aC.setDespacho(valorTemp);
        aC.update();

        new AvanceCotObs(aC.getId(), "Despacho", obs, valorTemp).Insert();

        new Thread(this::ocultarCarga).start();
        new rojerusan.RSNotifyFade("¡¡SUCCESS!!", "Se ha registrado la información del despacho Exitosamente. ", 8, RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.SUCCESS).setVisible(true);
        limpiarCampos();

    }

    private void obtenerEstado() {
        String estadoTemp = c.getEstado();
        Double montoDespachadoTemp = Double.parseDouble(montoDespachadoTxt.getText());
        if (montoDespachadoPrevio < 1) { // En caso de que el no Tenga despachos previos

            if (estadoTemp.equalsIgnoreCase("Plano Confirmado - Esperando Entrega")) { // En caso de que se despache antes de generar Cierre

                if (montoDespachadoTemp < montoADespachaRx) {
                    estado = "Entrega Parcial - Esperando Cierre";
                } else {
                    estado = "Entregado - Esperando Cierre";
                }

            } else if (estadoTemp.equals("Cierre Listo - Esperando Entrega")) { // En caso de que el despacho sea post Cierre

                if (montoDespachadoTemp < montoADespachaRx) {
                    estado = "Entrega Parcial - Cierre Listo";
                } else {
                    estado = "Proceso Terminado";

                }

            }
        } else { // en caso de que TENGA despacho PREVIO
            if (estadoTemp.equals("Entrega Parcial - Esperando Cierre") || estadoTemp.equals("Plano Confirmado - Esperando Entrega")) { // En caso de que se despache antes de generar Cierre

                if (montoDespachadoTemp < montoADespachaRx) {
                    estado = "Entrega Parcial - Esperando Cierre";

                } else {
                    estado = "Entregado - Esperando Cierre";
                }

            } else if (estadoTemp.equals("Cierre Listo - Esperando Entrega")) { // En caso de que el despacho sea post Cierre

                if (montoDespachadoTemp < montoADespachaRx) {
                    estado = "Entrega Parcial - Cierre Listo";
                } else {
                    estado = "Proceso Terminado";
                }

            }
        }

    }

    private void limpiarCampos() {
        estadoTxt.setText("@Estado");
        numGuiatxt.setText("003-000");
        choferTxt.setText("");
        vehiculoTxt.setText("");
        obsTxt.setText("");
        numCot.setText("");
        montoDespachadoTxt.setText("");
        estadoTxt.setText("");
        toneladasTxt.setText("");
    }

    private void mostrarCarga() {
        carga.setVisible(true);
    }

    private void ocultarCarga() {
        carga.setVisible(false);
    }

    public void setChofer(Chofer cf) {
        this.cf = cf;
        String nombreCompleto = cf.getNombres() + " " + cf.getApellidos();
        choferTxt.setText(nombreCompleto);
    }

    public void setVehiculo(Vehiculo vh) {
        this.vh = vh;
        vehiculoTxt.setText(vh.getApodo());

    }
}
