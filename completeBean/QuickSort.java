
public class QuickSort {
	public static void main(String[] args) {
		int[] arrs = { 69, 10, 30, 2, 16, 8, 31, 22 };
		quickSort(arrs, 0, arrs.length - 1);
		System.out.println("°á°ú");

		for (int i : arrs) {
			System.out.print(i + " ");
		}
	}
	public static int partition(int arr[], int left, int right){
		int pivot = arr[(left+right)/2];
		System.out.println("left, right = " + left + " " +right+" pivot : " + pivot);
		
		while(left < right){
			while((arr[left] < pivot) && (left < right)){
				left++;
				System.out.println("left " + left + " right " + right + " arr[left] " + arr[left] +" pivot " + pivot);		
			}
			while((arr[right] > pivot) && (left < right)){
				right--;
				System.out.println("left " + left + " right " + right + " arr[right] " + arr[right] +" pivot " + pivot);
			}
			System.out.println("right : " + right);
			if(left < right){
				System.out.println("if left right : " + left + "  " + right);
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
			}
			for(int i = 0; i<8; i++)
				System.out.print(arr[i] + " ");
			System.out.println();
		}
		System.out.println("========================left : " + left);

		return left;
	}
	public static void quickSort(int arr[], int left, int right){
		if(left < right){
			int pivotNewIndex = partition(arr, left, right);
			
			quickSort(arr, left, pivotNewIndex-1);
			System.out.println("quicksort " + "left " + left + " " + (pivotNewIndex-1));
			quickSort(arr, pivotNewIndex+1, right);
			System.out.println("quicksort " + "right " + right + " " + (pivotNewIndex+1));
		}
	}
}
