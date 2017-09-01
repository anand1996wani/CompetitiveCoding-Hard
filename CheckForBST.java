/*

Question :

Given a binary tree, return true if it is BST, else false. 

*/


/*  A Binary Search Tree node
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
class CheckForBST
{
    int isBST(Node root)  
    {
        // Your code here
        int t = -1;
        if(root!=null){
            Stack <Node> stack = new Stack<Node>();
            Node curr = root;
            while(true){
                while(curr!=null){
                    stack.push(curr);
                    curr = curr.left;
                }
                if(curr==null && stack.isEmpty()!=true){
                    Node temp  = stack.pop();
                    if(t < temp.data){
                        t = temp.data;    
                    }
                    else{
                        return 0;
                    }
                    curr = temp.right;
                }
                else{
                    break;
                }
            }
            return 1;
        }
        else{
            return 1;
        }
    }
}
