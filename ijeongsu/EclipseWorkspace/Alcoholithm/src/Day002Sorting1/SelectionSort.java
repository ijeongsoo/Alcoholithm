package Day002Sorting1;

public class SelectionSort {

	public static void main(String[] args) {
		int intarr[] = {2,7,3,9,0,8,6,5,4,1};
		
		selectionSort(intarr);
		
		for(int i=0; i<intarr.length; i++){
			System.out.print(intarr[i]+" ");
		}
	}
	
	public static void selectionSort(int[] intarr){
		int minIndex=0;
		for(int i=0; i<intarr.length-1; i++){
			for(int j=i; j<intarr.length; j++){
				if(intarr[j]<intarr[minIndex]){
					minIndex=j;
				}
			}
			int temp = intarr[minIndex];
			intarr[minIndex]=intarr[i];
			intarr[i]=temp;
			
		}
	}

}
