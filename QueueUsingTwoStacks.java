/*

Question :
Implement a Queue using 2 stacks s1 and s2 .

*/

class QueueUsingTwoStacks
{
    Stack<Integer> s1 = new Stack<Integer>();
    Stack<Integer> s2 = new Stack<Integer>();
    /* The method insert to push element into the queue */
    void insert(int B)
    {
	    // Your code here
	    s1.push(B);
    }
	
    
    /*The method remove which return the element popped out of the queue*/
    int remove()
    {
	    // Your code here
	    if(s1.empty()!=true){
	        int element = 0;
	        while(s1.empty()!=true){
	            element = s1.pop();
	            if(s1.empty()!=true)
	                s2.push(element);
	        }
	        while(s2.empty()!=true){
	            s1.push(s2.pop());
	        }
	        return element;
	    }
	    else{
	        return -1;
	    }
    }
}