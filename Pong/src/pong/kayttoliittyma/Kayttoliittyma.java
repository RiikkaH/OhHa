/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pong.kayttoliittyma;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.*;

/**
 *
 * @author Huusari Riikka
 * Alun käyttöliittymä, luodaan valikko
 */
public class Kayttoliittyma implements Runnable{
    private JFrame frame;
    
    public Kayttoliittyma(){
        
    }
    @Override
    public void run(){
        frame =new JFrame("PONG");
        frame.setPreferredSize(new Dimension(500, 500));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        luoKomponentit(frame.getContentPane());
        frame.pack();
        frame.setVisible(true);
        
    }

    private void luoKomponentit(Container container) {
        
        container.add(luoValikko(), BorderLayout.CENTER);
        
    }
    private JPanel luoValikko() {
        JPanel panel = new JPanel(new GridLayout(3, 1));
        JButton yksinpeli = new JButton("Yksinpeli");
        JButton kaksinpeli = new JButton("Kaksinpeli");
        JButton erikoispeli = new JButton("Erikoispeli");
        yksinpeli.addActionListener(new NapinKuuntelija(frame,1));
        kaksinpeli.addActionListener(new NapinKuuntelija(frame,2));
        erikoispeli.addActionListener(new NapinKuuntelija(frame,3));
        panel.add(yksinpeli);
        panel.add(kaksinpeli);
        panel.add(erikoispeli);
        return panel;
    }

    public JFrame getFrame() {
        return frame;
    }
}
