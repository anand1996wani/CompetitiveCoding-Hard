/*
Killjee and simple problem

killjee has an array A containing N integers. 
You need to find number of distinct values which are there in a special list prepared by Killjee using array A.
Special list of killjee contains sum of subarrays of array A.

Sum of subarray is sum of all elements in subarray
INPUT CONSTRAINTS
1=N=1000
1=ai=109

INPUT FORMAT
First line of input contains a single integer N, Next line contains N space separated integer Ai.

OUTPUT FORMAT
Print answer to the problem.

*/
import java.util.*;
class KilljeeAndSimpleProblem {
    public static void main(String args[] ) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long []array = new long[n];
        for(int i = 0;i<n;i++){
            array[i] = scanner.nextLong();
        }
        long sum = 0;
        Hashtable hashtable = new Hashtable();
        for(int i = 0;i<n;i++){
            sum = 0;
            for(int j = i;j<n;j++){
                sum = sum + array[j];
                if(hashtable.containsKey(sum)==false)
                    hashtable.put(sum,1);
            }
        }
        System.out.println(hashtable.size());
    }
}
