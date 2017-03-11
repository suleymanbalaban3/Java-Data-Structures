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
public class fileTest {
    
    public fileTest() {
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
     * Test of getterFile method, of class file.
     */
    @Test
    public void testGetterFile() {
        System.out.println("getterFile");
        file instance = new file("file");
        String expResult = "file";
        String result = instance.getterFile();
        assertEquals(expResult, result);
    }
    /**
     * Test of setterFile method, of class file.
     */
    @Test
    public void testSetterFile() {
        System.out.println("setterFile");
        String fileName = "file";
        file instance = new file("file","hw1");
        instance.setterFile(fileName);
        assertEquals(fileName,instance.getterFile());
    }
    
}
