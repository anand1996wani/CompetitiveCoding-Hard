/*
Longest Palindromic SubstringLongest Palindromic Substring

Asked in:  
Amazon
Microsoft
Groupon
Given a string S, find the longest palindromic substring in S.

Substring of string S:

S[i...j] where 0 <= i <= j < len(S)

Palindrome string:

A string which reads the same backwards. More formally, S is palindrome if reverse(S) = S.

Incase of conflict, return the substring which occurs first ( with the least starting index ).

Example :

Input : "aaaabaaa"
Output : "aaabaaa"




*/

public class Solution {
    public String longestPalindrome(String A) {
        int maxLen = 1;
        int start = 0;
        for(int i = 0; i < A.length();i++){
            //Even Length Palindrome
            int low = 0;
            int high = 0;
            low = i - 1;
            high = i;
            while(low >= 0  && high < A.length() && A.charAt(low)==A.charAt(high)){
                if(high - low + 1 > maxLen){
                    maxLen = high - low + 1;
                    start = low;
                }
                low--;
                high++;
            }
            
            //Odd Length Palindrome
            
            low = i - 1;
            high = i + 1;
            while(low >= 0 && high < A.length() && A.charAt(low)==A.charAt(high)){
                if(high - low + 1 > maxLen){
                    maxLen = high - low + 1;
                    start = low;
                }
                low--;
                high++;
            }
        }
        return A.substring(start,start+maxLen);
    }
}
