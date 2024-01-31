/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Panels;

import VentanasRST.consultaCotizacionVentas;
import VentanasRST.consultaCotizacionGerencia;

/**
 *
 * @author soporte
 */
public class panelConsultar extends javax.swing.JPanel {

    public static int opcion = 1;

    public panelConsultar() {
        initComponents();
    }

   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        opcion1 = new rojeru_san.rsbutton.RSButtonSelectedIcon();
        opcion2 = new rojeru_san.rsbutton.RSButtonSelectedIcon();

        setBackground(new java.awt.Color(255, 255, 255));

        opcion1.setBackground(new java.awt.Color(255, 255, 255));
        opcion1.setForeground(new java.awt.Color(0, 0, 0));
        opcion1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Search_find_magnifier_248.png"))); // NOI18N
        opcion1.setText(" Cot. - Ventas");
        opcion1.setColorHover(new java.awt.Color(255, 255, 255));
        opcion1.setColorLine(new java.awt.Color(161, 54, 48));
        opcion1.setEfecto(rojeru_san.rsbutton.RSButtonSelectedIcon.EFECTO.RIPLE);
        opcion1.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        opcion1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        opcion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion1ActionPerformed(evt);
            }
        });

        opcion2.setBackground(new java.awt.Color(255, 255, 255));
        opcion2.setForeground(new java.awt.Color(0, 0, 0));
        opcion2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Search_find_magnifier_248.png"))); // NOI18N
        opcion2.setText("    Cot. - Gerencia");
        opcion2.setColorHover(new java.awt.Color(255, 255, 255));
        opcion2.setColorLine(new java.awt.Color(161, 54, 48));
        opcion2.setEfecto(rojeru_san.rsbutton.RSButtonSelectedIcon.EFECTO.RIPLE);
        opcion2.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        opcion2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        opcion2.setIconTextGap(0);
        opcion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(opcion1, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                    .addComponent(opcion2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(opcion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(opcion2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(191, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void opcion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion1ActionPerformed
       opcion = 1;
        setOpcion();
    }//GEN-LAST:event_opcion1ActionPerformed

    private void opcion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion2ActionPerformed
        opcion = 2;
        setOpcion();
    }//GEN-LAST:event_opcion2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static rojeru_san.rsbutton.RSButtonSelectedIcon opcion1;
    private static rojeru_san.rsbutton.RSButtonSelectedIcon opcion2;
    // End of variables declaration//GEN-END:variables

    public static void setOpcion() {

        switch (opcion) {
            case 1:
                opcion1.setSelected(true);
                opcion2.setSelected(false);
                //opcion1.setSelected(false);
                //opcion2.setSelected(false);
                 new consultaCotizacionVentas().setVisible(true);
                break;
            case 2:
                opcion2.setSelected(true);

                opcion1.setSelected(false);
                //opcion1.setSelected(false);
                //opcion2.setSelected(false);
                new consultaCotizacionGerencia().setVisible(true);
                break;

            case 3:
                opcion1.setSelected(true);

                opcion1.setSelected(false);
                opcion2.setSelected(false);
                //opcion3.setSelected(false);               
                
               
                break;
            case 4:
                opcion2.setSelected(true);

                opcion1.setSelected(false);
                opcion1.setSelected(false);
                opcion2.setSelected(false);
                //m.scrollContenido.setViewportView(pcD);
                break;
        }
    }

}
