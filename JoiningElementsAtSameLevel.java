/*

Question

Write a function to connect all the adjacent nodes at the same level in a binary tree. Structure of the given node is 

struct Node{
	int data;
	Node *left;
	Node *right;
	Node *nextRight;	
}

Answer

Assuming that tha data is greater than zero in each node

*/

class JoiningElementsAtSameLevel
{
    void connect(Node root)
    {
        // Your code here
        if(root!=null){
		    Queue <Node> q = new LinkedList<Node>();
		    Node n = new Node(-1);
		    Node prev = null;
		    q.add(root);
		    q.add(n);
		    while(q.isEmpty()==false){
			    Node temp = q.remove();
			    if(temp!=n){
				    if(temp.left!=null)
					    q.add(temp.left);
				    if(temp.right!=null)
					    q.add(temp.right);
				    if(prev!=null)
					    prev.nextRight = temp;
				    prev = temp;	
			    }
			    else{
				    if(q.isEmpty()==true){
					    prev.nextRight = null;
					    break;
				    }    
				    else{
					    q.add(n);
					    prev.nextRight = null;
					    prev = null;	
				    }
			    }	
		    }
	    }	
    }
}