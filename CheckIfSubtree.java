Question

Given two binary trees, the task is to complete function isSubtree, which takes two argument. First argument to the function is root of binary tree T1 and Second argument is root of tree T2. Check if the  tree T2 is subtree of the  tree T1.
A subtree of a tree T1 is a tree T2 consisting of a node in T1 and all of its descendants in T1.

Answer

boolean CheckIfSubtree(node root1,node root2){
	if(root1==null && root2==null)
		return true;
	else if(root1==null)
		return false;
	else if(root2==null)
		return false;
	boolean left = false,right = false;
	if(root1.data==root2.data){
		return CheckIfSubtree(root1.left,root2.left) && CheckIfSubtree(root1.right,root2.right);
	}
	else{
		left = CheckIfSubtree(root1.left,root2);
		right = CheckIfSubtree(root1.right,root2);
		return left || right;	
	}
}