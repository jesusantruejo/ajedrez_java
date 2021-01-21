/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz_Grafica;

import Nucleo.Cerebro;
import java.awt.Desktop;
import java.awt.Image;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Jesús y Lucia
 */
public class Inicio extends javax.swing.JFrame {

    public Inicio() {
        initComponents();

        //Aqui le ponemos una imagen de fondo para que quede bonito
        ImageIcon portada = new ImageIcon(getClass().getResource("portada.png"));
        Image img = portada.getImage();
        img = img.getScaledInstance(jLabelPortada.getWidth(), jLabelPortada.getHeight(), java.awt.Image.SCALE_SMOOTH);
        portada.setImage(img);
        jLabelPortada.setIcon(portada);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonJugar = new javax.swing.JButton();
        jButtonReglas = new javax.swing.JButton();
        jLabelPortada = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(153, 255, 153));
        setMaximumSize(new java.awt.Dimension(964, 515));
        setMinimumSize(new java.awt.Dimension(964, 515));
        getContentPane().setLayout(null);

        jButtonJugar.setFont(new java.awt.Font("Georgia Pro Black", 1, 24)); // NOI18N
        jButtonJugar.setText("JUGAR");
        jButtonJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonJugarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonJugar);
        jButtonJugar.setBounds(150, 320, 193, 95);

        jButtonReglas.setFont(new java.awt.Font("Georgia Pro Black", 1, 24)); // NOI18N
        jButtonReglas.setText("REGLAS");
        jButtonReglas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReglasActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonReglas);
        jButtonReglas.setBounds(580, 320, 193, 96);
        getContentPane().add(jLabelPortada);
        jLabelPortada.setBounds(0, 0, 970, 460);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonJugarActionPerformed
        //Aqui llama a la ventana del tablero, y se quita esta

        Cerebro.reset();
        this.dispose();
    }//GEN-LAST:event_jButtonJugarActionPerformed

    private void jButtonReglasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReglasActionPerformed
        //En el boton reglas, al hacer click, te manda a la página donde están establecidas las reglas del ajedrez

        URL urlReglamentoAjedrez;

        try {
            urlReglamentoAjedrez = new URL("https://feda.org/feda2k16/wp-content/uploads/Leyes2018.pdf");
            try {
                Desktop.getDesktop().browse(urlReglamentoAjedrez.toURI());
            } catch (IOException e) {
                JOptionPane.showMessageDialog(this, "ERROR");
            } catch (URISyntaxException e) {
                JOptionPane.showMessageDialog(this, "ERROR");
            }
        } catch (MalformedURLException e1) {
            JOptionPane.showMessageDialog(this, "ERROR");
        }

    }//GEN-LAST:event_jButtonReglasActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonJugar;
    private javax.swing.JButton jButtonReglas;
    private javax.swing.JLabel jLabelPortada;
    // End of variables declaration//GEN-END:variables
}