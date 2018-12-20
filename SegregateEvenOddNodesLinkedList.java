/*package whatever //do not write package name here */
/*

Given a Linked List of integers, write a function to modify the linked list such that all even numbers appear before all the odd numbers in the modified linked list. Also, keep the order of even and odd numbers same.

Input:

The first line of input contains an integer T denoting the number of test cases.
The first line of each test case is N,N is the number of elements in Linked List.
The second line of each test case contains N input,elements in Linked List.

Output:

Print the all even numbers then odd numbers in the modified Linked List.

Constraints:

1 ≤ T ≤ 100
1 ≤ N ≤ 100
1 ≤ size of elements ≤ 1000

Example:

Input
3
7
17 15 8 9 2 4 6
4
1 3 5 7
7
8 12 10 5 4 1 6

Output
8 2 4 6 17 15 9
1 3 5 7
8 12 10 4 6 5 1

*/



import java.util.*;
import java.lang.*;
import java.io.*;

class Node{
    public int data;
    public Node next;
    public Node(){
        this.data = 0;
        this.next = null;
    }
}

class GFG {
	public static void main (String[] args) {
		//code
		Scanner scanner = new Scanner(System.in);
		int test = scanner.nextInt();
		for(int an = 0;an < test;an++){
		    int n = scanner.nextInt();
		    int array[] = new int[n];
		    Node head = new Node();
		    head.data = scanner.nextInt();
		    Node temp = head;
		    for(int i = 1;i < n;i++){
		        Node newNode = new Node();
		        newNode.data = scanner.nextInt();
		        temp.next = newNode;
		        temp = temp.next;
		    }
		    Node newHead = new Node();
		    newHead.next = head;
		    temp = newHead;
		    Node odd = new Node();
		    Node temp1 = odd;
		    Node prev = newHead;
		    while(temp!=null){
		        if(temp.data%2!=0){
		            temp1.next = temp;
		            prev.next = temp.next;
		            temp.next = null;
		            temp = prev.next;
		            temp1 = temp1.next;
		        }else{
		            prev = temp;
		            temp = temp.next;
		        }
		    }
		    Node a = newHead.next;
		    Node b = odd;
		    if(a!=null){
    		    while(a.next!=null){
    		        System.out.print(a.data + " ");
    		        a = a.next;
    		    }
    		    //System.out.print(a.data + " ");
    		    a.next = b.next;
		        //System.out.println();
		        while(a!=null){
		            System.out.print(a.data + " ");
		            a = a.next;
		        }
		        System.out.println();
		    }else{
		        a = b.next;
		        while(a!=null){
		            System.out.print(a.data + " ");
		            a = a.next;
		        }
		        System.out.println();
		    }
		}
	}
}
