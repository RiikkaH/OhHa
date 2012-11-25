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
 * Täällä on kaikki työkalut Pongin pelaamiseen
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
    public boolean jatkuu;

    public Peli(){
        pallo = new Pallo();
        palkki1 = new Palkki(10);
        palkki2 = new Palkki(470);
        tilasto1=0;
        tilasto2=0;
        this.hamaysPallo1= null;
        this.hamaysPallo2 = null;
        jatkuu = true;
    }
    public boolean getJatkuu(){
        return jatkuu;
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
    public void palloOsuuYlapalkkiin(Pallo p){
        if(p.getY()<= 10){
            p.kaannaY();
        }
    }
    public void palloOsuuAlapalkkiin(Pallo p){
        if(p.getY()>=447){
            p.kaannaY();
        }
    }
    public void palloOsuuPalkkiin(Pallo p, Palkki k){
        if(p.getY()+10>k.getY() & p.getY() < k.getY()+50){
            if(Math.abs(p.getX()-k.getX())==10){
                if(k.getNopeus()>0){
                    p.setYMuutos(p.getYMuutos()+1);
                }else if(k.getNopeus()<0){
                    p.setYMuutos(p.getYMuutos()-1);
                } 
                p.kaannaX();
            }
        }
    }
    
    public void palloOsuuPalkinAlareunaan(Pallo p, Palkki k){
        if(p.getY()==k.getY()+40 & pallo.getYMuutos()<0){
            if(p.getX()<k.getX()+10 & p.getX() > k.getX()-10){
                if(k.getNopeus()>0){
                    p.setYMuutos(p.getYMuutos()+1);
                }
                p.kaannaY();
            }
        }
    }
    
    public void palloOsuuPalkinYlareunaan(Pallo p, Palkki k){
        if(p.getY()+10==k.getY() & pallo.getYMuutos()>0){
            if(p.getX()<k.getX()+10 & p.getX() > k.getX()-10){
                if(k.getNopeus()<0){
                    p.setYMuutos(p.getYMuutos()-1);
                }
                p.kaannaY();
            }
        }
    }
    
    public void palloMeneeVasemmanReunanYli(Pallo p){
        if(p.getX()<=-5 ){
            lisaaTilasto2eenYksi();
            p.setX(250);
            p.setY(250);
            p.setXMuutos(1.3);
            p.setYMuutos(1.1);
        }
    }
    public void palloMeneeOikeanReunanYli(Pallo p){
        if(p.getX() >= 505){
            lisaaTilasto1eenYksi();
            p.setX(250);
            p.setY(250);
            p.setXMuutos(-1.3);
            p.setYMuutos(1.1);
        }
    }

    @Override
    public void run() {
 
    }
}
