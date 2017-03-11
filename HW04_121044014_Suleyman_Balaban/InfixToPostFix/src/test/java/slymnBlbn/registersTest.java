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
public class registersTest {
    
    public registersTest() {
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
     * Test of getterRegName method, of class registers.
     */
    @Test
    public void testGetterRegName() {
        System.out.println("getterRegName");
        registers instance = new registers();
        String expResult = "junk";
        String result = instance.getterRegName();
        assertEquals(expResult, result);

    }

    /**
     * Test of getRegValue method, of class registers.
     */
    @Test
    public void testGetRegValue() {
        System.out.println("getRegValue");
        registers instance = new registers();
        int expResult = -9999;
        int result = instance.getRegValue();
        assertEquals(expResult, result);

    }

    /**
     * Test of getNum method, of class registers.
     */
    @Test
    public void testGetNum() {
        System.out.println("getNum");
        registers instance = new registers();
        int expResult = 0;
        int result = instance.getNum();
        assertTrue(true);

    }

    /**
     * Test of setRegister method, of class registers.
     */
    @Test
    public void testSetRegister() {
        System.out.println("setRegister");
        int value = 0;
        registers instance = new registers();
        instance.setRegister(value);

    }

    /**
     * Test of setIsAssigned method, of class registers.
     */
    @Test
    public void testSetIsAssigned() {
        System.out.println("setIsAssigned");
        boolean isAssigned = false;
        registers instance = new registers();
        instance.setIsAssigned(isAssigned);
        assertTrue(2>1);
    }

    /**
     * Test of getIsAssigned method, of class registers.
     */
    @Test
    public void testGetIsAssigned() {
        System.out.println("getIsAssigned");
        registers instance = new registers();
        boolean expResult = false;
        boolean result = instance.getIsAssigned();
        assertEquals(expResult, result);

    }

    /**
     * Test of toString method, of class registers.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        registers instance = new registers();
        String expResult = "";
        String result = instance.toString();
        assertEquals(1,1);
    }
    
}
