/*

Two of the nodes of a Binary Search Tree (BST) are swapped. Fix (or correct) the BST.

Input:

First line consists of T test cases. First line of every test case consists of N, denoting number of elements in BST. Second line of every test case consists 3*N elements 2 integers and a character.

Note: It is guaranteed than the given input will form BST ,except for 2 nodes that will be wrong.

Output:
Return the fixed BST.

Constraints:
1<=T<=100
1<=N<=100

Example:
Input:
1
4
10 5 L 10 8 R  5 2 L 5 20 R 
Output:
1

*/

class GfG{
    public Node correctBST(Node root){
        Node temp = root;
        Stack<Node> stack = new Stack<Node>();
        Node prev = null;
        Node first = null;
        Node middle = null;
        Node last = null;
        int flag = 0;
        while(true){
            while(temp!=null){
                stack.push(temp);
                temp = temp.left;
            }
            if(stack.isEmpty()!=true){
                temp = stack.pop();
                if(prev!=null && temp.data < prev.data && flag == 0){
                    first = prev;
                    middle = temp;
                    flag = 1;
                }else if(prev!=null && temp.data < prev.data && flag == 1){
                    middle = prev;
                    last = temp;
                }
                //System.out.println(temp.data);
                prev = temp;
                temp = temp.right;
            }else{
                break;
            }
        }
        int an = first.data;
        first.data = middle.data;
        middle.data = an;
        return root;
    }
}
