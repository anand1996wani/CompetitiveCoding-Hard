/*

Question :

Given a array of n strings, find the longest common prefix among all strings present in the array.

Input : 
  geeksforgeeks geeks geek geezer
  
Output :
  gee

*/


import java.util.*;
import java.lang.*;
import java.io.*;
class LongestCommonPrefix
 {
	public static void main (String[] args)
	 {
	    //code
	    Scanner s = new Scanner(System.in);
	    int k = s.nextInt();
	    for(int anand = 0;anand  < k;anand++){
	        int n = s.nextInt();
	        String[] array = new String[n];
	        for(int i = 0;i < n;i++){
	            array[i] = s.next();    
	        }
	        int min = array[0].length();
	        for(int i = 1;i < n;i++){
	            if(min < array[i].length()){
	                min = array[i].length();
	            }
	        }
	        int index = 0;
	        String string = "";
	        boolean flag = false;
	        while(index < min){
	            flag = true;
	            char imp = array[0].charAt(index);
	            for(int i = 1;i < n;i++){
	                if(imp!=array[i].charAt(index)){
	                    flag = false;
	                    break;
	                }
	            }
	            if(flag==true)
	                string = string + array[0].charAt(index);
	            else
	                break;
	            index++;     
	        }
	        if(string.length()==0)
	            System.out.println("-1");
	        else
	            System.out.println(string);
	    }
	 }
}
