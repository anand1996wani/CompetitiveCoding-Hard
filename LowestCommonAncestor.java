Question

Given a Binary Tree and 2 nodes values n1 and n2, your task is to find the lowest common ancestor of the two nodes. You are required to complete the function LCA.

Answer :

class GfG
{
	Node LCA(Node root, int n1,int n2)
	{
		// Your code here
	    if(root.data==n1 || root.data==n2)
		    return root;
	    Node left=null,right=null;
	    if(root.left!=null)
		    left = LCA(root.left,n1,n2);
	    if(root.right!=null)
		    right = LCA(root.right,n1,n2);
	    if(left==null && right==null)
		    return null;
	    else if(left!=null && right!=null)
		    return root;
	    else if(left!=null)
		    return left;
	    else
		    return right;
    }
}