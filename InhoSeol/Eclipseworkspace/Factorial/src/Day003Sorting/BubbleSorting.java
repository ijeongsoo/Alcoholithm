package Day003Sorting;
/*버블 정렬 두 인접한 원소를 검사하여 정렬하는 방법
시간 복잡도 n^2
코드가 단순하기 때문에 자주 사용됨!*/
public class BubbleSorting {
	public static void main(String[] args){
	int arr[]={2,7,3,9,0,8,6,5,4,1};
	
	int i,j,temp;
	//정렬 전 배열 값 출력
	System.out.println("======버블 정렬 전======");
	for(i =0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
	System.out.println();
	
	//버블정렬
	for(i = 0; i<arr.length; i++){
		for(j=0; j<arr.length-1; j++){
			if(arr[j] > arr[j+1]){
				temp =arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
			}
		}
	}
	
	System.out.println("=====버블 정렬 후=====");
	for(i=0; i<arr.length; i++){
		System.out.print(arr[i]+" ");
	}
	}
	
}
