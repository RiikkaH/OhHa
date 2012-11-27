
package pong.kayttoliittyma;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import pong.logiikka.Kaksinpeli;
import pong.logiikka.Peli;
import pong.logiikka.Yksinpeli;

/**
 *
 * @author Huusari Riikka
 * Reagoi pelin nappien painallukseen
 */
public class NapinKuuntelija implements ActionListener{
    private KayttoliittymaPeli kliittyma;
    private JFrame frame;
    private Piirtoalusta alusta;
    public NapinKuuntelija(JFrame frame, int i, Piirtoalusta alusta){
        this.alusta = alusta;
        if(i==1){
            Peli yPeli = new Yksinpeli();
            this.kliittyma = new KayttoliittymaPeli(yPeli,alusta);
            alusta.setPeli(yPeli);
        }else if(i==2){
            Peli kPeli = new Kaksinpeli();
            this.kliittyma=new KayttoliittymaPeli(kPeli, alusta);
            alusta.setPeli(kPeli);
        }
        this.frame=frame;
    }
    /**
     * Metodissa on toiminnallisuus, joka suoritetaan kun
     * nappia painetaan, eli pelin käyttöliittymä käynnistetään
     * @param e ActionEvent
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        kliittyma.getPeli().setPaivitettava(alusta);
        kliittyma.run();
        frame.setVisible(false);
    }
    
}
