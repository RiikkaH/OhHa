package pong.logiikka;



import org.junit.*;
import static org.junit.Assert.*;
import pong.logiikka.Yksinpeli;

/**
 *
 * @author Huusari Riikka
 */
public class YksinpeliTest {
    Yksinpeli peli;
    public YksinpeliTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
        peli = new Yksinpeli();
    }
    
    @After
    public void tearDown() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test 
    public void tietokoneLiikuttaaPalkkiaYlosKunPalloOnYlempana(){
        peli.getPallo().setXMuutos(-1);
        peli.getPallo().setY(40);
        peli.muutaTietokoneenPalkinNopeutta();
        peli.getPalkki1().liiku();
        assertEquals(198,peli.getPalkki1().getY());
    }
    @Test
    public void tietokoneLiikuttaaPalkkiaYlosKunPalloOnJuuriYlempana(){
        peli.getPallo().setXMuutos(-1);
        peli.getPallo().setY(199);
        peli.muutaTietokoneenPalkinNopeutta();
        peli.getPalkki1().liiku();
        assertEquals(198,peli.getPalkki1().getY());
    }
    @Test
    public void tietokoneLiikuttaaPalkkiaAlasKunPalloOnAlempana(){
        peli.getPallo().setXMuutos(-1);
        peli.getPallo().setY(300);
        peli.muutaTietokoneenPalkinNopeutta();
        peli.getPalkki1().liiku();
        assertEquals(peli.getPalkki1().getY(),202);
    }
    @Test
    public void tietokoneLiikuttaaPalkkiaAlasKunPalloOnJuuriAlempana(){
        peli.getPallo().setXMuutos(-1);
        peli.getPallo().setY(241);
        peli.muutaTietokoneenPalkinNopeutta();
        peli.getPalkki1().liiku();
        assertEquals(202,peli.getPalkki1().getY());
    }
    @Test
    public void tietokoneEiLiikutaPalkkiaKunPalloOnSamallaKorkeudella(){
        peli.getPallo().setY(205);
        peli.muutaTietokoneenPalkinNopeutta();
        peli.getPalkki1().liiku();
        assertEquals(200, peli.getPalkki1().getY());
    }
}
