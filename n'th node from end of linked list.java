/*

Question :

Given a linked list, the task is to find the n'th node from the end. It is needed to complete a method that takes two argument, 
head of linked list and an integer n. 
There are multiple test cases. 
For each test case, this method will be called individually.


*/


/* Structure of node
class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}
*/

class n'th node from end of linked list 
{
    int getNthFromLast(Node head, int n)
    {
        Node temp = head;
        int count = 0;
        Stack <Integer> stack = new Stack <Integer>();
	    while(temp!=null){
	        stack.push(temp.data);
	        temp = temp.next;
	        count++;
	    }
	    if(count < n)
	        return -1;
	    else{
	        int k = 1;
	        while(stack.isEmpty()!=true && k!=n){
	            stack.pop();
	            k++;
	        }
	        return stack.peek();
	    }
	    
    }
}
	
