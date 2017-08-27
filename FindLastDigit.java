/*

Question :
You are given two integer numbers , the base a (number of digits d, such that 1 <= d <= 1000) and the index b.
You have to find the last digit of a^b.

*/


import java.util.*;
import java.lang.*;
import java.io.*;
class FindLastDigit
 {
	public static void main (String[] args)
	 {
	 //code
	    Scanner s = new Scanner(System.in);
	    int test = s.nextInt();
	    for(int anand = 0;anand < test;anand++){
	        int a = (int)s.nextInt();
	        int b = (int)s.nextInt();
	        if(b==0)
	            System.out.println("1");
	        else
	        {
	            int unit = a%10;
	            switch(unit){
	               case 0:
	                    System.out.println("0");
	                    break;
	                case 1:
	                    System.out.println("1");
	                    break;
	                case 2:
	                    int temp1 = b%4;
	                    switch(temp1){
	                        case 1:
	                            System.out.println("2");
	                            break;
	                        case 2:
	                            System.out.println("4");
	                            break;
	                        case 3:
	                            System.out.println("8");
	                            break;
	                        case 4:
	                            System.out.println("6");
	                            break;
	                        }
	                    break;
	                case 3:
	                    int temp2 = b%4;
	                    switch(temp2){
	                        case 1:
	                            System.out.println("3");
	                            break;
	                        case 2:
	                            System.out.println("9");
	                            break;
	                        case 3:
	                            System.out.println("7");
	                            break;
	                        case 4:
	                            System.out.println("1");
	                            break;
	                        }
	                    break;
	                case 4:
	                    int temp3 = b%2;
	                    switch(temp3){
                            case 1:
                                    System.out.println("4");
                                    break;
                            case 2:
                                    System.out.println("6");
                                    break;
	                    }
	                    break;
	                case 5:
	                    System.out.println("5");
	                    break;
	                case 6:
	                    System.out.println("6");
	                    break;
	                case 7:
	                    int temp4 = b%4;
	                    switch(temp4){
	                        case 1:
	                            System.out.println("7");
	                            break;
	                        case 2:
	                            System.out.println("9");
	                            break;
	                        case 3:
	                            System.out.println("3");
	                            break;
	                        case 4:
	                            System.out.println("1");
	                            break;
	                        }
	                    break;
	                case 8:
	                    int temp5 = b%4;
	                    switch(temp5){
	                        case 1:
	                            System.out.println("8");
	                            break;
	                        case 2:
	                            System.out.println("4");
	                            break;
	                        case 3:
	                            System.out.println("2");
	                            break;
	                        case 4:
	                            System.out.println("6");
	                            break;
	                        }
	                    break;
	                case 9:
	                    int temp6 = b%2;
	                    switch(temp6){
                            case 1:
                                    System.out.println("9");
                                    break;
                            case 2:
                                    System.out.println("1");
                                    break;
	                    }
	                    break;
	            }
	        }
	    }
	 }
}