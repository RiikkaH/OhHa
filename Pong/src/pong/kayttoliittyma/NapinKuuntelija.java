
package pong.kayttoliittyma;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import pong.logiikka.Erikoispeli;
import pong.logiikka.Kaksinpeli;
import pong.logiikka.Yksinpeli;


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
        }else if(i==3){
            Erikoispeli ePeli = new Erikoispeli();
            this.kliittyma = new KayttoliittymaPeli(ePeli);
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
