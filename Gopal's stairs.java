/*
Gopal is climbing the stairs. He can jump 1 or 2 or 3 steps at a time. He wants to climb N steps. In how many ways can he reach the Nth step? As the answer can be too large Output it modulo 109+7.

Input:
First line of the input contains an integer T denoting the number of test cases. Then T lines follow each line containing an integer N.

Output:
Output the required answer in a new line for each test case.

Constraints:
1<=N<=105

Sample Input

2
3
4
Sample Output
4
7
Explanation:
Test case: 2
There 7 ways of reaching 4th step in the stairs:-

1+1+1+1
1+1+2
1+2+1
2+1+1
1+3
3+1
2+2

*/

/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
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
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        long array[] = new long[100005];
        array[0] = 1;
        array[1] = 1;
        array[2] = 2;
        array[3] = 4;
        for(int i = 3;i<100005;i++){
            array[i] = (array[i-1] + array[i-2] + array[i-3])%(1000000007);
        }
        for(int an = 0;an < test;an++){
            int n = scanner.nextInt();
            System.out.println((int)array[n]);
        }
    }
}
