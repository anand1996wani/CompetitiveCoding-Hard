/*

Question :

Given an array of positive integers, find the number of contiguous subarrays such that the product of the elements of the subarray is less than or equal to 
a given positive integer k.

Complexity : O(n)

*/


/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CountSubArray
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s = new Scanner(System.in);
		int test = s.nextInt();
		for(int anand = 0;anand < test;anand++){
		    int n = s.nextInt();
		    int k = s.nextInt();
		    int[] array = new int[n];
		    for(int i = 0;i < n;i++){
		        array[i] = s.nextInt();
		    }
		    int count = 0;
		    int j = 0;
		    int temp = 1;
		    int i = 0;
		    int length = 0;
		    for(i = 0;i<array.length;i++){
		        temp = temp * array[i];
		        if(temp > k){
		            length = i - j;
		            count = count + (int)((length*(length + 1))/2);
		            j = i;
		            temp = array[i];
		            //System.out.println(temp);
		        }
		    }
		    if(temp < k){
		        length = i - j;
		        //System.out.println(j);
		        count = count + (int)((length*(length + 1))/2);
		    }
		    System.out.println(count);
		}
	}
}
