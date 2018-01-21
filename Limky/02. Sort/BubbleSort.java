package EscapeStudy.sort;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		//03. 버블정렬
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
 		int array[] = new int[n];
		for(int i=0; i<n; i++){
 			array[i] = sc.nextInt();
 		}
		
		 System.out.println("Before   : "+Arrays.toString(array)+"\n");
		 bubbleSort(array);
	}

	//03. 버블정렬
	private static void bubbleSort(int[] array) {
		int temp = 0;
		int size = array.length-1;//위에서 부터 차례대로 정렬되기 때문에 마지막은 자동정렬
		for(int i=0; i<size; i++){
			for(int j=0; j<size-i; j++){ //마찬가지로 위에서부터 정렬되기 때문에 -1씩 비교수가 적어짐
				if(array[j] > array[j+1]){
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
			 System.out.println((i + 1) + "회전 bubble sort result : " + Arrays.toString(array));
		}

		
	}

}
