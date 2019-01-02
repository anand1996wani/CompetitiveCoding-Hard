/*
Given a linked list of 0s, 1s and 2s, sort it.

Input:

Complete the method which takes one argument: the head of the linked list. The program should not read any input from stdin/console.
The struct Node has a data part which stores the data and a next pointer which points to the next element of the linked list. 
There are multiple test cases. For each test case, this method will be called individually.

Output: The function should not print any output to stdin/console.
 

Example:

Input:
1 2 2 1 2 0 2 2

Output:
0 1 1 2 2 2 2 2 

For Testing(format):

1(Test cases)
8(Number of elements in Link List)
1 2 2 1 2 0 2 2 

*/

/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

/*
  Sort the list of 0's,1's and 2's
  The input list will have at least one element  
  Node is defined as 
  class Node {
 int value;
  Node next;
  Node(int value) {
   this.value = value;
  }
}
*/
class GFG
{
    void linksort(Node head)
    {
        //Add code here
        int zero = 0;
        int one = 0;
        int two = 0;
        Node temp = head;
        while(temp!=null){
            if(temp.value==0){
                zero++;
            }else if(temp.value==1){
                one++;
            }else if(temp.value==2){
                two++;
            }
            temp = temp.next;
        }
        temp = head;
        while(zero > 0 || one > 0 || two > 0){
            if(zero > 0){
                temp.value = 0;
                zero--;
            }else if(one > 0){
                temp.value = 1;
                one--;
            }else if(two > 0){
                temp.value = 2;
                two--;
            }
            temp = temp.next;
        }
    }  
}
