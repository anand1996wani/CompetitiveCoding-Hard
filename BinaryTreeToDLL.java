/*

Given a Binary Tree (BT), convert it to a Doubly Linked List (DLL) In-Place. The left and right pointers in nodes are to be used as previous and next pointers respectively in converted DLL. The order of nodes in DLL must be same as Inorder of the given Binary Tree. The first node of Inorder traversal  (left most node in BT)  must be head node of the DLL.


*/

/* class Node
class Node
{
	Node left, right;
	int data;
	
	Node(int d)
	{
		data = d;
		left = right = null;
	}
	
}*/
// This function should convert a given Binary tree to Doubly
// Linked List
// root --> Root of Binary Tree
// head --> head of created doubly linked list
class BinaryTreeToDLL
{
    Node head;
    Node BToDLL(Node root)
    {
	    //  Your code here
	    Stack<Node> stack = new Stack<Node>();
	    Node temp = root;
	    Node t = null;
	    while(true){
	        while(temp!=null){
	            stack.push(temp);
	            temp = temp.left;
	        }
	        if(temp==null && stack.isEmpty()==false){
	            temp = stack.pop();
	            if(t!=null)
	                t.right = temp;
	            else
	                root = temp;
	            temp.left = t;
	            t = temp;
	            //System.out.println(temp.data);
	            temp = temp.right;
	        }
	        else{
	            t.right = null;
	            break;
	        }
	    }
	    return root;
    }
}