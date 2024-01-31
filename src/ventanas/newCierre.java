/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VentanasRST;

import Clases.ArchivosCierre;
import Clases.Conectar;
import Clases.Cotizacion;
import Clases.Ganancia;
import Clases.Presupuesto;
import Clases.Propiedades;
import Clases.Rutas;
import Clases.Seguimiento;
import Clases.Solicitud;
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
public class newCierre extends javax.swing.JFrame {

    Cotizacion c;
    listarCotsinCerrar lc = new listarCotsinCerrar(this);
    String ultimaRuta = "";
    Rutas rutas = new Rutas();
    Double montoOtx, montoOcx, margenx, porcentajex, toneladasx;
    String estado = ""; //Es actualizado con el metodo - actualizarEstado()

    String ip = "0.0.0.0";
    String vendedor;
    String fecha;
    cargando carga = new cargando();
    boolean espera = false;

    public newCierre() {
        initComponents();
        changeIcon();
        idCotizacion.requestFocus();

        
        jLabel12.setVisible(false);
        toneladasTxt.setVisible(false);
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
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        idCotizacion = new javax.swing.JTextField();
        rSButtonIconShadow1 = new RSMaterialComponent.RSButtonIconShadow();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaArchivo = new rojerusan.RSTableMetro();
        addButton = new RSMaterialComponent.RSButtonIconShadow();
        deleteButton = new RSMaterialComponent.RSButtonIconShadow();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        montoOTtxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        montoOctxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        margenTxt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        porcentajeTxt = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        rSButtonRoundEffectIcon1 = new rojeru_san.rsbutton.RSButtonRoundEffectIcon();
        toneladasTxt = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        deleteButton1 = new RSMaterialComponent.RSButtonIconShadow();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Generar Cierre de Cotización - SDGS");
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
        jLabel1.setText("Generar Cierre de Cotización");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/windowclose_104378.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/logo_rossetti 48x48.jpg"))); // NOI18N

        javax.swing.GroupLayout panelHeaderLayout = new javax.swing.GroupLayout(panelHeader);
        panelHeader.setLayout(panelHeaderLayout);
        panelHeaderLayout.setHorizontalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHeaderLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelHeaderLayout.setVerticalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHeaderLayout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 8, Short.MAX_VALUE))
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Seleccione Cotización:");

        idCotizacion.setEditable(false);
        idCotizacion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        idCotizacion.setForeground(new java.awt.Color(161, 54, 48));
        idCotizacion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        idCotizacion.setToolTipText("Presione F1 o la Lupa para buscar listado de Cotizaciones");
        idCotizacion.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        idCotizacion.setOpaque(false);
        idCotizacion.setSelectionColor(new java.awt.Color(161, 54, 48));
        idCotizacion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                idCotizacionFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                idCotizacionFocusLost(evt);
            }
        });
        idCotizacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                idCotizacionMouseExited(evt);
            }
        });
        idCotizacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                idCotizacionKeyReleased(evt);
            }
        });

        rSButtonIconShadow1.setBackground(new java.awt.Color(161, 54, 48));
        rSButtonIconShadow1.setBackgroundHover(new java.awt.Color(180, 40, 70));
        rSButtonIconShadow1.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SEARCH);
        rSButtonIconShadow1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonIconShadow1ActionPerformed(evt);
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

        addButton.setBackground(new java.awt.Color(58, 66, 226));
        addButton.setToolTipText("Ingrese el Excel de Cierre");
        addButton.setBackgroundHover(new java.awt.Color(77, 164, 98));
        addButton.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.ADD);
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        deleteButton.setBackground(new java.awt.Color(102, 102, 102));
        deleteButton.setToolTipText("Eliminar Todos los Archivos subidos");
        deleteButton.setBackgroundHover(new java.awt.Color(161, 54, 48));
        deleteButton.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.CLEAR);
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Calculos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(102, 102, 102))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Costo de Fabricación OT:");

        montoOTtxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        montoOTtxt.setForeground(new java.awt.Color(161, 54, 48));
        montoOTtxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        montoOTtxt.setText("0");
        montoOTtxt.setToolTipText("Presione F1 o la Lupa para buscar listado de Cotizaciones");
        montoOTtxt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        montoOTtxt.setOpaque(false);
        montoOTtxt.setSelectionColor(new java.awt.Color(161, 54, 48));
        montoOTtxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                montoOTtxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                montoOTtxtFocusLost(evt);
            }
        });
        montoOTtxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                montoOTtxtMouseExited(evt);
            }
        });
        montoOTtxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                montoOTtxtKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                montoOTtxtKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("$");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("$");

        montoOctxt.setEditable(false);
        montoOctxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        montoOctxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        montoOctxt.setToolTipText("Monto Aprobado por el Cliente");
        montoOctxt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        montoOctxt.setOpaque(false);
        montoOctxt.setSelectionColor(new java.awt.Color(161, 54, 48));
        montoOctxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                montoOctxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                montoOctxtFocusLost(evt);
            }
        });
        montoOctxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                montoOctxtMouseExited(evt);
            }
        });
        montoOctxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                montoOctxtKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                montoOctxtKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Monto de la OC:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Margen:");

        margenTxt.setEditable(false);
        margenTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        margenTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        margenTxt.setToolTipText("Margen Obtenido = Montos (OC-OT)");
        margenTxt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        margenTxt.setOpaque(false);
        margenTxt.setSelectionColor(new java.awt.Color(161, 54, 48));
        margenTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                margenTxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                margenTxtFocusLost(evt);
            }
        });
        margenTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                margenTxtMouseExited(evt);
            }
        });
        margenTxt.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                margenTxtPropertyChange(evt);
            }
        });
        margenTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                margenTxtKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                margenTxtKeyTyped(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("$");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Porcentaje:");

        porcentajeTxt.setEditable(false);
        porcentajeTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        porcentajeTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        porcentajeTxt.setToolTipText("Porcentaje = (Margen * 100) / Monto OC");
        porcentajeTxt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        porcentajeTxt.setOpaque(false);
        porcentajeTxt.setSelectionColor(new java.awt.Color(161, 54, 48));
        porcentajeTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                porcentajeTxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                porcentajeTxtFocusLost(evt);
            }
        });
        porcentajeTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                porcentajeTxtMouseExited(evt);
            }
        });
        porcentajeTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                porcentajeTxtKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                porcentajeTxtKeyTyped(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("%");

        rSButtonRoundEffectIcon1.setBackground(new java.awt.Color(161, 54, 48));
        rSButtonRoundEffectIcon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/emblemdefault_93502.png"))); // NOI18N
        rSButtonRoundEffectIcon1.setText("    Registrar Cierre");
        rSButtonRoundEffectIcon1.setColorHover(new java.awt.Color(180, 40, 70));
        rSButtonRoundEffectIcon1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonRoundEffectIcon1ActionPerformed(evt);
            }
        });

        toneladasTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        toneladasTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        toneladasTxt.setText("0");
        toneladasTxt.setToolTipText("Porcentaje = (Margen * 100) / Monto OC");
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

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("Peso en Kgs: ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(montoOctxt, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(montoOTtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(margenTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel12)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(toneladasTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel10)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(porcentajeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel11)))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rSButtonRoundEffectIcon1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(montoOTtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(montoOctxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(margenTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel7))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(porcentajeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(toneladasTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addComponent(rSButtonRoundEffectIcon1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        deleteButton1.setBackground(new java.awt.Color(153, 153, 153));
        deleteButton1.setToolTipText("Eliminar Todos los Archivos subidos");
        deleteButton1.setBackgroundHover(new java.awt.Color(161, 54, 48));
        deleteButton1.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.CLEAR);
        deleteButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCentralLayout = new javax.swing.GroupLayout(panelCentral);
        panelCentral.setLayout(panelCentralLayout);
        panelCentralLayout.setHorizontalGroup(
            panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCentralLayout.createSequentialGroup()
                .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelCentralLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(idCotizacion, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rSButtonIconShadow1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(deleteButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCentralLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelCentralLayout.createSequentialGroup()
                                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(panelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelCentralLayout.setVerticalGroup(
            panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCentralLayout.createSequentialGroup()
                .addComponent(panelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCentralLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(idCotizacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(rSButtonIconShadow1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deleteButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(panelCentralLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
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

    private void idCotizacionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_idCotizacionFocusGained
        idCotizacion.setBorder(new MatteBorder(0, 0, 2, 0, new Color(161, 54, 48)));
    }//GEN-LAST:event_idCotizacionFocusGained

    private void idCotizacionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_idCotizacionFocusLost
        idCotizacion.setBorder(new MatteBorder(0, 0, 1, 0, Color.BLACK));
    }//GEN-LAST:event_idCotizacionFocusLost

    private void idCotizacionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_idCotizacionMouseExited

        //
    }//GEN-LAST:event_idCotizacionMouseExited

    private void idCotizacionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idCotizacionKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_F1) {
            lc.setVisible(true);
        }
    }//GEN-LAST:event_idCotizacionKeyReleased

    private void rSButtonIconShadow1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonIconShadow1ActionPerformed
        lc.setVisible(true);
    }//GEN-LAST:event_rSButtonIconShadow1ActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        añadirArchivo();
    }//GEN-LAST:event_addButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        limpiarArchivos();
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void montoOTtxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_montoOTtxtFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_montoOTtxtFocusGained

    private void montoOTtxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_montoOTtxtFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_montoOTtxtFocusLost

    private void montoOTtxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_montoOTtxtMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_montoOTtxtMouseExited

    private void montoOTtxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_montoOTtxtKeyReleased
        if (new tools().soloDoubleyCantidadDigitos(evt, montoOTtxt, 10)
                && montoOTtxt.getText().length() > 0
                && idCotizacion.getText().length() > 0) {

            montoOtx = Double.parseDouble(montoOTtxt.getText());
            calcularDatos();
        }
    }//GEN-LAST:event_montoOTtxtKeyReleased

    private void montoOTtxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_montoOTtxtKeyTyped


    }//GEN-LAST:event_montoOTtxtKeyTyped

    private void montoOctxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_montoOctxtFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_montoOctxtFocusGained

    private void montoOctxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_montoOctxtFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_montoOctxtFocusLost

    private void montoOctxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_montoOctxtMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_montoOctxtMouseExited

    private void montoOctxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_montoOctxtKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_montoOctxtKeyReleased

    private void montoOctxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_montoOctxtKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_montoOctxtKeyTyped

    private void margenTxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_margenTxtFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_margenTxtFocusGained

    private void margenTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_margenTxtFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_margenTxtFocusLost

    private void margenTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_margenTxtMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_margenTxtMouseExited

    private void margenTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_margenTxtKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_margenTxtKeyReleased

    private void margenTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_margenTxtKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_margenTxtKeyTyped

    private void porcentajeTxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_porcentajeTxtFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_porcentajeTxtFocusGained

    private void porcentajeTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_porcentajeTxtFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_porcentajeTxtFocusLost

    private void porcentajeTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_porcentajeTxtMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_porcentajeTxtMouseExited

    private void porcentajeTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_porcentajeTxtKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_porcentajeTxtKeyReleased

    private void porcentajeTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_porcentajeTxtKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_porcentajeTxtKeyTyped

    private void margenTxtPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_margenTxtPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_margenTxtPropertyChange

    private void deleteButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButton1ActionPerformed
        if (idCotizacion.getText().length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "No hay Datos por borrar");
        } else {
            int rsp = JOptionPane.showConfirmDialog(rootPane, "¿Está seguro de borrar los Datos?");
            if (rsp == JOptionPane.OK_OPTION) {
                limpiarDatos();
            }
        }
    }//GEN-LAST:event_deleteButton1ActionPerformed

    private void rSButtonRoundEffectIcon1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonRoundEffectIcon1ActionPerformed
        if (validarTodosCampos()) {
            new Thread(this::mostrarCarga).start();
            new Thread(this::actualizarRegistros).start();
            new Thread(this::subirArchivos).start();

        }
    }//GEN-LAST:event_rSButtonRoundEffectIcon1ActionPerformed
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
        new tools().soloDoubleyCantidadDigitos(evt, toneladasTxt, 7);
    }//GEN-LAST:event_toneladasTxtKeyReleased

    private void toneladasTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_toneladasTxtKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_toneladasTxtKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(newCierre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(newCierre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(newCierre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(newCierre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new newCierre().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private RSMaterialComponent.RSButtonIconShadow addButton;
    private RSMaterialComponent.RSButtonIconShadow deleteButton;
    private RSMaterialComponent.RSButtonIconShadow deleteButton1;
    public static javax.swing.JTextField idCotizacion;
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
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    public static javax.swing.JTextField margenTxt;
    public static javax.swing.JTextField montoOTtxt;
    public static javax.swing.JTextField montoOctxt;
    private javax.swing.JPanel panelCentral;
    private rojeru_san.rspanel.RSPanelGradiente panelHeader;
    public static javax.swing.JTextField porcentajeTxt;
    private RSMaterialComponent.RSButtonIconShadow rSButtonIconShadow1;
    private rojeru_san.rsbutton.RSButtonRoundEffectIcon rSButtonRoundEffectIcon1;
    private rojerusan.RSTableMetro tablaArchivo;
    public static javax.swing.JTextField toneladasTxt;
    // End of variables declaration//GEN-END:variables

    private void actualizarEstado() {
        //Entrega Parcial - Esperando Cierre
        //Entregado - Esperando Cierre
        //Plano Confirmado - Esperando Entrega
        String estadoTemp = c.getEstado();

        if (estadoTemp.equals("Entrega Parcial - Esperando Cierre")) {
            estado = "Entrega Parcial - Cierre Listo";
        } else if (estadoTemp.equals("Entregado - Esperando Cierre")) {
            estado = "Proceso Terminado";
        } else if (estadoTemp.equals("Plano Confirmado - Esperando Entrega")) {
            estado = "Cierre Listo - Esperando Entrega";
        }
        calcularDatos();
    }

    public void setCotizacion(Cotizacion c) {
        this.c = c;
        mostrarDatos();
        vendedor = (Main.getVendedor()).equals("vacio") ? "vacio" : Main.getVendedor();
        fecha = new Conectar().getFechaServidor();
    }

    private void limpiarDatos() {
        idCotizacion.setText("");
        montoOTtxt.setText("");
        montoOctxt.setText("");
        margenTxt.setText("");
        porcentajeTxt.setText("");
        toneladasTxt.setText("0");
    }

    private void mostrarDatos() {
        idCotizacion.setText(c.getID() + "");
        montoOcx = c.getMontoOc();

        montoOctxt.setText(montoOcx + "");
        montoOTtxt.requestFocus();
        montoOTtxt.setText("");
    }

    private void calcularDatos() {
        DecimalFormat df = new DecimalFormat("#.00");
        margenx = montoOcx - montoOtx;
        margenTxt.setText(df.format(margenx));
        margenx = Double.parseDouble(margenTxt.getText());

        porcentajex = (margenx * 100) / montoOcx;
        porcentajeTxt.setText(df.format(porcentajex));
        porcentajex = Double.parseDouble(porcentajeTxt.getText());

        toneladasx = Double.parseDouble(toneladasTxt.getText());

    }

    private void añadirArchivo() {
        ArrayList<String> archivo2 = new ArrayList();
        if (idCotizacion.getText().length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Debe seleccionar Antes una Cotización para Añadir la Respuesta");
        } else {
            String archivo = "";//main.getVendedor()
            String vendedor = (Main.getVendedor()).equals("vacio") ? "vacio" : Main.getVendedor();

            ultimaRuta = new Propiedades().getLocation(vendedor);//Reemplazar el nombre por Main.getNameUser() Para hacerlo deacuerdo al user
            if (ultimaRuta.length() > 0) {
                archivo2 = (ArrayList<String>) rutas.getRutayArchivoJunto_MULTIPLE(ultimaRuta).clone();
            }
            /*else {
                archivo = rutas.getRutayArchivoJuntoCONFILTRO("Seleccione el Presupuesto en Excel (xlsx)", "xlsx");
            }*/

            if (archivo2 != null && archivo2.size() > 0) {

                for (String valor : archivo2) {
                    DefaultTableModel modeloArchivo = (DefaultTableModel) tablaArchivo.getModel();
                    modeloArchivo.addRow(new Object[]{valor});
                    agregarUltimaUbicacion(valor, vendedor);
                }

            }
        }

    }

    private void agregarUltimaUbicacion(String archivo, String vendedor) {
        ultimaRuta = tomarRuta(archivo);//Cambiar Franklin Parra por el nombre del Usuario . main.getVendedor();
        String ruta = "\\\\atenea\\SGDS\\Data\\2. Usuarios\\" + vendedor + "\\1. Propiedades";
        new Propiedades(ruta).setPropert("last.location", ultimaRuta);
        System.out.println(ultimaRuta);

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

    private void limpiarArchivos() {
        DefaultTableModel modelo = (DefaultTableModel) tablaArchivo.getModel();
        if (modelo.getRowCount() == 0) {
            JOptionPane.showMessageDialog(rootPane, "La Tabla se encuentra Vacia. No hay datos por Eliminar", "No hay Datos", JOptionPane.INFORMATION_MESSAGE);
        } else {
            int rsp = JOptionPane.showConfirmDialog(rootPane, "¿Desea Eliminar TODOS los archivos mostrados en la tabla?", "Eliminar Datos - Tabla", JOptionPane.OK_CANCEL_OPTION);
            if (rsp == JOptionPane.OK_OPTION) {
                modelo.setRowCount(0);
            }
        }
    }

    private boolean validarTodosCampos() {
        boolean llave = false;

        if (idCotizacion.getText().length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "No puede Terminar sin seleccionar una Cotización");
        } else {
            DefaultTableModel modelo = (DefaultTableModel) tablaArchivo.getModel();
            if (modelo.getRowCount() < 1) {
                JOptionPane.showMessageDialog(rootPane, "Debe subir al menos 1 Archivo. (Cierre,OC actualizada, Etc)");
            } else {
                if (montoOTtxt.getText().length() == 0) {
                    JOptionPane.showMessageDialog(rootPane, "Ingrese el costo de fabricación de la OT");
                } else {
                   
                        llave = true;
                    
                }
            }
        }

        return llave;
    }

    private void obtenerIP() {
        try {
            ip = new tools().Obtener_ip();
        } catch (UnknownHostException ex) {
            Logger.getLogger(confirmarCotizacion.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(rootPane, ex);
        }
    }

    private void actualizarRegistros() {
        try {
            String vendedor = (Main.getVendedor()).equals("vacio") ? "vacio" : Main.getVendedor();
            obtenerIP();

            actualizarEstado();
            c.setEstado(estado);
            c.update();
            
            Presupuesto p = new Presupuesto().buscarID(c.getPresupuesto().getIdPresupuesto());
            p.setEstado(estado);
            p.update();

            Solicitud s = new Solicitud().buscarID(c.getPresupuesto().getSolicitud().getId());
            s.setEstado(estado);
            s.update();

            new Seguimiento(
                    c.getIdCliente(), fecha, "Cierre", estado, vendedor, c.getID(), ip
            ).insert();

            Ganancia g = new Ganancia().buscarxCot(c.getID());
            g.setCostoProduccion(montoOtx);
            g.setMargen(margenx);
            g.update();
            
             new Thread(this::ocultarCarga).start();
        } catch (Exception ex) {
            Logger.getLogger(confirmarCotizacion.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(rootPane, ex);
        }

    }

    private void subirArchivos() {
        try {

            int idSolicitud = c.getIdSolicitud();
            String cliente = c.getCliente();

            String ruta = "\\\\atenea\\SGDS\\Data\\1. Clientes\\" + cliente + "\\1. Solicitudes\\" + idSolicitud + "\\5.Cierre\\";
            new tools().crearCarpeta(ruta);

            DefaultTableModel modelo = (DefaultTableModel) tablaArchivo.getModel();

            for (int i = 0; i < modelo.getRowCount(); i++) {
                String rutaTemp = tablaArchivo.getValueAt(i, 0).toString();
                new ArchivosCierre(c.getID(), rutaTemp).insert();
                new tools().CopiarArchivo(rutaTemp, ruta);

            }

            new rojerusan.RSNotifyFade("¡¡SUCCESS!!", "Cierre Generado Correctamente!", 8, RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.SUCCESS).setVisible(true);
            new Thread(this::ocultarCarga).start();
            limpiarDatos();
            modelo.setRowCount(0);
        } catch (Exception ex) {
            Logger.getLogger(confirmarCotizacion.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(rootPane, ex);
        }
    }

    private void mostrarCarga() {
        carga.setVisible(true);
    }

    private void ocultarCarga() {
        carga.setVisible(false);
    }
}
