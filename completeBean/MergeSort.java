/*
 * ������ ��� ���̸� 2^n���� ��Ÿ����. 
 * ���̰� 8�� ��� 2^3�� �Ǵ� ���̴�.
 * ȣ���� ���� k = 3�̵ǰ� k = log2^n�� ���� �� �� �ִ�.
 * 
 * �պ� �ܰ迡���� �� �ܰ迡�� �ִ� n���� �� ������ �߻��Ѵ�.
 * ���̰� 8�� ��� ũ�� 1�� �迭 �񱳸� ���� �ִ� 2���� �񱳿����� �ʿ��ϰ� 4�� ������ 8���� �� �ʿ�
 * ���� nlog2^n�� �ð����⵵�� ���ܳ���.
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

         // ������ ���ؼ� ����
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
         // ������(high) array ���� �� ó�� �ȵ��� ���
         if (low > mid) {
             for (high = high; high <= end; high++) {
                 resultArray[key] = array[high];
                 key++;
             }
         // ����(low) array ���� �� ó�� �ȵ��� ���
         }  
         else {
             for (low = low; low <= mid; low++) {
                 resultArray[key] = array[low];
                 key++;
             }
         }
         // �ӽ÷� ���� array�� ������ array�� ����
         for (int i = start; i <= end; i++) {
             array[i] = resultArray[i];
         }
     }
}
