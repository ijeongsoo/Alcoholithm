package Day001Recursive;

import java.util.Scanner;

public class NonReculsiveFactorialMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		System.out.println(factorial(input));

	}
	
	public static int factorial(int input){
		int result=1;
		for(int i=input; i>0; i--){
			result = i*result;
		}
//		if(input<=0){
//			result=0;
//		}
		return result;
	}

}
