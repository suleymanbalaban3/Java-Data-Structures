/*
 * Suleyman Balaban 121044014 HW3
 * SpectListTest.java
 */
package suleymanBalaban;

import java.util.Collection;
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
public class SpectListTest {
    
    public SpectListTest() {
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
     * Test of addAllAtHead method, of class SpectList.
     */
    @Test
    public void testAddAllAtHead() {
        System.out.println("addAllAtHead");
        Collection c = null;
        SpectList instance = new SpectList();
        boolean expResult = false;
        boolean result = instance.addAllAtHead(c);
        assertEquals(expResult, result);
    }

    /**
     * Test of getIntersectList method, of class SpectList.
     */
    @Test
    public void testGetIntersectList() {
        System.out.println("getIntersectList");
        Collection c = null;
        SpectList instance = new SpectList();
        List expResult = null;
        List result = instance.getIntersectList(c);
        assertEquals(expResult, result);
    }

    /**
     * Test of sortList method, of class SpectList.
     */
    @Test
    public void testSortList() {
        System.out.println("sortList");
        String decreasing_or_increasing = "";
        SpectList instance = new SpectList();
        List expResult = null;
        List result = instance.sortList(decreasing_or_increasing);
        assertEquals(expResult, result);
    }

    /**
     * Test of main method, of class SpectList.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        SpectList.main(args);

    }
    
}
