package Clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Solicitud {

    int id;
    int idCliente;
    String fecha,nombreCliente;
    int idPresupuesto;
    String vendedor;
    
    int idCot;
    String estado,personaContacto;
    int eliminado;
    String descripcion ="sin obs";

    PreparedStatement pst;
    ResultSet rs;
    String sql;

    public Solicitud() {

    }

    public Solicitud(int idSolicitud) {
        this.id = idSolicitud;
        buscarId();
    }

    public Solicitud(int id, int idCliente, String nombreCliente, String fecha, int idPresupuesto, String vendedor, int idCot, String estado, int eliminado, String descripcion,String personaContacto) {
        this.id = id;
        this.idCliente = idCliente;
        this.nombreCliente = nombreCliente;
        this.fecha = fecha;
        this.idPresupuesto = idPresupuesto;
        this.vendedor = vendedor;        
        this.idCot = idCot;
        this.estado = estado;
        this.eliminado = eliminado;
        this.descripcion = descripcion;
        this.personaContacto = personaContacto;
    }

    public Solicitud(int idCliente, String nombreCliente, String fecha, int idPresupuesto, String vendedor, int idCot, String estado, int eliminado, String descripcion,String personaContacto) {
        this.idCliente = idCliente;
        this.nombreCliente = nombreCliente;
        this.fecha = fecha;
        this.idPresupuesto = idPresupuesto;
        this.vendedor = vendedor;        
        this.idCot = idCot;
        this.estado = estado;
        this.eliminado = eliminado;
        this.descripcion = descripcion;
        this.personaContacto=personaContacto;
    }

    public int deleteLogico() {
        int resultado = 0;
        try (Connection conex = new Conectar("rstcot").getCon()) {
            sql = "update solicitud set eliminado=? where id=?";
            pst = conex.prepareStatement(sql);
            pst.setInt(1, eliminado);
            pst.setInt(2, id);
            resultado = pst.executeUpdate();

        } catch (Exception e) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e, null, 0);
        }finally{
            cerrar();
        }

        return resultado;
    }

    public int deleteTotal() {
        int resultado = 0;

        try (Connection conex = new Conectar("rstcot").getCon()) {
            sql = "delete from solicitud where id=?";
            pst = conex.prepareStatement(sql);
            pst.setInt(1, id);
            resultado = pst.executeUpdate();
        } catch (Exception e) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e, null, 0);
        }finally{
            cerrar();
        }

        return resultado;
    }

    public int update() {
        int resultado = 0;

        try (Connection conex = new Conectar("rstcot").getCon()) {
            sql = "update Solicitud set "
                    + "idCliente=?,fecha=?, idPresupuesto=?,"
                    + "vendedor=?, idCOt=?, estado=?, eliminado=?,descripcion=?, personaContacto=? , nombreCliente=?"
                    + "where id=?";
            pst = conex.prepareStatement(sql);
            pst.setInt(1, idCliente);
            pst.setString(2, fecha);
            pst.setInt(3, idPresupuesto);
            pst.setString(4, vendedor);
            
            pst.setInt(5, idCot);
            pst.setString(6, estado);
            pst.setInt(7, eliminado);
            pst.setString(8, descripcion);
            pst.setString(9,personaContacto);
            pst.setString(10, nombreCliente);
            pst.setInt(11, id);
            resultado = pst.executeUpdate();
        } catch (Exception e) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e, null, 0);
        }finally{
            cerrar();
        }

        return resultado;
    }

    public int Insert() {
        int resultado = 0;

        try (Connection conex = new Conectar("rstcot").getCon()) {
            sql = "insert into solicitud "
                    + "(idCliente,nombreCliente,fecha,idPresupuesto,vendedor,idCot,estado,eliminado,descripcion,personaContacto)"
                    + "values"
                    + "(?,?,?,?,?,?,?,?,?,?)";
            pst = conex.prepareStatement(sql);
            pst.setInt(1, idCliente);
            pst.setString(2,nombreCliente);
            pst.setString(3, fecha);
            pst.setInt(4, idPresupuesto);
            pst.setString(5, vendedor);
            
            pst.setInt(6, idCot);
            pst.setString(7, estado);
            pst.setInt(8, eliminado);
            pst.setString(9, descripcion);
            pst.setString(10,personaContacto);
            resultado = pst.executeUpdate();
        } catch (Exception e) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e, null, 0);
        }finally{
            cerrar();
        }

        return resultado;
    }

    public int buscarId() {
        int resultado = 0;
        try (Connection conex = new Conectar("rstcot").getCon()) {
                sql = "select * from solicitud where id=?";
                pst = conex.prepareStatement(sql);
                pst.setInt(1, id);
                rs = pst.executeQuery();
                while (rs.next()) {
                    resultado = rs.getInt("id");
                    this.id = resultado;
                    this.idCliente = rs.getInt("idCliente");
                    this.nombreCliente = rs.getString("nombreCliente");
                    this.fecha = rs.getString("fecha");
                    this.idPresupuesto = rs.getInt("idPresupuesto");
                    this.vendedor = rs.getString("vendedor");                   
                    this.idCot = rs.getInt("idCot");
                    this.estado = rs.getString("estado");
                    this.eliminado = rs.getInt("eliminado");
                    this.descripcion = rs.getString("descripcion");
                    this.personaContacto = rs.getString("personaContacto");
                    resultado = 1;
                }
        } catch (Exception e) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e, null, 0);
        }finally{
            cerrar();
        }

        return resultado;
    }
     public  int buscarId(int idx) {
        int resultado = 0;
        try (Connection conex = new Conectar("rstcot").getCon()) {
                sql = "select * from solicitud where id=?";
                pst = conex.prepareStatement(sql);
                pst.setInt(1, idx);
                rs = pst.executeQuery();
                while (rs.next()) {
                    resultado = rs.getInt("id");
                    this.id = resultado;
                    this.idCliente = rs.getInt("idCliente");
                    this.nombreCliente = rs.getString("nombreCliente");
                    this.fecha = rs.getString("fecha");
                    this.idPresupuesto = rs.getInt("idPresupuesto");
                    this.vendedor = rs.getString("vendedor");                   
                    this.idCot = rs.getInt("idCot");
                    this.estado = rs.getString("estado");
                    this.eliminado = rs.getInt("eliminado");
                    this.descripcion = rs.getString("descripcion");
                    this.personaContacto = rs.getString("personaContacto");
                    resultado = 1;
                }
        } catch (Exception e) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e, null, 0);
        }finally{
            cerrar();
        }

        return resultado;
    }
    public int getLastSolicitud(){
        int resultado = 0;
        //select id from solicitud order by id desc limit 1
        try(Connection conex = new Conectar("rstcot").getCon()) {
            sql ="select id from solicitud order by id desc limit 1";
            pst = conex.prepareStatement(sql);
            rs = pst.executeQuery();
            while(rs.next()){
                resultado = rs.getInt("id");
            }
        } catch (Exception e) {
              Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e, null, 0);
        }finally {
            cerrar();
        }
        return resultado;
    }
    public ArrayList listarXCliente() {
        ArrayList<Solicitud> lista = new ArrayList();

        try (Connection conex = new Conectar("rstcot").getCon()) {
                sql = "select * from solicitud where idCliente=?";
                pst = conex.prepareStatement(sql);
                pst.setInt(1, idCliente);
                rs = pst.executeQuery();
                while (rs.next()) {
                    lista.add(new Solicitud(
                            rs.getInt("id"),
                            rs.getInt("idCliente"),rs.getString("nombreCliente"),
                            rs.getString("fecha"),
                            rs.getInt("idPresupuesto"), rs.getString("vendedor"),
                            rs.getInt("idCot"), rs.getString("estado"),
                            rs.getInt("eliminado"), rs.getString("descripcion")
                            ,rs.getString("personaContacto")
                    ));
                }
        } catch (Exception e) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e, null, 0);
        }finally{
            cerrar();
        }

        return lista;
    }
  public ArrayList listarXCliente(int idClientex) {
        ArrayList<Solicitud> lista = new ArrayList();

        try (Connection conex = new Conectar("rstcot").getCon()) {
                sql = "select * from solicitud where idCliente=?";
                pst = conex.prepareStatement(sql);
                pst.setInt(1, idClientex);
                rs = pst.executeQuery();
                while (rs.next()) {
                    lista.add(new Solicitud(
                            rs.getInt("id"),
                            rs.getInt("idCliente"),rs.getString("nombreCliente"),
                            rs.getString("fecha"),
                            rs.getInt("idPresupuesto"), rs.getString("vendedor"),
                            rs.getInt("idCot"), rs.getString("estado"),
                            rs.getInt("eliminado"), rs.getString("descripcion")
                            ,rs.getString("personaContacto")
                    ));
                }
        } catch (Exception e) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e, null, 0);
        }finally{
            cerrar();
        }

        return lista;
    }
    public ArrayList listarXVendedor() {
        ArrayList<Solicitud> lista = new ArrayList();
        try (Connection conex = new Conectar("rstcot").getCon()) {
                sql = "select * from solicitud where vendedor=?";
                pst = conex.prepareStatement(sql);
                pst.setString(1, vendedor);
                rs = pst.executeQuery();
                while (rs.next()) {
                    lista.add(new Solicitud(
                            rs.getInt("id"),
                            rs.getInt("idCliente"),rs.getString("nombreCliente"),
                            rs.getString("fecha"),
                            rs.getInt("idPresupuesto"), rs.getString("vendedor"),
                            rs.getInt("idCot"), rs.getString("estado"),
                            rs.getInt("eliminado"), rs.getString("descripcion")
                            ,rs.getString("personaContacto")
                    ));
                }
        } catch (Exception e) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e, null, 0);
        }finally{
            cerrar();
        }

        return lista;
    }

    
    public ArrayList listarXEstado() {
        ArrayList<Solicitud> lista = new ArrayList();

        try (Connection conex = new Conectar("rstcot").getCon()) {
                sql = "select * from solicitud where estado=?";
                pst = conex.prepareStatement(sql);
                pst.setString(1, estado);
                rs = pst.executeQuery();
                while (rs.next()) {
                    lista.add(new Solicitud(
                           rs.getInt("id"),
                            rs.getInt("idCliente"),rs.getString("nombreCliente"),
                            rs.getString("fecha"),
                            rs.getInt("idPresupuesto"), rs.getString("vendedor"),
                            rs.getInt("idCot"), rs.getString("estado"),
                            rs.getInt("eliminado"), rs.getString("descripcion")
                            ,rs.getString("personaContacto")
                    ));

                }
        } catch (Exception e) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e, null, 0);
        }finally{
            cerrar();
        }

        return lista;
    }
     public ArrayList listarXEstado(String clientex) {
        ArrayList<Solicitud> lista = new ArrayList();

        try (Connection conex = new Conectar("rstcot").getCon()) {
               sql = "select * from solicitud where estado=? and lower(nombreCliente) like lower ('%"+clientex+"%')";
                pst = conex.prepareStatement(sql);
                pst.setString(1, estado);
                rs = pst.executeQuery();
                while (rs.next()) {
                    lista.add(new Solicitud(
                            rs.getInt("id"),
                            rs.getInt("idCliente"),rs.getString("nombreCliente"),
                            rs.getString("fecha"),
                            rs.getInt("idPresupuesto"), rs.getString("vendedor"),
                            rs.getInt("idCot"), rs.getString("estado"),
                            rs.getInt("eliminado"), rs.getString("descripcion")
                            ,rs.getString("personaContacto")
                    ));

                } 
            
            
                
        } catch (Exception e) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e, null, 0);
        }finally{
            cerrar();
        }

        return lista;
    }
