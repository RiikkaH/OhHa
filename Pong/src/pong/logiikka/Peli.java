/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pong.logiikka;


import pong.kappaleet.Palkki;
import pong.kappaleet.Pallo;
import pong.kayttoliittyma.Paivitettava;

/**
 *
 * @author Huusari Riikka
 */
public class Peli implements Runnable{
    public Pallo pallo;
    public Palkki palkki1;
    public Palkki palkki2;
    public Paivitettava paivitettava;
    public int tilasto1;
    public int tilasto2;
    public Pallo hamaysPallo1;
    public Pallo hamaysPallo2;

    public Peli(){
        pallo = new Pallo();
        palkki1 = new Palkki(10);
        palkki2 = new Palkki(470);
        tilasto1=0;
        tilasto2=0;
        this.hamaysPallo1= null;
        this.hamaysPallo2 = null;
    }
    public Pallo getHamaysPallo1(){
        return hamaysPallo1;
    }
    public Pallo getHamaysPallo2(){
        return hamaysPallo2;
    }
    public int getTilasto1(){
        return tilasto1;
    }
    public void lisaaTilasto1eenYksi(){
        tilasto1++;
    }
    public int getTilasto2(){
        return tilasto2;
    }
    public void lisaaTilasto2eenYksi(){
        tilasto2++;
    }
    public Pallo getPallo(){
        return pallo;
    }
    public Palkki getPalkki1(){
        return palkki1;
    }
    public Palkki getPalkki2(){
        return palkki2;
    }
    public void setPaivitettava(Paivitettava paivitettava) {
        this.paivitettava = paivitettava;
    }
    public boolean palloOsuuYlapalkkiin(){
        if(pallo.getY()<= 10){
            return true;
        }
        return false;
    }
    public boolean palloOsuuAlapalkkiin(){
        if(pallo.getY()>=447){
            return true;
        }
        return false;
    }
    public boolean palloOsuuVasempaanPalkkiin(){
        if(pallo.getY()+10>palkki1.getY() & pallo.getY() < palkki1.getY()+40){
            if(pallo.getX()-palkki1.getX()==10){
                return true;
            }
        }
        return false;
    }
    public boolean palloOsuuOikeaanPalkkiin(){
        if(pallo.getY()+10>palkki2.getY() & pallo.getY() < palkki2.getY()+40){
            if(palkki2.getX()-pallo.getX()==10){
                return true;
            }
        }
        return false;
    }
    public boolean palloOsuuVasemmanPalkinAlareunaan(){
        if(pallo.getY()==palkki1.getY()+40){
            if(pallo.getX()<palkki1.getX()+10 & pallo.getX() > palkki1.getX()-10){
                return true;
            }
        }
        return false;
    }
    public boolean palloOsuuOikeanPalkinAlareunaan(){
        if(pallo.getY()==palkki2.getY()+40){
            if(pallo.getX()<palkki2.getX()+10 & pallo.getX() > palkki2.getX()-10){
                return true;
            }
        }
        return false;
    }
    public boolean palloOsuuVasemmanPalkinYlareunaan(){
        if(pallo.getY()-10==palkki1.getY()){
            if(pallo.getX()<palkki1.getX()+10 & pallo.getX() > palkki1.getX()-10){
                return true;
            }
        }
        return false;
    }
    public boolean palloOsuuOikeanPalkinYlareunaan(){
        if(pallo.getY()-10==palkki2.getY()){
            if(pallo.getX()<palkki2.getX()+10 & pallo.getX() > palkki2.getX()-10){
                return true;
            }
        }
        return false;
    }
    
    public boolean palloMeneeVasemmanReunanYli(){
        if(pallo.getX()<=-5 ){
            return true;
        }
       return false;
    }
    public boolean palloMeneeOikeanReunanYli(){
        if(pallo.getX() >= 505){
            return true;
        }
        return false;
    }

    @Override
    public void run() {
 
    }
}
