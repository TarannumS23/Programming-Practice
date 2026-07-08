/*
    Serach an Element
    Check whether a number is present.
*/

#include<stdio.h>
#include<stdlib.h>

struct node
{
    int data;
    struct node * next;
};

typedef int BOOL;
typedef struct node NODE;
typedef struct node * PNODE;
typedef struct node ** PPNODE;

#define TRUE 1
#define FALSE 0

BOOL Search(PNODE first, int iNo)
{
    while(first != NULL)
    {
        if(first->data == iNo)
        {
            return TRUE;
        }
        first = first->next;
    }
    
    return FALSE;
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
    BOOL bRet =  FALSE;
    
    InsertLast(&head,11);
    InsertLast(&head,21);
    InsertLast(&head,51);
    InsertLast(&head,101);

    Display(head);

    bRet = Search(head,11);

    if(bRet == TRUE)
    {
        printf("Element is present \n");
    }
    else
    {
        printf("Element is not present\n");
    }

    return 0;
}