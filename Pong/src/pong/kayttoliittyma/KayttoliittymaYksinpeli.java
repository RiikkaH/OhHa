
package pong.kayttoliittyma;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 *
 * @author Huusari Riikka
 */
public class KayttoliittymaYksinpeli implements Runnable{
    private JFrame frame;
    public KayttoliittymaYksinpeli(){
        
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
        
    }
    public JFrame getFrame() {
        return frame;
    }
    
}
