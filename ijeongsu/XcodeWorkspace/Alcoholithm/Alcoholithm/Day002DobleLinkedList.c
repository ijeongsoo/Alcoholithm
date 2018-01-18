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
            temp->next=
        }
    }
}














