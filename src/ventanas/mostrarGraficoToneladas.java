/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VentanasRST;

import java.awt.Color;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author soporte
 */
public class mostrarGraficoToneladas extends javax.swing.JFrame {

    String[][] resultados = new String[12][4];
    DefaultCategoryDataset dataset = new DefaultCategoryDataset();
    int año;
    int opcion = 3;

    public mostrarGraficoToneladas() {
        initComponents();
    }

    public mostrarGraficoToneladas(String resultados[][]) {
        initComponents();
        año = Integer.parseInt(new SimpleDateFormat("yyyy").format(new Date()));
        this.resultados = resultados;
        setOpcion();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCentral = new javax.swing.JPanel();
        scroll = new javax.swing.JScrollPane();
        rSButtonIconShadow1 = new RSMaterialComponent.RSButtonIconShadow();
        opcion1 = new rojeru_san.rsbutton.RSButtonSelectedIcon();
        opcion2 = new rojeru_san.rsbutton.RSButtonSelectedIcon();
        opcion3 = new rojeru_san.rsbutton.RSButtonSelectedIcon();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ver Gráfico - SDGS");
        setUndecorated(true);
        setResizable(false);

        panelCentral.setBackground(new java.awt.Color(255, 255, 255));
        panelCentral.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        scroll.setBorder(null);

        rSButtonIconShadow1.setBackground(new java.awt.Color(192, 121, 117));
        rSButtonIconShadow1.setBackgroundHover(new java.awt.Color(161, 54, 48));
        rSButtonIconShadow1.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.ARROW_BACK);
        rSButtonIconShadow1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonIconShadow1ActionPerformed(evt);
            }
        });

        opcion1.setBackground(new java.awt.Color(255, 255, 255));
        opcion1.setForeground(new java.awt.Color(0, 0, 0));
        opcion1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/weight_83953.png"))); // NOI18N
        opcion1.setText("Toneladas");
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
        opcion2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/dolar_121855.png"))); // NOI18N
        opcion2.setText("Despachados");
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
        opcion3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/dolar_121855.png"))); // NOI18N
        opcion3.setText("OT");
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

        javax.swing.GroupLayout panelCentralLayout = new javax.swing.GroupLayout(panelCentral);
        panelCentral.setLayout(panelCentralLayout);
        panelCentralLayout.setHorizontalGroup(
            panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCentralLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rSButtonIconShadow1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(opcion3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(opcion2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addComponent(opcion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(192, 192, 192))
            .addGroup(panelCentralLayout.createSequentialGroup()
                .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 1160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelCentralLayout.setVerticalGroup(
            panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCentralLayout.createSequentialGroup()
                .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCentralLayout.createSequentialGroup()
                        .addContainerGap(16, Short.MAX_VALUE)
                        .addComponent(rSButtonIconShadow1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(panelCentralLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(opcion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(opcion2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(opcion3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCentral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCentral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void rSButtonIconShadow1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonIconShadow1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_rSButtonIconShadow1ActionPerformed

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
            java.util.logging.Logger.getLogger(mostrarGraficoToneladas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mostrarGraficoToneladas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mostrarGraficoToneladas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mostrarGraficoToneladas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mostrarGraficoToneladas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static rojeru_san.rsbutton.RSButtonSelectedIcon opcion1;
    private static rojeru_san.rsbutton.RSButtonSelectedIcon opcion2;
    private static rojeru_san.rsbutton.RSButtonSelectedIcon opcion3;
    private javax.swing.JPanel panelCentral;
    private RSMaterialComponent.RSButtonIconShadow rSButtonIconShadow1;
    private javax.swing.JScrollPane scroll;
    // End of variables declaration//GEN-END:variables

    private void setOpcion() {
        
        JFreeChart chart;
        ChartPanel chartPanel;
        CategoryPlot p;
        switch (opcion) {
            case 1:
                dataset = new DefaultCategoryDataset();
                for (String datos[] : resultados) {
                    Double toneladas = Double.parseDouble(datos[3]) / 1000;
                    dataset.setValue(toneladas, "Toneladas", datos[0]);
                }
                chart = ChartFactory.createBarChart3D("Resumen del Año " + año,
                        "Mes",
                        "Toneladas",
                        dataset, PlotOrientation.VERTICAL, true, true, false);

                chart.setBackgroundPaint(Color.white);
                chart.getTitle().setFont(new Font("Segoe UI", Font.BOLD, 20));
                chart.getTitle().setPaint(Color.BLACK);

                p = chart.getCategoryPlot();
                p.setRangeGridlinePaint(Color.yellow);

                chartPanel = new ChartPanel(chart);
                chartPanel.repaint();
                scroll.setViewportView(chartPanel);
                opcion1.setSelected(true);
                opcion2.setSelected(false);
                opcion3.setSelected(false);
                break;

            case 2:
                dataset = new DefaultCategoryDataset();
                opcion1.setSelected(false);
                opcion2.setSelected(true);
                opcion3.setSelected(false);
                for (String datos[] : resultados) {
                    Double vendido = Double.parseDouble(datos[2]);
                    dataset.setValue(vendido, "$ Despachado", datos[0]);
                }
                chart = ChartFactory.createBarChart3D("Resumen del Año " + año,
                        "Mes",
                        "Monto en Dolares $",
                        dataset, PlotOrientation.VERTICAL, true, true, false);

                chart.setBackgroundPaint(Color.white);
                chart.getTitle().setFont(new Font("Segoe UI", Font.BOLD, 20));
                chart.getTitle().setPaint(Color.BLACK);

                p = chart.getCategoryPlot();
                p.setRangeGridlinePaint(Color.yellow);

                chartPanel = new ChartPanel(chart);
                chartPanel.repaint();
                scroll.setViewportView(chartPanel);

                break;
            case 3:
                dataset = new DefaultCategoryDataset();
                opcion1.setSelected(false);
                opcion2.setSelected(false);
                opcion3.setSelected(true);
                for (String datos[] : resultados) {
                    Double vendido = Double.parseDouble(datos[1]);
                    dataset.setValue(vendido, "$ OT", datos[0]);
                }
                chart = ChartFactory.createBarChart3D("Resumen del Año " + año,
                        "Mes",
                        "Monto en Dolares $",
                        dataset, PlotOrientation.VERTICAL, true, true, false);

                chart.setBackgroundPaint(Color.white);
                chart.getTitle().setFont(new Font("Segoe UI", Font.BOLD, 20));
                chart.getTitle().setPaint(Color.BLACK);

                p = chart.getCategoryPlot();
                p.setRangeGridlinePaint(Color.yellow);

                chartPanel = new ChartPanel(chart);
                chartPanel.repaint();
                scroll.setViewportView(chartPanel);

                break;
        }

    }
}
