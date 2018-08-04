class GfG{
    void connect(Node root)
    {
        // Your code here
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        Node node = new Node(-1);
        node.left = null;
        node.right = null;
        queue.add(node);
        Node prev = root;
        while(true){
            Node temp = queue.remove();
            if(temp.left!=null){
                queue.add(temp.left);
            }
            if(temp.right!=null){
                queue.add(temp.right);
            }
            if(temp.data==-1 && queue.isEmpty()!=true){
                prev.nextRight = null;
                queue.add(node);
                //System.out.println();
            }else if(temp.data==-1 && queue.isEmpty()==true){
                break;
            }
            else{
                prev.nextRight = temp;
                //System.out.print(temp.data);
                //System.out.print(" ");
            }
            prev = temp;
        }
        //System.out.println("anand");
    }
}
