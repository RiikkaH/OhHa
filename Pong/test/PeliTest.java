
import org.junit.*;
import static org.junit.Assert.*;
import pong.logiikka.Peli;

/**
 *
 * @author Huusari Riikka
 */
public class PeliTest {
    Peli peli;
    public PeliTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
        peli = new Peli();
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void palloOsuuYlapalkkiin(){
        peli.getPallo().setYMuutos(-1);
        peli.getPallo().setY(12);
        peli.getPallo().liiku();
        peli.getPallo().liiku();
        peli.palloOsuuYlapalkkiin(peli.getPallo());
        assertEquals(1,peli.getPallo().getYMuutos(),0.001);
    }
    @Test
    public void palloOsuuAlapalkkiin(){
        peli.getPallo().setYMuutos(1);
        peli.getPallo().setY(448);
        peli.getPallo().liiku();
        peli.getPallo().liiku();
        peli.palloOsuuAlapalkkiin(peli.getPallo());
        assertEquals(-1,peli.getPallo().getYMuutos(), 0.001);
    }
    @Test
    public void palloOsuuVasempaanPalkkiin(){
        peli.getPallo().setX(21);
        peli.getPallo().setY(205);
        peli.getPallo().setXMuutos(-1);
        peli.getPallo().liiku();
        peli.palloOsuuPalkkiin(peli.getPallo(), peli.getPalkki1());
        assertEquals(1,peli.getPallo().getXMuutos(), 0.001);
    }
    @Test
    public void palloOsuuOikeaanPalkkiin(){
        peli.getPallo().setX(459);
        peli.getPallo().setY(205);
        peli.getPallo().setXMuutos(1);
        peli.getPallo().liiku();
        peli.palloOsuuPalkkiin(peli.getPallo(), peli.getPalkki2());
        assertEquals(-1,peli.getPallo().getXMuutos(), 0.001);
    }
    @Test 
    public void palloMeneeVasemmanReunanYli(){
        peli.getPallo().setX(-5);
        peli.palloMeneeVasemmanReunanYli(peli.getPallo());
        assertEquals(1,peli.getTilasto2());
    }
    @Test 
    public void palloMeneeOikeanReunanYli(){
        peli.getPallo().setX(505);
        peli.palloMeneeOikeanReunanYli(peli.getPallo());
        assertEquals(1,peli.getTilasto1());
    }
    @Test
    public void palloOnReilustiOhiVasemmanReunan(){
        peli.getPallo().setX(-10);
        peli.palloMeneeVasemmanReunanYli(peli.getPallo());
        assertEquals(1,peli.getTilasto2());
    }
    @Test
    public void palloOnReilustiOhiOikeanReunan(){
        peli.getPallo().setX(550);
        peli.palloMeneeOikeanReunanYli(peli.getPallo());
        assertEquals(1,peli.getTilasto1());
    }
}
