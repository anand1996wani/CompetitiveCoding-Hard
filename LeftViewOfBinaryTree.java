/*

Given a Binary Tree, print Left view of it. Left view of a Binary Tree is set of nodes visible when tree is visited from Left side.

Left view of following tree is 1 2 4 8

          1
       /     \
     2        3
   /     \    /    \
  4     5   6    7
   \
     8

            

Input:
The task is to complete the method which takes one argument, root of Binary Tree. 
There are multiple test cases. For each test case, this method will be called individually.

Output:
The function should print nodes in left view of Binary Tree.

Constraints:
1 <=T<= 100
1 <= Number of nodes<= 100
1 <= Data of a node<= 1000

Example:
Input:
2
2
1 2 R 1 3 L
4
10 20 L 10 30 R 20 40 L 20 60 R

Output:
1 3
10 20 40

There are two test casess.  First case represents a tree with 3 nodes and 2 edges where root is 1, left child of 1 is 3 and right child of 1 is 2.   
Second test case represents a tree with 4 edges and 5 nodes.

*/

/* A Binary Tree node
class Node
{
    int data;
    Node left, right;
    Node(int item)
    {
        data = item;
        left = right = null;
    }
}*/

class GfG
{
    void leftView(Node root)
    {
      // Your code here
      Queue <Node>queue = new LinkedList<Node>();
      Node temp = new Node(-1);
      queue.add(root);
      queue.add(temp);
      boolean flag = false;
      System.out.print(root.data);
      System.out.print(" ");
      while(true){
          Node curr = queue.remove();
          if(curr.data==temp.data){
              if(queue.isEmpty()==true)
                break;
              else{
                flag = true;
                queue.add(temp);
              }
          }else{
            if(flag==true){
                System.out.print(curr.data);
                System.out.print(" ");
                flag = false;
            }
            if(curr.left!=null)
                queue.add(curr.left);
            if(curr.right!=null)
                queue.add(curr.right);
          }
      }
    }
}
