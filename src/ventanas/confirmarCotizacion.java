/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VentanasRST;

import Clases.ArchivosOC;
import Clases.AvanceCot;
import Clases.AvanceCotObs;
import Clases.Conectar;
import Clases.Cotizacion;
import Clases.Ganancia;
import Clases.PlaceHolder;
import Clases.Presupuesto;
import Clases.Propiedades;
import Clases.Rutas;
import Clases.Seguimiento;
import Clases.Solicitud;
import Clases.tools;
import Ventanas.cargando;
import VentanasRST.listarCotizacion;
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
public class confirmarCotizacion extends javax.swing.JFrame {

    listarCotizacion lc = new listarCotizacion(this);
    public static Solicitud s;
    public static Cotizacion c;
    int yLabel;
    String ultimaRuta = "";
    Rutas rutas = new Rutas();
    ArrayList<String> archivos = new ArrayList();
    String estado = "Cot. Aprobada - Esperando Plano";
    cargando carga = new cargando();
    boolean espera = false;
    
    public confirmarCotizacion() {
        initComponents();
        yLabel = panelActualizar.getY();
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
        jLabel9 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        idCotizacion = new javax.swing.JTextField();
        panelDatos = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        nameCliente = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        nameResponsable = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        numCot = new javax.swing.JLabel();
        fechaCot = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        montoCot = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        ocultarLabel = new javax.swing.JLabel();
        mostrarLabel = new javax.swing.JLabel();
        panelActualizar = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaArchivo = new rojerusan.RSTableMetro();
        jLabel19 = new javax.swing.JLabel();
        addButton = new RSMaterialComponent.RSButtonIconShadow();
        deleteButton = new RSMaterialComponent.RSButtonIconShadow();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        jLabel20 = new javax.swing.JLabel();
        comboEstado = new RSMaterialComponent.RSComboBox();
        jLabel2 = new javax.swing.JLabel();
        montoOctxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        rSButtonRoundEffectIcon1 = new rojeru_san.rsbutton.RSButtonRoundEffectIcon();
        jLabel8 = new javax.swing.JLabel();
        numOtTxt = new javax.swing.JTextField();
        rSButtonIconShadow1 = new RSMaterialComponent.RSButtonIconShadow();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Confirmar Cotización por Cliente - SDGS");
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
        jLabel1.setText("Confirmar Cotización");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/windowclose_104378.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/logo_rossetti 48x48.jpg"))); // NOI18N

        javax.swing.GroupLayout panelHeaderLayout = new javax.swing.GroupLayout(panelHeader);
        panelHeader.setLayout(panelHeaderLayout);
        panelHeaderLayout.setHorizontalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelHeaderLayout.setVerticalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        jLabel17.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(153, 153, 153));
        jLabel17.setText("Este proceso es para Actualizar las Cots. Emitidas, Si fueron <Aprobadas / Rechazadas>");

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

