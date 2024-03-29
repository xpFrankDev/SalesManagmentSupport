/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VentanasRST;

import Clases.Cliente;
import Clases.Cotizacion;
import Clases.Despacho;
import Clases.Presupuesto;
import Clases.Solicitud;
import Panels.panelAgregarComunicacion;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author soporte
 */
public class viewCotizacion extends javax.swing.JFrame {

    ArrayList<Cotizacion> lista;
    Cotizacion c;
    panelAgregarComunicacion a;
    int escape = 0;

    public viewCotizacion() {
        initComponents();
        changeIcon();
        getResultado("0");
        this.a = a;
        escape = 1;
        changeIcon();
    }

    public viewCotizacion(panelAgregarComunicacion a) {
        initComponents();
        this.a = a;
        escape = 1;
        changeIcon();
        getResultado("0");
    }

    public void changeIcon() {
        Image icon = new ImageIcon(getClass().getResource("/imgs/logo_rossetti.jpg")).getImage();
        setIconImage(icon);
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
        panelHeader = new rojeru_san.rspanel.RSPanelGradiente();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabla = new rojerusan.RSTableMetro();
        jLabel4 = new javax.swing.JLabel();
        clienteTxt = new rojeru_san.rsfield.RSTextFull();
        jLabel5 = new javax.swing.JLabel();
        combo = new RSMaterialComponent.RSComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ver Cotizaciones - SDGS");
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(712, 376));
        setResizable(false);

