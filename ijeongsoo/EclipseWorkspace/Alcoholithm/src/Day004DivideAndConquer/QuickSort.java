package Day004DivideAndConquer;

public class QuickSort {

	public static void main(String[] args) {
		int[] arr ={10, 9, 8,7,6,5,4,3,2,1};
		sort(arr, 0, 9);
		for(int i=0; i<10; i++){
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void sort(int[] arr, int left, int right){
		if(left<right){
			int pivot =getPivot(arr, left, right);
			sort(arr, left, pivot);
			sort(arr, pivot+1, right);
		}
	}
	
	public static int getPivot(int[] arr, int left, int right){
		int pivot=left;
		int j=pivot;
		int i=left+1;
		for(; i<=right; i++){
			if(arr[i]<arr[pivot]){
				j++;
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		int temp=arr[left];
		arr[left]=arr[j];
		arr[j]=temp;
				
		return j;
	}

}
