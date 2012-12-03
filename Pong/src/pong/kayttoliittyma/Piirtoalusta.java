/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pong.kayttoliittyma;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import pong.kappaleet.Palkki;
import pong.kappaleet.Pallo;
import pong.logiikka.Peli;


/**
 *
 * @author Huusari Riikka
 * Piirretään peli
 */
public class Piirtoalusta extends JPanel implements Paivitettava{
    /**
     * peli, jota piirretään
     */
    private Peli peli;
    /**
     * pelin pallo
     */
    private Pallo pallo;
    /**
     * pelin vasemmanpuolinen palkki
     */
    private Palkki palkki1;
    /**
     * pelin oikeanpuolinen palkki
     */
    private Palkki palkki2;
    /**
     * pallon väri
     */
    private Color pallonVari;
    /**
     * vasemmanpuoleisen palkin väri
     */
    private Color vPalkinVari;
    /**
     * oikeanpuoleisen palkin väri
     */
    private Color oPalkinVari;
    
    public Piirtoalusta(Peli peli){
        this.peli =peli;
        super.setBackground(Color.GRAY);
        if(peli != null){
            this.pallo=peli.getPallo();
            this.palkki1=peli.getPalkki1();
            this.palkki2=peli.getPalkki2();
        }
        this.pallonVari= Color.CYAN;
        this.vPalkinVari=Color.CYAN;
        this.oPalkinVari=Color.CYAN;
    }
    /**
     * Metodissa piirretään kaikki pelin komponentit
     * @param graphics 
     */
    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        graphics.setColor(Color.CYAN);
        graphics.drawString(""+ peli.getTilasto1(), 10, 25);
        graphics.drawString(""+ peli.getTilasto2(), 470, 25);
        graphics.setColor(vPalkinVari);
        graphics.fillRect(palkki1.getX(), palkki1.getY(), 10, 40);
        graphics.setColor(oPalkinVari);
        graphics.fillRect(palkki2.getX(), palkki2.getY(), 10, 40);
        graphics.setColor(pallonVari); 
        graphics.fillRect(pallo.getX(), pallo.getY(), 10, 10);
        graphics.setColor(Color.DARK_GRAY);
        graphics.fillRect(0, 0, 500, 10);
        graphics.fillRect(0, 457 , 500, 20);
        if(peli.getJatkuu()== false){
            graphics.setColor(Color.CYAN);
            if(peli.getTilasto1()>peli.getTilasto2()){
                graphics.drawString(" :)  Game Over!  :( ", 210, 200);
            }else{
                graphics.drawString(" :(  Game Over!  :) ", 210, 200);
            }
        }
    }

    @Override
    public void paivita() {
        repaint();
    }
    public void setPeli(Peli p){
        peli = p;
        this.pallo=peli.getPallo();
        this.palkki1=peli.getPalkki1();
        this.palkki2=peli.getPalkki2();
    }
    public void setPallonVari(Color c){
        pallonVari=c;
    }
    public void setOPalkinVari(Color c){
        oPalkinVari=c;
    }
    public void setVPalkinVari(Color c){
        vPalkinVari=c;
    }
}