        panelDatos.setBackground(new java.awt.Color(255, 255, 255));
        panelDatos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos de la Cotización Seleccionada", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(102, 102, 102))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Cliente:");

        nameCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nameCliente.setText("@Nombre Cliente");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Responsable:");

        nameResponsable.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nameResponsable.setText("@Nombre");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("# Cot: ");

        numCot.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        numCot.setText("@Cot");

        fechaCot.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        fechaCot.setText("@Fecha Cot");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setText("Fecha Subido Cot: ");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setText("Monto:");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setText("$");

        montoCot.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        montoCot.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        montoCot.setText("#");

        javax.swing.GroupLayout panelDatosLayout = new javax.swing.GroupLayout(panelDatos);
        panelDatos.setLayout(panelDatosLayout);
        panelDatosLayout.setHorizontalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDatosLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nameCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelDatosLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numCot)
                        .addGap(71, 71, 71)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fechaCot)))
                .addGap(18, 18, 18)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDatosLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nameResponsable, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(82, Short.MAX_VALUE))
                    .addGroup(panelDatosLayout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(montoCot, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel16)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        panelDatosLayout.setVerticalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(nameCliente)
                    .addComponent(jLabel7)
                    .addComponent(nameResponsable))
                .addGap(29, 29, 29)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(numCot)
                    .addComponent(jLabel13)
                    .addComponent(fechaCot)
                    .addComponent(jLabel14)
                    .addComponent(jLabel16)
                    .addComponent(montoCot))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jLabel18.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(153, 153, 153));
        jLabel18.setText("Todas las Cotizaciones Visualidas son Aquellas <solo> Esperando Respuesta x Cliente");

        ocultarLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ocultarLabel.setText("Ocultar Datos");
        ocultarLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ocultarLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ocultarLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ocultarLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ocultarLabelMouseExited(evt);
            }
        });

        mostrarLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mostrarLabel.setText("Mostrar Datos");
        mostrarLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mostrarLabel.setEnabled(false);
        mostrarLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mostrarLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mostrarLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mostrarLabelMouseExited(evt);
            }
        });

        panelActualizar.setBackground(new java.awt.Color(255, 255, 255));
        panelActualizar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos de la Cotización Seleccionada", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(102, 102, 102))); // NOI18N

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

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19.setText("Respuesta por Cliente: ");

        addButton.setBackground(new java.awt.Color(58, 66, 226));
        addButton.setToolTipText("Agregar Archivos como: Orden de Compra, o Archivos Relevantes");
        addButton.setBackgroundHover(new java.awt.Color(77, 164, 98));
        addButton.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.ADD);
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        deleteButton.setToolTipText("Eliminar Todos los Archivos subidos");
        deleteButton.setBackgroundHover(new java.awt.Color(161, 54, 48));
        deleteButton.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.CLEAR);
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        txtDescripcion.setColumns(20);
        txtDescripcion.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        txtDescripcion.setAutoscrolls(false);
        txtDescripcion.setSelectionColor(new java.awt.Color(161, 54, 48));
        jScrollPane1.setViewportView(txtDescripcion);

        jLabel20.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(102, 102, 102));
        jLabel20.setText("Descripción. <Ingresar información sobre la respuesta del cliente>");

        comboEstado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "APROBADO", "RECHAZADO" }));
        comboEstado.setColorArrow(new java.awt.Color(161, 54, 48));
        comboEstado.setColorBorde(new java.awt.Color(0, 0, 0));
        comboEstado.setColorFondo(new java.awt.Color(161, 54, 48));
        comboEstado.setColorSeleccion(new java.awt.Color(161, 54, 48));
        comboEstado.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        comboEstado.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboEstadoItemStateChanged(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Monto de la OC:");

        montoOctxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        montoOctxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        montoOctxt.setToolTipText("Use los Decimales con Punto \".\"");
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

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("$");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("?");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        rSButtonRoundEffectIcon1.setBackground(new java.awt.Color(161, 54, 48));
        rSButtonRoundEffectIcon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/ic_done_all_128_28243.png"))); // NOI18N
        rSButtonRoundEffectIcon1.setText("Registrar Datos");
        rSButtonRoundEffectIcon1.setColorHover(new java.awt.Color(77, 164, 98));
        rSButtonRoundEffectIcon1.setEfecto(rojeru_san.rsbutton.RSButtonRoundEffectIcon.EFECTO.RIPLE);
        rSButtonRoundEffectIcon1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonRoundEffectIcon1ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Número de OT:");

        numOtTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        numOtTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        numOtTxt.setToolTipText("Use los Decimales con Punto \".\"");
        numOtTxt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        numOtTxt.setOpaque(false);
        numOtTxt.setSelectionColor(new java.awt.Color(161, 54, 48));
        numOtTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                numOtTxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                numOtTxtFocusLost(evt);
            }
        });
        numOtTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                numOtTxtMouseExited(evt);
            }
        });
        numOtTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                numOtTxtKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numOtTxtKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout panelActualizarLayout = new javax.swing.GroupLayout(panelActualizar);
        panelActualizar.setLayout(panelActualizarLayout);
        panelActualizarLayout.setHorizontalGroup(
            panelActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelActualizarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelActualizarLayout.createSequentialGroup()
                        .addGroup(panelActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addGroup(panelActualizarLayout.createSequentialGroup()
                                .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelActualizarLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(numOtTxt))
                            .addComponent(comboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(panelActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelActualizarLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(montoOctxt, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelActualizarLayout.createSequentialGroup()
                        .addGap(0, 25, Short.MAX_VALUE)
                        .addGroup(panelActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(rSButtonRoundEffectIcon1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        panelActualizarLayout.setVerticalGroup(
            panelActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelActualizarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSButtonRoundEffectIcon1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(panelActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(addButton, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                    .addComponent(deleteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(montoOctxt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6))
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(numOtTxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(panelActualizarLayout.createSequentialGroup()
                        .addGap(0, 18, Short.MAX_VALUE)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        rSButtonIconShadow1.setBackground(new java.awt.Color(153, 153, 153));
        rSButtonIconShadow1.setBackgroundHover(new java.awt.Color(102, 102, 102));
        rSButtonIconShadow1.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SEARCH);
        rSButtonIconShadow1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonIconShadow1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCentralLayout = new javax.swing.GroupLayout(panelCentral);
        panelCentral.setLayout(panelCentralLayout);
        panelCentralLayout.setHorizontalGroup(
            panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelCentralLayout.createSequentialGroup()
                .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCentralLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel17))
                    .addGroup(panelCentralLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idCotizacion, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rSButtonIconShadow1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel18)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCentralLayout.createSequentialGroup()
                .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelCentralLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(ocultarLabel)
                        .addGap(18, 18, 18)
                        .addComponent(mostrarLabel))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelCentralLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelActualizar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(33, 33, 33))
        );
        panelCentralLayout.setVerticalGroup(
            panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCentralLayout.createSequentialGroup()
                .addComponent(panelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCentralLayout.createSequentialGroup()
                        .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(idCotizacion)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mostrarLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ocultarLabel)))
                    .addGroup(panelCentralLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(rSButtonIconShadow1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCentral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void ocultarLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ocultarLabelMouseEntered
        if (ocultarLabel.isEnabled()) {
            ocultarLabel.setForeground(new Color(161, 54, 48));
        }

    }//GEN-LAST:event_ocultarLabelMouseEntered

    private void mostrarLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mostrarLabelMouseEntered
        if (mostrarLabel.isEnabled()) {
            mostrarLabel.setForeground(new Color(161, 54, 48));
        }

    }//GEN-LAST:event_mostrarLabelMouseEntered

    private void ocultarLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ocultarLabelMouseExited
        if (ocultarLabel.isEnabled()) {
            ocultarLabel.setForeground(Color.black);
        }

    }//GEN-LAST:event_ocultarLabelMouseExited

    private void mostrarLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mostrarLabelMouseExited
        if (mostrarLabel.isEnabled()) {
            mostrarLabel.setForeground(Color.black);
        }

    }//GEN-LAST:event_mostrarLabelMouseExited

    private void ocultarLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ocultarLabelMouseClicked
        if (ocultarLabel.isEnabled()) {
            ocultarDatos();
        }

    }//GEN-LAST:event_ocultarLabelMouseClicked

    private void mostrarLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mostrarLabelMouseClicked
        if (mostrarLabel.isEnabled()) {
            mostrarDatos();
        }

    }//GEN-LAST:event_mostrarLabelMouseClicked

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        añadirArchivo();
    }//GEN-LAST:event_addButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        limpiarArchivos();
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void rSButtonRoundEffectIcon1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonRoundEffectIcon1ActionPerformed
        if (validarDatos()) {
            new Thread(this::generar).start();
        }
    }//GEN-LAST:event_rSButtonRoundEffectIcon1ActionPerformed

    private void comboEstadoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboEstadoItemStateChanged

        if (comboEstado.getSelectedItem().equals("RECHAZADO")) {
            addButton.setVisible(false);
            deleteButton.setVisible(false);
            tablaArchivo.setVisible(false);
            setTempArchivos();
            estado="Rechazado";
            
            jLabel2.setVisible(false);
            montoOctxt.setVisible(false);
            jLabel3.setVisible(false);
            jLabel6.setVisible(false);
            
        } else {
            addButton.setVisible(true);
            deleteButton.setVisible(true);
            tablaArchivo.setVisible(true);
            getTempArchivos();
            estado="Cot. Aprobada - Esperando Plano";
            
             jLabel2.setVisible(true);
            montoOctxt.setVisible(true);
            jLabel3.setVisible(true);
            jLabel6.setVisible(true);
        }
    }//GEN-LAST:event_comboEstadoItemStateChanged

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

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
       JOptionPane.showMessageDialog(rootPane, "Automáticamente se asignará el mismo Monto registrado con la Cotización,\n"
               + "NO Cambie el monto a menos que la Orden de Compra se halla enviado con un monto diferente a la OC. \n"
               + "En caso de ser Montos diferentes, agregue el motivo en la descripción");
    }//GEN-LAST:event_jLabel6MouseClicked

    private void montoOctxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_montoOctxtKeyTyped
      new tools().soloDoubleyCantidadDigitos(evt, montoOctxt, 10);
    }//GEN-LAST:event_montoOctxtKeyTyped

    private void rSButtonIconShadow1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonIconShadow1ActionPerformed
        lc.llenarTabla();
        lc.vaciarTablaArchivos();
        lc.setVisible(true);
    }//GEN-LAST:event_rSButtonIconShadow1ActionPerformed
