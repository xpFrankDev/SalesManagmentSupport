/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VentanasRST;

import Clases.PersonaContacto;
import Clases.tools;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.MatteBorder;
import javax.swing.plaf.ColorUIResource;
import rojerusan.RSNotifyFade;

/**
 *
 * @author soporte
 */
public class verInfoPersonaContacto extends javax.swing.JFrame {

    PersonaContacto pc;
    newSolicitud ns;
    int miPermiso;
    int escape;

    public verInfoPersonaContacto() {
        initComponents();
        changeIcon();

    }

    public verInfoPersonaContacto(PersonaContacto a, int permiso, newSolicitud b) {
        initComponents();
        changeIcon();
        pc = a;
        setPermisos(permiso);
        ns = b;
        escape = 1;
    }

    public verInfoPersonaContacto(PersonaContacto a, int permiso) {
        initComponents();
        changeIcon();
        pc = a;
        setPermisos(permiso);
        escape = 2;

    }

    public verInfoPersonaContacto(int permiso, newSolicitud b) {
        initComponents();
        changeIcon();
        setPermisos(permiso);
        ns = b;

    }

    public void changeIcon() {
        Image icon = new ImageIcon(getClass().getResource("/imgs/logo_rossetti.jpg")).getImage();
        setIconImage(icon);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        rSPanelGradiente1 = new rojeru_san.rspanel.RSPanelGradiente();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        nombreTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        apellidoTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        telefonoTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        correoTxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        direccionTxt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        cargoTxt = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        idTxt = new javax.swing.JLabel();
        resetButton = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        editarButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ver Información - Persona de Contacto");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rSPanelGradiente1.setColorPrimario(new java.awt.Color(161, 54, 48));
        rSPanelGradiente1.setColorSecundario(new java.awt.Color(153, 153, 153));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Datos de la Persona de Contacto");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/user222.png"))); // NOI18N

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/windowclose_104378.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout rSPanelGradiente1Layout = new javax.swing.GroupLayout(rSPanelGradiente1);
        rSPanelGradiente1.setLayout(rSPanelGradiente1Layout);
        rSPanelGradiente1Layout.setHorizontalGroup(
            rSPanelGradiente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSPanelGradiente1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        rSPanelGradiente1Layout.setVerticalGroup(
            rSPanelGradiente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSPanelGradiente1Layout.createSequentialGroup()
                .addGroup(rSPanelGradiente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(rSPanelGradiente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 696, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("(*) Nombres:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, 32));

        nombreTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nombreTxt.setForeground(new java.awt.Color(161, 54, 48));
        nombreTxt.setToolTipText("");
        nombreTxt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        nombreTxt.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        nombreTxt.setOpaque(false);
        nombreTxt.setSelectionColor(new java.awt.Color(161, 54, 48));
        nombreTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nombreTxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nombreTxtFocusLost(evt);
            }
        });
        nombreTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                nombreTxtMouseExited(evt);
            }
        });
        nombreTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nombreTxtKeyReleased(evt);
            }
        });
        jPanel1.add(nombreTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 174, 207, 32));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("(*) Apellidos:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, -1, 32));

        apellidoTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        apellidoTxt.setForeground(new java.awt.Color(161, 54, 48));
        apellidoTxt.setToolTipText("");
        apellidoTxt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        apellidoTxt.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        apellidoTxt.setOpaque(false);
        apellidoTxt.setSelectionColor(new java.awt.Color(161, 54, 48));
        apellidoTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                apellidoTxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                apellidoTxtFocusLost(evt);
            }
        });
        apellidoTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                apellidoTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                apellidoTxtMouseExited(evt);
            }
        });
        apellidoTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                apellidoTxtKeyReleased(evt);
            }
        });
        jPanel1.add(apellidoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(448, 174, 207, 32));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("(*) Telefono:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, 32));

        telefonoTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        telefonoTxt.setForeground(new java.awt.Color(161, 54, 48));
        telefonoTxt.setToolTipText("");
        telefonoTxt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        telefonoTxt.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        telefonoTxt.setOpaque(false);
        telefonoTxt.setSelectionColor(new java.awt.Color(161, 54, 48));
        telefonoTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                telefonoTxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                telefonoTxtFocusLost(evt);
            }
        });
        telefonoTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                telefonoTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                telefonoTxtMouseExited(evt);
            }
        });
        telefonoTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                telefonoTxtKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                telefonoTxtKeyTyped(evt);
            }
        });
        jPanel1.add(telefonoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 237, 132, 32));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("(*) Correo:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, -1, 32));

        correoTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        correoTxt.setForeground(new java.awt.Color(161, 54, 48));
        correoTxt.setText("sinCorreo@hotmail.com");
        correoTxt.setToolTipText("");
        correoTxt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        correoTxt.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        correoTxt.setOpaque(false);
        correoTxt.setSelectionColor(new java.awt.Color(161, 54, 48));
        correoTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                correoTxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                correoTxtFocusLost(evt);
            }
        });
        correoTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                correoTxtMouseExited(evt);
            }
        });
        correoTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                correoTxtKeyReleased(evt);
            }
        });
        jPanel1.add(correoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(369, 237, 286, 32));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Dirección:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 299, -1, 32));

        direccionTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        direccionTxt.setForeground(new java.awt.Color(161, 54, 48));
        direccionTxt.setText("Peru");
        direccionTxt.setToolTipText("");
        direccionTxt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        direccionTxt.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        direccionTxt.setOpaque(false);
        direccionTxt.setSelectionColor(new java.awt.Color(161, 54, 48));
        direccionTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                direccionTxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                direccionTxtFocusLost(evt);
            }
        });
        direccionTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                direccionTxtMouseExited(evt);
            }
        });
        direccionTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                direccionTxtKeyReleased(evt);
            }
        });
        jPanel1.add(direccionTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 299, 540, 32));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("(*) Cargo en su Empresa:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, 32));

        cargoTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cargoTxt.setForeground(new java.awt.Color(161, 54, 48));
        cargoTxt.setText("Comprador");
        cargoTxt.setToolTipText("");
        cargoTxt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        cargoTxt.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        cargoTxt.setOpaque(false);
        cargoTxt.setSelectionColor(new java.awt.Color(161, 54, 48));
        cargoTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cargoTxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cargoTxtFocusLost(evt);
            }
        });
        cargoTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cargoTxtMouseExited(evt);
            }
        });
        cargoTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cargoTxtKeyReleased(evt);
            }
        });
        jPanel1.add(cargoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 362, 200, 32));
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(257, 400, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel11.setText("Campos con ( * ) son Necesarios ");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 100, -1, 32));

        idTxt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        idTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        idTxt.setText("0");
        idTxt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(idTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 40, 32));

        resetButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        resetButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/reset_1847.png"))); // NOI18N
        resetButton.setText("   Reestablecer Datos");
        resetButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        resetButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resetButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                resetButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                resetButtonMouseExited(evt);
            }
        });
        jPanel1.add(resetButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 430, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("ID Cliente:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 107, -1, 32));

        editarButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        editarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/edit-validated_40458.png"))); // NOI18N
        editarButton.setText("Actualizar Datos de Persona");
        editarButton.setContentAreaFilled(false);
        editarButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarButtonActionPerformed(evt);
            }
        });
        jPanel1.add(editarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 423, 300, 70));

        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/back_12955.png"))); // NOI18N
        backButton.setContentAreaFilled(false);
        backButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        jPanel1.add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 423, 100, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 533, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nombreTxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nombreTxtFocusGained
        nombreTxt.setBorder(new MatteBorder(0, 0, 2, 0, new Color(161, 54, 48)));
    }//GEN-LAST:event_nombreTxtFocusGained

    private void nombreTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nombreTxtFocusLost
        nombreTxt.setBorder(new MatteBorder(0, 0, 1, 0, Color.BLACK));
    }//GEN-LAST:event_nombreTxtFocusLost

    private void nombreTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombreTxtMouseExited

        //
    }//GEN-LAST:event_nombreTxtMouseExited

    private void nombreTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreTxtKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_F1) {
            new listarClientes(1).setVisible(true);
        }
    }//GEN-LAST:event_nombreTxtKeyReleased

    private void apellidoTxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_apellidoTxtFocusGained
        apellidoTxt.setBorder(new MatteBorder(0, 0, 2, 0, new Color(161, 54, 48)));
    }//GEN-LAST:event_apellidoTxtFocusGained

    private void apellidoTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_apellidoTxtFocusLost
        apellidoTxt.setBorder(new MatteBorder(0, 0, 1, 0, Color.BLACK));
    }//GEN-LAST:event_apellidoTxtFocusLost

    private void apellidoTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_apellidoTxtMouseExited

    }//GEN-LAST:event_apellidoTxtMouseExited

    private void apellidoTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_apellidoTxtKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_apellidoTxtKeyReleased

    private void telefonoTxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_telefonoTxtFocusGained
        telefonoTxt.setBorder(new MatteBorder(0, 0, 2, 0, new Color(161, 54, 48)));
    }//GEN-LAST:event_telefonoTxtFocusGained

    private void telefonoTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_telefonoTxtFocusLost
        telefonoTxt.setBorder(new MatteBorder(0, 0, 1, 0, Color.BLACK));


    }//GEN-LAST:event_telefonoTxtFocusLost

    private void telefonoTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_telefonoTxtMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_telefonoTxtMouseExited

    private void telefonoTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telefonoTxtKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_telefonoTxtKeyReleased

    private void correoTxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_correoTxtFocusGained
        correoTxt.setBorder(new MatteBorder(0, 0, 2, 0, new Color(161, 54, 48)));

    }//GEN-LAST:event_correoTxtFocusGained

    private void correoTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_correoTxtFocusLost
        correoTxt.setBorder(new MatteBorder(0, 0, 1, 0, Color.BLACK));
    }//GEN-LAST:event_correoTxtFocusLost

    private void correoTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_correoTxtMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_correoTxtMouseExited

    private void correoTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_correoTxtKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_correoTxtKeyReleased

    private void direccionTxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_direccionTxtFocusGained
        direccionTxt.setBorder(new MatteBorder(0, 0, 2, 0, new Color(161, 54, 48)));

    }//GEN-LAST:event_direccionTxtFocusGained

    private void direccionTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_direccionTxtFocusLost
        direccionTxt.setBorder(new MatteBorder(0, 0, 1, 0, Color.BLACK));
    }//GEN-LAST:event_direccionTxtFocusLost

    private void direccionTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_direccionTxtMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_direccionTxtMouseExited

    private void direccionTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_direccionTxtKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_direccionTxtKeyReleased

    private void cargoTxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cargoTxtFocusGained
        cargoTxt.setBorder(new MatteBorder(0, 0, 2, 0, new Color(161, 54, 48)));

    }//GEN-LAST:event_cargoTxtFocusGained

    private void cargoTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cargoTxtFocusLost
        cargoTxt.setBorder(new MatteBorder(0, 0, 1, 0, Color.BLACK));
    }//GEN-LAST:event_cargoTxtFocusLost

    private void cargoTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cargoTxtMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_cargoTxtMouseExited

    private void cargoTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cargoTxtKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_cargoTxtKeyReleased

    private void apellidoTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_apellidoTxtMouseEntered

    }//GEN-LAST:event_apellidoTxtMouseEntered

    private void telefonoTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_telefonoTxtMouseEntered

    }//GEN-LAST:event_telefonoTxtMouseEntered

    private void resetButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resetButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_resetButtonMouseClicked

    private void resetButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resetButtonMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_resetButtonMouseEntered

    private void resetButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resetButtonMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_resetButtonMouseExited

    private void telefonoTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telefonoTxtKeyTyped
        new tools().soloNumerosyCantidadDigitos(evt, telefonoTxt, 8);
    }//GEN-LAST:event_telefonoTxtKeyTyped

    private void editarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarButtonActionPerformed

        if (validarCampos()) {
            System.out.println("Ingreso!");
            PersonaContacto pc = new PersonaContacto(
                    Integer.parseInt(idTxt.getText()),
                    nombreTxt.getText(), apellidoTxt.getText(),
                    correoTxt.getText(), telefonoTxt.getText(),
                    direccionTxt.getText(), cargoTxt.getText(), 0
            );
            int resultado = pc.Insert();
            if (resultado == 1) {
                String nombre = nombreTxt.getText() + " " + apellidoTxt.getText();
                new rojerusan.RSNotifyFade("¡¡SUCCESS!!", nombre + " Agregada como Persona de Contacto con Exito!", 7, RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.SUCCESS).setVisible(true);

                ns.buscarContacto();
                ns.comboContacto.setSelectedItem(nombre);
                limpiarCampos();
                this.dispose();
            }
        }

    }//GEN-LAST:event_editarButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        if (escape==1) {
            ns.setExtendedState(NORMAL);
            newSolicitud.buscarContacto();
           
        } else {
            if(escape==2){
                
            }
        }
 this.dispose();

    }//GEN-LAST:event_backButtonActionPerformed

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
            java.util.logging.Logger.getLogger(verInfoPersonaContacto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(verInfoPersonaContacto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(verInfoPersonaContacto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(verInfoPersonaContacto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new verInfoPersonaContacto().setVisible(true);
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                    UIManager.put("TextField.inactiveBackground", new ColorUIResource(new Color(255, 255, 255)));
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(verInfoPersonaContacto.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(verInfoPersonaContacto.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(verInfoPersonaContacto.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(verInfoPersonaContacto.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField apellidoTxt;
    private javax.swing.JButton backButton;
    public static javax.swing.JTextField cargoTxt;
    public static javax.swing.JTextField correoTxt;
    public static javax.swing.JTextField direccionTxt;
    private javax.swing.JButton editarButton;
    public static javax.swing.JLabel idTxt;
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
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JTextField nombreTxt;
    private rojeru_san.rspanel.RSPanelGradiente rSPanelGradiente1;
    private javax.swing.JLabel resetButton;
    public static javax.swing.JTextField telefonoTxt;
    // End of variables declaration//GEN-END:variables

    private void cargarDatos() {

        if (miPermiso == 0) { // Visualizar SOlamente
            editarButton.setVisible(false);
            resetButton.setVisible(false);
            idTxt.setText(pc.getId() + "");
            nombreTxt.setText(pc.getNombres());
            apellidoTxt.setText(pc.getApellidos());
            telefonoTxt.setText(pc.getTelefono());
            correoTxt.setText(pc.getCorreo());

            direccionTxt.setText(pc.getDireccion());
            cargoTxt.setText(pc.getCargoEmpresa());
        } else if (miPermiso == 1) { // Agregar Nuevo
            editarButton.setVisible(true);
            resetButton.setVisible(true);
            idTxt.setText("");
            limpiarCampos();
            editarButton.setText("Agregar Persona de Contacto");

        }

    }

    private void setPermisos(int permiso) {
        miPermiso = permiso;
        cargarDatos();
    }

    private void limpiarCampos() {
        nombreTxt.setText("");
        apellidoTxt.setText("");
        telefonoTxt.setText("");
        correoTxt.setText("sinCorreo@hotmail.com");
        direccionTxt.setText("Peru");
        cargoTxt.setText("Comprador");
    }

    private boolean validarCampos() {
        boolean llave = false;
        if (nombreTxt.getText().length() > 0) {
            if (apellidoTxt.getText().length() > 0) {
                if (telefonoTxt.getText().length() > 0) {
                    if (correoTxt.getText().length() > 0) {
                        if (cargoTxt.getText().length() > 0) {
                            llave = true;
                        } else {
                            JOptionPane.showMessageDialog(direccionTxt, "Ingrese el cargo de la Persona de contacto");
                            return false;
                        }
                    } else {
                        JOptionPane.showMessageDialog(direccionTxt, "No deje el campo de correo sin ingresar");
                        return false;
                    }
                } else {
                    JOptionPane.showMessageDialog(direccionTxt, "Ingrese un Número de telefono");
                    return false;
                }
            } else {
                JOptionPane.showMessageDialog(direccionTxt, "Debe ingresar un apellido");
                return false;
            }
        } else {
            JOptionPane.showMessageDialog(direccionTxt, "El Nombre no debe estar Vacio");
            return false;
        }

        return llave;
    }

}
