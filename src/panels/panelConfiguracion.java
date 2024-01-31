
package Panels;

import VentanasRST.Main;


public class panelConfiguracion extends javax.swing.JPanel {

    panelConfClientes pCliente = new panelConfClientes();
    
    
    public int opcion = 1;
    public panelConfiguracion() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu1 = new rojeru_san.rsbutton.RSButtonSelectedIcon();
        menu2 = new rojeru_san.rsbutton.RSButtonSelectedIcon();
        menu3 = new rojeru_san.rsbutton.RSButtonSelectedIcon();
        menu4 = new rojeru_san.rsbutton.RSButtonSelectedIcon();

        setBackground(new java.awt.Color(255, 255, 255));

        menu1.setBackground(new java.awt.Color(255, 255, 255));
        menu1.setForeground(new java.awt.Color(0, 0, 0));
        menu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/menu_editconfig_men_9554.png"))); // NOI18N
        menu1.setText("Clientes");
        menu1.setColorHover(new java.awt.Color(255, 255, 255));
        menu1.setColorLine(new java.awt.Color(161, 54, 48));
        menu1.setEfecto(rojeru_san.rsbutton.RSButtonSelectedIcon.EFECTO.RIPLE);
        menu1.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        menu1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menu1.setSelected(true);
        menu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu1ActionPerformed(evt);
            }
        });

        menu2.setBackground(new java.awt.Color(255, 255, 255));
        menu2.setForeground(new java.awt.Color(0, 0, 0));
        menu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/menu_editconfig_men_9554.png"))); // NOI18N
        menu2.setText("Choferes");
        menu2.setColorHover(new java.awt.Color(255, 255, 255));
        menu2.setColorLine(new java.awt.Color(161, 54, 48));
        menu2.setEfecto(rojeru_san.rsbutton.RSButtonSelectedIcon.EFECTO.RIPLE);
        menu2.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        menu2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu2ActionPerformed(evt);
            }
        });

        menu3.setBackground(new java.awt.Color(255, 255, 255));
        menu3.setForeground(new java.awt.Color(0, 0, 0));
        menu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/menu_editconfig_men_9554.png"))); // NOI18N
        menu3.setText("Vehiculos");
        menu3.setColorHover(new java.awt.Color(255, 255, 255));
        menu3.setColorLine(new java.awt.Color(161, 54, 48));
        menu3.setEfecto(rojeru_san.rsbutton.RSButtonSelectedIcon.EFECTO.RIPLE);
        menu3.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        menu3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu3ActionPerformed(evt);
            }
        });

        menu4.setBackground(new java.awt.Color(255, 255, 255));
        menu4.setForeground(new java.awt.Color(0, 0, 0));
        menu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/menu_editconfig_men_9554.png"))); // NOI18N
        menu4.setText("     Formas de Pago");
        menu4.setColorHover(new java.awt.Color(255, 255, 255));
        menu4.setColorLine(new java.awt.Color(161, 54, 48));
        menu4.setEfecto(rojeru_san.rsbutton.RSButtonSelectedIcon.EFECTO.RIPLE);
        menu4.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        menu4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(menu1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menu2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menu3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menu4, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menu1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menu2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menu3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(menu4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(106, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void menu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu1ActionPerformed
       opcion = 1;
       setOpcion();
    }//GEN-LAST:event_menu1ActionPerformed

    private void menu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menu2ActionPerformed

    private void menu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menu3ActionPerformed

    private void menu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menu4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static rojeru_san.rsbutton.RSButtonSelectedIcon menu1;
    public static rojeru_san.rsbutton.RSButtonSelectedIcon menu2;
    public static rojeru_san.rsbutton.RSButtonSelectedIcon menu3;
    public static rojeru_san.rsbutton.RSButtonSelectedIcon menu4;
    // End of variables declaration//GEN-END:variables

public void setOpcion(){
    
    switch(opcion){
        case 1:
            Main.scrollContenido.setViewportView(pCliente);
            menu2.setSelected(false);
            menu3.setSelected(false);
            menu4.setSelected(false);
            break;
    }
}

}
