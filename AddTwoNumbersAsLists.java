/*
You are given two linked lists representing two non-negative numbers. 
The digits are stored in reverse order and each of their nodes contain a single digit. 
Add the two numbers and return it as a linked list.

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8

    342 + 465 = 807
Make sure there are no trailing zeros in the output list
So, 7 -> 0 -> 8 -> 0 is not a valid response even though the value is still 807.

 NOTE: You only need to implement the given function. Do not read input, instead use the arguments to the function.
 Do not print the output, instead return values as specified. Still have a doubt? Checkout Sample Codes for more details. 


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
    public ListNode addTwoNumbers(ListNode A, ListNode B) {
        int la = 0,lb = 0;
        ListNode a = A;
        ListNode b = B;
        while(a!=null){
            la++;
            a = a.next;
        }
        while(b!=null){
            lb++;
            b = b.next;
        }
        if(la >= lb){
            a = A;
            b = B;
        }else{
            a = B;
            b = A;
        }
        ListNode prev = null;
        int carry = 0;
        while(a!=null && b!=null){
            a.val = a.val + b.val + carry;
            carry = 0;
            if(a.val > 9){
                a.val = a.val%10;
                carry = 1;
            }
            prev = a;
            a = a.next;
            b = b.next;
        }
        while(a!=null){
            a.val = a.val + carry;
            carry = 0;
            if(a.val > 9){
                a.val = a.val%10;
                carry = 1;
            }
            prev = a;
            a = a.next;
        }
        if(carry==1){
            ListNode temp = new ListNode(1);
            prev.next = temp;
        }
        if(la >= lb){
            return A;
        }else{
            return B;
        }
    }
}
