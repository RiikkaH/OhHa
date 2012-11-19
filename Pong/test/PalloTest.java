
import org.junit.*;
import static org.junit.Assert.*;
import pong.kappaleet.Pallo;

/**
 *
 * @author Huusari Riikka
 */
public class PalloTest {
    Pallo pallo;
    public PalloTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
        pallo = new Pallo();
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
    public void palloLiikkuu(){
        pallo.liiku();
        pallo.liiku();
        assertEquals(pallo.getX(),252);
        assertEquals(pallo.getY(),252);
    }
    @Test
    public void palloKaantyyXnSuhteen(){
        pallo.setXMuutos(1);
        pallo.kaannaX();
        assertEquals(pallo.getXMuutos(),-1,0.001);
    }
    @Test
    public void palloKaantyyYnSuhteen(){
        pallo.setYMuutos(1);
        pallo.kaannaY();
        assertEquals(pallo.getYMuutos(),-1,0.001);
    }
    @Test
    public void palloKaantyyXnJaYnSuhteen(){
        pallo.setXMuutos(1);
        pallo.setYMuutos(1);
        pallo.kaannaX();
        pallo.kaannaY();
        pallo.kaannaX();
        assertEquals(pallo.getYMuutos(),-1,0.001);
        assertEquals(pallo.getXMuutos(),1,0.001);
    }
    @Test
    public void palloKaantyyjaLiikkuu(){
        pallo.setXMuutos(1);
        pallo.setYMuutos(1);
        pallo.liiku();
        pallo.kaannaX();
        pallo.liiku();
        pallo.liiku();
        pallo.kaannaY();
        pallo.liiku();
        assertEquals(pallo.getX(),248);
        assertEquals(pallo.getY(),252);
    }
}
