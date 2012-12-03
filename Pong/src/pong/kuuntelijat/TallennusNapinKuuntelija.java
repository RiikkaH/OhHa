/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pong.kuuntelijat;

import java.awt.Color;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JLabel;
import pong.kayttoliittyma.Piirtoalusta;

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
     * säätää pallon värin 
     */
    public void saadaPallonVari(){
        if(luoVari(0,1,2)==null){
            return;
        }
        alusta.setPallonVari(luoVari(0,1,2));
    }
    /**
     * Säätää vasemman palkin värin 
     */
    public void saadaVasemmanPalkinVari(){
        if(luoVari(3,4,5)==null){
            return;
        }
        alusta.setVPalkinVari(luoVari(3,4,5));
    }
    /**
     * säätää oikean palkin värin 
     */
    public void saadaOikeanPalkinVari(){
        if(luoVari(6,7,8)==null){
            return;
        }
        alusta.setOPalkinVari(luoVari(6,7,8));
    }
    /**
     * Luo uuden värin sen perusteella, mitä numeroita kenttiin on syötetty
     * @param k1 kentän numero
     * @param k2 kentän numero
     * @param k3 kentän numero
     * @return väri
     */
    public Color luoVari(int k1, int k2, int k3){
        int a = lueKentta(k1);
        int b = lueKentta(k2);
        int c = lueKentta(k3);
        if(a<0 || b<0 || c<0){
            return null;
        }
        Color co = new Color(a,b,c);
        return co;
    }
    /**
     * Lukee kentän tekstin ja palauttaa numeron, joka kenttään on syötetty.
     * Jos kentässä ei ole numeroa, palautuu -1.
     * @param kentta
     * @return int
     */
    public int lueKentta(int kentta){
        try{
            int j = Integer.parseInt(kentat.get(kentta).getText());
            return j;
        }catch(NumberFormatException e){
            ohjeet.setText("Syötä kenttiin numero väliltä 0-255!");
            return -1;
        }
    }
    
}
