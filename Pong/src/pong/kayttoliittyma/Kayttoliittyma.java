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
        
        //frame.dispose poistaa näkyvistä
    }

    private void luoKomponentit(Container container) {
        
        container.add(luoValikko(), BorderLayout.CENTER);
        
    }
    private JPanel luoValikko() {
        JPanel panel = new JPanel(new GridLayout(2, 1));
        JButton yksinpeli = new JButton("Yksinpeli");
        JButton kaksinpeli = new JButton("Kaksinpeli");
        Napin1Kuuntelija kuuntelija1 = new Napin1Kuuntelija();
        Napin2Kuuntelija kuuntelija2 = new Napin2Kuuntelija();
        yksinpeli.addActionListener(kuuntelija1);
        kaksinpeli.addActionListener(kuuntelija2);
        panel.add(yksinpeli);
        panel.add(kaksinpeli);
        return panel;
    }

    public JFrame getFrame() {
        return frame;
    }
}
