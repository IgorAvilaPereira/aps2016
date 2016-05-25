/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author iapereira
 */
public class BibliotecaMatematicaTest {
    
    public BibliotecaMatematicaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Inicializador da Classe de Teste....");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("Finalizar da Classe de Teste...");
    }
    
    @Before
    public void setUp() {
        System.out.println("Antes de qualquer caso de teste....");
    }
    
    @After
    public void tearDown() {
        System.out.println("Depois de qualquer caso de teste...");
    }

    /**
     * Test of multiplicacao method, of class BibliotecaMatematica.
     */
    @Test
    public void testMultiplicacao() {        
        System.out.println("multiplicacao");
        int a = 3;
        int b = 5;
        BibliotecaMatematica matematica =  new BibliotecaMatematica();
        int resultado = matematica.multiplicacao(a, b);
        assertEquals(15, resultado);
        assertEquals(15, resultado);
    }
    
    @Test
    public void testMultiplicacao2() {        
        System.out.println("multiplicacao2");
        int a = -1;
        int b = 0;
        BibliotecaMatematica matematica =  new BibliotecaMatematica();
        int resultado = matematica.multiplicacao(a, b);
        assertEquals(0, resultado);
    }

    /**
     * Test of divisao method, of class BibliotecaMatematica.
     */
    
    @Test
    public void testDivisao() {
        System.out.println("divisao");
        int a = 4;
        int b = 2;
        BibliotecaMatematica instance = new BibliotecaMatematica();
        int expResult = 2;
        int result = (int) instance.divisao(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of soma method, of class BibliotecaMatematica.
     */
    @Ignore
    @Test
    public void testSoma() {
        System.out.println("soma");
        int a = 0;
        int b = 0;
        BibliotecaMatematica instance = new BibliotecaMatematica();
        int expResult = 0;
        int result = instance.soma(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of subtracao method, of class BibliotecaMatematica.
     */
    @Ignore
    @Test
    public void testSubtracao() {
        System.out.println("subtracao");
        int a = 0;
        int b = 0;
        BibliotecaMatematica instance = new BibliotecaMatematica();
        int expResult = 0;
        int result = instance.subtracao(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
