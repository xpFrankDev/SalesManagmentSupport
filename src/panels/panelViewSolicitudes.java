/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Panels;

import Clases.Solicitud;
import VentanasRST.Main;
import VentanasRST.editarSolicitud;
import VentanasRST.newSolicitud;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author soporte
 */
public class panelViewSolicitudes extends javax.swing.JPanel {

    public panelViewSolicitudes() {
        initComponents();
        vistaButton.setVisible(false);
        
    }
   

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelDato4 = new javax.swing.JPanel();
        dato1Header3 = new javax.swing.JPanel();
        headerText3 = new javax.swing.JLabel();
        rSButtonIconShadow3 = new RSMaterialComponent.RSButtonIconShadow();
        info3Txt = new javax.swing.JLabel();
        panelDato1 = new javax.swing.JPanel();
        dato1Header = new javax.swing.JPanel();
        headerText = new javax.swing.JLabel();
        rSButtonIconShadow2 = new RSMaterialComponent.RSButtonIconShadow();
        info2Txt = new javax.swing.JLabel();
        panelDato2 = new javax.swing.JPanel();
        dato1Header1 = new javax.swing.JPanel();
        headerText1 = new javax.swing.JLabel();
        rSButtonIconShadow1 = new RSMaterialComponent.RSButtonIconShadow();
        info1Txt = new javax.swing.JLabel();
        vistaButton = new RSMaterialComponent.RSButtonIconShadow();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        panelDato4.setBackground(new java.awt.Color(255, 255, 255));
        panelDato4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        dato1Header3.setBackground(new java.awt.Color(161, 54, 48));

        headerText3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        headerText3.setForeground(new java.awt.Color(255, 255, 255));
        headerText3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headerText3.setText("Pendiente por Procesar");

