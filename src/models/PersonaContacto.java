package Clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class PersonaContacto {

    PreparedStatement pst;
    ResultSet rs;
    String sql;

    int id;
    int idCliente;
    String nombres;
    String apellidos;
    String correo;
    String telefono;
    String direccion;
    String cargoEmpresa;
    int eliminado;

    public PersonaContacto() {

    }

    public PersonaContacto(int id, int idCliente, String nombres, String apellidos, String correo, String telefono, String direccion, String cargoEmpresa, int eliminado) {
        this.id = id;
        this.idCliente = idCliente;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.correo = correo;
        this.telefono = telefono;
        this.direccion = direccion;
        this.cargoEmpresa = cargoEmpresa;
        this.eliminado = eliminado;
    }

    public PersonaContacto(int idCliente, String nombres, String apellidos, String correo, String telefono, String direccion, String cargoEmpresa, int eliminado) {
        this.idCliente = idCliente;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.correo = correo;
        this.telefono = telefono;
        this.direccion = direccion;
        this.cargoEmpresa = cargoEmpresa;
        this.eliminado = eliminado;
    }

    public int getIdPersonaContacto() {
        int resultado = 0;

        try (Connection conex = new Conectar("rstcot").getCon()) {
            sql = "select id personaContacto where nombres='" + nombres + "' or apellidos='" + nombres + "' "
                    + "or apellidos='" + apellidos + "' or nombres='" + apellidos + "' ";
            pst = conex.prepareStatement(sql);
            pst.setInt(1, idCliente);
            rs = pst.executeQuery();
            while (rs.next()) {
                resultado = rs.getInt("id");
            }
        } catch (Exception e) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e, null, 0);
        } finally {
            cerrar();
        }
        return resultado;
    }

    public int Insert() {
        int resultado = 0;
        try (Connection conex = new Conectar("rstcot").getCon()) {
            sql = "insert into personaContacto (idCliente,nombres,apellidos,correo,telefono,direccion,cargoEmpresa,eliminado) "
                    + "values"
                    + " (?,?,?,?,?,?,?,?)"
                    + "";
            pst = conex.prepareStatement(sql);
            pst.setInt(1, idCliente);
            pst.setString(2, nombres);
            pst.setString(3, apellidos);
            pst.setString(4, correo);

            pst.setString(5, telefono);
            pst.setString(6, direccion);
            pst.setString(7, cargoEmpresa);
            pst.setInt(8, eliminado);
            pst.executeUpdate();
            resultado = 1;
        } catch (Exception e) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e, null, 0);
            resultado = 0;
        } finally {
            cerrar();
        }
        return resultado;
    }

    public int Update() {
        int resultado = 0;
        try (Connection conex = new Conectar("rstcot").getCon()) {
            sql = "update personaContacto set idCliente=?, nombres=?,apellidos=?, correo=?, "
                    + "telefono=?, direccion=?, cargoEmpresa=?, eliminado=? where id=?";
            pst = conex.prepareStatement(sql);
            pst.setInt(1, idCliente);
            pst.setString(2, nombres);
            pst.setString(3, apellidos);
            pst.setString(4, correo);

            pst.setString(5, telefono);
            pst.setString(6, direccion);
            pst.setString(7, cargoEmpresa);
            pst.setInt(8, eliminado);
            pst.setInt(9, id);
            resultado = pst.executeUpdate();

        } catch (Exception e) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e, null, 0);
        } finally {
            cerrar();
        }
        return resultado;
    }

    public int buscarNombre(String texto) {
        int resultado = 0;

        try (Connection conex = new Conectar("rstcot").getCon()) {
            sql = "select * from personaContacto where "
                    + "LOWER (concat_ws('',nombres,' ',apellidos)) LIKE LOWER ('%" + texto + "%')"
                    + "or LOWER (concat_ws('',apellidos,' ',nombres))  LIKE LOWER ('%" + texto + "%') ";

            pst = conex.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                resultado = rs.getInt("id");
                this.id = resultado;
                this.idCliente = rs.getInt("idCliente");
                this.nombres = rs.getString("nombres");
                this.apellidos = rs.getString("apellidos");
                this.correo = rs.getString("correo");
                this.telefono = rs.getString("telefono");
                this.direccion = rs.getString("direccion");
                this.cargoEmpresa = rs.getString("cargoEmpresa");
                this.eliminado = rs.getInt("eliminado");
            }
        } catch (Exception e) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e, null, 0);
        } finally {
            cerrar();
        }

        return resultado;
    }
