import java.util.*;
class TestClass{
	public static void main(String args[]) throws Exception{
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int []array = new int[n];
		for(int i = 0;i<n;i++){
			array[i] = scanner.nextInt();
		}
		int cost = 0;
		for(int i = 0;i<n;i++){
			if(array[i] <= array[i-1]){
				cost = cost + Math.abs(array[i] - array[i-1] ) + 1 ;
			}
		}
		System.out.println(cost);
	}
}