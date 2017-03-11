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
public class slidesTest {
    
    public slidesTest() {
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
     * Test of getterSlides method, of class slides.
     */
    @Test
    public void testGetterSlides() {
        System.out.println("getterSlides");
        slides instance = new slides();
        String expResult = "unknown slides";
        String result = instance.getterSlides();
        assertEquals(expResult, result);
    }
    /**
     * Test of setterSildes method, of class slides.
     */
    @Test
    public void testSetterSildes() {
        System.out.println("setterSildes");
        String slidesName = "unknown slides";
        slides instance = new slides();
        instance.setterSildes(slidesName);
        assertEquals(slidesName,instance.getterSlides());
    }
    
}
