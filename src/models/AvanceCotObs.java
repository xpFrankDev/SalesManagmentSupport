package Clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class AvanceCotObs {

    int id=0, idAvance=0;
    String sql, tipo, observacion,valor;
    PreparedStatement pst;
    ResultSet rs;
    
    public AvanceCotObs() {

    }

    public AvanceCotObs(int idAvance) {
        this.idAvance = idAvance;
    }

    public AvanceCotObs(int id, int idAvance, String tipo, String observacion,String valor) {
        this.id = id;
        this.idAvance = idAvance;
        this.tipo = tipo;
        this.observacion = observacion;
        this.valor = valor;
    }

    public AvanceCotObs(int idAvance, String tipo, String observacion, String valor) {
        this.idAvance = idAvance;
        this.tipo = tipo;
        this.observacion = observacion;
        this.valor = valor;
    }

    
    public AvanceCotObs buscarObservacion(int idx) {

        int result = 0;
        sql = " select * from avanceCotObs where id=?";
        AvanceCotObs x = new AvanceCotObs();
        try (Connection con = new Conectar("rstcot").getCon()) {
            pst = con.prepareStatement(sql);
            pst.setInt(1,idx);
            rs = pst.executeQuery();
            while(rs.next()){
                id = rs.getInt("id");
                idAvance = rs.getInt("idAvance");
                tipo= rs.getString("tipo");
                observacion = rs.getString("observacion");
                valor = rs.getString("valor");
                x = new AvanceCotObs(id,idAvance,tipo,observacion,valor);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ArchivosCierre.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            cerrar();
        }
        return x;
    }
    public AvanceCotObs buscarAvance(int idAvancex) {

        int result = 0;
        sql = " select * from avanceCotObs where idAvance=?";
        AvanceCotObs x = new AvanceCotObs();
        try (Connection con = new Conectar("rstcot").getCon()) {
            pst = con.prepareStatement(sql);
            pst.setInt(1,idAvancex);
            rs = pst.executeQuery();
            while(rs.next()){
                id = rs.getInt("id");
                idAvance = rs.getInt("idAvance");
                tipo= rs.getString("tipo");
                observacion = rs.getString("observacion");
                 valor = rs.getString("valor");
                x = new AvanceCotObs(id,idAvance,tipo,observacion,valor);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ArchivosCierre.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            cerrar();
        }
        return x;
    }
public ArrayList ListarObs(int idAvancex) {
        ArrayList<AvanceCotObs> lista = new ArrayList();
        sql = " select * from avanceCotObs where idAvance=?";
        try (Connection con = new Conectar("rstcot").getCon()) {
            pst = con.prepareStatement(sql);
            pst.setInt(1,idAvancex);
            rs = pst.executeQuery();
            while(rs.next()){
                id = rs.getInt("id");
                idAvance = rs.getInt("idAvance");
                tipo= rs.getString("tipo");
                observacion = rs.getString("observacion");
                 valor = rs.getString("valor");
                lista.add(new AvanceCotObs(id,idAvance,tipo,observacion,valor));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ArchivosCierre.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            cerrar();
        }
        return lista;
    }
    public int Insert() {

        int result = 0;

        try (Connection con = new Conectar("rstcot").getCon()) {
            sql =" insert into avanceCotObs (idAvance, tipo,observacion,valor) values(?,?,?,?)";
            pst = con.prepareStatement(sql);
            pst.setInt(1,idAvance);
            pst.setString(2,tipo);
            pst.setString(3,observacion);
            pst.setString(4,valor);
            result=pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ArchivosCierre.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            cerrar();
        }
        return result;
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

    public int getIdAvance() {
        return idAvance;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
    
    public void setIdAvance(int idAvance) {
        this.idAvance = idAvance;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    @Override
    public String toString() {
        return "AvanceCotObs{" + "id=" + id + ", idAvance=" + idAvance + ", tipo=" + tipo + ", observacion=" + observacion + ", valor=" + valor + '}';
    }

    

}
