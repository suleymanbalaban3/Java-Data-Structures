/*
 * HW07_121044014_Suleyman_Balaban
 * PriorityQueue.java
 */
package slymn;

import java.util.*;
import java.util.Comparator;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author Suleyman Balaban
 */
public class PriorityQueue extends AbstractCollection {

    /**
     * this class my default comparator class implemented
     */
    public class DefaultComparator implements Comparator<appointment> {
        /**
         * This method compare two appointent
         * @param o1 appointment
         * @param o2 appointment
         * @return boolean
         */
        public int compare(appointment o1, appointment o2) {
            if(o1.getPriority()==o2.getPriority())
                return 0;
            else {
                if(o1.getPriority()==1||(o1.getPriority()==2&&o2.getPriority()==3))
                    return 1;
                else 
                    return -1;  
            }
        }
    }
    private Comparator myComp = new DefaultComparator();
    private int        mySize;
    private ArrayList<appointment>  myList;
    private int start;
    private int end;
    private int currentIndex=1;
    
    private class PQItr implements Iterator {
        /**
         * This method get next object
         * @return Object
         */
        public Object next() {
            return myList.get(myCursor);
        }  
        /**
         * This method check,is there a next object?
         * @return boolean
         */
        public boolean hasNext() {
            return myCursor <= mySize;
        }
        /**
         * This method didn't implement
         */
        public void remove() {
            throw new UnsupportedOperationException("remove not implemented");
        }      
        private int myCursor = 1;
    }
    /**
     * default constructor
     */
    public PriorityQueue() {
        myList = new ArrayList<appointment>(100);
        myList.add(null);             // first slot has index 1
        mySize = 0;
    }
    /**
     * this method set start and end time
     * @param start time
     * @param end time
     */
    public void setStartAndEnd(int start,int end) {
        this.start=start;
        this.end=end;
    }
    /**
     * this method find current appointment's index
     * @param currentIndex 
     */
    public void setCurrentIndex(int currentIndex ) {
        this.currentIndex=currentIndex;
    }
    /**
     * this method get start time
     * @return int
     */
    public int getStart() {
        return start;
    }
    /**
     * this method get end time
     * @return int
     */
    public int getEnd() {
        return end;
    }
    /**
     * this method get current index
     * @return int
     */
    public int getCurrentIndex() {
        return currentIndex;
    }
    /**
     * this method add (push) method
     * @param o appointment
     * @return boolean
     */
    public boolean add(appointment o) {       
        int status=0;
        mySize++;             
        if(size()==1) {
            myList.add(o); 
            setStartAndEnd(o.getTime(),o.getTime()+o.getDuration());
        }else {           
            if(getStart()<o.getTime()&&getEnd()>o.getTime()) {
                int k=getCurrentIndex();
                
                while(k+1<size()) {
                    if(myComp.compare((appointment)myList.get(k+1),o)<0) {
                        myList.add(k+1,o);
                        status=1;
                        break;
                    }
                    k++;            
                }
                if(status==0) {
                    myList.add(o); 
                }                
            }else {
                myList.add(o);
                setStartAndEnd(o.getTime(),o.getTime()+o.getDuration());
                setCurrentIndex(size());
            }            
        }       
        return true;
    }
    /**
     * this method get size
     * @return int
     */
    public int size() {
        return mySize;
    }
    /**
     * this method check is empty?
     * @return boolean
     */
    public boolean isEmpty() {
        return mySize == 0;
    }
    /**
     * this method make poll
     * @return Object
     */
    public Object poll() {
        if (! isEmpty()) {
            mySize--;
            return myList.remove(1);
        }
        return null;
    }
    /**
     * this method manage times order by order
     */
    public void timeManaging() {
        int i=2;
        myList.get(2).setTime(myList.get(1).getTime()+myList.get(1).getDuration());
        while(i<size()) {
            myList.get(i+1).setTime(myList.get(i).getTime()+myList.get(i).getDuration());
            i++;
        }
        myList.get(size()).setTime(myList.get(size()-1).getTime()+myList.get(size()-1).getDuration());
    }
    /**
     * this method make peek
     * @return Object
     */
    public Object peek() {
        return myList.get(1);
    }
    /**
     * this method create iterator
     * @return Iterator
     */
    public Iterator iterator() {
        return new PQItr();
    } 
    /**
     * this method fill priority queue
     * @param inputFile 
     */
    public void fillQueue(String inputFile) {
        appointment[] appointments=new appointment[250];
        int i=0;        
        try{
            FileReader fr=new FileReader(inputFile);
            BufferedReader br=new BufferedReader(fr); 
            String str;
            str=br.readLine();
            while((str=br.readLine())!=null) {                
                String [] print=str.split("\\s+");
                String [] times=print[0].split(":");
                int clock=(Integer.parseInt(times[0])*60)+Integer.parseInt(times[1]);
                int duration=Integer.parseInt(print[1]);
                int priority=Integer.parseInt(print[3]);
                appointments[i]=new appointment(clock,duration,priority);
                i++;
            }
            br.close();
        }catch(IOException e) {
            JOptionPane.showMessageDialog(null,"You entered wrong input file!");
        }
        for (int k = 0; k < i; k++) {
            this.add(appointments[k]);
        }
        this.timeManaging();
    }
    /**
     * this method static main method
     * @param args
     * @throws FileNotFoundException
     * @throws IOException 
     */
    public static void main(String args[]) throws FileNotFoundException, IOException {
        PriorityQueue pq1 = new PriorityQueue();
        PriorityQueue pq2 = new PriorityQueue();
        
        String inputFile1="data1.txt";
        String inputFile2="data2.txt";
        
        FileWriter fw1=new FileWriter("data1Output.txt");
        PrintWriter pw1=new PrintWriter(fw1);
        FileWriter fw2=new FileWriter("data2Output.txt");
        PrintWriter pw2=new PrintWriter(fw2);
        
        String debug=JOptionPane.showInputDialog("      ... WELCOME ...\nEnter for DEBUG mode :Y or not :N");     
        
        System.out.println("######################## WELCOME ##########################");        
        System.out.println("---------------------- TEST 1 ------------------------");
        pq1.fillQueue(inputFile1);
        pw1.println("Arival Time\tServiced Time\tCustomer Type");
        if(debug.contains("y")||debug.contains("Y"))
            System.out.println("Arival Time\tServiced Time\t\t\tCustomer Type");
        else
            System.out.println("All data saved in "+inputFile1);
        while (pq1.size() > 0) {
            if(debug.contains("y")||debug.contains("Y"))
                System.out.println(pq1.peek());
            pw1.println(pq1.poll());           
        }
        pw1.close();
        
        System.out.println("---------------------- TEST 2 ------------------------");
        pq2.fillQueue(inputFile2);
        pw2.println("Arival Time\tServiced Time\tCustomer Type");
        if(debug.contains("y")||debug.contains("Y"))
            System.out.println("Arival Time\tServiced Time\t\t\tCustomer Type");
        else
            System.out.println("All data saved in "+inputFile2);
        while (pq2.size() > 0) {
            if(debug.contains("y")||debug.contains("Y"))
                System.out.println(pq2.peek());
            pw2.println(pq2.poll()); 
        }
        pw2.close();
        System.out.println("------------------------------------------------------");
        System.out.println(".\n.\n.\nProgram successfuly terminated\n.\n.\n.");
        System.out.println("######################## THE END ##########################");
    }
}
