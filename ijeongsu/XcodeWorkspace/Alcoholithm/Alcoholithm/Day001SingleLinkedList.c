//
//  main.c
//  algorithmStudy
//
//  Created by 이 정수 on 2018. 1. 16..
//  Copyright © 2018년 이 정수. All rights reserved.
//

#include <stdio.h>
#include <stdlib.h>

typedef struct _node{
    int value;
    struct _node * link;
}node;

typedef node * nptr;

typedef struct _list{
    node * head;
    int count;
}list;

void init(list * lptr);
void insert(list * lptr, int value, int position);
void delete(list * lptr, int position);
int search(list * lptr, int value);
void modify(list * lptr, int value, int position);
void printList(list * lptr);



int main(int argc, const char * argv[]) {
    // insert code here...
    list * list_1 = (list *)malloc(sizeof(list));
    printf("tst");
    
    init(list_1);
    fputs("hh", stdout);
    insert(list_1, 1, 1);
    printf("tst");
    
    insert(list_1, 2, 2);
    //insert(list_1, 3, 3);
    //insert(list_1, 4, 4);
    printf("%d", search(list_1, 3));
    return 0;
}


void init(list * lptr){
    lptr->head=NULL;
    lptr->count=0;
}

void insert(list * lptr, int value, int position){
    if(position<1 || position>(lptr->count)+1){
        printf("memory overflow");
    }else{
        nptr new_node=(node*)malloc(sizeof(node));
        new_node->value=value;
        
        if(position==1){
            new_node->link=lptr->head;
            lptr->head=new_node;
        }else{
            nptr temp = lptr->head;
            for(int i=0; i<position-2; i++){
                temp=temp->link;
            }
            
            new_node->link=temp->link;
            temp->link=new_node;
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
            lptr->head=d_node->link;
            free(d_node);
        }else{
            for(int i=0; i<position-1; i++){
                d_node = d_node->link;
            }
            d_node->link=d_node->link->link;
        }
        lptr->count--;
    }
}

int search(list * lptr, int value){
    nptr temp = lptr->head;
    for(int i=0; i<lptr->count-1; i++){
        temp=temp->link;
        if(temp->value==value){
            return i+1;
        }
    }
    return -1;
}

void modify(list * lptr, int value, int position){
    if(position<1 || position>(lptr->count)+1){
        printf("memory overflow");
    }else{
        nptr temp = lptr->head;
        for(int i=0; i<position-1; i++){
            temp=temp->link;
        }
        temp->value=value;
    }
}


















