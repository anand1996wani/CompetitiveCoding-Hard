/*

Question :

Given an array A [ ] having distinct elements, the task is to find the next greater element for each element of the array in order of their appearance in the array.
If no such element exists, output -1 


*/



import java.util.*;
import java.lang.*;
import java.io.*;
class NextLargestElement
 {
	public static void main (String[] args)
	 {
	    //code
	    Scanner s = new Scanner(System.in);
	    int test = s.nextInt();
	    for(int anand = 0;anand < test;anand++){
	        int n = s.nextInt();
	        int[] array = new int[n];
	        for(int i = 0;i < n;i++){
	            array[i] = s.nextInt(); 
	        }
	        Stack <Integer> stack = new Stack <Integer>();
	        for(int i = 0;i<n;i++){
	            if(stack.isEmpty() || stack.peek() >= array[i]){
	                stack.push(array[i]);
	            }
	            else{
	                while(stack.isEmpty()!=true && stack.peek() <= array[i]){
	                    System.out.print(stack.peek());
	                    System.out.print("-->");  
	                    System.out.println(array[i]);
	                    stack.pop();
	                }
	                stack.push(array[i]);
	            }
	        }
	        while(stack.isEmpty()!=true){
	           System.out.print(stack.peek());
	           System.out.print("-->");  
	           System.out.println("-1");
	           stack.pop();
	        }
	    }
	 }
}
