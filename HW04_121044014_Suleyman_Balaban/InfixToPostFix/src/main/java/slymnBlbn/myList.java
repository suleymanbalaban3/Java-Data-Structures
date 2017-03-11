/*
 * Suleyman Balaban 121044014 HW04
 * myList.java
 */
package slymnBlbn;

import java.util.Arrays;

/**
 *
 * @author Suleyman Balaban
 * @param <E>
 */
public class myList<E> {
    private static final int INITIAL_CAPACITY=50;
    private E[] theData;
    private int size=0;
    private int capacity=0;
    /**
    * Default constructor
    * 
    */
    public myList() {
        capacity=INITIAL_CAPACITY;
        theData=(E[]) new Object[capacity];
    }
    /**
    * This method get size
    * 
    * : {@link #public int getSize()} 
    * 
    * @return int 
    */
    public int getSize() {
        return size;    
    }
    /**
    * This method add object
    * 
    * : {@link #public boolean add(E anEntry)} 
    * @param anEntry object
    * @return boolean 
    */
    public boolean add(E anEntry) {
        if(size==capacity)
            reallocate();
        theData[size]=anEntry;
        size++;
        return true;
    }
    /**
    * This method add object at that given index
    * 
    * : {@link #public void add(int index,E anEntry)} 
    * @param index indis
    * @param anEntry object
    */
    public void add(int index,E anEntry) {
        if(index<0||index>size) 
            throw new ArrayIndexOutOfBoundsException(index);
        if(size==capacity)
            reallocate();
        for(int i=size;i>index;i--)
            theData[i]=theData[i-1];
        theData[index]=anEntry;
        size++;
    }
    /**
    * This method get object
    * 
    * : {@link #public E get(int index)} 
    * @param index indis
    * @return E 
    */
    public E get(int index) {
        if(index<0||index>=size)
            throw new ArrayIndexOutOfBoundsException(index);
        return theData[index];
    }
    /**
    * This method set object
    * 
    * : {@link #public E set(int index,E newValue)} 
    * @param index indis
    * @param newValue object
    * @return E 
    */
    public E set(int index,E newValue) {
        if(index<0||index>=size)
            throw new ArrayIndexOutOfBoundsException(index);
        E oldValue=theData[index];
        theData[index]=newValue;
        return oldValue;
    }
    /**
    * This method remove object
    * 
    * : {@link #public E remove(int index)} 
    * @param index indis
    * @return E 
    */
    public E remove(int index) {
        if(index<0||index>=size)
            throw new ArrayIndexOutOfBoundsException(index);
        E returnValue=theData[index];
        for(int i=index+1;i<size;i++)
            theData[i-1]=theData[i];
        size--;
        return returnValue;
    }
    private void reallocate() {
        capacity=2*capacity;
        theData=Arrays.copyOf(theData,capacity);
    }
    /**
    * This method create register object
    * 
    * : {@link #public E createRegister(String identifier)} 
    * @param identifier register name
    * @return E 
    */
    public E createRegister(String identifier) {
        theData[size]=(E) new registers(identifier);
        size++;
        return theData[size-1];
    }
    /**
    * This method print list 
    * 
    * : {@link #public String toString()} 
    * @return String 
    */
    public String toString() {
        String res="[";
        for( int i=0;i<size;i++)
            res+=theData[i];
        res+="]";
        return res;
    }
}
