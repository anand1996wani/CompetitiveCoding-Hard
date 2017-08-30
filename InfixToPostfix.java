/*

Question :

Given an infix expression. Conver the infix expression to postfix expression.

Infix expression:
     The expression of the form a op b. When an operator is in-between every pair of operands.
Postfix expression:
     The expression of the form a b op. When an operator is followed for every pair of operands.
     
Input : a+b*(c^d-e)^(f+g*h)-i

Output :  abcd^e-fgh*+^*+i-

*/

import java.util.*;
import java.lang.*;
import java.io.*;
class InfixToPostfix
 {
	public static void main (String[] args)
	 {
	    //code
	    Scanner s = new Scanner(System.in);
	    int test = s.nextInt();
	    for(int i = 0;i < test;i++){
	        String string = s.next();
	        Stack<Character> stack = new Stack<Character>();
	        String result = "";
	        for(int k = 0;k < string.length();k++){
	            if((string.charAt(k) >= 'a' && string.charAt(k) <= 'z') || (string.charAt(k) >= 'A' && string.charAt(k) <= 'Z')){
                    result = result + string.charAt(k);    	                
	            }
	            else if(string.charAt(k)=='('){
	                stack.push(string.charAt(k));
	            }
	            else if(string.charAt(k)==')'){
	                while(stack.isEmpty()!=true && stack.peek()!='('){
	                    result = result + stack.peek();
	                    stack.pop();
	                }
	                if(stack.isEmpty()!=true && stack.peek()=='(')
	                    stack.pop();
	            }
	            else{
	                while(stack.isEmpty()!=true && Prec(string.charAt(k)) <= Prec(stack.peek())){
	                    result = result + stack.peek();
	                    stack.pop();
	                }
	                stack.push(string.charAt(k));
	            }
	        }
	        while(stack.isEmpty()!=true){
	            result = result + stack.peek();
	            stack.pop();
	        }
	        System.out.println(result);
	    }
	 }
	 static int Prec(char ch)
	{
    switch (ch)
        {
        case '+':
        case '-':
            return 1;
        case '*':
        case '/':
            return 2;
        case '^':
            return 3;
        }
        return -1;
    }
}
