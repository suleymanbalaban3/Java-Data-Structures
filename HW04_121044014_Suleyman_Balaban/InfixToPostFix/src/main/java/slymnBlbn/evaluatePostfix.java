/*
 * Suleyman Balaban 121044014 HW04
 * evaluatePostfix.java
 */
package slymnBlbn;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

/**
 *
 * @author Suleyman Balaban
 */
public class evaluatePostfix {

    /**
     @throws slymnBlbn.evaluatePostfix.SyntaxErrorException
     */
    public static class SyntaxErrorexception extends Exception {
        SyntaxErrorexception(String message) {
            super(message);
        }
    }
    private static final String OPERATORS="=+-*/";
    private Stack<String>operandStack;
    private Stack<registers>registerStack=new Stack<registers>();
    private myList<registers>values=new myList<registers>();
    private registers $t0=new registers();
    private registers $t1=new registers();
    /**
    * Default constructor
    * 
    */
    public evaluatePostfix() {
        $t0.setIsAssigned(true);
        $t1.setIsAssigned(true);
        values.add($t0);
        values.add($t1);
    }
    private void evalOp(char op,boolean first,PrintWriter pw) {     
        registers regTempL=null;
        registers regTempR=null;
        registers  forSwap=null;
        String right;
        String left;
        boolean assignControl=false;//deger atanmissa true olur
        
        try {
            try{
                if(first==false) {
                    //bir expression ilk defa operatora gelince 2 tane pop edilir
                    //ardindan bu if e girmez else de tek pop edilir stringler yani 
                    //oparator olmayanlar
                    forSwap=registerStack.pop();
                    left=operandStack.pop();
                    if(Character.isDigit(left.charAt(0))) {
                        $t0.setRegister(Integer.parseInt(left));  
                        registerStack.push($t0);
                        registerStack.push(forSwap);                                        
                        pw.println("li    "+$t0+","+$t0.getRegValue());
                    }else {
                        if(isThere(left)==false) 
                            if(values.createRegister(left).getNum()>8)
                                throw new IndexOutOfBoundsException("You try switch register limit!");                                         
                        registerStack.push(getRegister(left));
                        registerStack.push(forSwap);               
                    }            
                }else {    
                    assignControl=true;
                    right=operandStack.pop();
                    left=operandStack.pop();
                    if(Character.isDigit(left.charAt(0))) {
                        $t0.setRegister(Integer.parseInt(left));
                        registerStack.push($t0);
                        pw.println("li    "+$t0+","+$t0.getRegValue());
                    }else {
                        if(isThere(left)==false) 
                            if(values.createRegister(left).getNum()>8)
                                throw new IndexOutOfBoundsException("You try switch register limit!");                                   
                        registerStack.push(getRegister(left));           
                    }
                    if(Character.isDigit(right.charAt(0))) {
                        $t1.setRegister(Integer.parseInt(right));
                        registerStack.push($t1);
                        if(op!='=')
                            pw.println("li    "+$t1+","+$t1.getRegValue());
                    }else {
                        if(isThere(right)==false) 
                            if(values.createRegister(right).getNum()>8)
                                throw new IndexOutOfBoundsException("You try switch register limit!");           
                        registerStack.push(getRegister(right));               
                    }
                }            
            }catch(IndexOutOfBoundsException e) {
                System.err.println(e.getMessage());
                System.exit(0);
            }
               
        }catch(NumberFormatException e) {
            System.err.println("You entered wrong type input!");
            System.exit(0);
        }
        int val=0;
        try {
            switch(op) {
                case '+' : 
                    regTempR=registerStack.pop();
                    regTempL=registerStack.pop();
                    if(!(regTempL.getIsAssigned()&&regTempR.getIsAssigned()))
                        throw new ExceptionInInitializerError("There is emty register (number)!");
                    val=regTempL.getRegValue()+regTempR.getRegValue();
                    $t1.setRegister(val);
                    pw.println("add   "+$t1+","+regTempR+","+regTempL);
                    registerStack.push($t1);
                           break;
                case '-' : 
                    regTempR=registerStack.pop();
                    regTempL=registerStack.pop();
                    if(!(regTempL.getIsAssigned()&&regTempR.getIsAssigned()))
                        throw new ExceptionInInitializerError("There is emty register (number)!");
                    val=regTempL.getRegValue()-regTempR.getRegValue();
                    $t1.setRegister(val);
                    pw.println("sub   "+$t1+","+regTempR+","+regTempL);
                    registerStack.push($t1);
                           break;                
                case '/' : 
                    regTempR=registerStack.pop();
                    regTempL=registerStack.pop();     
                    if(!(regTempL.getIsAssigned()&&regTempR.getIsAssigned()))
                        throw new ExceptionInInitializerError("There is emty register (number)!");
                    try {
                        if(regTempR.getRegValue()==0)
                            throw new NullPointerException("You can't divide a number to 0 (zero)!");
                        val=regTempL.getRegValue()/regTempR.getRegValue();
                        $t1.setRegister(val);
                        pw.println("div   "+regTempL+","+regTempR);
                        registerStack.push($t1);
                        pw.println("mflo  "+$t1);
                    }catch(NullPointerException e) {
                        System.err.println(e.getMessage());
                        System.exit(0);
                    }
                           break;

                case '*' : 
                    regTempR=registerStack.pop();
                    regTempL=registerStack.pop();
                    if(!(regTempL.getIsAssigned()&&regTempR.getIsAssigned()))
                        throw new ExceptionInInitializerError("There is emty register (number)!");
                    val=regTempL.getRegValue()*regTempR.getRegValue();
                    $t1.setRegister(val);
                    pw.println("mult  "+regTempL+","+regTempR);
                    registerStack.push($t1);
                    pw.println("mflo  "+$t1);
                           break;
                case '=' : 
                    regTempR=registerStack.pop();
                    regTempL=registerStack.pop();
                    try{

                        if(regTempL.getRegValue()==-9999&&assignControl==false) {
                            pw.println("li    "+regTempL+","+regTempR);
                            if(!(regTempR.getIsAssigned()))
                                throw new ExceptionInInitializerError("There is emty register (number)!");
                            regTempL.setIsAssigned(true);
                        }  
                        else if(regTempL.getRegValue()==-9999) {
                            pw.println("li    "+regTempL+","+regTempR.getRegValue());
                            regTempL.setIsAssigned(true);
                        }
                        else if(regTempL.getIsAssigned()==true&&assignControl==true)
                            throw new MissingFormatArgumentException("You can't assign value twice at same register!");                        
                        else 
                            pw.println("move  "+regTempL+","+regTempR);
                        regTempL.setRegister(regTempR.getRegValue());
                        values.add(regTempL);
                        pw.printf("\n");
                    }catch(MissingFormatArgumentException e) {
                        System.err.println(e.getMessage());
                        System.exit(0);
                    }
                           break;
            }         
        }catch(ExceptionInInitializerError e) {
            System.err.println(e.getMessage());
            System.exit(0);
        }
    }
    /**
    * This method print which method will print
    * 
    * : {@link #public void printRegister(String printRegister,PrintWriter pw)} 
    * 
    * @param printRegister which register will print
    * @param pw for print to file
    * 
    */
    public void printRegister(String printRegister,PrintWriter pw) {       
        for(int i=0;i<values.getSize();i++) {
            if(printRegister.equals(values.get(i).getterRegName())) {
                pw.println("move  $a0,"+values.get(i));
                pw.println("li    $v0,1");
                pw.println("syscall");
                break;
            }                
        }
    }
    private boolean isOperator(char ch) {
        return OPERATORS.indexOf(ch)!=-1;
    }
    /**
    * This method make search to find is there register on system
    * 
    * : {@link #public boolean isThere(String name)} 
    * 
    * @param name is There register
    * 
    * @return boolean
    */
    public boolean isThere(String name) {
        for(int i=0;i<values.getSize();i++) {
            if(name.equals(values.get(i).getterRegName())) {
                return true;
            }                
        }
        return false;
    }
    /**
    * This method get register
    * 
    * : {@link #public registers getRegister(String name)} 
    * 
    * @param name to find register
    * 
    * @return registers
    */
    public registers getRegister(String name) {
        for(int i=0;i<values.getSize();i++) {
             if(name.equals(values.get(i).getterRegName())) 
                return values.get(i);
        }
        return null;    
    } 
    /**
    * This method calculate and make all processing in it
    * 
    * : {@link #public void eval(String expression,PrintWriter pw) throws SyntaxErrorexception } 
    * 
    * @param expression postfix expression
    * @param pw to print to file
    * @throws slymnBlbn.evaluatePostfix.SyntaxErrorexception
    * 
    */
    public void eval(String expression,PrintWriter pw) throws SyntaxErrorexception {
        
        operandStack=new Stack<String>();
        String [] tokens=expression.split("\\s+");        
        int count=0;
        
        try {
            for(String nextToken : tokens) {
                char firstChar=nextToken.charAt(0);              
                if(Character.isDigit(firstChar)||Character.isJavaIdentifierStart(firstChar))                                                       
                    operandStack.push(nextToken);          
                else if(isOperator(firstChar)) {
                    if(count==0)
                        evalOp(firstChar,true,pw);    
                    else
                        evalOp(firstChar,false,pw); 
                    count++;                   
                }
                else {
                    throw new SyntaxErrorexception("invalid character: "+firstChar);                   
                }
            }
            if(operandStack.empty()) {
                   
            } else {
                throw new SyntaxErrorexception("Syntax error: Stack should be empty");
            }
        }
        catch(EmptyStackException ex) {
            throw new SyntaxErrorexception("Syntax error: The stack is empty");
        }
    }
    
}
