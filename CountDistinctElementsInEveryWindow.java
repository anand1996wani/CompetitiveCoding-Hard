/*

Given an array A[] of size N and an integer K. Your task is to complete the function countDistinct() which prints the count of distinct numbers in all windows of size k in the array A[].

Input:
The first line of input contains an integer T denoting the number of test cases. Then T test cases follow. 
Each test case contains two integers N and K. Then in the next line are N space separated values of the array A[].

Output:
For each test case in a new line print the space separated values denoting counts of distinct numbers in all windows of size k in the array A[].

Constraints:
1 <= T <= 100
1 <= N, K <= 100
1 <= A[] <= 100

Example(To be used only for expected output):
Input:
2
7 4
1 2 1 3 4 2 3
3 2
4 1 1

Output:
3 4 4 3
2 1

*/

class GfG
{
    void countDistinct(int A[], int k, int n)
    {
	// Your code here
	    HashMap<Integer,Integer> hashmap = new HashMap<>();
	    for(int j = 0;j < k;j++){
	        if(hashmap.get(A[j])==null){
	            hashmap.put(A[j],1);
	        }else{
	            hashmap.put(A[j],hashmap.get(A[j]) + 1);
	        }
	    }
	    System.out.print(hashmap.size() + " ");
	    for(int i = 1;i < n - k + 1;i++){
	        if(hashmap.get(A[i-1])==1){
	            hashmap.remove(A[i-1]);
	        }else{
	            hashmap.put(A[i-1],hashmap.get(A[i-1])-1);
	        }
	        if(hashmap.get(A[i-1+k])==null){
	            hashmap.put(A[i-1+k],1);
	        }else{
	            hashmap.put(A[i-1+k],hashmap.get(A[i-1+k]) + 1);
	        }
	        System.out.print(hashmap.size() + " ");
	    }
    }
}
