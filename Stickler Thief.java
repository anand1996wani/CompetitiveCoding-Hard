/*package whatever //do not write package name here */
/*


Stickler is a thief and wants to loot money from a society of n houses placed in a line. He is a weird person and follows a rule while looting the houses and according to the rule he will never loot two consecutive houses. At the same time, he wants to maximize the amount he loots. The thief knows which house has what amount of money but is unable to find the maximum amount he can end up with. He asks for your help to find the maximum money he can get if he strictly follows the rule. Each house has a[i] amount of money present in it.

Input:
The first line of input contains an integer T denoting the number of test cases. Each test case contains an integer n which denotes the number of elements in the array a[]. Next line contains space separated n elements in the array a[].

Output:
Print an integer which denotes the maximum amount he can take home.

Constraints:
1<=T<=200
1<=n<=1000
1<=a[i]<=10000

Example:
Input:
2
6
5 5 10 100 10 5
3
1 2 3

Output:
110
4

*/


import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner scanner = new Scanner(System.in);
		int test = scanner.nextInt();
		for(int an = 0;an < test;an++){
		    int n = scanner.nextInt();
		    int array[] = new int[n];
		    for(int i = 0; i < n;i++){
		        array[i] = scanner.nextInt();
		    }
		    int include = array[0];
		    int exclude = 0;
		    int newexclude = 0;
		    for(int i = 1;i<n;i++){
		        if(include > exclude){
		            newexclude = include;
		        }else{
		            newexclude = exclude;
		        }
		        include = exclude + array[i]; 
                exclude = newexclude; 
		    }
		    System.out.println(Math.max(include,exclude));
		}
	}
}
