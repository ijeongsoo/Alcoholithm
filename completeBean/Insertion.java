package Sort;

public class Insertion {

	public static void main(String[] args) {

		int arr[] = {5,1,9,6,4,7,2,8,3,10};

		int length = arr.length;
		int num = 0;
		int j = 0;

		for (int i=1; i<arr.length; i++){
			num = arr[i]; 
			System.out.println("key value "+num);
			//���ĵ� ����Ʈ ��, Ű������ ��Ұ��� Ŭ ��� ���� �ݺ�
			for (j=i-1; j>=0 && num<arr[j]; j--){
				arr[j+1] = arr[j]; // ���ĵȸ���Ʈ�� ���� ���� ��ҿ� ���� (���簳��)
				
	
			}
			arr[j+1] = num; // key���� ����
			
			System.out.print("�ܰ� : ");
			for(int k = 0; k<length; k++)
				System.out.print(arr[k] + " ");
			System.out.println();
		}

		for(int i = 0; i<10; i++){
			System.out.print(arr[i] + " ");
		}
	}

}
