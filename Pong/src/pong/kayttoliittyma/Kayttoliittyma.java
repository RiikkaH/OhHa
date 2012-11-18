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
import pong.logiikka.Yksinpeli;


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
        Napin1Kuuntelija kuuntelija1 = new Napin1Kuuntelija(frame);
        Napin2Kuuntelija kuuntelija2 = new Napin2Kuuntelija(frame);
        Napin3Kuuntelija kuuntelija3 = new Napin3Kuuntelija(frame);
        yksinpeli.addActionListener(kuuntelija1);
        kaksinpeli.addActionListener(kuuntelija2);
        erikoispeli.addActionListener(kuuntelija3);
        panel.add(yksinpeli);
        panel.add(kaksinpeli);
        panel.add(erikoispeli);
        return panel;
    }

    public JFrame getFrame() {
        return frame;
    }
}
