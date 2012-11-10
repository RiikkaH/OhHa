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
public class NappaimistonKuuntelijaYksinpeliin implements KeyListener{
    private Palkki palkki;
    private Component component;
    public NappaimistonKuuntelijaYksinpeliin(Palkki palkki, Component component){
        this.palkki=palkki;
        this.component=component;
    }
    
    @Override
    public void keyPressed(KeyEvent e){
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            palkki.liikuYlos();
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            palkki.liikuAlas();
        }
        component.repaint();
    }

    @Override
    public void keyTyped(KeyEvent ke) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
