/*

Question :

Given a String of length N reverse the words in it. Words are separated by dots.


*/


import java.util.*;
import java.lang.*;
import java.io.*;

class ReverseWordsInString{
	public static void main (String[] args) {
		//code
		Scanner s = new Scanner(System.in);
		int test = s.nextInt();
		for(int anand = 0;anand<test;anand++){
		    String string = s.next();
		    String[] new_string = string.split("\\.");
		    Stack<String> st = new Stack<String>();
		    for(String w : new_string){
		        st.push(new String(w));
		    }
		    String sq = new String();
		    for(int i = 0;i<new_string.length;i++){
		        sq = sq + (String)st.pop();
		        if(i!=new_string.length-1)
		            sq = sq + ".";
		    }
		    System.out.println(sq);
		}
	}
}