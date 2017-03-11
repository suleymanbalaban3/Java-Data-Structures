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
public class DocumentTest {
    
    public DocumentTest() {
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
     * Test of getterDocumentType method, of class Document.
     */
    @Test
    public void testGetterDocumentType() {
        System.out.println("getterDocumentType");
        Document instance = new Document("file");
        String expResult = "file";
        String result = instance.getterDocumentType();
        assertEquals(expResult, result);
    }
    /**
     * Test of getterDocumentName method, of class Document.
     */
    @Test
    public void testGetterDocumentName() {
        System.out.println("getterDocumentName");
        Document instance = new Document("file","hw1");
        String expResult = "hw1";
        String result = instance.getterDocumentName();
        assertEquals(expResult, result);
    }
    /**
     * Test of getterDocumentOwner method, of class Document.
     */
    @Test
    public void testGetterDocumentOwner() {
        System.out.println("getterDocumentOwner");
        Document instance = new Document("file","hw1","suleyman");
        String expResult = "suleyman";
        String result = instance.getterDocumentOwner();
        assertEquals(expResult, result);     
    }
    /**
     * Test of documentSetter method, of class Document.
     */
    @Test
    public void testDocumentSetter() {
        System.out.println("documentSetter");
        String documentType = " ";
        String documentName = " ";
        String documentOwner = " ";
        Document instance = new Document(" "," "," ");
        instance.documentSetter(documentType, documentName, documentOwner);
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(instance.getterDocumentName()==" "&&
        instance.getterDocumentType()==" "&&instance.getterDocumentOwner()==" ");
    }

    /**
     * Test of toString method, of class Document.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Document instance = new Document("url","xyz","ali");
        String expResult = "Document type : url, Name : xyz, Owner : ali";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
}
