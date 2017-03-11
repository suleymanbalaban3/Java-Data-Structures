/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slymn;

import java.util.Iterator;
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
public class PriorityQueueTest {
    
    public PriorityQueueTest() {
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
     * Test of setStartAndEnd method, of class PriorityQueue.
     */
    @Test
    public void testSetStartAndEnd() {
        System.out.println("setStartAndEnd");
        int start = 0;
        int end = 0;
        PriorityQueue instance = new PriorityQueue();
        instance.setStartAndEnd(start, end);
    }

    /**
     * Test of setCurrentIndex method, of class PriorityQueue.
     */
    @Test
    public void testSetCurrentIndex() {
        System.out.println("setCurrentIndex");
        int currentIndex = 0;
        PriorityQueue instance = new PriorityQueue();
        instance.setCurrentIndex(currentIndex);
    }

    /**
     * Test of getStart method, of class PriorityQueue.
     */
    @Test
    public void testGetStart() {
        System.out.println("getStart");
        PriorityQueue instance = new PriorityQueue();
        int expResult = 0;
        int result = instance.getStart();
        assertEquals(expResult, result);
    }

    /**
     * Test of getEnd method, of class PriorityQueue.
     */
    @Test
    public void testGetEnd() {
        System.out.println("getEnd");
        PriorityQueue instance = new PriorityQueue();
        int expResult = 0;
        int result = instance.getEnd();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCurrentIndex method, of class PriorityQueue.
     */
    @Test
    public void testGetCurrentIndex() {
        System.out.println("getCurrentIndex");
        PriorityQueue instance = new PriorityQueue();
        int expResult = 1;
        int result = instance.getCurrentIndex();
        assertEquals(expResult, result);
    }

    /**
     * Test of add method, of class PriorityQueue.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        appointment o = new appointment();
        PriorityQueue instance = new PriorityQueue();
        boolean expResult = true;
        boolean result = instance.add(o);
        assertEquals(expResult, result);
    }

    /**
     * Test of size method, of class PriorityQueue.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        PriorityQueue instance = new PriorityQueue();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
    }

    /**
     * Test of isEmpty method, of class PriorityQueue.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        PriorityQueue instance = new PriorityQueue();
        boolean expResult = true;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
    }

    /**
     * Test of poll method, of class PriorityQueue.
     */
    @Test
    public void testPoll() {
        System.out.println("poll");
        PriorityQueue instance = new PriorityQueue();
        Object expResult = null;
        Object result = instance.poll();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of iterator method, of class PriorityQueue.
     */
    @Test
    public void testIterator() {
        System.out.println("iterator");
        PriorityQueue instance = new PriorityQueue();
        Iterator expResult = null;
        Iterator result = instance.iterator();
    }
    /**
     * Test of main method, of class PriorityQueue.
     */
    @Test
    public void testMain() throws Exception {
        System.out.println("main");
        String[] args = null;
        PriorityQueue.main(args);
    }
    
}