public PersonaContacto buscarClientexNombre(int idClientex,String texto) {
        PersonaContacto px = new PersonaContacto();
        try (Connection conex = new Conectar("rstcot").getCon()) {
            sql = "select * from personaContacto where "
                    + "(concat_ws('',nombres,' ',apellidos)) = ? and idCliente=?";

            pst = conex.prepareStatement(sql);
            pst.setString(1, texto);
            pst.setInt(2, idClientex);
            rs = pst.executeQuery();
            while (rs.next()) {
                this.id = rs.getInt("id");
                this.idCliente = rs.getInt("idCliente");
                this.nombres = rs.getString("nombres");
                this.apellidos = rs.getString("apellidos");
                this.correo = rs.getString("correo");
                this.telefono = rs.getString("telefono");
                this.direccion = rs.getString("direccion");
                this.cargoEmpresa = rs.getString("cargoEmpresa");
                this.eliminado = rs.getInt("eliminado");
                px = new PersonaContacto(id, idCliente, nombres, apellidos, correo, telefono, direccion, cargoEmpresa, eliminado);
            }
        } catch (Exception e) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e, null, 0);
        } finally {
            cerrar();
        }

        return px;
    }
    public PersonaContacto buscarxNombre(String texto) {
        PersonaContacto px = new PersonaContacto();
        try (Connection conex = new Conectar("rstcot").getCon()) {
            sql = "select * from personaContacto where "
                    + "nombres = ? ";

            pst = conex.prepareStatement(sql);
            pst.setString(1, texto);
            rs = pst.executeQuery();
            while (rs.next()) {
                this.id = rs.getInt("id");
                this.idCliente = rs.getInt("idCliente");
                this.nombres = rs.getString("nombres");
                this.apellidos = rs.getString("apellidos");
                this.correo = rs.getString("correo");
                this.telefono = rs.getString("telefono");
                this.direccion = rs.getString("direccion");
                this.cargoEmpresa = rs.getString("cargoEmpresa");
                this.eliminado = rs.getInt("eliminado");
                px = new PersonaContacto(id, idCliente, nombres, apellidos, correo, telefono, direccion, cargoEmpresa, eliminado);
            }
        } catch (Exception e) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e, null, 0);
        } finally {
            cerrar();
        }

        return px;
    }

    public ArrayList listarPersonaContacto() {
        ArrayList<PersonaContacto> lista = new ArrayList();

        try (Connection conex = new Conectar("rstcot").getCon()) {
            sql = "select * from personaContacto";
            pst = conex.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                lista.add(new PersonaContacto(
                        rs.getInt("idCliente"), rs.getString("nombres"),
                        rs.getString("apellidos"), rs.getString("correo"),
                        rs.getString("telefono"), rs.getString("direccion"),
                        rs.getString("cargoEmpresa"), rs.getInt("eliminado")
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

    public ArrayList listarPersonaContactoxCliente() {
        ArrayList<PersonaContacto> lista = new ArrayList();

        try (Connection conex = new Conectar("rstcot").getCon()) {
            sql = "select * from personaContacto where idCliente=?";
            pst = conex.prepareStatement(sql);
            pst.setInt(1, idCliente);
            rs = pst.executeQuery();
            while (rs.next()) {
                lista.add(new PersonaContacto(
                        rs.getInt("idCliente"), rs.getString("nombres"),
                        rs.getString("apellidos"), rs.getString("correo"),
                        rs.getString("telefono"), rs.getString("direccion"),
                        rs.getString("cargoEmpresa"), rs.getInt("eliminado")
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

    public ArrayList listarPersonaContactoxCliente(int idClientex) {
        ArrayList<PersonaContacto> lista = new ArrayList();

        try (Connection conex = new Conectar("rstcot").getCon()) {
            sql = "select * from personaContacto where idCliente=? and eliminado = 0";
            pst = conex.prepareStatement(sql);
            pst.setInt(1, idClientex);
            rs = pst.executeQuery();
            while (rs.next()) {
                lista.add(new PersonaContacto(
                        rs.getInt("idCliente"), rs.getString("nombres"),
                        rs.getString("apellidos"), rs.getString("correo"),
                        rs.getString("telefono"), rs.getString("direccion"),
                        rs.getString("cargoEmpresa"), rs.getInt("eliminado")
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

    public int deleteLogico(int eliminadox) {
        int resultado = 0;
        try (Connection conex = new Conectar("rstcot").getCon()) {
            sql = "update personaContacto set eliminado=? where id=?";
            pst = conex.prepareStatement(sql);
            pst.setInt(1, eliminadox);
            pst.setInt(2, id);
            resultado = pst.executeUpdate();
        } catch (Exception e) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e, null, 0);
        } finally {
            cerrar();
        }
        return resultado;
    }

    public int deleteTotal() {
        int resultado = 0;
        try (Connection conex = new Conectar("rstcot").getCon()) {
            sql = "delete from personaContacto where id=?";
            pst = conex.prepareStatement(sql);
            pst.setInt(1, id);
            resultado = pst.executeUpdate();
        } catch (Exception e) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e, null, 0);
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

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCargoEmpresa() {
        return cargoEmpresa;
    }

    public void setCargoEmpresa(String cargoEmpresa) {
        this.cargoEmpresa = cargoEmpresa;
    }

    @Override
    public String toString() {
        return "PersonaContacto{" + "id=" + id + ", idCliente=" + idCliente + ", nombres=" + nombres + ", apellidos=" + apellidos + ", correo=" + correo + ", telefono=" + telefono + ", direccion=" + direccion + ", cargoEmpresa=" + cargoEmpresa + ", eliminado=" + eliminado + '}';
    }
    

}
