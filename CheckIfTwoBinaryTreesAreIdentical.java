/*Question :

Given two binary trees, your task is to find if both of them are identical or not.

Answer :
 
/*
boolean isIdentical(Node root1,Node root2){
	if (root1==null  && root2==null)
    		return true;
    	else if(root1==null && root2!=null)
    		return false;
    	else if(root2==null && root1!=null)
    		return false;
    	else{
    		boolean left = false,right = false;
    		if(root1.data==root2.data){
    			left = isIdentical(root1.left,root2.left);
    			right = isIdentical(root1.right,root2.right);
    			return left && right;
    		}
    		else
    			return false;	
    	}
}