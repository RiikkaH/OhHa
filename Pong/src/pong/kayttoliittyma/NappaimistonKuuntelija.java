/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pong.kayttoliittyma;

import java.awt.Component;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import pong.kappaleet.Palkki;
import pong.kappaleet.Pallo;
import pong.logiikka.Erikoispeli;
import pong.logiikka.Kaksinpeli;
import pong.logiikka.Peli;


/**
 *
 * @author Huusari Riikka
 * Reagoi näppäinten painalluksiin
 */
public class NappaimistonKuuntelija implements KeyListener{
    private Palkki palkki1;
    private Palkki palkki2;
    private Peli peli;
    private Kaksinpeli kPeli;
    private Erikoispeli ePeli;
    private Component component;
    public NappaimistonKuuntelija(Peli peli, Component component){
        this.palkki1=peli.getPalkki1();
        this.palkki2=peli.getPalkki2();
        this.peli=peli;
        this.kPeli=new Kaksinpeli();
        this.ePeli=new Erikoispeli();
        this.component=component;
    }
    
    @Override
    public void keyPressed(KeyEvent e){
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            palkki2.setNopeus(-2);
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            palkki2.setNopeus(2);
        }if(e.getKeyCode() == KeyEvent.VK_W){
            if(peli.getClass()==kPeli.getClass()){
                palkki1.setNopeus(-2);
            }
        }else if(e.getKeyCode() == KeyEvent.VK_S){
            if(peli.getClass()==kPeli.getClass()){
                palkki1.setNopeus(2); 
            }
        }
        if(e.getKeyCode() == KeyEvent.VK_LEFT){
            if(peli.getClass()==ePeli.getClass()){
                peli.getHamaysPallo2().setX(peli.getPalkki2().getX()-10);
                peli.getHamaysPallo2().setY(peli.getPalkki2().getY()+20);
                peli.getHamaysPallo2().setXMuutos(-1.25);
                peli.getHamaysPallo2().setYMuutos(1.5);
            }
        }
        if(e.getKeyCode() == KeyEvent.VK_D){
            if(peli.getClass()==ePeli.getClass()){
                peli.getHamaysPallo1().setX(peli.getPalkki1().getX()-10);
                peli.getHamaysPallo1().setY(peli.getPalkki1().getY()+20);
                peli.getHamaysPallo1().setXMuutos(1.25);
                peli.getHamaysPallo1().setYMuutos(-1.5);
            }
        }
        component.repaint();
    }

    @Override
    public void keyTyped(KeyEvent ke) {
        
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        if (ke.getKeyCode() == KeyEvent.VK_UP) {
            palkki2.setNopeus(0);
        } else if (ke.getKeyCode() == KeyEvent.VK_DOWN) {
            palkki2.setNopeus(0);
        }if(ke.getKeyCode() == KeyEvent.VK_W){
            if(peli.getClass()==kPeli.getClass()){
                palkki1.setNopeus(0);
            }
        }else if(ke.getKeyCode() == KeyEvent.VK_S){
            if(peli.getClass()==kPeli.getClass()){
                palkki1.setNopeus(0); 
            }
        }
        component.repaint();
    }
}
