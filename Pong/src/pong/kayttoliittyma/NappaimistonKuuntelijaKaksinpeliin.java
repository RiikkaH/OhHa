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
            palkki1.liikuYlos();
        }else if(ke.getKeyCode() == KeyEvent.VK_S){
            palkki1.liikuAlas(); 
        }
        //Miksi palkki jumittaa w:llä ja s:llä?
        component.repaint();
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
