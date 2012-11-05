/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pong.kappaleet;

/**
 *
 * @author Huusari Riikka
 */
public class Pallo {
    private int x;
    private int y;
    private int xMuutos;
    private int yMuutos;

    public Pallo(){
        this.x = 250;
        this.y=250;
        this.xMuutos=1;
        this.yMuutos=1;


        //x ja y koordinaatit
    }
    
    public void liiku(){
        
        x += xMuutos;
        y += yMuutos;
    }
    public void kaannaY(){
        yMuutos *= -1; 
    }
    public void kaannaX(){
        xMuutos *= -1;
    }
    
    //tarvitseeko y:lle ja x:lle settereitä?
    
    public void setX(int uusiX){
        this.x =uusiX;
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
    public int getYMuutos(){
        return yMuutos;
    }
    public int getXMuutos(){
        return xMuutos;
    }
    
}
