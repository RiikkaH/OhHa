
package pong.logiikka;


/**
 *
 * @author Huusari Riikka
 * Perii Pelin. Luo pelin, jossa on erikositehosteita
 */
public class Erikoispeli extends Peli implements Runnable{
    
    public Erikoispeli(){

    }
    @Override
    public void run() {
        int i=0;
        while(i< 10){
            pallo.liiku();
            palkki1.liiku();
            palkki2.liiku();
            hamaysPallo1.liiku();
            hamaysPallo2.liiku();
            
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
            int j = 0;
            if(tilasto2>tilasto1){
                j=tilasto2;
            }else if(tilasto1>tilasto2){
                j=tilasto1;
            }
            i=j;
            try{
                Thread.sleep(5);
            }
            catch(InterruptedException ie){
                return;
            }
            
        }
    }
}
