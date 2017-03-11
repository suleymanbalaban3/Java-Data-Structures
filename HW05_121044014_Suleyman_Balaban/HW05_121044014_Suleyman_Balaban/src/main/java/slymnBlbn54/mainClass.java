/*
 * HW05_121044014_Suleyman_Balaban
 * mainClass.java
 * part-3
 */
package slymnBlbn54;

import java.util.List;
import java.util.ArrayList;
import java.util.Stack;

/**
 *
 * @author Suleyman Balaban
 * @param <E>
 */
public class mainClass<E> {
    private List<E> list1=new ArrayList<E>();
    private List<E> list2=new ArrayList<E>();
    /**
    * This method intersect using recursive method in it 
    * : {@link #public List intersectionOfLists()}  
    * @return List 
    */
    public List intersectionOfLists() {
        List <E> obj=new ArrayList<>();
        intersectRecursive(0,obj);
        return obj;
    }
    /**
    * This method find unions using recursive method in it 
    * : {@link #public List unionOfLists()}  
    * @return List 
    */
    public List unionOfLists() {
        List <E> obj=new ArrayList<>();
        unionRecursive(0,0,obj);
        return obj;
    }
    /**
    * This method find if they are subset using recursive method in it 
    * : {@link #public boolean isSubset()}  
    * @return boolean 
    */
    public boolean isSubset() {
        List <E> obj=new ArrayList<>();        
        return isSubsetRecursive(0,obj);
    }
    /**
    * This method recursively intersect  
    * @param indis baslangic
    * @param array List object
    */
    private void intersectRecursive(int indis,List <E> array) {
        if(list1.size()>=list2.size()) {
            if(list1.size()>indis) {
                if(list2.indexOf(list1.get(indis))!=-1&&
                        array.indexOf(list1.get(indis))==-1)                                    
                    array.add(list1.get(indis));            
                intersectRecursive(indis+1,array);           
            }  
        }else {
            if(list2.size()>indis) {
                if(list1.indexOf(list2.get(indis))!=-1&&
                        array.indexOf(list2.get(indis))==-1)                                    
                    array.add(list2.get(indis));            
                intersectRecursive(indis+1,array);           
            }
        }
    }
    /**
    * This method recursively union}  
    * @param indis1 baslangic for first list
    * @param indis2 baslangic for second list
    */
    private void unionRecursive(int indis1,int indis2,List <E> array) {
        if(list1.size()>=list2.size()) {//list1 size bigger or equal than list2
            if(list1.size()>indis1) {
                array.add(list1.get(indis1));
                if(list2.size()>indis2) {
                    if(!(list2.get(indis2).equals(list1.get(indis1))))                                    
                        array.add(list2.get(indis2));   
                    unionRecursive(indis1+1,indis2+1,array);    
                }
            }     
        }else {
            if(list2.size()>indis2) {
                array.add(list2.get(indis2));
                if(list1.size()>indis1) {
                    if(!(list1.get(indis1).equals(list2.get(indis2))))                                      
                        array.add(list1.get(indis1));            
                    unionRecursive(indis1+1,indis2+1,array);        
                }
            }
        }
    }
    /**
    * This method recursively is subset ? 
    * @param indis baslangic
    * @param array List object
    */
    private boolean isSubsetRecursive(int indis1,List <E> array) {
        if(list1.size()<list2.size()) {//list1 size bigger or equal than list2           
            return false;                                 
        }else {
            if(list2.size()>indis1) {           
                if(list1.indexOf(list2.get(indis1))!=-1)                          
                    return isSubsetRecursive(indis1+1,array);
                else                
                    return false;                                                          
            }
            else
                return true;
        }       
    }
    /**
     * my main class have three part
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //////////////////////////////// PART-1 ////////////////////////////////
        System.out.println("#################### WELCOME ####################");
        System.out.println("********************* PART-1 ********************");
        towersOfHanoi object=new towersOfHanoi();
        Stack<Integer>src=new Stack<Integer>();
        Stack<Integer>aux=new Stack<Integer>();
        Stack<Integer>dst=new Stack<Integer>();
        object.TowerOfHanoi(3,src,dst,aux);        
        //////////////////////////////// PART-2 ////////////////////////////////
        System.out.println("********************* PART-2 ********************");
        LinkListRec<Integer> object1=new LinkListRec<>();
        LinkListRec<Integer> object2=new LinkListRec<>();
        LinkListRec<Character> object3=new LinkListRec<>();
        int target1=9;
        int target2=5;
        char target3='S';
        
        object1.add(9);
        object1.add(9);
        object1.add(9);
        object1.add(9);
        object1.add(8);
        object1.add(4);
        object1.add(5);    
        
        object3.add('F');
        object3.add('S');
        object3.add('A');        
        object3.add('L');
        object3.add('K');
        object3.add('S');
        object3.add('G');
        
        System.out.println("----------------- First List -------------");
        System.out.println("["+object1+"]");
        System.out.println("---------- ("+target1+") Removed From List ------");
        object1.remove(target1);
        System.out.println("["+object1+"]");
        System.out.println("-----------------------------------------");
        System.out.println("----------------- Second List -------------");
        System.out.println("["+object2+"]");//empty list for test
        System.out.println("--------- ("+target2+") Removed From List -------");
        object2.remove(target2);
        System.out.println("["+object2+"]");
        System.out.println("-----------------------------------------");
        System.out.println("----------------- Third List --------------");
        System.out.println("["+object3+"]");
        System.out.println("---------- ("+target3+") Removed From List ------");
        object3.remove(target3);
        System.out.println("["+object3+"]");
        System.out.println("-----------------------------------------");        
        //////////////////////////////// PART-3 ////////////////////////////////
        System.out.println("********************* PART-3 ********************");
        mainClass <Integer> object111=new mainClass<>();
        mainClass <Character> object222=new mainClass<>();
        //********************************************************************//
        object111.list1.add(1);
        object111.list1.add(2);
        object111.list1.add(2);
        object111.list1.add(9);
        
        object111.list2.add(1);
        object111.list2.add(2);
        object111.list2.add(4);
        
        System.out.println("--------------- Test.1 With Integer -------------");
        System.out.println("List-1 ==> "+object111.list1);
        System.out.println("List-1 ==> "+object111.list2);
        System.out.println("Intersection Of List => "+
                object111.intersectionOfLists());
        System.out.println("Union Of List => "+object111.unionOfLists());
        System.out.println("Is Subset These List ? => "+object111.isSubset());
        System.out.println("-------------------------------------------------");
        //********************************************************************//
        object222.list1.add('g');
        object222.list1.add('g');
        object222.list1.add('y');
        object222.list1.add('t');
        
        
        
        object222.list2.add('h');
        object222.list2.add('l');
        object222.list2.add('k');
        object222.list2.add('m');
        object222.list2.add('j');
        
        System.out.println("-------------- Test.2 With Character ------------"); 
        System.out.println("List-1 ==> "+object222.list1);
        System.out.println("List-1 ==> "+object222.list2);
        System.out.println("Intersection Of List => "+
                object222.intersectionOfLists());
        System.out.println("Union Of List => "+object222.unionOfLists());
        System.out.println("Is Subset These List ? => "+object222.isSubset());
        System.out.println("-------------------------------------------------");
        System.out.println("#################### THE END ####################");
        //********************************************************************//
        
    }  
}