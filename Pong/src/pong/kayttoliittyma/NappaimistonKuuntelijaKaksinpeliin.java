/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pong.kayttoliittyma;

import java.awt.Component;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import pong.kappaleet.Palkki;

/**
 *
 * @author Huusari Riikka
 */
public class NappaimistonKuuntelijaKaksinpeliin implements KeyListener{
    private Palkki palkki1;

    private Component component;
    public NappaimistonKuuntelijaKaksinpeliin(Palkki palkki1, Component component){
        this.component=component;
        this.palkki1=palkki1;
        
    }

    @Override
    public void keyTyped(KeyEvent ke) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void keyPressed(KeyEvent ke) {
         if(ke.getKeyCode() == KeyEvent.VK_W){
        //ke.getChar tms??
            palkki1.liikuYlos();
        }else if(ke.getKeyCode() == KeyEvent.VK_S){
            palkki1.liikuAlas(); 
        }
        //Miksi palkki jumittaa w:llä ja s:llä?
        //palkilla on nopeus, kun nolla ei liiku ja noissa ylhäällä vain muutetaan nopeus, jossain pelissä sitten 
        //aina yritetään liikuttaa palkkia, mutta jos nopeus on nolla niin ihan vain ohitetaan
        component.repaint();
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        //nopeus muutetaan nollaan
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
