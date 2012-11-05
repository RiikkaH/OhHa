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
public class Yksinpeli {
    private Pallo pallo;
    private Palkki palkki1;
    private Palkki palkki2;
    public Yksinpeli(){
        this.pallo=new Pallo();
        this.palkki1=new Palkki(10);
        this.palkki2=new Palkki(480);
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
}
