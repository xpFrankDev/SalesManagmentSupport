package Clases;


import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.swing.JOptionPane;

public class Log {

    int id;
    String username;
    String pass;
    int nivel;
    String dni;
    String nomLargo="vacio";
    String telefono;
    String correo,estado;
    PreparedStatement pst;
    ResultSet rs;
    Conectar c;

    public Log() {

    }

    public Log(String username) {
        this.username = username;
    }

    public Log(int id) {
        try {
            this.id = id;
            BuscarID();
        } catch (Exception ex) {
            Logger.getLogger(Log.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    public Log(int id, String username, String pass, int nivel, String dni, String nomLargo, String telefono,String direccion) throws UnsupportedEncodingException, NoSuchAlgorithmException, InvalidKeyException, NoSuchPaddingException, IllegalBlockSizeException, BadPaddingException {
        this.id = id;
        this.username = username;
        this.setPass(pass);
        this.nivel = nivel;
        this.dni = dni;
        this.nomLargo = nomLargo;
        this.telefono=telefono;
        this.correo=direccion;
    }

    public int validarId(int id) throws Exception {
        int a = 0;
        String sql = "select id from usuarios where ID =" + id;
        
        try (Connection conex = new Conectar("rstcot").getCon()) {
                pst = c.getCon().prepareStatement(sql);
                rs = pst.executeQuery();
                if (rs.next()) {
                    a = rs.getInt("id");
                } 
        } catch (SQLException ex) {
            Logger.getLogger(Log.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, null, 0);
        }finally{
            cerrar();
        }

        return a;
    }

    public int validarUsuario() {
        
        int valTem = 0;
        String sql = "select * from usuarios where USERNAME ='" + username + "'";
        
        try (Connection conex = new Conectar("rstcot").getCon()) {           
                pst = conex.prepareStatement(sql);
                rs = pst.executeQuery();
                if (rs.next()) {
                    this.id = rs.getInt("ID");
                    this.username = rs.getString("USERNAME");
                    this.pass  =rs.getString("PASSWORD");
                    this.nomLargo = rs.getString("nombreCompleto");
                    this.dni=rs.getString("DNI");
                    this.nivel = rs.getInt("nivel");
                    this.correo = rs.getString("correo");
                    this.telefono = rs.getString("telefono");
                    this.estado = rs.getString("estado");
                    valTem = 1;
                }
        } catch (SQLException ex) {
            Logger.getLogger(Log.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, null, 0);
        }finally{
            cerrar();
        }

        return valTem;
    }
    public Log buscarNombre(String usernamex) {
        
        int valTem = 0;
        String sql = "select * from usuarios where USERNAME ='" + usernamex + "'";
        
        try (Connection conex = new Conectar("rstcot").getCon()) {           
                pst = conex.prepareStatement(sql);
                rs = pst.executeQuery();
                if (rs.next()) {
                    this.id = rs.getInt("ID");
                    this.username = rs.getString("USERNAME");
                    this.pass  =rs.getString("PASSWORD");
                    this.nomLargo = rs.getString("nombreCompleto");
                    this.dni=rs.getString("DNI");
                    this.nivel = rs.getInt("nivel");
                    this.correo = rs.getString("correo");
                    this.telefono = rs.getString("telefono");
                    this.estado = rs.getString("estado");
                }
        } catch (SQLException ex) {
            Logger.getLogger(Log.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, null, 0);
        }finally{
            cerrar();
        }

        return this;
    }
    public Log buscarNombreCompleto(String usernamex) {
        
        int valTem = 0;
        String sql = "select * from usuarios where nombreCompleto ='" + usernamex + "'";
        
        try (Connection conex = new Conectar("rstcot").getCon()) {           
                pst = conex.prepareStatement(sql);
                rs = pst.executeQuery();
                if (rs.next()) {
                    this.id = rs.getInt("ID");
                    this.username = rs.getString("USERNAME");
                    this.pass  =rs.getString("PASSWORD");
                    this.nomLargo = rs.getString("nombreCompleto");
                    this.dni=rs.getString("DNI");
                    this.nivel = rs.getInt("nivel");
                    this.correo = rs.getString("correo");
                    this.telefono = rs.getString("telefono");
                    this.estado = rs.getString("estado");
                }
        } catch (SQLException ex) {
            Logger.getLogger(Log.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, null, 0);
        }finally{
            cerrar();
        }

        return this;
    }
 public int BuscarID() throws Exception {
       
        int valTem = 0;
        String sql = "select * from usuarios where ID =" + id + "";
        
        try (Connection conex = new Conectar("rstcot").getCon()) {
                pst = conex.prepareStatement(sql);
                rs = pst.executeQuery();
                if (rs.next()) {
                    this.id = rs.getInt("ID");
                    this.username = rs.getString("USERNAME");
                    this.pass = rs.getString("PASSWORD");
                    this.nomLargo = rs.getString("nombreCompleto");
                    this.dni=rs.getString("DNI");
                    this.nivel = rs.getInt("NIVEL");
                    this.correo = rs.getString("correo");
                    this.telefono = rs.getString("telefono");
                    valTem = 1;
                }
        } catch (SQLException ex) {
            Logger.getLogger(Log.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, null, 0);
        }finally{
            cerrar();
        }

        return valTem;
    }
    public int updateUser() throws Exception{
        
        int valTem = 0;
        String sql = "update usuarios set USERNAME=? , PASSWORD=?,NIVEL=?,DNI=?,nombreCompleto=?, correo=?, telefono=? where ID=?";
        
        try (Connection conex = new Conectar("rstcot").getCon()) {
                pst = conex.prepareStatement(sql);
                pst.setString(1,username);
                pst.setString(2, pass);
                pst.setInt(3,nivel);
                pst.setString(4,dni);
                pst.setString(5,nomLargo);
                pst.setString(6,correo);
                pst.setString(7,telefono);
                pst.setInt(8,id);
                valTem = pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Log.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, null, 0);
        }finally{
            cerrar();
        }

        return valTem;
        
    }
    public int insertUser() throws Exception{
        
        int valTem = 0;
        String sql = "insert into usuarios (USERNAME,PASSWORD,NIVEL,DNI,nombreCompleto,correo,telefono) values (?,?,?,?,?,?,?) ";
        
        try (Connection conex = new Conectar("rstcot").getCon()) {
                pst = conex.prepareStatement(sql);
                pst.setString(1,username);
                pst.setString(2, pass);
                pst.setInt(3,nivel);
                pst.setString(4,dni);
                pst.setString(5,nomLargo);
                pst.setString(6,correo);
                pst.setString(7,telefono);
                valTem = pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Log.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, null, 0);
        }finally{
            cerrar();
        }

        return valTem;
        
    }
     public int deleteUser() throws Exception{
        
        int valTem = 0;
        String sql = "delete from usuarios where ID=?";
        
        try (Connection conex = new Conectar("rstcot").getCon()) {
                pst = conex.prepareStatement(sql);
                pst.setInt(1,id);
                valTem = pst.executeUpdate();
                System.out.println("retDEL-"+valTem);
                valTem =1;
        } catch (SQLException ex) {
            Logger.getLogger(Log.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, null, 0);
        }finally{
            cerrar();
        }

        return valTem;
        
    }
    
     
    public ArrayList listarxNivel(int nivelx){
         ArrayList<String> lista = new ArrayList();
         try(Connection conex = new Conectar("rstcot").getCon()) {
            String sql = "select * from usuarios where nivel =?";
            pst = conex.prepareStatement(sql);
            pst.setInt(1,nivelx);
            rs = pst.executeQuery();
            while(rs.next()){
                lista.add(rs.getString("nombreCompleto"));
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPass() {
       String a="";
        try {
            
            a= new EncriptadorAES().desencriptar(pass, "/*.2$cz");
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(Log.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(Log.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
        } catch (InvalidKeyException ex) {
            Logger.getLogger(Log.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
        } catch (NoSuchPaddingException ex) {
            Logger.getLogger(Log.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
        } catch (IllegalBlockSizeException ex) {
            Logger.getLogger(Log.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
        } catch (BadPaddingException ex) {
            Logger.getLogger(Log.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
        }
        return a;
    }

    public void setPass(String pass) {
        try {
        this.pass = new EncriptadorAES().encriptar(pass, "/*.2$cz");
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(Log.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(Log.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
        } catch (InvalidKeyException ex) {
            Logger.getLogger(Log.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
        } catch (NoSuchPaddingException ex) {
            Logger.getLogger(Log.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
        } catch (IllegalBlockSizeException ex) {
            Logger.getLogger(Log.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
        } catch (BadPaddingException ex) {
            Logger.getLogger(Log.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNomLargo() {
        return nomLargo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setNomLargo(String nomLargo) {
        this.nomLargo = nomLargo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return correo;
    }

    public void setDireccion(String direccion) {
        this.correo = direccion;
    }

    @Override
    public String toString() {
        return "Log{" + "id=" + id + ", username=" + username + ", pass=" + pass + ", nivel=" + nivel + ", dni=" + dni + ", nomLargo=" + nomLargo + ", telefono=" + telefono + ", correo=" + correo + '}';
    }
    
    
}
