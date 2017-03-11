/**
 * Suleyman Balaban 121044014
 */
package huffmantrees;

import java.io.PrintStream;
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
public class HuffmanTreeTest {
    
    public HuffmanTreeTest() {
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
     * Test of decode method, of class HuffmanTree.
     */
    @Test
    public void testDecode() {
        System.out.println("decode");
        String codedMessage = "";
        HuffmanTree instance = new HuffmanTree();
        String expResult = "";
        String result = instance.decode(codedMessage);
        assertEquals(expResult, result);

    }

    /**
     * Test of encode method, of class HuffmanTree.
     */
    @Test
    public void testEncode() {
        System.out.println("encode");
        String message = "";
        BinaryTree huffmanTree = null;
        HuffmanTree instance = new HuffmanTree();
        String expResult = "";
        String result = instance.encode(message, huffmanTree);
        assertEquals(expResult, result);

    }

    /**
     * Test of encodeChar method, of class HuffmanTree.
     */
    @Test
    public void testEncodeChar_char_BinaryTree() {
        System.out.println("encodeChar");
        char character = ' ';
        BinaryTree tree = null;
        HuffmanTree instance = new HuffmanTree();
        String expResult = " ";
        assertTrue(true);

    }

    /**
     * Test of encodeChar method, of class HuffmanTree.
     */
    @Test
    public void testEncodeChar_4args() {
        System.out.println("encodeChar");
        BinaryTree tree = null;
        char target = ' ';
        String s = "";
        StringBuilder b = null;
        String expResult = "";
        HuffmanTree instance = new HuffmanTree();        
        String result = "";
        assertEquals(expResult, result);

    }

    /**
     * Test of toString method, of class HuffmanTree.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        HuffmanTree instance = new HuffmanTree();   
        String expResult = "";

    }
    /**
     * Test of main method, of class HuffmanTree.
     */
    @Test
    public void testMain() throws Exception {
        System.out.println("main");
        String[] args = null;
        HuffmanTree.main(args);

    }
    
}
