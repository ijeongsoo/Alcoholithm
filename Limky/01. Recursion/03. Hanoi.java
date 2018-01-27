package BackJoon.Recursion;

import java.util.Scanner;

public class Hanoi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		//0. 1��տ� �ִ� n-1���� 2����� �̿��Ͽ� 3������� �ű�� �˰���
		//1. 1��տ� �ִ� n-1���� 3����� �̿��Ͽ� ���2�� ���ܶ�
		//2. 1��տ� �ִ� 1���Ǹ� 3������� �Űܶ�
		//3. 2��տ� �ִ� n-1���� 1����� �̿��Ͽ� 3������� �Ȱܶ�
	
		
		//2�� n�� - 1 <- �ּ� Ƚ��
		System.out.println((int)Math.pow(2, n) - 1);
		//01. ���ȣ��
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
