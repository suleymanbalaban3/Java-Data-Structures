/*
 * HW05_121044014_Suleyman_Balaban
 * LinkListRec.java
 * part-2
 */
package slymnBlbn54;
/**
 *
 * @author Suleyman Balaban
 * @param <E>
 */
public class LinkListRec<E> {
    private Node<E> head;
    /**
 *
 * @author Suleyman Balaban
 * @param <E>
 */
    private static class Node<E> {
        private E data;
        private Node<E>next;
        /**
        * One parameter constructor
        *
        * @param dataItem E data
        * 
        */
        private Node(E dataItem) {
            data=dataItem;
            next=null;
        }
        /**
        * two parameter constructor
        *
        * @param dataItem E data
        * @param nodeRef node reference
        * 
        */
        private Node(E dataItem,Node<E>nodeRef) {
            data=dataItem;
            next=nodeRef;
        }
    }
    /**
    * This method add object with node
    * 
    * : {@link #private void add(Node<E>head,E data)} 
    * @param head Node object
    * @param data E
    */
    private void add(Node<E>head,E data) {
        if(head.next==null)
            head.next=new Node<E>(data);
        else
            add(head.next,data);
    }
    /**
    * This method add object
    * 
    * : {@link #public void add(E data)} 
    * @param data E
    */
    public void add(E data) {
        if(head==null)
            head=new Node<E>(data);
        else
            add(head,data);
    }
    /**
    * This method remove data
    * 
    * : {@link #public boolean remove(E outData)} 
    * @param outData E
    * @return boolean 
    */
    public boolean remove(E outData) {
        if(head==null) 
            return false;
        else if(head.data.equals(outData)){            
            remove(head.next,head,outData);
            head=head.next;   
            return true;
        }
            return remove(head.next,head,outData);
    }
    /**
    * This method remove data with node
    * 
    * @param head E node
    * @param pred E node head
    * @param outData E
    * @return boolean 
    */
    public boolean remove(Node < E > head, Node < E > pred, E outData) {
        if(head==null) 
            return true;
        else if(head.data.equals(outData)){
            remove(head.next,head,outData);
            pred.next=head.next;         
            return true;
        }   
        return remove(head.next,head,outData);
    }
    /**
    * This method toString override function
    * 
    * @param head E node
    * @return String 
    */
    private String toString(Node<E>head) {
        if(head==null) 
            return "";
        else
            return head.data + ", " +toString(head.next);
    }
    /**
    * This method toString 
    * 
    * @return String 
    */
    public String toString() {
        return toString(head);
    }
}
