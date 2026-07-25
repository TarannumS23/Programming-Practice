// Doubly LL using CPP without typedef
#include<iostream>
using namespace std;

#pragma pack(1)
struct node
{
    int data;
    struct node *next;
    struct node *prev;                  
};

class DoublyLL
{
    private:
        struct node * first;            
        int iCount;

    public:
        DoublyLL();              
        void Display();
        int Count();
        void InsertFirst(int iNo);          
        void InsertLast(int iNo);
        void InsertAtPos(int iNo, int iPos);
        void DeleteFirst();
        void DeleteLast();
        void DeleteAtPos(int iPos);
};

DoublyLL::DoublyLL()                  
{
    this->first = NULL;         
    this->iCount = 0;
}

void DoublyLL :: Display()
{
    struct node * temp = NULL;

    temp = this->first;

    while(temp != NULL)
    {
        cout<<"| "<<temp->data<<" | <=> ";
        temp = temp->next;
    }
    cout<<"NULL"<<endl;
}

int DoublyLL :: Count()
{
    return this->iCount;
}

void DoublyLL :: InsertFirst(int iNo)
{
    struct node * newn = NULL;

    newn = new struct node ;

    newn->data = iNo;
    newn->next = NULL;
    newn->prev = NULL;

    if(this->first == NULL)
    {
        this->first = newn;
    }
    else
    {
        newn->next = this->first;
        this->first->prev = newn;            // $
        this->first = newn;
    }
    this->iCount++;
}

void DoublyLL :: InsertLast(int iNo)
{
    struct node * newn = NULL;
    struct node * temp = NULL;

    newn = new struct node ;

    newn->data = iNo;
    newn->next = NULL;
    newn->prev = NULL;

    if(this->first == NULL)
    {
        this->first = newn;
    }
    else
    {
        temp = this->first;

        while(temp->next != NULL)
        {
            temp = temp->next;
        }

        temp->next = newn;
        newn->prev = temp;              
    }

    this->iCount++;
}

void DoublyLL :: InsertAtPos(int iNo, int iPos)
{
    int i = 0;
    struct node * temp = NULL;
    struct node * newn = NULL;

    if((iPos < 1) || (iPos > iCount+1))               
    {
        cout<<"Invalid Position\n";
        return;
    }

    if(iPos == 1)
    {
        this->InsertFirst(iNo);
    }
    else if(iPos == iCount+1)
    {
        this->InsertLast(iNo);
    }
    else
    {
        temp = this->first;

        newn = new struct node;

        newn->data = iNo;
        newn->next = NULL;
        newn->prev = NULL;

        for(i = 1; i < iPos-1; i++)
        {
            temp = temp->next;
        }

        newn->next = temp->next;
        temp->next->prev = newn;          
        temp->next = newn;
        newn->prev = temp;               

        this->iCount++;
    }
}

void DoublyLL :: DeleteFirst()
{
    struct node * temp = NULL;

    if(this->first == NULL)
    {
        return;
    }
    else if(this->first->next == NULL)
    {
        delete this->first;
        this->first = NULL;
    }
    else
    {
        temp = this->first;

        this->first = this->first->next;
        delete temp;
        this->first->prev = NULL;                // $
    }

    this->iCount--;
}

void DoublyLL :: DeleteLast()
{
    struct node * temp = NULL;

    if(this->first == NULL)
    {
        return;
    }
    else if(this->first->next == NULL)
    {
        delete this->first;
        this->first = NULL;
    }
    else
    {
        temp = this->first;

        while(temp->next->next != NULL)
        {
            temp = temp->next;
        }

        delete temp->next;
        temp->next = NULL;
    }

    this->iCount--;
}

void DoublyLL :: DeleteAtPos(int iPos)
{
    int i = 0;
    struct node * temp = NULL;

    if((iPos < 1) || (iPos > iCount))              
    {
        cout<<"Invalid Position\n";
        return;
    }

    if(iPos == 1)
    {
        this->DeleteFirst();
    }
    else if(iPos == iCount)
    {
        this->DeleteLast();
    }
    else
    {
        temp = this->first;

        for(i = 1; i < iPos-1; i++)
        {
            temp = temp->next;
        }

        temp->next = temp->next->next;
        delete temp->next->prev;             
        temp->next->prev = temp;             

        this->iCount--;
    }
}

int main()
{
    DoublyLL dobj;
    int iRet = 0;

    dobj.InsertFirst(51);
    dobj.InsertFirst(21);
    dobj.InsertFirst(11);

    dobj.InsertLast(101);
    dobj.InsertLast(111);
    dobj.InsertLast(121);

    dobj.Display();

    iRet = dobj.Count();

    cout<<"Number of elements are : "<<iRet<<endl;

    dobj.DeleteFirst();

    dobj.Display();

    iRet = dobj.Count();

    cout<<"Number of elements are : "<<iRet<<endl;

    dobj.DeleteLast();

    dobj.Display();

    iRet = dobj.Count();

    cout<<"Number of elements are : "<<iRet<<endl;

    dobj.InsertAtPos(105,4);

    dobj.Display();

    iRet = dobj.Count();

    cout<<"Number of elements are : "<<iRet<<endl;

    dobj.DeleteAtPos(4);

    dobj.Display();

    iRet = dobj.Count();

    cout<<"Number of elements are : "<<iRet<<endl;

    return 0;
}

/*
C:\Users\ASUS\Desktop\LB\DS>g++ program463.cpp -o Myexe

C:\Users\ASUS\Desktop\LB\DS>Myexe
| 11 | <=> | 21 | <=> | 51 | <=> | 101 | <=> | 111 | <=> | 121 | <=> NULL
Number of elements are : 6
| 21 | <=> | 51 | <=> | 101 | <=> | 111 | <=> | 121 | <=> NULL
Number of elements are : 5
| 21 | <=> | 51 | <=> | 101 | <=> | 111 | <=> NULL
Number of elements are : 4
| 21 | <=> | 51 | <=> | 101 | <=> | 105 | <=> | 111 | <=> NULL
Number of elements are : 5
| 21 | <=> | 51 | <=> | 101 | <=> | 111 | <=> NULL
Number of elements are : 4

*/