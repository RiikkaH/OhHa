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

/**
 *
 * @author Huusari Riikka
 */
public class Piirtoalusta extends JPanel implements Paivitettava{
    private Pallo pallo;
    private Palkki palkki1;
    private Palkki palkki2;
    public Piirtoalusta(Pallo pallo, Palkki palkki1, Palkki palkki2){
        super.setBackground(Color.GRAY);
        this.pallo=pallo;
        this.palkki1=palkki1;
        this.palkki2=palkki2;
    }
    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        graphics.setColor(Color.MAGENTA);
        graphics.fillRect(palkki1.getX(), palkki1.getY(), 10, 40);
        graphics.fillRect(palkki2.getX(), palkki2.getY(), 10, 40);
        graphics.fillOval(pallo.getX(), pallo.getY(), 10, 10);
        graphics.setColor(Color.DARK_GRAY);
        graphics.fillRect(0, 0, 500, 10);
        graphics.fillRect(0, 490, 500, 10);
    }

    @Override
    public void paivita() {
        repaint();
    }
}
