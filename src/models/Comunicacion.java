package Clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Comunicacion {

    int id, idcot, idCliente, idPersonaContacto, eliminado;
    String vendedor, tipoComunicacion, descripcion, sql, tipo;
    String fecha;
    PreparedStatement pst;
    ResultSet rs;

    public Comunicacion() {

    }

    public Comunicacion(int id) {
        this.id = id;
    }

    public Comunicacion(int id, int idcot, int idCliente, int idPersonaContacto, String vendedor, String fecha, String tipoComunicacion, String descripcion, int eliminado, String tipo) {
        this.id = id;
        this.idcot = idcot;
        this.idCliente = idCliente;
        this.idPersonaContacto = idPersonaContacto;
        this.eliminado = eliminado;
        this.vendedor = vendedor;
        this.tipoComunicacion = tipoComunicacion;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.tipo = tipo;
    }

    public Comunicacion(int idcot, int idCliente, int idPersonaContacto, String vendedor, String fecha, String tipoComunicacion, String descripcion, String tipo) {
        this.idcot = idcot;
        this.idCliente = idCliente;
        this.idPersonaContacto = idPersonaContacto;
        this.vendedor = vendedor;
        this.tipoComunicacion = tipoComunicacion;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.tipo = tipo;
    }

    public Comunicacion(int idcot, int idCliente, int idPersonaContacto, String vendedor, String fecha, String tipoComunicacion, String descripcion, int eliminado, String tipo) {
        this.idcot = idcot;
        this.idCliente = idCliente;
        this.idPersonaContacto = idPersonaContacto;
        this.vendedor = vendedor;
        this.tipoComunicacion = tipoComunicacion;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.eliminado = eliminado;
        this.tipo = tipo;
    }

    public int insert() {
        int rsp = 0;
        sql = "insert into comunicacion (idCot,idCliente,idPersonaContacto,vendedor,fecha,tipoComunicacion,descripcion,tipo)"
                + "values (?,?,?,?,?,?,?,?)";
        try (Connection con = new Conectar("rstcot").getCon()) {
            pst = con.prepareStatement(sql);
            pst.setInt(1, idcot);
            pst.setInt(2, idCliente);
            pst.setInt(3, idPersonaContacto);
            pst.setString(4, vendedor);
            pst.setString(5, fecha);
            pst.setString(6, tipoComunicacion);
            pst.setString(7, descripcion);
            pst.setString(8, tipo);
            rsp = pst.executeUpdate();
        } catch (Exception e) {
            Logger.getLogger(Comunicacion.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e);
        } finally {
            cerrar();
        }
        return rsp;
    }

    public int update() {
        int rsp = 0;
        sql = "update from comunicacion set idCot=?, idCliente=?, idPersonaContacto=?,vendedor=?,fecha=?,tipoComunicacion=?,descripcion=?,tipo=? where id=?";
        try (Connection con = new Conectar("rstcot").getCon()) {
            pst = con.prepareStatement(sql);
            pst.setInt(1, idcot);
            pst.setInt(2, idCliente);
            pst.setInt(3, idPersonaContacto);
            pst.setString(4, vendedor);
            pst.setString(5, fecha);
            pst.setString(6, tipoComunicacion);
            pst.setString(7, descripcion);
            pst.setString(8, tipo);
            pst.setInt(9, id);
            rsp = pst.executeUpdate();
        } catch (Exception e) {
            Logger.getLogger(Comunicacion.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e);
        } finally {
            cerrar();
        }
        return rsp;
    }

    public int deleteLogico(int eliminadox) {
        int rsp = 0;
        try (Connection con = new Conectar("rstcot").getCon()) {
            sql = " update comunicacion set eliminado =? where id=?";
            pst = con.prepareStatement(sql);
            pst.setInt(1, eliminadox);
            pst.setInt(2, id);
            rsp = pst.executeUpdate();
        } catch (Exception e) {
            Logger.getLogger(Comunicacion.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e);
        } finally {
            cerrar();
        }
        return rsp;
    }

    public Comunicacion buscarID() {
        try (Connection con = new Conectar("rstcot").getCon()) {
            sql = " select * from comunicacion where id=?";
            pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            rs = pst.executeQuery();
            while (rs.next()) {
                this.id = rs.getInt("id");
                this.idcot = rs.getInt("idCot");
                this.idCliente = rs.getInt("idCliente");
                this.idPersonaContacto = rs.getInt("idPersonaContacto");
                this.vendedor = rs.getString("vendedor");
                this.fecha = rs.getString("fecha");
                this.tipoComunicacion = rs.getString("tipoComunicacion");
                this.descripcion = rs.getString("descripcion");
                this.eliminado = rs.getInt("eliminado");
                this.tipo = rs.getString("tipo");
            }
        } catch (Exception e) {
            Logger.getLogger(Comunicacion.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e);
        } finally {
            cerrar();
        }

        return this;
    }

    public ArrayList listarXCliente(int idClientex) {
        ArrayList<Comunicacion> lista = new ArrayList();

        try (Connection con = new Conectar("rstcot").getCon()) {

            sql = "select * from comunicacion where idCliente=?";
            pst = con.prepareStatement(sql);
            pst.setInt(1, idClientex);
            rs = pst.executeQuery();
            while (rs.next()) {
                lista.add(new Comunicacion(
                        rs.getInt("id"), rs.getInt("idCot"), rs.getInt("idCliente"), rs.getInt("idPersonaContacto"),
                        rs.getString("vendedor"), rs.getString("fecha"), rs.getString("tipoComunicacion"), rs.getString("descripcion"),
                        rs.getInt("eliminado"), rs.getString("tipo")
                ));
            }

        } catch (Exception e) {
            Logger.getLogger(Comunicacion.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e);
        } finally {
            cerrar();
        }

        return lista;
    }

    public ArrayList listarXCot(int idCotx) {
        ArrayList<Comunicacion> lista = new ArrayList();

        try (Connection con = new Conectar("rstcot").getCon()) {

            sql = "select * from comunicacion where idCot=?";
            pst = con.prepareStatement(sql);
            pst.setInt(1, idCotx);
            rs = pst.executeQuery();
            while (rs.next()) {
                lista.add(new Comunicacion(
                        rs.getInt("id"), rs.getInt("idCot"), rs.getInt("idCliente"), rs.getInt("idPersonaContacto"),
                        rs.getString("vendedor"), rs.getString("fecha"), rs.getString("tipoComunicacion"), rs.getString("descripcion"),
                        rs.getInt("eliminado"), rs.getString("tipo")
                ));
            }

        } catch (Exception e) {
            Logger.getLogger(Comunicacion.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e);
        } finally {
            cerrar();
        }

        return lista;
    }

    public ArrayList listarXPersonaContacto(int idPersonaContactox) {
        ArrayList<Comunicacion> lista = new ArrayList();

        try (Connection con = new Conectar("rstcot").getCon()) {

            sql = "select * from comunicacion where idPersonaContacto=?";
            pst = con.prepareStatement(sql);
            pst.setInt(1, idPersonaContactox);
            rs = pst.executeQuery();
            while (rs.next()) {
                lista.add(new Comunicacion(
                        rs.getInt("id"), rs.getInt("idCot"), rs.getInt("idCliente"), rs.getInt("idPersonaContacto"),
                        rs.getString("vendedor"), rs.getString("fecha"), rs.getString("tipoComunicacion"), rs.getString("descripcion"),
                        rs.getInt("eliminado"), rs.getString("tipo")
                ));
            }
        } catch (Exception e) {
            Logger.getLogger(Comunicacion.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e);
        } finally {
            cerrar();
        }

        return lista;
    }

    public ArrayList listarXVendedor(String vendedorx) {
        ArrayList<Comunicacion> lista = new ArrayList();

        try (Connection con = new Conectar("rstcot").getCon()) {

            sql = "select * from comunicacion where vendedor=?";
            pst = con.prepareStatement(sql);
            pst.setString(1, vendedorx);
            rs = pst.executeQuery();
            while (rs.next()) {
                lista.add(new Comunicacion(
                        rs.getInt("id"), rs.getInt("idCot"), rs.getInt("idCliente"), rs.getInt("idPersonaContacto"),
                        rs.getString("vendedor"), rs.getString("fecha"), rs.getString("tipoComunicacion"), rs.getString("descripcion"),
                        rs.getInt("eliminado"), rs.getString("tipo")
                ));
            }

        } catch (Exception e) {
            Logger.getLogger(Comunicacion.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e);
        } finally {
            cerrar();
        }

        return lista;
    }

    public ArrayList listarXTipoComunicacion(String tipoComunicacionx) {
        ArrayList<Comunicacion> lista = new ArrayList();

        try (Connection con = new Conectar("rstcot").getCon()) {

            sql = "select * from comunicacion where tipoComunicacion=?";
            pst = con.prepareStatement(sql);
            pst.setString(1, tipoComunicacionx);
            rs = pst.executeQuery();
            while (rs.next()) {
                lista.add(new Comunicacion(
                        rs.getInt("id"), rs.getInt("idCot"), rs.getInt("idCliente"), rs.getInt("idPersonaContacto"),
                        rs.getString("vendedor"), rs.getString("fecha"), rs.getString("tipoComunicacion"), rs.getString("descripcion"),
                        rs.getInt("eliminado"), rs.getString("tipo")
                ));
            }

        } catch (Exception e) {
            Logger.getLogger(Comunicacion.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e);
        } finally {
            cerrar();
        }

        return lista;
    }

    public ArrayList listarXEliminado(int eliminadox) {
        ArrayList<Comunicacion> lista = new ArrayList();

        try (Connection con = new Conectar("rstcot").getCon()) {

            sql = "select * from comunicacion where eliminado=?";
            pst = con.prepareStatement(sql);
            pst.setInt(1, eliminadox);
            rs = pst.executeQuery();
            while (rs.next()) {
                lista.add(new Comunicacion(
                        rs.getInt("id"), rs.getInt("idCot"), rs.getInt("idCliente"), rs.getInt("idPersonaContacto"),
                        rs.getString("vendedor"), rs.getString("fecha"), rs.getString("tipoComunicacion"), rs.getString("descripcion"),
                        rs.getInt("eliminado"), rs.getString("tipo")
                ));
            }

        } catch (Exception e) {
            Logger.getLogger(Comunicacion.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e);
        } finally {
            cerrar();
        }

        return lista;
    }

    public ArrayList listarXFecha(Date fechax) {
        ArrayList<Comunicacion> lista = new ArrayList();

        try (Connection con = new Conectar("rstcot").getCon()) {

            sql = "select * from comunicacion where fecha=?";
            pst = con.prepareStatement(sql);
            pst.setDate(1, (java.sql.Date) fechax);
            rs = pst.executeQuery();
            while (rs.next()) {
                lista.add(new Comunicacion(
                        rs.getInt("id"), rs.getInt("idCot"), rs.getInt("idCliente"), rs.getInt("idPersonaContacto"),
                        rs.getString("vendedor"), rs.getString("fecha"), rs.getString("tipoComunicacion"), rs.getString("descripcion"),
                        rs.getInt("eliminado"), rs.getString("tipo")
                ));
            }

        } catch (Exception e) {
            Logger.getLogger(Comunicacion.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e);
        } finally {
            cerrar();
        }

        return lista;
    }

    public int getLastComunicacion() {
        int resultado = 0;

        try (Connection conex = new Conectar("rstcot").getCon()) {
            sql = "select id from comunicacion order by id desc limit 1";
            pst = conex.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                resultado = rs.getInt("id");
            }
        } catch (Exception e) {
            Logger.getLogger(Comunicacion.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e);
        } finally {
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

    public int getIdcot() {
        return idcot;
    }

    public void setIdcot(int idcot) {
        this.idcot = idcot;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdPersonaContacto() {
        return idPersonaContacto;
    }

    public void setIdPersonaContacto(int idPersonaContacto) {
        this.idPersonaContacto = idPersonaContacto;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTipoComunicacion() {
        return tipoComunicacion;
    }

    public void setTipoComunicacion(String tipoComunicacion) {
        this.tipoComunicacion = tipoComunicacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }

    @Override
    public String toString() {
        return "Comunicacion{" + "id=" + id + ", idcot=" + idcot + ", idCliente=" + idCliente + ", idPersonaContacto=" + idPersonaContacto + ", vendedor=" + vendedor + ", fecha=" + fecha + ", tipoComunicacion=" + tipoComunicacion + ", descripcion=" + descripcion + ", sql=" + sql + '}';
    }

}
