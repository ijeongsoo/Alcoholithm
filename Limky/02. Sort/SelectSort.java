package EscapeStudy.sort;

import java.util.Arrays;
import java.util.Scanner;

public class SelectSort {

	public static void main(String[] args) {
		//01. 선택정렬
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
 		int array[] = new int[n];
		for(int i=0; i<n; i++){
 			array[i] = sc.nextInt();
 		}
		
		 System.out.println("Before   : "+Arrays.toString(array)+"\n");
		 selectSort(array);
	}

	//01. 선택정렬
	private static void selectSort(int[] array) {
		int index = 0;
		int temp = 0;
		for(int i=0; i<array.length-1; i++){
			index = i;
			for(int j=i+1; j<array.length; j++){
				if(array[index] > array[j]){
					index = j;
				}
			}
			temp = array[i];
			array[i] = array[index];
			array[index] = temp;
			
			 System.out.println((i+1)+"번째 select sort result : " + Arrays.toString(array)); 
		}
		
	}

}
