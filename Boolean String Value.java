/*
Given a string consisting of only 0, 1, A, B, C where
A = AND
B = OR
C = XOR
Calculate the value of the string assuming no order of precedence and evaluation is done from left to right.

Input:

The first line of input contains an integer T denoting the number of test cases.
The next T lines contains T strings.

Output:

Print the value of the string assuming no order of precedence and evaluation is done from left to right

Constraints:

1 ≤ T ≤ 100
1 ≤ length(string)<=1000


Examples:
Input : 
1
1A0B1

Output : 1
 

1 AND 0 OR 1 = 1

Input : 
2
1C1B1B0A0
1A0B1

Output : 
0
1

*/

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	 //code
	    Scanner scanner = new Scanner(System.in);
	    int test = scanner.nextInt();
	    for(int anand = 0;anand < test;anand++){
	        String st = scanner.next();
	        char array[] = new char[st.length()];
	        array = st.toCharArray();
	        for(int i = 0;i < array.length - 2;i=i+2){
	            char op1 = array[i];
	            char op2 = array[i+2];
	            if(array[i + 1]=='A'){
	                if(op1=='0' || op2=='0'){
	                    array[i+2] = '0';
	                }
	                else{
	                    array[i+2] = '1';
	                }
	            }
	            else if(array[i+1]=='B'){
	                if(op1=='1' || op2=='1'){
	                    array[i+2] = '1';
	                }
	                else{
	                    array[i+2] = '0';
	                }    
	            }
	            else{
	                if(op1==op2){
	                    array[i+2] = '0';
	                }
	                else{
	                    array[i+2] = '1';
	                }
	            }
	        }
	        System.out.println(array[array.length-1]);
	        /*for(int i = 0;i < array.length;i++){
	            System.out.println(array[i]);
	        }*/
	    }
	 }
}
