
package Clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Ganancia {
    
    int id,idCot,eliminado=0;
    Double precioCot,precioOc=0.0,costoProduccion=0.0,margen =0.0,despachado=0.0;
    String  sql="",estado="Normal";

    PreparedStatement pst;
    ResultSet rs;
    public Ganancia() {
    }

    public Ganancia(int id) {
        this.id = id;
    }

    public Ganancia(int id, int idCot) {
        this.id = id;
        this.idCot = idCot;
    }

    public Ganancia(int idCot, Double precioCot, Double precioOc, Double costoProduccion, Double margen) {
        this.idCot = idCot;
        this.precioCot = precioCot;
        this.precioOc = precioOc;
        this.costoProduccion = costoProduccion;
        this.margen = margen;
    }

    public Ganancia(int id, int idCot, Double precioCot, Double precioOc, Double costoProduccion, Double margen,String estado, int eliminado) {
        this.id = id;
        this.idCot = idCot;
        this.precioCot = precioCot;
        this.precioOc = precioOc;
        this.costoProduccion = costoProduccion;
        this.margen = margen;
        this.estado=estado;
        this.eliminado = eliminado;
    }

    public Ganancia(int idCot, Double precioCot) {
        this.idCot = idCot;
        this.precioCot = precioCot;
    }

    

    
    
    
    public int insert(){
        int result = 0;
        
        try(Connection con = new Conectar("rstcot").getCon()) {
            sql ="insert into ganancia (idCot,precioCot) values (?,?)";
            pst = con.prepareStatement(sql);
            pst.setInt(1, idCot);
            pst.setDouble(2, precioCot); 
            result = pst.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            Logger.getLogger(Ganancia.class.getName()).log(Level.SEVERE, null, e);
        }finally{
            cerrar();
        }
        
        return result;
    }
    
    
     public int update(){
        int result = 0;
        
        try(Connection con = new Conectar("rstcot").getCon()) {
            sql ="update ganancia set idCot=?, precioCot=?,precioOc=?,costoProduccion=?,margen=?,estado=?, eliminado=? where id=?";
            pst = con.prepareStatement(sql);
            pst.setInt(1, idCot);
            pst.setDouble(2, precioCot);
            pst.setDouble(3, precioOc);
            pst.setDouble(4, costoProduccion);
            pst.setDouble(5,margen);
            pst.setString(6,estado);
            pst.setInt(7,eliminado);
            pst.setInt(8, id);
            result = pst.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            Logger.getLogger(Ganancia.class.getName()).log(Level.SEVERE, null, e);
        }finally{
            cerrar();
        }
        
        return result;
    }
     public int updateMontoDespachado(Double xxx){
        int result = 0;
        
        try(Connection con = new Conectar("rstcot").getCon()) {
            sql ="update ganancia set despachado=? where id=?";
            pst = con.prepareStatement(sql);
            pst.setDouble(1, xxx);
            pst.setInt(2, id);
            
            result = pst.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            Logger.getLogger(Ganancia.class.getName()).log(Level.SEVERE, null, e);
        }finally{
            cerrar();
        }
        
        return result;
    }
    
    public int deleteLogico(){
        int result = 0;
        
        try(Connection con = new Conectar("rstcot").getCon()) {
            sql ="update ganancia set eliminado=? where id=?";
            pst = con.prepareStatement(sql);
            pst.setInt(1, eliminado);
            pst.setInt(2, id);
            result = pst.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            Logger.getLogger(Ganancia.class.getName()).log(Level.SEVERE, null, e);
        }finally{
            cerrar();
        }
        
        return result;
    }
    
    public int deleteTotal(){
        int result = 0;
        
        try(Connection con = new Conectar("rstcot").getCon()) {
            sql="delete from ganancia where id=?";
            pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            result = pst.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            Logger.getLogger(Ganancia.class.getName()).log(Level.SEVERE, null, e);
        }finally{
            cerrar();
        }
        
        return result;
    }
    
    public ArrayList listarxCot(int idCotx){
        ArrayList<Ganancia> lista = new ArrayList();
        
        try(Connection con = new Conectar("rstcot").getCon()) {
            sql="select * from ganancia where idCot=?";
            pst = con.prepareStatement(sql);
            pst.setInt(1,idCotx);
            rs = pst.executeQuery();
            while(rs.next()){
                lista.add(new Ganancia(
                rs.getInt("id"),rs.getInt("idCot"),
                        rs.getDouble("precioCot"),rs.getDouble("precioOc"),
                        rs.getDouble("costoProduccion"),rs.getDouble("margen"),
                        rs.getString("estado"),rs.getInt("eliminado")
                ));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            Logger.getLogger(Ganancia.class.getName()).log(Level.SEVERE, null, e);
        }finally{
            cerrar();
        }
        
        return lista;
    }
    
    public ArrayList listarxEstado(String estadox){
        ArrayList<Ganancia> lista = new ArrayList();
        
        try(Connection con = new Conectar("rstcot").getCon()) {
            sql="select * from ganancia where estado=?";
            pst = con.prepareStatement(sql);
            pst.setString(1,estadox);
            rs = pst.executeQuery();
            while(rs.next()){
                lista.add(new Ganancia(
                rs.getInt("id"),rs.getInt("idCot"),
                        rs.getDouble("precioCot"),rs.getDouble("precioOc"),
                        rs.getDouble("costoProduccion"),rs.getDouble("margen"),
                        rs.getString("estado"),rs.getInt("eliminado")
                ));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            Logger.getLogger(Ganancia.class.getName()).log(Level.SEVERE, null, e);
        }finally{
            cerrar();
        }
        
        return lista;
    }
       public ArrayList listarxEliminado(int eliminadox){
        ArrayList<Ganancia> lista = new ArrayList();
        
        try(Connection con = new Conectar("rstcot").getCon()) {
            sql="select * from ganancia where eliminado=?";
            pst = con.prepareStatement(sql);
            pst.setInt(1,eliminadox);
            rs = pst.executeQuery();
            while(rs.next()){
                lista.add(new Ganancia(
                rs.getInt("id"),rs.getInt("idCot"),
                        rs.getDouble("precioCot"),rs.getDouble("precioOc"),
                        rs.getDouble("costoProduccion"),rs.getDouble("margen"),
                        rs.getString("estado"),rs.getInt("eliminado")
                ));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            Logger.getLogger(Ganancia.class.getName()).log(Level.SEVERE, null, e);
        }finally{
            cerrar();
        }
        
        return lista;
    }
    
       
        public Ganancia buscarxCot(int idCotx){
         
        try(Connection con = new Conectar("rstcot").getCon()) {
           sql ="select * from ganancia where idCot=?";
           pst= con.prepareStatement(sql);
           pst.setInt(1,idCotx);
           rs = pst.executeQuery();
           while(rs.next()){
               this.id = rs.getInt("id");
               this.idCot = rs.getInt("idCot");
               this.precioCot = rs.getDouble("precioCot");
               this.precioOc=rs.getDouble("precioOC");
               this.costoProduccion = rs.getDouble("costoProduccion");
               this.margen = rs.getDouble("margen");
               this.despachado = rs.getDouble("despachado");
           }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            Logger.getLogger(Ganancia.class.getName()).log(Level.SEVERE, null, e);
        }finally{
            cerrar();
        }
        return this;
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

    public int getEliminado() {
        return eliminado;
    }

    public void setEliminado(int eliminado) {
        this.eliminado = eliminado;
    }

    public Double getDespachado() {
        return despachado;
    }

    public void setDespachado(Double despachado) {
        this.despachado = despachado;
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

    public Double getPrecioCot() {
        return precioCot;
    }

    public void setPrecioCot(Double precioCot) {
        this.precioCot = precioCot;
    }

    public Double getPrecioOc() {
        return precioOc;
    }

    public void setPrecioOc(Double precioOc) {
        this.precioOc = precioOc;
    }

    public Double getCostoProduccion() {
        return costoProduccion;
    }

    public void setCostoProduccion(Double costoProduccion) {
        this.costoProduccion = costoProduccion;
    }

    public Double getMargen() {
        return margen;
    }

    public void setMargen(Double margen) {
        this.margen = margen;
    }

    
    
    
    
    
    
    
}
