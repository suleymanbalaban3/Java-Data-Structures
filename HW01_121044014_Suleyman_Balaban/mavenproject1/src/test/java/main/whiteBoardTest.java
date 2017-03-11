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
public class whiteBoardTest {
    
    public whiteBoardTest() {
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
     * Test of getterWhiteBoard method, of class whiteBoard.
     */
    @Test
    public void testGetterWhiteBoard() {
        System.out.println("getterWhiteBoard");
        whiteBoard instance = new whiteBoard();
        String expResult = "unknown wBoard";
        String result = instance.getterWhiteBoard();
        assertEquals(expResult, result);
    }
    /**
     * Test of setterWhiteBoard method, of class whiteBoard.
     */
    @Test
    public void testSetterWhiteBoard() {
        System.out.println("setterWhiteBoard");
        String whiteBoardName = "unknown wBoard";
        whiteBoard instance = new whiteBoard();
        instance.setterWhiteBoard(whiteBoardName);
        assertEquals(whiteBoardName,instance.getterWhiteBoard());
    }
}
