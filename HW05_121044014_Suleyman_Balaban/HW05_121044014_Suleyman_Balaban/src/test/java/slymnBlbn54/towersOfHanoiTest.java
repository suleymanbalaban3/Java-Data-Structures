/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slymnBlbn54;

import java.util.Stack;
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
public class towersOfHanoiTest {
    
    public towersOfHanoiTest() {
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
     * Test of TowerOfHanoi method, of class towersOfHanoi.
     */
    @Test
    public void testTowerOfHanoi() {
        System.out.println("TowerOfHanoi");
        int disksize = 0;
        Stack<Integer> src = null;
        Stack<Integer> dst = null;
        Stack<Integer> aux = null;
        towersOfHanoi instance = new towersOfHanoi();
        instance.TowerOfHanoi(disksize, src, dst, aux);

    }
    /**
     * Test of moveDisk method, of class towersOfHanoi.
     */
    @Test
    public void testMoveDisk() {
        System.out.println("moveDisk");
        char fromPeg = ' ';
        char toPeg = ' ';
        int disk = 0;
        towersOfHanoi instance = new towersOfHanoi();
        instance.moveDisk(fromPeg, toPeg, disk);

    }

    /**
     * Test of tohIterative method, of class towersOfHanoi.
     */
    @Test
    public void testTohIterative() {
        System.out.println("tohIterative");
        int disksize = 0;
        Stack<Integer> src = null;
        Stack<Integer> aux = null;
        Stack<Integer> dst = null;
        towersOfHanoi instance = new towersOfHanoi();
        instance.tohIterative(disksize, src, aux, dst);

    }
    
}
