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
    private double xMuutos;
    private double yMuutos;

    public Pallo(){
        this.x = 250;
        this.y=250;
        this.xMuutos=1.25;
        this.yMuutos=1.25;


        //x ja y koordinaatit
    }
    
    public void liiku(){
        if(y+yMuutos <10){
            y=10;
            kaannaY();
        }else if(y+yMuutos > 447){
            y=447;
            kaannaY();
        }else{
            x += xMuutos;
            y += yMuutos;
        }
    }
    public void kaannaY(){
        yMuutos *= -1; 
    }
    public void kaannaX(){
        xMuutos *= -1;
    }
    
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
    public void setYMuutos(double uusiYMuutos){
        this.yMuutos=uusiYMuutos;
    }
    public void setXMuutos(double uusiXMuutos){
        this.xMuutos=uusiXMuutos;
    }
    public double getYMuutos(){
        return yMuutos;
    }
    public double getXMuutos(){
        return xMuutos;
    }
    
}
