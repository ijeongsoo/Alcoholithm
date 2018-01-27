#include <stdio.h>


void shellSort(int* arr, int size){
	int i,j;
	int start;
	int next;
	int gap = size;
	do{
		gap /= 2;
		for(start = 0; start< gap; start++){
			for(i = start; i<size;i += gap){
				next = arr[i];
				printf("i 처음 = %d", i);
				printf("\n");
				for(j = i - gap; j>=0 && arr[j] > next; j-=gap){
					printf("j = %d ", j);
					arr[j+gap] = arr[j];
				}
				arr[j+gap] = next;
				printf("\n");
			}
		}
	}
	while(gap>1);


}
void Shellsort(int A[], int N) 

{ 
int i, j, Increment;
int Tmp;
int k;
for(Increment=N/2; Increment>0; Increment/=2){
	
	for(i=Increment; i<N; i++){ 
			Tmp=A[i];
			//printf("tmp %d\n", Tmp);
			for(j=i; j>=Increment; j-=Increment){ 
				if(Tmp < A[j-Increment]){
				//	printf("A[j-increment] : %d\n", A[j-Increment]);
					A[j]=A[j-Increment]; 
				}
				else{ 
					break;
				}
			}
			A[j]=Tmp; 
		}
	printf("회전 \n");
	for(k = 0; k<10; k++){
		printf("%d ", A[k]);
	}
			printf("\n");
}
} 


int main(){
	int i, j, index, temp;
	int size = 10;
	int optimum = (size/3) - 1;
	int arr[10] = {2,7,3,9,0,8,6,5,4,1};

	
	for(i = 0; i<size; i++){
		printf("%d ", arr[i]);
	}
	printf("\n");

	Shellsort(arr, size);

	for(i = 0; i<size; i++){
		printf("%d ", arr[i]);
	}


}