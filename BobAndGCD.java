/*

Bob And GCD

Bob has an array A of size N. He doesn't like arrays in which the GCD of all elements is not K. 
He can perform multiple operations on an array. 
In each operation, he can either increase or decrease the value of an element by 1.

You have to tell the minimum operation Bob will take to make GCD of all elements in an array equal to K or any multiple of K?
GCD here is Greatest Common Divisor.

Input Format

The first line contains T, the number of test cases.

For Each Testcase :
The first line contains 2 integers - K and N respectively, separated by a space.
The second line contains N integers, separated by a space, in order of their position in array.

Input Constraints

1=T=10
1=N=106
1=A[i]=106
1=K=106

Output Format

For each test case, print minimum number of operations Bob take in a new line.

*/

import java.util.*;
class BobAndGCD {
    public static void main(String args[] ) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        for(int anand = 0;anand < test;anand++){
            int k = scanner.nextInt();
            int n = scanner.nextInt();
            int []array = new int[n];
            for(int i = 0;i<n;i++){
                array[i] = scanner.nextInt();
            }
            long sum = 0;
            for(int  i = 0;i<n;i++){
                    if(array[i] < k){
                        sum = sum + k - array[i];    
                    }else{
                        int lower = array[i]%k;
                        int higher = k - lower;
                        if(lower <= higher){
                            sum = sum + lower;
                        }
                        else{
                            sum = sum + higher;
                        }
                    }
            }
            System.out.println(sum);
        }
    }
}
