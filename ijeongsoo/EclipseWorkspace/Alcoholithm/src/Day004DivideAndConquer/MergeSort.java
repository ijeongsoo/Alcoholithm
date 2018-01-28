package Day004DivideAndConquer;

public class MergeSort {

	public static void main(String[] args) {
		int[] arr ={10, 9, 8,7,6,5,4,3,2,1};
		sort(arr, 0, 9);
		for(int i=0; i<10; i++){
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void sort(int [] arr, int left, int right){
		if(left<right){
	        int center = (left+right)/2;
	        sort(arr,left,center);
	        sort(arr,center+1,right);
	        merge(arr, left, center, right);
	    }
	}
	
	public static void merge(int []arr, int left, int center, int right){
		int i=left;
		int j=center+1;
		int k=i;
	    int [] tempArr = new int[arr.length];
	    while(i<=center && j<=right){
	        if(arr[i]<=arr[j]){
	        		tempArr[k] = arr[i];
	        		i++;
	        }else{
	        		tempArr[k] = arr[j];
	        		j++;
	        }
	        k++;  
	    }
	    
	    while (i<=center){
	    		tempArr[k] = arr[i];
	    		k++;
	    		i++;
	    }
	      
	    while (j<=right){
	        tempArr[k] = arr[j];
	        k++;
	        j++;
	    }
	    
	    for(int l = left; l <= right; l++){
	        arr[l] = tempArr[l];
	    }
	}

}
