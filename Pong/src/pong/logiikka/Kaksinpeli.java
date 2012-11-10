
package pong.logiikka;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import pong.kayttoliittyma.Paivitettava;


public class Kaksinpeli extends Peli implements ActionListener{
    
    private Paivitettava paivitettava;
    
    public Kaksinpeli(){
        
    }
    
    
    public void setPaivitettava(Paivitettava paivitettava) {
        this.paivitettava = paivitettava;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        pallo.liiku();
        if(pallo.getY()-5==10 || pallo.getY()+5 == 455){
            pallo.kaannaY();
        }if(pallo.getX()+5==470){
            if(pallo.getY()>palkki2.getY() & pallo.getY()<palkki2.getY()+40){
                pallo.kaannaX();
            } else{
                jatkuu=false;
            }
        }if(pallo.getX()-5 ==20){
            if(pallo.getY()>palkki1.getY() & pallo.getY()<palkki1.getY()+40){
                pallo.kaannaX();
            }else{
                jatkuu=false;
            }
        }
        paivitettava.paivita();
    }
}
