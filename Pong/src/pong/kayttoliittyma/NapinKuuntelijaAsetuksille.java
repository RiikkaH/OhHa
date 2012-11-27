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
 * Reagoi "asetus" -napin painamiseen
 */
public class NapinKuuntelijaAsetuksille implements ActionListener{
    private KayttoliittymaAsetukset kliittyma;
    private JFrame frame;
    private Piirtoalusta alusta;
    public NapinKuuntelijaAsetuksille(JFrame frame, Piirtoalusta alusta){
        kliittyma = new KayttoliittymaAsetukset(frame, alusta);
        this.frame=frame;
        this.alusta = alusta;
    }
    /**
     * Kun "asetus" -nappia painetaan, metodi avaa asetusikkunan 
     * ja sulkee pelivalikkoikkunan
     * @param e ActionEvent
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        kliittyma.setPiirtoalusta(alusta);
        kliittyma.run();
        frame.dispose();
    }
}
