package Day002Sorting1;

public class BubbleSort {

	public static void main(String[] args) {
		int intarr[] = {2,7,3,9,0,8,6,5,4,1};
		
		bubbleSort(intarr);
		
		for(int i=0; i<intarr.length; i++){
			System.out.print(intarr[i]+" ");
		}
		
	}
	
	public static void bubbleSort(int[] intarr){
		for(int i=intarr.length; i>0; i--){
			for(int j=0; j<i-1; j++){
				if(intarr[j]>intarr[j+1]){
					int temp = intarr[j];
					intarr[j]=intarr[j+1];
					intarr[j+1]= temp;
				}
			}
		}
	}

}
