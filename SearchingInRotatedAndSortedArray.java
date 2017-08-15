/*
Question :

Given an sorted and rotated array (rotated at some point) A[ ], and given an element K, the task is to find the index of the given element K in the array A[ ]. The array has no duplicated elements. If the element does not exist in array, print -1.

Answer :
/*
import java.util.*;
import java.lang.*;
import java.io.*;

class SearchingInRotatedAndSortedArray{
	public static void main(String args[]){
		//Scanner s = new Scanner(System.in);
		int test = s.nextInt();
		for(int a = 0;a<test;a++){
			int n = s.nextInt();
			int k = s.nextInt();
			int []array = new int[n];
			SearchingInRotatedAndSortedArray search = new SearchingInRotatedAndSortedArray();
			int p = search.findPivot(array,n);
			System.out.print("Pivot is : ");
			System.out.println(p);
			int z=-1,z1=-1;
			if(p==-1)
				z = search.binarySearch(array,0,n-1,k);
			else{
				z = search.binarySearch(array,0,p,k);
				z1 = search.binarySearch(array,p+1,n-1,k);
			}
			if(z != -1)
				System.out.println(z);
			else if(z1 != -1)
				System.out.println(z1);
			else
				System.out.println(-1);
		}
	}
	public int findPivot(int array[],int n){
		int low = 0,high = n - 1,mid;
		//mid = (low + high)/2;
		boolean flag = false;
		while(low < high){
		    mid = (low + high)/2;
			if(array[mid] > array[mid + 1])
				return mid;
			if(array[mid - 1] > array[mid])
				return mid - 1;
			if(array[low] > array[mid])
				high = mid - 1;
			else
				low = mid + 1;
		}
		return -1;
	}
	public int binarySearch(int array[],int low,int high,int k){
		int mid;
		mid = (low + high)/2;
		while(low <= high){
			if(array[mid]==k)
				return mid;
			else if(array[mid] < k)
				low = mid + 1;
			else
				high = mid - 1;
			mid = (low + high)/2;
		}
		return -1;
	}

}