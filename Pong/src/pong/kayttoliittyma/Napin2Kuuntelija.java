
package pong.kayttoliittyma;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;


public class Napin2Kuuntelija implements ActionListener{
    private KayttoliittymaKaksinpeli kliittyma;
    private JFrame frame;
    public Napin2Kuuntelija(JFrame frame){
        this.kliittyma = new KayttoliittymaKaksinpeli();
        this.frame=frame;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        kliittyma.getPeli().setPaivitettava(kliittyma.getPaivitettava());
        kliittyma.run();
        frame.dispose();
    }
}
