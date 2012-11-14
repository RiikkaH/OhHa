
package pong.logiikka;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import pong.kayttoliittyma.Paivitettava;


public class Kaksinpeli extends Peli implements ActionListener{
    
    private Paivitettava paivitettava;
    
    public Kaksinpeli(){ 
    }

    public void setPaivitettava(Paivitettava paivitettava) {
        this.paivitettava = paivitettava;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        pallo.liiku();
        palkki1.liiku();
        palkki2.liiku();
        if(palloOsuuYlapalkkiin()){
            pallo.kaannaY();
        }if(palloOsuuAlapalkkiin()){
            pallo.kaannaY();
        }if(palloOsuuVasempaanPalkkiin()){
            pallo.kaannaX();
        }if(palloOsuuOikeaanPalkkiin()){
            pallo.kaannaX();
        }
        paivitettava.paivita();
    }
}
