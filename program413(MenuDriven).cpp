// Doubly LL using CPP
#include<iostream>
using namespace std;

#pragma pack(1)
struct node
{
    int data;
    struct node *next;
    struct node *prev;                  // $
};

typedef struct node NODE;
typedef struct node * PNODE;            // here PPNODE is not used coz we are not going to give or pass &head 

class DoublyLL
{
    private:
        PNODE first;             // 8 bytes
        int iCount;

    public:
        DoublyLL();              // function declaration
        void Display();
        int Count();
        void InsertFirst(int iNo);          // only 1 parameter not &first coz we are going to create object of this so no need to pass that just iNo
        void InsertLast(int iNo);
        void InsertAtPos(int iNo, int iPos);
        void DeleteFirst();
        void DeleteLast();
        void DeleteAtPos(int iPos);
};

DoublyLL::DoublyLL()                  // 1st - class name , 2nd - constructor name,   definition
{
    this->first = NULL;         
    this->iCount = 0;
}

void DoublyLL :: Display()
{
    PNODE temp = NULL;

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
    PNODE newn = NULL;

    newn = new NODE;

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
    PNODE newn = NULL;
    PNODE temp = NULL;

    newn = new NODE;

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
        newn->prev = temp;              // $
    }

    this->iCount++;
}

void DoublyLL :: InsertAtPos(int iNo, int iPos)
{
    int i = 0;
    PNODE temp = NULL;
    PNODE newn = NULL;

    if((iPos < 1) || (iPos > iCount+1))               //filter
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

        newn = new NODE;

        newn->data = iNo;
        newn->next = NULL;
        newn->prev = NULL;

        for(i = 1; i < iPos-1; i++)
        {
            temp = temp->next;
        }

        newn->next = temp->next;
        temp->next->prev = newn;          // $
        temp->next = newn;
        newn->prev = temp;                // $

        this->iCount++;
    }
}

void DoublyLL :: DeleteFirst()
{
    PNODE temp = NULL;

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
    PNODE temp = NULL;

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
    PNODE temp = NULL;

    if((iPos < 1) || (iPos > iCount))               //filter
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
        delete temp->next->prev;             // $
        temp->next->prev = temp;             // $

        this->iCount--;
    }
}

int main()
{
    DoublyLL dobj;

    int iChoice = 0;
    int iValue = 0;
    int iRet = 0;
    int iPosition = 0;

    while(iChoice != 9)                                   // unconditional loop , firat rahto joparyant break karat nahi
    {
        cout<<"------------------------------------\n";
        cout<<"Enter Your Choice\n";
        cout<<"------------------------------------\n";
        cout<<"1 : Insert node at first position\n";
        cout<<"2 : Insert node at last position\n";
        cout<<"3 : Insert node at given position\n";
        cout<<"4 : Delete node at first position\n";
        cout<<"5 : Delete node at last position\n";
        cout<<"6 : Delete node at given position\n";
        cout<<"7 : Display the elements\n";
        cout<<"8 : Count the number of elements\n";
        cout<<"9 : Terminate the application\n";
        cout<<"------------------------------------\n";

        cin>>iChoice;

        switch(iChoice)
        {
            case 1:
                cout<<"Enter the value : \n";
                cin>>iValue;
                dobj.InsertFirst(iValue);
                break;
            
            case 2:
                cout<<"Enter the value : \n";
                cin>>iValue;
                dobj.InsertLast(iValue);
                break;
            
            case 3:
                cout<<"Enter the value : \n";
                cin>>iValue;
                cout<<"Enter the position : \n";
                cin>>iPosition;
                dobj.InsertAtPos(iValue,iPosition);
                break;

            case 4:
                dobj.DeleteFirst();
                break;

            case 5:
                dobj.DeleteLast();
                break;

            case 6:
                cout<<"Enter the position : \n";
                cin>>iPosition;
                dobj.DeleteAtPos(iPosition);
                break;

            case 7:
                cout<<"Elements of the Linked List are : \n";
                dobj.Display();
                break;

            case 8:
                iRet = dobj.Count();
                cout<<"Number of elements are : "<<iRet<<"\n";
                break;

            case 9:
                cout<<"Thank you for using Marvellous Infosystems Application\n";
                break;

            default:
                cout<<"Invalid Choice\n";
        }
    }

    return 0;
}

