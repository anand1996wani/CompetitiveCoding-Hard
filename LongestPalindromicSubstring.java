/*
Longest Palindromic Substring

Given a string S, find the longest palindromic substring in S.

Substring of string S:

S[i...j] where 0 <= i <= j < len(S)

Palindrome string:

A string which reads the same backwards. More formally, S is palindrome if reverse(S) = S.

Incase of conflict, return the substring which occurs first ( with the least starting index ).

*/

public class Solution {
    public String longestPalindrome(String A) {
        String B = new String();
        B = B + A;
        int array[][] = new int[A.length()][A.length()];
        //Code for palindrome of length 1
        int m = 0;
        int low = 0;
        if(A.length()==1){
            return A;
        }else if(A.length()==2){
            if(A.charAt(0)==A.charAt(1)){
                return A;
            }else{
                return "" + A.charAt(0);
            }
        }else{
            m = 0;
            low = 0;
            for(int i = 0; i < A.length();i++){
                array[i][i] = 1;
                if(i!=A.length()-1){
                    if(A.charAt(i)==A.charAt(i+1)){
                        array[i][i+1] = 1;
                        array[i+1][i] = 1;
                        if(m < 2){
                            m = 2;
                            low = i;
                        }
                    }
                }
            }
            for(int k = 3;k < A.length();k++){
                for(int i = 0;i < A.length() - k + 1;i++){
                    int j = i + k - 1;
                    if(array[i+1][j-1]==1 && A.charAt(i)==A.charAt(j)){
                        array[i][j] = 1;
                        if(j - i + 1 > m){
                            m = j - i + 1;
                            low = i;
                        }
                    }
                }
            }
            
            /*for(int i = 0;i < A.length();i++){
                for(int j = 0;j < A.length();j++){
                    System.out.print(array[i][j] + " ");
                }
                System.out.println();
            }
            int temp = low + m;
            System.out.println(low + " " + temp);*/
            return A.substring(low,low + m);
        }
    }
}
