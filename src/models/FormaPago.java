
package Clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class FormaPago {
    
    
    int id;
    String nombre,sql;
    
    PreparedStatement pst;
    ResultSet rs;
    
    
    public FormaPago(){
        
    }
    public FormaPago(String Nombre){
        this.nombre=Nombre;
    }
    public FormaPago(int id,String Nombre){
        this.id=id;
        this.nombre=Nombre;
        
    }
    
    
    public int buscarID(int idx){
        int rsp = 0;
        
        sql =" select * from formapago where id=?";
         try(Connection con = new Conectar("rstcot").getCon()) {
             
             pst = con.prepareStatement(sql);
             pst.setInt(1,idx);
             rs = pst.executeQuery();
             while(rs.next()){
                 rsp = 1;
                 id = rs.getInt("id");
                 nombre = rs.getString("nombre");
             }
         }catch (Exception e) {
             Logger.getLogger(Log.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e, null, 0);
        }finally{
            cerrar();
        }
        
        return rsp;
    }
    public FormaPago buscarxID(int idx){
        
        sql =" select * from formapago where id=?";
         try(Connection con = new Conectar("rstcot").getCon()) {
             
             pst = con.prepareStatement(sql);
             pst.setInt(1,idx);
             rs = pst.executeQuery();
             while(rs.next()){
                 id = rs.getInt("id");
                 nombre = rs.getString("nombre");
             }
         }catch (Exception e) {
             Logger.getLogger(Log.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e, null, 0);
        }finally{
            cerrar();
        }
        
        return this;
    }
    public ArrayList listarGeneral(){
        ArrayList<FormaPago> lista = new ArrayList();
        
        sql = "select * from formaPago";
        try(Connection con = new Conectar("rstcot").getCon()) {
            pst=con.prepareStatement(sql);
            rs = pst.executeQuery();
            while(rs.next()){
                lista.add(new FormaPago(
                        rs.getInt("id"),
                        rs.getString("nombre")
                ));
            }
        } catch (Exception e) {
             Logger.getLogger(Log.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e, null, 0);
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "FormaPago{" + "id=" + id + ", nombre=" + nombre + '}';
    }
    
    
    
    
}
