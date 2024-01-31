package Clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Seguimiento {

    int id=0, idCliente;
    String fecha, documento, estado, vendedor,ip;
    int idDocumento;
    PreparedStatement pst;
    ResultSet rs;
    String sql = "";

    public Seguimiento() {
        
    }
    

    public Seguimiento(int id, int idCliente, String fecha, String documento, String estado, String vendedor, int idDocumento,String ip) {
        this.id = id;
        this.idCliente = idCliente;
        this.fecha = fecha;
        this.documento = documento;
        this.estado = estado;
        this.vendedor = vendedor;
        this.idDocumento = idDocumento;
        this.ip = ip;
    }

    public Seguimiento(int idCliente, String fecha, String documento, String estado, String vendedor,int idDocumento,String ip) {
        this.idCliente = idCliente;
        this.fecha = fecha;
        this.documento = documento;
        this.estado = estado;
        this.vendedor = vendedor;
         this.idDocumento = idDocumento;
         this.ip = ip;
    }

    public int insert() {
        int resultado = 0;

        try (Connection conex = new Conectar("rstcot").getCon()) {
            sql = "insert into seguimiento (idCliente,fecha,documento,estado,vendedor,idDocumento,ip) "
                    + "values"
                    + " (?,?,?,?,?,?,?)";
            pst = conex.prepareStatement(sql);
            pst.setInt(1, idCliente);
            pst.setString(2, fecha);
            pst.setString(3, documento);
            pst.setString(4, estado);
            pst.setString(5, vendedor);
            pst.setInt(6,idDocumento);
            pst.setString(7, ip);
            resultado = pst.executeUpdate();
        } catch (Exception e) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
        } finally{
            cerrar();
        }

        return resultado;
    }

    public int updateSeguimineto() {
        int resultado = 0;

        try (Connection conex = new Conectar("rstcot").getCon()) {
            sql = "update seguimiento set "
                    + "idCliente=?,fecha=?, documento=?,estado=?, vendedor=?, idDocumento=?, ip=?"
                    + "where id=? ";
            pst = conex.prepareStatement(sql);
            pst.setInt(1, idCliente);
            pst.setString(2, fecha);
            pst.setString(3, documento);
            pst.setString(4, estado);
            pst.setString(5, vendedor);
            pst.setInt(6, idDocumento);
            pst.setString(7, ip);
            pst.setInt(8, id);
            resultado = pst.executeUpdate();

        } catch (Exception e) {
             Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
        } finally{
            cerrar();
        }
        return resultado;
    }

    public ArrayList listarXidCliente(int idClientex) {
        ArrayList<Seguimiento> lista = new ArrayList();

        try (Connection conex = new Conectar("rstcot").getCon()) {
            sql = "select * from seguimiento where idCliente=?";
            pst = conex.prepareStatement(sql);
            pst.setInt(1, idClientex);
            rs = pst.executeQuery();
            while (rs.next()) {
                lista.add(new Seguimiento(
                        rs.getInt("idCliente"), rs.getString("fecha"),
                        rs.getString("documento"), rs.getString("estado"),
                        rs.getString("vendedor"),rs.getInt("idDocumento"),
                        rs.getString("ip")
                ));
            }
        } catch (Exception e) {
             Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
        }finally{
            cerrar();
        }
        return lista;
    }

    public ArrayList listarXfecha(String fechax) {
        ArrayList<Seguimiento> lista = new ArrayList();

        try (Connection conex = new Conectar("rstcot").getCon()) {
            sql = "select * from seguimiento where fecha=?";
            pst = conex.prepareStatement(sql);
            pst.setString(1, fechax);
            rs = pst.executeQuery();
            while (rs.next()) {
                lista.add(new Seguimiento(
                        rs.getInt("idCliente"), rs.getString("fecha"),
                        rs.getString("documento"), rs.getString("estado"),
                        rs.getString("vendedor"),rs.getInt("idDocumento"),
                        rs.getString("ip")
                ));
            }

        } catch (Exception e) {
             Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
        }finally{
            cerrar();
        }
        return lista;
    }

    public ArrayList listarXdocumento(String documentox) {
        ArrayList<Seguimiento> lista = new ArrayList();

        try (Connection conex = new Conectar("rstcot").getCon()) {
            sql = "select * from seguimiento where documento=?";
            pst = conex.prepareStatement(sql);
            pst.setString(1, documento);
            rs = pst.executeQuery();
            while (rs.next()) {
                lista.add(new Seguimiento(
                        rs.getInt("idCliente"), rs.getString("fecha"),
                        rs.getString("documento"), rs.getString("estado"),
                        rs.getString("vendedor"),rs.getInt("idDocumento"),
                        rs.getString("ip")
                ));
            }

        } catch (Exception e) {
             Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
        }finally{
            cerrar();
        }
        return lista;
    }

    public ArrayList listarXestado(String estadox) {
        ArrayList<Seguimiento> lista = new ArrayList();

        try (Connection conex = new Conectar("rstcot").getCon()) {
            sql = "select * from seguimiento where estado=?";
            pst = conex.prepareStatement(sql);
            pst.setString(1, estadox);
            rs = pst.executeQuery();
            while (rs.next()) {
                lista.add(new Seguimiento(
                        rs.getInt("idCliente"), rs.getString("fecha"),
                        rs.getString("documento"), rs.getString("estado"),
                        rs.getString("vendedor"),rs.getInt("idDocumento"),
                        rs.getString("ip")
                ));
            }
        } catch (Exception e) {
             Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
        } finally{
            cerrar();
        }
        return lista;
    }

    public ArrayList listarXvendedor(String vendedorx) {
        ArrayList<Seguimiento> lista = new ArrayList();

        try (Connection conex = new Conectar("rstcot").getCon()) {
            sql = "select * from seguimiento where vendedor=?";
            pst = conex.prepareStatement(sql);
            pst.setString(1, vendedorx);
            rs = pst.executeQuery();
            while (rs.next()) {
                lista.add(new Seguimiento(
                        rs.getInt("idCliente"), rs.getString("fecha"),
                        rs.getString("documento"), rs.getString("estado"),
                        rs.getString("vendedor"),rs.getInt("idDocumento"),
                        rs.getString("ip")
                ));
            }

        } catch (Exception e) {
             Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
        } finally{
            cerrar();
        }
        return lista;
    }
    public Seguimiento buscarXid(int idx) {
        Seguimiento x = new Seguimiento();

        try (Connection conex = new Conectar("rstcot").getCon()) {
            sql = "select * from seguimiento where id=?";
            pst = conex.prepareStatement(sql);
            pst.setInt(1, idx);
            rs = pst.executeQuery();
            while (rs.next()) {
                x =new Seguimiento(
                        rs.getInt("idCliente"), rs.getString("fecha"),
                        rs.getString("documento"), rs.getString("estado"),
                        rs.getString("vendedor"),rs.getInt("idDocumento"),
                        rs.getString("ip")
                );
            }
        } catch (Exception e) {
             Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
        }finally{
            cerrar();
        }
        return x;
    }
    
 public Seguimiento buscarEspecifico(String documentox,int idDocumentox, String estadox ) {
        

        try (Connection conex = new Conectar("rstcot").getCon()) {
            sql = "select * from seguimiento where documento=? and idDocumento=? and lower(estado) like lower('%"+estadox+"%')";
            pst = conex.prepareStatement(sql);
            pst.setString(1, documentox);
            pst.setInt(2,idDocumentox);            
            
            rs = pst.executeQuery();
            
            while (rs.next()) {
                
                this.idCliente =rs.getInt("idCliente");
                this.fecha = rs.getString("fecha");
                this.documento = rs.getString("documento");
                this.estado=rs.getString("estado");
                this.vendedor = rs.getString("vendedor");
                this.idDocumento = rs.getInt("idDocumento");
                this.ip=rs.getString("ip");
               
            }
        } catch (Exception e) {
             Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
        } finally{
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

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

}
