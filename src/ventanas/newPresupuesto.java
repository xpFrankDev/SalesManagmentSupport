/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VentanasRST;

import Clases.ArchivosPresupuesto;
import Clases.Cliente;
import Clases.Conectar;
import Clases.Presupuesto;
import Clases.Propiedades;
import Clases.Seguimiento;
import Clases.Solicitud;
import Clases.Rutas;
import Clases.tools;
import Ventanas.cargando;
import java.awt.Image;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;
import rojerusan.RSNotifyFade;

public class newPresupuesto extends javax.swing.JFrame {

    Rutas rutas = new Rutas();
    String ultimaRuta = "";
    ArrayList<Solicitud> lista;
    cargando carga = new cargando();
    String ip = "0.0.0.0";

    public newPresupuesto() {
        initComponents();
        datosFabrica();
        changeIcon();
        texto.requestFocus();
    }

    public void changeIcon() {
        Image icon = new ImageIcon(getClass().getResource("/imgs/logo_rossetti.jpg")).getImage();
        setIconImage(icon);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        rSPanelGradiente1 = new rojeru_san.rspanel.RSPanelGradiente();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaSolicitudes = new rojerusan.RSTableMetro();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        descripcion = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        vendedorLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        upFileButton = new rojeru_san.rsbutton.RSButtonRoundRippleIcon();
        deleteFileButton = new rojeru_san.rsbutton.RSButtonRoundEffectIcon();
        jLabel12 = new javax.swing.JLabel();
        tipoCombo = new RSMaterialComponent.RSComboBoxMaterial();
        fechaPresupuesto = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        aceptarButton = new rojeru_san.rsbutton.RSButtonRoundEffectIcon();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaArchivo = new rojerusan.RSTableMetro();
        jLabel5 = new javax.swing.JLabel();
        texto = new javax.swing.JTextField();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ingresar Nuevo Presupuesto - SGDS");
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        rSPanelGradiente1.setColorPrimario(new java.awt.Color(161, 54, 48));
        rSPanelGradiente1.setColorSecundario(new java.awt.Color(153, 153, 153));
        rSPanelGradiente1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                rSPanelGradiente1MouseDragged(evt);
            }
        });
        rSPanelGradiente1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                rSPanelGradiente1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                rSPanelGradiente1MouseReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("INGRESAR  PRESUPUESTO");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/windowclose_104378.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/logo_rossetti 48x48.jpg"))); // NOI18N

        javax.swing.GroupLayout rSPanelGradiente1Layout = new javax.swing.GroupLayout(rSPanelGradiente1);
        rSPanelGradiente1.setLayout(rSPanelGradiente1Layout);
        rSPanelGradiente1Layout.setHorizontalGroup(
            rSPanelGradiente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSPanelGradiente1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 662, Short.MAX_VALUE)
                .addGap(107, 107, 107)
                .addComponent(jButton1))
        );
        rSPanelGradiente1Layout.setVerticalGroup(
            rSPanelGradiente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("SELECCIONAR -> Solicitudes Generadas");

        tablaSolicitudes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Cliente", "Fecha"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaSolicitudes.setBackgoundHead(new java.awt.Color(161, 54, 48));
        tablaSolicitudes.setBackgoundHover(new java.awt.Color(161, 54, 48));
        tablaSolicitudes.setColorPrimaryText(new java.awt.Color(161, 54, 48));
        tablaSolicitudes.setColorSecundaryText(new java.awt.Color(161, 54, 48));
        tablaSolicitudes.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tablaSolicitudes.setFontHead(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        tablaSolicitudes.setFontRowHover(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tablaSolicitudes.setSelectionBackground(new java.awt.Color(161, 54, 48));
        tablaSolicitudes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaSolicitudesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaSolicitudes);
        if (tablaSolicitudes.getColumnModel().getColumnCount() > 0) {
            tablaSolicitudes.getColumnModel().getColumn(0).setMinWidth(75);
            tablaSolicitudes.getColumnModel().getColumn(0).setPreferredWidth(75);
            tablaSolicitudes.getColumnModel().getColumn(0).setMaxWidth(75);
            tablaSolicitudes.getColumnModel().getColumn(2).setMinWidth(100);
            tablaSolicitudes.getColumnModel().getColumn(2).setPreferredWidth(100);
            tablaSolicitudes.getColumnModel().getColumn(2).setMaxWidth(100);
        }

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Descripción:");

        descripcion.setColumns(20);
        descripcion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        descripcion.setRows(5);
        jScrollPane2.setViewportView(descripcion);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Vendedor:");

        vendedorLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        vendedorLabel.setText("Nombre");

        jSeparator1.setBackground(new java.awt.Color(161, 54, 48));
        jSeparator1.setForeground(new java.awt.Color(161, 54, 48));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("1. Fecha de creación del Presupuesto:");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Excel2_48x48.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        upFileButton.setBackground(new java.awt.Color(77, 164, 98));
        upFileButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/attach_clip_1442.png"))); // NOI18N
        upFileButton.setText(" Elejir Archivo");
        upFileButton.setColorHover(new java.awt.Color(51, 181, 229));
        upFileButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        upFileButton.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        upFileButton.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        upFileButton.setIconTextGap(2);
        upFileButton.setMargin(new java.awt.Insets(2, 10, 2, 16));
        upFileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upFileButtonActionPerformed(evt);
            }
        });

        deleteFileButton.setBackground(new java.awt.Color(51, 181, 229));
        deleteFileButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/windowclose_104378.png"))); // NOI18N
        deleteFileButton.setText("      Borrar Archivo");
        deleteFileButton.setColorHover(new java.awt.Color(204, 0, 0));
        deleteFileButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteFileButton.setEfecto(rojeru_san.rsbutton.RSButtonRoundEffectIcon.EFECTO.RIPLE);
        deleteFileButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        deleteFileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteFileButtonActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("2. Tipo de Proyecto:");

        tipoCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Orden Compra / Común", "Proyecto" }));
        tipoCombo.setColorMaterial(new java.awt.Color(161, 54, 48));

        fechaPresupuesto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        fechaPresupuesto.setForeground(new java.awt.Color(161, 54, 48));
        fechaPresupuesto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fechaPresupuesto.setText(".");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setText("3. Subir Documento - Presupuesto");

        aceptarButton.setBackground(new java.awt.Color(161, 54, 48));
        aceptarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/new-file_40454.png"))); // NOI18N
        aceptarButton.setText("        Generar Presupuesto");
        aceptarButton.setColorHover(new java.awt.Color(77, 164, 98));
        aceptarButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        aceptarButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        aceptarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                aceptarButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                aceptarButtonMouseExited(evt);
            }
        });
        aceptarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarButtonActionPerformed(evt);
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

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Nombre de Cliente:");

        texto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        texto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoActionPerformed(evt);
            }
        });
        texto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textoKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rSPanelGradiente1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addGap(10, 10, 10)
                                    .addComponent(vendedorLabel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7))
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(texto, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(27, 27, 27)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addComponent(tipoCombo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(6, 6, 6)
                                .addComponent(fechaPresupuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(10, 10, 10)
                                .addComponent(upFileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(deleteFileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(aceptarButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(93, 93, 93))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(rSPanelGradiente1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fechaPresupuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tipoCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(upFileButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(deleteFileButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addComponent(aceptarButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(texto, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(vendedorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(11, 11, 11)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        añadirArchivo();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void upFileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upFileButtonActionPerformed
        añadirArchivo();
    }//GEN-LAST:event_upFileButtonActionPerformed

    private void deleteFileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteFileButtonActionPerformed
        eliminarArchivo();
    }//GEN-LAST:event_deleteFileButtonActionPerformed

    private void tablaSolicitudesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaSolicitudesMouseClicked

        extraerDatosSolicitud();


    }//GEN-LAST:event_tablaSolicitudesMouseClicked

    private void aceptarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarButtonActionPerformed
        aceptarButton.setEnabled(false);
        new Thread(this::mostrarCarga).start();
        new Thread(this::generarPresupuesto).start();


    }//GEN-LAST:event_aceptarButtonActionPerformed

    private void aceptarButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aceptarButtonMouseEntered

    }//GEN-LAST:event_aceptarButtonMouseEntered

    private void aceptarButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aceptarButtonMouseExited

    }//GEN-LAST:event_aceptarButtonMouseExited

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();

    }//GEN-LAST:event_jButton1ActionPerformed
    int xx, yy;
    private void rSPanelGradiente1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSPanelGradiente1MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - yy);
    }//GEN-LAST:event_rSPanelGradiente1MouseDragged

    private void rSPanelGradiente1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSPanelGradiente1MousePressed
        setOpacity((float) 0.8);
        xx = evt.getX();
        yy = evt.getY();
    }//GEN-LAST:event_rSPanelGradiente1MousePressed

    private void rSPanelGradiente1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSPanelGradiente1MouseReleased
        setOpacity((float) 1.0);
    }//GEN-LAST:event_rSPanelGradiente1MouseReleased

    private void textoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoActionPerformed

    private void textoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoKeyReleased
        if (texto.getText().length() < 1) {
            llenarTabla();
        } else {
            llenarTabla(texto.getText());
        }
    }//GEN-LAST:event_textoKeyReleased

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
            java.util.logging.Logger.getLogger(newPresupuesto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(newPresupuesto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(newPresupuesto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(newPresupuesto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new newPresupuesto().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.rsbutton.RSButtonRoundEffectIcon aceptarButton;
    private rojeru_san.rsbutton.RSButtonRoundEffectIcon deleteFileButton;
    private javax.swing.JTextArea descripcion;
    private javax.swing.JLabel fechaPresupuesto;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private rojeru_san.rspanel.RSPanelGradiente rSPanelGradiente1;
    private rojerusan.RSTableMetro tablaArchivo;
    private rojerusan.RSTableMetro tablaSolicitudes;
    private javax.swing.JTextField texto;
    private RSMaterialComponent.RSComboBoxMaterial tipoCombo;
    private rojeru_san.rsbutton.RSButtonRoundRippleIcon upFileButton;
    private javax.swing.JLabel vendedorLabel;
    // End of variables declaration//GEN-END:variables

    private void resetarCampos() {
        fechaPresupuesto.setText(new Conectar("rstcot").getFechaServidor());

    }

    private void eliminarArchivo() {
        if (tablaArchivo.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(rootPane, "Para eliminar algún archivo, antes debe seleccionar uno en la Tabla de Abajo");
        } else {
            int rsp = JOptionPane.showConfirmDialog(rootPane, "¿Seguro que desea eliminar el archivo seleccionado?", "BORRAR", JOptionPane.OK_CANCEL_OPTION);
            if (rsp == 0) {
                DefaultTableModel modeloArchivo = (DefaultTableModel) tablaArchivo.getModel();
                modeloArchivo.removeRow(tablaArchivo.getSelectedRow());
            }

        }
    }

    private void obtenerArchivo() {

        if (tablaSolicitudes.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(rootPane, "Debe seleccionar una Solicitud antes de Elejir un Archivo");
        } else {
            if ((tablaSolicitudes.getValueAt(tablaSolicitudes.getSelectedRow(), 1).toString()).equals("SIN SOLICITUDES PENDIENTES")) {
                JOptionPane.showMessageDialog(rootPane, "No hay Solicitudes Pendientes Para Trabajar");
            } else {
                String vendedor = (Main.getVendedor()).equals("vacio") ? "vacio" : Main.getVendedor();
                String archivo = "";//main.getVendedor()
                ultimaRuta = new Propiedades().getLocation(vendedor);//Reemplazar el nombre por Main.getNameUser() Para hacerlo deacuerdo al user
                if (ultimaRuta.length() > 0) {
                    archivo = rutas.getRutayArchivoJuntoCONFILTROconruta("Seleccione el Presupuesto en Excel (xlsx)", "xlsx", ultimaRuta);
                } else {
                    archivo = rutas.getRutayArchivoJuntoCONFILTRO("Seleccione el Presupuesto en Excel (xlsx)", "xlsx");
                }

                if (archivo != null && archivo.length() > 0) {
                    DefaultTableModel modeloArchivo = (DefaultTableModel) tablaArchivo.getModel();
                    modeloArchivo.addRow(new Object[]{archivo});
                    agregarUltimaUbicacion(archivo);
                }
            }
        }

    }

    private void agregarUltimaUbicacion(String archivo) {
        ultimaRuta = tomarRuta(archivo);
        new Propiedades("\\\\atenea\\SGDS\\Data\\2. Usuarios\\Franklin Parra\\1. Propiedades").setPropert("last.location", ultimaRuta);
        System.out.println(ultimaRuta);

    }

    private String tomarRuta(String archivo) {
        String temp = "";
        String separador = Pattern.quote("\\");

        String[] partes = archivo.split(separador);
        for (int i = 0; i < partes.length - 1; i++) {

            if (i == partes.length - 2) {
                temp += partes[i] + "/";
            } else {
                temp += partes[i] + "\\";
            }

        }
        return temp;
    }

    private void datosFabrica() {
        aceptarButton.setEnabled(true);
        try {
            ip = new tools().Obtener_ip();
        } catch (UnknownHostException ex) {
            Logger.getLogger(newPresupuesto.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(rootPane, "Error Obteniendo IP\n" + ex);
        }
        new Thread(this::ocultarCarga).start();
        fechaPresupuesto.setText(new Conectar("rstcot").getFechaServidor());
        descripcion.setText("");
        DefaultTableModel modeloArchivo = (DefaultTableModel) tablaArchivo.getModel();
        modeloArchivo.setRowCount(0);

        llenarTabla();
    }

    private void llenarTabla() {
        Solicitud s = new Solicitud();
        s.setEstado("creado");

        DefaultTableModel modeloSolicitudes = (DefaultTableModel) tablaSolicitudes.getModel();
        lista = (ArrayList) s.listarXEstado().clone();
        modeloSolicitudes.setRowCount(0);
        for (int i = 0; i < lista.size(); i++) {

            Cliente c = new Cliente();
            c.setID(lista.get(i).getIdCliente());
            c.buscarId();
            String cliente = c.getNombre1();

            modeloSolicitudes.addRow(new Object[]{
                lista.get(i).getId(),
                cliente, lista.get(i).getFecha()

            });
        }
        if (modeloSolicitudes.getRowCount() == 0) {
            modeloSolicitudes.addRow(new Object[]{"-", "SIN SOLICITUDES PENDIENTES", "-"});
        }

    }

    private void llenarTabla(String texto) {
        Solicitud s = new Solicitud();
        s.setEstado("creado");

        DefaultTableModel modeloSolicitudes = (DefaultTableModel) tablaSolicitudes.getModel();
        lista = (ArrayList) s.listarXEstado(texto).clone();
        modeloSolicitudes.setRowCount(0);
        for (int i = 0; i < lista.size(); i++) {

            Cliente c = new Cliente();
            c.setID(lista.get(i).getIdCliente());
            c.buscarId();
            String cliente = c.getNombre1();

            modeloSolicitudes.addRow(new Object[]{
                lista.get(i).getId(),
                cliente, lista.get(i).getFecha()

            });
        }
        if (modeloSolicitudes.getRowCount() == 0) {
            modeloSolicitudes.addRow(new Object[]{"-", "SIN SOLICITUDES PENDIENTES", "-"});
        }
    }

    private void generarPresupuesto() {
        DefaultTableModel modeloA = (DefaultTableModel) tablaArchivo.getModel();
        if (tablaSolicitudes.getSelectedRow() < 0) {//Validar que se seleccione un usuario
            JOptionPane.showMessageDialog(rootPane, "Debe Seleccionar una Solicitud para generar el Presupuesto");
        } else {
            if (modeloA.getRowCount() == 0) {//Validar que se suba al menos 1 archivo
                JOptionPane.showMessageDialog(rootPane, "Debe Subir al menos un Archivo antes de Continuar");
            } else {
                String nameCliente = tablaSolicitudes.getValueAt(tablaSolicitudes.getSelectedRow(), 1).toString();
                //Tomandop datos necesarios para generar el PResupuesto
                int idSolicitud = Integer.parseInt(tablaSolicitudes.getValueAt(tablaSolicitudes.getSelectedRow(), 0).toString());
                int idCliente = new Cliente().buscarNombre(nameCliente);

                String tipo = tipoCombo.getSelectedItem().toString();
                String vendedor = (Main.getVendedor()).equals("vacio") ? "vacio" : Main.getVendedor();

                int rsp = new Presupuesto(
                        idSolicitud, idCliente, nameCliente,
                        vendedor, "Esperando Cotización", fechaPresupuesto.getText(),
                        tipo, 0
                ).insertPresupuesto();// Rsp toma el resultado si se registra el nuevo presupuesto o no

                //Si se agrega el PResupuesto, se Actualiza la Solicitud y se Genera un Nuevo Seguimiento
                if (rsp == 1) {
                    actualizarDatosdeSolicitud();
                    subirArchivo();
                } else {
                    new Thread(this::ocultarCarga).start();
                    JOptionPane.showMessageDialog(rootPane, "Error Creando Nuevo Presupuesto");

                }

            }
        }

    }

    private void guardarRutasBDD() {
        DefaultTableModel modelo = (DefaultTableModel) tablaArchivo.getModel();
        int lastPresupuesto = new Presupuesto().getLastPresupuesto();
        for (int i = 0; i < modelo.getRowCount(); i++) {
            String ruta = tablaArchivo.getValueAt(i, 0).toString();
            new ArchivosPresupuesto(lastPresupuesto, ruta).insert();
        }
    }

    private void actualizarDatosdeSolicitud() {
        try {
            String nameCliente = tablaSolicitudes.getValueAt(tablaSolicitudes.getSelectedRow(), 1).toString();
            int lastPresupuesto = new Presupuesto().getLastPresupuesto();
            int idSolicitudx = Integer.parseInt(tablaSolicitudes.getValueAt(tablaSolicitudes.getSelectedRow(), 0).toString());
            int idClientex = new Cliente().buscarNombre(nameCliente);
            Solicitud s = new Solicitud().buscarID(idSolicitudx);
            s.setEstado("Esperando Cotización");
            s.setIdPresupuesto(lastPresupuesto);
            s.update();

            String vendedor = Main.getVendedor();

            new Seguimiento(
                    idClientex, fechaPresupuesto.getText(), "Presupuesto",
                    "Emisión de Presupuesto", vendedor, lastPresupuesto, ip
            ).insert();
            new Thread(this::ocultarCarga).start();
        } catch (Exception e) {
            Logger.getLogger(newPresupuesto.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(rootPane, e);
        }

    }

    private int subirArchivo() {

        String nameCliente = tablaSolicitudes.getValueAt(tablaSolicitudes.getSelectedRow(), 1).toString();
        int lastPresupuesto = new Presupuesto().getLastPresupuesto();
        int idSolicitud = Integer.parseInt(tablaSolicitudes.getValueAt(tablaSolicitudes.getSelectedRow(), 0).toString());
        int idClientex = new Cliente().buscarNombre(nameCliente);

//Guardamos las rutas primero en la Base de Datos antes de...
        guardarRutasBDD();

        //Ahora copiamos cada uno de los archivos en el servidor
        int rspx = 0;

        String rut = "\\\\atenea\\SGDS\\Data\\1. Clientes\\" + nameCliente + "\\1. Solicitudes" + "\\" + idSolicitud + "\\1.Presupuesto\\";
        new tools().crearCarpeta(rut);
        DefaultTableModel modelo = (DefaultTableModel) tablaArchivo.getModel();
        for (int i = 0; i < modelo.getRowCount(); i++) {
            String ruta = tablaArchivo.getValueAt(i, 0).toString();
            new tools().CopiarArchivo(ruta, rut);
        }
        new Thread(this::ocultarCarga).start();
        new rojerusan.RSNotifyFade("¡¡SUCCESS!!", " Presupuesto Creado con Exito para la Solicitud #" + idSolicitud + " y Archivos subidos Exitosamente!", 7, RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.SUCCESS).setVisible(true);
        datosFabrica();

        return rspx;
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

    private void extraerDatosSolicitud() {
        if ((tablaSolicitudes.getValueAt(tablaSolicitudes.getSelectedRow(), 1).toString()).equals("SIN SOLICITUDES PENDIENTES")) {
            new rojerusan.RSNotifyFade("¡¡NO HAY SOLIC. DISPONIBLES!!", "Para ingresar un Nuevo Presupuesto deben existir al menos una (01) Solicitud disponible", 7, RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.ERROR).setVisible(true);

        } else {
            int seleccionado = Integer.parseInt(tablaSolicitudes.getValueAt(tablaSolicitudes.getSelectedRow(), 0).toString());
            for (int i = 0; i < lista.size(); i++) {
                if (lista.get(i).getId() == seleccionado) {
                    descripcion.setText(lista.get(i).getDescripcion());
                    vendedorLabel.setText(lista.get(i).getVendedor());
                }
            }
        }
    }

    private void añadirArchivo() {
        ArrayList<String> archivo2 = new ArrayList();

        if (tablaSolicitudes.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(rootPane, "Debe seleccionar una Solicitud antes de Elejir un Archivo");
        } else {
            if ((tablaSolicitudes.getValueAt(tablaSolicitudes.getSelectedRow(), 1).toString()).equals("SIN SOLICITUDES PENDIENTES")) {
                JOptionPane.showMessageDialog(rootPane, "No hay Solicitudes Pendientes Para Trabajar");
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

    private void agregarUltimaUbicacion(String archivo, String vendedor) {
        ultimaRuta = tomarRuta(archivo);//Cambiar Franklin Parra por el nombre del Usuario . main.getVendedor();
        String ruta = "\\\\atenea\\SGDS\\Data\\2. Usuarios\\" + vendedor + "\\1. Propiedades";
        new Propiedades(ruta).setPropert("last.location", ultimaRuta);

    }

    private void mostrarCarga() {
        carga.setVisible(true);
    }

    private void ocultarCarga() {
        carga.setVisible(false);
    }
}
