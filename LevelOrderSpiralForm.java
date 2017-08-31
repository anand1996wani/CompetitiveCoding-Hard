/*

Question :

Write a function to print spiral order traversal of a tree.


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
}
*/
class LevelOrderSpiralForm
{
      void printSpiral(Node node) 
      {
           // Your code here
           if(node!=null){
               Stack <Node> s1 = new Stack <Node>();
               Stack <Node> s2 = new Stack <Node>();
               s1.push(node);
               boolean flag = true;
               while(s1.isEmpty()!=true || s2.isEmpty()!=true){
                   if(flag){
                       Node temp = s1.pop();
                       System.out.print(temp.data);
                       System.out.print(" ");
                       if(s1.isEmpty()==true){
                           flag = false;
                       }
                       if(temp.right!=null)
                            s2.push(temp.right);
                       if(temp.left!=null)
                            s2.push(temp.left);
                   }
                   else{
                       Node temp = s2.pop();
                       System.out.print(temp.data);
                       System.out.print(" ");
                       if(s2.isEmpty()==true){
                           flag = true;
                       }
                       if(temp.left!=null)
                            s1.push(temp.left);
                       if(temp.right!=null)
                            s1.push(temp.right);
                   }
               }
           }
      }
}
