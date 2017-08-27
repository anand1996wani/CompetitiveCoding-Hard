/*

Question :

Given 2 Arrays of Inorder and preorder traversal. Construct a tree and print the Postorder traversal. 


*/

/*Complete the code here.
Node is as follows:
struct Node
{
  int data;
  Node* left;
  Node* right;
};
*/

Node* buildTree(int in[],int pre[], int inStrt, int inEnd){
    //add code here.
    static int preIndex = 0;
    if(inStrt > inEnd)
        return NULL;
    Node *new_node = new Node();
    new_node->data = pre[preIndex];
    if(inStrt == inEnd)
        return new_node;
    int index;
    for(int i = inStrt;i<=inEnd;i++){
        if(in[i]==new_node->data){
            index = i;
            break;
        }
    }
    preIndex++;
    new_node->left = buildTree(in,pre,inStrt,index - 1);
    new_node->right = buildTree(in,pre,index + 1,inEnd);
    return new_node;
}
