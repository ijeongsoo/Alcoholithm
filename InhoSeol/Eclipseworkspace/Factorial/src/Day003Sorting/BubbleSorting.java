package Day003Sorting;
/*���� ���� �� ������ ���Ҹ� �˻��Ͽ� �����ϴ� ���
�ð� ���⵵ n^2
�ڵ尡 �ܼ��ϱ� ������ ���� ����!*/
public class BubbleSorting {
	public static void main(String[] args){
	int arr[]={2,7,3,9,0,8,6,5,4,1};
	
	int i,j,temp;
	//���� �� �迭 �� ���
	System.out.println("======���� ���� ��======");
	for(i =0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
	System.out.println();
	
	//��������
	for(i = 0; i<arr.length; i++){
		for(j=0; j<arr.length-1; j++){
			if(arr[j] > arr[j+1]){
				temp =arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
			}
		}
	}
	
	System.out.println("=====���� ���� ��=====");
	for(i=0; i<arr.length; i++){
		System.out.print(arr[i]+" ");
	}
	}
	
}
