/*
 * 분할의 경우 길이를 2^n으로 나타낸다. 
 * 길이가 8일 경우 2^3이 되는 것이다.
 * 호출의 깊이 k = 3이되고 k = log2^n이 됨을 알 수 있다.
 * 
 * 합병 단계에서는 각 단계에서 최대 n번의 비교 연산이 발생한다.
 * 길이가 8인 경우 크기 1인 배열 비교를 위해 최대 2번의 비교연산이 필요하고 4쌍 있으니 8번의 비교 필요
 * 따라서 nlog2^n의 시간복잡도가 생겨난다.
 */
public class MergeSort {
	final static int NEWSIZE = 8;

	public static void main(String[] args) {
		int arr[] = {5,2,4,7,1,3,2,6};
		int length = arr.length;
		mergeSort(arr, 0, length-1);
		for(int i = 0; i<length; i++){
			System.out.print(arr[i] + " ");
		}
	}
	 public static void mergeSort(int[] array, int start, int end) {
         if (start < end) {
             int mid = ((start + end) / 2);
             mergeSort(array, start, mid);
             System.out.println("LEFT");
             mergeSort(array, mid + 1, end);
             System.out.println("RIGHT");
             merge(array, start, mid, end);
             System.out.println("MERGE");
         }
     }
	 public static void merge(int[] array, int start, int mid, int end) {
         int[] resultArray = new int[NEWSIZE];
         int low = start;
         int high = mid + 1;
         int key = start;

         // 나눠서 비교해서 정렬
         while (low <= mid && high <= end) {
             if (array[low] < array[high]) {
                 resultArray[key] = array[low];
                 low++;
             } else {
                 resultArray[key] = array[high];
                 high++;
             }
             key++;
         }
         // 오른쪽(high) array 값이 다 처리 안됫을 경우
         if (low > mid) {
             for (high = high; high <= end; high++) {
                 resultArray[key] = array[high];
                 key++;
             }
         // 왼쪽(low) array 값이 다 처리 안됫을 경우
         }  
         else {
             for (low = low; low <= mid; low++) {
                 resultArray[key] = array[low];
                 key++;
             }
         }
         // 임시로 만든 array를 정렬할 array에 복사
         for (int i = start; i <= end; i++) {
             array[i] = resultArray[i];
         }
     }
}
