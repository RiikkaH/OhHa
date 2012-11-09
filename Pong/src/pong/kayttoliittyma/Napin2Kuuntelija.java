
package pong.kayttoliittyma;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Napin2Kuuntelija implements ActionListener{
    private KayttoliittymaKaksinpeli kliittyma;
    public Napin2Kuuntelija(){
        this.kliittyma = new KayttoliittymaKaksinpeli();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        kliittyma.run();
    }
}
