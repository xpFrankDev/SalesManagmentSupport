
package Panels;
import Clases.Cotizacion;
import Clases.Despacho;
import java.util.Timer;
import java.util.TimerTask;

public class panelViewEstadisticasVentas extends javax.swing.JPanel {

    
    public panelViewEstadisticasVentas() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelDato1 = new javax.swing.JPanel();
        dato1Header = new javax.swing.JPanel();
        headerText = new javax.swing.JLabel();
        info1 = new javax.swing.JLabel();
        panelDato2 = new javax.swing.JPanel();
        dato1Header1 = new javax.swing.JPanel();
        headerText1 = new javax.swing.JLabel();
        solicitudesTxt1 = new javax.swing.JLabel();
        panelDato4 = new javax.swing.JPanel();
        dato1Header3 = new javax.swing.JPanel();
        headerText3 = new javax.swing.JLabel();
        info2 = new javax.swing.JLabel();
        panelGrafico = new javax.swing.JScrollPane();

        setBackground(new java.awt.Color(255, 255, 255));

        panelDato1.setBackground(new java.awt.Color(255, 255, 255));
        panelDato1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        dato1Header.setBackground(new java.awt.Color(161, 54, 48));

        headerText.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        headerText.setForeground(new java.awt.Color(255, 255, 255));
        headerText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headerText.setText("Ventas - $ OCs Aprobadas");

        javax.swing.GroupLayout dato1HeaderLayout = new javax.swing.GroupLayout(dato1Header);
        dato1Header.setLayout(dato1HeaderLayout);
        dato1HeaderLayout.setHorizontalGroup(
            dato1HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerText, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
        );
        dato1HeaderLayout.setVerticalGroup(
            dato1HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        info1.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        info1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        info1.setText("@");

        javax.swing.GroupLayout panelDato1Layout = new javax.swing.GroupLayout(panelDato1);
        panelDato1.setLayout(panelDato1Layout);
        panelDato1Layout.setHorizontalGroup(
            panelDato1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dato1Header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelDato1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(info1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelDato1Layout.setVerticalGroup(
            panelDato1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDato1Layout.createSequentialGroup()
                .addComponent(dato1Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(info1, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelDato2.setBackground(new java.awt.Color(255, 255, 255));
        panelDato2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        dato1Header1.setBackground(new java.awt.Color(161, 54, 48));

        headerText1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        headerText1.setForeground(new java.awt.Color(255, 255, 255));
        headerText1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headerText1.setText("Meta Mensual de Ventas");

        javax.swing.GroupLayout dato1Header1Layout = new javax.swing.GroupLayout(dato1Header1);
        dato1Header1.setLayout(dato1Header1Layout);
        dato1Header1Layout.setHorizontalGroup(
            dato1Header1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerText1, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
        );
        dato1Header1Layout.setVerticalGroup(
            dato1Header1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerText1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        solicitudesTxt1.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        solicitudesTxt1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        solicitudesTxt1.setText("128000 $");

        javax.swing.GroupLayout panelDato2Layout = new javax.swing.GroupLayout(panelDato2);
        panelDato2.setLayout(panelDato2Layout);
        panelDato2Layout.setHorizontalGroup(
            panelDato2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dato1Header1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelDato2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(solicitudesTxt1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelDato2Layout.setVerticalGroup(
            panelDato2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDato2Layout.createSequentialGroup()
                .addComponent(dato1Header1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(solicitudesTxt1, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelDato4.setBackground(new java.awt.Color(255, 255, 255));
        panelDato4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        dato1Header3.setBackground(new java.awt.Color(161, 54, 48));

        headerText3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        headerText3.setForeground(new java.awt.Color(255, 255, 255));
        headerText3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headerText3.setText("Ventas - Total Despachado");

        javax.swing.GroupLayout dato1Header3Layout = new javax.swing.GroupLayout(dato1Header3);
        dato1Header3.setLayout(dato1Header3Layout);
        dato1Header3Layout.setHorizontalGroup(
            dato1Header3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerText3, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
        );
        dato1Header3Layout.setVerticalGroup(
            dato1Header3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerText3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        info2.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        info2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        info2.setText("@");

        javax.swing.GroupLayout panelDato4Layout = new javax.swing.GroupLayout(panelDato4);
        panelDato4.setLayout(panelDato4Layout);
        panelDato4Layout.setHorizontalGroup(
            panelDato4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dato1Header3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelDato4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(info2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelDato4Layout.setVerticalGroup(
            panelDato4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDato4Layout.createSequentialGroup()
                .addComponent(dato1Header3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(info2, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelGrafico.setBorder(null);
        panelGrafico.setOpaque(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(panelDato2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(21, 21, 21)
                        .addComponent(panelDato1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(21, 21, 21)
                        .addComponent(panelDato4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(panelGrafico)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelDato2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelDato1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelDato4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(panelGrafico, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
                .addGap(11, 11, 11))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel dato1Header;
    private javax.swing.JPanel dato1Header1;
    private javax.swing.JPanel dato1Header3;
    private javax.swing.JLabel headerText;
    private javax.swing.JLabel headerText1;
    private javax.swing.JLabel headerText3;
    private javax.swing.JLabel info1;
    private javax.swing.JLabel info2;
    private javax.swing.JPanel panelDato1;
    private javax.swing.JPanel panelDato2;
    private javax.swing.JPanel panelDato4;
    private javax.swing.JScrollPane panelGrafico;
    private javax.swing.JLabel solicitudesTxt1;
    // End of variables declaration//GEN-END:variables


    public void actualizarGrafico1(){
        
        panelGrafico.setViewportView(new Cotizacion().getGraficoVentasMesActual());
        setVentas();
        //autoActualizarDatos();
    }
    public void setVentas(){
        
        Double ventasMES = new Cotizacion().getVentasAprobadaMesActual();
        Double ventasMESDespachadas = new Despacho().getMontoDespachadoMESActual();
        
        info1.setText(ventasMES+"");
        info2.setText(ventasMESDespachadas+"");
        
        //autoActualizarDatos();
    }
    private void autoActualizarDatos(){
      

        TimerTask timerTask = new TimerTask() {
            public void run() {
                setVentas();
                actualizarGrafico1();
            }
        };
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(timerTask, 60000, 60000);
    
   }

}
