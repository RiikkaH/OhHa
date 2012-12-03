/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pong.logiikka;

/**
 *
 * @author Huusari Riikka
 * Perii Pelin, luo yksinpelin
 */
public class Yksinpeli extends Peli implements Runnable{
 
    
    public Yksinpeli(){
        
    }
    /**
     * Metodi huolehtii tietokoneen palkin nopeuden säätämisestä
     */
    public void muutaTietokoneenPalkinNopeutta(){
        if(pallo.getXMuutos()<0){
            if(pallo.getY()<palkki1.getY()){
                palkki1.setNopeus(-2);
            }else if(pallo.getY()> palkki1.getY()+40){
                palkki1.setNopeus(2);
            }else{
                palkki1.setNopeus(0);
            }
        }
    }
    /**
     * Metodi huolehtii pelin etenemisestä
     */
    @Override
    public void run() {
        while(i<10){
            
            pallo.liiku();
            muutaTietokoneenPalkinNopeutta();
            palkki1.liiku();
            palkki2.liiku();
            
            palloOsuuYlapalkkiin(pallo);
            palloOsuuAlapalkkiin(pallo);
            palloOsuuPalkkiin(pallo, palkki1);
            palloOsuuPalkkiin(pallo, palkki2);
            palloOsuuPalkinYlareunaan(pallo, palkki1);
            palloOsuuPalkinYlareunaan(pallo, palkki2);
            palloOsuuPalkinAlareunaan(pallo, palkki1);
            palloOsuuPalkinAlareunaan(pallo, palkki2);
            palloMeneeOikeanReunanYli(pallo);
            palloMeneeVasemmanReunanYli(pallo);
            
            paivitettava.paivita();
            
            katsoJatkuukoPeli();
            
            try{
                Thread.sleep(5);
            }catch(InterruptedException ie){
                return;
            }
        }
        
    }
}
