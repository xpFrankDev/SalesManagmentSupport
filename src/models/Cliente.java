/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Cliente {

    int idCliente = 0;
    String nombre1;
    //String nombre2;
    String ruc;
    String telefono;
    String celular1;
    String celular2;
    String direccion;
    int eliminado = 0;

    PreparedStatement pst;
    ResultSet rs;
    Conectar c;
    String sql;

    public Cliente() {
    }

    /*public int Cliente(int idCliente) {
        this.idCliente = idCliente;
        int resultado = buscarId();
        return resultado;
    }*/
    public Cliente(String nombre1, String ruc, String telefono, String celular1, String celular2, String direccion, int eliminado) {
        this.nombre1 = nombre1;
        this.ruc = ruc;
        this.telefono = telefono;
        this.celular1 = celular1;
        this.celular2 = celular2;
        this.direccion = direccion;
        this.eliminado = eliminado;
    }

    public Cliente(int idCliente, String nombre1, String ruc, String telefono, String celular1, String celular2, String direccion, int eliminado) {
        this.idCliente = idCliente;
        this.nombre1 = nombre1;
        this.ruc = ruc;
        this.telefono = telefono;
        this.celular1 = celular1;
        this.celular2 = celular2;
        this.direccion = direccion;
        this.eliminado = eliminado;
    }

    public int Cliente(String texto) {
        int resultado = buscarNombre(texto);
        return resultado;
    }

    public int buscarId() {
        int resultado = 0;

        try (Connection conex = new Conectar("rstcot").getCon()) {

            sql = "select * from cliente where id=?";
            pst = conex.prepareStatement(sql);
            pst.setInt(1, idCliente);
            rs = pst.executeQuery();
            while (rs.next()) {
                this.nombre1 = rs.getString("nombre1");
                this.ruc = rs.getString("ruc");
                this.telefono = rs.getString("telefono");
                this.celular1 = rs.getString("celular1");
                this.celular2 = rs.getString("celular2");
                this.direccion = rs.getString("direccion");
                resultado = 1;
            }
        } catch (Exception e) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e, null, 0);
        } finally {
            cerrar();
        }

        return resultado;
    }

    public Cliente buscarId(int idx) {

        try (Connection conex = new Conectar("rstcot").getCon()) {

            sql = "select * from cliente where id=?";
            pst = conex.prepareStatement(sql);
            pst.setInt(1, idx);
            rs = pst.executeQuery();
            while (rs.next()) {
                this.idCliente = rs.getInt("id");
                this.nombre1 = rs.getString("nombre1");
                this.ruc = rs.getString("ruc");
                this.telefono = rs.getString("telefono");
                this.celular1 = rs.getString("celular1");
                this.celular2 = rs.getString("celular2");
                this.direccion = rs.getString("direccion");
            }
        } catch (Exception e) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e, null, 0);
        } finally {
            cerrar();
        }

        return this;
    }

    public int buscarNombre(String texto) {
        int resultado = 0;

        try (Connection conex = new Conectar("rstcot").getCon()) {
            sql = "select * from cliente where "
                    + "nombre1 = ?";

            pst = conex.prepareStatement(sql);
            pst.setString(1, texto);
            rs = pst.executeQuery();
            while (rs.next()) {
                resultado = rs.getInt("id");
                this.idCliente = resultado;
                this.nombre1 = rs.getString("nombre1");
                this.ruc = rs.getString("ruc");
                this.telefono = rs.getString("telefono");
                this.celular1 = rs.getString("celular1");
                this.celular2 = rs.getString("celular2");
                this.direccion = rs.getString("direccion");
                this.eliminado = rs.getInt("eliminado");
            }
        } catch (Exception e) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e, null, 0);
        } finally {
            cerrar();
        }

        return resultado;
    }

    public Cliente buscarXNombreExacto(String texto) {

        try (Connection conex = new Conectar("rstcot").getCon()) {

            sql = "select * from cliente where "
                    + "nombre1 ='" + texto + "'";

            pst = conex.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                this.idCliente = rs.getInt("id");
                this.nombre1 = rs.getString("nombre1");
                this.ruc = rs.getString("ruc");
                this.telefono = rs.getString("telefono");
                this.celular1 = rs.getString("celular1");
                this.celular2 = rs.getString("celular2");
                this.direccion = rs.getString("direccion");
                this.eliminado = rs.getInt("eliminado");
            }
            cerrar();
        } catch (Exception e) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e, null, 0);
        } finally {
            cerrar();
        }

        return this;
    }

    public Cliente buscarXNombre(String texto) {

        try (Connection conex = new Conectar("rstcot").getCon()) {

            sql = "select * from cliente where "
                    + "lower (nombre1) like lower ('%" + texto + "%')";

            pst = conex.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                this.idCliente = rs.getInt("id");
                this.nombre1 = rs.getString("nombre1");
                this.ruc = rs.getString("ruc");
                this.telefono = rs.getString("telefono");
                this.celular1 = rs.getString("celular1");
                this.celular2 = rs.getString("celular2");
                this.direccion = rs.getString("direccion");
                this.eliminado = rs.getInt("eliminado");
            }
        } catch (Exception e) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e, null, 0);
        } finally {
            cerrar();
        }

        return this;
    }

    public void reFreshClientes() {
        try (Connection conex = new ConectarSQL("005BDCOMUN").getCon()) {

            sql = "select ccodcli, cnomcli,cdircli from maecli where "
                    + " ccodcli != '00000000' and ccodcli != '00000000000' and ccodcli != '00000000001'";
            pst = conex.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                String rucz = rs.getString("ccodcli").replace(" ", "");
                String nombrez = rs.getString("cnomcli");
                String direccionz = rs.getString("cdircli");
                Cliente ctemp = new Cliente().buscarXRUC(rucz);
                if (ctemp.getID() < 1) {
                    new Cliente(nombrez, rucz, null, null, null, direccionz, 0).insert();
                }
            }

        } catch (Exception e) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e, null, 0);
        } finally {
            cerrar();
        }

    }

    public ArrayList ListarXNombre(String texto) {

        ArrayList<Cliente> temp = new ArrayList();
        try (Connection conex = new Conectar("rstcot").getCon()) {

            sql = "select * from cliente where "
                    + "lower (nombre1) like lower ('%" + texto + "%')"
                    + " or lower (ruc) like lower ('%" + texto + "%') and eliminado =0 order by nombre1 asc";

            pst = conex.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                temp.add(new Cliente(
                        rs.getInt("id"), rs.getString("nombre1"), rs.getString("ruc"),
                        rs.getString("telefono"), rs.getString("celular1"), rs.getString("celular2"),
                        rs.getString("direccion"), rs.getInt("eliminado")
                ));

            }
        } catch (Exception e) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e, null, 0);
        } finally {
            cerrar();
        }

        return temp;
    }

    public Cliente buscarXRUC(String texto) {

        try (Connection conex = new Conectar("rstcot").getCon()) {

            sql = "select * from cliente where "
                    + "ruc =? order by nombre1 asc";

            pst = conex.prepareStatement(sql);
            pst.setString(1, texto);
            rs = pst.executeQuery();
            while (rs.next()) {
                this.idCliente = rs.getInt("id");
                this.nombre1 = rs.getString("nombre1");
                this.ruc = rs.getString("ruc");
                this.telefono = rs.getString("telefono");
                this.celular1 = rs.getString("celular1");
                this.celular2 = rs.getString("celular2");
                this.direccion = rs.getString("direccion");
                this.eliminado = rs.getInt("eliminado");
            }

            cerrar();

        } catch (Exception e) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e, null, 0);
        } finally {
            cerrar();
        }

        return this;
    }

    public int insert() {
        int resultado = 0;

        try (Connection conex = new Conectar("rstcot").getCon()) {

            sql = "insert into cliente (nombre1,ruc,telefono,celular1,celular2,direccion) values "
                    + "(?,?,?,?,?,?)";
            pst = conex.prepareStatement(sql);
            pst.setString(1, nombre1);
            pst.setString(2, ruc);
            pst.setString(3, telefono == null ? "sin Tlf" : telefono);
            pst.setString(4, celular1 == null ? "sin cel 1" : celular1);
            pst.setString(5, celular2 == null ? "sin cel 2" : celular2);
            pst.setString(6, direccion == null ? "sin direc" : direccion);
            pst.executeUpdate();
            resultado = 1;
        } catch (Exception e) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e, null, 0);
            resultado = 0;
        } finally {
            cerrar();
        }

        return resultado;
    }

    public int update() {
        int resultado = 0;

        try (Connection conex = new Conectar("rstcot").getCon()) {

            sql = "update cliente set nombre1=?, ruc=?, telefono=?, celular1=?, celular2=?, direccion=? where id=?";
            pst = conex.prepareStatement(sql);
            pst.setString(1, nombre1);
            pst.setString(2, ruc);
            pst.setString(3, telefono);
            pst.setString(4, celular1);
            pst.setString(5, celular2);
            pst.setString(6, direccion);
            pst.setInt(7, idCliente);
            resultado = pst.executeUpdate();

        } catch (Exception e) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e, null, 0);
        } finally {
            cerrar();
        }

        return resultado;
    }

    public ArrayList listarClientes() {
        ArrayList<Cliente> lista = new ArrayList();

        try (Connection conex = new Conectar("rstcot").getCon()) {

            sql = "select * from cliente  where eliminado =0 order by nombre1 asc";
            pst = conex.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                lista.add(new Cliente(
                        id,
                        rs.getString("nombre1"),
                        rs.getString("ruc"), rs.getString("telefono"),
                        rs.getString("celular1"), rs.getString("celular2"),
                        rs.getString("direccion"), rs.getInt("eliminado")
                ));
            }
        } catch (Exception e) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e, null, 0);
        } finally {
            cerrar();
        }

        return lista;
    }

    public int deleteClienteLogico(int eliminadox) {
        int resultado = 0;

        try (Connection conex = new Conectar("rstcot").getCon()) {
            try {
                sql = "update cliente set eliminado=? where id=?";
                pst = conex.prepareStatement(sql);
                pst.setInt(1, eliminadox);
                pst.setInt(2, idCliente);
                resultado = pst.executeUpdate();
            } catch (Exception e) {
                Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, e);
                JOptionPane.showMessageDialog(null, e, null, 0);
            }
        } catch (Exception e) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e, null, 0);
        } finally {
            cerrar();
        }

        return resultado;
    }

    public int deleteClienteTotal() {
        int resultado = 0;

        try (Connection conex = new Conectar("rstcot").getCon()) {
            try {
                sql = "delete from cliente where id=?";
                pst = conex.prepareStatement(sql);
                pst.setInt(1, idCliente);
                resultado = pst.executeUpdate();
            } catch (Exception e) {
                Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, e);
                JOptionPane.showMessageDialog(null, e, null, 0);
            }
        } catch (Exception e) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e, null, 0);
        } finally {
            cerrar();
        }
        return resultado;
    }

    public String conc(String[] a) {
        String unido = "";
        for (int i = 0; i < a.length; i++) {
            unido += a[i] + " ";
        }
        return unido;
    }

    public boolean ComprobarNumeros(String clave) {
        String numeros[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        boolean correcto = false;
        int temp = 0;

        for (int j = 0; j < clave.length(); j++) {

            for (int i = 0; i < numeros.length; i++) {
                //if (clave.contains(numeros[i]))
                String tempx = String.valueOf(clave.charAt(j));
                if (tempx.contains((numeros[i]))) {
                    temp++;
                    break;
                }
            }
            if (temp == clave.length()) {
                correcto = true;
            }
        }

        if (correcto == false) {
            System.out.println("La contraseña no Tiene un Número");
        }

        return correcto;
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

    public int getID() {
        return idCliente;
    }

    public void setID(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre1() {
        return nombre1;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCelular1() {
        return celular1;
    }

    public void setCelular1(String celular1) {
        this.celular1 = celular1;
    }

    public String getCelular2() {
        return celular2;
    }

    public void setCelular2(String celular2) {
        this.celular2 = celular2;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Cliente{" + "idCliente=" + idCliente + ", nombre1=" + nombre1 + ", ruc=" + ruc + ", telefono=" + telefono + ", celular1=" + celular1 + ", celular2=" + celular2 + ", direccion=" + direccion + ", eliminado=" + eliminado + '}';
    }

}
