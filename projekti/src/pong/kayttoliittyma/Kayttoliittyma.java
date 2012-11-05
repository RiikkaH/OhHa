/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pong.kayttoliittyma;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
import pong.logiikka.Yksinpeli;


public class Kayttoliittyma implements Runnable{
    private JFrame frame;
    private Yksinpeli yksinpeli;
    public Kayttoliittyma(){
        this.yksinpeli=new Yksinpeli();
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
        //luodaan piirtoalusta ja silleen
        
    }

    public JFrame getFrame() {
        return frame;
    }
}
