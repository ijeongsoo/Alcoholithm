//
//  Day003Heap.c
//  Algorithm
//
//  Created by 이 정수 on 2018. 1. 28..
//  Copyright © 2018년 이 정수. All rights reserved.
//

#include <stdio.h>

#define LEFT_CHILD(x)    (2*x + 1)
#define RIGHT_CHILD(x) (2*x + 2)
#define PARENT(x)        ((x-1)/2)
#define SWAP(a,b)  {int t; t = a; a=b; b=t;}

void init(int *hptr, int n);
void viewArr(int *arr, int n);

int main(void)
{
    int arr[10] = { 1,2,3,4,5,6,7,8,9,10 };
    viewArr(arr, 10);
    init(arr, 10);
    return 0;
}


void init(int *hptr, int n)
{
    int parent = 0;
    int node;
    int i;
    for (i = 1; i<n; i++)
    {
        node = i;
        while (node>0)
        {
            parent = PARENT(node);
            if (hptr[node]>hptr[parent])
            {
                SWAP(hptr[node], hptr[parent]);
                node = parent;
            }
            else
            {
                break;
            }
        }
    }
    viewArr(hptr, i);

}


void viewArr(int *arr, int n)
{
    int i = 0;
    for (i = 0; i<n; i++)
    {
        printf("%d ", arr[i]);
    }
    printf("\n");
}
