#include <stdio.h>
#include <stdlib.h>

#define DIGITSIZE 1 //���� �Է��� �� �ڸ�������

typedef struct Node{
	int data;
	struct Node* next;
}Node;
typedef struct Queue{
	Node* front;
	Node* rear;
	int count;
}Queue;
void initQueue(Queue* queue);
int isEmpty(Queue* queue);
void enQueue(Queue* queue, int data);
int deQueue(Queue* queue);
void radixSort(int arr[], int size);
void initQueue(Queue* queue){
	queue->front = queue->rear = NULL;
	queue->count = 0;
}
int isEmpty(Queue* queue){
	return queue->count == 0;
}
void enQueue(Queue* queue, int data){
	Node* newNode = (Node *)malloc(sizeof(Node)); //��� ����
	newNode ->data = data; //������ ����
	newNode ->next = NULL;
	if(isEmpty(queue)){ //ť�� �������
		queue ->front = newNode;// �Ǿ��� newNode�� ����Ŵ
	}
	else{//������� �ʴٸ�
		queue ->rear->next = newNode;//�ǵڸ� newNode�� ����Ŵ
	}
	queue ->rear = newNode;//�� �ڸ� newNode�� ����Ŵ
	queue ->count++;//ť ���� ��� �� ����
}
int deQueue(Queue* queue){
	Node *newNode;
	int ret = 0;

	if(isEmpty(queue)){
		return ret;
	}
	newNode = queue->front; //�Ǿ��� ��带 ����Ŵ
	ret = newNode->data;
	queue -> front = newNode ->next;
	free(newNode);
	queue->count--;
	return ret;
}
void radixSort(int arr[], int ssize){
	int size = ssize;
	Queue queue[10];
	int bucket_Num; //��Ŷ ť ��ȣ
	int digitNum; //������� �� ����
	int arrNum; //�迭 ��ȣ ����
	int factor; //�ڸ��� �μ� ����
	
	//��� ������ ���� ť �ʱ�ȭ
	for(bucket_Num = 0; bucket_Num<ssize; bucket_Num++){
		initQueue(&queue[bucket_Num]);//�ʱ�ȭ
	}
	factor = 1; //�ڸ���

	// �ڸ����� ��� ���� �ϱ� ���� �ݺ���
	for(digitNum = 0; digitNum<DIGITSIZE; digitNum++){
		//������� �ڸ������� �����͸� ��Ŷ�� �ְ� ����
		for(bucket_Num = 0; bucket_Num<ssize; bucket_Num++){
			 enQueue(&queue[(arr[bucket_Num] / factor) % 10], arr[bucket_Num]);
		}
		bucket_Num = 0;
		arrNum = 0;

		//������ ��ü�� ��Ŷť ��ü���� ���� �迭�� �ִ´�.
		while(bucket_Num<size){
			//��Ŷ ť ���� ��� �ִ� ������ ��ü�� ���� �迭�� �ִ´�.
			while(!(isEmpty(&queue[bucket_Num]))){
				arr[arrNum] = deQueue(&queue[bucket_Num]);
				arrNum++;  //�迭 ��ȣ 1 ����
			}
			bucket_Num++; //��Ŷ ť ��ȣ 1����
		}
		factor*=10; //�ڸ��� ����

	}

}
int main(){
	int i;
	int arr[10] = {2,5,4,7,6,8,9,1,3,0}; 
	Node* newNode = (Node *)malloc(sizeof(Node));
	Queue* queue = (Queue*)malloc(sizeof(Queue));
	printf("��� ���� ��\n");
	for(i = 0; i<10; i++){
		printf("%d ", arr[i]);
	}
	printf("\n");
	printf("��� ���� ��\n");
	radixSort(arr,10);
	for(i = 0; i<10; i++){
		printf("%d ", arr[i]);
	}
	
	/*
    for (i = 1; i <= 5; i++)//1~5���� ť�� ����
    {
        enQueue(queue, i);
    }
    while (!isEmpty(queue))//ť�� ������� �ʴٸ� �ݺ�
    {
        printf("%d ", deQueue(queue));//ť���� ������ �� ���
    }
    printf("\n");
	*/

    return 0;


}	