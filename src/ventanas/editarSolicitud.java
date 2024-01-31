/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VentanasRST;

import Clases.Cliente;
import Clases.Solicitud;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;
import rojerusan.RSNotifyFade;

/**
 *
 * @author soporte
 */
public class editarSolicitud extends javax.swing.JFrame {

    //Main m;
    int valor = 0;

    public editarSolicitud() {
        initComponents();
        llenarTabla();
    }


    public editarSolicitud( int valorx) {
        initComponents();
        //this.m = m;
        llenarTabla();
        valor = 2;
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
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        clienteTxt = new javax.swing.JTextField();
        rSButtonIconShadow1 = new RSMaterialComponent.RSButtonIconShadow();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new RSMaterialComponent.RSTableMetro();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        panelCentral.setBackground(new java.awt.Color(255, 255, 255));
        panelCentral.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

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
        jLabel1.setText("Listado de Solicitudes");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/windowclose_104378.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/logo_rossetti 48x48.jpg"))); // NOI18N

        javax.swing.GroupLayout panelHeaderLayout = new javax.swing.GroupLayout(panelHeader);
        panelHeader.setLayout(panelHeaderLayout);
        panelHeaderLayout.setHorizontalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHeaderLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelHeaderLayout.setVerticalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 59, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Buscar por Cliente:");

        clienteTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        clienteTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        clienteTxt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        clienteTxt.setOpaque(false);
        clienteTxt.setSelectionColor(new java.awt.Color(161, 54, 48));
        clienteTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                clienteTxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                clienteTxtFocusLost(evt);
            }
        });
        clienteTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                clienteTxtMouseExited(evt);
            }
        });
        clienteTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                clienteTxtKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                clienteTxtKeyTyped(evt);
            }
        });

        rSButtonIconShadow1.setBackground(new java.awt.Color(153, 153, 153));
        rSButtonIconShadow1.setBackgroundHover(new java.awt.Color(102, 102, 102));
        rSButtonIconShadow1.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.CLEAR);

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Cliente", "RUC", "Fecha"
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
        tabla.setFontRowSelect(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tabla.setSelectionBackground(new java.awt.Color(161, 54, 48));
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);
        if (tabla.getColumnModel().getColumnCount() > 0) {
            tabla.getColumnModel().getColumn(0).setMinWidth(80);
            tabla.getColumnModel().getColumn(0).setPreferredWidth(80);
            tabla.getColumnModel().getColumn(0).setMaxWidth(80);
            tabla.getColumnModel().getColumn(2).setMinWidth(140);
            tabla.getColumnModel().getColumn(2).setPreferredWidth(140);
            tabla.getColumnModel().getColumn(2).setMaxWidth(140);
            tabla.getColumnModel().getColumn(3).setMinWidth(110);
            tabla.getColumnModel().getColumn(3).setPreferredWidth(110);
            tabla.getColumnModel().getColumn(3).setMaxWidth(110);
        }

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel3.setText("Nota: Solo se visualizarán aquellas Solicitudes que aun no tengan Asigandos un Presupuesto.");

        javax.swing.GroupLayout panelCentralLayout = new javax.swing.GroupLayout(panelCentral);
        panelCentral.setLayout(panelCentralLayout);
        panelCentralLayout.setHorizontalGroup(
            panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelCentralLayout.createSequentialGroup()
                .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCentralLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(clienteTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rSButtonIconShadow1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelCentralLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(panelCentralLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 643, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelCentralLayout.setVerticalGroup(
            panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCentralLayout.createSequentialGroup()
                .addComponent(panelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clienteTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSButtonIconShadow1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(jLabel3)
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

    private void clienteTxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_clienteTxtFocusGained
        clienteTxt.setBorder(new MatteBorder(0, 0, 2, 0, new Color(161, 54, 48)));
    }//GEN-LAST:event_clienteTxtFocusGained

    private void clienteTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_clienteTxtFocusLost
        clienteTxt.setBorder(new MatteBorder(0, 0, 1, 0, Color.BLACK));
    }//GEN-LAST:event_clienteTxtFocusLost

    private void clienteTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clienteTxtMouseExited

        //
    }//GEN-LAST:event_clienteTxtMouseExited

    private void clienteTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_clienteTxtKeyReleased

    }//GEN-LAST:event_clienteTxtKeyReleased

    private void clienteTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_clienteTxtKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_clienteTxtKeyTyped
    String cliente;
    int idSolicitud;
    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        if (valor == 1) {
            if (evt.getClickCount() == 1 && tabla.getSelectedRow() >= 0) {
                cliente = tabla.getValueAt(tabla.getSelectedRow(), 1).toString();
                idSolicitud = Integer.parseInt(tabla.getValueAt(tabla.getSelectedRow(), 0).toString());

            } else if (evt.getClickCount() == 2) {
                idSolicitud = Integer.parseInt(tabla.getValueAt(tabla.getSelectedRow(), 0).toString());
                Solicitud s = new Solicitud().buscarID(idSolicitud);
                new newSolicitud(s).setVisible(true);

            }
        } else {
            if (valor == 2) {
                if (evt.getClickCount() == 2) {
                    String idString = tabla.getValueAt(tabla.getSelectedRow(), 0).toString();
                    int idSolicitud = Integer.valueOf(idString);
                    Solicitud sol = new Solicitud().buscarID(idSolicitud);
                    
                    
                    
                    int rsp = JOptionPane.showConfirmDialog(rootPane, "¿Desea Borrar la Solicitud?, tenga presente que no podrá recuperarla Luego\n\n \t "
                            + "                        Datos:\n"
                            + "Fecha: "+sol.getFecha()+" \t       Vendedor: "+sol.getVendedor()+" \nContacto: "+sol.getPersonaContacto()+" \n"
                                    + "Descripción:\n"+sol.getDescripcion(), "Eliminar", JOptionPane.OK_CANCEL_OPTION);
                    if (rsp == JOptionPane.OK_OPTION) {

                        String respuestax = JOptionPane.showInputDialog("Ingrese motivo de la cancelación","");
                        sol.setEstado(respuestax);
                        sol.update();
                        
                        sol.setEliminado(1);
                        int respuesta = sol.deleteLogico();
                        if (respuesta > 0) {
                            new rojerusan.RSNotifyFade("¡¡SUCCESS!!", " Solicitud Eliminada Correctamente", 5, RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.SUCCESS).setVisible(true);
                            llenarTabla();
                        }
                    }
                }

            }
        }


    }//GEN-LAST:event_tablaMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
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
            java.util.logging.Logger.getLogger(editarSolicitud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(editarSolicitud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(editarSolicitud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(editarSolicitud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new editarSolicitud().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField clienteTxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelCentral;
    private rojeru_san.rspanel.RSPanelGradiente panelHeader;
    private RSMaterialComponent.RSButtonIconShadow rSButtonIconShadow1;
    private RSMaterialComponent.RSTableMetro tabla;
    // End of variables declaration//GEN-END:variables

    private void llenarTabla() {

        ArrayList<Solicitud> lista = (ArrayList<Solicitud>) new Solicitud().listarxEditar().clone();
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        vaciarTabla();
        for (Solicitud s : lista) {
            Cliente c = new Cliente().buscarId(s.getIdCliente());
            String nombreCliente = c.getNombre1();
            String ruc = c.getRuc();

            modelo.addRow(new Object[]{
                s.getId(), nombreCliente, ruc, s.getFecha()
            });

            if (modelo.getRowCount() == 0) {
                modelo.addRow(new Object[]{
                    "", "No hay Solicitudes Disponibles", "", ""
                });
            }
        }
    }

    private void vaciarTabla() {
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        modelo.setRowCount(0);
    }
}