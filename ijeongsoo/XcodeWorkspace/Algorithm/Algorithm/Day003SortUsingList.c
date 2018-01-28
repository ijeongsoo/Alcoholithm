//
//  Day003SortUsingList.c
//  Algorithm
//
//  Created by 이 정수 on 2018. 1. 28..
//  Copyright © 2018년 이 정수. All rights reserved.
//

#include <stdio.h>
#include <stdlib.h>


typedef struct _node{
    int value;
    int node_no;
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
void sort(list * lptr);
int searchByIndex(list * lptr, int index);
void sinsert(list * lptr, int value, int position);

int main(int argv, const char * argc[]){
    list * list_1 = (list *)malloc(sizeof(list));
    init(list_1);
    for(int i=1; i<=10; i++){
        int input;
        scanf("%d", &input);
        insert(list_1, input, i);
    }
    
    sort(list_1);
    
    print(list_1);
}

void sort(list * lptr){
    for(int i=10; i>1; i--){
        for(int j=1; j<=i-1; j++){
            if(searchByIndex(lptr, j)>searchByIndex(lptr, j+1)){
                sinsert(lptr,searchByIndex(lptr, j+1) , j);
                delete(lptr, j+2);
                
            }
        }
    }
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
        new_node->node_no=position;
        
        if(position==1){
            new_node->next=new_node;
            new_node->prev=new_node;
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

void sinsert(list * lptr, int value, int position){
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

int searchByIndex(list * lptr, int index){
    nptr temp = lptr->head;
    for(int i=0; i<index-1; i++){
        temp=temp->next;
    }
    return temp->value;
}

void print(list * lptr){
    nptr temp = lptr->head;
    for(int i=0; i<(lptr->count); i++){
        printf("%d ", temp->value);
        temp=temp->next;
    }
    printf("\n");
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

