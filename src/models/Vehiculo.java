package Clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Vehiculo {

    int id, eliminado = 0;
    String marca, modelo, placa, apodo, estado = "Activo";

    String sql = "";
    PreparedStatement pst;
    ResultSet rs;

    public Vehiculo() {
    }

    public Vehiculo(int id) {
        this.id = id;
        buscarID();
    }

    public Vehiculo(String marca, String modelo, String placa, String apodo) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.apodo = apodo;
    }

    public Vehiculo(int id, String marca, String modelo, String placa, String apodo, String estado, int eliminado) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.apodo = apodo;
        this.estado = estado;
        this.eliminado = eliminado;
    }

    public Vehiculo buscarID() {
        try (Connection con = new Conectar("rstcot").getCon()) {
            sql = "select * from vehiculo where id=?";
            pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            rs = pst.executeQuery();
            while (rs.next()) {
                this.id = rs.getInt("id");
                this.marca = rs.getString("marca");
                this.modelo = rs.getString("modelo");
                this.placa = rs.getString("placa");
                this.apodo = rs.getString("apodo");
                this.estado = rs.getString("estado");
                this.eliminado = rs.getInt("eliminado");
            }
        } catch (Exception e) {
            Logger.getLogger(Vehiculo.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e, null, 0);
        } finally {
            cerrar();
        }
        return this;
    }

    public Vehiculo buscarID(int idx) {
        try (Connection con = new Conectar("rstcot").getCon()) {
            sql = "select * from vehiculo where id=?";
            pst = con.prepareStatement(sql);
            pst.setInt(1, idx);
            rs = pst.executeQuery();
            while (rs.next()) {
                this.id = rs.getInt("id");
                this.marca = rs.getString("marca");
                this.modelo = rs.getString("modelo");
                this.placa = rs.getString("placa");
                this.apodo = rs.getString("apodo");
                this.estado = rs.getString("estado");
                this.eliminado = rs.getInt("eliminado");
            }
        } catch (Exception e) {
            Logger.getLogger(Vehiculo.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e, null, 0);
        } finally {
            cerrar();
        }
        return this;
    }

    public int insert() {
        int rsp = 0;
        try (Connection con = new Conectar("rstcot").getCon()) {
            sql = "insert into vehiculo (marca,modelo,placa,apodo,estado,eliminado) values (?,?,?,?,?,?)";
            pst = con.prepareStatement(sql);
            pst.setString(1, marca);
            pst.setString(2, modelo);
            pst.setString(3, placa);
            pst.setString(4, apodo);
            pst.setString(5, estado);
            pst.setInt(6, eliminado);
            rsp = pst.executeUpdate();
        } catch (Exception e) {
            Logger.getLogger(Vehiculo.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e, null, 0);
        } finally {
            cerrar();
        }
        return rsp;
    }

    public int update() {
        int rsp = 0;
        try (Connection con = new Conectar("rstcot").getCon()) {
            sql = "update vehiculo set marca=?, modelo=?, placa=?, apodo=? where id=?";
            pst = con.prepareStatement(sql);
            pst.setString(1, marca);
            pst.setString(2, modelo);
            pst.setString(3, placa);
            pst.setString(4, apodo);
            pst.setInt(5, id);
            rsp = pst.executeUpdate();
            pst.close();
        } catch (Exception e) {
            Logger.getLogger(Vehiculo.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e, null, 0);
        }
        return rsp;
    }

    public int deleteLogico() {
        int rsp = 0;
        try (Connection con = new Conectar("rstcot").getCon()) {
            sql = "update vehiculo eliminado=? where id=?";
            pst = con.prepareStatement(sql);
            pst.setInt(1, eliminado);
            pst.setInt(2, id);
            rsp = pst.executeUpdate();
        } catch (Exception e) {
            Logger.getLogger(Vehiculo.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e, null, 0);
        } finally {
            cerrar();
        }
        return rsp;
    }

    public int deleteLogico(int eliminadox) {
        int rsp = 0;
        try (Connection con = new Conectar("rstcot").getCon()) {
            sql = "update vehiculo eliminado=? where id=?";
            pst = con.prepareStatement(sql);
            pst.setInt(1, eliminadox);
            pst.setInt(2, id);
            rsp = pst.executeUpdate();
        } catch (Exception e) {
            Logger.getLogger(Vehiculo.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e, null, 0);
        } finally {
            cerrar();
        }
        return rsp;
    }

    public int cambiarEstado() {
        int rsp = 0;
        try (Connection con = new Conectar("rstcot").getCon()) {
            sql = "update vehiculo estado=? where id=?";
            pst = con.prepareStatement(sql);
            pst.setString(1, estado);
            pst.setInt(2, id);
            rsp = pst.executeUpdate();
        } catch (Exception e) {
            Logger.getLogger(Vehiculo.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e, null, 0);
        } finally {
            cerrar();
        }
        return rsp;
    }

    public int cambiarEstado(String estadox) {
        int rsp = 0;
        try (Connection con = new Conectar("rstcot").getCon()) {
            sql = "update vehiculo estado=? where id=?";
            pst = con.prepareStatement(sql);
            pst.setString(1, estadox);
            pst.setInt(2, id);
            rsp = pst.executeUpdate();
        } catch (Exception e) {
            Logger.getLogger(Vehiculo.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e, null, 0);
        } finally {
            cerrar();
        }
        return rsp;
    }

    public ArrayList listarGeneral() {
        ArrayList<Vehiculo> lista = new ArrayList();
        try (Connection con = new Conectar("rstcot").getCon()) {
            sql = "select * from vehiculo  where eliminado=0 and estado='Activo'";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                lista.add(new Vehiculo(
                        rs.getInt("id"), rs.getString("marca"), rs.getString("modelo"),
                        rs.getString("placa"), rs.getString("apodo"),
                        rs.getString("estado"), rs.getInt("eliminado")
                ));
            }
        } catch (Exception e) {
            Logger.getLogger(Chofer.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e, null, 0);
        } finally {
            cerrar();
        }
        return lista;
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
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEliminado() {
        return eliminado;
    }

    public void setEliminado(int eliminado) {
        this.eliminado = eliminado;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "id=" + id + ", eliminado=" + eliminado + ", marca=" + marca + ", modelo=" + modelo + ", placa=" + placa + ", apodo=" + apodo + ", estado=" + estado + '}';
    }

}
