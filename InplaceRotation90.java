/*
Given an square matrix, turn it by 90 degrees in anti-clockwise direction without using any extra space.


*/


import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner scanner = new Scanner(System.in);
		int test = scanner.nextInt();
		for(int anand = 0;anand < test;anand++){
		    int n = scanner.nextInt();
		    int array[][] = new int[n][n];
		    for(int i = 0;i < n;i++){
		        for(int j = 0;j < n;j++){
		            array[i][j] = scanner.nextInt();
		        }
		    }
		    for(int i = 0;i < n/2;i++){
		        for(int j = i;j < n-i-1;j++){
		            int temp = array[i][j];
		            
		            array[i][j] = array[j][n - 1 - i];
		            
		            array[j][n - 1 - i] = array[n - 1 - i][n - 1 - j];
		            
		            array[n - 1 - i][n - 1 - j] = array[n - 1 - j][i];
		            
		            array[n - 1 - j][i] = temp;
		           
		        }
		    }
		    for(int i = 0;i < n;i++){
		        for(int j = 0;j < n;j++){
		            System.out.print(array[i][j] + " ");
		        }
		    }
		    System.out.println();
		}
	}
}
