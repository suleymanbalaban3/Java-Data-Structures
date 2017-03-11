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
public class myListTest {
    
    public myListTest() {
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
     * Test of getSize method, of class myList.
     */
    @Test
    public void testGetSize() {
        System.out.println("getSize");
        myList instance = new myList();
        int expResult = 0;
        int result = instance.getSize();
        assertEquals(expResult, result);
    }

    /**
     * Test of add method, of class myList.
     */
    @Test
    public void testAdd_GenericType() {
        System.out.println("add");
        Object anEntry = null;
        myList instance = new myList();
        boolean expResult = true;
        boolean result = instance.add(anEntry);
        assertEquals(expResult, result);

    }
    /**
     * Test of set method, of class myList.
     */
    @Test
    public void testSet() {
        System.out.println("set");
        int index = 0;
        Object newValue = null;
        myList instance = new myList();
        Object expResult = null;
        assertTrue(true);
    }
    /**
     * Test of remove method, of class myList.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        int index = 0;
        myList instance = new myList();
        Object expResult = null;
        Object result =null;
        assertEquals(expResult, result);
    }
    /**
     * Test of toString method, of class myList.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        myList instance = new myList();
        String expResult = "";
        String result = instance.toString();
        assertTrue(true);
    }
    
}
