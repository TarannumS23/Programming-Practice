// complete code of Singly LL using cpp without typedef

#include<iostream>
using namespace std;

#pragma pack(1)
struct node
{
    int data;
    struct node *next;
};

class SinglyLL
{
    private:
        struct node * first;             
        int iCount;

    public:
        SinglyLL();              
        void Display();
        int Count();
        void InsertFirst(int iNo);          
        void InsertLast(int iNo);
        void InsertAtPos(int iNo, int iPos);
        void DeleteFirst();
        void DeleteLast();
        void DeleteAtPos(int iPos);
};

SinglyLL::SinglyLL()                  
{
    this->first = NULL;         
    this->iCount = 0;
}

void SinglyLL :: Display()
{
    struct node * temp = NULL;

    temp = this->first;

    while(temp != NULL)                           
    {
        cout<<"| "<<temp->data<<" | -> ";
        temp = temp->next;
    }
    cout<<"NULL"<<endl;   
}

int SinglyLL :: Count()
{
    return this->iCount;
}

void SinglyLL :: InsertFirst(int iNo)
{
    struct node * newn = NULL;

    newn = new struct node;                           

    newn->data = iNo;
    newn->next = NULL;

    if(this->first == NULL)                   
    {
        this->first = newn;
    }
    else
    {
        newn->next = this->first;
        this->first = newn;
    }

    this->iCount++;                           
}

void SinglyLL :: InsertLast(int iNo)
{
    struct node * newn = NULL;
    struct node * temp = NULL; 

    newn = new struct node;                           

    newn->data = iNo;
    newn->next = NULL;

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
    }

    this->iCount++;                           
}

void SinglyLL :: InsertAtPos(int iNo, int iPos)
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
        newn = new struct node;

        newn->data = iNo;
        newn->next = NULL;

        temp = this->first;

        for(i = 1; i < iPos-1; i++)
        {
            temp = temp->next;
        }

        newn->next = temp->next;
        temp->next = newn;

        this->iCount++;                            
    }
    
}

void SinglyLL :: DeleteFirst()
{
    struct node * temp = NULL;

    if(this->first == NULL)                  
    {
        return;
    }
    else if(this->first->next == NULL)         
    {
        delete(this->first);
        this->first = NULL;
    }
    else                                     
    {
        temp = this->first;

        this->first = this->first->next;

        delete temp ;
    }

    this->iCount--;                           
}

void SinglyLL :: DeleteLast()
{
    struct node * temp = NULL;

    if(this->first == NULL)                  
    {
        return;
    }
    else if(this->first->next == NULL)         
    {
        delete(this->first);
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

void SinglyLL :: DeleteAtPos(int iPos)
{
    int i = 0;
    struct node * temp = NULL;
    struct node * target = NULL;

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

        target = temp->next;
        temp->next = target->next;
        delete target;

        this->iCount--;                            
    }
}

int main()
{
    int iRet = 0;

    SinglyLL sobj;

    sobj.InsertFirst(51);
    sobj.InsertFirst(21);
    sobj.InsertFirst(11);

    sobj.Display();

    iRet = sobj.Count();

    cout<<"Number of elements are : "<<iRet<<endl;

    sobj.InsertLast(101);
    sobj.InsertLast(111);
    sobj.InsertLast(121);

    sobj.Display();

    iRet = sobj.Count();

    cout<<"Number of elements are : "<<iRet<<endl;

    sobj.DeleteFirst();

    sobj.Display();

    iRet = sobj.Count();

    cout<<"Number of elements are : "<<iRet<<endl;

    sobj.DeleteLast();

    sobj.Display();

    iRet = sobj.Count();

    cout<<"Number of elements are : "<<iRet<<endl;

    sobj.InsertAtPos(105,4);

    sobj.Display();

    iRet = sobj.Count();

    cout<<"Number of elements are : "<<iRet<<endl;

    sobj.DeleteAtPos(4);

    sobj.Display();

    iRet = sobj.Count();

    cout<<"Number of elements are : "<<iRet<<endl;

    return 0;
}

/*
C:\Users\ASUS\Desktop\LB\DS>g++ program462.cpp -o Myexe

C:\Users\ASUS\Desktop\LB\DS>Myexe
| 11 | -> | 21 | -> | 51 | -> NULL
Number of elements are : 3
| 11 | -> | 21 | -> | 51 | -> | 101 | -> | 111 | -> | 121 | -> NULL
Number of elements are : 6
| 21 | -> | 51 | -> | 101 | -> | 111 | -> | 121 | -> NULL
Number of elements are : 5
| 21 | -> | 51 | -> | 101 | -> | 111 | -> NULL
Number of elements are : 4
| 21 | -> | 51 | -> | 101 | -> | 105 | -> | 111 | -> NULL
Number of elements are : 5
| 21 | -> | 51 | -> | 101 | -> | 111 | -> NULL
Number of elements are : 4

----------------------------------------------------------

// RULES //
always use this keyword
declaration - inside class
definition - outside the class
first and iCount in private access specifier
*/