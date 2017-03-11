/*
 * HW05_121044014_Suleyman_Balaban
 * towersOfHanoi.java
 * part-1
 */
package slymnBlbn54;

import java.util.EmptyStackException;
import java.util.Stack;
/**
 *
 * @author Suleyman Balaban
 */
public class towersOfHanoi {
    /**
    * This method most important method
    * @param src Stack object
    * @param aux Stack object
    * @param dst Stack object
    * @param disksize integer disk size
    */
    public void TowerOfHanoi(int disksize,Stack<Integer>src,
            Stack<Integer>dst,Stack<Integer>aux) {
        tohIterative(disksize,src,aux,dst);
    } 
    /**
    * This method move poles
    * 
    * @param src Stack object
    * @param dst Stack object
    * @param s character
    * @param d character
    */
    public void movePoles(Stack<Integer>src,
            Stack<Integer>dst,char s,char d) {
        Integer pole1TopDisk = null,pole2TopDisk = null;
        try {
            pole1TopDisk = src.pop();           
        }catch(EmptyStackException e) {
       
        }
        try {          
            pole2TopDisk = dst.pop();               
        }catch(EmptyStackException e) {
     
        }
        if (src.empty()&&pole1TopDisk==null) {           
            src.push(pole2TopDisk);     
            moveDisk(d,s,pole2TopDisk);           
        }
        else if (dst.empty()&&pole2TopDisk==null) {
            dst.push(pole1TopDisk);
            moveDisk(s,d,pole1TopDisk);
        }
        else if (pole1TopDisk > pole2TopDisk) {
            src.push(pole1TopDisk);
            src.push(pole2TopDisk);
            moveDisk(d, s, pole2TopDisk);
        }
        else {
            dst.push(pole2TopDisk);
            dst.push(pole1TopDisk);
            moveDisk(s,d,pole1TopDisk);
        }
    }
    /**
    * This method movedisk 
    * 
    * : {@link #public void moveDisk(char fromPeg, char toPeg, int disk)} 
    * @param fromPeg character
    * @param toPeg character
    * @param disk integer
    */
    public void moveDisk(char fromPeg, char toPeg, int disk) {
        System.out.printf("Move the disk %d from \'%c\' to \'%c\'\n",
               disk, fromPeg, toPeg);
    }
    /**
    * This method hanoi with iterative
    * 
    * @param src Stack object
    * @param aux Stack object
    * @param dst Stack object
    * 
    * @param disksize integer size
    */
    public void tohIterative(int disksize,Stack<Integer>src,Stack<Integer>aux,
            Stack<Integer>dst) {
        int i, total_num_of_moves;
        char s = 'S', d = 'D', a = 'A';

        if (disksize % 2 == 0) {
            char temp = d;
            d = a;
            a  = temp;
        }
        total_num_of_moves = (int) (Math.pow(2,disksize)-1);
        for (i = disksize; i >= 1; i--)
            src.push(i);
        for (i = 1; i <= total_num_of_moves; i++) {            
            if (i % 3 == 1)              
              movePoles(src, dst, s, d);            
            else if (i % 3 == 2) 
              movePoles(src, aux, s, a);
            else if (i % 3 == 0)                
              movePoles(aux, dst, a, d);                         
        }
    }
}