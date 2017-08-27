/*

Question :

Implement a Stack using 2 queue q1 and q2 .


*/

class StackUsingTwoQueues
{
    Queue<Integer> q1 = new LinkedList<Integer>();
    Queue<Integer> q2 = new LinkedList<Integer>();
    
    /*The method pop which return the element poped out of the stack*/
    int pop()
    {
	    // Your code here
	    if(q1.isEmpty()==false){
    	    int element = 0;
    	    while(q1.isEmpty()!=true){
    	        element = q1.remove();
    	        if(q1.isEmpty()==true)
    	            break;
    	        else
    	            q2.add(element);
    	    }
    	    while(q2.isEmpty()!=true){
    	        q1.add(q2.remove());
    	    }
    	    return element;
	    }
	    else{
	        return -1;
	    }
    }
	
    /* The method push to push element into the stack */
    void push(int a)
    {
	    // Your code here
	    q1.add(a);
    }
}