/*
C:\Users\ASUS\Desktop\Programming-Practice>g++ program413(MenuDriven).cpp -o Myexe

C:\Users\ASUS\Desktop\Programming-Practice>Myexe
------------------------------------
Enter Your Choice
------------------------------------
1 : Insert node at first position
2 : Insert node at last position
3 : Insert node at given position
4 : Delete node at first position
5 : Delete node at last position
6 : Delete node at given position
7 : Display the elements
8 : Count the number of elements
9 : Terminate the application
------------------------------------
1
Enter the value :
21
------------------------------------
Enter Your Choice
------------------------------------
1 : Insert node at first position
2 : Insert node at last position
3 : Insert node at given position
4 : Delete node at first position
5 : Delete node at last position
6 : Delete node at given position
7 : Display the elements
8 : Count the number of elements
9 : Terminate the application
------------------------------------
1
Enter the value :
11
------------------------------------
Enter Your Choice
------------------------------------
1 : Insert node at first position
2 : Insert node at last position
3 : Insert node at given position
4 : Delete node at first position
5 : Delete node at last position
6 : Delete node at given position
7 : Display the elements
8 : Count the number of elements
9 : Terminate the application
------------------------------------
2
Enter the value :
51
------------------------------------
Enter Your Choice
------------------------------------
1 : Insert node at first position
2 : Insert node at last position
3 : Insert node at given position
4 : Delete node at first position
5 : Delete node at last position
6 : Delete node at given position
7 : Display the elements
8 : Count the number of elements
9 : Terminate the application
------------------------------------
2
Enter the value :
101
------------------------------------
Enter Your Choice
------------------------------------
1 : Insert node at first position
2 : Insert node at last position
3 : Insert node at given position
4 : Delete node at first position
5 : Delete node at last position
6 : Delete node at given position
7 : Display the elements
8 : Count the number of elements
9 : Terminate the application
------------------------------------
2
Enter the value :
111
------------------------------------
Enter Your Choice
------------------------------------
1 : Insert node at first position
2 : Insert node at last position
3 : Insert node at given position
4 : Delete node at first position
5 : Delete node at last position
6 : Delete node at given position
7 : Display the elements
8 : Count the number of elements
9 : Terminate the application
------------------------------------
2
Enter the value :
121
------------------------------------
Enter Your Choice
------------------------------------
1 : Insert node at first position
2 : Insert node at last position
3 : Insert node at given position
4 : Delete node at first position
5 : Delete node at last position
6 : Delete node at given position
7 : Display the elements
8 : Count the number of elements
9 : Terminate the application
------------------------------------
3
Enter the value :
4
Enter the position :
1
------------------------------------
Enter Your Choice
------------------------------------
1 : Insert node at first position
2 : Insert node at last position
3 : Insert node at given position
4 : Delete node at first position
5 : Delete node at last position
6 : Delete node at given position
7 : Display the elements
8 : Count the number of elements
9 : Terminate the application
------------------------------------
7
Elements of the Linked List are :
| 4 | <=> | 11 | <=> | 21 | <=> | 51 | <=> | 101 | <=> | 111 | <=> | 121 | <=> NULL
------------------------------------
Enter Your Choice
------------------------------------
1 : Insert node at first position
2 : Insert node at last position
3 : Insert node at given position
4 : Delete node at first position
5 : Delete node at last position
6 : Delete node at given position
7 : Display the elements
8 : Count the number of elements
9 : Terminate the application
------------------------------------
4
------------------------------------
Enter Your Choice
------------------------------------
1 : Insert node at first position
2 : Insert node at last position
3 : Insert node at given position
4 : Delete node at first position
5 : Delete node at last position
6 : Delete node at given position
7 : Display the elements
8 : Count the number of elements
9 : Terminate the application
------------------------------------
5
------------------------------------
Enter Your Choice
------------------------------------
1 : Insert node at first position
2 : Insert node at last position
3 : Insert node at given position
4 : Delete node at first position
5 : Delete node at last position
6 : Delete node at given position
7 : Display the elements
8 : Count the number of elements
9 : Terminate the application
------------------------------------
6
Enter the position :
4
------------------------------------
Enter Your Choice
------------------------------------
1 : Insert node at first position
2 : Insert node at last position
3 : Insert node at given position
4 : Delete node at first position
5 : Delete node at last position
6 : Delete node at given position
7 : Display the elements
8 : Count the number of elements
9 : Terminate the application
------------------------------------
7
Elements of the Linked List are :
| 11 | <=> | 21 | <=> | 51 | <=> | 111 | <=> NULL
------------------------------------
Enter Your Choice
------------------------------------
1 : Insert node at first position
2 : Insert node at last position
3 : Insert node at given position
4 : Delete node at first position
5 : Delete node at last position
6 : Delete node at given position
7 : Display the elements
8 : Count the number of elements
9 : Terminate the application
------------------------------------
8
Number of elements are : 4
------------------------------------
Enter Your Choice
------------------------------------
1 : Insert node at first position
2 : Insert node at last position
3 : Insert node at given position
4 : Delete node at first position
5 : Delete node at last position
6 : Delete node at given position
7 : Display the elements
8 : Count the number of elements
9 : Terminate the application
------------------------------------
9
Thank you for using Marvellous Infosystems Application

----------------------------------------------------------

// RULES //
always use this keyword
declaration - inside class
definition - outside the class
first and iCount in private access specifier
*/