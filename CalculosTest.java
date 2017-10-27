/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 31622305
 */
public class CalculosTest {
    
    public CalculosTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of calc method, of class Calculos.
     */
    @Test
    public void testCalc() {
        
        Calculos c = new Calculos();
        int[] digitos = new int[8];
        digitos[0] = 3;
        digitos[1] = 1;
        digitos[2] = 6;
        digitos[3] = 2;
        digitos[4] = 2;
        digitos[5] = 3;
        digitos[6] = 0;
        digitos[7] = 5;
        
        assertEquals(22, c.calc(digitos, 1), 0.0);
        assertEquals(2.75, c.calc(digitos, 2), 0.0);
        assertEquals(6, c.calc(digitos, 3), 0.0);
        assertEquals(1, c.calc(digitos, 4), 0.0);
        assertEquals(3, c.calc(digitos, 5), 0.0);
        assertEquals(3, c.calc(digitos, 6), 0.0);
        assertEquals(4, c.calc(digitos, 7), 0.0);
        assertEquals(1, c.calc(digitos, 8), 0.0);
        assertEquals(1080, c.calc(digitos, 9), 0.0);
        assertEquals(6480, c.calc(digitos, 10), 0.0);
        
    }
    
}
