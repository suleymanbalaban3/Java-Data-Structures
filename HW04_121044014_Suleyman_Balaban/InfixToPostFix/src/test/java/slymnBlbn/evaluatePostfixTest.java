/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slymnBlbn;

import java.io.PrintWriter;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author user
 */
public class evaluatePostfixTest {
    
    public evaluatePostfixTest() {
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
     * Test of printRegister method, of class evaluatePostfix.
     */
    @Test
    public void testPrintRegister() {
        System.out.println("printRegister");
        String printRegister = "";
        PrintWriter pw = null;
        evaluatePostfix instance = new evaluatePostfix();
        instance.printRegister(printRegister, pw);

    }

    /**
     * Test of isThere method, of class evaluatePostfix.
     */
    @Test
    public void testIsThere() {
        System.out.println("isThere");
        String name = "";
        evaluatePostfix instance = new evaluatePostfix();
        boolean expResult = false;
        boolean result = instance.isThere(name);
        assertEquals(expResult, result);

    }

    /**
     * Test of getRegister method, of class evaluatePostfix.
     */
    @Test
    public void testGetRegister() {
        System.out.println("getRegister");
        String name = "";
        evaluatePostfix instance = new evaluatePostfix();
        registers expResult = null;
        registers result = instance.getRegister(name);
        assertEquals(expResult, result);

    }
    
}
