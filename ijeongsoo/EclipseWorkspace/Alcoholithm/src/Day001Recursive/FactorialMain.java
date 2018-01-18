package Day001Recursive;

import java.util.Scanner;

public class FactorialMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		System.out.println(factorial(input));
		
	}
	
	public static int factorial(int input){
		if(input<2){
			return input;
		}else{
			return input*factorial(input-1);
		}
		
	}

}