
package Panels;

import VentanasRST.Main;

/**
 * @author soporte
 */
public class panelDocumentos extends javax.swing.JPanel {

    public static int opcion = 1;
    static panelViewSolicitudes pvS  = new panelViewSolicitudes();
    static panelViewCotizacion pvC = new panelViewCotizacion();
    static panelViewPresupuesto pvP = new panelViewPresupuesto();
    static panelCierreyDespacho pcD = new panelCierreyDespacho();

    public panelDocumentos() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        opcion1 = new rojeru_san.rsbutton.RSButtonSelectedIcon();
        opcion2 = new rojeru_san.rsbutton.RSButtonSelectedIcon();
        opcion3 = new rojeru_san.rsbutton.RSButtonSelectedIcon();
        opcion4 = new rojeru_san.rsbutton.RSButtonSelectedIcon();

        setBackground(new java.awt.Color(255, 255, 255));

        opcion1.setBackground(new java.awt.Color(255, 255, 255));
        opcion1.setForeground(new java.awt.Color(0, 0, 0));
        opcion1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Doc_file_2_1_icon-icons.com_75810.png"))); // NOI18N
        opcion1.setText("Solicitudes");
        opcion1.setColorHover(new java.awt.Color(255, 255, 255));
        opcion1.setColorLine(new java.awt.Color(161, 54, 48));
        opcion1.setEfecto(rojeru_san.rsbutton.RSButtonSelectedIcon.EFECTO.RIPLE);
        opcion1.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        opcion1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        opcion1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        opcion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion1ActionPerformed(evt);
            }
        });

        opcion2.setBackground(new java.awt.Color(255, 255, 255));
        opcion2.setForeground(new java.awt.Color(0, 0, 0));
        opcion2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Doc_file_2_1_icon-icons.com_75810.png"))); // NOI18N
        opcion2.setText("Presupuestos");
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
        opcion3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Doc_file_2_1_icon-icons.com_75810.png"))); // NOI18N
        opcion3.setText("Cotización");
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
        opcion4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Doc_file_2_1_icon-icons.com_75810.png"))); // NOI18N
        opcion4.setText("          Cierre y Despacho ");
        opcion4.setColorHover(new java.awt.Color(255, 255, 255));
        opcion4.setColorLine(new java.awt.Color(161, 54, 48));
        opcion4.setEfecto(rojeru_san.rsbutton.RSButtonSelectedIcon.EFECTO.RIPLE);
        opcion4.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        opcion4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        opcion4.setIconTextGap(0);
        opcion4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(opcion3, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                    .addComponent(opcion4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(opcion1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(opcion2, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(opcion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(opcion2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(opcion3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(opcion4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(90, Short.MAX_VALUE))
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static rojeru_san.rsbutton.RSButtonSelectedIcon opcion1;
    private static rojeru_san.rsbutton.RSButtonSelectedIcon opcion2;
    private static rojeru_san.rsbutton.RSButtonSelectedIcon opcion3;
    private static rojeru_san.rsbutton.RSButtonSelectedIcon opcion4;
    // End of variables declaration//GEN-END:variables

    public static void setOpcion() {

        switch (opcion) {
            case 1:
                opcion1.setSelected(true);
                opcion2.setSelected(false);
                opcion3.setSelected(false);
                opcion4.setSelected(false);
                pvS.actualizarDatos();
                Main.scrollContenido.setViewportView(pvS);
                break;
            case 2:
                opcion2.setSelected(true);

                opcion1.setSelected(false);
                opcion3.setSelected(false);
                opcion4.setSelected(false);
                pvP.actualizarDatos();
                Main.scrollContenido.setViewportView(pvP);
                break;

            case 3:
                opcion3.setSelected(true);

                opcion1.setSelected(false);
                opcion2.setSelected(false);
                opcion4.setSelected(false);
                Main.scrollContenido.setViewportView(pvC);
                pvC.verDatos();
                break;
            case 4:
                opcion4.setSelected(true);

                opcion1.setSelected(false);
                opcion3.setSelected(false);
                opcion2.setSelected(false);
                Main.scrollContenido.setViewportView(pcD);
                pcD.actualizarDatos();
                break;
        }
    }

}
