/*
Given a string, print all permutations of a given string.

Input:
The first line of input contains an integer T, denoting the number of test cases. Each test case contains a single string S in capital letter.

Output:
For each test case, print all permutations of a given string S with single space and all permutations should be in lexicographically increasing order.

Constraints:
1 ≤ T ≤ 10
1 ≤ size of string ≤ 5

Example:
Input:
2
ABC
ABSG

Output:
ABC ACB BAC BCA CAB CBA 
ABGS ABSG AGBS AGSB ASBG ASGB BAGS BASG BGAS BGSA BSAG BSGA GABS GASB GBAS GBSA GSAB GSBA SABG SAGB SBAG SBGA SGAB SGBA

*/


/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    private static String string[];;
    private static int k;
    GFG(){
        string = new String[1000];
        k = 0;
    }
    private static void permutation(String prefix, String str) {
        int n = str.length();
        if (n == 0){ 
            //System.out.print(prefix + " ");
            string[k++] = prefix;
        }
        else {
            for (int i = 0; i < n; i++)
                permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
        }
    }
    public static void permutation(String str) { 
        permutation("", str); 
    }
	public static void main (String[] args) {
		//code
		Scanner scanner = new Scanner(System.in);
		int test = scanner.nextInt();
		for(int i = 0;i < test;i++){
		    GFG gfg = new GFG();
		    String string = scanner.next();
		    gfg.permutation(string);
		    //Arrays.sort(gfg.string);
		    String temp = "";
		    for (int j = 0; j < gfg.k; j++) 
            {
                for (int k = j + 1; k < gfg.k; k++) 
                {
                    if (gfg.string[j].compareTo(gfg.string[k])>0) 
                    {
                        temp = gfg.string[j];
                        gfg.string[j] = gfg.string[k];
                        gfg.string[k] = temp;
                    }
                }
            }
		    for(int an = 0;an < gfg.k;an++){
		        System.out.print(gfg.string[an] + " ");
		    }
		    System.out.println();
		}
	}
}