        panelCentral.setBackground(new java.awt.Color(255, 255, 255));
        panelCentral.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        panelHeader.setColorPrimario(new java.awt.Color(161, 54, 48));
        panelHeader.setColorSecundario(new java.awt.Color(153, 153, 153));
        panelHeader.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panelHeaderMouseDragged(evt);
            }
        });
        panelHeader.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelHeaderMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                panelHeaderMouseReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Buscar Documento");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/logo_rossetti 32x32.jpg"))); // NOI18N

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/windowclose_104378.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelHeaderLayout = new javax.swing.GroupLayout(panelHeader);
        panelHeader.setLayout(panelHeaderLayout);
        panelHeaderLayout.setHorizontalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHeaderLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelHeaderLayout.setVerticalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "# Cot", "Cliente", "Fecha"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
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
        jScrollPane4.setViewportView(tabla);
        if (tabla.getColumnModel().getColumnCount() > 0) {
            tabla.getColumnModel().getColumn(0).setMinWidth(75);
            tabla.getColumnModel().getColumn(0).setPreferredWidth(75);
            tabla.getColumnModel().getColumn(0).setMaxWidth(75);
            tabla.getColumnModel().getColumn(1).setMinWidth(90);
            tabla.getColumnModel().getColumn(1).setPreferredWidth(90);
            tabla.getColumnModel().getColumn(1).setMaxWidth(90);
            tabla.getColumnModel().getColumn(3).setMinWidth(120);
            tabla.getColumnModel().getColumn(3).setPreferredWidth(120);
            tabla.getColumnModel().getColumn(3).setMaxWidth(120);
        }

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Nombre de Cliente:");

        clienteTxt.setForeground(new java.awt.Color(161, 54, 48));
        clienteTxt.setBordeColorFocus(new java.awt.Color(161, 54, 48));
        clienteTxt.setBotonColor(new java.awt.Color(161, 54, 48));
        clienteTxt.setPlaceholder("Nombre del Cliente ");
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

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Documento:");

        combo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Solicitud", "Cotización", "Despacho", "Cliente" }));
        combo.setColorArrow(new java.awt.Color(161, 54, 48));
        combo.setColorBorde(new java.awt.Color(161, 54, 48));
        combo.setColorFondo(new java.awt.Color(161, 54, 48));
        combo.setColorSeleccion(new java.awt.Color(161, 54, 48));
        combo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboItemStateChanged(evt);
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
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(clienteTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 46, Short.MAX_VALUE))
                    .addComponent(jScrollPane4))
                .addContainerGap())
        );
        panelCentralLayout.setVerticalGroup(
            panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCentralLayout.createSequentialGroup()
                .addComponent(panelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelCentralLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(clienteTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                .addContainerGap())
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
    int xx, yy;
    private void panelHeaderMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelHeaderMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - yy);
    }//GEN-LAST:event_panelHeaderMouseDragged

    private void panelHeaderMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelHeaderMousePressed
        setOpacity((float) 0.8);
        xx = evt.getX();
        yy = evt.getY();
    }//GEN-LAST:event_panelHeaderMousePressed

    private void panelHeaderMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelHeaderMouseReleased
        setOpacity((float) 1.0);
    }//GEN-LAST:event_panelHeaderMouseReleased

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked

        if (escape == 1) {
            if (evt.getClickCount() == 1
                    && tabla.getSelectedRow() >= 0
                    && !tabla.getValueAt(tabla.getSelectedRow(), 2).toString().equals("SIN RESULTADOS")
                    && tabla.getValueAt(tabla.getSelectedRow(), 2) != null) {

                
            } else if (evt.getClickCount() == 2 && !tabla.getValueAt(tabla.getSelectedRow(), 2).toString().equals("SIN RESULTADOS")) {

                enviarDatos();

            }
        }


    }//GEN-LAST:event_tablaMouseClicked

    private void clienteTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clienteTxtMouseClicked

    }//GEN-LAST:event_clienteTxtMouseClicked

    private void clienteTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clienteTxtActionPerformed

    }//GEN-LAST:event_clienteTxtActionPerformed

    private void clienteTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_clienteTxtKeyReleased
        if (clienteTxt.getText().length() > 0) {
            getResultado(clienteTxt.getText());
        } else {
            getResultado("0");
        }
    }//GEN-LAST:event_clienteTxtKeyReleased

    private void comboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboItemStateChanged
        if (clienteTxt.getText().length() > 0) {
            getResultado(clienteTxt.getText());
        } else {
            getResultado("0");
        }
    }//GEN-LAST:event_comboItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(viewCotizacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewCotizacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewCotizacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewCotizacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewCotizacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.rsfield.RSTextFull clienteTxt;
    private RSMaterialComponent.RSComboBox combo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JPanel panelCentral;
    private rojeru_san.rspanel.RSPanelGradiente panelHeader;
    private rojerusan.RSTableMetro tabla;
    // End of variables declaration//GEN-END:variables

    private void vaciarTabla() {
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        modelo.setRowCount(0);
    }

    private void getResultado(String a) {

        ArrayList<Solicitud> temp1 = new ArrayList();
        ArrayList<Cotizacion> temp2 = new ArrayList();
        ArrayList<Despacho> temp3 = new ArrayList();
        ArrayList<Cliente> temp4 = new ArrayList();
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        int valor = combo.getSelectedIndex();

        int general = 0;
        if (a.equals("0")) { // Campo vacio
            general = 0;
        } else {
            general = 1;//especificó un cliente
        }

        switch (valor) {
            case 0:

                if (general == 0) {

                    temp1 = (ArrayList) new Solicitud().listarGeneral().clone();
                    vaciarTabla();

                    if (temp1.size() > 0) {

                        modelo.setColumnIdentifiers(new Object[]{"ID", "Descripc", "Cliente", "Fecha"});
                        for (int i = 0; i < temp1.size(); i++) {
                            Presupuesto p = new Presupuesto().buscarID(temp1.get(i).getIdPresupuesto());
                            Cliente c = new Cliente().buscarId(p.getIdCliente());

                            modelo.addRow(new Object[]{
                                temp1.get(i).getId(),
                                temp1.get(i).getDescripcion(),
                                c.getNombre1(),
                                temp1.get(i).getFecha()
                            });
                        }
                    } else {
                        modelo.addRow(new Object[]{"", "", "SIN RESULTADOS", ""});
                    }

                } else {
                    String clientex = clienteTxt.getText();
                    Cliente cx = new Cliente().buscarXNombre(clientex);
                    int idCliente = cx.getID();
                    temp1 = (ArrayList) new Solicitud().listarXCliente(idCliente).clone();

                    vaciarTabla();
                    if (temp1.size() > 0) {
                        modelo.setColumnIdentifiers(new Object[]{"ID", "Descrip", "Cliente", "Fecha"});
                        for (int i = 0; i < temp1.size(); i++) {
                            Presupuesto p = new Presupuesto().buscarID(temp1.get(i).getIdPresupuesto());
                            Cliente c = new Cliente().buscarId(p.getIdCliente());

                            modelo.addRow(new Object[]{
                                temp1.get(i).getId(),
                                temp1.get(i).getDescripcion(),
                                c.getNombre1(),
                                temp1.get(i).getFecha()
                            });
                        }
                    } else {
                        modelo.addRow(new Object[]{"", "", "SIN RESULTADOS", ""});
                    }

                }
                break;
            case 1:
                if (general == 0) {
                    temp2 = (ArrayList) new Cotizacion().listarGeneral().clone();
                    vaciarTabla();
                    if (temp2.size() > 0) {
                        modelo.setColumnIdentifiers(new Object[]{"ID", "Num Cot", "Cliente", "Fecha"});
                        for (int i = 0; i < temp2.size(); i++) {
                            modelo.addRow(new Object[]{
                                temp2.get(i).getID(),
                                temp2.get(i).getNumeroCot(),
                                temp2.get(i).getCliente(),
                                temp2.get(i).getFecha()
                            });
                        }
                    } else {
                        modelo.addRow(new Object[]{"", "", "SIN RESULTADOS", ""});
                    }
                } else {
                    String clientex = clienteTxt.getText();
                    temp2 = (ArrayList) new Cotizacion().listarxDato(clientex).clone();
                    vaciarTabla();
                    if (temp2.size() > 0) {
                        modelo.setColumnIdentifiers(new Object[]{"ID", "Num Cot", "Cliente", "Fecha"});
                        for (int i = 0; i < temp2.size(); i++) {
                            modelo.addRow(new Object[]{
                                temp2.get(i).getID(),
                                temp2.get(i).getNumeroCot(),
                                temp2.get(i).getCliente(),
                                temp2.get(i).getFecha()
                            });
                        }
                    } else {
                        modelo.addRow(new Object[]{"", "", "SIN RESULTADOS", ""});
                    }
                }
                break;
            case 2:
                modelo.setColumnIdentifiers(new Object[]{"ID", "Num Guia", "Monto", "Fecha"});

                if (general == 0) {
                    temp3 = (ArrayList) new Despacho().listarGeneral().clone();
                    vaciarTabla();
                    if (temp3.size() > 0) {

                         for (Despacho desp : temp3) {
                            modelo.addRow(new Object[]{
                                desp.getId(),
                                desp.getNumeroGuia(),
                                desp.getMontoDespachado(),
                                desp.getFecha()
                            });
                        }
                    } else {
                        modelo.addRow(new Object[]{"", "", "SIN RESULTADOS", ""});
                    }
                } else {
                    String clientex = clienteTxt.getText();
                    temp3 = (ArrayList)  new Despacho().listarxGuia(clientex).clone();
                    vaciarTabla();
                    if (temp3.size() > 0) {
//
                       for(Despacho desp: temp3){
                            modelo.addRow(new Object[]{
                                desp.getId(),
                                desp.getNumeroGuia(),
                                desp.getMontoDespachado(),
                                desp.getFecha()
                            });
                        }
                    } else {
                        modelo.addRow(new Object[]{"", "", "SIN RESULTADOS", ""});
                    }
                }
                break;
            case 3:
                modelo.setColumnIdentifiers(new Object[]{"ID", "Nombre", "RUC"});
                if (general == 0) {
                    temp4 = (ArrayList) new Cliente().listarClientes().clone();
                    vaciarTabla();
                    if (temp4.size() > 0) {

                        for (int i = 0; i < temp4.size(); i++) {
                            modelo.addRow(new Object[]{
                                temp4.get(i).getID(),
                                temp4.get(i).getNombre1(),
                                temp4.get(i).getRuc()
                            });
                        }
                    } else {
                        modelo.addRow(new Object[]{"", "", "SIN RESULTADOS", ""});
                    }
                } else {
                    temp4 = (ArrayList) new Cliente().ListarXNombre(clienteTxt.getText()).clone();
                    vaciarTabla();
                    if (temp4.size() > 0) {

                        for (int i = 0; i < temp4.size(); i++) {
                            modelo.addRow(new Object[]{
                                temp4.get(i).getID(),
                                temp4.get(i).getNombre1(),
                                temp4.get(i).getRuc()
                            });
                        }
                    } else {
                        modelo.addRow(new Object[]{"", "", "SIN RESULTADOS", ""});
                    }
                }
                break;
        }

    }

    private void enviarDatos() {
        int seleccionado = combo.getSelectedIndex();

        switch (seleccionado) {
            case 0://Solicitud
                int idSol = Integer.parseInt(tabla.getValueAt(tabla.getSelectedRow(), 0).toString());
                a.setSolicitud(new Solicitud().buscarID(idSol));
                break;

            case 1://Cotizacion
                int idCot = Integer.parseInt(tabla.getValueAt(tabla.getSelectedRow(), 0).toString());
                a.setCotizacion(new Cotizacion().buscarID(idCot));
                break;

            case 2://Despacho
                int idDesp = Integer.parseInt(tabla.getValueAt(tabla.getSelectedRow(), 0).toString());
                a.setDespacho(new Despacho().buscarID(idDesp));


                break;
            case 3:
                int idCliente = Integer.parseInt(tabla.getValueAt(tabla.getSelectedRow(), 0).toString());
                a.setOtro(new Cliente().buscarId(idCliente));
                
                break;
        }
                        this.dispose();
    }
}
