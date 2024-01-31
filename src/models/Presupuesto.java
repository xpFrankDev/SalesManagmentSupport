package Clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Presupuesto {

    int idPresupuesto, idSolicitud, idCliente, eliminado;
    String cliente, responsable, estado, fechaIngreso, tipo;
    Solicitud solicitud;
    PreparedStatement pst;
    ResultSet rs;
    Conectar c;
    String sql;

    public Presupuesto() {

    }

    public int Presupuesto(int idPresupuesto) {
        this.idPresupuesto = idPresupuesto;
        int resultado =0;// buscarId(idPresupuesto);
        return resultado;
    }

    public Presupuesto(int idPresupuesto) {
        this.idPresupuesto = idPresupuesto;
       // buscarId(idPresupuesto);

    }

    public int Presupuesto(int idPresupuesto, int eliminado) {
        this.idPresupuesto = idPresupuesto;
        this.eliminado = eliminado;
        int resultado = 0;//deletePresupuestoLogico(eliminado);
        return resultado;
    }

    public Presupuesto(int idSolicitud, int idCliente, String cliente, String responsable, String estado, String fechaIngreso, String tipo, int eliminado) {
        this.idSolicitud = idSolicitud;
        this.idCliente = idCliente;
        this.cliente = cliente;
        this.responsable = responsable;
        this.estado = estado;
        this.fechaIngreso = fechaIngreso;
        this.tipo = tipo;
        this.eliminado = eliminado;

        // int resultado = insertPresupuesto();
        //return resultado;
    }

    public Presupuesto(int idPresupuesto, int idSolicitud, int idCliente, String cliente, String responsable, String estado, String fechaIngreso, String tipo, int eliminado) {
        this.idPresupuesto = idPresupuesto;
        this.idSolicitud = idSolicitud;
        this.idCliente = idCliente;
        this.cliente = cliente;
        this.responsable = responsable;
        this.estado = estado;
        this.fechaIngreso = fechaIngreso;
        this.tipo = tipo;
        this.eliminado = eliminado;

    }

    public int buscarId(int idx) {
        int resultado = 0;
        try (Connection conex = new Conectar("rstcot").getCon()) {
            sql = "select * from presupuesto where id=? and eliminado=0";
            pst = conex.prepareStatement(sql);
            pst.setInt(1, idx);
            rs = pst.executeQuery();
            if (rs.next()) {
                resultado = 1;
                this.idSolicitud = rs.getInt("idSolicitud");
                this.fechaIngreso = rs.getString("fechaIngreso");
                this.idCliente = rs.getInt("idCliente");
                this.cliente = rs.getString("cliente");
                this.tipo = rs.getString("tipo");
                this.responsable = rs.getString("responsable");
                this.estado = rs.getString("estado");
                this.eliminado = rs.getInt("eliminado");
            }
        } catch (Exception e) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e, null, 0);
        } finally{
            cerrar();
        }     
        return resultado;
    }

    public Presupuesto buscarID(int idx) {
        try (Connection conex = new Conectar("rstcot").getCon()) {
            sql = "select * from presupuesto where id=? and eliminado=0";
            pst = conex.prepareStatement(sql);
            pst.setInt(1, idx);
             rs = pst.executeQuery();
            if (rs.next()) {
                this.idPresupuesto = rs.getInt("id");
                this.idSolicitud = rs.getInt("idSolicitud");
                this.fechaIngreso = rs.getString("fechaIngreso");
                this.idCliente = rs.getInt("idCliente");
                this.cliente = rs.getString("cliente");
                this.tipo = rs.getString("tipo");
                this.responsable = rs.getString("responsable");
                this.estado = rs.getString("estado");
                this.eliminado = rs.getInt("eliminado");
            }
        } catch (Exception e) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e, null, 0);
        }finally{
            cerrar();
        }
        return this;
    }

    public int insertPresupuesto() {
        int resultado = 0;
        try (Connection conex = new Conectar("rstcot").getCon()) {
            sql = "insert into presupuesto (idSolicitud,fechaIngreso,idcliente,cliente,"//4 valores
                    + "tipo,responsable,estado,eliminado) values "//8 valores
                    + "(?,?,?,?,?,?"
                    + ",?,?)";
            pst = conex.prepareStatement(sql);
            pst.setInt(1, idSolicitud);
            pst.setString(2, fechaIngreso);
            pst.setInt(3, idCliente);
            pst.setString(4, cliente);
            pst.setString(5, tipo);
            pst.setString(6, responsable);
            pst.setString(7, estado);
            pst.setInt(8, eliminado);
            resultado = pst.executeUpdate();
        } catch (Exception e) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e, null, 0);
        }finally{
            cerrar();
        }
        return resultado;
    }

    public int getLastPresupuesto() {
        int resultado = 0;
        //select id from solicitud order by id desc limit 1
        try (Connection conex = new Conectar("rstcot").getCon()) {
            sql = "select id from presupuesto order by id desc limit 1";
            pst = conex.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                resultado = rs.getInt("id");
            }
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
            sql = " update presupuesto set idsolicitud=?, fechaIngreso=?, idCliente=?, cliente=?,"
                    + " tipo=?, responsable=?, estado=?, "
                    + " eliminado=? where id=?";
            pst = conex.prepareStatement(sql);
            pst.setInt(1, idSolicitud);
            pst.setString(2, fechaIngreso);
            pst.setInt(3, idCliente);
            pst.setString(4, cliente);
            pst.setString(5, tipo);
            pst.setString(6, responsable);
            pst.setString(7, estado);
            pst.setInt(8, eliminado);
            pst.setInt(9, idPresupuesto);
            resultado = pst.executeUpdate();
        } catch (Exception e) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e, null, 0);
        }finally{
            cerrar();
        }

        return resultado;
    }

    private int deletePresupuestoLogico(int eliminadox) {
        int resultado = 0;
        try (Connection conex = new Conectar("rstcot").getCon()) {
            sql = "update presupuesto set eliminado =? where id=?";
            pst = conex.prepareStatement(sql);
            pst.setInt(1, eliminadox);
            pst.setInt(2, idPresupuesto);
            resultado = pst.executeUpdate();

        } catch (Exception e) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e, null, 0);
        }finally{
            cerrar();
        }
        return resultado;
    }

    public int deletePresupuestoTotal() {
        int resultado = 0;
        try (Connection conex = new Conectar("rstcot").getCon()) {
            sql = " delete from presupuesto where id=?";
            pst = conex.prepareStatement(sql);
            pst.setInt(1, idPresupuesto);
            resultado = pst.executeUpdate();
        } catch (Exception e) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e, null, 0);
        }finally{
            cerrar();
        }
        return resultado;
    }

    public ArrayList listarPresupuesto() {
        ArrayList<Presupuesto> lista = new ArrayList();
        try (Connection conex = new Conectar("rstcot").getCon()) {
            sql = "select * from presupuesto";
            pst = conex.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                lista.add(new Presupuesto(
                        rs.getInt("id"),
                        rs.getInt("idSolicitud"),
                        rs.getInt("idCliente"), rs.getString("cliente"),
                        rs.getString("responsable"),
                        rs.getString("estado"), rs.getString("fechaIngreso"),
                        rs.getString("tipo"), rs.getInt("eliminado")
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

    public ArrayList listarxNombre(String clientex) {
        ArrayList<Presupuesto> lista = new ArrayList();
        try (Connection conex = new Conectar("rstcot").getCon()) {
            sql = "select * from presupuesto where "
                    + "LOWER (cliente) LIKE LOWER ('%" + clientex + "%')";
            pst = conex.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                lista.add(new Presupuesto(
                        rs.getInt("id"),
                        rs.getInt("idSolicitud"),
                        rs.getInt("idCliente"), rs.getString("cliente"),
                        rs.getString("responsable"),
                        rs.getString("estado"), rs.getString("fechaIngreso"),
                        rs.getString("tipo"), rs.getInt("eliminado")
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
 public ArrayList listarxNombreyEstado(String clientex, String estadox) {
        ArrayList<Presupuesto> lista = new ArrayList();
        try (Connection conex = new Conectar("rstcot").getCon()) {
            sql = "select * from presupuesto where "
                    + "LOWER (cliente) LIKE LOWER ('%" + clientex + "%') "
                    + " and estado =?";
            pst = conex.prepareStatement(sql);
            pst.setString(1,estadox);
            rs = pst.executeQuery();
            while (rs.next()) {
                lista.add(new Presupuesto(
                        rs.getInt("id"),
                        rs.getInt("idSolicitud"),
                        rs.getInt("idCliente"), rs.getString("cliente"),
                        rs.getString("responsable"),
                        rs.getString("estado"), rs.getString("fechaIngreso"),
                        rs.getString("tipo"), rs.getInt("eliminado")
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
    public ArrayList listarxEstado(String estadox) {
        ArrayList<Presupuesto> lista = new ArrayList();
        try (Connection conex = new Conectar("rstcot").getCon()) {
            sql = "select * from presupuesto where "
                    + "LOWER (estado) LIKE LOWER ('%" + estadox + "%')";
            pst = conex.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                lista.add(new Presupuesto(
                        rs.getInt("id"),
                        rs.getInt("idSolicitud"),
                        rs.getInt("idCliente"), rs.getString("cliente"),
                        rs.getString("responsable"),
                        rs.getString("estado"), rs.getString("fechaIngreso"),
                        rs.getString("tipo"), rs.getInt("eliminado")
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

    public int getTotalpresupuestoHoy() {
        int resultado = 0;
        String fecha = new Conectar("rstcot").getFechaServidor();
        sql = "select id from presupuesto where fechaIngreso=?";
        try (Connection con = new Conectar("rstcot").getCon()) {
            pst = con.prepareStatement(sql);
            pst.setString(1, fecha);             
             rs= pst.executeQuery();
            while (rs.next()) {
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

    public int getTotalpresupuestoSinProcesadas() {
        int resultado = 0;
        String fecha = new Conectar("rstcot").getFechaServidor();
        sql = "select id from presupuesto where fechaIngreso=? and estado='Esperando Cotización'";
        try (Connection con = new Conectar("rstcot").getCon()) {
            pst = con.prepareStatement(sql);
            pst.setString(1, fecha);
            rs = pst.executeQuery();
            while (rs.next()) {
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

    public int getTotalpresupuestoHoy(String vendedorx) {
        int resultado = 0;
        String fecha = new Conectar("rstcot").getFechaServidor();
        sql = "select id from presupuesto where fechaIngreso=? and responsable=?";
        try (Connection con = new Conectar("rstcot").getCon()) {
            pst = con.prepareStatement(sql);
            pst.setString(1, fecha);
            pst.setString(2, vendedorx);
             rs = pst.executeQuery();
            while (rs.next()) {
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

    public int getIdPresupuesto() {
        return idPresupuesto;
    }

    public void setIdPresupuesto(int idPresupuesto) {
        this.idPresupuesto = idPresupuesto;
    }

    public int getIdSolicitud() {
        return idSolicitud;
    }

    public void setIdSolicitud(int idSolicitud) {
        this.idSolicitud = idSolicitud;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getEliiminado() {
        return eliminado;
    }

    public void setEliiminado(int eliiminado) {
        this.eliminado = eliiminado;
    }

    @Override
    public String toString() {
        return "Presupuesto{" + "idPresupuesto=" + idPresupuesto + ", idSolicitud=" + idSolicitud + ", idCliente=" + idCliente + ", eliminado=" + eliminado + ", cliente=" + cliente + ", responsable=" + responsable + ", estado=" + estado + ", fechaIngreso=" + fechaIngreso + ", tipo=" + tipo + '}';
    }

    public Solicitud getSolicitud() {
        return new Solicitud().buscarID(this.getIdSolicitud());
    }

    public void setSolicitud(Solicitud solicitud) {
        this.solicitud = solicitud;
    }

}
