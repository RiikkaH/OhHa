/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pong.kayttoliittyma;

import java.awt.Color;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JLabel;

/**
 *
 * @author Huusari Riikka
 * Reagoi "tallenna muutokset" -napin painallukseen
 */
public class TallennusNapinKuuntelija implements ActionListener{
    /**
     * Lista TextFieldeistä
     */
    private ArrayList<TextField> kentat;
    /**
     * Pelien piirtoalusta
     */
    private Piirtoalusta alusta;
    /**
     * Kenttä, johon virheen tullessa tulee tekstiä
     */
    private JLabel ohjeet;
    /**
     * numero, jonka avulla määritetään väri pallolle
     */
    private int s;
    /**
     * numero, jonka avulla määritetään väri pallolle
     */
    private int r;
    /**
     * numero, jonka avulla määritetään väri pallolle
     */
    private int t;
    /**
     * numero, jonka avulla määritetään väri vasemmalle palkille
     */
    private int a;
    /**
     * numero, jonka avulla määritetään väri vasemmalle palkille
     */
    private int b;
    /**
     * numero, jonka avulla määritetään väri vasemmalle palkille
     */
    private int c;
    /**
     * numero, jonka avulla määritetään väri oikealle palkille
     */
    private int d;
    /**
     * numero, jonka avulla määritetään väri oikealle palkille
     */
    private int e;
    /**
     * numero, jonka avulla määritetään väri oikealle palkille
     */
    private int f;
    public TallennusNapinKuuntelija(ArrayList<TextField> kentat, Piirtoalusta alusta, JLabel ohjeet){
        this.kentat=kentat;
        this.alusta=alusta;
        this.ohjeet=ohjeet;
    }
    /**
     * säätää pallon ja palkkien värit kun nappia painetaan
     * @param e ActonEvent
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        saadaPallonVari();
        saadaVasemmanPalkinVari();
        saadaOikeanPalkinVari();
    }
    /**
     * säätää pallon värin sen perusteella, mitä numeroita
     * kenttiin syötetään
     */
    public void saadaPallonVari(){
        try{
            s = Integer.parseInt(kentat.get(1).getText());
        }catch(Exception e){
            ohjeet.setText("Syötä kenttiin numero väliltä 0-255!");
            return;
        }
        try{
            t = Integer.parseInt(kentat.get(2).getText());
        }catch(Exception e){
            ohjeet.setText("Syötä kenttiin numero väliltä 0-255!");
            return;
        }
        try{
            r = Integer.parseInt(kentat.get(3).getText());
        }catch(Exception e){
            ohjeet.setText("Syötä kenttiin numero väliltä 0-255!");
            return;
        }
        Color co = new Color(s,t,r);
        alusta.setPallonVari(co);
    }
    /**
     * Säätää vasemman palkin värin sen perusteella mitä
     * kenttiin syötetään
     */
    public void saadaVasemmanPalkinVari(){
        try{
            a = Integer.parseInt(kentat.get(4).getText());
        }catch(Exception e){
            ohjeet.setText("Syötä kenttiin numero väliltä 0-255!");
            return;
        }
        try{
            b = Integer.parseInt(kentat.get(5).getText());
        }catch(Exception e){
            ohjeet.setText("Syötä kenttiin numero väliltä 0-255!");
            return;
        }
        try{
            c = Integer.parseInt(kentat.get(6).getText());
        }catch(Exception e){
            ohjeet.setText("Syötä kenttiin numero väliltä 0-255!");
            return;
        }
        Color co = new Color(s,t,r);
        alusta.setVPalkinVari(co);
    }
    /**
     * säätää oikean palkin värin sen perusteella
     * mitä kenttiin syötetään
     */
    public void saadaOikeanPalkinVari(){
        try{
            d = Integer.parseInt(kentat.get(7).getText());
        }catch(Exception e){
            ohjeet.setText("Syötä kenttiin numero väliltä 0-255!");
            return;
        }
        try{
            e = Integer.parseInt(kentat.get(8).getText());
        }catch(Exception e){
            ohjeet.setText("Syötä kenttiin numero väliltä 0-255!");
            return;
        }
        try{
            f = Integer.parseInt(kentat.get(9).getText());
        }catch(Exception e){
            ohjeet.setText("Syötä kenttiin numero väliltä 0-255!");
            return;
        }
        Color co = new Color(s,t,r);
        alusta.setOPalkinVari(co);
    }
    
}
