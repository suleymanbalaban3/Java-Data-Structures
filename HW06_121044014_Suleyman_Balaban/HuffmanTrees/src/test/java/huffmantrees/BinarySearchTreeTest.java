/**
 * Suleyman Balaban 121044014
 */
package huffmantrees;

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
public class BinarySearchTreeTest {
    
    public BinarySearchTreeTest() {
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
     * Test of find method, of class BinarySearchTree.
     */
    @Test
    public void testFind() {
        System.out.println("find");
        BinarySearchTree instance = new BinarySearchTree();
        Object expResult = null;
        Object result = instance.find('a');
        assertEquals(expResult, result);

    }

    /**
     * Test of iterator method, of class BinarySearchTree.
     */
    @Test
    public void testIterator() {
        System.out.println("iterator");
        BinarySearchTree instance = new BinarySearchTree();
        Iterator<Integer> expResult = null;
        Iterator<Integer> result = instance.iterator();
        assertEquals(expResult, result);
    }

    /**
     * Test of add method, of class BinarySearchTree.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Object item = 7;
        BinarySearchTree instance = new BinarySearchTree();
        boolean expResult = true;
        boolean result = instance.add(7);
        assertEquals(expResult, result);
    }

    /**
     * Test of delete method, of class BinarySearchTree.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        Object target = null;
        BinarySearchTree instance = new BinarySearchTree();
        instance.add(7);
        Object expResult = 7;
        Object result = instance.delete(7);
        assertEquals(expResult, result);
    }

    /**
     * Test of main method, of class BinarySearchTree.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        BinarySearchTree.main(args);
    }
    
}
