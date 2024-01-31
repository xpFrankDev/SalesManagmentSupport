package Clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ArchivosCierre {

    int id;
    int idCotizacion;
    String ruta;

    String sql = "";
    PreparedStatement pst;
    ResultSet rs;

    public ArchivosCierre() {

    }

    public ArchivosCierre(int idCot) {
        this.idCotizacion = idCot;
    }

    public ArchivosCierre(String ruta) {
        this.ruta = ruta;
    }

    public ArchivosCierre(int idCot, String ruta) {
        this.idCotizacion = idCot;
        this.ruta = ruta;
    }

    public ArchivosCierre(int id, int idPresupuesto, String ruta) {
        this.idCotizacion = idPresupuesto;
        this.ruta = ruta;
    }

    public int insert() {
        int rsp = 0;

        try (Connection con = new Conectar("rstcot").getCon()) {
            sql = "insert into ArchivosCierre (idCot,ruta) values (?,?)";
            pst = con.prepareStatement(sql);
            pst.setInt(1, idCotizacion);
            pst.setString(2, ruta);
            rsp = pst.executeUpdate();
        } catch (Exception e) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);

        }finally{
            cerrar();
        }

        return rsp;
    }

    public int update() {
        int rsp = 0;

        try (Connection con = new Conectar("rstcot").getCon()) {
            sql = "update ArchivosCierre set idCot=?, ruta=? where id=?";
            pst = con.prepareStatement(sql);
            pst.setInt(1, idCotizacion);
            pst.setString(2, ruta);
            pst.setInt(3, id);
            rsp = pst.executeUpdate();
        } catch (Exception e) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
        }finally{
            cerrar();
        }

        return rsp;
    }

    public int deleteID() {
        int rsp = 0;

        try (Connection con = new Conectar("rstcot").getCon()) {
            sql = "delete from ArchivosCierre where id=?";
            pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            rsp = pst.executeUpdate();
        } catch (Exception e) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
        }finally{
            cerrar();
        }

        return rsp;
    }

    public int deleteRuta() {
        int rsp = 0;

        try (Connection con = new Conectar("rstcot").getCon()) {
            sql = "delete from ArchivosCierre where ruta=?";
            pst = con.prepareStatement(sql);
            pst.setString(1, ruta);
            rsp = pst.executeUpdate();
        } catch (Exception e) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
        }finally{
            cerrar();
        }

        return rsp;
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

    public int getIdPresupuesto() {
        return idCotizacion;
    }

    public void setIdPresupuesto(int idPresupuesto) {
        this.idCotizacion = idPresupuesto;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

}
