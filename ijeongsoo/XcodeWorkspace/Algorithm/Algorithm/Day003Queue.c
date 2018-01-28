//
//  Day003Queue.c
//  Algorithm
//
//  Created by 이 정수 on 2018. 1. 28..
//  Copyright © 2018년 이 정수. All rights reserved.
//

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct _node
{
    int data;
    struct _node *next;
}node;

typedef node * nptr;

typedef struct _queue
{
    node *front;
    node *rear;
    int count;
}queue;

void init(queue * qptr);
void enqueue(queue * qptr, int data);
int dequeue(queue *qptr);

int main(void)
{
    int i;
    queue * queue_1= (queue *)malloc(sizeof(queue));
    
    init(queue_1);
    for (i = 1; i <= 5; i++)
    {
        enqueue(queue_1, i);
    }

    printf("%d\n", dequeue(queue_1));
    printf("%d\n", dequeue(queue_1));

    printf("%d\n", dequeue(queue_1));

    return 0;
}

void init(queue * qptr)
{
    qptr->front = qptr->rear = NULL;
    qptr->count = 0;
}

void enqueue(queue *qptr, int data)
{
    nptr new_node = (node *)malloc(sizeof(node));
    new_node->data = data;
    new_node->next = NULL;
    
    if (qptr->count==0){
        qptr->front = new_node;
    }else{
        qptr->rear->next = new_node;
    }
    qptr->rear = new_node;
    qptr->count++;
}

int dequeue(queue *qptr)
{
    nptr d_node;
    int result;
    if (qptr->count==0)
    {
        return 0;
    }
    d_node = qptr->front;
    result = d_node->data;
    qptr->front = d_node->next;
    free(d_node);
    qptr->count--;
    return result;
}
