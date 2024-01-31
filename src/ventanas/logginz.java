package Ventanas;

import Clases.Conectar;
import Clases.Log;
import Clases.tools;
import VentanasRST.Main;
import com.sun.awt.AWTUtilities;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class logginz extends javax.swing.JFrame {

    String user = "";
    Log l;

    public logginz() {
        initComponents();
        testConectar();
        this.setOpacity((float) 0.95);
        userTxt.requestFocus();
        changeIcon();
        
        AWTUtilities.setWindowOpaque(this, false);//Transparente
        text.setVisible(false);
    }

    private void changeIcon() {
        Image icon = new ImageIcon(getClass().getResource("/imgs/logo_rossetti.jpg")).getImage();
        setIconImage(icon);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        userTxt = new rojeru_san.rsfield.RSTextMaterial();
        passTxt = new rojeru_san.rsfield.RSPassMaterial();
        aceptarButton = new RSMaterialComponent.RSButtonMaterialGradientOne();
        labelIcon2 = new necesario.LabelIcon();
        labelIcon3 = new necesario.LabelIcon();
        text = new javax.swing.JLabel();
        labelIcon4 = new necesario.LabelIcon();
        minimizar = new necesario.LabelIcon();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

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

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                formMouseReleased(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/logo_rossetti 128x128.jpg"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jPanel2.setBackground(new java.awt.Color(252, 252, 252));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        userTxt.setBackground(new java.awt.Color(252, 252, 252));
        userTxt.setForeground(new java.awt.Color(161, 54, 48));
        userTxt.setColorMaterial(new java.awt.Color(161, 54, 48));
        userTxt.setPlaceholder("Ingrese Usuario");
        userTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                userTxtKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                userTxtKeyTyped(evt);
            }
        });

        passTxt.setBackground(new java.awt.Color(252, 252, 252));
        passTxt.setForeground(new java.awt.Color(161, 54, 48));
        passTxt.setColorMaterial(new java.awt.Color(161, 54, 48));
        passTxt.setPlaceholder("Ingrese Contraseña");
        passTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passTxtKeyPressed(evt);
            }
        });

        aceptarButton.setBackground(new java.awt.Color(161, 54, 48));
        aceptarButton.setText("Ingresar");
        aceptarButton.setColorPrimario(new java.awt.Color(192, 121, 117));
        aceptarButton.setColorPrimarioHover(new java.awt.Color(161, 54, 48));
        aceptarButton.setColorSecundario(new java.awt.Color(161, 54, 48));
        aceptarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                aceptarButtonMouseEntered(evt);
            }
        });
        aceptarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarButtonActionPerformed(evt);
            }
        });

        labelIcon2.setForeground(new java.awt.Color(161, 54, 48));
        labelIcon2.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.ACCOUNT_CIRCLE);

        labelIcon3.setForeground(new java.awt.Color(161, 54, 48));
        labelIcon3.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.LOCK);

        text.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text.setText("www.Rossettisac.com");

        labelIcon4.setBackground(new java.awt.Color(161, 54, 48));
        labelIcon4.setForeground(new java.awt.Color(255, 255, 255));
        labelIcon4.setToolTipText("Salir del Sistema");
        labelIcon4.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.CLEAR);
        labelIcon4.setThemeTooltip(necesario.Global.THEMETOOLTIP.LIGHT);
        labelIcon4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelIcon4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelIcon4MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                labelIcon4MousePressed(evt);
            }
        });

        minimizar.setBackground(new java.awt.Color(161, 54, 48));
        minimizar.setForeground(new java.awt.Color(255, 255, 255));
        minimizar.setToolTipText("Salir del Sistema");
        minimizar.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.REMOVE);
        minimizar.setThemeTooltip(necesario.Global.THEMETOOLTIP.LIGHT);
        minimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                minimizarMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                minimizarMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(72, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(labelIcon3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(passTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(labelIcon2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(userTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(aceptarButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(56, 56, 56))
            .addComponent(text, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(minimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelIcon4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(minimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelIcon4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(userTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelIcon2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addComponent(passTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(labelIcon3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(aceptarButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(text))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 410, 250));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/YouTube_23392.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 260, 50, 50));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/facebook_box_blue_256_30649.png"))); // NOI18N
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 90, 50, 50));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Google_Chrome_icon-icons.com_75711.png"))); // NOI18N
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 150, 50, 50));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/twitter_socialnetwork_20007.png"))); // NOI18N
        jButton4.setContentAreaFilled(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 210, 50, 50));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("S G D S - Rossetti S.A.C.");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 340, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Sistema de gestión de Solicitudes de ventas");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 340, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
int xx, yy;
    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        xx = evt.getX();
        yy = evt.getY();
        setCursor(new Cursor(HAND_CURSOR));

    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - yy);
    }//GEN-LAST:event_formMouseDragged

    private void minimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizarMouseClicked
       this.setExtendedState(ICONIFIED);

    }//GEN-LAST:event_minimizarMouseClicked

    private void minimizarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizarMousePressed
        // System.exit(0);
    }//GEN-LAST:event_minimizarMousePressed

    private void userTxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_userTxtKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            passTxt.requestFocus();
        }
    }//GEN-LAST:event_userTxtKeyPressed

    private void userTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_userTxtKeyTyped

    }//GEN-LAST:event_userTxtKeyTyped


    private void passTxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passTxtKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            aceptarButton.doClick();
        }
    }//GEN-LAST:event_passTxtKeyPressed

    private void aceptarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarButtonActionPerformed
        int rsp = 0;
        l = new Log(userTxt.getText());
        rsp = l.validarUsuario();
        
        String pas;
        if (rsp == 0) {
            JOptionPane.showMessageDialog(rootPane, "Usuario no Encontrado");
        } else {
          
            try {
                
            
                if (!l.getEstado().equals("Activo")) {
                    JOptionPane.showMessageDialog(rootPane, "Usurio no se Encuentra Activo");
                } else {
                    pas = l.getPass();

                    if (pas.equals(passTxt.getText())) {                        
                      //  Main m = new Main(l);     
                      //  m.setVendedor(l.getNomLargo());
                       // m.setVisible(true);
                        new Main(l).setVisible(true);
                        

                    //new Main(new Log().buscarNombre(userTxt.getText())).setVisible(true);
                        this.dispose();
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Contraseña No Valida");
                    }
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, e);
            }

        }
    }//GEN-LAST:event_aceptarButtonActionPerformed

    private void aceptarButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aceptarButtonMouseEntered
        aceptarButton.setCursor(new Cursor(HAND_CURSOR));
    }//GEN-LAST:event_aceptarButtonMouseEntered

    private void minimizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizarMouseEntered
        minimizar.setCursor(new Cursor(HAND_CURSOR));
    }//GEN-LAST:event_minimizarMouseEntered

    private void formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseReleased
        setCursor(new Cursor(NORMAL));
    }//GEN-LAST:event_formMouseReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            Abrirenlace("https://www.youtube.com");
        } catch (URISyntaxException ex) {
            Logger.getLogger(logginz.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     try {
            Abrirenlace("https://www.facebook.com/");
        } catch (URISyntaxException ex) {
            Logger.getLogger(logginz.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            Abrirenlace("https://twitter.com/?lang=es");
        } catch (URISyntaxException ex) {
            Logger.getLogger(logginz.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            Abrirenlace("https://rossettisac.com");
        } catch (URISyntaxException ex) {
            Logger.getLogger(logginz.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
      text.setVisible(true);
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
      text.setVisible(false);
    }//GEN-LAST:event_jLabel1MouseExited

    private void labelIcon4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelIcon4MouseClicked
    int rsp = JOptionPane.showConfirmDialog(null, "¿Esta seguro de Cerrar el Sistema?", "Salir", JOptionPane.OK_CANCEL_OPTION);
        if (rsp == 0) {
            new Splash().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_labelIcon4MouseClicked

    private void labelIcon4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelIcon4MouseEntered
      labelIcon4.setCursor(new Cursor(HAND_CURSOR) {
      });
    }//GEN-LAST:event_labelIcon4MouseEntered

    private void labelIcon4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelIcon4MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_labelIcon4MousePressed

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
            java.util.logging.Logger.getLogger(logginz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(logginz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(logginz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(logginz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                    new logginz().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(logginz.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(logginz.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(logginz.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(logginz.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private RSMaterialComponent.RSButtonMaterialGradientOne aceptarButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private necesario.LabelIcon labelIcon2;
    private necesario.LabelIcon labelIcon3;
    private necesario.LabelIcon labelIcon4;
    private necesario.LabelIcon minimizar;
    private rojeru_san.rsfield.RSPassMaterial passTxt;
    private javax.swing.JLabel text;
    private rojeru_san.rsfield.RSTextMaterial userTxt;
    // End of variables declaration//GEN-END:variables


public void Abrirenlace (String enlaceSearch) throws URISyntaxException,URISyntaxException{
        Desktop enlace=Desktop.getDesktop();
        try {
                enlace.browse(new URI(enlaceSearch));
        } catch (IOException | URISyntaxException e) {
          Logger.getLogger(logginz.class.getName()).log(Level.SEVERE, null, e);
           JOptionPane.showMessageDialog(null, e);
        }
    }

    private void testConectar() {
       
        try(Connection con = new Conectar("rstcot").getCon()){
            System.out.println("Sesión: "+con);
        } catch (Exception ex) {
            Logger.getLogger(logginz.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(rootPane, "Error Conectando a la Base de Datos, contacte al administrador\n"+ex);
        }
    }
}
