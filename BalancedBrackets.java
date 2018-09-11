/*

A bracket is considered to be any one of the following characters: (, ), {, }, [, or ].

Two brackets are considered to be a matched pair if the an opening bracket (i.e., (, [, or {) occurs to the left of a closing bracket (i.e., ), ], or }) of the exact same type. 
There are three types of matched pairs of brackets: [], {}, and ().

A matching pair of brackets is not balanced if the set of brackets it encloses are not matched. 
For example, {[(])} is not balanced because the contents in between { and } are not balanced. 
The pair of square brackets encloses a single, unbalanced opening bracket, (, and the pair of parentheses encloses a single, unbalanced closing square bracket, ].

By this logic, we say a sequence of brackets is balanced if the following conditions are met:

It contains no unmatched brackets.
The subset of brackets enclosed within the confines of a matched pair of brackets is also a matched pair of brackets.
Given n strings of brackets, determine whether each sequence of brackets is balanced. If a string is balanced, return YES. 
Otherwise, return NO.

*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the isBalanced function below.
    static String isBalanced(String s) {
        if(s.length()%2==0){
            Stack <Character>stack = new Stack<Character>();
            char array[] = new char[s.length()];
            array = s.toCharArray();
            for(int i = 0;i < s.length();i++){
                if(array[i]=='{' || array[i]=='(' || array[i]=='['){
                    stack.push(array[i]);
                }else{
                    if(stack.isEmpty()==false){
                        if(array[i]=='}' && stack.peek()=='{'){
                            stack.pop();
                        }else if(array[i]==']' && stack.peek()=='['){
                            stack.pop();
                        }else if(array[i]==')' && stack.peek()=='('){
                            stack.pop();    
                        }
                    }else{
                        return "NO";
                    }
                }
            }
            if(stack.isEmpty()==true){
                return "YES";
            }else{
                return "NO";
            }
        }else{
            return "NO";
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String s = scanner.nextLine();

            String result = isBalanced(s);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
