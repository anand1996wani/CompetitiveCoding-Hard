/*

Question :

Given an array containing both negative and positive integers. Find the contiguous sub-array with maximum sum.


*/


import java.util.*;
import java.lang.*;
import java.io.*;

class Kadane'sAlgorithm {
	public static void main (String[] args) {
		//code
		Scanner s = new Scanner(System.in);
		int text = s.nextInt();
		for(int anand = 0;anand < text;anand++){
		    int n = s.nextInt();
		    int[] array = new int[n];
		    for(int i = 0;i<n;i++){
		        array[i] = s.nextInt();
		    }
		    int max = array[0];
		    int sum = array[0];
		    for(int i = 1;i<n;i++){
		        max = Math.max(array[i],array[i] + max);
		        sum = Math.max(max,sum);
		    }
		    System.out.println(sum);
		}
	}
}
