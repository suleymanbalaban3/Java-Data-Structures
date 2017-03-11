/*
 * Suleyman Balaban 121044014 HW04
 * InfixToPostFix.java
 */
package slymnBlbn;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Suleyman Balaban
 */
public class InfixToPostFix {

    private Stack<Character>operatorStack;
    private static final String OPERATORS="=+-*/";
    private static final int [] PRECEDENCE={0,1,1,2,2};
    private StringBuilder postfix;
    /**
    * This method add all elements in collection to the Spect list
    * 
    * : {@link #public String convert(String infix) throws SyntaxErrorException, Exception} 
    * 
    * @param infix string of infix expressions
    * 
    * @throws slymnBlbn.InfixToPostFix.SyntaxErrorException
    * @return String
    */
    public String convert(String infix) throws SyntaxErrorException, Exception {
        operatorStack=new Stack<Character>();
        postfix=new StringBuilder();
        String [] tokens=infix.split("\\s+");
        try {
            for(String nextToken : tokens) {
                char firstChar=nextToken.charAt(0);
                if(Character.isJavaIdentifierStart(firstChar)||
                        Character.isDigit(firstChar)) {
                    postfix.append(nextToken);
                    postfix.append(' ');
                }
                else if(isOperator(firstChar)) 
                    processOperator(firstChar);
                else 
                    throw SyntaxErrorException ("Unexpected Character Encountered"+firstChar);   
            }
            while(!operatorStack.empty()) {
                char op=operatorStack.pop();
                postfix.append(op);
                postfix.append(' ');
            }
            return postfix.toString();
        }
        catch(EmptyStackException ex) {
            throw new SyntaxErrorException("Syntax Error: The stack is emty");
        }
    }
    private void processOperator(char op) {
        if(operatorStack.empty())
            operatorStack.push(op);
        else {
            char topOp=operatorStack.peek();
            if(precedence(op)>precedence(topOp))
                operatorStack.push(op);
            else {
                while(!operatorStack.empty()&&precedence(op)<=precedence(topOp)) {
                    operatorStack.pop();
                    postfix.append(topOp);
                    postfix.append(' ');
                    if(!operatorStack.empty())
                        topOp=operatorStack.peek();
                    operatorStack.push(op);
                }
            }
        }
    }
    private boolean isOperator(char ch) {
        return OPERATORS.indexOf(ch)!=-1;
    }
    private int precedence(char op) {
        return PRECEDENCE[OPERATORS.indexOf(op)];
    }
    /**
    * This method static main function
    * 
    * : {@link #main(String[] args)} 
    * 
    * @throws java.lang.Exception 
    * @param args     
    * 
    */
    public static void main(String[] args) throws Exception {
        InfixToPostFix inToPost=new InfixToPostFix();
        evaluatePostfix obj=new evaluatePostfix();       
        
        String inputFile=JOptionPane.showInputDialog("Please enter input name");    
        String str;
        String postfix;
        
        try {
            FileReader fr=new FileReader(inputFile);
            BufferedReader br=new BufferedReader(fr);        
            FileWriter fw=new FileWriter("output.asm");
            PrintWriter pw=new PrintWriter(fw);
            try {
                while((str=br.readLine())!=null) {
                    if(str.contains("print")) {
                        String [] print=str.split("\\s+");
                        obj.printRegister(print[1],pw);
                    }else {
                        postfix=inToPost.convert(str);
                        obj.eval(postfix,pw);
                    }                   
                }
                pw.close();
                br.close();
            }catch(SyntaxErrorException e) {
                System.out.println("hata");
            }
        }catch(IOException e) {
            JOptionPane.showMessageDialog(null,"You entered wrong input file!");
        }
        System.exit(0);
    }
    private Exception SyntaxErrorException(String string) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    private static class SyntaxErrorException extends Exception {

        public SyntaxErrorException() {
        }

        private SyntaxErrorException(String syntax_Error_The_stack_is_emty) {
            throw new UnsupportedOperationException("Not supported yet."); 
        }
    }
}
