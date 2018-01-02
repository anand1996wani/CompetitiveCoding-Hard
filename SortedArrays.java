/*

Sorted Arrays

Alice has recently found an array a containing N integers. 
As we all know Alice loves sorted array so, he wants to sort the array. 
To sort an array Alice can add 1 to any integer in the array in 1 move.
Alice wants to find minimum number of moves needed to sort this array. 
Remember that after sorting the array, all elements in it should be distinct.

INPUT CONSTRAINTS
1≤N≤105
1≤ai≤106

INPUT FORMAT
First line of input contains a single integer N.
Second line of input contains N space separated inegers, elements of array a.

OUTPUT FORMAT
Output a single integer, denoting number of moves needed to sort the given array.


*/
import java.util.Scanner;
class SortedArrays {
    public static void main(String args[] ) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int []array = new int[n];
        for(int i = 0;i<n;i++){
            array[i] = scanner.nextInt();
        }
        long cost = 0;
        for(int i = 1;i<n;i++){
            if(array[i] <= array[i-1]){
                cost = cost + Math.abs(array[i] - array[i-1]) + 1;
                array[i] = array[i] + Math.abs(array[i] - array[i-1]) + 1;     
            }
        }
        System.out.println(cost);
    }
}
