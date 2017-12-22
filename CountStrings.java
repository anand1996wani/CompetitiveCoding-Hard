/*
Can you count?

You are given a string s consisting of lowercase English letters and/or '_' (underscore).
You have to replace all underscores (if any) with vowels present in the string.

The rule you follow is:
Each underscore can be replaced with any one of the vowel(s) that came before it.

You have to tell the total number of distinct strings we can generate following the above rule.

Input format:
The first line consists of an integer t, denoting the number of test cases.
Each of the next t lines consists of a string s.

Output format:
For each test case, output total number of distinct strings we can generate following the given rule.
Answer for each test case should come in a new line.

Input Constraints:
1=t=4000
1=|s|=105; |s| denotes string length.
Sum of |s| over all test-cases won't exceed 105.

It is guaranteed that there will be atleast one vowel before any '_' (underscore) character in the string.

Note:
It is guaranteed that answer won't go beyond 5*1018.


*/
import java.util.*;
import java.util.regex.*;
class CountStrings {
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        int test = s.nextInt();
        for(int anand = 0;anand<test;anand++){
            String string = s.next();
            char []charString = string.toCharArray();
            Hashtable hashTable = new Hashtable();
            long count = 1;
            long temp = 1;
            hashTable.put('a',0);
            hashTable.put('e',0);
            hashTable.put('i',0);
            hashTable.put('o',0);
            hashTable.put('u',0);
            for(int i = 0;i<charString.length;i++){
                if(charString[i]=='_'){
                    count = count * (temp-1); 
                }
                else if(charString[i]=='a'||charString[i]=='e'||charString[i]=='i'||charString[i]=='o'||charString[i]=='u'){
                    int t = (int)hashTable.get(charString[i]);
                    if(t==0){
                        temp = temp + 1;
                        hashTable.put(charString[i],t+1);
                    }
                }
            }
            System.out.println(count);    
        }
    }
}
