
package pong.logiikka;



/**
 *
 * @author Huusari Riikka
 * Perii Pelin,  luo kaksinpelin
 */
public class Kaksinpeli extends Peli implements Runnable{
    
    
    public Kaksinpeli(){ 
    }
    /**
     * Metodi huolehtii pelin etenemisestä
     */
    @Override
    public void run() {
        while(i< 10){
            pallo.liiku();
            palkki1.liiku();
            palkki2.liiku();
            
            palloOsuuYlapalkkiin(pallo);
            palloOsuuAlapalkkiin(pallo);
            palloOsuuPalkkiin(pallo, palkki1);
            palloOsuuPalkkiin(pallo, palkki2);
            palloOsuuPalkinYlareunaan(pallo, palkki1);
            palloOsuuPalkinYlareunaan(pallo, palkki2);
            palloOsuuPalkinAlareunaan(pallo, palkki1);
            palloOsuuPalkinAlareunaan(pallo, palkki2);
            palloMeneeOikeanReunanYli(pallo);
            palloMeneeVasemmanReunanYli(pallo);
            
            paivitettava.paivita();
            
            katsoJatkuukoPeli();
            
            try{
                Thread.sleep(5);
            }catch(InterruptedException ie){
                return;
            }
            
        }
    }
}
