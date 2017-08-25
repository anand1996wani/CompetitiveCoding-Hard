/*

Given a Binary Tree and a sum s, your task is to check whether there is a root to leaf path in that tree with the following sum . You are required to complete the function hasPathSum. You should not read any input from stdin/console. There are multiple test cases. For each test case, this method will be called individually.

/*
// A Binary Tree node
class Node
{
    int data;
    Node left, right;
    Node(int item)
    {
        data = item;
        left = right = null;
    }
} */
class GfG
{
    /*you are required to complete this function */
    boolean hasPathSum(Node node, int sum)
    {
        // Your code here
        int s = node.data;
        if(s < sum){
            boolean left = false,right = false;
            if(node.left!=null){
                left = this.hasPath(node.left,sum,s);
            }
            if(node.right!=null){
                right = this.hasPath(node.right,sum,s);
            }
            return left || right;
        }
        else if(s==sum && node.left==null && node.right==null)
            return true;
        else if(s > sum)
            return false;
        else
            return false;
        
    }
    public boolean hasPath(Node node,int sum,int s){
        if(node.left!=null || node.right!=null){
            if((s + node.data) >= sum)
                return false;
            else{
                s = s + node.data;
                boolean left = false,right = false;
                if(node.left!=null){
                    left = this.hasPath(node.left,sum,s);
                }
                else if(node.right!=null){
                    right = this.hasPath(node.right,sum,s);
                }
                return left || right;
            }
        }
        else{
            if((s + node.data)==sum)
                return true;
            else
                return false;
        }
    }
}
