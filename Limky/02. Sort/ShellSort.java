package EscapeStudy.sort;

import java.util.Arrays;
import java.util.Scanner;

public class ShellSort {
	
		
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++){
			arr[i] = sc.nextInt();
		}
		//int [] arr = {7,6,5,4,2,3,1,9,8};
		shellSort(arr);
		
	}

	private static void shellSort(int[] arr) {
		int size = arr.length;
		int interval = 0; 
	    interval = size / 2;
		
	    while(interval >= 1){
	    	for(int i=0; i<interval; i++)
	    		sortInterval(arr,i,size-1,interval);
	    	interval /= 2;
	    	
	    }
	    System.out.println(Arrays.toString(arr));
		
	}

	private static void sortInterval(int[] arr, int begin, int end, int interval) {
		int temp = 0;
		int j = 0;
		for(int i= begin + interval; i <= end; i = i + interval){
			temp = arr[i];
			for(j = i - interval; j >= begin && temp < arr[j]; j-=interval) //i>=begin인 이후 시작점 이후 값들을 비교하는 것
				arr[j+interval] = arr[j];
		
			arr[j+interval] = temp;//비교가 모두 끝난 후 최종적인 자신의 위치에 intsert
		}
		
	}

	
	
}


