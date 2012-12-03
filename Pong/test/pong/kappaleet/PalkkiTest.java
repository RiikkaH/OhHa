package pong.kappaleet;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.*;
import static org.junit.Assert.*;
import pong.kappaleet.Palkki;

/**
 *
 * @author Huusari Riikka
 */
public class PalkkiTest {
    Palkki palkki;
    public PalkkiTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
        palkki = new Palkki(10);
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
    public void palkkiLiikkuuAlasOikein(){
        palkki.setNopeus(2);
        palkki.liiku();
        assertEquals(palkki.getY(),202);
    }
    @Test
    public void palkkiLiikkuuYlosOikein(){
        palkki.setNopeus(-2);
        palkki.liiku();
        assertEquals(palkki.getY(),198);
    }
    @Test
    public void palkkiaLiikutetaanYlosjaAlas(){
        palkki.setNopeus(1);
        palkki.liiku();
        palkki.liiku();
        palkki.setNopeus(-1);
        palkki.liiku();
        palkki.setNopeus(1);
        palkki.liiku();
        assertEquals(palkki.getY(),202);
    }
}
