/*
A Game of Numbers

You are given an array A[] of N integers. Now, two functions F(X) and G(X) are defined:

F(X) : This is the smallest number Z such that X<Z=N and A[X]   < A[Z]

G(X) : This is the smallest number Z such that X<Z=N and A[X]>    A[Z]

Now, you need to find for each index i of this array G(F(i)), where 1=i=N .
If such a number does not exist, for a particular index i, output -1 as its answer. 
If such a number does exist, output A[G(F(i))]

Input :

The first line contains a single integer N denoting the size of array A[]. 

Each of the next N lines contains a single integer, where the integer on the ith line denotes A[i].

Output :

Print N space separated integers on a single line, where the ith integer denotes A[G(F(i))] or -1, if G(F(i)) does not exist.

Constraints:

1=N=30000
0=A[i]=1018

*/
import java.util.*;
class NumberGame {
    public int F(int a,int []array){
        for(int i = a;i<array.length;i++){
            if(array[a] < array[i])
                return i;
        }
        return -1;
    }
    public int G(int a,int []array){
        if(a!=-1){
            for(int i = a;i<array.length;i++){
                if(array[a] > array[i])
                    return i;
            }
            return -1;
        }
        else{
            return -1;
        }
    }
    public static void main(String args[] ) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n  = scanner.nextInt();
        int []array = new int[n];
        for(int i = 0;i<n;i++){
            array[i] = scanner.nextInt();
        }
        TestClass t = new TestClass();
        for(int i = 0;i<n;i++){
            int temp = t.G(t.F(i,array),array);
            if(temp!=-1){
                System.out.print(array[temp]);
            }
            else{
                System.out.print(-1);
            }
            System.out.print(" ");
        }
        System.out.println();
    }
}
