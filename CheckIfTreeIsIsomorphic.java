/*

Question :

Write a function to detect if two trees are isomorphic. Two trees are called isomorphic if one of them can be obtained from other by a series of flips,
i.e. by swapping left and right children of a number of nodes. Any number of nodes at any level can have their children swapped.
Two empty trees are isomorphic.

*/

/*Complete the function below
Node is as follows:
class Node{
	int data;
	Node left,right;
	Node(int d){
		data=d;
		left=right=null;
	}
}
*/
class CheckIfTreeIsIsomorphic
{
	public boolean isIsomorphic(Node root1,Node root2)
    {
         //add code here.
        if(root1!=null && root2!=null){
            if(root1.data==root2.data){
                boolean l1 = false,r1 = false,l2 = false,r2 = false;
                l1 = this.isIsomorphic(root1.left,root2.left);
                r1 = this.isIsomorphic(root1.right,root2.right);
                l2 = this.isIsomorphic(root1.left,root2.right);
                r2 = this.isIsomorphic(root1.right,root2.left);
                return (l1 && r1) || (l2 && r2);
            }
            else{
                return false;
            }
        }
        else if(root1==null && root2==null){
            return true;
        }
        else{
            return false;
        }
	}
}
