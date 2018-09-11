/*
Reorder List

Given a singly linked list: A0→A1→…→An-1→An,
reorder it to: A0→An→A1→An-1→A2→An-2→…

Given 1->2->3->4->5 its reorder is 1->5->2->4->3.

It is recommended do this in-place without altering the nodes' values.

Input:

In this problem, method takes one argument: Address of the head of the linked list. 
The function should not read any input from stdin/console.
The node structure has a data part which stores the data and a next pointer which points to the next element of the linked list. 
There are multiple test cases. For each test case, this method will be called individually.

Output:

Reorder it as explained above.

Constraints:

1<=T<=200
1<=N<=200

Example:

Input:

2
3
1 2 3
4
1 7 3 4

Output:

1 3 2
1 4 7 3

*/

class gfg
{
    Node reorderlist(Node head)
    {
        // Your code here
        if(head.next!=null){
            Node temp1 = head;
            Node temp = head;
            Node prev = null;
            int c = 1;
            // Divide the link list in two half
            while(temp1!=null){
                temp1 = temp1.next;
                if(c%2==0){
                    prev = temp;
                    temp = temp.next;
                }
                c++;
            }
            prev.next = null;
            Node head2 = new Node(temp.data);
            head2.next = temp.next;
            
            //LinkList Reverse Code
            prev = null;
            while(temp!=null){
                Node an = temp.next;
                temp.next = prev;
                prev = temp;
                temp = an;
            }
            head2 = prev;
            
            //Mearging Head and Head2
            temp = head;
            prev = head2;
            
            while(temp!=null){
                Node an = temp.next;
                Node ab = prev.next;
                temp.next = prev;
                if(an!=null)
                    prev.next = an;
                temp = an;
                prev = ab;
            }
        }
        //System.out.println(temp.data);
        return head;
    }
}
