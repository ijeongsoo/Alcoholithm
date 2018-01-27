//
//  doubleLinkedList.c
//  algorithmStudy
//
//  Created by 이 정수 on 2018. 1. 18..
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
void search(list * lptr, int value);
void modify(list * lptr, int value, int position);


int main(int argv, const char * argc[]){
    list * list_1 = (list *)malloc(sizeof(list));
    
    init(list_1);
    insert(list_1, 1, 1);
    insert(list_1, 2, 2);
    insert(list_1, 3, 3);
    insert(list_1, 4, 4);
    printf("%d\n", list_1->head->value);
    printf("%d\n", list_1->head->next->value);
    printf("%d\n", list_1->head->next->value);
    return 0;
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
            lptr->head=new_node;
            new_node->next=new_node;
            new_node->prev=new_node;
        }else{
            nptr temp = lptr->head;
            for(int i=0; i<position-2;i++){
                temp=temp->next;
            }
            new_node->next=temp->next;
            new_node->next->prev=new_node;
            temp->next=new_node;
            new_node->prev=temp;
        }
        lptr->count++;
    }
}
















