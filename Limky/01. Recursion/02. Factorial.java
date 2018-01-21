package BackJoon.Recursion;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		//01. 營敝
		System.out.println(factorial(n));
	
		//02. 寰營敝
		noRecursion(n);
	}

	//01. 營敝
	private static int factorial(int n) {
		if(n == 1){
			return 1;
		}
		return n * factorial(n-1) ;
		
	}
	
	//02. 寰營敝
	private static void noRecursion(int n) {
		int sum = 1;
		for(int i=1; i<=n; i++){
			sum *= i;
		}
		System.out.println(sum);
		
	}

}
