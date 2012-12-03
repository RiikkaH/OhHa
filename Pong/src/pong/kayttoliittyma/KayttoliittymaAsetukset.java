/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pong.kayttoliittyma;

import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

/**
 *
 * @author Huusari Riikka
 * Asetusikkunan käyttöliittymä
 */
public class KayttoliittymaAsetukset implements Runnable{
    /**
     * KayttoliittymaAsetukset:n frame
     */
    private JFrame frame;
    /**
     * Pelien käyttöliitymän frame
     */
    private JFrame frame2;
    /**
     * Tähän luodaan 'valikko'
     */
    private JPanel panel;
    /**
     * Tekstikenttä värien arvojen syöttämistä varten
     */
    private TextField kentta1;
    /**
     * Tekstikenttä värien arvojen syöttämistä varten
     */
    private TextField kentta2;
    /**
     * Tekstikenttä värien arvojen syöttämistä varten
     */
    private TextField kentta3;
    /**
     * Tekstikenttä värien arvojen syöttämistä varten
     */
    private TextField kentta4;
    /**
     * Tekstikenttä värien arvojen syöttämistä varten
     */
    private TextField kentta5;
    /**
     * Tekstikenttä värien arvojen syöttämistä varten
     */
    private TextField kentta6;
    /**
     * Tekstikenttä värien arvojen syöttämistä varten
     */
    private TextField kentta7;
    /**
     * Tekstikenttä värien arvojen syöttämistä varten
     */
    private TextField kentta8;
    /**
     * Tekstikenttä värien arvojen syöttämistä varten
     */
    private TextField kentta9;
    /**
     * Kohta, johon virheen sattuessa tulee tekstiä
     */
    private JLabel ohjeet;
    /**
     * Lista tekstikentistä
     */
    private ArrayList<TextField> kentat;
    /**
     * Pelin piirtoalusta
     */
    private Piirtoalusta alusta;
    public KayttoliittymaAsetukset(JFrame frame2, Piirtoalusta a){
        this.ohjeet = new JLabel();
        this.frame2=frame2;
        this.alusta = a;
        kentat = new ArrayList<TextField>();
        kentat.add(kentta1);kentat.add(kentta2);kentat.add(kentta3);
        kentat.add(kentta4);kentat.add(kentta5);kentat.add(kentta6);
        kentat.add(kentta7);kentat.add(kentta8);kentat.add(kentta9);
    }
    public void setPiirtoalusta(Piirtoalusta a){
        alusta = a;
    }
    /**
     * Luo käyttöliittymän
     */
    @Override
    public void run() {
        frame =new JFrame("PONG");
        frame.setPreferredSize(new Dimension(500, 525));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        luoKomponentit(frame.getContentPane());
        frame.pack();
        frame.setVisible(true);
    }
    /**
     * Luo käyttöliittymän komponentit
     * @param container 
     */
    private void luoKomponentit(Container container) {
        container.add(luoValikko(), BorderLayout.CENTER);
    }
    /**
     * Luo tekstikentät ja napit
     * @return 
     */
    private JPanel luoValikko() {
        panel = new JPanel(new GridLayout(5,2));
        panel.setBackground(Color.GRAY);
        panel.add(new JLabel());
        panel.add(ohjeet);
        panel.add(luoLabel(" Säädä pallon väriä(0-255):"));
        panel.add(luoPanel2());
        panel.add(luoLabel(" Säädä vasemman palkin väriä(0-255):"));
        panel.add(luoPanel3());
        panel.add(luoLabel(" Säädä oikean palkin väriä(0-255):"));
        panel.add(luoPanel4());
        panel.add(luoOkNappi());
        panel.add(luoPaluuNappi());
        
        return panel;
    }
    /**
     * Luo "tallenna muutokset" -napin
     * @return 
     */
    public JButton luoOkNappi(){
        JButton nappi = new JButton("Tallenna muutokset");
        nappi.setBackground(Color.GRAY);
        nappi.setForeground(Color.CYAN);
        nappi.addActionListener(new TallennusNapinKuuntelija(kentat, alusta, ohjeet));
        return nappi;
    }
    /**
     * Luo "Takaisin" -napin
     * @return 
     */
    public JButton luoPaluuNappi(){
        JButton nappi = new JButton("Takaisin");
        nappi.setBackground(Color.GRAY);
        nappi.setForeground(Color.CYAN);
        nappi.addActionListener(new TakaisinNapinKuuntelija(frame,frame2));
        return nappi;
    }
    /**
     * Luo kentän, jossa on tekstiä
     * @param teksti Teksi, jonka kentässä halutaan olevan
     * @return JLabel
     */
    public JLabel luoLabel(String teksti){
        JLabel label = new JLabel();
        label.setText(teksti); 
        label.setForeground(Color.CYAN);
        return label;
    }
    /**
     * Luo pallon värien lukemista varten tekstikentät
     * @return JPanel
     */
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
    /**
     * Luo palkin värien lukemista varten tekstikentät
     * @return JPanel
     */
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
    /**
     * Luo palkin värien lukemista varten tekstikentät
     * @return JPanel
     */
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
    
}
