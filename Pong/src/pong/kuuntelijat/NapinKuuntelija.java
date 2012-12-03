
package pong.kuuntelijat;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import pong.kayttoliittyma.KayttoliittymaPeli;
import pong.kayttoliittyma.Piirtoalusta;
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
    private int i;
    public NapinKuuntelija(JFrame frame, int i, Piirtoalusta alusta){
        this.alusta = alusta;
        this.i=i;
        this.frame=frame;
    }
    /**
     * Metodissa on toiminnallisuus, joka suoritetaan kun
     * nappia painetaan, eli pelin käyttöliittymä käynnistetään
     * @param e ActionEvent
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if(i==1){
            Peli yPeli = new Yksinpeli();
            this.kliittyma = new KayttoliittymaPeli(yPeli,alusta);
            alusta.setPeli(yPeli);
        }else if(i==2){
            Peli kPeli = new Kaksinpeli();
            this.kliittyma=new KayttoliittymaPeli(kPeli, alusta);
            alusta.setPeli(kPeli);
        }
        kliittyma.getPeli().setPaivitettava(alusta);
        kliittyma.run();
        frame.setVisible(false);
    }
    
}
