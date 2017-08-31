/*

Questions :

Given an array of distinct integers and a sum value. Find count of triplets with sum smaller than given sum value.

Note: Expected time complexity O(n^2).


*/


import java.util.*;
import java.lang.*;
import java.io.*;
class CountTriplets
 {
	public static void main (String[] args)
	 {
	    //code
	    Scanner s = new Scanner(System.in);
	    int test = s.nextInt();
	    for(int anand = 0;anand < test;anand++){
	        int n = s.nextInt();
	        int sum = s.nextInt();
	        int[] array = new int[n];
	        for(int i = 0;i < n;i++){
	            array[i] = s.nextInt();
	        }
	        Arrays.sort(array);
	        int j,k;
	        int count = 0; 
	        for(int i = 0; i < array.length - 2;i++){
	            j = i + 1;
	            k = array.length - 1;
	            while(j < k){
	                if(array[i] + array[j] + array[k] < sum){
	                    count += k - j;
	                    j++;
	                }
	                else{
	                    k--;
	                }
	            }
	        }
	        System.out.println(count);
	    }
	 }
}
