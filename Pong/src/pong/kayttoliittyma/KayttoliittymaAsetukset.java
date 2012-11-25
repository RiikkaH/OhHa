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
 * Asetusikkunan käyttöliittymä
 */
public class KayttoliittymaAsetukset implements Runnable{
    private JFrame frame;
    private JFrame frame2;
    private JPanel panel;
    private TextField kentta1;
    private TextField kentta2;
    private TextField kentta3;
    private TextField kentta4;
    private TextField kentta5;
    private TextField kentta6;
    private TextField kentta7;
    private TextField kentta8;
    private TextField kentta9;
    private Piirtoalusta alusta;
    public KayttoliittymaAsetukset(JFrame frame2, Piirtoalusta a){
        this.frame2=frame2;
        this.alusta = a;
    }
    public void setPiirtoalusta(Piirtoalusta a){
        alusta = a;
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
        panel = new JPanel(new GridLayout(4,2));
        panel.setBackground(Color.GRAY);
        
        JButton nappi = new JButton("Takaisin");
        nappi.setBackground(Color.GRAY);
        nappi.setForeground(Color.CYAN);
        nappi.addActionListener(new TakaisinNapinKuuntelija(frame,frame2));

        panel.add(luoLabel(" Säädä pallon väriä(0-255):"));
        panel.add(luoPanel2());
        panel.add(luoLabel(" Säädä vasemman palkin väriä(0-255):"));
        panel.add(luoPanel3());
        panel.add(luoLabel(" Säädä oikean palkin väriä(0-255):"));
        panel.add(luoPanel4());
        panel.add(nappi);
        
        return panel;
    }
    public JLabel luoLabel(String teksti){
        JLabel label = new JLabel();
        label.setText(teksti); 
        label.setForeground(Color.CYAN);
        return label;
    }
    public JPanel luoPanel2(){
        JPanel panel2 = new JPanel(new GridLayout(1,3));
        panel2.setBackground(Color.GRAY);
        kentta1 = new TextField();
        kentta2 = new TextField();
        kentta3 = new TextField();
        panel2.add(kentta1);
        panel2.add(kentta2);
        panel2.add(kentta3);
        return panel2;
    }
    public JPanel luoPanel3(){
        JPanel panel3 = new JPanel(new GridLayout(1,3));
        panel3.setBackground(Color.GRAY);
        kentta4 = new TextField();
        kentta5 = new TextField();
        kentta6 = new TextField();
        panel3.add(kentta4);
        panel3.add(kentta5);
        panel3.add(kentta6);
        return panel3;
    }
    public JPanel luoPanel4(){
        JPanel panel4 = new JPanel(new GridLayout(1,3));
        panel4.setBackground(Color.GRAY);
        kentta7 = new TextField();
        kentta8 = new TextField();
        kentta9 = new TextField();
        panel4.add(kentta7);
        panel4.add(kentta8);
        panel4.add(kentta9);
        return panel4;
    }
    public void saadaPallonVari(){
        int s = Integer.parseInt(kentta1.getText());
        int t = Integer.parseInt(kentta2.getText());
        int r = Integer.parseInt(kentta3.getText());
        Color c = new Color(s,t,r);
        alusta.setPallonVari(c);
    }
    public void saadaVasemmanPalkinVari(){
        int s = Integer.parseInt(kentta4.getText());
        int t = Integer.parseInt(kentta5.getText());
        int r = Integer.parseInt(kentta6.getText());
        Color c = new Color(s,t,r);
        alusta.setVPalkinVari(c);
    }
    public void saadaOikeanPalkinVari(){
        int s = Integer.parseInt(kentta7.getText());
        int t = Integer.parseInt(kentta8.getText());
        int r = Integer.parseInt(kentta9.getText());
        Color c = new Color(s,t,r);
        alusta.setOPalkinVari(c);
    }
}
