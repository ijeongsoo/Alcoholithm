package Day001Reculsive;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		System.out.println(factorial(num)+ " ");
	}
	
	public static int factorial(int num) {
		int result =1;
		for(int i=num; i>0; i--) {
			result *= i;
		}		
		return result;
	}

}
