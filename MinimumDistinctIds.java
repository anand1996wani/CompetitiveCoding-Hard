/*

Question :

Given an array of items, an i-th index element denotes the item id’s and given a number m, 
the task is to remove m elements such that there should be minimum distinct id’s left.
Print the number of distinct id’s.


*/





import java.util.*;
import java.lang.*;
import java.io.*;

class MinimumDistinctIds {
	public static void main (String[] args) {
		//code
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		for(int anand = 0;anand < t;anand++){
		    int n = s.nextInt();
		    int[] array = new int[n];
		    for(int i = 0;i<n;i++){
		        array[i] = s.nextInt();
		    }
		    int m = s.nextInt();
		    HashMap <Integer,Integer>hashMap = new HashMap<Integer,Integer>();
		    for(int i = 0;i<n;i++){
		        if(hashMap.get(array[i])!=null){
		            int temp = hashMap.get(array[i]);
		            temp = temp + 1;
		            hashMap.put(array[i],temp);
		        }
		        else{
		            hashMap.put(array[i],1);
		        }
		    }
		    while(m!=0 && hashMap.size() > 0){
		        Map.Entry<Integer,Integer> min = null;
		        for(Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
                    if (min == null || min.getValue() > entry.getValue()) {
                        min = entry;
                    }
                }
                if(min.getValue() <= m){
                    m = m - min.getValue();
                    hashMap.remove(min.getKey());
                }
                else{
                    break;
                }
		    }
		    System.out.println(hashMap.size());
	}
}
}
