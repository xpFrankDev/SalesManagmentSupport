package Clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Despacho {

    int id=0, idCot=0, eliminado=0;
    String numeroGuia="0", obs = "", vendedor, fecha, chofer, vehiculo;
    Double montoDespachado = 0.0,toneladas;
    String sql = "";
    PreparedStatement pst;
    ResultSet rs;
    Cotizacion cotizacion;

    public Despacho() {

    }

    public Despacho(int id) {
        this.id = id;
    }

    public Despacho(int id, int idCot) {
        this.id = id;
        this.idCot = idCot;
    }

    public Despacho(int idCot, String numeroGuia, String obs, String vendedor, String fecha, String chofer, String vehiculo, Double montoDespachado,Double toneladas) {
        this.idCot = idCot;
        this.numeroGuia = numeroGuia;
        this.vendedor = vendedor;
        this.fecha = fecha;
        this.chofer = chofer;
        this.vehiculo = vehiculo;
        this.montoDespachado = montoDespachado;
        this.toneladas = toneladas;
    }


    public Despacho(int id, int idCot, String numeroGuia, String obs, String vendedor, 
            String fecha, String chofer, String vehiculo, Double montoDespachado, Double toneladas) {
        this.id = id;
        this.idCot = idCot;
        this.numeroGuia = numeroGuia;
        this.vendedor = vendedor;
        this.fecha = fecha;
        this.chofer = chofer;
        this.vehiculo = vehiculo;
        this.obs = obs;
        this.montoDespachado = montoDespachado;
        this.toneladas = toneladas;
    }

    public int insert() {
        int rsp = 0;

        try (Connection con = new Conectar("rstcot").getCon()) {
            sql = "insert into despacho (idCot,numeroGuia,obs,vendedor,fecha,chofer,vehiculo,montoDespachado,toneladas)"
                    + "values (?,?,?,?,?,?,?,?,?)";
            pst = con.prepareStatement(sql);
            pst.setInt(1, idCot);
            pst.setString(2, numeroGuia);
            pst.setString(3, obs);
            pst.setString(4, vendedor);
            pst.setString(5, fecha);
            pst.setString(6, chofer);
            pst.setString(7, vehiculo);
            pst.setDouble(8, montoDespachado);
            pst.setDouble(9,toneladas);
            rsp = pst.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            Logger.getLogger(Despacho.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            cerrar();
        }

        return rsp;
    }

    public int update() {
        int rsp = 0;

        try (Connection con = new Conectar("rstcot").getCon()) {
            sql = "update despacho set idCot=?, numeroGuia=?, obs=?,vendedor=?, fecha=?,"
                    + "chofer=?, vehiculo=?, montoDespachado=? where id=?";
            pst = con.prepareStatement(sql);
            pst.setInt(1, idCot);
            pst.setString(2, numeroGuia);
            pst.setString(3, obs);
            pst.setString(4, vendedor);
            pst.setString(5, fecha);
            pst.setString(6, chofer);
            pst.setString(7, vehiculo);
            pst.setDouble(8, montoDespachado);
            pst.setInt(9, id);
            rsp = pst.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            Logger.getLogger(Despacho.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            cerrar();
        }

        return rsp;
    }

    public Despacho buscarID() {

        try (Connection con = new Conectar("rstcot").getCon()) {
            sql = "select * from despacho where id=?";
            pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            rs = pst.executeQuery();
            while (rs.next()) {
                this.id = rs.getInt("id");
                this.idCot = rs.getInt("idCot");
                this.numeroGuia = rs.getString("numeroGuia");
                this.obs = rs.getString("obs");
                this.vendedor = rs.getString("vendedor");
                this.fecha = rs.getString("fecha");
                this.chofer = rs.getString("chofer");
                this.vehiculo = rs.getString("vehiculo");
                this.montoDespachado = rs.getDouble("montoDespachado");
                cotizacion = new Cotizacion().buscarID(idCot);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            Logger.getLogger(Despacho.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            cerrar();
        }

        return this;
    }

    public Despacho buscarxIDCot(int idCoxt) {

        try (Connection con = new Conectar("rstcot").getCon()) {
            sql = "select * from despacho where idCot=? ";
            pst = con.prepareStatement(sql);
            pst.setInt(1, idCoxt);
            rs = pst.executeQuery();
            while (rs.next()) {
                this.id = rs.getInt("id");
                this.idCot = rs.getInt("idCot");
                this.numeroGuia = rs.getString("numeroGuia");
                this.obs = rs.getString("obs");
                this.vendedor = rs.getString("vendedor");
                this.fecha = rs.getString("fecha");
                this.chofer = rs.getString("chofer");
                this.vehiculo = rs.getString("vehiculo");
                this.montoDespachado = rs.getDouble("montoDespachado");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            Logger.getLogger(Despacho.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            cerrar();
        }

        return this;
    }
public Despacho buscarxGuia(String guiax) {

        try (Connection con = new Conectar("rstcot").getCon()) {
            sql = "select * from despacho where numeroGuia=? ";
            pst = con.prepareStatement(sql);
            pst.setString(1, guiax);
            rs = pst.executeQuery();
            while (rs.next()) {
                this.id = rs.getInt("id");
                this.idCot = rs.getInt("idCot");
                this.numeroGuia = rs.getString("numeroGuia");
                this.obs = rs.getString("obs");
                this.vendedor = rs.getString("vendedor");
                this.fecha = rs.getString("fecha");
                this.chofer = rs.getString("chofer");
                this.vehiculo = rs.getString("vehiculo");
                this.montoDespachado = rs.getDouble("montoDespachado");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            Logger.getLogger(Despacho.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            cerrar();
        }

        return this;
    }
    public Despacho buscarID(int idx) {

        try (Connection con = new Conectar("rstcot").getCon()) {
            sql = "select * from despacho where id=?";
            pst = con.prepareStatement(sql);
            pst.setInt(1, idx);
            rs = pst.executeQuery();
            while (rs.next()) {
                this.id = rs.getInt("id");
                this.idCot = rs.getInt("idCot");
                this.numeroGuia = rs.getString("numeroGuia");
                this.obs = rs.getString("obs");
                this.vendedor = rs.getString("vendedor");
                this.fecha = rs.getString("fecha");
                this.chofer = rs.getString("chofer");
                this.vehiculo = rs.getString("vehiculo");
                this.montoDespachado = rs.getDouble("montoDespachado");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            Logger.getLogger(Despacho.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            cerrar();
        }

        return this;
    }

    public ArrayList listarGeneral() {

        ArrayList<Despacho> lista = new ArrayList();
        try (Connection con = new Conectar("rstcot").getCon()) {
            sql = "select * from despacho";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {

                lista.add(new Despacho(
                        rs.getInt("id"), rs.getInt("idCot"), rs.getString("numeroGuia"),
                        rs.getString("obs"), rs.getString("vendedor"), rs.getString("fecha"),
                        rs.getString("chofer"), rs.getString("vehiculo"), rs.getDouble("montoDespachado"),rs.getDouble("toneladas")
                ));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            Logger.getLogger(Despacho.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            cerrar();
        }

        return lista;
    }

    public ArrayList listarxCot(int idCotx) {
        ArrayList<Despacho> lista = new ArrayList();
        try (Connection con = new Conectar("rstcot").getCon()) {
            sql = "select * from despacho where idCot=?";
            pst = con.prepareStatement(sql);
            pst.setInt(1, idCotx);
            rs = pst.executeQuery();
            while (rs.next()) {
                lista.add(new Despacho(
                        rs.getInt("id"), rs.getInt("idCot"), rs.getString("numeroGuia"),
                        rs.getString("obs"), rs.getString("vendedor"), rs.getString("fecha"),
                        rs.getString("chofer"), rs.getString("vehiculo"), rs.getDouble("montoDespachado"),rs.getDouble("toneladas")
                ));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            Logger.getLogger(Despacho.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            cerrar();
        }
        return lista;
    }

    public ArrayList listarxVendedor(String vendedox) {
        ArrayList<Despacho> lista = new ArrayList();
        try (Connection con = new Conectar("rstcot").getCon()) {
            sql = "select * from despacho where vendedor=?";
            pst = con.prepareStatement(sql);
            pst.setString(1, vendedox);
            rs = pst.executeQuery();
            while (rs.next()) {
                lista.add(new Despacho(
                        rs.getInt("id"), rs.getInt("idCot"), rs.getString("numeroGuia"),
                        rs.getString("obs"), rs.getString("vendedor"), rs.getString("fecha"),
                        rs.getString("chofer"), rs.getString("vehiculo"), rs.getDouble("montoDespachado"),rs.getDouble("toneladas")
                ));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            Logger.getLogger(Despacho.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            cerrar();
        }
        return lista;
    }

    public ArrayList listarxFecha(String fechax) {
        ArrayList<Despacho> lista = new ArrayList();
        try (Connection con = new Conectar("rstcot").getCon()) {
            sql = "select * from despacho where vendedor=?";
            pst = con.prepareStatement(sql);
            pst.setString(1, fechax);
            rs = pst.executeQuery();
            while (rs.next()) {
                lista.add(new Despacho(
                        rs.getInt("id"), rs.getInt("idCot"), rs.getString("numeroGuia"),
                        rs.getString("obs"), rs.getString("vendedor"), rs.getString("fecha"),
                        rs.getString("chofer"), rs.getString("vehiculo"), rs.getDouble("montoDespachado"),rs.getDouble("toneladas")
                ));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            Logger.getLogger(Despacho.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            cerrar();
        }
        return lista;
    }

    public ArrayList listarxChofer(String choferx) {
        ArrayList<Despacho> lista = new ArrayList();
        try (Connection con = new Conectar("rstcot").getCon()) {
            sql = "select * from despacho where chofer=?";
            pst = con.prepareStatement(sql);
            pst.setString(1, choferx);
            rs = pst.executeQuery();
            while (rs.next()) {
                lista.add(new Despacho(
                        rs.getInt("id"), rs.getInt("idCot"), rs.getString("numeroGuia"),
                        rs.getString("obs"), rs.getString("vendedor"), rs.getString("fecha"),
                        rs.getString("chofer"), rs.getString("vehiculo"), rs.getDouble("montoDespachado"),rs.getDouble("toneladas")
                ));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            Logger.getLogger(Despacho.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            cerrar();
        }
        return lista;
    }

    public ArrayList listarxVehiculo(String vehiculox) {
        ArrayList<Despacho> lista = new ArrayList();
        try (Connection con = new Conectar("rstcot").getCon()) {
            sql = "select * from despacho where chofer=?";
            pst = con.prepareStatement(sql);
            pst.setString(1, vehiculox);
            rs = pst.executeQuery();
            while (rs.next()) {
                lista.add(new Despacho(
                        rs.getInt("id"), rs.getInt("idCot"), rs.getString("numeroGuia"),
                        rs.getString("obs"), rs.getString("vendedor"), rs.getString("fecha"),
                        rs.getString("chofer"), rs.getString("vehiculo"), rs.getDouble("montoDespachado"),rs.getDouble("toneladas")
                ));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            Logger.getLogger(Despacho.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            cerrar();
        }
        return lista;
    }
public ArrayList listarxGuia(String datox) {
        ArrayList<Despacho> lista = new ArrayList();
        try (Connection con = new Conectar("rstcot").getCon()) {
            sql = "select * from despacho where lower (numeroGuia) like lower ('%"+datox+"%')";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                lista.add(new Despacho(
                        rs.getInt("id"), rs.getInt("idCot"), rs.getString("numeroGuia"),
                        rs.getString("obs"), rs.getString("vendedor"), rs.getString("fecha"),
                        rs.getString("chofer"), rs.getString("vehiculo"), rs.getDouble("montoDespachado"),rs.getDouble("toneladas")
                ));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            Logger.getLogger(Despacho.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            cerrar();
        }
        return lista;
    }
    public int deleteLogico(int eliminadox) {
        int rsp = 0;

        try (Connection con = new Conectar("rstcot").getCon()) {
            sql = " update despacho set eliminado =? where id=?";
            pst = con.prepareStatement(sql);
            pst.setInt(1, eliminadox);
            pst.setInt(2, id);
            rsp = pst.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            Logger.getLogger(Despacho.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            cerrar();
        }

        return rsp;
    }

    public Double getMontoDespachado(int idCotx) {
        Double temp = 0.0;
        try (Connection con = new Conectar("rstcot").getCon()) {

            String sqlDespacho = "select * from despacho where idCot =?";
            pst = con.prepareStatement(sqlDespacho);
            pst.setInt(1, idCotx);
            rs = pst.executeQuery();
            while (rs.next()) {
                temp += rs.getDouble("montoDespachado");
            }
            temp = Double.parseDouble(new DecimalFormat("#.00").format(temp));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            Logger.getLogger(Despacho.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            cerrar();
        }
        return temp;
    }
 public Double getMontoDespachadoMES(int mesx) {
        Double temp = 0.0;
        try (Connection con = new Conectar("rstcot").getCon()) {

            String sqlDespacho = "select * from despacho where SUBSTRING_INDEX(SUBSTRING_INDEX(fecha,'/',-2),'/',1) = ?";
            pst = con.prepareStatement(sqlDespacho);
            pst.setInt(1, mesx);
            rs = pst.executeQuery();
            while (rs.next()) {
                temp += rs.getDouble("montoDespachado");
            }
            temp = Double.parseDouble(new DecimalFormat("#.00").format(temp));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            Logger.getLogger(Despacho.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            cerrar();
        }
        return temp;
    }
 public Double getToneladasDespachadoMES(int mesx) {
        Double temp = 0.0;
        try (Connection con = new Conectar("rstcot").getCon()) {

            String sqlDespacho = "select toneladas,fecha from despacho where SUBSTRING_INDEX(SUBSTRING_INDEX(fecha,'/',-2),'/',1) = ?";
            pst = con.prepareStatement(sqlDespacho);
            pst.setInt(1, mesx);
            rs = pst.executeQuery();
            while (rs.next()) {
                temp += rs.getDouble("toneladas");
            }
            temp = Double.parseDouble(new DecimalFormat("#.000").format(temp));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            Logger.getLogger(Despacho.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            cerrar();
        }
        return temp;
    }
 public Double getMontoDespachadoMESActual() {
        Double temp = 0.0;
        try (Connection con = new Conectar("rstcot").getCon()) {

            String sqlDespacho = "select * from despacho where SUBSTRING_INDEX(SUBSTRING_INDEX(fecha,'/',-2),'/',1) = month(curdate())";
            pst = con.prepareStatement(sqlDespacho);
            rs = pst.executeQuery();
            while (rs.next()) {
                temp += rs.getDouble("montoDespachado");
            }
            temp = Double.parseDouble(new DecimalFormat("#.00").format(temp));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            Logger.getLogger(Despacho.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            cerrar();
        }
        return temp;
    }
  public Double getToneladasDespachadoMESActual() {
        Double temp = 0.0;
        try (Connection con = new Conectar("rstcot").getCon()) {

            String sqlDespacho = "select toneladas,fecha from despacho where SUBSTRING_INDEX(SUBSTRING_INDEX(fecha,'/',-2),'/',1) = month(curdate())";
            pst = con.prepareStatement(sqlDespacho);
            rs = pst.executeQuery();
            while (rs.next()) {
                temp += rs.getDouble("toneladas");
            }
            temp = Double.parseDouble(new DecimalFormat("#.00").format(temp));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            Logger.getLogger(Despacho.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            cerrar();
        }
        return temp;
    }
 /*public Double getToneladasDespachadasMES(int mesx) {
        Double temp = 0.0;
        try (Connection con = new Conectar("rstcot").getCon()) {

            String sqlDespacho = "select * from despacho where SUBSTRING_INDEX(SUBSTRING_INDEX(fecha,'/',-2),'/',1) =?";
            pst = con.prepareStatement(sqlDespacho);
            pst.setInt(1, mesx);
            rs = pst.executeQuery();
            while (rs.next()) {
            
            
            
            }
            temp = Double.parseDouble(new DecimalFormat("#.00").format(temp));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            Logger.getLogger(Despacho.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            cerrar();
        }
        return temp;
    }*/
    public String getLastFechaDespacho(int idCotx) {
        String temp = "-";
        try (Connection con = new Conectar("rstcot").getCon()) {

            String sqlDespacho = "select * from despacho where idCot =?";
            pst = con.prepareStatement(sqlDespacho);
            pst.setInt(1, idCotx);
            rs = pst.executeQuery();
            while (rs.next()) {
                temp = rs.getString("fecha");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            Logger.getLogger(Despacho.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            cerrar();
        }
        return temp;
    }

    public int deleteTotal() {
        int rsp = 0;

        try (Connection con = new Conectar("rstcot").getCon()) {
            sql = " delete from despacho where id=?";
            pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            rsp = pst.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            Logger.getLogger(Despacho.class.getName()).log(Level.SEVERE, null, e);
        }finally{
            cerrar();
        }
        return rsp;
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

    public String getNumeroGuia() {
        return numeroGuia;
    }

    public void setNumeroGuia(String numeroGuia) {
        this.numeroGuia = numeroGuia;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
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

    public String getChofer() {
        return chofer;
    }

    public void setChofer(String chofer) {
        this.chofer = chofer;
    }

    public String getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(String vehiculo) {
        this.vehiculo = vehiculo;
    }

    public int getEliminado() {
        return eliminado;
    }

    public void setEliminado(int eliminado) {
        this.eliminado = eliminado;
    }

    public Double getMontoDespachado() {
        return montoDespachado;
    }

    public void setMontoDespachado(Double montoDespachado) {
        this.montoDespachado = montoDespachado;
    }

    @Override
    public String toString() {
        return "Despacho{" + "id=" + id + ", idCot=" + idCot + ", eliminado=" + eliminado + ", numeroGuia=" + numeroGuia + ", obs=" + obs +
                ", vendedor=" + vendedor + ", fecha=" + fecha + ", chofer=" + chofer + ", vehiculo=" + vehiculo + ", montoDespachado=" +
                montoDespachado + ", toneladas=" + toneladas + '}';
    }

    

    public Cotizacion getCotizacion() {
        return new Cotizacion().buscarID(getIdCot());
    }

    public void setCotizacion(Cotizacion cotizacion) {
        this.cotizacion = cotizacion;
    }

    public Double getToneladas() {
        return toneladas;
    }

    public void setToneladas(Double toneladas) {
        this.toneladas = toneladas;
    }

    
    
    
}
