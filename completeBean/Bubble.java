package Sort;

public class Bubble {
	public static void main(String[] args) {
		int array[] = {5,1,9,6,4,7,2,8,3,10};
		
		int length = array.length;
		
		for(int i = 0; i<length-1; i++){
			for(int j = i+1; j<length; j++){
				if(array[i] > array[j]){
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		for(int i = 0; i<10; i++){
			System.out.print(array[i] + " ");
		}
	}

}
