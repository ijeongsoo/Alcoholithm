package EscapeStudy.sort;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		//03. ��������
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
 		int array[] = new int[n];
		for(int i=0; i<n; i++){
 			array[i] = sc.nextInt();
 		}
		
		 System.out.println("Before   : "+Arrays.toString(array)+"\n");
		 bubbleSort(array);
	}

	//03. ��������
	private static void bubbleSort(int[] array) {
		int temp = 0;
		int size = array.length-1;//������ ���� ���ʴ�� ���ĵǱ� ������ �������� �ڵ�����
		for(int i=0; i<size; i++){
			for(int j=0; j<size-i; j++){ //���������� ���������� ���ĵǱ� ������ -1�� �񱳼��� ������
				if(array[j] > array[j+1]){
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
			 System.out.println((i + 1) + "ȸ�� bubble sort result : " + Arrays.toString(array));
		}

		
	}

}
