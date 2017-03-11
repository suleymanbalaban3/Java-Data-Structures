/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slymnBlbn54;

import java.util.List;
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
public class mainClassTest {
    
    public mainClassTest() {
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
     * Test of intersectionOfLists method, of class mainClass.
     */
    @Test
    public void testIntersectionOfLists() {
        System.out.println("intersectionOfLists");
        mainClass instance = new mainClass();
        List expResult = null;
        List result = instance.intersectionOfLists(); 
    }

    /**
     * Test of unionOfLists method, of class mainClass.
     */
    @Test
    public void testUnionOfLists() {
        System.out.println("unionOfLists");
        mainClass instance = new mainClass();
        List expResult = null;
        List result = instance.unionOfLists();
;
    }

    /**
     * Test of isSubset method, of class mainClass.
     */
    @Test
    public void testIsSubset() {
        System.out.println("isSubset");
        mainClass instance = new mainClass();
        boolean expResult = false;
        boolean result = instance.isSubset();

    }

    /**
     * Test of main method, of class mainClass.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        mainClass.main(args);

    }
    
}
