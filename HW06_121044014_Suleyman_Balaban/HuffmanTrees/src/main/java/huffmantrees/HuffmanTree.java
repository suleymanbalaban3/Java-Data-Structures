/**
 * Suleyman Balaban 121044014
 */
package huffmantrees;



import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.List;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Class to represent and build a Huffman tree.
 * @author Koffman and Wolfgang
 **/
public class HuffmanTree implements Serializable {


    // Nested Classes
    /** A datum in the Huffman tree. */
    public static class HuffData implements Serializable {
        // Data Fields

        /** The weight or probability assigned to this HuffData. */
        private double weight;
        /** The alphabet symbol if this is a leaf. */
        private Character symbol;
        /**
         * one parameter constructor
         * @param weight
         * @param symbol 
         */
        public HuffData(double weight, Character symbol) {
            this.weight = weight;
            this.symbol = symbol;
        }
        /**
         * symbol getter
         * @return symbol character
         */
        public Character getSymbol() {return symbol;}
    }
    // Data Fields
    /** A reference to the completed Huffman tree. */
    protected BinaryTree<HuffData> huffTree;

    /** A Comparator for Huffman trees; nested class. */
    private static class CompareHuffmanTrees
            implements Comparator<BinaryTree<HuffData>> {

        /**
         * Compare two objects.
         * @param treeLeft The left-hand object
         * @param treeRight The right-hand object
         * @return -1 if left less than right,
         * 0 if left equals right,
         * and +1 if left greater than right
         */
        @Override
        public int compare(BinaryTree<HuffData> treeLeft,
                BinaryTree<HuffData> treeRight) {
            double wLeft = treeLeft.getData().weight;
            double wRight = treeRight.getData().weight;
            return Double.compare(wLeft, wRight);
        }
    }

    /*<listing chapter="6" number="10">*/
    /**
     * Builds the Huffman tree using the given alphabet and weights.
     * @post  huffTree contains a reference to the Huffman tree.
     * @param symbols An array of HuffData objects
     */
    public void buildTree(HuffData[] symbols) {
        Queue<BinaryTree<HuffData>> theQueue =
                new PriorityQueue<BinaryTree<HuffData>>(symbols.length,
                new CompareHuffmanTrees());
        // Load the queue with the leaves.
        for (HuffData nextSymbol : symbols) {
            BinaryTree<HuffData> aBinaryTree =
                    new BinaryTree<HuffData>(nextSymbol, null, null);
            theQueue.offer(aBinaryTree);
        }

        // Build the tree.
        while (theQueue.size() > 1) {
            BinaryTree<HuffData> left = theQueue.poll();
            BinaryTree<HuffData> right = theQueue.poll();
            double wl = left.getData().weight;
            double wr = right.getData().weight;
            HuffData sum = new HuffData(wl + wr, null);
            BinaryTree<HuffData> newTree =
                    new BinaryTree<HuffData>(sum, left, right);
            theQueue.offer(newTree);
        }

        // The queue should now contain only one item.
        huffTree = theQueue.poll();
    }
    /*</listing>*/

    /**
     * Outputs the resulting code.
     * @param out A PrintStream to write the output to
     * @param code The code up to this node
     * @param tree The current node in the tree
     */
    private void printCode(PrintStream out, String code,BinaryTree<HuffData> tree) {
        HuffData theData = tree.getData();
        if (theData.symbol != null) {
            if (theData.symbol.equals(' ')) {
                out.println("space: " + code);
            } else {
                out.println(theData.symbol + ": " + code);
            }
        } else {
            printCode(out, code + "0", tree.getLeftSubtree());
            printCode(out, code + "1", tree.getRightSubtree());
        }
    }

    /**
     * Outputs the resulting code.
     * @param out A PrintStream to write the output to
     */
    public void printCode(PrintStream out) {
        printCode(out, "", huffTree);
    }

