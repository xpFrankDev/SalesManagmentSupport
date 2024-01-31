
package Clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;



public class Chofer {
    int id,eliminado=0;
    String nombres,apellidos,dni,brevete,estado="Activo";

    
    String sql ="";
    PreparedStatement pst;
    ResultSet rs;

    public Chofer() {
    }
    
    
    public Chofer(int id) {
        this.id = id;
        buscarID();
    }

    public Chofer(String nombres, String apellidos, String dni, String brevete) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.dni = dni;
        this.brevete = brevete;
    }

    public Chofer(int id, String nombres, String apellidos, String dni, String brevete,String estado,int eliminado) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.dni = dni;
        this.brevete = brevete;
        this.estado=estado;
        this.eliminado=eliminado;
    }

    public Chofer buscarID(){
        
        try(Connection con = new Conectar("rstcot").getCon()) {
            sql ="select * from chofer where id=?";
            pst = con.prepareStatement(sql);
            pst.setInt(1,id);
            rs = pst.executeQuery();
            while(rs.next()){
                this.id = rs.getInt("id");
                this.nombres = rs.getString("nombres");
                this.apellidos = rs.getString("apellidos");
                this.dni = rs.getString("dni");
                this.brevete = rs.getString("brevete");
                this.eliminado = rs.getInt("eliminado");
                this.estado = rs.getString("estado");
            }
            
        } catch (Exception e) {
            Logger.getLogger(Chofer.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e, null, 0);
        }finally{
            cerrar();
        }
        
        return this;
    }
    public Chofer buscarID(int idx){
        
        try(Connection con = new Conectar("rstcot").getCon()) {
            sql ="select * from chofer where id=?";
            pst = con.prepareStatement(sql);
            pst.setInt(1,idx);
            rs = pst.executeQuery();
            while(rs.next()){
                this.id = rs.getInt("id");
                this.nombres = rs.getString("nombres");
                this.apellidos = rs.getString("apellidos");
                this.dni = rs.getString("dni");
                this.brevete = rs.getString("brevete");
                this.estado = rs.getString("estado");
                this.eliminado = rs.getInt("eliminado");
            }
        } catch (Exception e) {
            Logger.getLogger(Chofer.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e, null, 0);
        }finally{
            cerrar();
        }
        
        return this;
    }
    
    public int insert(){
        int rsp =0;
        try(Connection con = new Conectar("rstcot").getCon()) {
            sql ="insert into chofer (nombres,apellidos,dni,brevete,estado,eliminado) values (?,?,?,?,?,?)";
            pst = con.prepareStatement(sql);
            pst.setString(1,nombres);
            pst.setString(2,apellidos);
            pst.setString(3,dni);
            pst.setString(4,brevete);
            pst.setString(5,estado);
            pst.setInt(6,eliminado);
            rsp = pst.executeUpdate();
            
        } catch (Exception e) {
            Logger.getLogger(Chofer.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e, null, 0);
        }finally{
            cerrar();
        }
        
        return rsp;
    }

     public int update(){
        int rsp =0;
        try(Connection con = new Conectar("rstcot").getCon()) {
            sql ="update chofer set nombres=?, apellidos=?,dni=?,brevete=? where id=?";
            pst = con.prepareStatement(sql);
            pst.setString(1,nombres);
            pst.setString(2,apellidos);
            pst.setString(3,dni);
            pst.setString(4,brevete);
            pst.setInt(5,id);
            rsp = pst.executeUpdate();
        } catch (Exception e) {
            Logger.getLogger(Chofer.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e, null, 0);
        }finally{
            cerrar();
        }
        
        return rsp;
    }
     public int deleteLogico(){
        int rsp =0;
        try(Connection con = new Conectar("rstcot").getCon()) {
            sql ="update chofer set eliminado=? where id=?";
            pst = con.prepareStatement(sql);
            pst.setInt(1,eliminado);
            pst.setInt(2,id);
            rsp = pst.executeUpdate();
        } catch (Exception e) {
            Logger.getLogger(Chofer.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e, null, 0);
        }finally{
            cerrar();
        }
        
        return rsp;
    }
    public int deleteLogico(int eliminadox){
        int rsp =0;
        try(Connection con = new Conectar("rstcot").getCon()) {
            sql ="update chofer set eliminado=? where id=?";
            pst = con.prepareStatement(sql);
            pst.setInt(1,eliminadox);
            pst.setInt(2,id);
            rsp = pst.executeUpdate();
        } catch (Exception e) {
            Logger.getLogger(Chofer.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e, null, 0);
        }finally{
            cerrar();
        }
        
        return rsp;
    }
    
    public int cambiarEstado(){
        int rsp =0;
        try(Connection con = new Conectar("rstcot").getCon()) {
            sql ="update chofer set estado=? where id=?";
            pst = con.prepareStatement(sql);
            pst.setString(1,estado);
            pst.setInt(2,id);
            rsp = pst.executeUpdate();
        } catch (Exception e) {
            Logger.getLogger(Chofer.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e, null, 0);
        }finally{
            cerrar();
        }
        
        return rsp;
    }
    
    public int cambiarEstado(String estadox){
        int rsp =0;
        try(Connection con = new Conectar("rstcot").getCon()) {
            sql ="update chofer set estado=? where id=?";
            pst = con.prepareStatement(sql);
            pst.setString(1,estadox);
            pst.setInt(2,id);
            rsp = pst.executeUpdate();
        } catch (Exception e) {
            Logger.getLogger(Chofer.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e, null, 0);
        }finally{
            cerrar();
        }
        
        return rsp;
    }
    
    
    public ArrayList listarGeneral(){
        ArrayList<Chofer> lista = new ArrayList();
         try(Connection con = new Conectar("rstcot").getCon()) {
            sql ="select * from chofer  where eliminado=0 and estado='Activo'";
            pst = con.prepareStatement(sql);            
             rs = pst.executeQuery();
            while(rs.next()){
                lista.add(new Chofer(
                rs.getInt("id"),rs.getString("nombres"),rs.getString("apellidos"),
                        rs.getString("dni"),rs.getString("brevete"),rs.getString("estado"),
                        rs.getInt("eliminado")
                ));
            }   
            
        } catch (Exception e) {
            Logger.getLogger(Chofer.class.getName()).log(Level.SEVERE, null, e);
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

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getBrevete() {
        return brevete;
    }

    public void setBrevete(String brevete) {
        this.brevete = brevete;
    }
    
    
    
    
    
    
    
}
