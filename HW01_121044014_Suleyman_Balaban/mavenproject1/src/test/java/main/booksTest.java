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
public class booksTest {
    
    public booksTest() {
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
     * Test of getterBooks method, of class books.
     */
    @Test
    public void testGetterBooks() {
        System.out.println("getterBooks");
        books instance = new books();
        String expResult = "unknown books";
        String result = instance.getterBooks();
        assertEquals(expResult, result);
    }
    /**
     * Test of setterBooks method, of class books.
     */
    @Test
    public void testSetterBooks() {
        System.out.println("setterBooks");
        String booksName = "unknown books";
        books instance = new books();
        instance.setterBooks(booksName);
        assertEquals(booksName,instance.getterBooks());
    }
}
