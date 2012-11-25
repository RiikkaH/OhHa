/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pong.kappaleet;

/**
 *
 * @author Huusari Riikka
 * Luokassa on Pongin palkkien tiedot
 */
public class Palkki {
    /**
     * palkin x-koordinaatti
     */
    private int x;
    /**
     * palkin y-koordinaatti
     */
    private int y;
    /**
     * palkin nopeus (kun nopeus on positiivinen, suunta on alas)
     */
    private int nopeus;
    public Palkki(int x){
        this.x=x;
        this.y=200;
        this.nopeus=0;
    }
    /**
     * Metodi liikuttaa palkkia nopeuden verran ylös tai alas
     * kuitenkin huomioiden sen, ettei palkki mene alueen ulko-
     * puolelle
     */
    public void liiku(){
        if(y+nopeus>=457-40){
            y=457-40;
        }if(y+nopeus<=10){
            y=10;
        }else{
            y=y+nopeus;
        }
    }
    
    public void setX(int uusiX){
        this.x=uusiX;
    }
    public int getX(){
        return this.x;
    }
    public void setY(int uusiY){
        this.y=uusiY;
    }
    public int getY(){
        return this.y;
    }
    public void setNopeus(int uusiNopeus){
        this.nopeus=uusiNopeus;
    }
    public int getNopeus(){
        return nopeus;
    }

}
