/*

You are a salesman and your goal is to visit all the houses along a certain street.

You walk at a constant rate and can start and end at any location. You may visit the houses in any order you wish. Given the locations of the houses along the street, what is the minimum amount of time needed for you to visit all the houses?

Formally, we represent the street as a number line and the positions of the houses as numbers along this line.

There are n houses numbered, 1,2,3,....n and they are located at, x1,x2,x3...xn respectively. Assume that it takes 0(negligible) time to visit a house, and walking from house i to house j takes minutes mod(i-j).

Complete the function minimumTime which takes an integer array , denoting the locations of the houses as input. Return an integer denoting the minimum amount of time, in minutes, needed to visit all the houses.

Input Format

The first line contains a single integer denoting the number of streets. The description of streets follow.
Each street is described by two lines. The first line contains a single integer denoting the number of houses in that street. The second line contains integers denoting the locations of the houses along the street.

Output Format

For each street, print a single line containing a single integer denoting the minimum amount of time, in minutes, needed to visit all the houses.

Sample Input 0

1
3
11 6 9

Sample Output 0

5

*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ScalesMan {

    static int minimumTime(int[] x) {
        //  Return the minimum time needed to visit all the houses.
        Arrays.sort(x);
        int sum = 0; 
        for(int i = 1;i<x.length;i++){
            sum = sum + Math.abs(x[i]-x[i-1]);
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int[] x = new int[n];
            for(int x_i = 0; x_i < n; x_i++){
                x[x_i] = in.nextInt();
            }
            int result = minimumTime(x);
            System.out.println(result);
        }
        in.close();
    }
}
