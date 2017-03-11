/*
 * HW07_121044014_Suleyman_Balaban
 * appointmentTest.java
 */
package slymn;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Suleyman Balaban
 */
public class appointmentTest {
    
    public appointmentTest() {
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
     * Test of getTime method, of class appointment.
     */
    @Test
    public void testGetTime() {
        System.out.println("getTime");
        appointment instance = new appointment();
        int expResult = 0;
        int result = instance.getTime();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDuration method, of class appointment.
     */
    @Test
    public void testGetDuration() {
        System.out.println("getDuration");
        appointment instance = new appointment();
        int expResult = 0;
        int result = instance.getDuration();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPriority method, of class appointment.
     */
    @Test
    public void testGetPriority() {
        System.out.println("getPriority");
        appointment instance = new appointment();
        int expResult = 0;
        int result = instance.getPriority();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDuration method, of class appointment.
     */
    @Test
    public void testSetDuration() {
        System.out.println("setDuration");
        int duration = 0;
        appointment instance = new appointment();
        instance.setDuration(duration);
    }

    /**
     * Test of setPriority method, of class appointment.
     */
    @Test
    public void testSetPriority() {
        System.out.println("setPriority");
        int priority = 0;
        appointment instance = new appointment();
        instance.setPriority(priority);
    }

    /**
     * Test of setTime method, of class appointment.
     */
    @Test
    public void testSetTime() {
        System.out.println("setTime");
        int time = 0;
        appointment instance = new appointment();
        instance.setTime(time);
    }
}