        rSButtonIconShadow3.setBackground(new java.awt.Color(161, 54, 48));
        rSButtonIconShadow3.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.CLEAR);
        rSButtonIconShadow3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonIconShadow3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dato1Header3Layout = new javax.swing.GroupLayout(dato1Header3);
        dato1Header3.setLayout(dato1Header3Layout);
        dato1Header3Layout.setHorizontalGroup(
            dato1Header3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dato1Header3Layout.createSequentialGroup()
                .addComponent(headerText3, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rSButtonIconShadow3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        dato1Header3Layout.setVerticalGroup(
            dato1Header3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dato1Header3Layout.createSequentialGroup()
                .addGroup(dato1Header3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(headerText3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSButtonIconShadow3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        info3Txt.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        info3Txt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        info3Txt.setText("@");

        javax.swing.GroupLayout panelDato4Layout = new javax.swing.GroupLayout(panelDato4);
        panelDato4.setLayout(panelDato4Layout);
        panelDato4Layout.setHorizontalGroup(
            panelDato4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dato1Header3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(info3Txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelDato4Layout.setVerticalGroup(
            panelDato4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDato4Layout.createSequentialGroup()
                .addComponent(dato1Header3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(info3Txt, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelDato1.setBackground(new java.awt.Color(255, 255, 255));
        panelDato1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        dato1Header.setBackground(new java.awt.Color(161, 54, 48));

        headerText.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        headerText.setForeground(new java.awt.Color(255, 255, 255));
        headerText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headerText.setText("Mis Solicitudes (Hoy)");

        rSButtonIconShadow2.setBackground(new java.awt.Color(161, 54, 48));
        rSButtonIconShadow2.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.CLEAR);
        rSButtonIconShadow2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonIconShadow2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dato1HeaderLayout = new javax.swing.GroupLayout(dato1Header);
        dato1Header.setLayout(dato1HeaderLayout);
        dato1HeaderLayout.setHorizontalGroup(
            dato1HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dato1HeaderLayout.createSequentialGroup()
                .addComponent(headerText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rSButtonIconShadow2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        dato1HeaderLayout.setVerticalGroup(
            dato1HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dato1HeaderLayout.createSequentialGroup()
                .addGroup(dato1HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(headerText, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSButtonIconShadow2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        info2Txt.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        info2Txt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        info2Txt.setText("@");
        info2Txt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                info2TxtMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelDato1Layout = new javax.swing.GroupLayout(panelDato1);
        panelDato1.setLayout(panelDato1Layout);
        panelDato1Layout.setHorizontalGroup(
            panelDato1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dato1Header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(info2Txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelDato1Layout.setVerticalGroup(
            panelDato1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDato1Layout.createSequentialGroup()
                .addComponent(dato1Header, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(info2Txt, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelDato2.setBackground(new java.awt.Color(255, 255, 255));
        panelDato2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        dato1Header1.setBackground(new java.awt.Color(161, 54, 48));

        headerText1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        headerText1.setForeground(new java.awt.Color(255, 255, 255));
        headerText1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headerText1.setText("Solicitudes Ingresadas (Hoy)");

        rSButtonIconShadow1.setBackground(new java.awt.Color(161, 54, 48));
        rSButtonIconShadow1.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.CLEAR);
        rSButtonIconShadow1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonIconShadow1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dato1Header1Layout = new javax.swing.GroupLayout(dato1Header1);
        dato1Header1.setLayout(dato1Header1Layout);
        dato1Header1Layout.setHorizontalGroup(
            dato1Header1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dato1Header1Layout.createSequentialGroup()
                .addComponent(headerText1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rSButtonIconShadow1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        dato1Header1Layout.setVerticalGroup(
            dato1Header1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dato1Header1Layout.createSequentialGroup()
                .addGroup(dato1Header1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(headerText1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSButtonIconShadow1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        info1Txt.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        info1Txt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        info1Txt.setText("@");

        javax.swing.GroupLayout panelDato2Layout = new javax.swing.GroupLayout(panelDato2);
        panelDato2.setLayout(panelDato2Layout);
        panelDato2Layout.setHorizontalGroup(
            panelDato2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dato1Header1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(info1Txt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelDato2Layout.setVerticalGroup(
            panelDato2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDato2Layout.createSequentialGroup()
                .addComponent(dato1Header1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(info1Txt, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                .addContainerGap())
        );

        vistaButton.setBackground(new java.awt.Color(161, 54, 48));
        vistaButton.setBackgroundHover(new java.awt.Color(77, 164, 98));
        vistaButton.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.VISIBILITY);
        vistaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vistaButtonActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/new_file_128x128.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Ingresar Solicitud");

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/edit-file_128x128.png"))); // NOI18N
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Editar Solicitud");

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/delete-file_128x128.png"))); // NOI18N
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Eliminar Solicitud");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(panelDato2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(vistaButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(93, 93, 93)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelDato1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(20, 20, 20))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(71, 71, 71)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(panelDato4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(vistaButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelDato2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelDato1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelDato4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 167, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)))
                .addGap(107, 107, 107))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void info2TxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_info2TxtMouseClicked
       
    }//GEN-LAST:event_info2TxtMouseClicked

    private void vistaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vistaButtonActionPerformed
        panelDato1.setVisible(true);
        panelDato2.setVisible(true);
        panelDato4.setVisible(true);

        vistaButton.setVisible(false);
    }//GEN-LAST:event_vistaButtonActionPerformed

    private void rSButtonIconShadow1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonIconShadow1ActionPerformed
        panelDato2.setVisible(false);
        if (!panelDato1.isShowing() && !panelDato2.isShowing() && !panelDato4.isShowing()) {
            vistaButton.setVisible(true);
        }
    }//GEN-LAST:event_rSButtonIconShadow1ActionPerformed

    private void rSButtonIconShadow2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonIconShadow2ActionPerformed
       panelDato1.setVisible(false);
        if (!panelDato1.isShowing() && !panelDato2.isShowing() && !panelDato4.isShowing()) {
            vistaButton.setVisible(true);
        }
    }//GEN-LAST:event_rSButtonIconShadow2ActionPerformed

    private void rSButtonIconShadow3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonIconShadow3ActionPerformed
     panelDato4.setVisible(false);
        if (!panelDato1.isShowing() && !panelDato2.isShowing() && !panelDato4.isShowing()) {
            vistaButton.setVisible(true);
        }
    }//GEN-LAST:event_rSButtonIconShadow3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       new newSolicitud().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      new editarSolicitud().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new editarSolicitud(2).setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel dato1Header;
    private javax.swing.JPanel dato1Header1;
    private javax.swing.JPanel dato1Header3;
    private javax.swing.JLabel headerText;
    private javax.swing.JLabel headerText1;
    private javax.swing.JLabel headerText3;
    private javax.swing.JLabel info1Txt;
    private javax.swing.JLabel info2Txt;
    private javax.swing.JLabel info3Txt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel panelDato1;
    private javax.swing.JPanel panelDato2;
    private javax.swing.JPanel panelDato4;
    private RSMaterialComponent.RSButtonIconShadow rSButtonIconShadow1;
    private RSMaterialComponent.RSButtonIconShadow rSButtonIconShadow2;
    private RSMaterialComponent.RSButtonIconShadow rSButtonIconShadow3;
    private RSMaterialComponent.RSButtonIconShadow vistaButton;
    // End of variables declaration//GEN-END:variables

   public void actualizarDatos() {
       int totalSolicitudes = new Solicitud().getTotalSolicitudHoy();
       int miTotalSolicitudes = new Solicitud().getTotalSolicitudHoy(Main.getVendedor());
       int totalProcesadas = new Solicitud().getTotalSolicitudSINProcesar();
       
       info1Txt.setText(totalSolicitudes+"");
       info2Txt.setText(miTotalSolicitudes+"");
       info3Txt.setText(totalProcesadas+"");
       //autoActualizarDatos ();
    }
   
   private void autoActualizarDatos(){
      

        TimerTask timerTask = new TimerTask() {
            public void run() {
                actualizarDatos();
            }
        };
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(timerTask, 60000, 60000);
    
   }
}
