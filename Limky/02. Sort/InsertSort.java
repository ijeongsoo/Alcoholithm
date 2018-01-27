package EscapeStudy.sort;

import java.util.Arrays;
import java.util.Scanner;

public class InsertSort {

	public static void main(String[] args) {
		//02. 삽입정렬
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
 		int array[] = new int[n];
		for(int i=0; i<n; i++){
 			array[i] = sc.nextInt();
 		}
		
		 System.out.println("Before   : "+Arrays.toString(array)+"\n");
		 insertSort(array);
	}

	//02. 삽입정렬
	private static void insertSort(int[] array) {
	
		int temp = 0;
		int j = 0;
		
		//i=1인 이유 일단 최초에 첫번째는 정렬됐다고 가정
		for(int i=1; i<array.length; i++){
			temp = array[i];
			j = i;
			while(j > 0 && temp < array[j-1]){ //0보다 크고 삽입대상이 정렬된 대상보다 작은경우
				array[j] = array[j-1]; //밀기
				j--; //다음 비교를 위해 --;
			}
			//0 즉 첫번째이거나, 삽입할 위치가 정해진 경우 -> 삽입대상이 정렬된 대상보다 큰경우
			array[j] = temp;
			System.out.println((i+1)+"번째 select sort result : " + Arrays.toString(array)); 
		}

		
	}

}
