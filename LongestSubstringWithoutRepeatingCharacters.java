/*
Longest Substring Without Repeating Characters

Given a string, find the length of the longest substring without repeating characters.


*/

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0,j=0;
        HashMap <Character,Integer> hashmap = new HashMap<Character,Integer>();
        for(int i = 0;i < s.length();i++){
            if(hashmap.containsKey(s.charAt(i))==true){
                j = Math.max(j,hashmap.get(s.charAt(i))+1);
            }
            hashmap.put(s.charAt(i),i);
            max = Math.max(max,i-j+1);
        }
        //System.out.println(max);
        return max;
    }
}
