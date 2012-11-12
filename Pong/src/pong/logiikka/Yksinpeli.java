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
    
    public void liikutaTietokoneenPalkkia(){
        if(pallo.getY()<palkki2.getY()){
            palkki2.liikuYlos();
        }if(pallo.getY()> palkki2.getY()+40){
            palkki2.liikuAlas();
        }
    }
    
    public void setPaivitettava(Paivitettava paivitettava) {
        this.paivitettava = paivitettava;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //ja mikähän ihme tämän sitten laukaisee??
        pallo.liiku();
        liikutaTietokoneenPalkkia();
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
