package BackJoon.Recursion;

import java.util.Scanner;

public class Hanoi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		//0. 1기둥에 있는 n-1개를 2기둥을 이용하여 3기둥으로 옮기는 알고리즘
		//1. 1기둥에 있는 n-1개를 3기둥을 이용하여 기둥2로 옯겨라
		//2. 1기둥에 있는 1개의를 3기둥으로 옮겨라
		//3. 2기둥에 있는 n-1개를 1기둥을 이용하여 3기둥으로 옴겨라
	
		
		//2의 n승 - 1 <- 최소 횟수
		System.out.println((int)Math.pow(2, n) - 1);
		//01. 재귀호출
		hanoi(n,1,2,3);

	}

	private static void hanoi(int n, int from, int by, int to) {
		if(n == 1){
			System.out.println(from+" "+to);
		}else{
			
		hanoi(n-1, from, to, by);
		System.out.println(from+" "+to);
		hanoi(n-1, by, from, to);
		
		}
		
	}

}
