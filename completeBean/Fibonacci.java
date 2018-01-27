import java.util.Scanner;
public class Fibonacci {
	public static void main(String atgds[]){
		Scanner in = new Scanner(System.in);
		System.out.println(printFibo(in.nextInt()));
		
	}
	public static int printFibo(int num){
		
		if(num == 1 || num == 2){
			return 1;
		}
		else{
			return printFibo(num-2) + printFibo(num-1);
		}
		
	}
}
