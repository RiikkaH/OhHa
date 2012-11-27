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
 * Reagoi "takaisin" -napin painallukseen
 */
public class TakaisinNapinKuuntelija implements ActionListener{
    private JFrame frame;
    private JFrame frame2;
    public TakaisinNapinKuuntelija(JFrame frame,JFrame frame2){
        this.frame=frame;
        this.frame2=frame2;
    }
    /**
     * Kun "takaisin" -nappia painetaan, metodi poistaa näkyvistä
     * asetusikkunan ja laittaa näkyviin valikkoikkunan
     * @param e ActionEvent
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        frame2.pack();
        frame2.setVisible(true);
        frame.dispose();
    }
    
}
