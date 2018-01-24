package Sort;

public class Insertion {

	public static void main(String[] args) {

		int arr[] = {5,1,9,6,4,7,2,8,3,10};

		int length = arr.length;
		int num = 0;
		int j = 0;

		for (int i=1; i<arr.length; i++){
			num = arr[i]; 
			System.out.println("key value "+num);
			//정렬된 리스트 중, 키값보다 요소값이 클 경우 동안 반복
			for (j=i-1; j>=0 && num<arr[j]; j--){
				arr[j+1] = arr[j]; // 정렬된리스트의 값을 다음 요소에 저장 (복사개념)
				
	
			}
			arr[j+1] = num; // key값을 삽입
			
			System.out.print("단계 : ");
			for(int k = 0; k<length; k++)
				System.out.print(arr[k] + " ");
			System.out.println();
		}

		for(int i = 0; i<10; i++){
			System.out.print(arr[i] + " ");
		}
	}

}
