
package Day003Sorting2.RadixSort;

public class RadixSortMain {
	public static void main(String[] args) {
		int[] arr = { 10, 9, 8, 7, 6, 5, 45, 3, 2, 1 };

		sort(arr, 2);
		
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+", ");
		}

	}

	public static void sort(int[] arr, int max) {
		Queue[] qArr = { new Queue(), new Queue(), new Queue(), new Queue(), new Queue(), new Queue(), new Queue(),
				new Queue(), new Queue(), new Queue() };

		int mod = 10;
		int dev = 1;
		for (int i = 0; i < max; i++, dev *= 10, mod *= 10) {
			for (int j = 0; j < arr.length; j++) {
				int bucket = (arr[j] % mod) / dev;
				qArr[bucket].enqueue(arr[j]);
			}

			int pos = 0;

			for (int j = 0; j < qArr.length; j++) {
				Integer value = null;
				while ((value = qArr[j].dequeue()) != null) {
					arr[pos++] = value;
				}

			}

		}

	}

}
