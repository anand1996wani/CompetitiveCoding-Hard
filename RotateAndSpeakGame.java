/*

N children are playing a game of Rotate and Speak. 
In this game all the children are given a number plate which contains distinct values and they need to form a circle in clockwise order.

There are Q turns in this game. In each turn two numbers a and b are announced. 
The rules of the game are as follows :

    If the number a = 1
is equal to 1 then it means that all the children shift steps in anti clockwise direction.
If the number a is equal to 2 then it means that all the children shift
steps in clockwise direction.
If the number a is equal to 3 then it means that the child who is standing at  position in the clockwise order speaks the number on his number plate. Note that the positions are from to not to

Input format:
First line contains an intege
that denotes the number of test cases
First line in every test case contains an integer denoting the count of children playing the game.
Second line in every test case contains space separated integers , here the integer is the number on the number plate of the student
Third line in every test case contains an integer ,number of turns in the game.
Following lines ,each contain two integers describing one of the

types of moves in a turn.

Output format:
For each moves of type 3, you have to print the number that will be spoken in that turn of the game.

Constraints:N

*/
import java.util.*;
class TestClass {
   
    public void arrayReverse(int array[],int low,int high){
        int a = low;
        int b = high - 1;
        while(a < b){
            int temp = array[a];
            array[a] = array[b];
            array[b] = temp;
            a++;
            b--;
        }
    }
    
    public void rotateClockWise(int array[],int b){
        this.arrayReverse(array,0,array.length - b);
        this.arrayReverse(array,array.length - b,array.length);
        this.arrayReverse(array,0,array.length);
    }
    
    public void rotateAntiClockWise(int array[],int b){
        this.arrayReverse(array,0,b);
        this.arrayReverse(array,b,array.length);
        this.arrayReverse(array,0,array.length);
    }
    
    public static void main(String args[] ) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        for(int an = 0;an < test;an++){
            int n = scanner.nextInt();
            int array[] = new int[n];
            for(int i = 0;i < n;i++){
                array[i] = scanner.nextInt();
            }
            int q = scanner.nextInt();
            for(int i = 0;i < q;i++){
                int op = scanner.nextInt();
                int b = scanner.nextInt();
                b = b%n;
                TestClass testClass = new TestClass();
                switch(op){
                    case 1:
                        if(b!=0)
                            testClass.rotateAntiClockWise(array,b);
                        /*for(int z = 0;z < array.length;z++)
                            System.out.print(array[z]);
                        System.out.println();*/
                        break;
                    case 2:
                        if(b!=0)
                            testClass.rotateClockWise(array,b);
                        /*for(int z = 0;z < array.length;z++)
                            System.out.print(array[z]);
                        System.out.println();*/
                        break;
                    case 3:
                        System.out.println(array[b]);
                        break;
                }
            }
        }

        // Write your code here

    }
}
