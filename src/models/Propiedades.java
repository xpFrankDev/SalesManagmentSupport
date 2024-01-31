package Clases;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Propiedades {
    String ruta;
    Properties p = new Properties();
    static final String NOMBRE_ARCHIVO ="confg.properties";
    static final String INICIAL = "\\\\atenea\\SGDS\\Data\\2. Usuarios\\";
    BufferedWriter bw;
    File archivo;
    public Propiedades(){

    }
    public String getLocation(String usuario){
        String temp ="";
        ruta = INICIAL + usuario+"\\1. Propiedades\\";
        new tools().crearCarpeta(ruta);
        
       
        validarArchivo(ruta);
        openPropiedades();
        temp = getValor("last.location");        
        return temp;
    }
    public Propiedades(String rutaConArchivo) {        
        this.ruta = rutaConArchivo;        
        openPropiedades();
    }
    
        public void crearProperties(String ruta) {
        archivo = new File(ruta);
        if (archivo.exists()) { // Ya existe
            try {
                bw = new BufferedWriter(new FileWriter(archivo));
            } catch (IOException ex) {
                Logger.getLogger(Propiedades.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Abriendo prop"+ex);
            }
            
        } else { // Se ha creado
            try {
                bw = new BufferedWriter(new FileWriter(archivo));
            } catch (IOException ex) {
                Logger.getLogger(Propiedades.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Creando prop. Verifique conexión con servidor\n"+ex);
            }
           
        }
        
       
       
        
    }
    

    public String getValor(String property) {
        String resultado = "";
        resultado = p.getProperty(property);
        return resultado;
    }

    public ArrayList listarPropiedades() {
        ArrayList<String> lista = new ArrayList();

        Enumeration<Object> keys = p.keys();
        while (keys.hasMoreElements()) {
            Object key = keys.nextElement();
            lista.add(key + " = " + p.get(key));            
        }

        return lista;
    }
    private void guardar(String comentario){
        try {
            p.store(new FileWriter(ruta+"\\"+NOMBRE_ARCHIVO),comentario);
            
        } catch (IOException ex) {
            Logger.getLogger(Propiedades.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    public void setPropert(String llave, String valor){
        p.setProperty(llave,valor);
        guardar(" "+new SimpleDateFormat("dd/MM/yyyy").format(new Date())+"");
        
    }
    public String getRuta() {
        return ruta;
    }
    public void validarLastLocation(String nameUser){
       String rutaCompleta = INICIAL+nameUser+"\\1. Propiedades/";
        File temp = new File(rutaCompleta);
        temp.mkdirs();
        rutaCompleta+="\\"+NOMBRE_ARCHIVO;
        temp = new File(rutaCompleta);
        if(!temp.exists()){
            ruta = rutaCompleta;
            crearProperties(rutaCompleta);
            openPropiedades(nameUser);
            setPropert("last.location", "C:\\Users\\%username%\\Documents");
            
        }
    }
    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public void openPropiedades() {
        File temp = new File(ruta+"\\"+NOMBRE_ARCHIVO);
        if(temp.exists()){
            try {
                p.load(new FileReader(ruta+"\\"+NOMBRE_ARCHIVO));
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Propiedades.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Propiedades.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, ex);
            }
        }else{
            crearProperties(ruta+NOMBRE_ARCHIVO);
        }
        
    }
    public void openPropiedades(String nameUser) {
         String rutaCompleta = INICIAL+nameUser+"\\"+NOMBRE_ARCHIVO;
        File temp = new File(rutaCompleta);
        if(temp.exists()){
            try {
                p.load(new FileReader(rutaCompleta));
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Propiedades.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Propiedades.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, ex);
            }
        }else{
            crearProperties(rutaCompleta);
        }
        
    }
        public void openVersion(String rutax) {
        ruta = rutax+"version.properties";
            File temp = new File(ruta);
        if(temp.exists()){
            try {
                p.load(new FileReader(ruta));
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Propiedades.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Propiedades.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, ex);
            }
        }
        
    }

    private void validarArchivo(String ruta) {
        String archivoOriginal ="\\\\atenea\\SGDS\\Data\\"+NOMBRE_ARCHIVO;
        File archivo = new File(ruta+"\\"+NOMBRE_ARCHIVO);
        if(!archivo.exists()){
            tools t = new tools();
            t.CopiarArchivo(archivoOriginal, ruta);
        }
    }

    public String getNewVersion() throws FileNotFoundException, IOException {
       String version ="";
       String ruta = "\\\\atenea\\SGDS\\Sistema\\Version\\version.properties";
        File temp = new File(ruta);
        if(temp.exists()){
            p.load(new FileReader(ruta));
            version = getValor("version");
        }else{
            crearProperties(ruta);
            p.load(new FileReader(ruta));
            setPropert("version", "1.0");
            guardar(new Date()+"");
        }
       return version;
    }
        public String getVersion() throws FileNotFoundException, IOException {
       String version ="";
       String ruta = System.getProperty("user.dir")+"\\version.properties";       
        File temp = new File(ruta);
        if(temp.exists()){
            p.load(new FileReader(ruta));
            version = getValor("version");            
        }else{            
            String copiarProOriginal ="\\\\atenea\\SGDS\\Sistema\\Version\\Original\\version.properties";
            new tools().CopiarArchivo(copiarProOriginal, System.getProperty("user.dir")+"\\");
            
            p.load(new FileReader(ruta));
            version = getValor("version"); 
        }
       return version;
    }
}