int xx,yy;
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

    private void panelHeaderMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelHeaderMouseReleased
           setOpacity((float) 1.0);
    }//GEN-LAST:event_panelHeaderMouseReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void numOtTxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_numOtTxtFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_numOtTxtFocusGained

    private void numOtTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_numOtTxtFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_numOtTxtFocusLost

    private void numOtTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_numOtTxtMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_numOtTxtMouseExited

    private void numOtTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numOtTxtKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_numOtTxtKeyReleased

    private void numOtTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numOtTxtKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_numOtTxtKeyTyped

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
            java.util.logging.Logger.getLogger(confirmarCotizacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(confirmarCotizacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(confirmarCotizacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(confirmarCotizacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

                new confirmarCotizacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private RSMaterialComponent.RSButtonIconShadow addButton;
    private RSMaterialComponent.RSComboBox comboEstado;
    private RSMaterialComponent.RSButtonIconShadow deleteButton;
    private javax.swing.JLabel fechaCot;
    public static javax.swing.JTextField idCotizacion;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel montoCot;
    public static javax.swing.JTextField montoOctxt;
    private javax.swing.JLabel mostrarLabel;
    private javax.swing.JLabel nameCliente;
    private javax.swing.JLabel nameResponsable;
    private javax.swing.JLabel numCot;
    public static javax.swing.JTextField numOtTxt;
    private javax.swing.JLabel ocultarLabel;
    private javax.swing.JPanel panelActualizar;
    private javax.swing.JPanel panelCentral;
    private javax.swing.JPanel panelDatos;
    private rojeru_san.rspanel.RSPanelGradiente panelHeader;
    private RSMaterialComponent.RSButtonIconShadow rSButtonIconShadow1;
    private rojeru_san.rsbutton.RSButtonRoundEffectIcon rSButtonRoundEffectIcon1;
    private rojerusan.RSTableMetro tablaArchivo;
    private javax.swing.JTextArea txtDescripcion;
    // End of variables declaration//GEN-END:variables

    public void setSolicitud(Solicitud s) {
        this.s = s;
    }

    public void setCotizacion(Cotizacion c) {
        this.c = c;
        this.c.buscarID(c.getID());
        setDatos();
    }

    public void setDatos() {
        nameCliente.setText(c.getCliente());
        nameResponsable.setText(c.getResponsable());
        numCot.setText(c.getNumeroCot());
        fechaCot.setText(c.getFecha());
        montoCot.setText(c.getMonto()+"");
        montoOctxt.setText(c.getMonto()+"");
        

    }

    private boolean validarDatos() {
        boolean llave = false;
        if(comboEstado.getSelectedIndex() == 0){
          if (idCotizacion.getText().length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Debe Seleccionar una Cotización a Actualizar");
        } else {
            if (txtDescripcion.getText().length() == 0) {
                JOptionPane.showMessageDialog(rootPane, "La Descripción no debe quedar Vacia");
            } else {
                DefaultTableModel modelo = (DefaultTableModel) tablaArchivo.getModel();
                if (comboEstado.getSelectedItem().equals("APROBADO") && modelo.getRowCount() == 0) {
                    JOptionPane.showMessageDialog(rootPane, "Si la Cotización fue aprobada debe subir al menos la OC proporcionada por el cliente");
                } else {
                    if(montoOctxt.getText().length()==0){
                        JOptionPane.showMessageDialog(rootPane, "Monto en la OC no debe estar Vacio");
                    }else{
                        Double montoCotD = Double.parseDouble(montoCot.getText());
                        Double montoOc = Double.parseDouble(montoOctxt.getText());
                        if(montoOc >montoCotD ){
                            JOptionPane.showMessageDialog(rootPane, "Monto de la OC debe ser Igual o menor a la ingresada en la Cotización");
                            montoOctxt.requestFocus();
                        }else{
                            if(numOtTxt.getText().length() < 1){
                                 JOptionPane.showMessageDialog(rootPane, "Ingrese Número de OT");
                                 numOtTxt.requestFocus();
                            }else{
                                
                            }
                             llave = true;
                        }
                       
                    }
                    
                }
            }
        }  
        }else{
            if (idCotizacion.getText().length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Debe Seleccionar una Cotización a Actualizar");
        } else {
                if (txtDescripcion.getText().length() == 0) {
                JOptionPane.showMessageDialog(rootPane, "La Descripción no debe quedar Vacia");
            } else {
                     llave = true;
                } 
            }
        }
        

        return llave;
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

   

    private void setTempArchivos() {

        DefaultTableModel modelo = (DefaultTableModel) tablaArchivo.getModel();
        if (modelo.getRowCount() > 0) {
            for (int i = 0; i < modelo.getRowCount(); i++) {
                archivos.add(tablaArchivo.getValueAt(i, 0).toString());
            }
        }
        modelo.setRowCount(0);
    }

    private void getTempArchivos() {
        DefaultTableModel modelo = (DefaultTableModel) tablaArchivo.getModel();
        if (archivos.size() > 0) {
            for (int i = 0; i < archivos.size(); i++) {
                modelo.addRow(new Object[]{archivos.get(i)});
            }
        }
        archivos.clear();
    }

    private void limpiarCampos() {
        DefaultTableModel modelo = (DefaultTableModel) tablaArchivo.getModel();
        modelo.setRowCount(0);
        idCotizacion.setText("");
        nameCliente.setText("@Nombre Cliente");
        nameResponsable.setText("@Nombre");
        numCot.setText("@Cot");
        fechaCot.setText("@Fecha Cot");
        montoCot.setText("0");
        txtDescripcion.setText("");
        comboEstado.setSelectedIndex(0);
        montoOctxt.setText("");
    }

    public void ocultarDatos() {
        mostrarLabel.setEnabled(true);
        panelDatos.setSize(900, 15);
        ocultarLabel.setEnabled(false);

        panelActualizar.setLocation(panelActualizar.getX(), yLabel - 135);
    }

    public void mostrarDatos() {
        mostrarLabel.setEnabled(false);
        panelDatos.setSize(900, 150);
        ocultarLabel.setEnabled(true);
        panelActualizar.setLocation(panelActualizar.getX(), panelActualizar.getY() + 135);
    }

    private void iniciar() {
        new PlaceHolder("Agregue la Descripción según lo recibido por el Cliente", txtDescripcion);
        new PlaceHolder(" F1 / Lupa", idCotizacion);
    }

    private void generar(){
         Double montoOcx = Double.parseDouble(this.montoOctxt.getText());
            new Thread(this::mostrarCarga).start();
            c.setEstado(estado);
            c.setObs(txtDescripcion.getText());
            c.setMontoOc(montoOcx);
            int rsp = c.update();
            if(rsp == 1){
                c.setOT(numOtTxt.getText() , c.getID());
                c.updateFechaConfOC(new Conectar().getFechaServidor());
                actualizarRegistros();                
            }
     }

    private void actualizarRegistros() {
        String vendedor =  Main.getVendedor();
        int idPresupuesto = c.getPresupuesto().getIdPresupuesto();
        int idSolicitud = c.getPresupuesto().getSolicitud().getId();
        Double montoOcx = Double.parseDouble(this.montoOctxt.getText());
        
        if(estado.equals("Rechazado")){
            AvanceCot ac = new AvanceCot().buscarIdCot(c.getID());
            ac.DeleteLogico(1);
            
            AvanceCotObs acb = new AvanceCotObs().buscarAvance(ac.getId());
            if(acb.getId() == 0){
                acb.setIdAvance(ac.getId());
                acb.setObservacion("Rechazado");
                acb.Insert();
            }else{
               acb.setObservacion("Rechazado");
               acb.Insert();
            }
        }
        
        //ACTUALIZAMOS EL PRESUPUESTO
        Presupuesto p = new Presupuesto().buscarID(idPresupuesto);
        p.setEstado(estado);
        p.update();
        
        
        
        //ACTUALIZAMOS LA SOLICITUD
        s = new Solicitud().buscarID(idSolicitud);
        s.setEstado(estado);
        s.setIdCot(c.getID());
        s.update();
        String fecha = new Conectar("rstcot").getFechaServidor();
        String ip="0.0.0.0";
        try {
            ip = new tools().Obtener_ip();
        } catch (UnknownHostException ex) {
            Logger.getLogger(confirmarCotizacion.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(rootPane, ex);
        }
        
        
        //ACTUALIZAMOS LOS COSTOS DE GANANCIA
        Ganancia g = new Ganancia().buscarxCot(c.getID());
        g.setPrecioOc(montoOcx);
        g.update();
        
        
        
        //ACTUALIZAMOS EL SEGUIMIENTO
        new Seguimiento(
        c.getIdCliente(),fecha,"Cotización",estado,vendedor,c.getID(),ip
        ).insert();
         new Thread(this::ocultarCarga).start();
        new Thread(this::subirArchivos).start();
        
       
        
        
    }
    
    private void mostrarCarga(){
        carga.setVisible(true);
    }
     private void ocultarCarga(){
        carga.setVisible(false);
    }
     private void subirArchivos(){
        String cliente = c.getCliente();
        int idSolicitud = c.getIdSolicitud();

         String ruta = "\\\\atenea\\SGDS\\Data\\1. Clientes\\" + cliente + "\\1. Solicitudes\\" + idSolicitud + "\\3.OC\\";
         new tools().crearCarpeta(ruta);
         
          DefaultTableModel modelo = (DefaultTableModel) tablaArchivo.getModel();
          
          for(int i=0; i<modelo.getRowCount(); i++){
              String rutaTemp = tablaArchivo.getValueAt(i, 0).toString();
              new ArchivosOC(c.getID(),rutaTemp).insert(); // Insertamos en la Base de Datos
              new tools().CopiarArchivo(rutaTemp, ruta); // Copiamos los archivos en la ruta
              
          }
         new Thread(this::ocultarCarga).start();
         new rojerusan.RSNotifyFade("¡¡SUCCESS!!", "Se ha Actualizado la Información de la Cotización #"+numCot.getText()+"", 8, RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.SUCCESS).setVisible(true);
         limpiarCampos();      
     }
     
     
}
