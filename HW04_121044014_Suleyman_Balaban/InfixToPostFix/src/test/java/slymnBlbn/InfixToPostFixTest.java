/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slymnBlbn;

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
public class InfixToPostFixTest {
    
    public InfixToPostFixTest() {
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
     * Test of convert method, of class InfixToPostFix.
     */
    @Test
    public void testConvert() throws Exception {
        System.out.println("convert");
        String infix = "5 + 6";
        InfixToPostFix instance = new InfixToPostFix();
        String expResult = "5 6 +";
        String result = instance.convert(infix);
        assertEquals(expResult, result);
   
    }

    /**
     * Test of main method, of class InfixToPostFix.
     */
    @Test
    public void testMain() throws Exception {
        System.out.println("main");
        String[] args = null;
        InfixToPostFix.main(args);
        assertEquals(2,2);
    }
    
}
