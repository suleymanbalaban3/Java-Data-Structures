/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slymnBlbn54;

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
public class LinkListRecTest {
    
    public LinkListRecTest() {
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
     * Test of add method, of class LinkListRec.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Object data = null;
        LinkListRec instance = new LinkListRec();
        instance.add(data);

    }

    /**
     * Test of remove method, of class LinkListRec.
     */
    @Test
    public void testRemove_GenericType() {
        System.out.println("remove");
        Object outData = null;
        LinkListRec instance = new LinkListRec();
        boolean expResult = false;
        boolean result = instance.remove(outData);
        assertEquals(expResult, result);
    }

    /**
     * Test of remove method, of class LinkListRec.
     */
    @Test
    public void testRemove_3args() {
        System.out.println("remove");
        LinkListRec instance = new LinkListRec();
        boolean expResult = false;
        boolean result = instance.remove(null);
        assertEquals(expResult, result);

    }

    /**
     * Test of toString method, of class LinkListRec.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        LinkListRec instance = new LinkListRec();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);

    }
    
}
