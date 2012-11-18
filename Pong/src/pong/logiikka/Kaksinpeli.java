
package pong.logiikka;




public class Kaksinpeli extends Peli implements Runnable{
    
    
    public Kaksinpeli(){ 
    }

    @Override
    public void run() {
        int i=0;
        while(i< 10){
            pallo.liiku();
            palkki1.liiku();
            palkki2.liiku();
            if(palloOsuuYlapalkkiin()){
                pallo.kaannaY();
            }if(palloOsuuAlapalkkiin()){
                pallo.kaannaY();
            }if(palloOsuuVasempaanPalkkiin()){
                pallo.kaannaX();
            }if(palloOsuuOikeaanPalkkiin()){
                pallo.kaannaX();
            }if(palloMeneeOikeanReunanYli()){
                lisaaTilasto1eenYksi();
                pallo.setX(250);
                pallo.setY(250);
                pallo.setXMuutos(-1);
                pallo.setYMuutos(1);
            }if(palloMeneeVasemmanReunanYli()){
                lisaaTilasto2eenYksi();
                pallo.setX(250);
                pallo.setY(250);
                pallo.setXMuutos(1);
                pallo.setYMuutos(1);
            }
            paivitettava.paivita();
            int j = 0;
            if(tilasto2>tilasto1){
                j=tilasto2;
            }else if(tilasto1>tilasto2){
                j=tilasto1;
            }
            i=j;
            try{
                Thread.sleep(8);
            }
            catch(InterruptedException ie){
                return;
            }
            
        }
    }
}
