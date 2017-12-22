/*
Special Array Conversion

You are given an array A.
Now you need to convert this array into special array which has the following characteristics.
1. All prime numbers come before all non prime numbers in the special array even if they are greater
2. All prime numbers are sorted in increasing order
3. All non prime numbers are sorted in decreasing order

For example let the array A is 1,4,3,2,6 then the array after special sorting will become 2,3,6,4,1. 
Note that 1 is not a prime number. 
Here 2 and 3 are prime so they are sorted in increasing order and 6,4,1 are non prime so they are sorted in decreasing order. 
Also all the prime numbers come before non prime.

Input
First line contains an integer N
as input denoting total elements in the array A. 
Next line contains N space separated integers that denotes the element of array A.

Output
In the output you need to print the array elements separated by space after it is specially sorted.

Constraints
1=N=105
1=A[i]=106

*/
import java.util.*;
class SpecialArray {
    public boolean checkPrime(int a){
        if(a==1)
            return false;
        else if(a==2)
            return true;
        else{
            for(int i = 2;i <= ((int)(Math.sqrt(a)+1));i++){
                if(a%i==0)
                    return false;
            }
            return true;
        }
    }
    public static void main(String args[] ) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int []array = new int[n];
        for(int i = 0;i<n;i++){
            array[i] = scanner.nextInt();
        }
        TestClass t = new TestClass();
        int p = 0,c = 0;
        int []composite = new int[n];
        int []prime = new int[n];
        for(int i = 0;i<n;i++){
            if(t.checkPrime(array[i])){
                prime[p++] = array[i];    
            }else{
                composite[c++] = array[i];
            }
            //System.out.println(array[i]+" "+t.checkPrime(array[i]));
        }
        Arrays.sort(prime,0,p);
        Arrays.sort(composite,0,c);
        int j = 0;
        for(int i = 0;i<p;i++){
            array[j++] = prime[i];
        }
        for(int i = c-1;i>=0;i--){
            array[j++] = composite[i];
        }
        for(int i = 0;i<j;i++){
            System.out.print(array[i]);
            System.out.print(" ");
        }
        System.out.println();
    }
}
