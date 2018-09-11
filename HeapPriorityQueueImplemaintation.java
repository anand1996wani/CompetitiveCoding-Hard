/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
  Heap Priority Queue Implemaintation

 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;
*/

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        */

        // Write your code here
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>();
        PriorityQueue<Integer> maxPriorityQueue = new PriorityQueue<Integer>(Collections.reverseOrder());
        for(int an = 0;an < test;an++){
            int t = scanner.nextInt();
            if(t==1){
                int x = scanner.nextInt();
                priorityQueue.add(x);
                maxPriorityQueue.add(x);
                //System.out.println("Element added");
            }else if(t==2){
                int x = scanner.nextInt();
                if(priorityQueue.remove(new Integer(x))==false){
                    System.out.println(-1);
                }
                if(maxPriorityQueue.remove(new Integer(x))==false){
                    //System.out.println(-1);
                }
            }else if(t==3){
                //Maximum
                if(maxPriorityQueue.peek()!=null){
                    System.out.println(maxPriorityQueue.peek());
                }else{
                    System.out.println(-1);
                }
            }else if(t==4){
                //Minimum
                if(priorityQueue.peek()!=null){
                    System.out.println(priorityQueue.peek());
                }else{
                    System.out.println(-1);
                }
            }
        }
        
    }
}
