/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pong.kayttoliittyma;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.*;
import pong.logiikka.Peli;

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
        frame.setPreferredSize(new Dimension(500, 525));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        luoKomponentit(frame.getContentPane());
        luoMenu();
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
    /**
     * luo pelin käyttöliittymään ylävalikon
     */
    public void luoMenu(){
        JMenuBar bar = new JMenuBar();
        JMenu menu = new JMenu("Valikko");
        bar.add(menu);
        JMenuItem item = new JMenuItem("Uusi yksinpeli");
        //item.addActionListener(new NapinKuuntelija(frame,1,alusta));
        //Miksi peli ei pyöri kun nämä toimivat??
        JMenuItem item2 = new JMenuItem("Uusi kaksinpeli");
        //item2.addActionListener(new NapinKuuntelija(frame,2,alusta));
        JMenuItem item3 = new JMenuItem("Asetukset");
        //item3.addActionListener(new NapinKuuntelijaAsetuksille(frame,alusta));
        menu.add(item);
        menu.add(item2);
        menu.add(item3);
        frame.setJMenuBar(bar);
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
