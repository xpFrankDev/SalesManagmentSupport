/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VentanasRST;

import Clases.AvanceCot;
import Clases.AvanceCotObs;
import Clases.Conectar;
import Clases.Cotizacion;
import Clases.Plano;
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
public class confirmarPlano extends javax.swing.JFrame {

    listarCotAprobadas lca = new listarCotAprobadas(this);
    Cotizacion c;
    String estado = "Plano Confirmado - Esperando Entrega";
    String ultimaRuta = "";
    Rutas rutas = new Rutas();
    Solicitud s;
    cargando carga = new cargando();


    public confirmarPlano() {
        initComponents();
        changeIcon();
        panelContenido.setVisible(false);
        tomarPlano.setVisible(false);
        ocultar();
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
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        idCotizacion = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        panelContenido = new javax.swing.JPanel();
        terminarButton = new rojeru_san.rsbutton.RSButtonRoundEffectIcon();
        jLabel21 = new javax.swing.JLabel();
        addButton = new RSMaterialComponent.RSButtonIconShadow();
        deleteButton = new RSMaterialComponent.RSButtonIconShadow();
        tomarPlano = new RSMaterialComponent.RSButtonIconShadow();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaArchivo = new rojerusan.RSTableMetro();
        rSButtonIconShadow1 = new RSMaterialComponent.RSButtonIconShadow();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Confirmación de Plno - SGDS");
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
        jLabel1.setText("Confirmar Plano");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 42)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("?");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/windowclose_104378.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/logo_rossetti 48x48.jpg"))); // NOI18N

        javax.swing.GroupLayout panelHeaderLayout = new javax.swing.GroupLayout(panelHeader);
        panelHeader.setLayout(panelHeaderLayout);
        panelHeaderLayout.setHorizontalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHeaderLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelHeaderLayout.setVerticalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelHeaderLayout.createSequentialGroup()
                .addGroup(panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Seleccione Cotización Aprobada:");

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

        jLabel18.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(153, 153, 153));
        jLabel18.setText("Presione F1 o use la Lupa para mostrar el listado");

        jSeparator1.setBackground(new java.awt.Color(161, 54, 48));
        jSeparator1.setForeground(new java.awt.Color(161, 54, 48));

