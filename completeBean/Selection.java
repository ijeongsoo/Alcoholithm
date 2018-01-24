package Sort;

public class Selection {

	public static void main(String[] args) {
		int array[] = {5,1,9,6,4,7,2,8,3,10};	
		int length = array.length;
		int min = 0;
		int swapindex = -1;
		for(int i = 0; i<length; i++){
				min = i;
			for(int j = i+1; j<length; j++){
				if(array[min] > array[j]){
					min = j;
				}
			}
			int temp = array[i];
			array[i] = array[min];
			array[min] = temp;
		}
		
		System.out.println("+++++++++++++++++++++++++++");
		for(int i = 0; i<10; i++){
			System.out.print(array[i] + " ");
		}
		
		
	}
}
