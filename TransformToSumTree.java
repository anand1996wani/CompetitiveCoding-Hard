/*

Question :

Given a Binary Tree where each node has positive and negative values. Convert this to a tree where each node contains the sum of the left and right sub trees in the original tree. The values of leaf nodes are changed to 0.

*/

/*Complete the Given Function
Node is as follows:
class Tree{
int data;
Tree left,right;
Tree(int d){
	data=d;
	left=null;
	right=null;
}
}*/


class TransformToSumTree{
    public int Sum(Tree tree){
        if(tree.left!=null || tree.right!=null){
            int left = 0,right = 0;
            if(tree.left!=null)
                left = this.Sum(tree.left);
            if(tree.right!=null)
                right = this.Sum(tree.right);
            int t = tree.data + left + right;
            tree.data = left + right;
            return t;
        }
        else{
            int temp =  tree.data;
            tree.data = 0;
            return temp;
        }
    }
    public void toSumTree(Tree root){
         //add code here.
         int left = 0,right = 0;
         left = this.Sum(root.left);
         right = this.Sum(root.right);
         root.data = left + right;
    }
}