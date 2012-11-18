/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pong.kayttoliittyma;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

/**
 *
 * @author Huusari Riikka
 */
public class Napin3Kuuntelija implements ActionListener{
    private KayttoliittymaErikoispeli kliittyma;
    private JFrame frame;
    public Napin3Kuuntelija(JFrame frame){
        this.kliittyma = new KayttoliittymaErikoispeli();
        this.frame=frame;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        kliittyma.getPeli().setPaivitettava(kliittyma.getPaivitettava());
        kliittyma.run();
        frame.dispose();
    }
}
