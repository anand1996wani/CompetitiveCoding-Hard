/*
Given a singly linked list, determine if its a palindrome. Return 1 or 0 denoting if its a palindrome or not, respectively.


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
    public int lPalin(ListNode A) {
        ListNode one = null;
        ListNode two = null;
        int length = 0;
        ListNode temp = A;
        while(temp!=null){
            length++;
            temp = temp.next;
        }
        int l = length;
        length = (int)(length/2);
        one = A;
        two = A;
        while(length!=0){
            two = two.next;
            length--;
        }
        if(l%2!=0){
            two = two.next;
        }
        //System.out.println(two.val);
        int flag = 1;
        temp = two;
        ListNode prev = null;
        while(temp!=null){
            ListNode t = temp.next;
            temp.next = prev;
            prev = temp;
            temp = t;
        }
        two = prev;
        //System.out.println(two.val);
        while(one!=null && two!=null){
            if(one.val!=two.val){
                flag = 0;
                break;
            }
            one = one.next;
            two = two.next;
        }
        return flag;
    }
}
