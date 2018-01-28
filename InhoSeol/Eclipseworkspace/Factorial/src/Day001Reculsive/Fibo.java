package Day001Reculsive;

import java.util.Scanner;

public class Fibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		for(int i =0; i<input; i++) {
			
			System.out.print(fibo(i)+",");
		}
	}
	public static int fibo(int i) {
		if(i==0||i==1) {
			return i;
		}else {
			return fibo(i-2)+fibo(i-1);
		}
	}
}
