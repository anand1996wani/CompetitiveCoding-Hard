/*package whatever //do not write package name here */
/*

Given a positive number N, the task is to round it to nearest multiple of 10. 
Number can be so big and can contains 100 of digits.

Input:

The first line of input contains an integer T denoting the number of test cases. 
Then T test cases follow.
Each test case contains a positive number N.

Output:
For each test case, print the nearest multiple of 10 in new line.

Constraints:
1<=T<=100
1<=|Number length|<=100

Example:
Input:
2
15
29

Output:
10
30
*/


import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner scanner = new Scanner(System.in);
		int test = scanner.nextInt();
		for(int cases = 0;cases < test;cases++){
		    String myString;
		    myString = scanner.next();
		    char []array = new char[myString.length()];
		    array = myString.toCharArray();
		    int carry = 0;
		    if(array[array.length-1]!='0'){
		        if(array[array.length-1] <= '5'){
		            array[array.length-1] = '0';
		        }else{
		            if(array.length > 1){
		                array[array.length-1] = '0';
        		        for(int i = array.length-2;i>=0;i--){
        		            carry = 0;
        		            if(array[i]!='9'){
        		                array[i] =(char)((int)array[i] + 1);
        		                break;
        		            }else{
        		                array[i] = '0';
        		                carry = 1;
        		            }
        		        }
		            }else{
		                if(array[0] > '5')
		                    carry = 1;
		                array[array.length-1] = '0';
		            }
		        }
		    }
		    myString = "";
		    for(int i = 0;i < array.length;i++)
		        myString = myString + array[i]; 
		    if(carry==0)
		        System.out.println(myString);
		    else
		        System.out.println("1" + myString);
		        
		}
	}
}
