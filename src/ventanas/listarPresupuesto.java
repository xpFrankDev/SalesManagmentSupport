/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VentanasRST;

import Clases.Presupuesto;
import Clases.Solicitud;
import Clases.tools;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author soporte
 */
public class listarPresupuesto extends javax.swing.JFrame {

    ArrayList<Presupuesto> lista = new ArrayList();
    newCotizacion nc;
    String rutaArchivos = "";
    ArrayList<String> archivos;

    public listarPresupuesto() {
        initComponents();
        llenarTabla();
        changeIcon();
    }

    public listarPresupuesto(newCotizacion ncc) {
        initComponents();
        llenarTabla();
        this.nc = ncc;
        changeIcon();
    }

    public void changeIcon() {
       Image icon = new ImageIcon(getClass().getResource("/imgs/logo_rossetti.jpg")).getImage();
        setIconImage(icon);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        rSPanelGradiente1 = new rojeru_san.rspanel.RSPanelGradiente();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new rojerusan.RSTableMetro();
        jLabel4 = new javax.swing.JLabel();
        clienteTxt = new rojeru_san.rsfield.RSTextFull();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaArchivo = new rojerusan.RSTableMetro();
        rSButtonRoundEffectIcon1 = new rojeru_san.rsbutton.RSButtonRoundEffectIcon();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Listado de Presupuestos Emitidos - SGDS");
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        rSPanelGradiente1.setColorPrimario(new java.awt.Color(161, 54, 48));
        rSPanelGradiente1.setColorSecundario(new java.awt.Color(153, 153, 153));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Presupuestos Emitidos");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/windowclose_104378.png"))); // NOI18N
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/logo_rossetti 48x48.jpg"))); // NOI18N

        javax.swing.GroupLayout rSPanelGradiente1Layout = new javax.swing.GroupLayout(rSPanelGradiente1);
        rSPanelGradiente1.setLayout(rSPanelGradiente1Layout);
        rSPanelGradiente1Layout.setHorizontalGroup(
            rSPanelGradiente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSPanelGradiente1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8))
        );
        rSPanelGradiente1Layout.setVerticalGroup(
            rSPanelGradiente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "# Solc", "# Pres", "Cliente", "Realizado Por:", "Fecha"
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
            tabla.getColumnModel().getColumn(1).setMinWidth(70);
            tabla.getColumnModel().getColumn(1).setPreferredWidth(70);
            tabla.getColumnModel().getColumn(1).setMaxWidth(70);
            tabla.getColumnModel().getColumn(3).setMinWidth(130);
            tabla.getColumnModel().getColumn(3).setPreferredWidth(130);
            tabla.getColumnModel().getColumn(3).setMaxWidth(130);
            tabla.getColumnModel().getColumn(4).setMinWidth(100);
            tabla.getColumnModel().getColumn(4).setPreferredWidth(100);
            tabla.getColumnModel().getColumn(4).setMaxWidth(100);
        }

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Buscar por Nombre de Cliente:");

        clienteTxt.setForeground(new java.awt.Color(161, 54, 48));
        clienteTxt.setBordeColorFocus(new java.awt.Color(161, 54, 48));
        clienteTxt.setBotonColor(new java.awt.Color(161, 54, 48));
        clienteTxt.setPlaceholder("Nombre del Cliente");
        clienteTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clienteTxtMouseClicked(evt);
            }
        });
        clienteTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clienteTxtActionPerformed(evt);
            }
        });
        clienteTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                clienteTxtKeyReleased(evt);
            }
        });

        tablaArchivo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Archivos  Subidos con el Presupuesto"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaArchivo.setToolTipText("Presione Click 2 Veces para abrir el Archivo");
        tablaArchivo.setBackgoundHead(new java.awt.Color(161, 54, 48));
        tablaArchivo.setBackgoundHover(new java.awt.Color(161, 54, 48));
        tablaArchivo.setColorPrimaryText(new java.awt.Color(161, 54, 48));
        tablaArchivo.setColorSecundaryText(new java.awt.Color(161, 54, 48));
        tablaArchivo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tablaArchivo.setFontHead(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        tablaArchivo.setFontRowHover(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tablaArchivo.setGridColor(new java.awt.Color(255, 255, 255));
        tablaArchivo.setSelectionBackground(new java.awt.Color(161, 54, 48));
        tablaArchivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaArchivoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablaArchivo);

        rSButtonRoundEffectIcon1.setBackground(new java.awt.Color(161, 54, 48));
        rSButtonRoundEffectIcon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Search_icon-icons.com_75246.png"))); // NOI18N
        rSButtonRoundEffectIcon1.setText("           Abrir Archivo Seleccionado  ");
        rSButtonRoundEffectIcon1.setColorHover(new java.awt.Color(77, 164, 98));
        rSButtonRoundEffectIcon1.setEfecto(rojeru_san.rsbutton.RSButtonRoundEffectIcon.EFECTO.RIPLE);
        rSButtonRoundEffectIcon1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        rSButtonRoundEffectIcon1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonRoundEffectIcon1ActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(161, 54, 48));
        jSeparator1.setForeground(new java.awt.Color(161, 54, 48));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Presione  doble click sobre la tabla para seleccionar el presupuesto  deseado");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rSPanelGradiente1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(40, 40, 40)
                            .addComponent(jLabel4)
                            .addGap(18, 18, 18)
                            .addComponent(clienteTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 669, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(rSButtonRoundEffectIcon1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(rSPanelGradiente1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(clienteTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 18, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rSButtonRoundEffectIcon1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jLabel6)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        if (evt.getClickCount() == 1 && tabla.getSelectedRow() >= 0) {
            int idSolicitud = Integer.parseInt(tabla.getValueAt(tabla.getSelectedRow(), 0).toString());
            int idPresupuesto = Integer.parseInt(tabla.getValueAt(tabla.getSelectedRow(), 1).toString());
            buscarArchivos(idSolicitud);
        } else if (evt.getClickCount() == 2) {
            extraerDatosSolicitud();
        }


    }//GEN-LAST:event_tablaMouseClicked

    private void clienteTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_clienteTxtKeyReleased
        if (clienteTxt.getText().length() > 0) {
            listarTabla(clienteTxt.getText());
        } else {
            llenarTabla();
        }
    }//GEN-LAST:event_clienteTxtKeyReleased

    private void tablaArchivoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaArchivoMouseClicked
        if (tablaArchivo.getSelectedRow() >= 0 && evt.getClickCount() == 2) {
            getArchivo();
        }
    }//GEN-LAST:event_tablaArchivoMouseClicked

    private void rSButtonRoundEffectIcon1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonRoundEffectIcon1ActionPerformed
        DefaultTableModel mod = (DefaultTableModel) tablaArchivo.getModel();
        if (tablaArchivo.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(rootPane, "No hay Archivo Seleccionado");
        } else if (tablaArchivo.getValueAt(tablaArchivo.getSelectedRow(), 0).toString().equals("Sin Archivos Encontrados")) {
            JOptionPane.showMessageDialog(rootPane, "No hay Archivos Disponibles para Mostrar");
        } else {
            getArchivo();
        }

    }//GEN-LAST:event_rSButtonRoundEffectIcon1ActionPerformed

    private void clienteTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clienteTxtMouseClicked
     
    }//GEN-LAST:event_clienteTxtMouseClicked

    private void clienteTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clienteTxtActionPerformed
       
    }//GEN-LAST:event_clienteTxtActionPerformed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel8MouseClicked

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
            java.util.logging.Logger.getLogger(listarPresupuesto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(listarPresupuesto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(listarPresupuesto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(listarPresupuesto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new listarPresupuesto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.rsfield.RSTextFull clienteTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private rojeru_san.rsbutton.RSButtonRoundEffectIcon rSButtonRoundEffectIcon1;
    private rojeru_san.rspanel.RSPanelGradiente rSPanelGradiente1;
    private rojerusan.RSTableMetro tabla;
    private rojerusan.RSTableMetro tablaArchivo;
    // End of variables declaration//GEN-END:variables

    public void llenarTabla() {
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        lista = (ArrayList) new Presupuesto().listarxEstado("Esperando Cotización").clone();
        vaciarTabla();
        if (lista.size() > 0) {

            for (int i = 0; i < lista.size(); i++) {
                modelo.addRow(new Object[]{
                    lista.get(i).getIdSolicitud(),
                    lista.get(i).getIdPresupuesto(),
                    lista.get(i).getCliente(),
                    lista.get(i).getResponsable(),
                    lista.get(i).getFechaIngreso()
                });
            }
        } else {
            modelo.addRow(new Object[]{"", "", "SIN PRESUPUESTOS PENDIENTES", ""});
        }
    }

    private void vaciarTabla() {
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        modelo.setRowCount(0);
    }

    private void extraerDatosSolicitud() {
        int idSolicitud = Integer.parseInt(tabla.getValueAt(tabla.getSelectedRow(), 0).toString());
        int idPresupuesto = Integer.parseInt(tabla.getValueAt(tabla.getSelectedRow(), 1).toString());
        nc.setSolicitud(new Solicitud().buscarID(idSolicitud));
        nc.setPresupuesto(new Presupuesto().buscarID(idPresupuesto));
        nc.idPresupuesto.setText(idPresupuesto + "");
        nc.setDatos();
        nc.setExtendedState(NORMAL);
        this.dispose();
    }

    private void listarTabla(String text) {
        lista = new ArrayList();
        lista = (ArrayList) new Presupuesto().listarxNombreyEstado(text,"Esperando Cotización").clone();
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        vaciarTabla();
        if (lista.size() > 0) {

            for (int i = 0; i < lista.size(); i++) {
                modelo.addRow(new Object[]{
                    lista.get(i).getIdSolicitud(),
                    lista.get(i).getIdPresupuesto(),
                    lista.get(i).getCliente(),
                    lista.get(i).getResponsable(),
                    lista.get(i).getFechaIngreso()
                });
            }
        } else {
            modelo.addRow(new Object[]{"", "", "SIN RESULTADOS", ""});
        }
    }

    private void buscarArchivos(int idSolicitud) {
        //Solicitud s = new Solicitud(idSolicitud);
        String cliente = tabla.getValueAt(tabla.getSelectedRow(), 2).toString();        
        String rutaOriginal = "\\\\atenea\\SGDS\\Data\\1. Clientes\\" + cliente + "\\1. Solicitudes\\";
        rutaArchivos = rutaOriginal + idSolicitud + "\\1.Presupuesto\\";
        new tools().crearCarpeta(rutaArchivos);
        archivos = (ArrayList) new tools().listarDirectorio(rutaArchivos).clone();

        DefaultTableModel modelo = (DefaultTableModel) tablaArchivo.getModel();
        vaciarTablaArchivos();
        if (archivos.size() > 0) {
            for (int i = 0; i < archivos.size(); i++) {
                modelo.addRow(new Object[]{
                    archivos.get(i)
                });
            }
        } else {
            modelo.addRow(new Object[]{
                "Sin Archivos Encontrados"
            });
        }

    }

    private void abrirArchivo(int index) {
        new tools().abrirArchivo(rutaArchivos + archivos.get(index));
    }

    private void vaciarTablaArchivos() {
        DefaultTableModel modelo = (DefaultTableModel) tablaArchivo.getModel();
        modelo.setRowCount(0);
    }

    private void getArchivo() {

        if (tablaArchivo.getValueAt(tablaArchivo.getSelectedRow(), 0).toString().equals("Sin Archivos Encontrados")) {
            JOptionPane.showMessageDialog(rootPane, "No hay Archivos Disponibles para Mostrar");
        } else {
            int index = tablaArchivo.getSelectedRow();
            abrirArchivo(index);
        }

    }
}
