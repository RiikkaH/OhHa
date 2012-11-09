
package pong.kayttoliittyma;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Napin1Kuuntelija implements ActionListener{
    private KayttoliittymaYksinpeli kliittyma;
    public Napin1Kuuntelija(){
        this.kliittyma=new KayttoliittymaYksinpeli();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        kliittyma.run();
    }
    
}
