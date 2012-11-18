/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pong.logiikka;

/**
 *
 * @author Huusari Riikka
 */
public class Yksinpeli extends Peli implements Runnable{
 
    
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
    
    @Override
    public void run() {
        int i = 0;
        while(i<10){
            
            pallo.liiku();
            muutaTietokoneenPalkinNopeutta();
            palkki1.liiku();
            palkki2.liiku();
            
            if(palloOsuuYlapalkkiin()){
                pallo.kaannaY();
            }if(palloOsuuAlapalkkiin()){
                pallo.kaannaY(); 
            }
            if(palloOsuuVasempaanPalkkiin()){
                if(palkki1.getNopeus()>0){
                    pallo.setYMuutos(pallo.getYMuutos()+1);
                }else if(palkki1.getNopeus()<0){
                    pallo.setYMuutos(pallo.getYMuutos()-1);
                } 
                pallo.kaannaX();
            }
            if(palloOsuuOikeaanPalkkiin()){
                if(palkki2.getNopeus()>0){
                    pallo.setYMuutos(pallo.getYMuutos()+1);
                }else if(palkki2.getNopeus()<0){
                    pallo.setYMuutos(pallo.getYMuutos()-1);
                }
                pallo.kaannaX();
            }
            if(palloOsuuVasemmanPalkinYlareunaan()){
                if(palkki1.getNopeus()<0){
                    pallo.setYMuutos(pallo.getYMuutos()-1);
                }
                pallo.kaannaY();
            }
            if(palloOsuuVasemmanPalkinAlareunaan()){
                if(palkki1.getNopeus()>0){
                    pallo.setYMuutos(pallo.getYMuutos()+1);
                }
                pallo.kaannaY();
            }
            if(palloOsuuOikeanPalkinYlareunaan()){
                if(palkki1.getNopeus()<0){
                    pallo.setYMuutos(pallo.getYMuutos()-1);
                }
                pallo.kaannaY();
            }
            if(palloOsuuOikeanPalkinAlareunaan()){
                if(palkki2.getNopeus()>0){
                    pallo.setYMuutos(pallo.getYMuutos()+1);
                }
                pallo.kaannaY();
            }
            
            if(palloMeneeOikeanReunanYli()){
                lisaaTilasto1eenYksi();
                pallo.setX(250);
                pallo.setY(250);
                pallo.setXMuutos(-1);
                pallo.setYMuutos(1);
            }if(palloMeneeVasemmanReunanYli()){
                lisaaTilasto2eenYksi();
                pallo.setX(250);
                pallo.setY(250);
                pallo.setXMuutos(1);
                pallo.setYMuutos(1);
            }
            
            paivitettava.paivita();
            
            int j = 0;
            if(tilasto2>tilasto1){
                j=tilasto2;
            }else if(tilasto1>tilasto2){
                j=tilasto1;
            }
            i=j;
            
            try{
                Thread.sleep(5);
            }
            catch(InterruptedException ie){
                return;
            }
            
        }
    }
}
