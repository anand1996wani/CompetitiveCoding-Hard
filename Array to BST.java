/*

Given a sorted array. Write a program that creates a Balanced Binary Search Tree using array elements.
If there are n elements in array, then floor(n/2)'th element should be chosen as root and same should be followed recursively.

Input:

The first line of input contains an integer T denoting the number of test cases.
The first line of each test case is N,N is the size of array.
The second line of each test case contains N input A[].

Output:

Print the preorder traversal of constructed BST.

Constraints:

1 ≤ T ≤ 100
1 ≤ N ≤ 1000
1 ≤ A[] ≤ 10000

Example:

Input:
1
7
1 2 3 4 5 6 7

Output:
4 2 1 3 6 5 7 

*/

/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class node{
    public node left;
    public node right;
    public int data;
    public node(int data){
        left = null;
        right = null;
        this.data = data;
    }
}

class GFG {
    public node myFun(int array[],int low,int high){
        if(low <= high){
            int mid = (int)((low + high)/2);
            node newNode = new node(array[mid]);
            newNode.left = this.myFun(array,low,mid - 1);
            newNode.right = this.myFun(array,mid + 1,high);
            return newNode;
        }else{
            return null;
        }
    }
    
    public void preOrder(node root){
        if(root!=null){
            System.out.print(root.data);
            System.out.print(" ");
            this.preOrder(root.left);
            this.preOrder(root.right);
        }
    }
    
	public static void main (String[] args) {
		//code
		Scanner scanner = new Scanner(System.in);
		int test = scanner.nextInt();
		for(int j = 0;j < test;j++){
		    int n = scanner.nextInt();
		    int array[] = new int[n];
		    for(int k = 0;k < n;k++){
		        array[k] = scanner.nextInt();    
		    }
		    int low = 0,high = n - 1;
		    int mid = (int)((low + high)/2);
		    node btree = new node(array[(int)((low + high)/2)]);
		    GFG gfg = new GFG();
		    btree.left = gfg.myFun(array,low,mid - 1);
		    btree.right = gfg.myFun(array,mid + 1,high);
		    gfg.preOrder(btree);
		    System.out.println();
		}
	}
}
