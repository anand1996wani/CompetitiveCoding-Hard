/*Given a string, the task is to remove all  duplicate characters from the string and print the resultant string.  
The order of remaining characters in the output should be same as in the original string.

Input:
The first line of input contains an integer T denoting the number of test cases. The description of T test cases follows.
Each test case contains a string of length N.

Output:
Print the resultant substring after removing duplicate characters from string.

Note: The string is case-sensitive.

Constraints:
1 ≤ T ≤ 100
1 ≤ N ≤ 100

Example:
Input:
2
geeksforgeeks
HappyNewYear

Output:
geksfor
HapyNewYr */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner scanner = new Scanner(System.in);
		int test = scanner.nextInt();
		for(int anand = 0;anand < test;anand++){
		    String string = scanner.next();
		    int array[] = new int[26];
		    int array1[] = new int[26];
		    char charArray[] = new char[string.length()];
		    charArray = string.toCharArray();
		    for(int i = 0;i < string.length();i++){
		        //int temp = (int)Integer.parseInt(String.valueOf(charArray[i])) - 97;
		        int temp = (int)charArray[i];
		        if(temp<=90){
		            temp = temp - 65;
		            if(array1[temp]==0){
		                array1[temp] = 1;  
		            }
		        }
		        else{
		            temp = temp - 97;
		            if(array[temp]==0){
		                array[temp] = 1;  
		            }
		        }
		    }
		    for(int i = 0;i < string.length();i++){
		        //int temp = Integer.parseInt(String.valueOf(charArray[i])) - 97;
		        int temp = (int)charArray[i];
		        if(temp<=90){
		            temp = temp - 65;
		            if(array1[temp]==1){
		                System.out.print(charArray[i]);
		                array1[temp] = 0;  
		            }
		        }
		        else{
		            temp = temp - 97;
		            if(array[temp]==1){
		                System.out.print(charArray[i]);
		                array[temp] = 0;  
		            }
		        }
		    }
		    System.out.println();
		}
	}
}