        panelContenido.setBackground(new java.awt.Color(255, 255, 255));
        panelContenido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        terminarButton.setBackground(new java.awt.Color(161, 54, 48));
        terminarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/emblemdefault_93502.png"))); // NOI18N
        terminarButton.setText("Registrar Datos");
        terminarButton.setColorHover(new java.awt.Color(77, 164, 98));
        terminarButton.setEfecto(rojeru_san.rsbutton.RSButtonRoundEffectIcon.EFECTO.RIPLE);
        terminarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                terminarButtonActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(102, 102, 102));
        jLabel21.setText("Suba los Planos Aprobados");

        addButton.setBackground(new java.awt.Color(58, 66, 226));
        addButton.setToolTipText("Agregar Archivos como: Orden de Compra, o Archivos Relevantes");
        addButton.setBackgroundHover(new java.awt.Color(77, 164, 98));
        addButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addButton.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.ADD);
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        deleteButton.setToolTipText("Eliminar Todos los Archivos subidos");
        deleteButton.setBackgroundHover(new java.awt.Color(161, 54, 48));
        deleteButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteButton.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.CLEAR);
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        tomarPlano.setBackground(new java.awt.Color(153, 153, 153));
        tomarPlano.setToolTipText("Obtener Planos de Otra Cotización");
        tomarPlano.setBackgroundHover(new java.awt.Color(0, 153, 153));
        tomarPlano.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tomarPlano.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.IMPORT_EXPORT);
        tomarPlano.setThemeTooltip(necesario.Global.THEMETOOLTIP.LIGHT);
        tomarPlano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tomarPlanoActionPerformed(evt);
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

        javax.swing.GroupLayout panelContenidoLayout = new javax.swing.GroupLayout(panelContenido);
        panelContenido.setLayout(panelContenidoLayout);
        panelContenidoLayout.setHorizontalGroup(
            panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContenidoLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelContenidoLayout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addGap(168, 168, 168)
                        .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(tomarPlano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(255, Short.MAX_VALUE))
                    .addGroup(panelContenidoLayout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(terminarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))))
        );
        panelContenidoLayout.setVerticalGroup(
            panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContenidoLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(terminarButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelContenidoLayout.createSequentialGroup()
                        .addGroup(panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tomarPlano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCentralLayout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCentralLayout.createSequentialGroup()
                        .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelCentralLayout.createSequentialGroup()
                                .addGap(93, 93, 93)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(panelContenido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCentralLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(idCotizacion, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rSButtonIconShadow1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(jLabel18)))
                .addGap(31, 31, 31))
        );
        panelCentralLayout.setVerticalGroup(
            panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCentralLayout.createSequentialGroup()
                .addComponent(panelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(idCotizacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSButtonIconShadow1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelContenido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCentral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCentral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            lca.setVisible(true);
            ocultar();
        }
        if (idCotizacion.getText().length() == 0) {
            ocultar();
        }
    }//GEN-LAST:event_idCotizacionKeyReleased

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        JOptionPane.showMessageDialog(rootPane, "Tome en consideración los siguientes aspectos mientras usa la presente Ventana:\n\n"
                + "1. Una vez subido el Plano, quiere decir que el cliente lo ha confirmado\n"
                + "2. Tras confirmar el Plano se obtiene la fecha de Entrega al cliente (Suceptible a cambios)\n"
                + "3. En caso de requerir modificaciones en la fecha de entrega, deben ser realizados por Jefe de Planta o superior", "Información", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        añadirArchivo();
    }//GEN-LAST:event_addButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        limpiarArchivos();
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void terminarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_terminarButtonActionPerformed
        if (validarDatos()) {
            new Thread(this::terminarConfirmacion).start();
        }
    }//GEN-LAST:event_terminarButtonActionPerformed

    private void tomarPlanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tomarPlanoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tomarPlanoActionPerformed

    private void rSButtonIconShadow1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonIconShadow1ActionPerformed
        lca.llenarTabla();
        lca.setVisible(true);
    }//GEN-LAST:event_rSButtonIconShadow1ActionPerformed
    int xx, yy;
    private void panelHeaderMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelHeaderMousePressed
        setOpacity((float) 0.8);
        xx = evt.getX();
        yy = evt.getY();
    }//GEN-LAST:event_panelHeaderMousePressed

    private void panelHeaderMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelHeaderMouseReleased
        setOpacity((float) 1.0);
    }//GEN-LAST:event_panelHeaderMouseReleased

    private void panelHeaderMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelHeaderMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - yy);
    }//GEN-LAST:event_panelHeaderMouseDragged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      this.dispose();
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
            java.util.logging.Logger.getLogger(confirmarPlano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(confirmarPlano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(confirmarPlano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(confirmarPlano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new confirmarPlano().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private RSMaterialComponent.RSButtonIconShadow addButton;
    private RSMaterialComponent.RSButtonIconShadow deleteButton;
    public static javax.swing.JTextField idCotizacion;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel panelCentral;
    public javax.swing.JPanel panelContenido;
    private rojeru_san.rspanel.RSPanelGradiente panelHeader;
    private RSMaterialComponent.RSButtonIconShadow rSButtonIconShadow1;
    private rojerusan.RSTableMetro tablaArchivo;
    private rojeru_san.rsbutton.RSButtonRoundEffectIcon terminarButton;
    private RSMaterialComponent.RSButtonIconShadow tomarPlano;
    // End of variables declaration//GEN-END:variables

    private boolean validarDatos() {
        boolean llave = false;
        DefaultTableModel modeloArchivo = (DefaultTableModel) tablaArchivo.getModel();

        if (idCotizacion.getText().length() == 0) {
            JOptionPane.showMessageDialog(panelContenido, "Debe Ingresar una Cotización Valida");
        } else {
            if (modeloArchivo.getRowCount() == 0) {
                JOptionPane.showMessageDialog(panelContenido, "Debe subir al menos 1 plano");
            } else {
                llave = true;
            }
        }

        return llave;
    }

    private void terminarConfirmacion() {
        new Thread(this::mostrarCarga).start();
        terminarButton.setEnabled(false);
        c.setEstado(estado);
        int rsp = c.update();

        if (rsp == 1) {
            new Thread(this::actualizarRegistros).start();
            new Thread(this::subirArchivos).start();

        }
    }

    private void actualizarRegistros() {
        String vendedor = (Main.getVendedor()).equals("vacio") ? "vacio" : Main.getVendedor();
        int idPresupuesto = c.getPresupuesto().getIdPresupuesto();
        int idSolicitud = c.getPresupuesto().getSolicitud().getId();
        
        c.updateFechaConfPlano(new Conectar().getFechaServidor());
        
        Presupuesto p = new Presupuesto().buscarID(idPresupuesto);
        p.setEstado(estado);
        p.update();

        s = new Solicitud().buscarID(idSolicitud);
        s.setEstado(estado);
        s.update();

        AvanceCot aC = new AvanceCot().buscarIdCot(c.getID());
        aC.setPlano("100");
        aC.update();
        
       new AvanceCotObs(aC.getId(),"Plano","Ok","100").Insert();
       
        
        String fecha = new Conectar().getFechaServidor();
        String ip = "0.0.0.0";
        try {
            ip = new tools().Obtener_ip();
        } catch (UnknownHostException ex) {
            Logger.getLogger(confirmarCotizacion.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(rootPane, ex);
        }

        new Seguimiento(
                c.getIdCliente(), fecha, "Cotización", estado, vendedor, c.getID(), ip
        ).insert();
         new Thread(this::ocultarCarga).start();
    }

    public void setCotizacion(Cotizacion c) {
        this.c = c;
    }

    private void añadirArchivo() {
        ArrayList<String> archivo2 = new ArrayList();
        if (idCotizacion.getText().length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Debe seleccionar Antes una Cotización para continuar");
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

    private void ocultar() {
        panelContenido.setVisible(false);
        panelCentral.repaint();
        this.pack();
    }

    public void mostrar() {
        panelContenido.setVisible(true);
        pack();
    }

    private void limpiarCampos() {
        DefaultTableModel modelo = (DefaultTableModel) tablaArchivo.getModel();
        modelo.setRowCount(0);
        idCotizacion.setText("");
        terminarButton.setEnabled(true);
        ocultar();
    }

    private void subirArchivos() {
        String cliente = c.getCliente();
        int idSolicitud = c.getIdSolicitud();

        String ruta = "\\\\atenea\\SGDS\\Data\\1. Clientes\\" + cliente + "\\1. Solicitudes\\" + idSolicitud + "\\4.Planos\\";
        new tools().crearCarpeta(ruta);

        DefaultTableModel modelo = (DefaultTableModel) tablaArchivo.getModel();

        for (int i = 0; i < modelo.getRowCount(); i++) {
            String rutaTemp = tablaArchivo.getValueAt(i, 0).toString();

            new Plano(c.getID(), rutaTemp).insert(); // Insertamos Por cada Archivo en la tabla un registro enlazado al Cot
            new tools().CopiarArchivo(rutaTemp, ruta); // Copiamos los Archivos listados de la Tabla hacia la RED

        }

        new Thread(this::ocultarCarga).start();
        new rojerusan.RSNotifyFade("¡¡SUCCESS!!", "Se han subido los planos y actualizado la información de la Cotización con exito. ", 8, RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.SUCCESS).setVisible(true);
        limpiarCampos();
    }

    private void mostrarCarga() {
        carga.setVisible(true);
    }

    private void ocultarCarga() {
        carga.setVisible(false);
    }

    private void esperar(int i) {
        try {
            Thread.sleep(i);
        } catch (InterruptedException ex) {
            Logger.getLogger(confirmarPlano.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(panelContenido, "Error esperando al subir archivos+\n" + ex);
        }
    }

}
