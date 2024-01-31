/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import RSMaterialComponent.RSTableMetro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CondicionUsuario {

    DefaultTableModel modelo;
    RSTableMetro tabla;
    String dniUsuario;
    String afeccion;
    String tipoAfeccion;
    PreparedStatement pst;
    ResultSet rs;

    public CondicionUsuario(RSTableMetro tabla, String idUsuario) {
        this.tabla = tabla;
        this.dniUsuario = idUsuario;
        System.out.println("Dni recibido Condición: " + idUsuario);
    }

    public int insertCondicion() {
        int valor = 0;
        modelo = (DefaultTableModel) tabla.getModel();
        try (Connection conex = new Conectar("rstcot").getCon()) {

            deleteCondicion();
            String sql = "insert into condicionusuario (dniUsuario,afeccion,tipoAfeccion) "
                    + "values (?,?,?)";
            pst = conex.prepareStatement(sql);
            System.out.println("Cantidad filas Condicion: " + modelo.getRowCount());
            for (int i = 0; i < modelo.getRowCount(); i++) {

                pst.setString(1, this.dniUsuario);
                pst.setString(2, tabla.getValueAt(i, 0).toString());
                pst.setString(3, tabla.getValueAt(i, 1).toString());
                valor = pst.executeUpdate();
                System.out.println("agregado condicion" + i + 1);

            }

        } catch (Exception e) {
            Logger.getLogger(CondicionUsuario.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e);
        } finally {
            cerrar();
        }
        return valor;
    }

    private int deleteCondicion() {
        int valor = 0;
        try (Connection conex = new Conectar("rstcot").getCon()) {

            String sql = "select * from condicionusuario where dniUsuario='" + this.dniUsuario + "'";
            pst = conex.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("idcondicionUsuario");
                borrarId(id);
            }
        } catch (Exception e) {
            Logger.getLogger(CondicionUsuario.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e);
        } finally {
            cerrar();
        }
        return valor;
    }

    private void borrarId(int id) {

        try (Connection conex = new Conectar("rstcot").getCon()) {

            String sql = "delete from condicionusuario where idcondicionusuario =?";
            pst = conex.prepareStatement(sql);
            pst.setInt(1, id);
            pst.executeUpdate();
        } catch (Exception e) {
            Logger.getLogger(CondicionUsuario.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e);
        } finally {
            cerrar();
        }
    }

    public void cargarCondicion(RSTableMetro tabla2) {

        try (Connection conex = new Conectar("rstcot").getCon()) {

            String sql = "select * from condicionusuario where dniUsuario='" + this.dniUsuario + "'";
            pst = conex.prepareStatement(sql);
            rs = pst.executeQuery();
            modelo = (DefaultTableModel) tabla2.getModel();
            modelo.setRowCount(0);
            while (rs.next()) {
                modelo.addRow(new Object[]{rs.getString("afeccion"), rs.getString("tipoAfeccion")});
            }

        } catch (Exception e) {
            Logger.getLogger(CondicionUsuario.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e);
        } finally {
            cerrar();
        }
    }

    private void cerrar() {
        try {
            if (pst != null) {
                pst.close();
            }
            if (rs != null) {
                rs.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(ArchivosCierre.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public String getDniUsuario() {
        return dniUsuario;
    }

    public void setDniUsuario(String dniUsuario) {
        this.dniUsuario = dniUsuario;
    }

    public String getAfeccion() {
        return afeccion;
    }

    public void setAfeccion(String afeccion) {
        this.afeccion = afeccion;
    }

    public String getTipoAfeccion() {
        return tipoAfeccion;
    }

    public void setTipoAfeccion(String tipoAfeccion) {
        this.tipoAfeccion = tipoAfeccion;
    }

}
