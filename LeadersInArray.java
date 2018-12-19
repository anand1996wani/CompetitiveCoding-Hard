/*package whatever //do not write package name here */
/*
Given an array of positive integers. Your task is to find the leaders in the array.
Note: An element of array is leader if it is greater than or equal to all the elements to its right side. Also, the rightmost element is always a leader. 

Input:
The first line of input contains an integer T denoting the number of test cases. The description of T test cases follows.
The first line of each test case contains a single integer N denoting the size of array.
The second line contains N space-separated integers A1, A2, ..., AN denoting the elements of the array.

Output:
Print all the leaders.

Constraints:
1 <= T <= 100
1 <= N <= 107
0 <= Ai <= 1018

Example:
Input:
3
6
16 17 4 3 5 2
5
1 2 3 4 0
5
7 4 5 7 3
Output:
17 5 2
4 0
7 7 3

Explanation:
Testcase 3: All elements on the right of 7 (at index 0) are smaller than or equal to 7. 
Also, all the elements of right side of 7 (at index 3) are smaller than 7. 
And, the last element 3 is itself a leader since no elements are on its right.


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
		    //int temp[] = new int[n];
		    int amax = -1;
		    for(int i = 0;i < n;i++){
		        array[i] = scanner.nextInt();
		        if(amax < array[i]){
		            amax = array[i];
		        }
		    }
		    if(amax==array[n-1]){
		        System.out.println(amax);   
		    }else{
    		    int max = array[n-1];
    		    //temp[n-1] = max;
    		    //int t[] = new int[n];
    		    int k = 0;
    		    //System.out.print(max + " ");
    		    //t[k++] = max;
    		    for(int i = array.length-2;i >= 0;i--){
    		        if(array[i] >= max){
    		            //temp[i] = array[i];
    		            max = array[i];
    		            //t[k++] = max;
    		            //System.out.print(max + " ");
    		        }else{
    		            array[i] = -1;
    		        }
    		        /*else{
    		            temp[i] = max;
    		        }*/
    		    }
    		    for(int i = 0;i<n;i++){
    		        if(array[i]!=-1){
    		            System.out.print(array[i] + " ");
    		        }
    		    }
    		    /*for(int i = k-1;i>=0;i--){
    		           System.out.print(t[i] + " ");
    		    }*/
    		    System.out.println();
		    }
		}
	}
}
