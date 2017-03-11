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
public class AssignmentTest {
    
    public AssignmentTest() {
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
     * Test of listWhoUpload method, of class Assignment.
     */
    @Test
    public void testListWhoUpload() {
        System.out.println("listWhoUpload");
        
        Assignment instance = new Assignment();
        instance.listWhoUpload();
    }
    /**
     * Test of getterDeadLine method, of class Assignment.
     */
    @Test
    public void testGetterDeadLine() {
        System.out.println("getterDeadLine");
        Assignment instance = new Assignment("hw1","file","12.02.2016","15.02.2016");
        String expResult = "12.02.2016";
        String result = instance.getterDeadLine();
        assertEquals(expResult, result);
    }

    /**
     * Test of getterLateDeadLine method, of class Assignment.
     */
    @Test
    public void testGetterLateDeadLine() {
        System.out.println("getterLateDeadLine");
        Assignment instance = new Assignment("hw1","file","12.02.2016","15.02.2016");
        String expResult = "15.02.2016";
        String result = instance.getterLateDeadLine();
        assertEquals(expResult, result);
    }
    /**
     * Test of getterAssignmentType method, of class Assignment.
     */
    @Test
    public void testGetterAssignmentType() {
        System.out.println("getterAssignmentType");
        Assignment instance = new Assignment("hw1","file");
        String expResult = "file";
        String result = instance.getterAssignmentType();
        assertEquals(expResult, result);
    }
    /**
     * Test of getterAssignmentName method, of class Assignment.
     */
    @Test
    public void testGetterAssignmentName() {
        System.out.println("getterAssignmentName");
        Assignment instance = new Assignment("hw1");
        String expResult = "hw1";
        String result = instance.getterAssignmentName();
        assertEquals(expResult, result);
    }
    /**
     * Test of setterDeadline method, of class Assignment.
     */
    @Test
    public void testSetterDeadline() {
        System.out.println("setterDeadline");
        String deadLine = "12";
        Assignment instance = new Assignment("hw1","file","12","15");
        instance.setterDeadline(deadLine);
        assertEquals("12", instance.getterDeadLine());
    }

    /**
     * Test of setterLateDeadline method, of class Assignment.
     */
    @Test
    public void testSetterLateDeadline() {
        System.out.println("setterLateDeadline");
        String lateDeadLine = "15";
        Assignment instance = new Assignment("hw1","file","12","15");
        instance.setterLateDeadline(lateDeadLine);
        assertEquals("15", instance.getterLateDeadLine());
    }
    /**
     * Test of setterAssignmentType method, of class Assignment.
     */
    @Test
    public void testSetterAssignmentType() {
        System.out.println("setterAssignmentType");
        String assignmentType = "file";
        Assignment instance = new Assignment("hw1","file");
        instance.setterAssignmentType(assignmentType);
        assertEquals("file", instance.getterAssignmentType());
    }
    /**
     * Test of setterAssignmentName method, of class Assignment.
     */
    @Test
    public void testSetterAssignmentName() {
        System.out.println("setterAssignmentName");
        String assignmentName = "hw1";
        Assignment instance = new Assignment("hw1");
        instance.setterAssignmentName(assignmentName);
        assertEquals("hw1", instance.getterAssignmentName());
    }

    /**
     * Test of createSystemSize method, of class Assignment.
     */
    @Test
    public void testCreateSystemSize() {
        System.out.println("createSystemSize");
        Assignment instance = new Assignment();
        instance.createSystemSize();
        instance.documentList.add(new Document());
        assertTrue(instance.documentList.size()!=0);
    }
    /**
     * Test of toString method, of class Assignment.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Assignment instance = new Assignment("hw1","file","12","15");
        String expResult = "*Assignment type : file Assignment name : hw1\n deadline : 12 lateDeadLine : 15";
        String result = instance.toString();
        assertEquals(expResult,result);
    }
    /**
     * Test of addDocumnet method, of class Assignment.
     */
    @Test
    public void testAddDocumnet() {
        System.out.println("addDocumnet");
        Document object = new Document();
        Assignment instance = new Assignment();
        instance.addDocumnet(object);
        assertTrue(instance.documentList.size()!=0);
    }
    
}
