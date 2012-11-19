/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pong.kappaleet;

/**
 *
 * @author Huusari Riikka
 * Palkilla on koordinaatit ja nopeus
 */
public class Palkki {
    private int x;
    private int y;
    private int nopeus;
    public Palkki(int x){
        this.x=x;
        this.y=200;
        this.nopeus=0;
        //jos nopeus on positiivista, liikkuu palkki alas
        //x ja y ovat koordinaatit, x asetetaan pelissä, y tässä
    }
    
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
