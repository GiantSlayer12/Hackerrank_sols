/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searchalgos;

import java.util.Scanner;

/**
 *
 * @author Terraformer
 */
public class Reverser {
    
    static String input,output;
    static Stack stack;
    
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
         input = in.nextLine();
         
         stack = new Stack(input.length());
         
         for(int i = 0; i < input.length(); i++){
             stack.push(input.charAt(i));
         }
         
         output = "";
         
         while(!stack.isEmpty()){
             output += stack.pop();
         }
        System.out.println(output);
    }
    
}


class Stack{
    private int top;
    private char[] stackArray;
    private int max;
    
    
    Stack(int m){
        
        top = -1;
        max = m;
        stackArray = new char[max];
        
    }
    
    public void push(char j){
        stackArray[++top] = j;
    }
    
    public char pop(){
        return stackArray[top--];
    }
    
    public char peek(){
        return stackArray[top];
    }
    
    public boolean isEmpty(){
        return ( top == -1);
    }
}
