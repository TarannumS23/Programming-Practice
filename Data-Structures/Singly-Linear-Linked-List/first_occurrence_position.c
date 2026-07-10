/*
    first Occurrence Position
    Return position of first occurrence.
*/

#include<stdio.h>
#include<stdlib.h>

struct node
{
    int data;
    struct node * next;
};

typedef struct node NODE;
typedef struct node * PNODE;
typedef struct node ** PPNODE;

int FirstOccur(PNODE first, int iNo)
{
    int iCount = 1;

    while(first != NULL)
    {
        if(first->data == iNo)
        {
            return iCount;
        }
        
        iCount++;
        first = first->next; 
    }
    return -1;
}

void Display(PNODE first)
{
    while(first != NULL)
    {
        printf("| %d | -> ",first->data);
        first = first->next;
    }

    printf("NULL\n");
}

void InsertLast(PPNODE first, int iNo)
{
    PNODE newn = NULL;
    PNODE temp = NULL;

    newn = (PNODE)malloc(sizeof(NODE));

    newn->data = iNo;
    newn->next = NULL;

    if(*first == NULL)
    {
        *first = newn;
    }
    else
    {
        temp = *first;

        while(temp->next != NULL)
        {
            temp = temp->next;
        }
        temp -> next = newn;
    }

}

int main()
{
    PNODE head = NULL;
    int iRet =  0;
    
    InsertLast(&head,11);
    InsertLast(&head,22);
    InsertLast(&head,51);
    InsertLast(&head,102);
    InsertLast(&head,51);

    Display(head);

    iRet = FirstOccur(head,51);

    printf("Position of first occurrence is : %d\n",iRet);

    return 0;
}