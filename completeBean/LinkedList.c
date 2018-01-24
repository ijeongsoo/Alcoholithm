#include <stdio.h>
#include <stdlib.h>

#define DIGITSIZE 1 //들어온 입력의 몇 자리수인지

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
	Node* newNode = (Node *)malloc(sizeof(Node)); //노드 생성
	newNode ->data = data; //데이터 삽입
	newNode ->next = NULL;
	if(isEmpty(queue)){ //큐가 비었으면
		queue ->front = newNode;// 맨앞을 newNode를 가리킴
	}
	else{//비어있지 않다면
		queue ->rear->next = newNode;//맨뒤를 newNode로 가리킴
	}
	queue ->rear = newNode;//맨 뒤를 newNode를 가리킴
	queue ->count++;//큐 안의 노드 수 증가
}
int deQueue(Queue* queue){
	Node *newNode;
	int ret = 0;

	if(isEmpty(queue)){
		return ret;
	}
	newNode = queue->front; //맨앞의 노드를 기억시킴
	ret = newNode->data;
	queue -> front = newNode ->next;
	free(newNode);
	queue->count--;
	return ret;
}
void radixSort(int arr[], int ssize){
	int size = ssize;
	Queue queue[10];
	int bucket_Num; //버킷 큐 번호
	int digitNum; //기수단위 수 변수
	int arrNum; //배열 번호 변수
	int factor; //자릿수 인수 변수
	
	//기수 정렬을 행할 큐 초기화
	for(bucket_Num = 0; bucket_Num<ssize; bucket_Num++){
		initQueue(&queue[bucket_Num]);//초기화
	}
	factor = 1; //자릿수

	// 자리수별 기수 정렬 하기 위한 반복문
	for(digitNum = 0; digitNum<DIGITSIZE; digitNum++){
		//기수단위 자릿수별로 데이터를 버킷에 넣고 정렬
		for(bucket_Num = 0; bucket_Num<ssize; bucket_Num++){
			 enQueue(&queue[(arr[bucket_Num] / factor) % 10], arr[bucket_Num]);
		}
		bucket_Num = 0;
		arrNum = 0;

		//데이터 전체를 버킷큐 전체에서 꺼내 배열에 넣는다.
		while(bucket_Num<size){
			//버킷 큐 별로 들어 있는 데이터 전체를 꺼내 배열에 넣는다.
			while(!(isEmpty(&queue[bucket_Num]))){
				arr[arrNum] = deQueue(&queue[bucket_Num]);
				arrNum++;  //배열 번호 1 증가
			}
			bucket_Num++; //버킷 큐 번호 1증가
		}
		factor*=10; //자릿수 증가

	}

}
int main(){
	int i;
	int arr[10] = {2,5,4,7,6,8,9,1,3,0}; 
	Node* newNode = (Node *)malloc(sizeof(Node));
	Queue* queue = (Queue*)malloc(sizeof(Queue));
	printf("기수 정렬 전\n");
	for(i = 0; i<10; i++){
		printf("%d ", arr[i]);
	}
	printf("\n");
	printf("기수 정렬 후\n");
	radixSort(arr,10);
	for(i = 0; i<10; i++){
		printf("%d ", arr[i]);
	}
	
	/*
    for (i = 1; i <= 5; i++)//1~5까지 큐에 보관
    {
        enQueue(queue, i);
    }
    while (!isEmpty(queue))//큐가 비어있지 않다면 반복
    {
        printf("%d ", deQueue(queue));//큐에서 꺼내온 값 출력
    }
    printf("\n");
	*/

    return 0;


}	