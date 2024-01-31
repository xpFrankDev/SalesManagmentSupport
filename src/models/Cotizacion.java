package Clases;

import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class Cotizacion {

    int id, idPresupuesto, idCliente, idFormaPago, eliminado = 0;
    String numeroCot, responsable, estado = "Cot. Creada - Esperando por Cliente", obs = "sin obs",fechaConfPlano,
            cliente, formaPago, fecha, tiempoFabricacion, numOt, fechaConfOC;
    Double monto, montoOc, toneladas = 0.0;
    PreparedStatement pst;
    ResultSet rs;
    String sql = "";
    Presupuesto presupuesto;
    String nombreProducto = "";

    public Cotizacion() {

    }

    public Cotizacion(int id) {
        this.id = id;
    }

    // Constructor para obtener todos los datos de la cOT
    public Cotizacion(int id, int idPresupuesto, String numeroCot, String numOt, String fecha, String cliente,
            String responsable, String nombreProducto, Double monto, Double montoOc, String estado,
            String fechaConfOC, String obs, int idFormaPago, int eliminado, String tiempoFabricacion, Double toneladasx, String fechaConfPlano) {

        this.id = id;
        this.idPresupuesto = idPresupuesto;
        this.numeroCot = numeroCot;
        this.numOt = numOt;
        this.fecha = fecha;
        this.cliente = cliente;
        this.responsable = responsable;
        this.nombreProducto = nombreProducto;
        this.monto = monto;
        this.montoOc = montoOc;
        this.estado = estado;
        this.fechaConfOC = fechaConfOC;
        this.obs = obs;
        this.idFormaPago = idFormaPago;
        this.eliminado = eliminado;
        this.tiempoFabricacion = tiempoFabricacion;
        this.toneladas = toneladasx;
        this.fechaConfPlano = fechaConfPlano;
    }

    public Cotizacion(int idPresupuesto, int idFormaPago, String numeroCot, String responsable, String fecha, String tiempoFabricacion, Double monto, String cliente, String nombreProducto) {
        this.idPresupuesto = idPresupuesto;
        this.idFormaPago = idFormaPago;
        this.numeroCot = numeroCot;
        this.responsable = responsable;
        this.fecha = fecha;
        this.tiempoFabricacion = tiempoFabricacion;
        this.monto = monto;
        this.cliente = cliente;
        this.nombreProducto = nombreProducto;
    }

    public int setOT(String numOtx, int idx) {
        int result = 0;
        try (Connection con = new Conectar("rstcot").getCon()) {
            sql = " update cotizacion set numOt =? where id=?";
            pst = con.prepareStatement(sql);
            pst.setString(1, numOtx);
            pst.setInt(2, idx);
            result = pst.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            Logger.getLogger(Cotizacion.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            cerrar();
        }

        return result;
    }

    public Cotizacion buscarNumCot(String numCotx) {
        sql = "";
        try (Connection con = new Conectar("rstcot").getCon()) {
            sql = "select * from cotizacion where numeroCot =? and eliminado=0";

            pst = con.prepareStatement(sql);
            pst.setString(1, numCotx);
            rs = pst.executeQuery();
            while (rs.next()) {
                this.id = rs.getInt("id");
                this.idPresupuesto = rs.getInt("idPresupuesto");
                this.numeroCot = rs.getString("numeroCot");
                this.numOt = rs.getString("numOt");
                this.fecha = rs.getString("fecha");
                this.cliente = rs.getString("cliente");
                this.responsable = rs.getString("responsable");
                this.nombreProducto = rs.getString("nombreProducto");
                this.monto = rs.getDouble("monto");
                this.montoOc = rs.getDouble("montoOc");
                this.estado = rs.getString("estado");
                this.fechaConfOC = rs.getString("fechaConfOC");
                this.obs = rs.getString("obs");
                this.idFormaPago = rs.getInt("idFormaPago");
                this.eliminado = rs.getInt("eliminado");
                this.tiempoFabricacion = rs.getString("tiempoFabricacion");
                this.toneladas = rs.getDouble("toneladas");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            Logger.getLogger(Cotizacion.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            cerrar();
        }
        return this;
    }

    public Cotizacion buscarID(int idx) {
        try (Connection con = new Conectar("rstcot").getCon()) {
            sql = "select * from cotizacion where id=? and eliminado=0";

            pst = con.prepareStatement(sql);
            pst.setInt(1, idx);
            rs = pst.executeQuery();
            while (rs.next()) {
                this.id = rs.getInt("id");
                this.idPresupuesto = rs.getInt("idPresupuesto");
                this.numeroCot = rs.getString("numeroCot");
                this.numOt = rs.getString("numOt");
                this.fecha = rs.getString("fecha");
                this.cliente = rs.getString("cliente");
                this.responsable = rs.getString("responsable");
                this.nombreProducto = rs.getString("nombreProducto");
                this.monto = rs.getDouble("monto");
                this.montoOc = rs.getDouble("montoOc");
                this.estado = rs.getString("estado");
                this.fechaConfOC = rs.getString("fechaConfOC");
                this.fechaConfPlano=rs.getString("fechaConfPlano");
                this.obs = rs.getString("obs");
                this.idFormaPago = rs.getInt("idFormaPago");
                this.eliminado = rs.getInt("eliminado");
                this.tiempoFabricacion = rs.getString("tiempoFabricacion");
                this.toneladas = rs.getDouble("toneladas");
                
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            Logger.getLogger(Cotizacion.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            cerrar();
        }
        return this;
    }

    public int insert() {
        int rsp = 0;

        try (Connection con = new Conectar("rstcot").getCon()) {
            sql = "insert into cotizacion (idPresupuesto,numeroCot,fecha,responsable,estado,obs,"
                    + "idFormaPago,eliminado,tiempoFabricacion,monto,cliente,nombreProducto)"
                    + " values (?,?,?,?,   ?,?,?,?,?,?,?,?) ";
            pst = con.prepareStatement(sql);
            pst.setInt(1, idPresupuesto);
            pst.setString(2, numeroCot);
            pst.setString(3, fecha);
            pst.setString(4, responsable);
            pst.setString(5, estado);
            pst.setString(6, obs);
            pst.setInt(7, idFormaPago);
            pst.setInt(8, eliminado);
            pst.setString(9, tiempoFabricacion);
            pst.setDouble(10, monto);
            pst.setString(11, cliente);
            pst.setString(12, nombreProducto);
            rsp = pst.executeUpdate();

        } catch (Exception e) {
            Logger.getLogger(Cotizacion.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e);
        } finally {
            cerrar();
        }

        return rsp;
    }

    public int update() {
        int rsp = 0;

        try (Connection con = new Conectar("rstcot").getCon()) {
            sql = "update cotizacion set idPresupuesto=?, numeroCot=?, fecha=?, responsable=?,"
                    + " estado=?, obs=?, idFormaPago=?, tiempoFabricacion=?, monto=?, montoOc=? where id=?";
            pst = con.prepareStatement(sql);
            pst.setInt(1, idPresupuesto);
            pst.setString(2, numeroCot);
            pst.setString(3, fecha);
            pst.setString(4, responsable);
            pst.setString(5, estado);
            pst.setString(6, obs);
            pst.setInt(7, idFormaPago);
            pst.setString(8, tiempoFabricacion);
            pst.setDouble(9, monto);
            pst.setDouble(10, montoOc);
            pst.setInt(11, id);
            rsp = pst.executeUpdate();
        } catch (Exception e) {
            Logger.getLogger(Cotizacion.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e);
        } finally {
            cerrar();
        }

        return rsp;
    }
public int updateFechaConfPlano(String fechax) {
        int rsp = 0;
        try (Connection con = new Conectar("rstcot").getCon()) {
            sql = "update cotizacion set fechaConfPlano where id=?";
            pst = con.prepareStatement(sql);
            pst.setString(1, fechax);
            pst.setInt(2, id);
            rsp = pst.executeUpdate();
        } catch (Exception e) {
            Logger.getLogger(Cotizacion.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e);
        } finally {
            cerrar();
        }
        return rsp;
    }
    public int updateToneladas(Double toneladasx) {
        int rsp = 0;

        try (Connection con = new Conectar("rstcot").getCon()) {
            sql = "update cotizacion set toneladas=? where id=?";
            pst = con.prepareStatement(sql);
            pst.setDouble(1, toneladasx);
            pst.setInt(2, id);
            rsp = pst.executeUpdate();
        } catch (Exception e) {
            Logger.getLogger(Cotizacion.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e);
        } finally {
            cerrar();
        }

        return rsp;
    }

    public int updateMontos() {
        int result = 0;

        try (Connection con = new Conectar("rstcot").getCon()) {
            sql = "update cotizacion set monto=?, montoOc=? where id=?";
            pst = con.prepareStatement(sql);
            pst.setDouble(1, monto);
            pst.setDouble(2, montoOc);
            pst.setInt(3, id);
            result = pst.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            Logger.getLogger(Ganancia.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            cerrar();
        }

        return result;
    }

    public int getLastCotizacion() {
        int resultado = 0;
        //select id from solicitud order by id desc limit 1
        try (Connection conex = new Conectar("rstcot").getCon()) {
            sql = "select id from cotizacion order by id desc limit 1";
            pst = conex.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                resultado = rs.getInt("id");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            Logger.getLogger(Ganancia.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            cerrar();
        }
        return resultado;
    }

    public int deleteLogico() {
        int rsp = 0;

        try (Connection con = new Conectar("rstcot").getCon()) {
            sql = "update eliminado=? where id=?";
            pst = con.prepareStatement(sql);
            pst.setInt(1, eliminado);
            pst.setInt(2, id);
            rsp = pst.executeUpdate();
        } catch (Exception e) {
            Logger.getLogger(Cotizacion.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e);
        } finally {
            cerrar();
        }

        return rsp;
    }

    public int deleteTotal() {
        int rsp = 0;

        try (Connection con = new Conectar("rstcot").getCon()) {
            sql = "delete from cotizacion where id=?";
            pst = con.prepareStatement(sql);
            pst.setInt(1, id);
        } catch (Exception e) {
            Logger.getLogger(Cotizacion.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e);
        } finally {
            cerrar();
        }

        return rsp;
    }

    public ArrayList listarxMesVendedor(String Mes, String Vendedorx) {
        ArrayList<Cotizacion> lista = new ArrayList();
        try (Connection con = new Conectar("rstcot").getCon()) {
            sql = "select * from cotizacion where SUBSTRING_INDEX(SUBSTRING_INDEX(fecha,'/',-2),'/',1) = ? && eliminado =0 && responsable=?";
            pst = con.prepareStatement(sql);
            pst.setString(1, Mes);
            pst.setString(2, Vendedorx);
            rs = pst.executeQuery();
            while (rs.next()) {
                lista.add(new Cotizacion(
                        rs.getInt("id"), rs.getInt("idPresupuesto"),
                        rs.getString("numeroCot"), rs.getString("numOt"),
                        rs.getString("fecha"), rs.getString("cliente"),
                        rs.getString("responsable"), rs.getString("nombreProducto"),
                        rs.getDouble("monto"), rs.getDouble("montoOc"),
                        rs.getString("estado"), rs.getString("fechaConfOC"),
                        rs.getString("obs"), rs.getInt("idFormaPago"),
                        rs.getInt("eliminado"), rs.getString("tiempoFabricacion"),
                        rs.getDouble("toneladas"),rs.getString("fechaConfPlano")
                ));
            }
        } catch (Exception e) {
            Logger.getLogger(Cotizacion.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e);
        } finally {
            cerrar();
        }
        return lista;
    }

    public ArrayList listarCotxMes(String Mes) {
        ArrayList<Cotizacion> lista = new ArrayList();
        try (Connection con = new Conectar("rstcot").getCon()) {
            sql = "select * from cotizacion where SUBSTRING_INDEX(SUBSTRING_INDEX(fecha,'/',-2),'/',1) = ? && eliminado =0";
            pst = con.prepareStatement(sql);
            pst.setString(1, Mes);

            rs = pst.executeQuery();
            while (rs.next()) {
                lista.add(new Cotizacion(
                        rs.getInt("id"), rs.getInt("idPresupuesto"),
                        rs.getString("numeroCot"), rs.getString("numOt"),
                        rs.getString("fecha"), rs.getString("cliente"),
                        rs.getString("responsable"), rs.getString("nombreProducto"),
                        rs.getDouble("monto"), rs.getDouble("montoOc"),
                        rs.getString("estado"), rs.getString("fechaConfOC"),
                        rs.getString("obs"), rs.getInt("idFormaPago"),
                        rs.getInt("eliminado"), rs.getString("tiempoFabricacion"), rs.getDouble("toneladas"),rs.getString("fechaConfPlano")
                ));
            }
        } catch (Exception e) {
            Logger.getLogger(Cotizacion.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e);
        } finally {
            cerrar();
        }
        return lista;
    }

    public ArrayList listarFecha(String fechax) {
        rs = null;
        ArrayList<Cotizacion> lista = new ArrayList();
        try (Connection con = new Conectar("rstcot").getCon()) {
            sql = "select * from cotizacion where fecha=? && eliminado =0";
            pst = con.prepareStatement(sql);
            pst.setString(1, fechax);
            rs = pst.executeQuery();
            while (rs.next()) {
                lista.add(new Cotizacion(
                        rs.getInt("id"), rs.getInt("idPresupuesto"),
                        rs.getString("numeroCot"), rs.getString("numOt"),
                        rs.getString("fecha"), rs.getString("cliente"),
                        rs.getString("responsable"), rs.getString("nombreProducto"),
                        rs.getDouble("monto"), rs.getDouble("montoOc"),
                        rs.getString("estado"), rs.getString("fechaConfOC"),
                        rs.getString("obs"), rs.getInt("idFormaPago"),
                        rs.getInt("eliminado"), rs.getString("tiempoFabricacion"), rs.getDouble("toneladas"),rs.getString("fechaConfPlano")
                ));
            }
        } catch (Exception e) {
            Logger.getLogger(Cotizacion.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e);
        } finally {
            cerrar();
        }
        return lista;
    }

    public void updateFechaConfOC(String fechax) {
        try (Connection con = new Conectar("rstcot").getCon()) {
            sql = "update cotizacion set fechaConfOC=? where id=?";
            pst = con.prepareStatement(sql);
            pst.setString(1, fechax);
            pst.setInt(2, id);
            pst.execute();
        } catch (Exception e) {
            Logger.getLogger(Cotizacion.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e);
        } finally {
            cerrar();
        }
    }

    public ArrayList listarFechaVendedor(String fechax, String vendedorx) {
        ArrayList<Cotizacion> lista = new ArrayList();
        try (Connection con = new Conectar("rstcot").getCon()) {
            sql = "select * from cotizacion where fecha=? && eliminado =0 && responsable=?";
            pst = con.prepareStatement(sql);
            pst.setString(1, fechax);
            pst.setString(2, vendedorx);
            rs = pst.executeQuery();
            while (rs.next()) {
                lista.add(new Cotizacion(
                        rs.getInt("id"), rs.getInt("idPresupuesto"),
                        rs.getString("numeroCot"), rs.getString("numOt"),
                        rs.getString("fecha"), rs.getString("cliente"),
                        rs.getString("responsable"), rs.getString("nombreProducto"),
                        rs.getDouble("monto"), rs.getDouble("montoOc"),
                        rs.getString("estado"), rs.getString("fechaConfOC"),
                        rs.getString("obs"), rs.getInt("idFormaPago"),
                        rs.getInt("eliminado"), rs.getString("tiempoFabricacion"), rs.getDouble("toneladas"),rs.getString("fechaConfPlano")
                ));
            }

        } catch (Exception e) {
            Logger.getLogger(Cotizacion.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e);
        } finally {
            cerrar();
        }
        return lista;
    }

    public ArrayList listarResponsable(String responsablex) {
        ArrayList<Cotizacion> lista = new ArrayList();
        try (Connection con = new Conectar("rstcot").getCon()) {
            sql = "select * from cotizacion where responsable=? && eliminado =0";
            pst = con.prepareStatement(sql);
            pst.setString(1, responsablex);
            rs = pst.executeQuery();
            while (rs.next()) {
                lista.add(new Cotizacion(
                        rs.getInt("id"), rs.getInt("idPresupuesto"),
                        rs.getString("numeroCot"), rs.getString("numOt"),
                        rs.getString("fecha"), rs.getString("cliente"),
                        rs.getString("responsable"), rs.getString("nombreProducto"),
                        rs.getDouble("monto"), rs.getDouble("montoOc"),
                        rs.getString("estado"), rs.getString("fechaConfOC"),
                        rs.getString("obs"), rs.getInt("idFormaPago"),
                        rs.getInt("eliminado"), rs.getString("tiempoFabricacion"), rs.getDouble("toneladas"),rs.getString("fechaConfPlano")
                ));
            }
        } catch (Exception e) {
            Logger.getLogger(Cotizacion.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e);
        } finally {
            cerrar();
        }
        return lista;
    }

    public int getIdSolicitud() {
        int temp = 0;

        try (Connection con = new Conectar("rstcot").getCon()) {
            sql = "select c.id,c.idPresupuesto,p.id,p.idSolicitud from cotizacion as c "
                    + "inner join presupuesto as p on c.idPresupuesto = p.id "
                    + " where c.id =?";
            pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            rs = pst.executeQuery();
            if (rs.next()) {
                temp = rs.getInt("p.idSolicitud");
            }
        } catch (Exception e) {
            Logger.getLogger(Cotizacion.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e);
        } finally {
            cerrar();
        }
        return temp;
    }

    public int getIdSolicitud(int idx) {
        int temp = 0;
        try (Connection con = new Conectar("rstcot").getCon()) {
            sql = "select c.id,c.idPresupuesto,p.id,p.idSolicitud from cotizacion as c "
                    + "inner join presupuesto as p on c.idPresupuesto = p.id "
                    + " where c.id =?";
            pst = con.prepareStatement(sql);
            pst.setInt(1, idx);
            rs = pst.executeQuery();

            if (rs.next()) {
                temp = rs.getInt("p.idSolicitud");
            }
        } catch (Exception e) {
            Logger.getLogger(Cotizacion.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e);
        } finally {
            cerrar();
        }
        return temp;
    }

    public ArrayList listarEstado(String estadox) {
        ArrayList<Cotizacion> lista = new ArrayList();
        try (Connection con = new Conectar("rstcot").getCon()) {
            sql = "select * from cotizacion where lower(estado) like lower('%" + estadox + "%') && eliminado =0";
            pst = con.prepareStatement(sql);

            rs = pst.executeQuery();
            while (rs.next()) {

                //String cliente = new Presupuesto(rs.getInt("idPresupuesto")).getCliente();
                lista.add(new Cotizacion(
                        rs.getInt("id"), rs.getInt("idPresupuesto"),
                        rs.getString("numeroCot"), rs.getString("numOt"),
                        rs.getString("fecha"), rs.getString("cliente"),
                        rs.getString("responsable"), rs.getString("nombreProducto"),
                        rs.getDouble("monto"), rs.getDouble("montoOc"),
                        rs.getString("estado"), rs.getString("fechaConfOC"),
                        rs.getString("obs"), rs.getInt("idFormaPago"),
                        rs.getInt("eliminado"), rs.getString("tiempoFabricacion"), rs.getDouble("toneladas"),rs.getString("fechaConfPlano")
                ));

            }
        } catch (Exception e) {
            Logger.getLogger(Cotizacion.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e);
        } finally {
            cerrar();
        }
        return lista;
    }

    public ArrayList listarFormaPago(int idFormaPagox) {
        ArrayList<Cotizacion> lista = new ArrayList();
        try (Connection con = new Conectar("rstcot").getCon()) {
            sql = "select * from cotizacion where idFormaPago=? && eliminado =0";
            pst = con.prepareStatement(sql);
            pst.setInt(1, idFormaPagox);
            rs = pst.executeQuery();
            while (rs.next()) {
                new Cotizacion(
                        rs.getInt("id"), rs.getInt("idPresupuesto"),
                        rs.getString("numeroCot"), rs.getString("numOt"),
                        rs.getString("fecha"), rs.getString("cliente"),
                        rs.getString("responsable"), rs.getString("nombreProducto"),
                        rs.getDouble("monto"), rs.getDouble("montoOc"),
                        rs.getString("estado"), rs.getString("fechaConfOC"),
                        rs.getString("obs"), rs.getInt("idFormaPago"),
                        rs.getInt("eliminado"), rs.getString("tiempoFabricacion"), rs.getDouble("toneladas"),rs.getString("fechaConfPlano")
                );
            }
        } catch (Exception e) {
            Logger.getLogger(Cotizacion.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e);
        } finally {
            cerrar();
        }
        return lista;
    }

    public ArrayList ListadoCotAvance() {
        ArrayList<Cotizacion> lista = new ArrayList();
        try (Connection con = new Conectar("rstcot").getCon()) {
            sql = " select * from cotizacion where estado !='Rechazado' and eliminado = 0 and numOt != 0";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                lista.add(
                        new Cotizacion(
                                rs.getInt("id"), rs.getInt("idPresupuesto"),
                                rs.getString("numeroCot"), rs.getString("numOt"),
                                rs.getString("fecha"), rs.getString("cliente"),
                                rs.getString("responsable"), rs.getString("nombreProducto"),
                                rs.getDouble("monto"), rs.getDouble("montoOc"),
                                rs.getString("estado"), rs.getString("fechaConfOC"),
                                rs.getString("obs"), rs.getInt("idFormaPago"),
                                rs.getInt("eliminado"), rs.getString("tiempoFabricacion"), rs.getDouble("toneladas"),rs.getString("fechaConfPlano")
                        )
                );
            }

        } catch (Exception e) {
            Logger.getLogger(Cotizacion.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e);
        } finally {
            cerrar();
        }

        return lista;
    }
public ArrayList ListadoCotAvance(String texto) {
        ArrayList<Cotizacion> lista = new ArrayList();
        try (Connection con = new Conectar("rstcot").getCon()) {
            sql = " select * from cotizacion where estado !='Rechazado' and eliminado = 0 and numOt != 0 and "
                    + "( lower (numeroCot) like lower ('%"+texto+"%') or "
                    + "  lower (numOt) like lower ('%"+texto+"%') or "
                    + "  lower (cliente) like lower ('%"+texto+"%') ) ";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                lista.add(
                        new Cotizacion(
                                rs.getInt("id"), rs.getInt("idPresupuesto"),
                                rs.getString("numeroCot"), rs.getString("numOt"),
                                rs.getString("fecha"), rs.getString("cliente"),
                                rs.getString("responsable"), rs.getString("nombreProducto"),
                                rs.getDouble("monto"), rs.getDouble("montoOc"),
                                rs.getString("estado"), rs.getString("fechaConfOC"),
                                rs.getString("obs"), rs.getInt("idFormaPago"),
                                rs.getInt("eliminado"), rs.getString("tiempoFabricacion"), rs.getDouble("toneladas"),rs.getString("fechaConfPlano")
                        )
                );
            }

        } catch (Exception e) {
            Logger.getLogger(Cotizacion.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e);
        } finally {
            cerrar();
        }

        return lista;
    }
    public ArrayList listarEliminado(int eliminadox) {
        ArrayList<Cotizacion> lista = new ArrayList();
        try (Connection con = new Conectar("rstcot").getCon()) {
            sql = "select * from cotizacion where eliminado=? ";
            pst = con.prepareStatement(sql);
            pst.setInt(1, eliminadox);
            rs = pst.executeQuery();
            while (rs.next()) {
                new Cotizacion(
                        rs.getInt("id"), rs.getInt("idPresupuesto"),
                        rs.getString("numeroCot"), rs.getString("numOt"),
                        rs.getString("fecha"), rs.getString("cliente"),
                        rs.getString("responsable"), rs.getString("nombreProducto"),
                        rs.getDouble("monto"), rs.getDouble("montoOc"),
                        rs.getString("estado"), rs.getString("fechaConfOC"),
                        rs.getString("obs"), rs.getInt("idFormaPago"),
                        rs.getInt("eliminado"), rs.getString("tiempoFabricacion"), rs.getDouble("toneladas"),rs.getString("fechaConfPlano")
                );
            }
        } catch (Exception e) {
            Logger.getLogger(Cotizacion.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e);
        } finally {
            cerrar();
        }
        return lista;
    }

    public AvanceCot getAvance() {
        return new AvanceCot().buscarIdCot(id);
    }

    public ArrayList listarGeneral() {
        ArrayList<Cotizacion> lista = new ArrayList();
        try (Connection con = new Conectar("rstcot").getCon()) {
            sql = "select * from cotizacion where eliminado = 0";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                lista.add(
                        new Cotizacion(
                                rs.getInt("id"), rs.getInt("idPresupuesto"),
                                rs.getString("numeroCot"), rs.getString("numOt"),
                                rs.getString("fecha"), rs.getString("cliente"),
                                rs.getString("responsable"), rs.getString("nombreProducto"),
                                rs.getDouble("monto"), rs.getDouble("montoOc"),
                                rs.getString("estado"), rs.getString("fechaConfOC"),
                                rs.getString("obs"), rs.getInt("idFormaPago"),
                                rs.getInt("eliminado"), rs.getString("tiempoFabricacion"), rs.getDouble("toneladas"),rs.getString("fechaConfPlano")
                        )
                );
            }
        } catch (Exception e) {
            Logger.getLogger(Cotizacion.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e);
        } finally {
            cerrar();
        }
        return lista;
    }

    public ArrayList listarxDato(String dato) {
        ArrayList<Cotizacion> lista = new ArrayList();
        try (Connection con = new Conectar("rstcot").getCon()) {
            sql = "select * from cotizacion where eliminado = 0 and "
                    + "( lower(numeroCot) like lower('%" + dato + "%') or "
                    + "  lower(numOt) like lower('%" + dato + "%') or "
                    + "lower(cliente) like lower('%" + dato + "%') or"
                    + " lower(nombreProducto) like lower('%" + dato + "%') )";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                lista.add(
                        new Cotizacion(
                                rs.getInt("id"), rs.getInt("idPresupuesto"),
                                rs.getString("numeroCot"), rs.getString("numOt"),
                                rs.getString("fecha"), rs.getString("cliente"),
                                rs.getString("responsable"), rs.getString("nombreProducto"),
                                rs.getDouble("monto"), rs.getDouble("montoOc"),
                                rs.getString("estado"), rs.getString("fechaConfOC"),
                                rs.getString("obs"), rs.getInt("idFormaPago"),
                                rs.getInt("eliminado"), rs.getString("tiempoFabricacion"), rs.getDouble("toneladas"),rs.getString("fechaConfPlano")
                        )
                );
            }
        } catch (Exception e) {
            Logger.getLogger(Cotizacion.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e);
        } finally {
            cerrar();
        }
        return lista;
    }

    public ArrayList listarxNombre(String clientex) {
        ArrayList<Cotizacion> lista = new ArrayList();

        try (Connection conex = new Conectar("rstcot").getCon()) {

            sql = "select * from cotizacion where "
                    + " cliente = '" + clientex + "' && eliminado =0";
            pst = conex.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                lista.add(new Cotizacion(
                        rs.getInt("id"), rs.getInt("idPresupuesto"),
                        rs.getString("numeroCot"), rs.getString("numOt"),
                        rs.getString("fecha"), rs.getString("cliente"),
                        rs.getString("responsable"), rs.getString("nombreProducto"),
                        rs.getDouble("monto"), rs.getDouble("montoOc"),
                        rs.getString("estado"), rs.getString("fechaConfOC"),
                        rs.getString("obs"), rs.getInt("idFormaPago"),
                        rs.getInt("eliminado"), rs.getString("tiempoFabricacion"), rs.getDouble("toneladas"),rs.getString("fechaConfPlano")
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

    public ArrayList listarxNombreyEstado(String clientex, String estadox) {
        ArrayList<Cotizacion> lista = new ArrayList();

        try (Connection conex = new Conectar("rstcot").getCon()) {

            sql = "select * from cotizacion where  eliminado =0 and estado=? and "
                    + "( lower(cliente) like lower ('%" + clientex + "%') or "
                    + " lower(numeroCot) like lower ('%" + clientex + "%' ) )";
            pst = conex.prepareStatement(sql);
            pst.setString(1, estadox);
            rs = pst.executeQuery();
            while (rs.next()) {
                lista.add(new Cotizacion(
                        rs.getInt("id"), rs.getInt("idPresupuesto"),
                        rs.getString("numeroCot"), rs.getString("numOt"),
                        rs.getString("fecha"), rs.getString("cliente"),
                        rs.getString("responsable"), rs.getString("nombreProducto"),
                        rs.getDouble("monto"), rs.getDouble("montoOc"),
                        rs.getString("estado"), rs.getString("fechaConfOC"),
                        rs.getString("obs"), rs.getInt("idFormaPago"),
                        rs.getInt("eliminado"), rs.getString("tiempoFabricacion"), rs.getDouble("toneladas"),rs.getString("fechaConfPlano")
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

    public ArrayList listarxEsperandoCierre() {
        ArrayList<Cotizacion> lista = new ArrayList();

        try (Connection conex = new Conectar("rstcot").getCon()) {

            sql = "select * from cotizacion where  eliminado =0  and "
                    + "( lower(estado) like lower ('%Plano Confirmado - Esperando Entrega%') or "
                    + " lower(estado) like lower ('%Esperando Cierre%' ) )";
            pst = conex.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                lista.add(new Cotizacion(
                        rs.getInt("id"), rs.getInt("idPresupuesto"),
                        rs.getString("numeroCot"), rs.getString("numOt"),
                        rs.getString("fecha"), rs.getString("cliente"),
                        rs.getString("responsable"), rs.getString("nombreProducto"),
                        rs.getDouble("monto"), rs.getDouble("montoOc"),
                        rs.getString("estado"), rs.getString("fechaConfOC"),
                        rs.getString("obs"), rs.getInt("idFormaPago"),
                        rs.getInt("eliminado"), rs.getString("tiempoFabricacion"), rs.getDouble("toneladas"),rs.getString("fechaConfPlano")
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

    public ArrayList listarxEsperandoCierreDATO(String datox) {
        ArrayList<Cotizacion> lista = new ArrayList();

        try (Connection conex = new Conectar("rstcot").getCon()) {

            sql = "select * from cotizacion where  eliminado =0  and "
                    + "( lower(estado) like lower ('%Plano Confirmado - Esperando Entrega%') or "
                    + " lower(estado) like lower ('%Esperando Cierre%') ) "
                    + " and ( lower(numeroCot) like lower('%" + datox + "%') "
                    + "or "
                    + " lower(numOt) like lower('%" + datox + "%') or "
                    + " lower(cliente) like lower('%" + datox + "%')  )";
            pst = conex.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                lista.add(new Cotizacion(
                        rs.getInt("id"), rs.getInt("idPresupuesto"),
                        rs.getString("numeroCot"), rs.getString("numOt"),
                        rs.getString("fecha"), rs.getString("cliente"),
                        rs.getString("responsable"), rs.getString("nombreProducto"),
                        rs.getDouble("monto"), rs.getDouble("montoOc"),
                        rs.getString("estado"), rs.getString("fechaConfOC"),
                        rs.getString("obs"), rs.getInt("idFormaPago"),
                        rs.getInt("eliminado"), rs.getString("tiempoFabricacion"), rs.getDouble("toneladas"),rs.getString("fechaConfPlano")
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

    public int getValoresCotStarSoft() {
        int rst = 0;
        String año = new SimpleDateFormat("yyyy").format(new Date());
        int año2 = Integer.parseInt(año);
        try (Connection conex = new ConectarSQL("005BDCOMUN").getCon()) {
            sql = "select count(ccfecdoc) as a from cotcab where ccfecdoc >= '01/10/" + (año2 - 1) + "' and ccfecdoc <= '31/12/" + año + "'";
            pst = conex.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                rst = rs.getInt("a");
            }
        } catch (Exception e) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e, null, 0);
        } finally {
            cerrar();
        }
        return rst;
    }

    public String[][] listarxStarSoftconDATO(String datox) {
        int total = getValoresCotStarSoft();
        String[][] lista = new String[total][5];
        try (Connection conex = new ConectarSQL("005BDCOMUN").getCon()) {
            String año = new SimpleDateFormat("yyyy").format(new Date());
            int año2 = Integer.parseInt(año);
            sql = "select ccnumdoc,ccfecdoc,cccodcli, ccnombre,ccimporte,ccigv "
                    + " from cotcab where  "
                    + "( lower(cccodcli) like lower('%" + datox + "%') "
                    + " or lower(ccnombre) like lower('%" + datox + "%') "
                    + " or lower(ccnumdoc) like lower('%" + datox + "%')    ) "
                    + " and "
                    + "( ccfecdoc >= '01/10/" + (año2 - 1) + "' and ccfecdoc <= '31/12/" + año + "') order by ccfecdoc desc";
            pst = conex.prepareStatement(sql);
            rs = pst.executeQuery();
            total = 0;
            while (rs.next()) {
                lista[total][0] = rs.getString("ccnumdoc");
                String fecha = new Conectar().parsearFecha(rs.getString("ccfecdoc").substring(0, 10));
                lista[total][1] = fecha;
                lista[total][2] = rs.getString("cccodcli");
                lista[total][3] = rs.getString("ccnombre");
                Double valor = Double.parseDouble(rs.getString("ccimporte"));
                Double valorIgv = Double.parseDouble(rs.getString("ccigv"));
                lista[total][4] = new DecimalFormat("#.00").format(valor - valorIgv) + "";
                total++;
            }
        } catch (Exception e) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e, null, 0);
        } finally {
            cerrar();
        }
        return lista;
    }

    public String[][] listarxStarSoft() {
        int total = getValoresCotStarSoft();
        String[][] lista = new String[total][5];
        try (Connection conex = new ConectarSQL("005BDCOMUN").getCon()) {
            String año = new SimpleDateFormat("yyyy").format(new Date());
            int año2 = Integer.parseInt(año);
            sql = "select ccnumdoc,ccfecdoc,cccodcli, ccnombre,ccimporte,ccigv "
                    + " from cotcab where  "
                    + "( ccfecdoc >= '01/10/" + (año2 - 1) + "' and ccfecdoc <= '31/12/" + año + "') order by ccfecdoc desc";
            pst = conex.prepareStatement(sql);
            rs = pst.executeQuery();
            total = 0;
            while (rs.next()) {
                lista[total][0] = rs.getString("ccnumdoc");
                String fecha = new Conectar().parsearFecha(rs.getString("ccfecdoc").substring(0, 10));
                lista[total][1] = fecha;
                lista[total][2] = rs.getString("cccodcli");
                lista[total][3] = rs.getString("ccnombre");
                Double valor = Double.parseDouble(rs.getString("ccimporte"));
                Double valorIgv = Double.parseDouble(rs.getString("ccigv"));
                lista[total][4] = new DecimalFormat("#.00").format(valor - valorIgv) + "";
                total++;
            }
        } catch (Exception e) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e, null, 0);
        } finally {
            cerrar();
        }
        return lista;
    }

    public ArrayList listarxEsperandoDespacho() {
        ArrayList<Cotizacion> lista = new ArrayList();

        try (Connection conex = new Conectar("rstcot").getCon()) {

            sql = "select * from cotizacion where  eliminado =0  and "
                    + "( lower(estado) like lower ('%Plano Confirmado - Esperando Entrega%') or"
                    + "  lower(estado) like lower ('%Cierre Listo - Esperando Entrega%') or"
                    + " lower(estado) like lower ('%Entrega Parcial - Esperando Cierre%' ) or "
                    + " lower(estado) like lower ('%Entrega Parcial - Cierre Listo%' ) )";
            pst = conex.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                lista.add(new Cotizacion(
                        rs.getInt("id"), rs.getInt("idPresupuesto"),
                        rs.getString("numeroCot"), rs.getString("numOt"),
                        rs.getString("fecha"), rs.getString("cliente"),
                        rs.getString("responsable"), rs.getString("nombreProducto"),
                        rs.getDouble("monto"), rs.getDouble("montoOc"),
                        rs.getString("estado"), rs.getString("fechaConfOC"),
                        rs.getString("obs"), rs.getInt("idFormaPago"),
                        rs.getInt("eliminado"), rs.getString("tiempoFabricacion"), rs.getDouble("toneladas"),rs.getString("fechaConfPlano")
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

    public ArrayList listarxEsperandoDespachoconDato(String datox) {
        ArrayList<Cotizacion> lista = new ArrayList();

        try (Connection conex = new Conectar("rstcot").getCon()) {

            sql = "select * from cotizacion where  eliminado =0  and "
                    + "( lower(estado) like lower ('%Plano Confirmado - Esperando Entrega%') or"
                    + "  lower(estado) like lower ('%Cierre Listo - Esperando Entrega%') or"
                    + " lower(estado) like lower ('%Entrega Parcial - Esperando Cierre%' ) or "
                    + " lower(estado) like lower ('%Entrega Parcial - Cierre Listo%' ) )"
                    + "and ( "
                    + "  lower (numeroCot) like lower ('%" + datox + "%')  or  "
                    + "   lower(numOt) like lower ('%" + datox + "%') or  "
                    + "  lower(cliente) like lower ('%" + datox + "%')  )";
            pst = conex.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                lista.add(new Cotizacion(
                        rs.getInt("id"), rs.getInt("idPresupuesto"),
                        rs.getString("numeroCot"), rs.getString("numOt"),
                        rs.getString("fecha"), rs.getString("cliente"),
                        rs.getString("responsable"), rs.getString("nombreProducto"),
                        rs.getDouble("monto"), rs.getDouble("montoOc"),
                        rs.getString("estado"), rs.getString("fechaConfOC"),
                        rs.getString("obs"), rs.getInt("idFormaPago"),
                        rs.getInt("eliminado"), rs.getString("tiempoFabricacion"), rs.getDouble("toneladas"),rs.getString("fechaConfPlano")
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

    public Double getVentasFecha(String fechax) {
        Double monto = 0.0;
        DecimalFormat df = new DecimalFormat("#.00");
        sql = "select monto,estado, "
                + "fecha  from cotizacion "//obtiene el mes
                + "where  fecha =? "
                + " and estado != 'Rechazado'";//

        try (Connection con = new Conectar("rstcot").getCon()) {
            pst = con.prepareStatement(sql);
            pst.setString(1, fechax);
            rs = pst.executeQuery();
            while (rs.next()) {
                monto += rs.getDouble("monto");
            }
            String temp = df.format(monto);
            monto = Double.parseDouble(temp);
        } catch (Exception e) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e, null, 0);
        } finally {
            cerrar();
        }
        return monto;
    }

    public Double getVentasAprobadaFecha(String fechax) {
        Double monto = 0.0;
        DecimalFormat df = new DecimalFormat("#.00");
        sql = "select montoOc,estado, "
                + "fecha  from cotizacion "//obtiene el mes
                + "where  fecha =? "
                + " and estado != 'Rechazado' "//
                + " and estado != 'Cot. Creada - Esperando por Cliente' "
                + " and estado != 'Creado'";//

        try (Connection con = new Conectar("rstcot").getCon()) {
            pst = con.prepareStatement(sql);
            pst.setString(1, fechax);
            ResultSet rs2 = pst.executeQuery();
            while (rs2.next()) {
                monto += rs2.getDouble("montoOc");
            }
            String montoTemp = df.format(monto);
            monto = Double.parseDouble(montoTemp);
        } catch (Exception e) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e, null, 0);
        } finally {
            cerrar();
        }
        return monto;
    }

    public String getFechaConfirmacionOC(int idCotx) {
        String temp = "-";
        temp = new Seguimiento().buscarEspecifico("Cotización", idCotx, "Cot. Aprobada - Esperando Plano").getFecha();
        return temp;
    }

    public String getFechaConfirmacionPlano(int idCotx) {
        String temp = "-";
        temp = new Seguimiento().buscarEspecifico("Cotización", idCotx, "Plano Confirmado - Esperando Entrega").getFecha();
        return temp;
    }

    public String getFechaMaxDespacho() {
        String fechaConfirmacionPlano = "-";
        String temp = "-";
        fechaConfirmacionPlano = getFechaConfirmacionPlano(id);

        fechaConfirmacionPlano = fechaConfirmacionPlano == null ? "-" : fechaConfirmacionPlano;

        String lastFechaDespacho = new Despacho().getLastFechaDespacho(id);

        if (!fechaConfirmacionPlano.equals("-") && !fechaConfirmacionPlano.equals("-")) {
            temp = new tools().sumarDiaHabilFECHA(fechaConfirmacionPlano, Integer.parseInt(tiempoFabricacion));
        }

        return temp;
    }

    public Double getVentasMes() {
        Double monto = 0.0;
        DecimalFormat df = new DecimalFormat("#.00");
        sql = "select monto,estado, "
                + "SUBSTRING_INDEX(SUBSTRING_INDEX(fecha,'/',-2),'/',1) as MES  from cotizacion "//obtiene el mes
                + "where  SUBSTRING_INDEX(SUBSTRING_INDEX(fecha,'/',-2),'/',1)=month(curdate()) "
                + " and estado != 'Rechazado'";//

        try (Connection con = new Conectar("rstcot").getCon()) {
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                monto += rs.getDouble("monto");
            }
            String montoTemp = df.format(monto);
            monto = Double.parseDouble(montoTemp);
        } catch (Exception e) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e, null, 0);
        } finally {
            cerrar();
        }
        return monto;
    }

    public Double getVentasAprobadaMesActual() {
        Double temp = 0.0;
        try (Connection con = new Conectar("rstcot").getCon()) {

            String sqlDespacho = "select montoOc,fechaConfOC from cotizacion where SUBSTRING_INDEX(SUBSTRING_INDEX(fechaConfOC,'/',-2),'/',1) = month(curdate())";
            pst = con.prepareStatement(sqlDespacho);
            rs = pst.executeQuery();
            while (rs.next()) {
                temp += rs.getDouble("montoOc");
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

    public Double getVentasAprobadaMes(int mesx) {
        Double temp = 0.0;

        try (Connection con = new Conectar("rstcot").getCon()) {

            String sqlDespacho = "select montoOc,fechaConfOC from cotizacion where SUBSTRING_INDEX(SUBSTRING_INDEX(fechaConfOC,'/',-2),'/',1) = ?";
            pst = con.prepareStatement(sqlDespacho);
            pst.setInt(1, mesx);
            rs = pst.executeQuery();
            temp = 0.0;
            while (rs.next()) {
                temp = temp + rs.getDouble("montoOc");
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

    public Double getVentasCotizadasMesActual() {
        Double temp = 0.0;
        try (Connection con = new Conectar("rstcot").getCon()) {

            sql = "select id,numeroCot,montoOc,monto,estado, "
                    + "SUBSTRING_INDEX(SUBSTRING_INDEX(fecha,'/',-2),'/',1) as MES  from cotizacion "//obtiene el mes
                    + "where  SUBSTRING_INDEX(SUBSTRING_INDEX(fecha,'/',-2),'/',1)=month(curdate()) "
                    + "order by fecha asc";//           
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                temp += rs.getDouble("monto");
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

    public Double getVentasCotizadasMes(int mesx) {
        Double temp = 0.0;
        try (Connection con = new Conectar("rstcot").getCon()) {

            sql = "select id,numeroCot,montoOc,monto,estado, "
                    + "SUBSTRING_INDEX(SUBSTRING_INDEX(fecha,'/',-2),'/',1) as MES  from cotizacion "//obtiene el mes
                    + "where  SUBSTRING_INDEX(SUBSTRING_INDEX(fecha,'/',-2),'/',1)=month(?) "
                    + "order by montoOc desc";//           
            pst = con.prepareStatement(sql);
            pst.setInt(1, mesx);
            rs = pst.executeQuery();
            while (rs.next()) {
                temp += rs.getDouble("montoOc");
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

    public Double getVentasMESDespachadas() {
        Double monto = 0.0;
        sql = "select id,montoOc,responsable,estado, "
                + "SUBSTRING_INDEX(SUBSTRING_INDEX(fecha,'/',-2),'/',1) as MES  from cotizacion "//obtiene el mes
                + "where  SUBSTRING_INDEX(SUBSTRING_INDEX(fecha,'/',-2),'/',1)=month(curdate())  "
                + "and estado != 'Rechazado' "
                + "and estado != 'Creado'";//d
        try (Connection con = new Conectar("rstcot").getCon()) {
            pst = con.prepareStatement(sql);

            ResultSet rs2 = pst.executeQuery();
            while (rs2.next()) {
                int idcot = rs2.getInt("id");
                ArrayList<Despacho> lista = (ArrayList) new Despacho().listarxCot(idcot).clone();
                for (Despacho c : lista) {
                    monto += c.getMontoDespachado();
                }

            }
        } catch (Exception e) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e, null, 0);
        } finally {
            cerrar();
        }
        return monto;
    }

    public ChartPanel getGraficoVentasMesActual() {

        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        dataset.setValue(128000, "Esperado", "Meta Mensual Ventas");
        dataset.setValue(getVentasCotizadasMesActual(), "Cotizado", "Total Cotizado");
        dataset.setValue(getVentasAprobadaMesActual(), "Aprobado", "Total Aprobado");
        dataset.setValue(new Despacho().getMontoDespachadoMESActual(), "Despachado", "Total Despachado");

        JFreeChart chart = ChartFactory.createBarChart3D("Ventas Generadas y Despachadas",
                "Mes de " + new tools().getMes().toUpperCase(), "Monto en Dolares $",
                dataset, PlotOrientation.VERTICAL, true, true, false);

        chart.setBackgroundPaint(Color.white);
        chart.getTitle().setFont(new Font("Segoe UI", Font.BOLD, 20));
        chart.getTitle().setPaint(Color.BLACK);

        CategoryPlot p = chart.getCategoryPlot();
        p.setRangeGridlinePaint(Color.yellow);

        ChartPanel chartPanel = new ChartPanel(chart);
        return chartPanel;

    }

    public String[][] getToneladasAnual() {
        String[][] valores = new String[12][4];
        for (int i = 1; i < 13; i++) {

            valores[i - 1][0] = new tools().getMes(i).toUpperCase();
            valores[i - 1][1] = getVentasAprobadaMes(i) + "";
            valores[i - 1][2] = new Despacho().getMontoDespachadoMES(i) + "";
            valores[i - 1][3] = new Despacho().getToneladasDespachadoMES(i) + "";
        }

        return valores;
    }

    public Double getMontoAprobadoMES(int mesx) {
        Double temp = 0.0;
        try (Connection con = new Conectar("rstcot").getCon()) {

            String sqlDespacho = "select montoOc,fechaConfOC from cotizacion where SUBSTRING_INDEX(SUBSTRING_INDEX(fechaConfOC,'/',-2),'/',1) =?";
            pst = con.prepareStatement(sqlDespacho);
            pst.setInt(1, mesx);
            rs = pst.executeQuery();
            while (rs.next()) {
                temp += rs.getDouble("montoOc");
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

    public int getID() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdPresupuesto() {
        return idPresupuesto;
    }

    public void setIdPresupuesto(int idPresupuesto) {
        this.idPresupuesto = idPresupuesto;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdFormaPago() {
        return idFormaPago;
    }

    public void setIdFormaPago(int idFormaPago) {
        this.idFormaPago = idFormaPago;
    }

    public int getEliminado() {
        return eliminado;
    }

    public void setEliminado(int eliminado) {
        this.eliminado = eliminado;
    }

    public String getNumeroCot() {
        return numeroCot;
    }

    public void setNumeroCot(String numeroCot) {
        this.numeroCot = numeroCot;
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

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTiempoFabricacion() {
        return tiempoFabricacion;
    }

    public void setTiempoFabricacion(String tiempoFabricacion) {
        this.tiempoFabricacion = tiempoFabricacion;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public Double getMontoOc() {
        return montoOc;
    }

    public void setMontoOc(Double montoOc) {
        this.montoOc = montoOc;
    }

    public String getNumOt() {
        return numOt;
    }

    public void setNumOt(String numOt) {
        this.numOt = numOt;
    }

    public String getFechaConfPlano() {
        return fechaConfPlano;
    }

    public void setFechaConfPlano(String fechaConfPlano) {
        this.fechaConfPlano = fechaConfPlano;
    }

    @Override
    public String toString() {
        return "Cotizacion{" + "id=" + id + ", idPresupuesto=" + idPresupuesto + ", idCliente=" + idCliente + ", idFormaPago=" + idFormaPago + ", eliminado=" + eliminado + ", numeroCot=" + numeroCot + ", responsable=" + responsable + ", estado=" + estado + ", obs=" + obs + ", cliente=" + cliente + ", formaPago=" + formaPago + ", fecha=" + fecha + ", tiempoFabricacion=" + tiempoFabricacion + ", numOt=" + numOt + ", monto=" + monto + ", montoOc=" + montoOc + ", toneladas=" + toneladas + ", presupuesto=" + presupuesto + ", nombreProducto=" + nombreProducto + '}';
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public Double getToneladas() {
        return toneladas;
    }

    public void setToneladas(Double toneladas) {
        this.toneladas = toneladas;
    }

    public Presupuesto getPresupuesto() {
        return new Presupuesto().buscarID(this.idPresupuesto);
    }

    public void setPresupuesto(Presupuesto presupuesto) {
        this.presupuesto = presupuesto;
    }

    public String getFechaConfOC() {
        return fechaConfOC;
    }

    public void setFechaConfOC(String fechaConfOC) {
        this.fechaConfOC = fechaConfOC;
    }

}
