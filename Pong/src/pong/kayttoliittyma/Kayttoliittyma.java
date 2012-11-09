/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pong.kayttoliittyma;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
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
        BoxLayout layout = new BoxLayout(container,BoxLayout.Y_AXIS);
        container.setLayout(layout);
        
        JButton nappi1 = new JButton("Yksinpeli");
        JButton nappi2 = new JButton("Kaksinpeli");
        container.add(nappi1);
        container.add(nappi2);
        
        
    }

    public JFrame getFrame() {
        return frame;
    }
}
