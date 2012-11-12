

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
        peli.getPallo().setY(40);
        peli.liikutaTietokoneenPalkkia();
        assertEquals(peli.getPalkki2().getY(),199);
    }
    @Test
    public void tietokoneLiikuttaaPalkkiaAlasKunPalloOnAlempana(){
        peli.getPallo().setY(300);
        peli.liikutaTietokoneenPalkkia();
        assertEquals(peli.getPalkki2().getY(),201);
    }
    @Test
    public void tietokoneEiLiikutaPalkkiaKunPalloOnSamallaKorkeudella(){
        peli.getPallo().setY(205);
        peli.liikutaTietokoneenPalkkia();
        assertEquals(200, peli.getPalkki2().getY());
    }
}
