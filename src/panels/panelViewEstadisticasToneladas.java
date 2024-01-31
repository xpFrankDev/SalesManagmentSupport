
package Panels;

import Clases.Cotizacion;
import VentanasRST.mostrarGraficoToneladas;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.table.DefaultTableModel;




public class panelViewEstadisticasToneladas extends javax.swing.JPanel {

   String [][]resultados = new String[12][3];
    public panelViewEstadisticasToneladas() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        materialShadowCircle1 = new elevacion.MaterialShadowCircle();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaResultados = new rojerusan.RSTableMetro();
        añoTxt = new javax.swing.JLabel();
        rSButtonRippleShade1 = new RSComponentShade.RSButtonRippleShade();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Registro de Toneladas Vendidas y Ventas Despachadas");

        tablaResultados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mes", "$ OT", "$ Despachado", "Toneladas"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaResultados.setBackgoundHead(new java.awt.Color(161, 54, 48));
        tablaResultados.setBackgoundHover(new java.awt.Color(161, 54, 48));
        tablaResultados.setColorPrimaryText(new java.awt.Color(0, 0, 0));
        tablaResultados.setColorSecondary(new java.awt.Color(255, 255, 255));
        tablaResultados.setColorSecundaryText(new java.awt.Color(0, 0, 0));
        tablaResultados.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tablaResultados.setFontHead(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        tablaResultados.setFontRowHover(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tablaResultados.setSelectionBackground(new java.awt.Color(161, 54, 48));
        tablaResultados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaResultadosMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tablaResultados);
        if (tablaResultados.getColumnModel().getColumnCount() > 0) {
            tablaResultados.getColumnModel().getColumn(0).setMinWidth(170);
            tablaResultados.getColumnModel().getColumn(0).setPreferredWidth(170);
            tablaResultados.getColumnModel().getColumn(0).setMaxWidth(170);
        }

        añoTxt.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        añoTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        añoTxt.setText("@");

        rSButtonRippleShade1.setBackground(new java.awt.Color(192, 121, 117));
        rSButtonRippleShade1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/grafica.png"))); // NOI18N
        rSButtonRippleShade1.setText("Visualizar Gráfico");
        rSButtonRippleShade1.setBgHover(new java.awt.Color(161, 54, 48));
        rSButtonRippleShade1.setBgShadeHover(new java.awt.Color(0, 0, 0));
        rSButtonRippleShade1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonRippleShade1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jScrollPane3)
                .addGap(37, 37, 37))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 730, Short.MAX_VALUE)
                    .addComponent(añoTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rSButtonRippleShade1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(añoTxt)
                .addGap(19, 19, 19)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
                .addGap(95, 95, 95)
                .addComponent(rSButtonRippleShade1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tablaResultadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaResultadosMouseClicked
       
    }//GEN-LAST:event_tablaResultadosMouseClicked

    private void rSButtonRippleShade1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonRippleShade1ActionPerformed
      new mostrarGraficoToneladas(resultados).setVisible(true);
    }//GEN-LAST:event_rSButtonRippleShade1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel añoTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane3;
    private elevacion.MaterialShadowCircle materialShadowCircle1;
    private RSComponentShade.RSButtonRippleShade rSButtonRippleShade1;
    private rojerusan.RSTableMetro tablaResultados;
    // End of variables declaration//GEN-END:variables


    
    int año =0;
    public void setDatos(){
      
        año = Integer.parseInt(new SimpleDateFormat("yyyy").format(new Date()));
        añoTxt.setText(año+"");
        
      resultados = new Cotizacion().getToneladasAnual();
      DefaultTableModel modelo = (DefaultTableModel)tablaResultados.getModel();
      modelo.setRowCount(0);
      for (String datos[] : resultados){
          Double toneladas = Double.parseDouble(datos[3])/1000;
          toneladas = Double.parseDouble(new DecimalFormat("#.000").format(toneladas));          
          modelo.addRow(new Object[]{
          datos[0],datos[1],datos[2],toneladas,
          });
      }
     //autoActualizarDatos();
    }

    private void autoActualizarDatos(){
      

        TimerTask timerTask = new TimerTask() {
            public void run() {
                setDatos();
            }
        };
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(timerTask, 60000, 60000);
    
   }
}
