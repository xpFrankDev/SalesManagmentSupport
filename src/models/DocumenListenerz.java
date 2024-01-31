/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author soporte
 */
public class DocumenListenerz implements DocumentListener {

    JTextField Texto;
    JLabel Imagen;

    public DocumenListenerz(JTextField texto, JLabel imagen) {
        this.Texto = texto;
        this.Imagen = imagen;
    }

    @Override
    public void insertUpdate(DocumentEvent e) {
        warn();
    }

    @Override
    public void removeUpdate(DocumentEvent e) {
        warn();
    }

    @Override
    public void changedUpdate(DocumentEvent e) {
        warn();
    }

    private void warn() {
        Double num = Double.parseDouble(Texto.getText().length() < 1 ? "0" : Texto.getText());
        if (num > 100) {
            Texto.setText(Texto.getText().substring(0, 2));
        }
        if (num >= 98) {
            colocarImagen();
        } else {
            limpiarImagen();
        }
    }

    private void colocarImagen() {
        Image iconx = new ImageIcon(getClass().getResource("/imgs/ic_done_128_28244.png")).getImage();
        String imagen = getClass().getResource("/imgs/ic_done_128_28244.png").getFile();
        
        ImageIcon icon = new ImageIcon(imagen);
        icon.getImage().flush();
        Imagen.setIcon(icon);
    }

    private void limpiarImagen() {
        Imagen.setIcon(null);
    }

}