public ArrayList listarGeneral() {
        ArrayList<Solicitud> lista = new ArrayList();

        try (Connection conex = new Conectar("rstcot").getCon()) {
                sql = "select * from solicitud";
                pst = conex.prepareStatement(sql);                
                rs = pst.executeQuery();
                while (rs.next()) {
                    lista.add(new Solicitud(
                           rs.getInt("id"),
                            rs.getInt("idCliente"),rs.getString("nombreCliente"),
                            rs.getString("fecha"),
                            rs.getInt("idPresupuesto"), rs.getString("vendedor"),
                            rs.getInt("idCot"), rs.getString("estado"),
                            rs.getInt("eliminado"), rs.getString("descripcion")
                            ,rs.getString("personaContacto")
                    ));

                }
        } catch (Exception e) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e, null, 0);
        }finally{
            cerrar();
        }

        return lista;
    }
    public ArrayList listarXEliminado() {
        ArrayList<Solicitud> lista = new ArrayList();

        try (Connection conex = new Conectar("rstcot").getCon()) {
                sql = "select * from solicitud where eliminado=?";
                pst = conex.prepareStatement(sql);
                pst.setInt(1, eliminado);
                rs = pst.executeQuery();
                while (rs.next()) {
                    lista.add(new Solicitud(
                            rs.getInt("id"),
                            rs.getInt("idCliente"),rs.getString("nombreCliente"),
                            rs.getString("fecha"),
                            rs.getInt("idPresupuesto"), rs.getString("vendedor"),
                            rs.getInt("idCot"), rs.getString("estado"),
                            rs.getInt("eliminado"), rs.getString("descripcion")
                            ,rs.getString("personaContacto")
                    ));
                }
        } catch (Exception e) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e, null, 0);
        }finally{
            cerrar();
        }

        return lista;
    }

    public ArrayList listarxID() {
        ArrayList<Solicitud> lista = new ArrayList();

        try (Connection conex = new Conectar("rstcot").getCon()) {
            sql = "select * from solicitud where id=?";
            pst = conex.prepareStatement(sql);
            pst.setInt(1, id);
            rs = pst.executeQuery();
            while (rs.next()) {
                lista.add(new Solicitud(
                        rs.getInt("id"),
                            rs.getInt("idCliente"),rs.getString("nombreCliente"),
                            rs.getString("fecha"),
                            rs.getInt("idPresupuesto"), rs.getString("vendedor"),
                            rs.getInt("idCot"), rs.getString("estado"),
                            rs.getInt("eliminado"), rs.getString("descripcion")
                            ,rs.getString("personaContacto")
                ));
            }
        } catch (Exception e) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e, null, 0);
        }finally{
            cerrar();
        }

        return lista;
    }