    /*<listing chapter="6" number="11">*/
    /**
     * Method to decode a message that is input as a string of
     * digit characters '0' and '1'.
     * @param codedMessage The input message as a String of
     *        zeros and ones.
     * @return The decoded message as a String
     */
    public String decode(String codedMessage) {
        StringBuilder result = new StringBuilder();
        BinaryTree<HuffData> currentTree = huffTree;
        for (int i = 0; i < codedMessage.length(); i++) {
            if (codedMessage.charAt(i) == '1') {
                currentTree = currentTree.getRightSubtree();
            } else {
                currentTree = currentTree.getLeftSubtree();
            }
            if (currentTree.isLeaf()) {
                HuffData theData = currentTree.getData();
                result.append(theData.symbol);
                currentTree = huffTree;
            }
        }
        return result.toString();
    }
    /**
     * Method to encode a message that is input as a string of
     * some characters.
     * @param message The input message as a String of
     * @param huffmanTree BinaryTree input
     * @return The encoded message as a String
     */
    public String encode(String message, BinaryTree huffmanTree) {
        String result="";
        for (int i = 0; i < message.length(); i++) {//add each chracter's encode
            result+=encodeChar(message.charAt(i),huffmanTree);
        } 
        return result;
    }
    /**
     * Method to encode a  character
     * @param character The input character
     * @param tree BinaryTree input
     * @return The encoded character
     */
    public String encodeChar(char character,BinaryTree tree){
        StringBuilder a=new StringBuilder();
        StringBuilder result=new StringBuilder();
        String res="";
        res=encodeChar(tree, character,"",a);
        return res.toString();
    }
    /**
     * Method to encode a character recursively
     * @param tree BinaryTree input
     * @param target The input character
     * @param s String to add bits
     * @param b StringBuilder to add all bits
     * @return The encoded character
     */
    public String encodeChar(BinaryTree tree, char target, String s,StringBuilder b){
        HuffData theData = (HuffData) tree.getData();
        if (theData.symbol != null) {
            if (theData.symbol.equals(target)) {
                b.append(s);
                return b.toString();
            }
        } else {
            encodeChar(tree.getLeftSubtree(), target, s +"0",b);
            encodeChar(tree.getRightSubtree(), target, s + "1",b);
        }
        return b.toString();      
    }
    /**
     * Print codes and their wiegths as string
    */
    public String toString(){
        
        String encodedCodes = "";
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(os);
        this.printCode(ps);
        //Htree.printCode(ps);
        
        try {
            encodedCodes = os.toString("UTF8");
            System.out.println("Encoded Codes : \n"+encodedCodes);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(HuffmanTree.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return encodedCodes;
    }
    
    /*</listing>*/

// Insert solution to programming exercise 1, section 6, chapter 6 here
    /**
     * HuffmanTree class's main method
     * @param args
     * @throws FileNotFoundException
     * @throws UnsupportedEncodingException 
     */
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        
        HuffmanTree Htree = new HuffmanTree();
        
        // Create symbol array
        HuffData[] symbols = {
                            new HuffData(186, '_'),
                            new HuffData(103, 'e'),
                            new HuffData(80, 't'),
                            new HuffData(64, 'a'),
                            new HuffData(63, 'o'),
                            new HuffData(57, 'i'),
                            new HuffData(57, 'n'),
                            new HuffData(51, 's'),
                            new HuffData(48, 'r'),
                            new HuffData(47, 'h'),
                            new HuffData(32, 'd'),
                            new HuffData(32, 'l'),
                            new HuffData(23, 'u'),
                            new HuffData(22, 'c'),
                            new HuffData(21, 'f'),
                            new HuffData(20, 'm'),
                            new HuffData(18, 'w'),
                            new HuffData(16, 'y'),
                            new HuffData(15, 'g'),
                            new HuffData(15, 'p'),
                            new HuffData(13, 'b'),
                            new HuffData(8, 'v'),
                            new HuffData(5, 'k'),
                            new HuffData(1, 'j'),
                            new HuffData(1, 'q'),
                            new HuffData(1, 'x'),
                            new HuffData(1, 'z')
        };
        
        // Build hufffman tree 
        Htree.buildTree(symbols);
        
        // Print huffman codes of the symbols
        String EncodedSymbolList = Htree.toString();
        
        // Decode huffman codes to symbıls
        String code = "110000100111111100101000011";//final word will be junk
        String decodedCode = Htree.decode(code);
        System.out.println("------------------ DECRYPTION -------------------");
        System.out.println("Code to Message : \n"+code+" : \t"+decodedCode);
        System.out.println("------------------ ENCRYPTION -------------------");
        System.out.println("Encode with binary tree: \n");
        System.out.println(decodedCode+" => "+Htree.encode(decodedCode,Htree.huffTree));  
        System.out.println("-------------------------------------------------");
    }
}
/*</listing>*/