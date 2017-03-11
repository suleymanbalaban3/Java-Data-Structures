/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

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
public class urlTest {
    
    public urlTest() {
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
     * Test of getterUrl method, of class url.
     */
    @Test
    public void testGetterUrl() {
        System.out.println("getterUrl");
        url instance = new url();
        String expResult = "unknown url";
        String result = instance.getterUrl();
        assertEquals(expResult, result);
    }
    /**
     * Test of setterUrl method, of class url.
     */
    @Test
    public void testSetterUrl() {
        System.out.println("setterUrl");
        String urlName = "unknown url";
        url instance = new url();
        instance.setterUrl(urlName);
        assertEquals(urlName,instance.getterUrl());
    }
}
