import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	 //code
	    Scanner scanner = new Scanner(System.in);
	    int test = scanner.nextInt();
	    for(int i = 0;i < test;i++){
	        String string = scanner.next();
	        char array[] = new char[string.length()];
	        array = string.toCharArray();
	        String temp = "";
	        StringBuilder stringBuilder = new StringBuilder();
	        for(int j = string.length()-1;j>=0;j--){
	            if(array[j]!='.')
	                temp = temp + array[j];
	            else{
	                stringBuilder.append(temp);
	                stringBuilder = stringBuilder.reverse();
	                temp = "";
	                System.out.print(stringBuilder);
	                if(j!=0)
	                    System.out.print(".");
	                stringBuilder = new StringBuilder();
	            }
	        }
	        stringBuilder.append(temp);
	        stringBuilder = stringBuilder.reverse();
	        System.out.print(stringBuilder);
	        System.out.println();
	        temp = "";
	        stringBuilder = new StringBuilder();
	    }
	 }
}
