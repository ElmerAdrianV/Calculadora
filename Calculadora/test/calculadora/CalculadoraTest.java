/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author elmer
 */
public class CalculadoraTest {
    
    public CalculadoraTest() {
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
     * Test of getCadena method, of class Calculadora.
     */
    @Test
    public void testGetCadena() {
        System.out.println("getCadena");
        Calculadora instance = new Calculadora();
        String expResult = "";
        String result = instance.getCadena();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCadena method, of class Calculadora.
     */
    @Test
    public void testSetCadena() {
        System.out.println("setCadena");
        String cadena = "";
        Calculadora instance = new Calculadora();
        instance.setCadena(cadena);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getResultado method, of class Calculadora.
     */
    @Test
    public void testGetResultado() {
        System.out.println("getResultado");
        Calculadora instance = new Calculadora();
        String expResult = "";
        String result = instance.getResultado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Calculadora.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Calculadora instance = new Calculadora();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verificarCadena method, of class Calculadora.
     */
    @Test
    public void testVerificarCadena() {
        System.out.println("verificarCadena");
        Calculadora instance = new Calculadora(null);
        boolean expResult = false;
        boolean result = instance.verificarCadena();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
