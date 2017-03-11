/*
 * Suleyman Balaban 121044014 HW3
 * SpectList.java
 */
package suleymanBalaban;

import java.util.*;
import java.util.List;
import java.util.LinkedList; 
/** 
 * This class specific list class.Link list extended
 * @author Suleyman Balaban
 * @param <E>
 */ 
public class SpectList<E extends Comparable> extends LinkedList<E>{
    /**
    * This method add all elements in collection to the Spect list
    * 
    * : {@link #addAllAtHead(Collection<? extends E>  c)} 
    * 
    * @param c collection of something
    * 
    * @return boolean
    */
    public boolean addAllAtHead(Collection<? extends E>  c) {
        if(c==null||c.isEmpty()==true)
            return false;
        try{
            if (!(c instanceof List)) {
                throw new IllegalArgumentException 
                    ("Error!You try to add wrong type class...\n");
            }
            else{
                @SuppressWarnings("unchecked")
                List<E> arr = (List<E>) c;
                this.addAll(0,arr);                  
                return true;
            }
        }       
        catch(IllegalArgumentException  e) {
            System.out.println(e.getMessage()); 
            return false;
        }
    }
    /**
    * This method get intersect elements both collections
    * 
    * : {@link #getIntersectList (Collection<? extends E>  c)} 
    * 
    * @param c collection of something
    * 
    * @return List
    */
    public List<E> getIntersectList (Collection<? extends E>  c) {
        List <E> list =new LinkedList<>();
        
        try{
            if (!(c instanceof List)) {
                throw new IllegalArgumentException 
                    ("Error!You try to compare wrong type classes...\n");
            }
            else{
                @SuppressWarnings("unchecked")
                List<E> arr = (List<E>) c;
                for(E t : arr) {           
                    if(this.contains(t)) {
                        if (Collections.frequency(this,t)==1) {
                            list.add(t);
                        }
                    }
                }                  
                return list;
            }
        }       
        catch(IllegalArgumentException  e) {
            System.out.println(e.getMessage()); 
            list=null;
            return list;
        }      
    }
    /**
    * This method sort my spect list increasing or decreasing
    * 
    * : {@link #sortList(String decreasing_or_increasing)} 
    * 
    * @param decreasing_or_increasing types for sorting
    * 
    * @return List
    */
    public List<E> sortList(String decreasing_or_increasing) {     
        boolean swapped = true;
        int i = 0;
        int j = this.size() - 1; 
        try{
            if(!"increasing".equals(decreasing_or_increasing)&&
                    !"decreasing".equals(decreasing_or_increasing)) {
                throw new IllegalArgumentException("Error!Wrong parameter..\n");          
            }
        }
        catch(IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return null;
        }
        if("increasing".equals(decreasing_or_increasing)) {
            while(i < j && swapped) 
            {
             swapped = false;
             for(int k = i; k < j; k++) 
             {
                if(this.get(k).compareTo(this.get(k+1))>0) 
                {
                   E temp = this.get(k); 
                   this.set(k,this.get(k+1));
                   this.set(k+1,temp);               
                   swapped = true;
                }
             }
             j--;
             if(swapped) 
             {
                swapped = false;
                for(int k = j; k > i; k--) 
                {
                   if(this.get(k).compareTo(this.get(k-1))<0) 
                   {
                      E temp = this.get(k); 
                      this.set(k,this.get(k-1));
                      this.set(k-1,temp);
                      swapped = true;
                   }
                }
             }
             i++;
            }
        }
        else if("decreasing".equals(decreasing_or_increasing)) {
            while(i < j && swapped) 
            {
             swapped = false;
             for(int k = i; k < j; k++) 
             {
                if(this.get(k).compareTo(this.get(k+1))<0) 
                {
                   E temp = this.get(k); 
                   this.set(k,this.get(k+1));
                   this.set(k+1,temp);               
                   swapped = true;
                }
             }
             j--;
             if(swapped) 
             {
                swapped = false;
                for(int k = j; k > i; k--) 
                {
                   if(this.get(k).compareTo(this.get(k-1))>0) 
                   {
                      E temp = this.get(k); 
                      this.set(k,this.get(k-1));
                      this.set(k-1,temp);
                      swapped = true;
                   }
                }
             }
             i++;
            }          
        }
        else
            System.out.println("Error!Wrong parameter object couldn't sort!");
        return this;
    }
    /**
    * This method spect list class's static main function
    * 
    * : {@link #main(String[] args)} 
    * 
    * @param args 
    * 
    */
    public static void main(String[] args) {
        
        boolean returnValue;
        SpectList<Integer> listOfInteger = new SpectList<>();  
        SpectList<Double>  listOfDouble = new SpectList<>();
        SpectList<Character>  listOfChar = new SpectList<>();
        
        List<Integer> theListOfInteger = new LinkedList<>();
        List<Double> theListOfDouble = new LinkedList<>();
        List<Character> theListOfChar = new LinkedList<>();
        
        Collection <Integer> collectionOfInteger;
        Collection <Double> collectionOfDouble;
        Collection <Character> collectionOfChar;
        
        System.out.println("################### WELCOME #####################");
        System.out.println("------------- Integer SpectList Test-------------");
        listOfInteger.add(1);
        listOfInteger.add(2);       
        System.out.println("SpectList:" + listOfInteger);
        theListOfInteger.add(1);
        theListOfInteger.add(7);
        theListOfInteger.add(8);
        
        collectionOfInteger=theListOfInteger;
        
        System.out.println("Collection of integer List:" + collectionOfInteger);
        System.out.println("Getter intersect list : "+
                listOfInteger.getIntersectList(collectionOfInteger));
        returnValue=listOfInteger.addAllAtHead(collectionOfInteger);    
        if(returnValue==true) {
            System.out.println("Collection list appended SpectList:"+
                    listOfInteger);
        }
        else
            System.out.println("collection is null or empty!");           
       
        System.out.println("Sorted SpectList: "+
                listOfInteger.sortList("increasing"));
        
        System.out.println("------------- Double SpectList Test-------------");
        listOfDouble.add(2.0);
        listOfDouble.add(7.0);
        listOfDouble.add(4.2);
        System.out.println("SpectList:" + theListOfDouble);
        theListOfDouble.add(7.0);
        theListOfDouble.add(6.5);
        theListOfDouble.add(9.3);
        
        collectionOfDouble=theListOfDouble;
        
        System.out.println("Collection of double List:" + collectionOfDouble);
        System.out.println("Getter intersect list : "+
                listOfDouble.getIntersectList(collectionOfDouble));
        
        returnValue=listOfDouble.addAllAtHead(collectionOfDouble);  
        if(returnValue==true) {
            System.out.println("Collection list appended SpectList:" +
                    listOfDouble);
        }
        else
            System.out.println("collection is null or empty!");        

        System.out.println("Sorted SpectList: "+
            listOfDouble.sortList("decreasing"));

        System.out.println("------------- Char SpectList Test-------------");       
        listOfChar.add('A');
        listOfChar.add('f');
        listOfChar.add('L');
        System.out.println("SpectList:" + listOfChar);
        theListOfChar.add('A');
        theListOfChar.add('Z');
        theListOfChar.add('C');
        
        collectionOfChar=theListOfChar;
        
        System.out.println("Collection of double List:" + collectionOfChar);
        System.out.println("Getter intersect list : "+
                listOfChar.getIntersectList(collectionOfChar));
        returnValue=listOfChar.addAllAtHead(collectionOfChar);     
        if(returnValue==true) {
            System.out.println("Collection list appendd SpectList:"+listOfChar);
        }
        else
            System.out.println("collection is null or empty!");                      
        System.out.println("Sorted SpectList: "+
            listOfChar.sortList("increasing"));
       
        System.out.println("################### THE END #####################");
    }   

}
