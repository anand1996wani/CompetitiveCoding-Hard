/*

Question :

Given a sequence of strings, the task is to find out the second most repeated (or frequent) string in the given sequence.



*/


import java.util.*;
import java.lang.*;
import java.io.*;

class SecondMostRepeatedString {
	public static void main (String[] args) {
		//code
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		for(int anand = 0;anand < t;anand++){
		    int n = s.nextInt();
		    String []array = new String[n];
		    for(int i = 0;i<n;i++){
		        String temp = s.next();
		        array[i] = temp;
		    }
		    HashMap <String,Integer> hashmap = new HashMap<String,Integer>();
		    for(int i = 0;i<array.length;i++){
		        if(hashmap.get(array[i])!=null){
		            int key = hashmap.get(array[i]);
		            key++;
		            hashmap.put(array[i],key);
		        }
		        else{
		            hashmap.put(array[i],1);
		        }
		    }
		    int max = -1;
		    String b = "";
		    for(Map.Entry<String,Integer> entry : hashmap.entrySet()){
		        if(max < entry.getValue()){
		            max = entry.getValue();
		            b = entry.getKey();
		        }
		    }
		    hashmap.remove(b);
		    max = -1;
		    for(Map.Entry<String,Integer> entry : hashmap.entrySet()){
		        if(max < entry.getValue()){
		            max = entry.getValue();
		            b = entry.getKey();
		        }
		    }
		    System.out.println(b);
		}
	}
}
