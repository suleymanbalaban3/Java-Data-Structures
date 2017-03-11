/**
 * Suleyman Balaban 121044014
 */
package huffmantrees;

import java.io.BufferedReader;
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
public class BinaryTreeTest {
    
    public BinaryTreeTest() {
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
     * Test of getLeftSubtree method, of class BinaryTree.
     */
    @Test
    public void testGetLeftSubtree() {
        System.out.println("getLeftSubtree");
        BinaryTree instance = new BinaryTree();
        BinaryTree expResult = null;
        BinaryTree result = instance.getLeftSubtree();
        assertEquals(expResult, result);
    }

    /**
     * Test of getRightSubtree method, of class BinaryTree.
     */
    @Test
    public void testGetRightSubtree() {
        System.out.println("getRightSubtree");
        BinaryTree instance = new BinaryTree();
        BinaryTree expResult = null;
        BinaryTree result = instance.getRightSubtree();
        assertEquals(expResult, result);
    }

    /**
     * Test of getData method, of class BinaryTree.
     */
    @Test
    public void testGetData() {
        System.out.println("getData");
        BinaryTree instance = new BinaryTree();
        Object expResult = null;
        Object result = instance.getData();
        assertEquals(expResult, result);
    }

    /**
     * Test of isLeaf method, of class BinaryTree.
     */
    @Test
    public void testIsLeaf() {
        System.out.println("isLeaf");
        BinaryTree instance = new BinaryTree();
        boolean expResult = true;
        boolean result = instance.isLeaf();
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class BinaryTree.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        BinaryTree instance = new BinaryTree();
        String expResult = null;
        String result = instance.toString();
    }

    /**
     * Test of readBinaryTree method, of class BinaryTree.
     */
    @Test
    public void testReadBinaryTree() throws Exception {
        System.out.println("readBinaryTree");
        BufferedReader bR = null;
        BinaryTree<String> expResult = null;
        BinaryTree<String> result = BinaryTree.readBinaryTree(bR);
        assertEquals(expResult, result);
    }
    
}
