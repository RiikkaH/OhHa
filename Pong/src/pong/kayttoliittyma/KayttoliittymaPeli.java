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
 * Pelin käyttöliittymä
 */
public class KayttoliittymaPeli implements Runnable{
    /**
     * pelin käyttöliittymän frame
     */
    private JFrame frame;
    /**
     * Käyttöliitymän peli
     */
    private Peli peli;
    /**
     * käyttöliittymän piirtoalusta
     */
    private Piirtoalusta alusta;
    public KayttoliittymaPeli(Peli peli, Piirtoalusta alusta){
        this.peli = peli;
        this.alusta = alusta;
    }
    /**
     * luo käyttöliittymän
     */
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
    /**
     * luo käyttöliittymän komponentit
     * @param container 
     */
    private void luoKomponentit(Container container){
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
