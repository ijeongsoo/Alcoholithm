package BackJoon.Recursion;

import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		//01. ¿Á±Õ»£√‚
		for(int i=1; i<=n; i++){
		System.out.print(fibonacci(i)+" ");
		}
		
		noRecursion(n);
		
	}

	//01. ¿Á±Õ
	private static int fibonacci(int n) {
		if(n==1 || n==2){
			return 1;
		}else{
			return fibonacci(n-1) + fibonacci(n-2);
		}
		
	}

	//02. æ»¿Á±Õ
	private static void noRecursion(int n) {
		
		int[] array = new int[n];
		array[0] = 1;
		array[1] = 1;
		for(int i=2; i<n; i++){
			array[i] = array[i-1] + array[i-2];
		}
		System.out.println(Arrays.toString(array));
		
	}
	
	

}
