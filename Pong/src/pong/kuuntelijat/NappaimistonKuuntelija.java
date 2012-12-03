/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pong.kuuntelijat;

import java.awt.Component;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import pong.kappaleet.Palkki;
import pong.kappaleet.Pallo;
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
    private Component component;
    public NappaimistonKuuntelija(Peli peli, Component component){
        this.palkki1=peli.getPalkki1();
        this.palkki2=peli.getPalkki2();
        this.peli=peli;
        this.kPeli=new Kaksinpeli();
        this.component=component;
    }
    /**
     * Metodi säätää palkkien nopeuksia kun nappeja painetaan
     * @param e 
     */
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
        
        component.repaint();
    }

    @Override
    public void keyTyped(KeyEvent ke) {
        
    }
    /**
     * Metodi säätää palkkien nopeuksia kun nappien painallus lopetetaan
     * @param ke 
     */
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
