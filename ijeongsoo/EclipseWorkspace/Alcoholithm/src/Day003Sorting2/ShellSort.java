package Day003Sorting2;

public class ShellSort {
	 public static void main(String[] args) {
	        int[] arr = { 69, 10, 30, 2, 16, 8, 31, 22 };
	 
	        shellSort(arr);
	        
	        for(int i=0; i<8; i++){
	        		System.out.print(arr[i]+" ");
	        }
	    }	
	
    public static void intervalSort(int arr[], int begin, int end, int interval) {
        int item = 0;
        int j = 0;
 
        for (int i = begin + interval; i <= end; i = i + interval) {
            item = arr[i];
            for (j = i - interval; j >= begin && item < arr[j]; j -= interval)
                arr[j + interval] = arr[j];
            arr[j + interval] = item;
        }
    }
 
    public static void shellSort(int arr[]) {
        int interval = 0;
        int t = 1;
        int arrSize = arr.length;
 
        interval = arrSize / 2;
 
        while (interval >= 1) {
            for (int i = 0; i < interval; i++){
                intervalSort(arr, i, arrSize - 1, interval); 
            }
            interval /= 2;
        }
    }
}


