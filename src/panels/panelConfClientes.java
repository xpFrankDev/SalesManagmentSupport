package Panels;

import Clases.Cliente;
import Clases.Log;
import Clases.PersonaContacto;
import Clases.PlaceHolder;
import Clases.tools;
import Ventanas.cargando;
import VentanasRST.Main;
import VentanasRST.editarPersonaContacto;
import java.awt.Cursor;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import rojerusan.RSNotifyFade;

public class panelConfClientes extends javax.swing.JPanel {

    static Cliente cliente = new Cliente();
    int modificar = 0;
    cargando carga = new cargando();
    public panelConfClientes() {
        initComponents();

        agregarPlaceHolder();
        buscarNombretxt.setBorder(BorderFactory.createEmptyBorder(2, 5, 2, 2));
        llenarTabla();
        buscarNombretxt.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new rojerusan.RSTableMetro();
        buscarNombretxt = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        nombreTxt = new javax.swing.JTextField();
        rucTxt = new javax.swing.JTextField();
        telefonoTxt = new javax.swing.JTextField();
        celularTxt = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        direccionTxt = new javax.swing.JTextArea();
        editarCliente = new RSComponentShade.RSButtonRippleShade();
        eliminarCliente = new RSComponentShade.RSButtonRippleShade();
        combo = new RSMaterialComponent.RSComboBox();
        jLabel3 = new javax.swing.JLabel();
        editarContacto = new RSMaterialComponent.RSButtonIconShadow();
        eliminarContacto = new RSMaterialComponent.RSButtonIconShadow();
        nuevoClienteButton = new RSComponentShade.RSButtonRippleShade();
        cancelarButton = new RSComponentShade.RSButtonRippleShade();
        agregarConcato = new RSMaterialComponent.RSButtonIconShadow();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Administración de Clientes");

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Razón Social"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla.setBackgoundHead(new java.awt.Color(161, 54, 48));
        tabla.setBackgoundHover(new java.awt.Color(161, 54, 48));
        tabla.setColorPrimaryText(new java.awt.Color(0, 0, 0));
        tabla.setColorSecondary(new java.awt.Color(255, 255, 255));
        tabla.setColorSecundaryText(new java.awt.Color(0, 0, 0));
        tabla.setSelectionBackground(new java.awt.Color(192, 121, 117));
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        tabla.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tablaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tablaKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);

        buscarNombretxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        buscarNombretxt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        buscarNombretxt.setMargin(new java.awt.Insets(2, 5, 2, 2));
        buscarNombretxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                buscarNombretxtKeyReleased(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        jButton1.setText("X");
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("DATOS:");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
        });

        nombreTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nombreTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nombreTxt.setEnabled(false);
        nombreTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nombreTxtKeyReleased(evt);
            }
        });

        rucTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rucTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        rucTxt.setEnabled(false);
        rucTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                rucTxtKeyTyped(evt);
            }
        });

        telefonoTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        telefonoTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        telefonoTxt.setEnabled(false);
        telefonoTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                telefonoTxtKeyTyped(evt);
            }
        });

        celularTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        celularTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        celularTxt.setEnabled(false);
        celularTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                celularTxtActionPerformed(evt);
            }
        });
        celularTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                celularTxtKeyTyped(evt);
            }
        });

        direccionTxt.setColumns(20);
        direccionTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        direccionTxt.setLineWrap(true);
        direccionTxt.setRows(2);
        direccionTxt.setEnabled(false);
        jScrollPane2.setViewportView(direccionTxt);

        editarCliente.setBackground(new java.awt.Color(51, 181, 229));
        editarCliente.setText("Modificar");
        editarCliente.setBgHover(new java.awt.Color(0, 153, 204));
        editarCliente.setBgShadeHover(new java.awt.Color(0, 153, 204));
        editarCliente.setEnabled(false);
        editarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarClienteActionPerformed(evt);
            }
        });

        eliminarCliente.setBackground(new java.awt.Color(255, 68, 68));
        eliminarCliente.setText("Eliminar");
        eliminarCliente.setBgHover(new java.awt.Color(204, 0, 0));
        eliminarCliente.setBgShadeHover(new java.awt.Color(204, 0, 0));
        eliminarCliente.setEnabled(false);
        eliminarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarClienteActionPerformed(evt);
            }
        });

        combo.setForeground(new java.awt.Color(0, 0, 0));
        combo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Esperando Cliente..." }));
        combo.setColorArrow(new java.awt.Color(161, 54, 48));
        combo.setColorBorde(new java.awt.Color(161, 54, 48));
        combo.setColorBoton(new java.awt.Color(255, 255, 255));
        combo.setColorFondo(new java.awt.Color(255, 255, 255));
        combo.setColorSeleccion(new java.awt.Color(161, 54, 48));
        combo.setEnabled(false);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Personas de Contacto Agregadas:");

        editarContacto.setBackground(new java.awt.Color(51, 181, 229));
        editarContacto.setBackgroundHover(new java.awt.Color(0, 153, 204));
        editarContacto.setEnabled(false);
        editarContacto.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.EDIT);
        editarContacto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarContactoActionPerformed(evt);
            }
        });

        eliminarContacto.setBackground(new java.awt.Color(255, 68, 68));
        eliminarContacto.setBackgroundHover(new java.awt.Color(204, 0, 0));
        eliminarContacto.setEnabled(false);
        eliminarContacto.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.DELETE);
        eliminarContacto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarContactoActionPerformed(evt);
            }
        });

        nuevoClienteButton.setBackground(new java.awt.Color(0, 200, 81));
        nuevoClienteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/new-file_40454.png"))); // NOI18N
        nuevoClienteButton.setText("Nuevo Cliente");
        nuevoClienteButton.setBgHover(new java.awt.Color(0, 126, 51));
        nuevoClienteButton.setBgShadeHover(new java.awt.Color(0, 126, 51));
        nuevoClienteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoClienteButtonActionPerformed(evt);
            }
        });

        cancelarButton.setBackground(new java.awt.Color(255, 68, 68));
        cancelarButton.setText("Cancelar Edición ");
        cancelarButton.setBgHover(new java.awt.Color(204, 0, 0));
        cancelarButton.setBgShadeHover(new java.awt.Color(204, 0, 0));
        cancelarButton.setEnabled(false);
        cancelarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarButtonActionPerformed(evt);
            }
        });

        agregarConcato.setBackground(new java.awt.Color(0, 200, 81));
        agregarConcato.setBackgroundHover(new java.awt.Color(0, 126, 51));
        agregarConcato.setEnabled(false);
        agregarConcato.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.ADD);
        agregarConcato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarConcatoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(telefonoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(celularTxt))
                                .addComponent(nombreTxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(rucTxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(combo, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(agregarConcato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(editarContacto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(eliminarContacto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(cancelarButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
                                .addComponent(eliminarCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(editarCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nuevoClienteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buscarNombretxt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nuevoClienteButton, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buscarNombretxt))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1)
                        .addGap(25, 25, 25))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nombreTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(rucTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(telefonoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(celularTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(editarContacto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eliminarContacto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(agregarConcato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(editarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eliminarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancelarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void eliminarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarClienteActionPerformed
        if (JOptionPane.showConfirmDialog(null, "¿Desea borrar el Cliente Seleccionado?", "Borrar Cliente", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
            if (cliente.deleteClienteLogico(1) == 1) {
                new rojerusan.RSNotifyFade("¡¡SUCCESS!!", "Cliente Eliminado", 4, RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.SUCCESS).setVisible(true);
                limpiarCampos();
            } else {
                new rojerusan.RSNotifyFade("¡¡ERROR!!", "Ha ocurrido algún inconveniente al borrar el cliente, contacte con el administrador", 6, RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.ERROR).setVisible(true);
            }
        }
    }//GEN-LAST:event_eliminarClienteActionPerformed

    private void buscarNombretxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscarNombretxtKeyReleased
        if (buscarNombretxt.getText().length() < 1) {
            llenarTabla();
        } else {
            llenarTabla(buscarNombretxt.getText());
        }
        limpiezaSimple();
    }//GEN-LAST:event_buscarNombretxtKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        buscarNombretxt.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cancelarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarButtonActionPerformed
        desactivarTodo();
        limpiarCampos();
    }//GEN-LAST:event_cancelarButtonActionPerformed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        if (evt.getClickCount() == 2 && tabla.getSelectedRow() >= 0) {
            mostrarCliente();
        }
    }//GEN-LAST:event_tablaMouseClicked

    private void tablaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tablaKeyReleased
        if (evt.getKeyCode() == evt.VK_SPACE && tabla.getSelectedRow() >= 0) {
            mostrarCliente();
        }
    }//GEN-LAST:event_tablaKeyReleased

    private void editarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarClienteActionPerformed
        if (modificar == 0) { // Virgen
            activarTodo();
            editarCliente.setText("Guardar Cambios");
            modificar = 1;
        } else if (modificar == 1) { // Modificar
            if (validarDatos()) {
                String nombrex = nombreTxt.getText();
                String rucx = rucTxt.getText();
                String direccionx = direccionTxt.getText();
                String telefonox = telefonoTxt.getText();
                String celularx = celularTxt.getText();

                cliente.setNombre1(nombrex);
                cliente.setRuc(rucx);
                cliente.setDireccion(direccionx);
                cliente.setTelefono(telefonox);
                cliente.setCelular1(celularx);

                int rsp = cliente.update();
                if (rsp == 1) {
                    new rojerusan.RSNotifyFade("¡¡SUCCESS!!", "Cliente Actualizado", 7, RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.SUCCESS).setVisible(true);
                    limpiarCampos();
                } else {
                    new rojerusan.RSNotifyFade("¡¡ERROR!!", "Ha ocurrido algún inconveniente al editar el cliente, contacte con el administrador", 5, RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.ERROR).setVisible(true);
                }

            }
        } else if (modificar == 2) { // Nuevo
            if (validarDatos()) {
                String nombrex = nombreTxt.getText();
                String rucx = rucTxt.getText();
                String direccionx = direccionTxt.getText();
                String telefonox = telefonoTxt.getText();
                String celularx = celularTxt.getText();

                Cliente ctemp = null;

                ctemp = new Cliente().buscarXNombre(nombrex);

                if (ctemp.getID() != 0) {
                    JOptionPane.showMessageDialog(null, "Cliente ya registrado con este nombre");
                } else {
                    ctemp = null;
                    ctemp = new Cliente().buscarXRUC(rucx);

                    if (ctemp.getID() != 0) {
                        JOptionPane.showMessageDialog(null, "Número Ruc registrado previamente");
                    } else {

                        int rsp = new Cliente(
                                nombrex, rucx, telefonox, celularx, "sin cel2", direccionx, 0
                        ).insert();

                        if (rsp == 1) {
                            new rojerusan.RSNotifyFade("¡¡SUCCESS!!", "Cliente Agregado", 7, RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.SUCCESS).setVisible(true);
                            limpiarCampos();
                        }

                    }
                }
            }

        }


    }//GEN-LAST:event_editarClienteActionPerformed

    private void nombreTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreTxtKeyReleased

    }//GEN-LAST:event_nombreTxtKeyReleased

    private void rucTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rucTxtKeyTyped
        new tools().soloNumerosyCantidadDigitos(evt, rucTxt, 10);
    }//GEN-LAST:event_rucTxtKeyTyped

    private void telefonoTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telefonoTxtKeyTyped
        new tools().soloNumerosyCantidadDigitos(evt, telefonoTxt, 8);
    }//GEN-LAST:event_telefonoTxtKeyTyped

    private void celularTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_celularTxtKeyTyped
        new tools().soloNumerosyCantidadDigitos(evt, celularTxt, 8);
    }//GEN-LAST:event_celularTxtKeyTyped

    private void celularTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_celularTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_celularTxtActionPerformed

    private void tablaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tablaKeyTyped

    }//GEN-LAST:event_tablaKeyTyped

    private void nuevoClienteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoClienteButtonActionPerformed
        modificar = 2;
        activarTodo();
        eliminarCliente.setEnabled(false);
        editarCliente.setText("Generar Cliente");
        combo.setEnabled(false);
        agregarConcato.setEnabled(false);
        editarContacto.setEnabled(false);
        eliminarContacto.setEnabled(false);
        buscarNombretxt.setEnabled(false);
        nombreTxt.requestFocus();
    }//GEN-LAST:event_nuevoClienteButtonActionPerformed

    private void agregarConcatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarConcatoActionPerformed
        new editarPersonaContacto(cliente).setVisible(true);
    }//GEN-LAST:event_agregarConcatoActionPerformed

    private void editarContactoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarContactoActionPerformed

        String persona = combo.getSelectedItem().toString();
        new editarPersonaContacto(new PersonaContacto().buscarClientexNombre(cliente.getID(), persona)).setVisible(true);
    }//GEN-LAST:event_editarContactoActionPerformed

    private void eliminarContactoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarContactoActionPerformed
        String persona = combo.getSelectedItem().toString();
        int rsp = JOptionPane.showConfirmDialog(direccionTxt, "¿Desea Eliminar como contacto a: " + persona + " ?", "Borrar Contacto", JOptionPane.OK_CANCEL_OPTION);
        if (rsp == JOptionPane.OK_OPTION) {
            PersonaContacto pC = new PersonaContacto().buscarClientexNombre(cliente.getID(), persona);
            int delete = pC.deleteLogico(1);
            if (delete > 0) {
                new rojerusan.RSNotifyFade("¡¡SUCCESS!!", "Datos Eliminados de " + persona + " con Exito!!", 7, RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.SUCCESS).setVisible(true);
                buscarContacto();
            }
        }
    }//GEN-LAST:event_eliminarContactoActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
      Log log = new Log().buscarNombreCompleto(Main.getVendedor());
      if(log.getNivel()>= 3){
         int rsp = JOptionPane.showConfirmDialog(null, "Desea Verificar todos los Clientes?","Clients Refresh",JOptionPane.OK_CANCEL_OPTION);
         if(rsp == JOptionPane.OK_OPTION){
             new Thread(this::mostrarCarga).start();
             new Thread(this::actualizar).start();
             
         }
      }
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
       jLabel2.setCursor(tabla.getCursor());
       jLabel2.setText("DATOS:");
    }//GEN-LAST:event_jLabel2MouseExited

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
     Log log = new Log().buscarNombreCompleto(Main.getVendedor());
      if(log.getNivel()>= 3){
          jLabel2.setCursor(nuevoClienteButton.getCursor());
          jLabel2.setText("Sincronizar Clientes con Starsoft");
      }
    }//GEN-LAST:event_jLabel2MouseEntered


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private RSMaterialComponent.RSButtonIconShadow agregarConcato;
    private javax.swing.JTextField buscarNombretxt;
    private RSComponentShade.RSButtonRippleShade cancelarButton;
    private javax.swing.JTextField celularTxt;
    private static RSMaterialComponent.RSComboBox combo;
    private javax.swing.JTextArea direccionTxt;
    private RSComponentShade.RSButtonRippleShade editarCliente;
    private RSMaterialComponent.RSButtonIconShadow editarContacto;
    private RSComponentShade.RSButtonRippleShade eliminarCliente;
    private RSMaterialComponent.RSButtonIconShadow eliminarContacto;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField nombreTxt;
    private RSComponentShade.RSButtonRippleShade nuevoClienteButton;
    private javax.swing.JTextField rucTxt;
    private rojerusan.RSTableMetro tabla;
    private javax.swing.JTextField telefonoTxt;
    // End of variables declaration//GEN-END:variables

    private void agregarPlaceHolder() {
        new PlaceHolder("Filtre por Nombre Aqui", buscarNombretxt);
        new PlaceHolder("Razón Social", nombreTxt);
        new PlaceHolder("RUC", rucTxt);
        new PlaceHolder("Telefono", telefonoTxt);
        new PlaceHolder("Celular", celularTxt);
        new PlaceHolder("Dirección del Cliente", direccionTxt);

    }

    private void desactivarTodo() {
        nombreTxt.setEnabled(false);
        rucTxt.setEnabled(false);
        telefonoTxt.setEnabled(false);
        celularTxt.setEnabled(false);
        direccionTxt.setEnabled(false);
        combo.setEnabled(false);
        editarContacto.setEnabled(false);
        eliminarContacto.setEnabled(false);
        editarCliente.setEnabled(false);
        eliminarCliente.setEnabled(false);
        cancelarButton.setEnabled(false);
        nuevoClienteButton.setEnabled(true);
        agregarConcato.setEnabled(false);
        cliente = new Cliente();
    }

    private void activarTodo() {
        agregarConcato.setEnabled(true);
        nombreTxt.setEnabled(true);
        rucTxt.setEnabled(true);
        telefonoTxt.setEnabled(true);
        celularTxt.setEnabled(true);
        direccionTxt.setEnabled(true);
        combo.setEnabled(true);
        editarContacto.setEnabled(true);
        eliminarContacto.setEnabled(true);
        editarCliente.setEnabled(true);
        eliminarCliente.setEnabled(true);
        cancelarButton.setEnabled(true);
        nuevoClienteButton.setEnabled(false);
    }

    private void limpiarCampos() {
        desactivarTodo();
        llenarTabla();
        nombreTxt.setText("");
        rucTxt.setText("");
        celularTxt.setText("");
        telefonoTxt.setText("");
        direccionTxt.setText("");
        combo.removeAllItems();
        //buscarNombretxt.setText("");
        modificar = 0;
        buscarNombretxt.setEnabled(true);
        editarCliente.setText("Modificar");
        buscarNombretxt.requestFocus();
    }

    private void llenarTabla() {
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        vaciarTabla();
        ArrayList<Cliente> lista = (ArrayList) new Cliente().listarClientes();
        for (Cliente c : lista) {
            modelo.addRow(new Object[]{c.getNombre1()});
        }
        if (modelo.getRowCount() < 1) {
            modelo.addRow(new Object[]{"Sin Resultados"});
        }
    }

    private void llenarTabla(String nombre) {
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        vaciarTabla();
        ArrayList<Cliente> lista = (ArrayList) new Cliente().ListarXNombre(nombre);
        for (Cliente c : lista) {
            modelo.addRow(new Object[]{c.getNombre1()});
        }
        if (modelo.getRowCount() < 1) {
            modelo.addRow(new Object[]{"Sin Resultados"});
        }
    }

    private void vaciarTabla() {
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        modelo.setRowCount(0);
    }

    private void mostrarCliente() {
        String nameCliente = tabla.getValueAt(tabla.getSelectedRow(), 0).toString();
        cliente = new Cliente().buscarXNombreExacto(nameCliente);
        nombreTxt.setText(cliente.getNombre1());
        rucTxt.setText(cliente.getRuc());
        celularTxt.setText(cliente.getCelular1());
        telefonoTxt.setText(cliente.getTelefono());
        direccionTxt.setText(cliente.getDireccion());
        buscarContacto();
        buscarNombretxt.setText("");

        activarAcciones();
    }

    public static void buscarContacto() {

        ArrayList<PersonaContacto> listado
                = (ArrayList) new PersonaContacto().listarPersonaContactoxCliente(cliente.getID()).clone();
        combo.removeAllItems();
        for (int i = 0; i < listado.size(); i++) {
            String nombrex = listado.get(i).getNombres() + " " + listado.get(i).getApellidos();
            combo.addItem(nombrex);
        }

        if (combo.getItemCount() < 1) {
            combo.addItem("Sin Persona Agg.");
        }
    }

    private void activarAcciones() {
        editarCliente.setEnabled(true);
        eliminarCliente.setEnabled(true);
        cancelarButton.setEnabled(true);
        //nuevoClienteButton.setEnabled(false);
    }

    private void desactivarAcciones() {
        editarCliente.setEnabled(false);
        eliminarCliente.setEnabled(false);
        cancelarButton.setEnabled(false);
        nuevoClienteButton.setEnabled(true);
    }

    private boolean validarDatos() {
        boolean llave = false;
        if (nombreTxt.getText().length() < 1) {
            JOptionPane.showMessageDialog(direccionTxt, "Razón Social no debe estar Vacio");
        } else {
            if (rucTxt.getText().length() < 1) {
                JOptionPane.showMessageDialog(direccionTxt, "RUC no debe estar Vacio");
            } else {
                if (rucTxt.getText().length() < 11) {
                    JOptionPane.showMessageDialog(direccionTxt, "RUC debe contener al menos 11 digitos");
                } else {
                    if (telefonoTxt.getText().length() < 1) {
                        cliente.setTelefono("sin tlf");
                    }
                    if (celularTxt.getText().length() < 1) {
                        cliente.setCelular1("sin cel1");
                    }
                    if (direccionTxt.getText().length() < 1) {
                        JOptionPane.showMessageDialog(direccionTxt, "Ingrese la Dirección del cliente");
                    } else {
                        llave = true;
                    }
                }
            }
        }

        return llave;
    }

    private void limpiezaSimple() {
        desactivarTodo();
        removerDatos();
    }

    private void removerDatos() {
        nombreTxt.setText("");
        rucTxt.setText("");
        celularTxt.setText("");
        telefonoTxt.setText("");
        direccionTxt.setText("");
        combo.removeAllItems();
        combo.addItem("Esperando Cliente...");
    }
    private void actualizar(){
        new Cliente().reFreshClientes();
        new Thread(this::ocultarCarga).start();
        limpiarCampos();
        JOptionPane.showMessageDialog(direccionTxt, "Actualización de Clientes Terminada!");
    }
    private void mostrarCarga(){
        carga.setVisible(true);
    }
    private void ocultarCarga(){
        carga.setVisible(false);
    }
}
