/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pong.logiikka;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import pong.kayttoliittyma.Paivitettava;

/**
 *
 * @author Huusari Riikka
 */
public class Yksinpeli extends Peli implements ActionListener{
    
    private Paivitettava paivitettava;
    
    public Yksinpeli(){
        
    }
    
    public void muutaTietokoneenPalkinNopeutta(){
        if(pallo.getY()<palkki1.getY()){
            palkki1.setNopeus(-2);
        }else if(pallo.getY()> palkki1.getY()+40){
            palkki1.setNopeus(2);
        }else{
            palkki1.setNopeus(0);
        }
    }
    
    public void setPaivitettava(Paivitettava paivitettava) {
        this.paivitettava = paivitettava;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //ja mikähän ihme tämän sitten laukaisee??
        pallo.liiku();
        muutaTietokoneenPalkinNopeutta();
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
