/*

Question : 

Given a postfix expression, the task is to evaluate the expression and print the final value.

*/



import java.util.*;
import java.lang.*;
import java.io.*;
class EvaluationPostfix
 {
	public static void main (String[] args)
	 {
	    //code
	    Scanner s = new Scanner(System.in);
	    int test = s.nextInt();
	    for(int anand = 0;anand < test;anand++){
	        String string = s.next();
	        Stack<Integer> stack = new Stack<Integer>();
	        for(int i = 0;i < string.length();i++){
	            if(string.charAt(i)>='0' && string.charAt(i)<='9'){
	                stack.push(string.charAt(i)-'0');
	            }
	            else{
	                if(stack.isEmpty()!=true){
	                    int op2 = stack.pop();
	                    int op1 = stack.pop();
	                    if(string.charAt(i)=='+')
	                        stack.push(op1 + op2);
	                    else if(string.charAt(i)=='-')
	                        stack.push(op1 - op2);
	                    else if(string.charAt(i)=='*')
	                        stack.push(op1 * op2);
	                    else if(string.charAt(i)=='/')
	                        stack.push((int)(op1 / op2));
	                }
	            }
	        }
	        System.out.println(stack.pop());
	    }
	 }
}
