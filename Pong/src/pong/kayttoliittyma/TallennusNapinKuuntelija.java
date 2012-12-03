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
        int s=0;
        int t=0;
        int r=0;
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
        int a= 0;
        int b=0;
        int c=0;
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
        Color co = new Color(a,b,c);
        alusta.setVPalkinVari(co);
    }
    /**
     * säätää oikean palkin värin sen perusteella
     * mitä kenttiin syötetään
     */
    public void saadaOikeanPalkinVari(){
        int d=0;
        int e=0;
        int f=0;
        try{
            d = Integer.parseInt(kentat.get(7).getText());
        }catch(Exception ex){
            ohjeet.setText("Syötä kenttiin numero väliltä 0-255!");
            return;
        }
        try{
            e = Integer.parseInt(kentat.get(8).getText());
        }catch(Exception ex){
            ohjeet.setText("Syötä kenttiin numero väliltä 0-255!");
            return;
        }
        try{
            f = Integer.parseInt(kentat.get(9).getText());
        }catch(Exception ex){
            ohjeet.setText("Syötä kenttiin numero väliltä 0-255!");
            return;
        }
        Color co = new Color(d,e,f);
        alusta.setOPalkinVari(co);
    }
    
}
