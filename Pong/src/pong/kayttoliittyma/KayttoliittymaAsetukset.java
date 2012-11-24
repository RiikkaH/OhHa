/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pong.kayttoliittyma;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Huusari Riikka
 */
public class KayttoliittymaAsetukset implements Runnable{
    private JFrame frame;
    private JFrame frame2;
    public KayttoliittymaAsetukset(JFrame frame2){
        this.frame2=frame2;
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
    private void luoKomponentit(Container container) {
        container.add(luoValikko(), BorderLayout.CENTER);
    }
    private JPanel luoValikko() {
        JPanel panel = new JPanel(new GridLayout(5,2));
        panel.setBackground(Color.LIGHT_GRAY);
        
        TextField kentta = new TextField();
        
        JButton nappi = new JButton("Takaisin");
        nappi.setBackground(Color.LIGHT_GRAY);
        nappi.setForeground(Color.CYAN);
        nappi.addActionListener(new TakaisinNapinKuuntelija(frame,frame2));
        
        panel.add(luoLabel(" Säädä pelin nopeutta(1-20):"));
        panel.add(kentta);
        panel.add(luoLabel(" Säädä pallon väriä(0-255):"));
        panel.add(luoPanel());
        panel.add(luoLabel(" Säädä vasemman palkin väriä(0-255):"));
        panel.add(luoPanel());
        panel.add(luoLabel(" Säädä oikean palkin väriä(0-255):"));
        panel.add(luoPanel());
        panel.add(nappi);
        
        return panel;
    }
    public JLabel luoLabel(String teksti){
        JLabel label = new JLabel();
        label.setText(teksti); 
        label.setForeground(Color.CYAN);
        return label;
    }
    public JPanel luoPanel(){
        JPanel panel2 = new JPanel(new GridLayout(1,3));
        panel2.setBackground(Color.LIGHT_GRAY);
        TextField kentta1 = new TextField();
        TextField kentta2 = new TextField();
        TextField kentta3 = new TextField();
        panel2.add(kentta1);
        panel2.add(kentta2);
        panel2.add(kentta3);
        return panel2;
    }

    
}
