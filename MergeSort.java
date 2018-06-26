/*

Given an array, find inversion count of array.

Inversion Count for an array indicates – how far (or close) the array is from being sorted. 
If array is already sorted then inversion count is 0. 
If array is sorted in reverse order that inversion count is the maximum. 
Formally speaking, two elements a[i] and a[j] form an inversion if a[i] > a[j] and i < j.
The sequence 2, 4, 1, 3, 5 has three inversions (2, 1), (4, 1), (4, 3).

Input:

The first line of input contains an integer T denoting the number of test cases.
The first line of each test case is N,N is the size of array.
The second line of each test case contains N input C[i].

Output:

Print the inversion count of array.

Constraints:

1 ≤ T ≤ 100
1 ≤ N ≤ 100
1 ≤ C ≤ 500

Example:

Input:
1
5
2 4 1 3 5

Output:
3

*/

import java.util.*;
import java.lang.*;
import java.io.*;
class MergeSort
 {
    //public static int inversion;
    public static int merge(int array[],int temp[],int low,int mid,int high){
        //int left[] = new int[mid - low + 1];
        //int right[] = new int[high - mid];
        int inversion = 0;
        int n1 = mid - low + 1;
        int n2 = high - mid;
        
        int l = low;
        int r = mid + 1;
        int k = low;
        while((l <= mid)&&(r <= high)){
            if(array[l] <= array[r]){
                temp[k++] = array[l++];
            }
            else{
                temp[k++] = array[r++];
                inversion = inversion +  mid + 1 - l;
            }
        }
        while(l <= mid){
            temp[k++] = array[l++];
        }
        while(r <= high){
            temp[k++] = array[r++];
        }
        for(int i = low;i<=high;i++){
            array[i] = temp[i];
        }
        return inversion;
    } 
    public static int mergeSort(int array[],int temp[],int low,int high){
        int inversion = 0;
        if(low < high){
            int mid = (low + high)/2;
            inversion = inversion + mergeSort(array,temp,low,mid);
            inversion = inversion +  mergeSort(array,temp,mid + 1,high);
            inversion = inversion +  merge(array,temp,low,mid,high);
        }
        return inversion;
    }
	public static void main (String[] args)
	 {
	 //code
	    Scanner scanner = new Scanner(System.in);
	    int test = scanner.nextInt();
	    for(int i = 0;i<test;i++){
	        int n = scanner.nextInt();
	        int array[] = new int[n];
	        for(int j = 0;j<n;j++){
	            array[j] = scanner.nextInt();
	        }
	        /*for(int k = 0;k<n;k++){
	            System.out.print(array[k]);
	            System.out.print(" ");
	        }
	        System.out.println();*/
	        int temp[] = new int[n];
	        int inversion = mergeSort(array,temp,0,n-1);
	        /*for(int k = 0;k<n;k++){
	            System.out.print(array[k]);
	            System.out.print(" ");
	        }*/
	        System.out.println(inversion);
	    }
	 }
}
