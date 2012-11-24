
package pong.kayttoliittyma;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import pong.logiikka.Kaksinpeli;
import pong.logiikka.Yksinpeli;

/**
 *
 * @author Huusari Riikka
 * Reagoi napin painallukseen
 */
public class NapinKuuntelija implements ActionListener{
    private KayttoliittymaPeli kliittyma;
    private JFrame frame;
    public NapinKuuntelija(JFrame frame, int i){
        if(i==1){
            Yksinpeli yPeli = new Yksinpeli();
            this.kliittyma = new KayttoliittymaPeli(yPeli);
        }else if(i==2){
            Kaksinpeli kPeli = new Kaksinpeli();
            this.kliittyma=new KayttoliittymaPeli(kPeli);
        }
        this.frame=frame;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        kliittyma.getPeli().setPaivitettava(kliittyma.getPaivitettava());
        kliittyma.run();
        frame.dispose();
    }
    
}
