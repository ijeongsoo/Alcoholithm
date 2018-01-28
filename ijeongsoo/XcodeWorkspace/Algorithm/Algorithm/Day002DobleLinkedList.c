//
//  Day002DobleLinkedList.c
//  Algorithm
//
//  Created by 이 정수 on 2018. 1. 28..
//  Copyright © 2018년 이 정수. All rights reserved.
//

#include <stdio.h>
#include <stdlib.h>


typedef struct _node{
    int value;
    struct _node * next;
    struct _node * prev;
}node;

typedef node * nptr;

typedef struct _list{
    int count;
    nptr head;
}list;

void init(list * lptr);
void insert(list * lptr, int value, int position);
void delete(list * lptr, int position);
int search(list * lptr, int value);
void modify(list * lptr, int value, int position);
void print(list * lptr);

int main(int argv, const char * argc[]){
    list * list_1 = (list *)malloc(sizeof(list));
    
    init(list_1);
    init(list_1);
    insert(list_1, 1, 1);
    insert(list_1, 2, 2);
    insert(list_1, 3, 3);
    insert(list_1, 4, 4);
    insert(list_1, 5, 2);
    insert(list_1, 6, 2);
    print(list_1);
    printf("%d\n", search(list_1, 4));
    
}

void print(list * lptr){
    nptr temp = lptr->head;
    for(int i=0; i<(lptr->count); i++){
        printf("%d ", temp->value);
        temp=temp->next;
    }
    printf("\n");
}

void init(list * lptr){
    lptr->count=0;
    lptr->head=NULL;
}

void insert(list * lptr, int value, int position){
    if(position<1|| position>lptr->count+1){
        printf("out of bounds\n");
    }else{
        nptr new_node = (node *)malloc(sizeof(node));
        new_node->value=value;
        
        if(position==1){
            new_node->next=lptr->head;
            new_node->prev=lptr->head;
            lptr->head=new_node;
        }else{
            nptr temp = lptr->head;
            for(int i=0; i<position-2;i++){
                temp=temp->next;
            }
            new_node->next=temp->next;
            temp->next=new_node;
            new_node->prev=temp;
        }
        lptr->count++;
    }
}



void delete(list * lptr, int position){
    if(position<1 || position>(lptr->count)){
        printf("out of bounds");
    }else{
        nptr d_node = lptr->head;
        
        if(position==1){
            lptr->head=d_node->next;
            d_node->next->prev=NULL;
            free(d_node);
        }else{
            for(int i=0; i<position-1; i++){
                d_node = d_node->next;
            }
            d_node->prev->next=d_node->next;
            d_node->next->prev=d_node->prev;
            free(d_node);
        }
        lptr->count--;
    }
}



int search(list * lptr, int value){
    nptr temp = lptr->head;
    for(int i=0; i<(lptr->count); i++){
        if(temp->value==value){
            return i+1;
        }
        temp=temp->next;
    }
    return -1;
}

void modify(list * lptr, int value, int position){
    if(position<1 || position>(lptr->count)+1){
        printf("memory overflow");
    }else{
        nptr temp = lptr->head;
        for(int i=0; i<position-1; i++){
            temp=temp->next;
        }
        temp->value=value;
    }
}

