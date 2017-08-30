/*

Question :

Given an array and a number k where k is smaller than size of array, the task is to find the k’th smallest element in the given array. 
It is given that all array elements are distinct.

*/

import java.util.*;
import java.lang.*;
import java.io.*;
class KsmallestElement
 {
    static void minHeapfy(int[] array,int i,int n){
        int left = 2*i+1,right = 2*i + 2;
        int min = i;
        if(left < n && array[left] < array[i])
            min = left;
        else
            min = i;
        if(right < n && array[right] < array[min])
            min = right;
        if(i!=min){
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
            minHeapfy(array,min,n);
        }
    }
    static void buildMinHeap(int[] array){
        for(int i = array.length-1;i>=0;i--){
            minHeapfy(array,i,array.length);
        }
    }
    static void deleteMin(int []array,int n){
        array[0] = array[n-1];
        n = n - 1;
        minHeapfy(array,0,n);
    }
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
	        int k = s.nextInt();
	        buildMinHeap(array);
	        while(k!=1){
	            deleteMin(array,n);
	            n = n - 1;
	            k = k - 1;
	        }
	        System.out.println(array[0]);
	    }
	 }
}
