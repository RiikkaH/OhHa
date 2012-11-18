
package pong.kayttoliittyma;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;


public class Napin1Kuuntelija implements ActionListener{
    private KayttoliittymaYksinpeli kliittyma;
    private JFrame frame;
    public Napin1Kuuntelija(JFrame frame){
        this.kliittyma=new KayttoliittymaYksinpeli();
        this.frame=frame;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        kliittyma.getPeli().setPaivitettava(kliittyma.getPaivitettava());
        kliittyma.run();
        frame.dispose();
    }
    
}
