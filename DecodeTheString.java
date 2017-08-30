/*

Question :

An encoded string (s) is given, the task is to decode it. The pattern in which the strings were encoded were as follows

original string: abbbababbbababbbab 
encoded string : "3[a3[b]1[ab]]".


*/

import java.util.*;
import java.lang.*;
import java.io.*;
class DecodeTheString
 {
	public static void main (String[] args)
	 {
                Scanner s = new Scanner(System.in);
                int test = s.nextInt();
             for (int anand = 0; anand < test; anand++) {
                Stack<Integer> integerstack = new Stack<>();
                Stack<Character> stringstack = new Stack<>();
                String temp = "", result = "";

                String str = s.next();
                for (int i = 0; i < str.length(); i++)
                {
                    int count = 0;

                    if (Character.isDigit(str.charAt(i)))
                    {
                        while (Character.isDigit(str.charAt(i)))
                        {
                            count = count * 10 + str.charAt(i) - '0';
                            i++;
                        }

                        i--;
                        integerstack.push(count);
                    }
                    else if (str.charAt(i) == ']')
                    {
                        temp = "";
                        count = 0;

                        if (!integerstack.isEmpty())
                        {
                            count = integerstack.peek();
                            integerstack.pop();
                        }

                        while (!stringstack.isEmpty() && stringstack.peek()!='[' )
                        {
                            temp = stringstack.peek() + temp;
                            stringstack.pop();
                        }

                        if (!stringstack.empty() && stringstack.peek() == '[')
                            stringstack.pop();

                        for (int j = 0; j < count; j++)
                            result = result + temp;

                        for (int j = 0; j < result.length(); j++)
                            stringstack.push(result.charAt(j));

                        result = "";
                    }

                    else if (str.charAt(i) == '[')
                    {
                        if (Character.isDigit(str.charAt(i-1)))
                            stringstack.push(str.charAt(i));
                        else
                        {
                            stringstack.push(str.charAt(i));
                            integerstack.push(1);
                        }
                    }

                    else
                        stringstack.push(str.charAt(i));
                }

                while (!stringstack.isEmpty())
                {
                    result = stringstack.peek() + result;
                    stringstack.pop();
                }
                    System.out.println(result);
                }
	 }
}