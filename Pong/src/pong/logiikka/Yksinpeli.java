/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pong.logiikka;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import pong.kappaleet.Palkki;
import pong.kappaleet.Pallo;
import pong.kayttoliittyma.Paivitettava;

/**
 *
 * @author Huusari Riikka
 */
public class Yksinpeli implements ActionListener{
    private Pallo pallo;
    private Palkki palkki1;
    private Palkki palkki2;
    private boolean jatkuu;
    private Paivitettava paivitettava;
    
    public Yksinpeli(){
        this.pallo=new Pallo();
        this.palkki1=new Palkki(10);
        this.palkki2=new Palkki(480);
        this.jatkuu=true;
    }
    
    
    public void liikutaTietokoneenPalkkia(){
        if(pallo.getY()<palkki2.getY()){
            palkki2.liikuYlos();
        }else if(pallo.getY()> palkki2.getY()){
            palkki2.liikuAlas();
        }
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
    public boolean getJatkuu(){
        return jatkuu;
    }
    public void setPaivitettava(Paivitettava paivitettava) {
        this.paivitettava = paivitettava;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //ja mikähän ihme tämän sitten laukaisee??
        pallo.liiku();
        liikutaTietokoneenPalkkia();
        if(pallo.getY()-5==10 || pallo.getY()+5 == 490){
            pallo.kaannaY();
        }if(pallo.getX()+5==480){
            if(pallo.getY()>palkki2.getY() & pallo.getY()<palkki2.getY()+40){
                pallo.kaannaX();
            } else{
                jatkuu=false;
            }
        }if(pallo.getX()-5 ==20){
            if(pallo.getY()>palkki1.getY() & pallo.getY()<palkki1.getY()+40){
                pallo.kaannaX();
            }else{
                jatkuu=false;
            }
        }
        paivitettava.paivita();
    }
}
