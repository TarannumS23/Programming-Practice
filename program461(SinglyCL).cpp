// Singly Circular Linked List in CPP without typedef

#include<iostream>
using namespace std;

#pragma pack(1)
struct node
{
    int data;
    struct node *next;
};

class SinglyCL
{
    private:
        int iCount;
        struct node * first;
        struct node * last;

    public:
        SinglyCL();

        void Display();
        int Count();

        void InsertFirst(int iNo);
        void InsertLast(int iNo);
        void InsertAtPos(int iNo, int iPos);

        void DeleteFirst();
        void DeleteLast();
        void DeleteAtPos(int iPos);
};

SinglyCL :: SinglyCL()
{
    this->first = NULL;
    this->last = NULL;
    this->iCount = 0;
}

void SinglyCL :: Display()
{
    struct node * temp = NULL;

    if(first == NULL && last == NULL)
    {
        return;
    }

    temp = first;

    do
    {
        cout<<"| "<<temp->data<<" | -> ";
        temp = temp->next;
    } while(last->next != temp);

    cout<<"\n";
    
}

int SinglyCL :: Count()
{
    int iCount = 0;

    if(this->first == NULL && this->last == NULL)
    {
        return iCount;
    }

    do
    {
        iCount++;
        first = first->next;
    } while (first != last->next);

    return iCount;
}

void SinglyCL :: InsertFirst(int iNo)
{
    struct node * newn = NULL;

    newn = new(struct node);

    newn->next = NULL;
    newn->data = iNo;

    if(first == NULL && last == NULL)
    {
        first = newn;
        last = newn;
    }
    else
    {
        newn->next = first;
        first = newn;
    }

    last->next = first;                 // no sideeffect line 
    
    iCount++;
}

void SinglyCL :: InsertLast(int iNo)
{
    struct node * newn = NULL;

    newn = new(struct node);

    newn->next = NULL;
    newn->data = iNo;

    if(first == NULL && last == NULL)
    {
        first = newn;
        last = newn;
    }
    else
    {
        last->next = newn;
        last = newn;
    }

    last->next = first;
    iCount++;
}

void SinglyCL :: InsertAtPos(int iNo, int iPos)
{
    int i = 0;

    struct node * temp = NULL;
    struct node * newn = NULL;

    iCount = Count();

    if((iPos < 1) || (iPos > iCount+1))
    {
        printf("Invalid Position");
        return;
    }

    if(iPos == 1)
    {
        InsertFirst(iNo);
    }
    else if(iPos == iCount+1)
    {
        InsertLast(iNo);
    }
    else
    {
        temp = this->first;

        newn = new struct node;

        newn->data = iNo;
        newn->next = NULL;

        for(i = 1; i < iPos-1; i++)
        {
            temp = temp->next;
        }

        newn->next = temp->next;
        temp->next = newn; 
        
        this->iCount++;
    }
}

void SinglyCL :: DeleteFirst()
{

    if(this->first == NULL && this->last == NULL)
    {
        return;
    }
    else if(this->first == this->last)
    {
        delete this->first;
        this->first = NULL;
        this->last = NULL;
    }
    else
    {
        this->first = this->first->next;
        delete this->last->next;

        this->last->next = this->first;
    }

    iCount--;
}

void SinglyCL :: DeleteLast()
{
    struct node * temp = NULL;

    if(this->first == NULL && this->last == NULL)
    {
        return;
    }
    else if(this->first == this->last)
    {
        delete this->first;
        this->first = NULL;
        this->last = NULL;
    }
    else
    {
        temp = this->last;

        while(temp->next != this->last)
        {
            temp = temp->next;
        }

        delete this->last;                             
        this->last = temp;

        this->last->next = this->first;
    }

    iCount--;
}

void SinglyCL :: DeleteAtPos(int iPos)
{
    int i = 0;

    struct node * temp = NULL;
    struct node * target = NULL;

    iCount = Count();

    if((iPos < 1) || (iPos > iCount))
    {
        printf("Invalid Position");
        return;
    }

    if(iPos == 1)
    {
        DeleteFirst();
    }
    else if(iPos == iCount)
    {
        DeleteLast();
    }
    else
    {
        temp = this->first;

        for(i = 1; i < iPos-1; i++)
        {
            temp = temp->next;
        }

        target = temp->next;
        temp->next = target->next;
        delete target;

        this->iCount--;
              
    }
}

int main()
{
    SinglyCL sobj;
    int iRet = 0;

    sobj.InsertFirst(51);
    sobj.InsertFirst(21);
    sobj.InsertFirst(11);

    sobj.InsertLast(101);
    sobj.InsertLast(111);
    sobj.InsertLast(121);

    sobj.Display();

    iRet = sobj.Count();

    cout<<"Number of nodes are : "<<iRet<<"\n";

    sobj.DeleteFirst();

    sobj.Display();

    iRet = sobj.Count();

    cout<<"Number of nodes are : "<<iRet<<"\n";

    sobj.DeleteLast();

    sobj.Display();

    iRet = sobj.Count();

    cout<<"Number of nodes are : "<<iRet<<"\n";

    sobj.InsertAtPos(105,4);

    sobj.Display();

    iRet = sobj.Count();

    cout<<"Number of nodes are : "<<iRet<<"\n";

    sobj.DeleteAtPos(4);

    sobj.Display();

    iRet = sobj.Count();

    cout<<"Number of nodes are : "<<iRet<<"\n";

    return 0;
}



/*
C:\Users\ASUS\Desktop\LB\DS>g++ program431.cpp -o Myexe

C:\Users\ASUS\Desktop\LB\DS>Myexe
| 11 | -> | 21 | -> | 51 | -> | 101 | -> | 111 | -> | 121 | ->
Number of nodes are : 6
| 21 | -> | 51 | -> | 101 | -> | 111 | -> | 121 | ->
Number of nodes are : 5
| 21 | -> | 51 | -> | 101 | -> | 111 | ->
Number of nodes are : 4
| 21 | -> | 51 | -> | 101 | -> | 105 | -> | 111 | ->
Number of nodes are : 5
| 21 | -> | 51 | -> | 101 | -> | 111 | ->
Number of nodes are : 4
*/