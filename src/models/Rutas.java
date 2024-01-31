/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Ventanas.logginz;
import java.awt.FileDialog;
import java.io.File;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Rutas {

    private JFileChooser fc = new JFileChooser();
    private File archivoElegido;
    private String valor = null;
    private FileNameExtensionFilter filter;

     JFrame parentWindow;
     FileDialog fwin;
    public Rutas(){
        parentWindow = (JFrame) SwingUtilities.getWindowAncestor(new logginz());
        fwin = new FileDialog(parentWindow, "Seleccione el Archivo", FileDialog.LOAD);
        System.setProperty("com.apple.macos.use-file-dialog-packages", "true");
    }
   
    public String getCarpeta() {

        fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int respuesta = fc.showOpenDialog(null);
        if (respuesta == JFileChooser.APPROVE_OPTION) {
            archivoElegido = fc.getSelectedFile();
            valor = archivoElegido.getPath() + "/";

        }
        /*
            Devuelve Valor String con Path de la carpeta
            Sample: C:\Users\soporte\Documents\My Data Files/
         */
        return valor;
    }

    public ArrayList getRutayArchivoSeparado() {
        ArrayList<String> val = new ArrayList();
        fc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        int respuesta = fc.showOpenDialog(null);

        if (respuesta == JFileChooser.APPROVE_OPTION) {
            archivoElegido = fc.getSelectedFile();
            val.add(archivoElegido.getParentFile().toString() + "/");
            val.add(archivoElegido.getName());

        }
        /*
        Salida: ArrayList() con Size=2 Posiciones(0,1)
        (0)=C:\Users\soporte\Documents/
        (1)=1.pdf
         */
        return val;
    }

    public ArrayList getRutayArchivoSeparadoSELECCIONMULTIPLE_OnlyFiles() {
        ArrayList<String> val = new ArrayList();
        fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
        fc.setMultiSelectionEnabled(true);
        int respuesta = fc.showOpenDialog(null);
        if (respuesta == JFileChooser.APPROVE_OPTION) {

            File[] files = fc.getSelectedFiles();

            for (int i = 0; i < files.length; i++) {
                File file = files[i];
                val.add(file.getParentFile().toString() + "/");
                val.add(file.getName());
            }

        }
        /*
        Salida: ArrayList() con Size=2*(Cantidad Archivos Seleccionados)  
        Sample: 2 Archivos - Size= 4
        Primer Archivo - (0)C:\Users\soporte\Documents/
        Primer Archivo - (1)1.pdf
        Segundo Archivo - (2)C:\Users\soporte\Documents/
        Segundo Archivo - (3)1232.png

        
         */
        return val;
    }

    public ArrayList getCarpetaSELECCIONMULTIPLE_OnlyDirectories() {
        ArrayList<String> val = new ArrayList();
        fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        fc.setMultiSelectionEnabled(true);
        int respuesta = fc.showOpenDialog(null);
        if (respuesta == JFileChooser.APPROVE_OPTION) {

            File[] files = fc.getSelectedFiles();

            for (int i = 0; i < files.length; i++) {
                File file = files[i];
                val.add(file.getPath() + "/");
            }

        }
        /*
            Salida: ArrayList() con Size x n Carpetas Elejidas
            Sample: 2 Carpetas Elejidas - Size=2
            (0)=C:\Users\soporte\Documents\Visual Studio 2010/
            (1)=C:\Users\soporte\Documents\Visual Studio 2012/
         */
        return val;
    }
 public String getRutayArchivoJuntoCONFILTROconruta(String Texto, String Extension,String ruta) {
        valor = "";//\\zeus\Sistemas\2020\Soporte\01.- Control Diario
        fc.setCurrentDirectory(new File(ruta));
        fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
        filter = new FileNameExtensionFilter(Texto, Extension);
        fc.setFileFilter(filter);
        int respuesta = fc.showOpenDialog(null);
        if (respuesta == JFileChooser.APPROVE_OPTION) {
            archivoElegido = fc.getSelectedFile();
            valor = archivoElegido.getPath();
        }
        /*
        Salida: Ruta Completa del Archivo Seleccionado de acuerdo al filtro
        Sample: Extension: xls
        Devuelve: C:\Users\soporte\Documents\xzxzx.xls
         */
        return valor;
    }
    public String getRutayArchivoJunto(String ruta) {
        fc.setCurrentDirectory(new File(ruta));
        fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int respuesta = fc.showOpenDialog(null);

        if (respuesta == JFileChooser.APPROVE_OPTION) {

            archivoElegido = fc.getSelectedFile();
            valor = archivoElegido.getPath();

        }
        /*
        Retorna String con ruta COmpleta del archivo Seleccionado
        Sample: C:\Users\soporte\Documents\xzxzx.xls
         */
        return valor;
    }
    public ArrayList getRutayArchivoJunto_MULTIPLE(String ruta) {
        ArrayList<String> val = new ArrayList();
        fwin.setDirectory(ruta);
        fwin.setMultipleMode(true);
        fwin.setVisible(true);        
        
        File[] files = fwin.getFiles();

            for (int i = 0; i < files.length; i++) {
                File file = files[i];
                val.add(file.getAbsolutePath());                
            }

        return val;
    }
    public ArrayList getRutayArchivoSeparadoCONFILTRO(String Texto, String Extension) {
        ArrayList<String> val = new ArrayList();
        fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
        filter = new FileNameExtensionFilter(Texto, Extension);
        fc.setFileFilter(filter);
        int respuesta = fc.showOpenDialog(null);
        if (respuesta == JFileChooser.APPROVE_OPTION) {
            archivoElegido = fc.getSelectedFile();
            val.add(archivoElegido.getParentFile().toString() + "/");
            val.add(archivoElegido.getName());

        }
        /*
        Devuelve: un ArrayList con Size = 2
        Sample: Filtro: "xls" - Path Seleccionado:C:\Users\soporte\Documents/xzxzx.xls
        
        (0)=C:\Users\soporte\Documents/
        (1)=xzxzx.xls
         */
        return val;
    }

    public ArrayList getRutayArchivoSeparadoCONFILTRO_SELECCIONMULTIPLE(String Texto, String Extension) {
        ArrayList<String> val = new ArrayList();
        fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
        filter = new FileNameExtensionFilter(Texto, Extension);
        fc.setFileFilter(filter);
        fc.setMultiSelectionEnabled(true);
        int respuesta = fc.showOpenDialog(null);
        if (respuesta == JFileChooser.APPROVE_OPTION) {

            File[] files = fc.getSelectedFiles();

            for (int i = 0; i < files.length; i++) {
                File file = files[i];
                val.add(file.getParentFile().toString() + "/");
                val.add(file.getName());
            }

        }
        /*
        Devuelve: un ArrayList con Size = 2 x Archivos Elejidos
        Sample: 
        Filtro: "xlsx" 
        Archivos Seleccionados: 
            C:\Users\soporte\Documents\xzxzx.xls
            C:\Users\soporte\Documents\chancesOctubre.xls
        
        Resultado: Size = 4
        Primer Archivo -  (0)C:\Users\soporte\Documents\
        Primer Archivo -  (1)xzxzx.xlsx
        Segundo Archivo - (2)C:\Users\soporte\Documents\
        Segundo Archivo - (3)chancesOctubre.xlsx
         */
        return val;
    }

    public String getRutayArchivoJuntoCONFILTRO(String Texto, String Extension) {
        valor = "";//\\zeus\Sistemas\2020\Soporte\01.- Control Diario
        //fc.setCurrentDirectory(new File("\\\\zeus\\mineria\\"));
        fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
        filter = new FileNameExtensionFilter(Texto, Extension);
        fc.setFileFilter(filter);
        int respuesta = fc.showOpenDialog(null);
        if (respuesta == JFileChooser.APPROVE_OPTION) {
            archivoElegido = fc.getSelectedFile();
            valor = archivoElegido.getPath();
        }
        /*
        Salida: Ruta Completa del Archivo Seleccionado de acuerdo al filtro
        Sample: Extension: xls
        Devuelve: C:\Users\soporte\Documents\xzxzx.xls
         */
        return valor;
    }

   

    public String getRutaPrograma() {
        valor = null;
        //valor =new File ("imgs").getAbsolutePath ().toString()+"/";
        valor = System.getProperty("user.dir") + "\\";

        /* 
            Retorna la ruta de donde se encuentra el Archivo en si
            Sample: D:\5.- systems\2. LABORATORIO\(acá está el inicio del proyecto "Laboratorio")
            Proyecto donde se encuentra está clase
         */
        return valor;

    }
}
