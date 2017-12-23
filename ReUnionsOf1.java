/*
Reunion of 1's

You are given a string of size n consisting of 0s and/or 1s. You have to perform total k queries and there are two types of queries possible:

"1" (without quotes): Print length of the longest sub-array which consists of all '1'.

"2 X" (without quotes): where X is an integer between 1 to n. In this query, you will change character at the Xth position to '1' (It is possible that the character at i-th position was already '1').

Input Format

First line of input contains n and k, where n is the length of the string, k is the number of queries.

Next line contains a string of 0's and/or 1's of length n.    Each of next k lines contains query of any one type(i.e 1 or 2).

Input Constraints

1=n,k=105
1=X=n
    
String contains only 0s and/or 1s.
Each query is of one of the mentioned types.

Output Format

For each query of type 1, print in a new line the maximum size of the subarray with all 1's

*/
import java.util.*;
class ReUnionsOf1 {
    public static void main(String args[] ) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        String string = new String();
        string = scanner.next();
        char []charArray = string.toCharArray();
        for(int i = 0;i<k;i++){
            int a = scanner.nextInt();
            if(a==1){
                int max = 0;
                int temp = 0;
                for(int j = 0;j<charArray.length;j++){
                    if(charArray[j]=='0'){
                        if(max < temp){
                            max = temp;
                        }
                        temp = 0;
                    }else if(charArray[j]=='1'){
                        temp = temp + 1;
                    }
                }
                if(max < temp){
                    max = temp;
                }
                System.out.println(max);
            }
            else if(a==2){
                int t = scanner.nextInt();
                t = t - 1;
                if(charArray[t]!='1')
                    charArray[t] = '1';
            }
        }
    }
}
