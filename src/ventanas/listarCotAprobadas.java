/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VentanasRST;

import Clases.Cotizacion;
import Clases.PlaceHolder;
import java.awt.Image;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.ScrollPaneConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author soporte
 */
public class listarCotAprobadas extends javax.swing.JFrame {

    ArrayList<Cotizacion> lista;
    Cotizacion c = new Cotizacion();
    confirmarPlano cp;
    public listarCotAprobadas() {
        initComponents();
        changeIcon();
        llenarTabla();
        new PlaceHolder("Esperando seleccione una Cotización para mostrar mi valor",txtDescripcion);
    }
    public listarCotAprobadas(confirmarPlano cp) {
        initComponents();
        changeIcon();
        llenarTabla();
        new PlaceHolder("Esperando seleccione una Cotización para mostrar mi valor",txtDescripcion);
        this.cp = cp;
    }

     public void changeIcon() {
        Image icon = new ImageIcon(getClass().getResource("/imgs/logo_rossetti.jpg")).getImage();
        setIconImage(icon);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCentral = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new rojerusan.RSTableMetro();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        jLabel19 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Listar Cotizaciones esperando por Confirmación de Plano . SGDS");
        setUndecorated(true);

        panelCentral.setBackground(new java.awt.Color(255, 255, 255));
        panelCentral.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "# Cot", "OT", "Cliente", "Fecha"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla.setBackgoundHead(new java.awt.Color(161, 54, 48));
        tabla.setBackgoundHover(new java.awt.Color(161, 54, 48));
        tabla.setColorPrimaryText(new java.awt.Color(161, 54, 48));
        tabla.setColorSecundaryText(new java.awt.Color(161, 54, 48));
        tabla.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tabla.setFontHead(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        tabla.setFontRowHover(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tabla.setGridColor(new java.awt.Color(255, 255, 255));
        tabla.setSelectionBackground(new java.awt.Color(161, 54, 48));
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);
        if (tabla.getColumnModel().getColumnCount() > 0) {
            tabla.getColumnModel().getColumn(0).setMinWidth(70);
            tabla.getColumnModel().getColumn(0).setPreferredWidth(70);
            tabla.getColumnModel().getColumn(0).setMaxWidth(70);
            tabla.getColumnModel().getColumn(1).setMinWidth(115);
            tabla.getColumnModel().getColumn(1).setPreferredWidth(115);
            tabla.getColumnModel().getColumn(1).setMaxWidth(115);
            tabla.getColumnModel().getColumn(2).setMinWidth(60);
            tabla.getColumnModel().getColumn(2).setPreferredWidth(110);
            tabla.getColumnModel().getColumn(2).setMaxWidth(110);
            tabla.getColumnModel().getColumn(4).setMinWidth(100);
            tabla.getColumnModel().getColumn(4).setPreferredWidth(100);
            tabla.getColumnModel().getColumn(4).setMaxWidth(100);
        }

        jLabel18.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(153, 153, 153));
        jLabel18.setText("Presione 2 Veces Click para seleccionarlo");

        txtDescripcion.setColumns(20);
        txtDescripcion.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        txtDescripcion.setRows(5);
        txtDescripcion.setEnabled(false);
        jScrollPane2.setViewportView(txtDescripcion);

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel19.setText("Descripción:");

        javax.swing.GroupLayout panelCentralLayout = new javax.swing.GroupLayout(panelCentral);
        panelCentral.setLayout(panelCentralLayout);
        panelCentralLayout.setHorizontalGroup(
            panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCentralLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelCentralLayout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addGap(312, 312, 312))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCentralLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel19)))
                .addContainerGap())
        );
        panelCentralLayout.setVerticalGroup(
            panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCentralLayout.createSequentialGroup()
                .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCentralLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCentralLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
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

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        if (evt.getClickCount() == 1
            && tabla.getSelectedRow() >= 0
            && !tabla.getValueAt(tabla.getSelectedRow(), 2).toString().equals("No hay Cots. por confirmar Plano")) {

            int idCot = Integer.parseInt(tabla.getValueAt(tabla.getSelectedRow(), 0).toString());
            
            c.buscarID(idCot);
            txtDescripcion.setText(c.getObs());            
            
        } else if (evt.getClickCount() == 2 && !tabla.getValueAt(tabla.getSelectedRow(), 2).toString().equals("No hay Cots. por confirmar Plano")) {
            extraerDatosCotizacion();
        }

    }//GEN-LAST:event_tablaMouseClicked

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
            java.util.logging.Logger.getLogger(listarCotAprobadas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(listarCotAprobadas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(listarCotAprobadas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(listarCotAprobadas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                 try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(newPresupuesto.class.getName()).log(Level.SEVERE, null, ex);
                }
                new listarCotAprobadas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel panelCentral;
    private rojerusan.RSTableMetro tabla;
    private javax.swing.JTextArea txtDescripcion;
    // End of variables declaration//GEN-END:variables

    public void llenarTabla() {
        lista= new ArrayList();
        lista = (ArrayList)new Cotizacion().listarEstado("Cot. Aprobada - Esperando Plano").clone();
        
        DefaultTableModel modelo = (DefaultTableModel)tabla.getModel();
        vaciarTabla();
        for(int i=0; i<lista.size();i++){
            
            modelo.addRow(new Object[] {
            lista.get(i).getID(),
                 lista.get(i).getNumeroCot(),
                 lista.get(i).getNumOt(),
                  lista.get(i).getCliente(),
                   lista.get(i).getFecha()
            });
            
        }
        
        if(modelo.getRowCount() == 0){
             modelo.addRow(new Object[] {
            "","","No hay Cots. por confirmar Plano",""
            });
        }
    }
    private void vaciarTabla(){
       DefaultTableModel modelo = (DefaultTableModel)tabla.getModel();
       modelo.setRowCount(0);
    }

    private void extraerDatosCotizacion() {
       int idCot = Integer.parseInt(tabla.getValueAt(tabla.getSelectedRow(), 0).toString());
        
       c = new Cotizacion().buscarID(idCot);
        
       cp.idCotizacion.setText(idCot+"");        
       cp.setExtendedState(NORMAL);        
       cp.setCotizacion(c);
       cp.mostrar();
        this.dispose();
    }
}
