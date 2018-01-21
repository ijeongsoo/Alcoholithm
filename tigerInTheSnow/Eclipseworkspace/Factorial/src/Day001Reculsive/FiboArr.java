package Day001Reculsive;

import java.util.Scanner;

public class FiboArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		int[] fibo = new int[input];
		fibo[0] = 0;
		fibo[1] = 1;
		int i;
		for(i=2; i<input; i++) {
			fibo[i] = fibo[i-2]+fibo[i-1];
			
		}
		
		for(int j=0; j<input; j++ ) {
			System.out.println(fibo[j]);
		}
	
	}

}
