
package pong.kayttoliittyma;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
import pong.logiikka.Kaksinpeli;
import pong.logiikka.Peli;


public class KayttoliittymaKaksinpeli implements Runnable{
    private JFrame frame;
    private Peli peli;
    private Piirtoalusta alusta;
    public KayttoliittymaKaksinpeli(){
        peli = new Kaksinpeli();
    }
    @Override
    public void run() {
        frame =new JFrame("PONG");
        frame.setPreferredSize(new Dimension(500, 500));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        luoKomponentit(frame.getContentPane());
        frame.pack();
        frame.setVisible(true);
    }
    private void luoKomponentit(Container container){
        alusta = new Piirtoalusta(peli);
        container.add( alusta);
        frame.addKeyListener(new NappaimistonKuuntelija(peli,alusta));
    }
    public Paivitettava getPaivitettava(){
        return alusta;
    }
    public JFrame getFrame() {
        return frame;
    }
}
