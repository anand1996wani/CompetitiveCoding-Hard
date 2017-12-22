/*

School Prayer

You are given the task to manage students coming to morning prayer in the school. Students having roll numbers 1 to N are coming in an arbitrary manner and you need to make them stand in a queue such that queue is always in ascending order of roll number.
In order to achieve this task, for every incoming student you need to find a student in the queue he will be standing behind (or in front of the queue if no such student is present in the queue ).
For example, if currently, the queue is 1 2 4 and student with roll number 3 arrives, you will have to locate 2 and make 3 stand behind 2.
For each incoming student, find the roll number of student he will be standing behind ( -1 in case no student with roll less than current exists).

Input Format:
The first line of input will contain T, number of test cases.
The first line of each test case will contain N, the number of students.
The second line of each test case will have N distinct space separated numbers denoting the order in which each student is coming.

Output Format:
Output a single number which is the sum of N numbers where ith number denotes answer for ith incoming student.
Answer for each test case should come in a new line.

Input Constraints:
1=T=10
1=N=105
1=RollNumber=N

*/
import java.util.Scanner;
class SchoolPlayer {
    public static void main(String args[] ) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        for(int anand = 0;anand < test;anand++){
            int n = scanner.nextInt();
            int []array = new int[n];
            for(int i = 0;i<n;i++){
                array[i] = scanner.nextInt();
            }
            int sum = 0;
            for(int j = 0;j<n;j++){
            int k = j;
            int temp = array[j];
            while(k>0 && array[k-1] > temp){
                array[k] = array[k-1];
                k = k - 1;
            }
            array[k] = temp;
            if(k!=0)
                sum = sum + array[k-1];
            else
                sum = sum + -1;
            }
            System.out.println(sum);
        }
    }
}
