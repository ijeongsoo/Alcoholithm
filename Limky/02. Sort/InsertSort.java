package EscapeStudy.sort;

import java.util.Arrays;
import java.util.Scanner;

public class InsertSort {

	public static void main(String[] args) {
		//02. ��������
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
 		int array[] = new int[n];
		for(int i=0; i<n; i++){
 			array[i] = sc.nextInt();
 		}
		
		 System.out.println("Before   : "+Arrays.toString(array)+"\n");
		 insertSort(array);
	}

	//02. ��������
	private static void insertSort(int[] array) {
	
		int temp = 0;
		int j = 0;
		
		//i=1�� ���� �ϴ� ���ʿ� ù��°�� ���ĵƴٰ� ����
		for(int i=1; i<array.length; i++){
			temp = array[i];
			j = i;
			while(j > 0 && temp < array[j-1]){ //0���� ũ�� ���Դ���� ���ĵ� ��󺸴� �������
				array[j] = array[j-1]; //�б�
				j--; //���� �񱳸� ���� --;
			}
			//0 �� ù��°�̰ų�, ������ ��ġ�� ������ ��� -> ���Դ���� ���ĵ� ��󺸴� ū���
			array[j] = temp;
			System.out.println((i+1)+"��° select sort result : " + Arrays.toString(array)); 
		}

		
	}

}
