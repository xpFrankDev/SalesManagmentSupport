/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Panels;

import Clases.Conectar;
import Clases.Presupuesto;
import VentanasRST.Main;
import VentanasRST.newPresupuesto;
import java.util.Timer;
import java.util.TimerTask;



public class panelViewPresupuesto extends javax.swing.JPanel {
    //Main m;
    public panelViewPresupuesto() {
        initComponents();
        vistaButton.setVisible(false);
        //new Thread(this::autoActualizarDatos).start();
    }
    public panelViewPresupuesto(Main m) {
        initComponents();
        vistaButton.setVisible(false);
        //this.m=m;
       // new Thread(this::autoActualizarDatos).start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelDato1 = new javax.swing.JPanel();
        dato1Header = new javax.swing.JPanel();
        headerText = new javax.swing.JLabel();
        rSButtonIconShadow2 = new RSMaterialComponent.RSButtonIconShadow();
        info2 = new javax.swing.JLabel();
        panelDato2 = new javax.swing.JPanel();
        dato1Header1 = new javax.swing.JPanel();
        headerText1 = new javax.swing.JLabel();
        rSButtonIconShadow1 = new RSMaterialComponent.RSButtonIconShadow();
        info1 = new javax.swing.JLabel();
        vistaButton = new RSMaterialComponent.RSButtonIconShadow();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        panelDato1.setBackground(new java.awt.Color(255, 255, 255));
        panelDato1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        dato1Header.setBackground(new java.awt.Color(161, 54, 48));

        headerText.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        headerText.setForeground(new java.awt.Color(255, 255, 255));
        headerText.setText("     Mis Presupuestos (Hoy)");

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
                .addContainerGap()
                .addComponent(headerText, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
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

        info2.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        info2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        info2.setText("@");
        info2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                info2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelDato1Layout = new javax.swing.GroupLayout(panelDato1);
        panelDato1.setLayout(panelDato1Layout);
        panelDato1Layout.setHorizontalGroup(
            panelDato1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dato1Header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(info2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelDato1Layout.setVerticalGroup(
            panelDato1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDato1Layout.createSequentialGroup()
                .addComponent(dato1Header, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(info2, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelDato2.setBackground(new java.awt.Color(255, 255, 255));
        panelDato2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        dato1Header1.setBackground(new java.awt.Color(161, 54, 48));

        headerText1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        headerText1.setForeground(new java.awt.Color(255, 255, 255));
        headerText1.setText("    Presupuestos Ingresados (Hoy)");

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
                .addContainerGap()
                .addComponent(headerText1, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
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

        info1.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        info1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        info1.setText("@");

        javax.swing.GroupLayout panelDato2Layout = new javax.swing.GroupLayout(panelDato2);
        panelDato2.setLayout(panelDato2Layout);
        panelDato2Layout.setHorizontalGroup(
            panelDato2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dato1Header1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(info1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelDato2Layout.setVerticalGroup(
            panelDato2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDato2Layout.createSequentialGroup()
                .addComponent(dato1Header1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(info1, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
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

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/document03-_128x128.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Ingresar Presupuesto");

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/check-form__128x128.png"))); // NOI18N
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setEnabled(false);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("SIN ACCION");

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/delete-file_128x128.png"))); // NOI18N
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setEnabled(false);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Editar y Eliminar Presupuesto");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(vistaButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelDato2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12)
                .addComponent(panelDato1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(vistaButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelDato2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelDato1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 166, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)))
                .addGap(107, 107, 107))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void info2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_info2MouseClicked
       
    }//GEN-LAST:event_info2MouseClicked

    private void vistaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vistaButtonActionPerformed
        panelDato1.setVisible(true);
        panelDato2.setVisible(true);       

        vistaButton.setVisible(false);
    }//GEN-LAST:event_vistaButtonActionPerformed

    private void rSButtonIconShadow1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonIconShadow1ActionPerformed
        panelDato2.setVisible(false);
        if (!panelDato1.isShowing() && !panelDato2.isShowing() ){
            vistaButton.setVisible(true);
        }
    }//GEN-LAST:event_rSButtonIconShadow1ActionPerformed

    private void rSButtonIconShadow2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonIconShadow2ActionPerformed
       panelDato1.setVisible(false);
        if (!panelDato1.isShowing() && !panelDato2.isShowing() ) {
            vistaButton.setVisible(true);
        }
    }//GEN-LAST:event_rSButtonIconShadow2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       new newPresupuesto().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel dato1Header;
    private javax.swing.JPanel dato1Header1;
    private javax.swing.JLabel headerText;
    private javax.swing.JLabel headerText1;
    private javax.swing.JLabel info1;
    private javax.swing.JLabel info2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel panelDato1;
    private javax.swing.JPanel panelDato2;
    private RSMaterialComponent.RSButtonIconShadow rSButtonIconShadow1;
    private RSMaterialComponent.RSButtonIconShadow rSButtonIconShadow2;
    private RSMaterialComponent.RSButtonIconShadow vistaButton;
    // End of variables declaration//GEN-END:variables

    public void actualizarDatos() {
       
        int totalIngresadas = new Presupuesto().getTotalpresupuestoHoy();
       int misPresupuestos = new Presupuesto().getTotalpresupuestoHoy(Main.getVendedor());
          info1.setText(totalIngresadas+"");
          info2.setText(misPresupuestos+"");
        //autoActualizarDatos();
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
