/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VentanasRST;

import Clases.Cotizacion;
import Panels.panelBuscarComunicacionesCliente;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author soporte
 */
public class listarCotDespacho extends javax.swing.JFrame {

    newDespacho nd;
    Cotizacion c;
    int escape = 0;
    String cliente;
    panelBuscarComunicacionesCliente pC;

    public listarCotDespacho() {
        initComponents();
        changeIcon();

    }

    public listarCotDespacho(panelBuscarComunicacionesCliente pC, String cliente) {
        initComponents();
        changeIcon();
        llenarTabla();
        escape = 2;
        setLocation(10, 10);
        titulo.setText("Listado de Cotizaciones");
        this.pC = pC;
        this.cliente = cliente;
    }

    public listarCotDespacho(newDespacho nd) {
        initComponents();
        changeIcon();
        this.nd = nd;
        setLocation(10, 10);
        llenarTabla();
        escape = 1;
    }

    public void changeIcon() {
        Image icon = new ImageIcon(getClass().getResource("/imgs/logo_rossetti.jpg")).getImage();
        setIconImage(icon);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCentral = new javax.swing.JPanel();
        panelHeader = new rojeru_san.rspanel.RSPanelGradiente();
        titulo = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        numeroTxt = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        responsabletxt = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        montoTxt = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaArchivo = new rojerusan.RSTableMetro();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        estadotxt = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Lista Cots. x Generar Despacho");
        setUndecorated(true);
        setResizable(false);

        panelCentral.setBackground(new java.awt.Color(255, 255, 255));
        panelCentral.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        panelHeader.setColorPrimario(new java.awt.Color(161, 54, 48));
        panelHeader.setColorSecundario(new java.awt.Color(153, 153, 153));

        titulo.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText("Listar Cotizaciones por Despachar");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/windowclose_104378.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/logo_rossetti 48x48.jpg"))); // NOI18N

        javax.swing.GroupLayout panelHeaderLayout = new javax.swing.GroupLayout(panelHeader);
        panelHeader.setLayout(panelHeaderLayout);
        panelHeaderLayout.setHorizontalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHeaderLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(105, 105, 105)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelHeaderLayout.setVerticalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelHeaderLayout.createSequentialGroup()
                .addGroup(panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        numeroTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        numeroTxt.setText("@Número");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Número Cot.:");

        responsabletxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        responsabletxt.setText("@responsable");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Responsable:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Monto:");

        montoTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        montoTxt.setText("@monto");

        tablaArchivo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "OT", "Cliente", "Fecha"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaArchivo.setBackgoundHead(new java.awt.Color(161, 54, 48));
        tablaArchivo.setBackgoundHover(new java.awt.Color(161, 54, 48));
        tablaArchivo.setColorPrimaryText(new java.awt.Color(161, 54, 48));
        tablaArchivo.setColorSecundaryText(new java.awt.Color(161, 54, 48));
        tablaArchivo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tablaArchivo.setFontHead(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        tablaArchivo.setFontRowHover(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tablaArchivo.setSelectionBackground(new java.awt.Color(161, 54, 48));
        tablaArchivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaArchivoMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tablaArchivo);
        if (tablaArchivo.getColumnModel().getColumnCount() > 0) {
            tablaArchivo.getColumnModel().getColumn(0).setMinWidth(85);
            tablaArchivo.getColumnModel().getColumn(0).setPreferredWidth(85);
            tablaArchivo.getColumnModel().getColumn(0).setMaxWidth(85);
            tablaArchivo.getColumnModel().getColumn(1).setMinWidth(60);
            tablaArchivo.getColumnModel().getColumn(1).setPreferredWidth(110);
            tablaArchivo.getColumnModel().getColumn(1).setMaxWidth(110);
            tablaArchivo.getColumnModel().getColumn(3).setMinWidth(120);
            tablaArchivo.getColumnModel().getColumn(3).setPreferredWidth(120);
            tablaArchivo.getColumnModel().getColumn(3).setMaxWidth(120);
        }

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("<-- Datos -->");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Estado:");

        estadotxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        estadotxt.setText("@Estado");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Ingrese un valor para buscar la Cotización:");

        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout panelCentralLayout = new javax.swing.GroupLayout(panelCentral);
        panelCentral.setLayout(panelCentralLayout);
        panelCentralLayout.setHorizontalGroup(
            panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelCentralLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCentralLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelCentralLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(estadotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelCentralLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(responsabletxt, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelCentralLayout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(montoTxt))
                            .addGroup(panelCentralLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(numeroTxt)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCentralLayout.createSequentialGroup()
                        .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(panelCentralLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        panelCentralLayout.setVerticalGroup(
            panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCentralLayout.createSequentialGroup()
                .addComponent(panelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(estadotxt)
                    .addComponent(jLabel5)
                    .addComponent(numeroTxt))
                .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCentralLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(montoTxt)))
                    .addGroup(panelCentralLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(responsabletxt))))
                .addGap(61, 61, 61))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCentral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCentral, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tablaArchivoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaArchivoMouseClicked
        if (validarSeleccion()) {
            if (evt.getClickCount() == 1) {
                int idCot = Integer.valueOf(tablaArchivo.getValueAt(tablaArchivo.getSelectedRow(), 0).toString());
                c = new Cotizacion().buscarID(idCot);
                mostrarDatos();
            }
            if (evt.getClickCount() == 2) {

                if (escape == 1) {
                    int idCot = Integer.valueOf(tablaArchivo.getValueAt(tablaArchivo.getSelectedRow(), 0).toString());
                    c = new Cotizacion().buscarID(idCot);
                    nd.setCotizacion(c);
                    nd.setExtendedState(NORMAL);

                }
                if (escape == 2) {
                    int idCot = Integer.valueOf(tablaArchivo.getValueAt(tablaArchivo.getSelectedRow(), 0).toString());
                    c = new Cotizacion().buscarID(idCot);
                    panelBuscarComunicacionesCliente.setCotizacion(c);
                }

                this.dispose();

            }
        }
    }//GEN-LAST:event_tablaArchivoMouseClicked

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        if (jTextField1.getText().length() < 1) {
            llenarTabla();
        } else {
            llenarTabla(jTextField1.getText());
        }
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(listarCotDespacho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(listarCotDespacho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(listarCotDespacho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(listarCotDespacho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new listarCotDespacho().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel estadotxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel montoTxt;
    private javax.swing.JLabel numeroTxt;
    private javax.swing.JPanel panelCentral;
    private rojeru_san.rspanel.RSPanelGradiente panelHeader;
    private javax.swing.JLabel responsabletxt;
    private rojerusan.RSTableMetro tablaArchivo;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables

    private void llenarTabla() {
        vaciarTabla();
        if (escape == 2) {
            ArrayList<Cotizacion> lista;

            if (cliente.equals("ninguno")) {
                lista = (ArrayList<Cotizacion>) new Cotizacion().listarGeneral();
            } else {
                lista = (ArrayList<Cotizacion>) new Cotizacion().listarxNombre(cliente);
            }

            DefaultTableModel modelo = (DefaultTableModel) tablaArchivo.getModel();
            for (Cotizacion c : lista) {
                modelo.addRow(new Object[]{
                    c.getID(),c.getNumOt(), c.getCliente(), c.getFecha()
                });
            }
            if (modelo.getRowCount() == 0) {
                modelo.addRow(new Object[]{
                    "", "No hay Cots.", ""
                });
                limpiarCampos();
            }
        } else {
            ArrayList<Cotizacion> lista = (ArrayList<Cotizacion>) new Cotizacion().listarxEsperandoDespacho();
            DefaultTableModel modelo = (DefaultTableModel) tablaArchivo.getModel();
            for (Cotizacion c : lista) {
                modelo.addRow(new Object[]{
                    c.getID(),c.getNumOt(), c.getCliente(), c.getFecha()
                });

            }
            if (modelo.getRowCount() == 0) {
                modelo.addRow(new Object[]{
                    "", "No hay Cots.", ""
                });
                limpiarCampos();
            }
        }

    }

    private void llenarTabla(String estado) {
        vaciarTabla();
        DefaultTableModel modelo = (DefaultTableModel) tablaArchivo.getModel();
        if (escape == 1) {
            ArrayList<Cotizacion> lista = (ArrayList<Cotizacion>) new Cotizacion().listarxEsperandoDespachoconDato(estado).clone();

            for (Cotizacion c : lista) {
                modelo.addRow(new Object[]{
                    c.getID(), c.getNumOt(), c.getPresupuesto().getCliente(), c.getFecha()
                });

            }
        } else {
            ArrayList<Cotizacion> lista;
            lista = (ArrayList<Cotizacion>) new Cotizacion().listarxNombre(estado);

            for (Cotizacion c : lista) {
                modelo.addRow(new Object[]{
                    c.getID(), c.getNumOt(), c.getPresupuesto().getCliente(), c.getFecha()
                });
            }
        }
            if (modelo.getRowCount() == 0) {
                modelo.addRow(new Object[]{
                    "", "", "No hay Cots. con: " + estado, ""
                });
                limpiarCampos();
            }
        

    }

    private boolean validarSeleccion() {
        boolean llave = false;

        if (tablaArchivo.getSelectedRow() < 0) {

        } else {
            if ((tablaArchivo.getValueAt(tablaArchivo.getSelectedRow(), 2).toString()).contains("No hay Cots. con")) {
                JOptionPane.showMessageDialog(rootPane, "Seleccione una OT valida para despachar");
            } else {

                llave = true;
            }
        }

        return llave;
    }

    private void limpiarCampos() {
        estadotxt.setText("@Estado");
        responsabletxt.setText("@Responsable");
        numeroTxt.setText("@Número");
        montoTxt.setText("@monto");
    }

    private void mostrarDatos() {
        estadotxt.setText(c.getEstado());
        responsabletxt.setText(c.getResponsable());
        numeroTxt.setText(c.getNumeroCot());
        montoTxt.setText(c.getMonto() + "");
    }
    
    private void vaciarTabla(){
         DefaultTableModel modelo = (DefaultTableModel) tablaArchivo.getModel();
         modelo.setRowCount(0);
    }

}
