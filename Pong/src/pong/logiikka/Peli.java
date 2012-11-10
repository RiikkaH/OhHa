/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pong.logiikka;

import pong.kappaleet.Palkki;
import pong.kappaleet.Pallo;

/**
 *
 * @author Huusari Riikka
 */
public class Peli {
    public Pallo pallo;
    public Palkki palkki1;
    public Palkki palkki2;
    public boolean jatkuu;
    public Peli(){
        pallo = new Pallo();
        palkki1 = new Palkki(10);
        palkki2 = new Palkki(470);
        jatkuu = true;
        
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
}
