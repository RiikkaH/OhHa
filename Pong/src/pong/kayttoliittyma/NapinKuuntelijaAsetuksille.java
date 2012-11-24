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
public class NapinKuuntelijaAsetuksille implements ActionListener{
    private KayttoliittymaAsetukset kliittyma;
    private JFrame frame;
    public NapinKuuntelijaAsetuksille(JFrame frame){
        kliittyma = new KayttoliittymaAsetukset(frame);
        this.frame=frame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        kliittyma.run();
        frame.dispose();
    }
}
