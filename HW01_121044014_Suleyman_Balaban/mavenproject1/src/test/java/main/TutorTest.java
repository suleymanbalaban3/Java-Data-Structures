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
public class TutorTest {
    
    public TutorTest() {
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
     * Test of getterTutorName method, of class Tutor.
     */
    @Test
    public void testGetterTutorName() {
        System.out.println("getterTutorName");
        Tutor instance = new Tutor("ali");
        String expResult = "ali";
        String result = instance.getterTutorName();
        assertEquals(expResult, result);
    }
    /**
     * Test of getterTutorGender method, of class Tutor.
     */
    @Test
    public void testGetterTutorGender() {
        System.out.println("getterTutorGender");
        Tutor instance = new Tutor("ali","He");
        String expResult = "He";
        String result = instance.getterTutorGender();
        assertEquals(expResult, result);
    }
    /**
     * Test of setterTutorName method, of class Tutor.
     */
    @Test
    public void testSetterTutorName() {
        System.out.println("setterTutorName");
        String tutorName = "ali";
        Tutor instance = new Tutor("ali");
        instance.setterTutorName(tutorName);
        assertEquals(tutorName,instance.getterTutorName());
    }
    /**
     * Test of setterTutorGender method, of class Tutor.
     */
    @Test
    public void testSetterTutorGender() {
        System.out.println("setterTutorGender");
        String tutorGender = "He";
        Tutor instance = new Tutor("kamil","He");
        instance.setterTutorGender(tutorGender);
        assertEquals(tutorGender,instance.getterTutorGender());
    }
    /**
     * Test of toString method, of class Tutor.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Tutor instance = new Tutor("ali","he");
        String expResult = "Tutor name : ali, Gender : he";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    /**
     * Test of equals method, of class Tutor.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Tutor object = new Tutor();
        Tutor instance = new Tutor();
        boolean expResult = true;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);      
    } 
}
