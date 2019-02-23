/*

Remove Duplicates from Sorted List II
Asked in:  
Microsoft
VMWare
Given a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list.

For example,
Given 1->2->3->3->4->4->5, return 1->2->5.
Given 1->1->1->2->3, return 2->3.

*/
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode A) {
        ListNode head = null;
        ListNode temp = A;
        ListNode prev = temp;
        ListNode a = null;
        int val = 0;
        int count = 1;
        while(temp!=null){
            if(temp==A){
                val = temp.val;
                //count++;
            }else if(temp.val!=val){
                val = temp.val;
                if(count == 1){
                    if(head==null){
                        head = prev;
                        a = head;
                    }else{
                        a.next = prev;
                        a = a.next;
                    }
                } 
                count = 1;
            }else{
                count++;
            }
            prev = temp;
            temp = temp.next;
        }
        if(a!=null){
            if(count==1)
                a.next = prev;
            else
                a.next = temp;
        }else if(count==1){
            head = prev;
        }
        return head;
    }
}

