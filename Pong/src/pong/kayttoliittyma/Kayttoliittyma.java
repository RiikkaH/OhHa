/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pong.kayttoliittyma;

import pong.kuuntelijat.NapinKuuntelijaAsetuksille;
import pong.kuuntelijat.NapinKuuntelija;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.*;

/**
 *
 * @author Huusari Riikka
 * Alun käyttöliittymä, luodaan alkuvalikko
 */
public class Kayttoliittyma implements Runnable{
    /**
     * Kayttoliittyman frame
     */
    private JFrame frame;
    /**
     * pelien Piirtoalusta
     */
    private Piirtoalusta alusta;
    public Kayttoliittyma(){
        alusta = new Piirtoalusta(null);
    }
    /**
     * Luo käyttöliittymän ja sen ominaisuudet
     */
    @Override
    public void run(){
        frame =new JFrame("PONG");
        frame.setPreferredSize(new Dimension(500, 525));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        luoKomponentit(frame.getContentPane());
        frame.pack();
        frame.setVisible(true);
        
    }
    /**
     * Luo käyttöliittymän komponentit
     * @param container 
     */
    private void luoKomponentit(Container container) {
        
        container.add(luoValikko(), BorderLayout.CENTER);
        
    }
    /**
     * Luo Käyttöliittymän valikon
     * @return JPanel 
     */
    private JPanel luoValikko() {
        JPanel panel = new JPanel(new GridLayout(3, 1));
        JButton yksinpeli = luoNappi("Yksinpeli");
        JButton kaksinpeli = luoNappi("Kaksinpeli");
        JButton asetukset = luoNappi("Asetukset");
        yksinpeli.addActionListener(new NapinKuuntelija(frame,1, alusta));
        kaksinpeli.addActionListener(new NapinKuuntelija(frame,2, alusta));
        asetukset.addActionListener(new NapinKuuntelijaAsetuksille(frame, alusta));
        panel.add(yksinpeli);
        panel.add(kaksinpeli);
        panel.add(asetukset);
        return panel;
    }
    /**
     * Luo napin, jonka taustaväri on harmaa ja jonka teksti on syaanilla.
     * @param teksti Napin teksti
     * @return JButton
     */
    public JButton luoNappi(String teksti){
        JButton nappi = new JButton(teksti);
        nappi.setBackground(Color.GRAY);
        nappi.setForeground(Color.CYAN);
        return nappi;
    }

    public JFrame getFrame() {
        return frame;
    }
}
