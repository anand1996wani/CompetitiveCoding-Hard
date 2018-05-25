/*

Binary Swap

You are given two binary strings A and B of equal length. 
You have a type of opertion in which you can swap any two elements of string B. 
Your task is to find the minimum number of operations required to convert string B into string A. If it is not possible, print -1.

Input Format:
First line contains string A.

Second line contains string B.

Output Format:
Print the minimum number of operations required to convert string B into string A. 
If it is not possible, print -1.

*/


import java.util.*;

class BinarySwap{
    public static void main(String args[] ) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String A = scanner.next();
        String B = scanner.next();
        char a[] = new char[A.length()];
        char b[] = new char[B.length()];
        a = A.toCharArray();
        b = B.toCharArray();
        int a_1 = 0,a_0 = 0,b_1 = 0,b_0 = 0;
        int diff = 0;
        for(int i = 0;i < a.length;i++){
            if(a[i]=='1')
                a_1++;
            else
                a_0++;
            if(b[i]=='1')
                b_1++;
            else
                b_0++;
            if(a[i]!=b[i])
                diff++;
        }
        if(a_1==b_1 && a_0==b_0 && diff%2==0)
            System.out.println((int)diff/2);
        else
            System.out.println("-1");
            
        
    }
}