public ArrayList listarxEditar() {
        ArrayList<Solicitud> lista = new ArrayList();
        try (Connection conex = new Conectar("rstcot").getCon()) {
            sql = "select * from solicitud where eliminado =0 and idPresupuesto=0";
            pst = conex.prepareStatement(sql);            
            rs = pst.executeQuery();
            while (rs.next()) {
                lista.add(new Solicitud(
                        rs.getInt("id"),
                            rs.getInt("idCliente"),rs.getString("nombreCliente"),
                            rs.getString("fecha"),
                            rs.getInt("idPresupuesto"), rs.getString("vendedor"),
                            rs.getInt("idCot"), rs.getString("estado"),
                            rs.getInt("eliminado"), rs.getString("descripcion")
                            ,rs.getString("personaContacto")
                ));
            }
        } catch (Exception e) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e, null, 0);
        }finally{
            cerrar();
        }

        return lista;
    }
    public Solicitud buscarID(int idx) {

        try (Connection conex = new Conectar("rstcot").getCon()) {
            sql = "select * from solicitud where id=?";
            pst = conex.prepareStatement(sql);
            pst.setInt(1, idx);
            rs = pst.executeQuery();
            while (rs.next()) {
                this.id = rs.getInt("id");
                this.idCliente = rs.getInt("idCliente");
                this.nombreCliente = rs.getString("nombreCliente");
                this.fecha = rs.getString("fecha");
                this.idPresupuesto = rs.getInt("idPresupuesto");
                this.vendedor = rs.getString("vendedor");               
                this.idCot = rs.getInt("idCot");
                this.estado = rs.getString("estado");
                this.eliminado = rs.getInt("eliminado");
                this.descripcion = rs.getString("descripcion");
                this.personaContacto = rs.getString("personaContacto");
            }
        } catch (Exception e) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e, null, 0);
        }finally{
            cerrar();
        }
        return this;
    }

    public int getTotalSolicitudHoy(){
        int resultado=0;
        String fecha = new Conectar().getFechaServidor();
        sql = "select id from solicitud where fecha=?";
        try(Connection con = new Conectar("rstcot").getCon()) {
            pst=con.prepareStatement(sql);
            pst.setString(1,fecha);
            rs = pst.executeQuery();
            while(rs.next()){
                resultado++;
            }
        } catch (Exception e) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e, null, 0);
        }finally{
            cerrar();
        }
        return resultado;
    }
    public int getTotalSolicitudSINProcesar(){
        int resultado=0;
        String fecha = new Conectar().getFechaServidor();
        sql = "select id from solicitud where fecha=? and estado='Creado'";
        try(Connection con = new Conectar("rstcot").getCon()) {
            pst=con.prepareStatement(sql);
            pst.setString(1,fecha);
            rs = pst.executeQuery();
            while(rs.next()){
                resultado++;
            }
        } catch (Exception e) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e, null, 0);
        }finally{
            cerrar();
        }
        return resultado;
    }
        public int getTotalSolicitudHoy(String vendedorx){
        int resultado=0;
        String fecha = new Conectar().getFechaServidor();
        sql = "select id from solicitud where fecha=? and vendedor=?";
        try(Connection con = new Conectar("rstcot").getCon()) {
            pst=con.prepareStatement(sql);
            pst.setString(1,fecha);
            pst.setString(2,vendedorx);
            rs = pst.executeQuery();
            while(rs.next()){
                resultado++;
            }
        } catch (Exception e) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e, null, 0);
        }finally{
            cerrar();
        }
        return resultado;
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

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getFecha() {
        return fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getIdPresupuesto() {
        return idPresupuesto;
    }

    public void setIdPresupuesto(int idPresupuesto) {
        this.idPresupuesto = idPresupuesto;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    
    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }


    public int getIdCot() {
        return idCot;
    }

    public void setIdCot(int idCot) {
        this.idCot = idCot;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getEliminado() {
        return eliminado;
    }

    public void setEliminado(int eliminado) {
        this.eliminado = eliminado;
    }

    public String getPersonaContacto() {
        return personaContacto;
    }

    @Override
    public String toString() {
        return "Solicitud{" + "id=" + id + ", idCliente=" + idCliente + ", fecha=" + fecha + ", nombreCliente=" + nombreCliente + ", idPresupuesto=" + idPresupuesto + ", vendedor=" + vendedor + ", idCot=" + idCot + ", estado=" + estado + ", personaContacto=" + personaContacto + ", eliminado=" + eliminado + ", descripcion=" + descripcion + '}';
    }

    public void setPersonaContacto(String personaContacto) {
        this.personaContacto = personaContacto;
    }

    
   
   
}
