/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pong.kayttoliittyma;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
import pong.logiikka.Peli;
import pong.logiikka.Yksinpeli;

/**
 *
 * @author Huusari Riikka
 */
public class KayttoliittymaPeli implements Runnable{
    private JFrame frame;
    private Peli peli;
    private Piirtoalusta alusta;
    public KayttoliittymaPeli(Peli peli){
        this.peli = peli;
    }
    @Override
    public void run() {
        frame =new JFrame("PONG");
        frame.setPreferredSize(new Dimension(500, 500));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        luoKomponentit(frame.getContentPane());
        frame.pack();
        frame.setVisible(true);
        new Thread(peli).start();
    }
    private void luoKomponentit(Container container){
        alusta = new Piirtoalusta(peli);
        peli.setPaivitettava(alusta); 
        container.add( alusta);
        frame.addKeyListener(new NappaimistonKuuntelija(peli,alusta));
    }
    public Paivitettava getPaivitettava(){
        return alusta;
    }
    public JFrame getFrame() {
        return frame;
    }
    public Peli getPeli(){
        return this.peli;
    }
}
