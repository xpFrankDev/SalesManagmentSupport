package Clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class AvanceCot {

    PreparedStatement pst;
    ResultSet rs;

    int id=0, idCot=0;
    String sql, plano, materiales, habilitado, mecanizado, ensamble, soldeo, granallado, pintura, despacho, total;

    public AvanceCot() {

    }

    public AvanceCot(int idCot) {
        this.idCot = idCot;
    }

    public AvanceCot(int id, int idCot, String plano, String materiales, String habilitado, String mecanizado, String ensamble, String soldeo, String granallado, String pintura, String despacho, String total) {
        this.id = id;
        this.idCot = idCot;
        this.plano = plano;
        this.materiales = materiales;
        this.habilitado = habilitado;
        this.mecanizado = mecanizado;
        this.ensamble = ensamble;
        this.soldeo = soldeo;
        this.granallado = granallado;
        this.pintura = pintura;
        this.despacho = despacho;
        this.total = total;
    }

    public int Insert() {
        int result = 0;
        try (Connection con = new Conectar("rstcot").getCon()) {
            sql = " insert into avanceCot (idCot) values (?)";
            pst = con.prepareStatement(sql);
            pst.setInt(1, idCot);
            result = pst.executeUpdate();
        } catch (Exception e) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e, null, 0);
        } finally {
            cerrar();
        }
        return result;
    }

    public int DeleteLogico(int eliminadox) {
        int result = 0;
        try (Connection con = new Conectar("rstcot").getCon()) {
            sql = " update avanceCot set eliminado =? where id=?";
            pst = con.prepareStatement(sql);
            pst.setInt(1, eliminadox);
            pst.setInt(2, idCot);
            result = pst.executeUpdate();
        } catch (Exception e) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e, null, 0);
        } finally {
            cerrar();
        }
        return result;
    }

    public int DeleteTotal() {
        int result = 0;
        try (Connection con = new Conectar("rstcot").getCon()) {
            sql = " delete from  avanceCot where id=?";
            pst = con.prepareStatement(sql);           
            pst.setInt(1, id);
            result = pst.executeUpdate();
        } catch (Exception e) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e, null, 0);
        } finally {
            cerrar();
        }
        return result;
    }

    public int update() {
        int result = 0;
        try (Connection con = new Conectar("rstcot").getCon()) {
            sql = " update avanceCot set "
                    + "plano=?, materiales=?, habilitado=?, "
                    + "mecanizado=?, ensamble=?, soldeo=?, "
                    + "granallado=?, pintura=?, despacho=?, "
                    + "total=? "
                    + "where id=?";
            pst = con.prepareStatement(sql);
            pst.setString(1, plano);
            pst.setString(2, materiales);
            pst.setString(3, habilitado);
            pst.setString(4, mecanizado);
            pst.setString(5, ensamble);
            pst.setString(6, soldeo);
            pst.setString(7, granallado);
            pst.setString(8, pintura);
            pst.setString(9, despacho);
            pst.setString(10, total);
             pst.setInt(11, id);
            result = pst.executeUpdate();
        } catch (Exception e) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e, null, 0);
        } finally {
            cerrar();
        }
        return result;
    }

    public AvanceCot buscarID(int idx) {
        AvanceCot x = new AvanceCot();
        try (Connection con = new Conectar("rstcot").getCon()) {
            sql = " select * from avanceCot where id=? and eliminado=0";
            pst = con.prepareStatement(sql);
            pst.setInt(1, idx);
            rs = pst.executeQuery();

            while (rs.next()) {
                x = new AvanceCot(
                        rs.getInt("id"), rs.getInt("idCot"),
                        rs.getString("plano"), rs.getString("materiales"),
                        rs.getString("habilitado"), rs.getString("mecanizado"),
                        rs.getString("ensamble"), rs.getString("soldeo"),
                        rs.getString("granallado"), rs.getString("pintura"),
                        rs.getString("despacho"), rs.getString("total")
                );
            }
        } catch (Exception e) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e, null, 0);
        } finally {
            cerrar();
        }
        return x;
    }

    public AvanceCot buscarIdCot(int idCotx) {
        AvanceCot x = new AvanceCot();
        try (Connection con = new Conectar("rstcot").getCon()) {
            sql = " select * from avanceCot where idCot=? and eliminado=0";
            pst = con.prepareStatement(sql);
            pst.setInt(1, idCotx);
            rs = pst.executeQuery();
            while (rs.next()) {
                x = new AvanceCot(
                        rs.getInt("id"), rs.getInt("idCot"),
                        rs.getString("plano"), rs.getString("materiales"),
                        rs.getString("habilitado"), rs.getString("mecanizado"),
                        rs.getString("ensamble"), rs.getString("soldeo"),
                        rs.getString("granallado"), rs.getString("pintura"),
                        rs.getString("despacho"), rs.getString("total")
                );
            }
        } catch (Exception e) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e, null, 0);
        } finally {
            cerrar();
        }
        return x;
    }

    public ArrayList getObservaciones(){
        return new AvanceCotObs().ListarObs(id);
    }
    
    
    public ArrayList ListarxCot(int idCotx) {
        ArrayList<AvanceCot> lista = new ArrayList();
        try (Connection con = new Conectar("rstcot").getCon()) {
            sql = " select * from avanceCot where idCot=? and eliminado=0";
            pst = con.prepareStatement(sql);
            pst.setInt(1, idCotx);
            rs = pst.executeQuery();
            while (rs.next()) {
                lista.add(new AvanceCot(
                        rs.getInt("id"), rs.getInt("idCot"),
                        rs.getString("plano"), rs.getString("materiales"),
                        rs.getString("habilitado"), rs.getString("mecanizado"),
                        rs.getString("ensamble"), rs.getString("soldeo"),
                        rs.getString("granallado"), rs.getString("pintura"),
                        rs.getString("despacho"), rs.getString("total")
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

    @Override
    public String toString() {
        return "AvanceCot{" + "id=" + id + ", idCot=" + idCot + ", plano=" + plano + ", materiales=" + materiales + ", habilitado=" + habilitado + ", mecanizado=" + mecanizado + ", ensamble=" + ensamble + ", soldeo=" + soldeo + ", granallado=" + granallado + ", pintura=" + pintura + ", despacho=" + despacho + ", total=" + total + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdCot() {
        return idCot;
    }

    public void setIdCot(int idCot) {
        this.idCot = idCot;
    }

    public String getPlano() {
        return plano;
    }

    public void setPlano(String plano) {
        this.plano = plano;
    }

    public String getMateriales() {
        return materiales;
    }

    public void setMateriales(String materiales) {
        this.materiales = materiales;
    }

    public String getHabilitado() {
        return habilitado;
    }

    public void setHabilitado(String habilitado) {
        this.habilitado = habilitado;
    }

    public String getMecanizado() {
        return mecanizado;
    }

    public void setMecanizado(String mecanizado) {
        this.mecanizado = mecanizado;
    }

    public String getEnsamble() {
        return ensamble;
    }

    public void setEnsamble(String ensamble) {
        this.ensamble = ensamble;
    }

    public String getSoldeo() {
        return soldeo;
    }

    public void setSoldeo(String soldeo) {
        this.soldeo = soldeo;
    }

    public String getGranallado() {
        return granallado;
    }

    public void setGranallado(String granallado) {
        this.granallado = granallado;
    }

    public String getPintura() {
        return pintura;
    }

    public void setPintura(String pintura) {
        this.pintura = pintura;
    }

    public String getDespacho() {
        return despacho;
    }

    public void setDespacho(String despacho) {
        this.despacho = despacho;
    }

    public String getTotal() {
        return total;
    }

    public Cotizacion getCotizacion(){
        return idCot==0?null:new Cotizacion().buscarID(idCot);
    }
    public void setTotal(String total) {
        this.total = total;
    }

}
