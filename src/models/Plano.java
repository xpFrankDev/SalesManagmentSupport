
package Clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Plano {
    int id,idCot;
    String ruta;
    
    String sql="";
    PreparedStatement pst;
    ResultSet rs;
    public Plano(){
        
    }
    public Plano(int id){
        this.id = id;
    }
    public Plano(int idCot, String ruta){
        this.idCot = idCot;
        this.ruta = ruta;
    }

    public Plano(int id, int idCot, String ruta) {
        this.id = id;
        this.idCot = idCot;
        this.ruta = ruta;
    }
    

    
        public int insert(){
        int rsp=0;
        
        try(Connection con = new Conectar("rstcot").getCon()) {
            sql ="insert into ArchivosPlano (idCot,ruta) values (?,?)";
            pst = con.prepareStatement(sql);
            pst.setInt(1, idCot);
            pst.setString(2, ruta);
            rsp = pst.executeUpdate();
        } catch (Exception e) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e,  "Error", JOptionPane.ERROR_MESSAGE);
        }finally{
            cerrar();
        }
        
        return rsp;
    }

    public int update(){
        int rsp=0;
        
        try(Connection con = new Conectar("rstcot").getCon()) {
            sql ="update ArchivosPlano set idCot=?, ruta=? where id=?";
            pst = con.prepareStatement(sql);
            pst.setInt(1, idCot);
            pst.setString(2, ruta);
            pst.setInt(3, id);
            rsp = pst.executeUpdate();
        } catch (Exception e) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e,  "Error", JOptionPane.ERROR_MESSAGE);
        }finally{
            cerrar();
        }
        
        return rsp;
    }
    
    
    public int deleteID(){
        int rsp=0;
        
        try(Connection con = new Conectar("rstcot").getCon()) {
            sql ="delete from ArchivosPlano where id=?";
            pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            rsp = pst.executeUpdate();
        } catch (Exception e) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e,  "Error", JOptionPane.ERROR_MESSAGE);
        }finally{
            cerrar();
        }
        
        return rsp;
    }
        public int deleteRuta(){
        int rsp=0;
        
        try(Connection con = new Conectar("rstcot").getCon()) {
            sql ="delete from ArchivosPlano where ruta=?";
            pst = con.prepareStatement(sql);
            pst.setString(1, ruta);
            rsp = pst.executeUpdate();
        } catch (Exception e) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e,  "Error", JOptionPane.ERROR_MESSAGE);
        }finally{
            cerrar();
        }
        
        return rsp;
    }
    
        
     public ArrayList listarxCot(int idCotx){
         ArrayList<Plano> lista = new ArrayList();
         try(Connection con = new Conectar("rstcot").getCon()) {
            sql ="select * archivosPlano where idCot=?";
            pst = con.prepareStatement(sql);
            pst.setInt(1,idCotx);
            rs = pst.executeQuery();
            while(rs.next()){
                lista.add(new Plano(
                        rs.getInt("id"),
                        rs.getInt("idCot"),
                        rs.getString("ruta")
                ));
            }
        } catch (Exception e) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e,  "Error Listando PlanosxCot", JOptionPane.ERROR_MESSAGE);
        }finally{
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

    public int getIdCot() {
        return idCot;
    }

    public void setIdCot(int idCot) {
        this.idCot = idCot;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }
    
    
    
    
    
    
    
    
}
