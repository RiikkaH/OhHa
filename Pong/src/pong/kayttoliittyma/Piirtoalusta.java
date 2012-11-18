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
 */
public class Piirtoalusta extends JPanel implements Paivitettava{
    private Peli peli;
    private Pallo pallo;
    private Palkki palkki1;
    private Palkki palkki2;
    public Piirtoalusta(Peli peli){
        this.peli =peli;
        super.setBackground(Color.GRAY);
        this.pallo=peli.getPallo();
        this.palkki1=peli.getPalkki1();
        this.palkki2=peli.getPalkki2();
    }
    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        graphics.setColor(Color.CYAN);
        graphics.drawString(""+ peli.getTilasto1(), 10, 25);
        graphics.drawString(""+ peli.getTilasto2(), 470, 25);
        graphics.fillRect(palkki1.getX(), palkki1.getY(), 10, 40);
        graphics.fillRect(palkki2.getX(), palkki2.getY(), 10, 40);
        graphics.fillRect(pallo.getX(), pallo.getY(), 10, 10);
        graphics.setColor(Color.DARK_GRAY);
        graphics.fillRect(0, 0, 500, 10);
        graphics.fillRect(0, 457 , 500, 10);
    }

    @Override
    public void paivita() {
        repaint();
    }
}
