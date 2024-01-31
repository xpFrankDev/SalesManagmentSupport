/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Panels;

import VentanasRST.Main;

/**
 *
 * @author soporte
 */
public class panelComunicacion extends javax.swing.JPanel {
    
    
    public static int opcion = 1;
    panelAgregarComunicacion pAgregar;
    panelBuscarComunicacionesVendedor pConsultar;
    panelBuscarComunicacionesFechas pConsFechas;
    panelBuscarComunicacionesTipo pConsTipo;
    panelBuscarComunicacionesCliente pConsCliente;
    public panelComunicacion() {
        initComponents();
        opcion =1;        
         pAgregar= new panelAgregarComunicacion();
         pConsultar = new panelBuscarComunicacionesVendedor();
         pConsFechas = new panelBuscarComunicacionesFechas();
         pConsTipo = new panelBuscarComunicacionesTipo();
         pConsCliente = new panelBuscarComunicacionesCliente();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        opcion1 = new rojeru_san.rsbutton.RSButtonSelectedIcon();
        opcion2 = new rojeru_san.rsbutton.RSButtonSelectedIcon();
        opcion3 = new rojeru_san.rsbutton.RSButtonSelectedIcon();
        opcion4 = new rojeru_san.rsbutton.RSButtonSelectedIcon();
        opcion5 = new rojeru_san.rsbutton.RSButtonSelectedIcon();

        setBackground(new java.awt.Color(255, 255, 255));

        opcion1.setBackground(new java.awt.Color(255, 255, 255));
        opcion1.setForeground(new java.awt.Color(0, 0, 0));
        opcion1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/file_new_22051.png"))); // NOI18N
        opcion1.setText("Agregar");
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
        opcion2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/search.png"))); // NOI18N
        opcion2.setText("   C. x Vendedor");
        opcion2.setColorHover(new java.awt.Color(255, 255, 255));
        opcion2.setColorLine(new java.awt.Color(161, 54, 48));
        opcion2.setEfecto(rojeru_san.rsbutton.RSButtonSelectedIcon.EFECTO.RIPLE);
        opcion2.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        opcion2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        opcion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion2ActionPerformed(evt);
            }
        });

        opcion3.setBackground(new java.awt.Color(255, 255, 255));
        opcion3.setForeground(new java.awt.Color(0, 0, 0));
        opcion3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/search.png"))); // NOI18N
        opcion3.setText("          C. x Rango Fechas");
        opcion3.setColorHover(new java.awt.Color(255, 255, 255));
        opcion3.setColorLine(new java.awt.Color(161, 54, 48));
        opcion3.setEfecto(rojeru_san.rsbutton.RSButtonSelectedIcon.EFECTO.RIPLE);
        opcion3.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        opcion3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        opcion3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion3ActionPerformed(evt);
            }
        });

        opcion4.setBackground(new java.awt.Color(255, 255, 255));
        opcion4.setForeground(new java.awt.Color(0, 0, 0));
        opcion4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/search.png"))); // NOI18N
        opcion4.setText("          C. x Tipo Comunic.");
        opcion4.setColorHover(new java.awt.Color(255, 255, 255));
        opcion4.setColorLine(new java.awt.Color(161, 54, 48));
        opcion4.setEfecto(rojeru_san.rsbutton.RSButtonSelectedIcon.EFECTO.RIPLE);
        opcion4.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        opcion4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        opcion4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion4ActionPerformed(evt);
            }
        });

        opcion5.setBackground(new java.awt.Color(255, 255, 255));
        opcion5.setForeground(new java.awt.Color(0, 0, 0));
        opcion5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/search.png"))); // NOI18N
        opcion5.setText("          C. x Cliente            ");
        opcion5.setColorHover(new java.awt.Color(255, 255, 255));
        opcion5.setColorLine(new java.awt.Color(161, 54, 48));
        opcion5.setEfecto(rojeru_san.rsbutton.RSButtonSelectedIcon.EFECTO.RIPLE);
        opcion5.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        opcion5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        opcion5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(opcion4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(opcion1, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(opcion2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(opcion3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(opcion5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(opcion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(opcion2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(opcion3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(opcion4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(opcion5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
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

    private void opcion3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion3ActionPerformed
        opcion = 3;
        setOpcion();
    }//GEN-LAST:event_opcion3ActionPerformed

    private void opcion4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion4ActionPerformed
        opcion = 4;
        setOpcion();
    }//GEN-LAST:event_opcion4ActionPerformed

    private void opcion5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion5ActionPerformed
       opcion = 5;
        setOpcion();
    }//GEN-LAST:event_opcion5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static rojeru_san.rsbutton.RSButtonSelectedIcon opcion1;
    private static rojeru_san.rsbutton.RSButtonSelectedIcon opcion2;
    private static rojeru_san.rsbutton.RSButtonSelectedIcon opcion3;
    private static rojeru_san.rsbutton.RSButtonSelectedIcon opcion4;
    private static rojeru_san.rsbutton.RSButtonSelectedIcon opcion5;
    // End of variables declaration//GEN-END:variables

    public void setOpcion() {

        switch (opcion) {
            case 1:
                opcion1.setSelected(true);
                opcion2.setSelected(false);
                opcion3.setSelected(false);
                opcion4.setSelected(false);
                opcion5.setSelected(false);
                Main.scrollContenido.setViewportView(pAgregar);                
               
                break;
            case 2:
                opcion2.setSelected(true);
                opcion1.setSelected(false);   
                opcion3.setSelected(false);
                opcion4.setSelected(false);
                opcion5.setSelected(false);
                 Main.scrollContenido.setViewportView(pConsultar);  
                 break;
            case 3:
                opcion1.setSelected(false);
                opcion2.setSelected(false);
                opcion3.setSelected(true);
                opcion4.setSelected(false);
                opcion5.setSelected(false);
                 Main.scrollContenido.setViewportView(pConsFechas); 
                break;
            case 4:
                opcion1.setSelected(false);
                opcion2.setSelected(false);
                opcion3.setSelected(false);
                opcion4.setSelected(true);
                opcion5.setSelected(false);
                 Main.scrollContenido.setViewportView(pConsTipo); 
                break;
                
                case 5:
                opcion1.setSelected(false);
                opcion2.setSelected(false);
                opcion3.setSelected(false);
                opcion4.setSelected(false);
                opcion5.setSelected(true);
                 Main.scrollContenido.setViewportView(pConsCliente); 
                break;
            
                
        }
    }

}
