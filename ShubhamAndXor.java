/*

Shubham and Xor

You are given an array of n integer numbers a1, a2, .. ,an. 
Calculate the number of pair of indices (i,j) such that 1=i < j = n and ai xor aj=0

Input format
- First line: n denoting the number of array elements
- Second line: n space separated integers a1, a2, .. ,an.

Output format
Output the required number of pairs.

Constraints
1=n=106
1=ai=109

*/
import java.util.*;
class ShubhamAndXor{
    public static void main(String args[] ) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long []array = new long[n];
        for(int i = 0;i<n;i++){
            array[i] = scanner.nextLong();
        }
        long count = 0;
        Hashtable<Long,Integer> hashtable = new Hashtable<Long,Integer>();
        for(int i = 0;i<n;i++){
            if(hashtable.containsKey(array[i])==true){
                hashtable.put(array[i],((int)hashtable.get(array[i])) + 1);
            }
            else{
                hashtable.put(new Long(array[i]),1);
            }
        }
        Set<Long> keySet = hashtable.keySet();
        long temp = 0;
        for(Long key : keySet){
            temp = hashtable.get(key);
            count = count + (long)((temp*(temp - 1))/2);
        }
        System.out.println(count);
    }
}
