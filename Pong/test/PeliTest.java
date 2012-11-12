
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
        peli.getPallo().setY(17);
        peli.getPallo().liiku();
        peli.getPallo().liiku();
        assertEquals(true,peli.palloOsuuYlapalkkiin());
    }
    @Test
    public void palloOsuuAlapalkkiin(){
        peli.getPallo().setYMuutos(1);
        peli.getPallo().setY(448);
        peli.getPallo().liiku();
        peli.getPallo().liiku();
        assertEquals(true, peli.palloOsuuAlapalkkiin());
    }
    @Test
    public void palloOsuuVasempaanPalkkiin(){
        peli.getPallo().setX(26);
        peli.getPallo().setY(205);
        peli.getPallo().setXMuutos(-1);
        peli.getPallo().liiku();
        assertEquals(true, peli.palloOsuuVasempaanPalkkiin());
    }
    @Test
    public void palloOsuuOikeaanPalkkiin(){
        peli.getPallo().setX(464);
        peli.getPallo().setY(205);
        peli.getPallo().liiku();
        assertEquals(true, peli.palloOsuuOikeaanPalkkiin());
    }
}
