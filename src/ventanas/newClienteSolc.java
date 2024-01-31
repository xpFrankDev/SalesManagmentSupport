/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VentanasRST;

import Clases.Cliente;
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.border.MatteBorder;
import rojerusan.RSNotifyFade;

/**
 *
 * @author soporte
 */
public class newClienteSolc extends javax.swing.JFrame {

    newSolicitud ns;
    int tipo;
    int idOriginal;

    public newClienteSolc() {
        initComponents();
        changeIcon();
    }

    public newClienteSolc(newSolicitud ns, int tipo, String titulo) {
        initComponents();
        this.ns = ns;
        this.tipo = tipo;
        tituloTxt.setText(titulo);
        changeIcon();
        nombreTxt.requestFocus();
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
        jLabel2 = new javax.swing.JLabel();
        nombreTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        rucTxt = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        rSPanelGradiente1 = new rojeru_san.rspanel.RSPanelGradiente();
        tituloTxt = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        panelCentral.setBackground(new java.awt.Color(255, 255, 255));
        panelCentral.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Nombre de la Empresa:");

        nombreTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nombreTxt.setToolTipText("Nombre de la Empresa");
        nombreTxt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
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

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("RUC:");

        rucTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rucTxt.setToolTipText("Ruc de la Empresa");
        rucTxt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        rucTxt.setOpaque(false);
        rucTxt.setSelectionColor(new java.awt.Color(161, 54, 48));
        rucTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                rucTxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                rucTxtFocusLost(evt);
            }
        });
        rucTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                rucTxtMouseExited(evt);
            }
        });
        rucTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                rucTxtKeyReleased(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/plus_32x32.png"))); // NOI18N
        jButton2.setText("   Ingresar Datos");
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        rSPanelGradiente1.setColorPrimario(new java.awt.Color(161, 54, 48));
        rSPanelGradiente1.setColorSecundario(new java.awt.Color(153, 153, 153));

        tituloTxt.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        tituloTxt.setForeground(new java.awt.Color(255, 255, 255));
        tituloTxt.setText("Ingresar Nuevo Cliente");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/windowclose_104378.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
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
                .addGap(39, 39, 39)
                .addComponent(tituloTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 180, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        rSPanelGradiente1Layout.setVerticalGroup(
            rSPanelGradiente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(tituloTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelCentralLayout = new javax.swing.GroupLayout(panelCentral);
        panelCentral.setLayout(panelCentralLayout);
        panelCentralLayout.setHorizontalGroup(
            panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCentralLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap())
            .addGroup(panelCentralLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCentralLayout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(rucTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCentralLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(nombreTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCentralLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(rSPanelGradiente1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelCentralLayout.setVerticalGroup(
            panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCentralLayout.createSequentialGroup()
                .addComponent(rSPanelGradiente1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rucTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jButton2)
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
            .addComponent(panelCentral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        ns.setExtendedState(NORMAL);
    }//GEN-LAST:event_jButton1ActionPerformed

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

    }//GEN-LAST:event_nombreTxtKeyReleased

    private void rucTxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_rucTxtFocusGained
        rucTxt.setBorder(new MatteBorder(0, 0, 2, 0, new Color(161, 54, 48)));
    }//GEN-LAST:event_rucTxtFocusGained

    private void rucTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_rucTxtFocusLost
        rucTxt.setBorder(new MatteBorder(0, 0, 1, 0, Color.BLACK));
    }//GEN-LAST:event_rucTxtFocusLost

    private void rucTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rucTxtMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_rucTxtMouseExited

    private void rucTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rucTxtKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_rucTxtKeyReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        if (validarDatos()) {

            String nombre = nombreTxt.getText();
            String ruc = rucTxt.getText();

            if (tipo == 1) {

                Cliente ctemp=null;
                
                ctemp= new Cliente().buscarXNombre(nombre);
                
                if (ctemp.getID() != 0) {
                    JOptionPane.showMessageDialog(rootPane, "Cliente ya registrado con este nombre");
                } else {
                    ctemp = null;
                    ctemp = new Cliente().buscarXRUC(ruc);
                    
                    if (ctemp.getID() != 0) {
                        JOptionPane.showMessageDialog(rootPane, "Número Ruc registrado previamente");
                    } else {
                        Cliente c = new Cliente();
                        c.setNombre1(nombre);
                        c.setRuc(ruc);
                        int rsp = c.insert();

                        if (rsp == 1) {
                            new rojerusan.RSNotifyFade("¡¡SUCCESS!!", " Cliente Ingresado Correctamente con el nombre : " + nombre, 7, RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.SUCCESS).setVisible(true);
                            nombreTxt.setText("");
                            nombreTxt.requestFocus();
                            rucTxt.setText("");
                            ns.clienteTxt.setText(nombre);

                            ns.clienteTxt.requestFocus();
                            ns.buscarContacto();
                            this.dispose();
                            ns.setExtendedState(NORMAL);

                        } else {
                            JOptionPane.showMessageDialog(rootPane, "Error Agregando CLiente");
                        }
                    }
                }

            } else {
                Cliente c = new Cliente();
                c.buscarNombre(nombre);
                c.setID(idOriginal);
                c.setNombre1(nombre);
                c.setRuc(ruc);
                int rsp = c.update();
                if (rsp == 1) {
                    new rojerusan.RSNotifyFade("¡¡SUCCESS!!", " Cliente Actualizado Correctamente ", 7, RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.SUCCESS).setVisible(true);
                    nombreTxt.setText("");
                    rucTxt.setText("");
                    nombreTxt.requestFocus();
                    ns.clienteTxt.setText(nombre);

                    this.dispose();
                    ns.setExtendedState(NORMAL);
                    ns.buscarContacto();
                    ns.clienteTxt.requestFocus();
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Error Agregando CLiente");
                }
            }
        }


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        this.dispose();
        ns.setExtendedState(NORMAL);
    }//GEN-LAST:event_jButton1MouseClicked

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
            java.util.logging.Logger.getLogger(newClienteSolc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(newClienteSolc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(newClienteSolc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(newClienteSolc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new newClienteSolc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    public static javax.swing.JTextField nombreTxt;
    private javax.swing.JPanel panelCentral;
    private rojeru_san.rspanel.RSPanelGradiente rSPanelGradiente1;
    public static javax.swing.JTextField rucTxt;
    private javax.swing.JLabel tituloTxt;
    // End of variables declaration//GEN-END:variables

    private void iniciar() {
        if (tipo == 2) {
            Cliente c = new Cliente();
            int rsp = c.buscarNombre(newSolicitud.clienteTxt.getText());
            if (rsp != 0) {
                nombreTxt.setText(c.getNombre1());
                rucTxt.setText(c.getRuc());
                idOriginal = c.getID();
            }

        }
        if (tipo == 1) {
            nombreTxt.setText(newSolicitud.clienteTxt.getText());
        }
    }

    private boolean validarDatos() {
        boolean llave = false;

        if (nombreTxt.getText().length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Ingrese nombre del cliente");
        } else if (rucTxt.getText().length() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Ingrese Ruc");
        } else {
            llave = true;
        }

        return llave;
    }
}
