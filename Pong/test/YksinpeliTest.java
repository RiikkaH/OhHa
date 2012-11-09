

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
    public void kunPalloOsuuYlapalkkiinNiinSuuntaMuuttuu(){
        peli.getPallo().setY(16);
        peli.getPallo().setYMuutos(-1);
        peli.actionPerformed(null);
        //mites tätä nyt sitten testataan jos on tuo actionPerformed juttu???
    }
}
