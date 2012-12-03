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
    /**
     * Pelin pallo
     */
    public Pallo pallo;
    /**
     * pelin vasen palkki
     */
    public Palkki palkki1;
    /**
     * pelin oikea palkki
     */
    public Palkki palkki2;
    /**
     * Rajapinnan Paivitettava toteuttava olio, käytännössä
     * Piirtoalusta
     */
    public Paivitettava paivitettava;
    /**
     * Vasemmanpuoleisen pelaajan tilasto joka kertoo,
     * kuinka monta kertaa pallo on mennyt oikean reunan
     * yli
     */
    public int tilasto1;
    /**
     * Oikeanpuoleisen pelaajan tilasto joka kertoo,
     * kuinka monta kertaa pallo on mennyt vasemman reunan
     * yli
     */
    public int tilasto2;
    /**
     * Kertoo, onko peli käynnissä
     */
    public boolean jatkuu;
    /**
     * Tätä käytetään while-silmukassa
     */
    public int i;

    public Peli(){
        pallo = new Pallo();
        palkki1 = new Palkki(10);
        palkki2 = new Palkki(470);
        tilasto1=0;
        tilasto2=0;
        jatkuu = true;
        i = 0;
    }
    public boolean getJatkuu(){
        return jatkuu;
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
    /**
     * Metodi tarkastaa, osuuko pallo pelin ylälaitaan
     * ja jos osuu, kääntää pallon suunnan
     * @param p 
     */
    public void palloOsuuYlapalkkiin(Pallo p){
        if(p.getY()<= 10){
            if(p.getYMuutos()<0){
                p.kaannaY();
            }
        }
    }
    /**
     * Metodi tarkastaa osuuko pallo pelin alalaitaan
     * ja jos osuu, kääntää pallon suunnan
     * @param p Pelin pallo
     */
    public void palloOsuuAlapalkkiin(Pallo p){
        if(p.getY()>=447){
            if(p.getYMuutos()>0){
                p.kaannaY();
            }
        }
    }
    /**
     * Metodi tarkastaa osuuko pallo palkkiin ja jos 
     * osuu, kääntää pallon suunnan ja mahdollisesti säätää
     * nopeutta
     * @param p Pelin pallo
     * @param k Palkki, johon pallon osuminen halutaan tarkastaa
     */
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
    /**
     * Metodi tarkastaa osuuko pallo palkin alareunaan,
     * ja jos osuu, kääntää pallon suunnan, ja mahdollisesti 
     * säätää pallon nopeuuta
     * @param p Pelin pallo
     * @param k Palkki, johon pallon osuminen tarkastetaan
     */
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
    /**
     * Metodi tarkastaa osuuko pallo palkin yläreunaan,
     * ja jos osuu, kääntää pallon suunnan, ja mahdollisesti 
     * säätää pallon nopeuuta
     * @param p Pelin pallo
     * @param k Palkki, johon pallon osuminen tarkastetaan 
     */
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
    /**
     * Metodi tarkastaa meneekö pallo vasemman reunan yli,
     * jolloin pallo asetetaan uudestaan keskelle ja oikean
     * puolen pelaajan tilastoon lisätään piste
     * @param p Pelin pallo
     */
    public void palloMeneeVasemmanReunanYli(Pallo p){
        if(p.getX()<=-5 ){
            lisaaTilasto2eenYksi();
            p.setX(250);
            p.setY(250);
            p.setXMuutos(1.4);
            p.setYMuutos(1.1);
        }
    }
    /**
     * Metodi tarkastaa meneekö pallo oikean reunan yli,
     * jolloin pallo asetetaan uudestaan keskelle ja vasemman
     * puolen pelaajan tilastoon lisätään piste
     * @param p 
     */
    public void palloMeneeOikeanReunanYli(Pallo p){
        if(p.getX() >= 505){
            lisaaTilasto1eenYksi();
            p.setX(250);
            p.setY(250);
            p.setXMuutos(-1.3);
            p.setYMuutos(1.1);
        }
    }
    /**
     * Metodi huolehtii pelin etenemisestä
     */
    @Override
    public void run() {
 
    }
    /**
     * Metodi huolehtii siitä, että peli päättyy oikeaan aikaan
     */
    public void katsoJatkuukoPeli(){
        int j = 0;
        if(tilasto2>tilasto1){
            j=tilasto2;
        }else if(tilasto1>tilasto2){
            j=tilasto1;
        }
        i=j;
        if(i==10){
            jatkuu=false;
        }
    }
}
