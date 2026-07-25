// Doubly Linear Linked List in Java

class program458
{
    public static void main(String A[])
    {
        int iRet = 0;

        DoublyLL dobj = new DoublyLL();

        dobj.InsertFirst(51);
        dobj.InsertFirst(21);
        dobj.InsertFirst(11);

        dobj.InsertLast(101);
        dobj.InsertLast(111);
        dobj.InsertLast(121);
        
        dobj.Display();

        iRet = dobj.Count();

        System.out.println("Number of nodes are : "+iRet);

        dobj.DeleteFirst();

        dobj.Display();

        iRet = dobj.Count();

        System.out.println("Number of nodes are : "+iRet);

        dobj.DeleteLast();

        dobj.Display();

        iRet = dobj.Count();

        System.out.println("Number of nodes are : "+iRet);

        dobj.InsertAtPos(105, 4);

        dobj.Display();

        iRet = dobj.Count();

        System.out.println("Number of nodes are : "+iRet);

        dobj.DeleteAtPos(4);

        dobj.Display();

        iRet = dobj.Count();

        System.out.println("Number of nodes are : "+iRet);
    }
}

class node
{
    public int data;
    public node next;
    public node prev;

    node(int no)
    {
        this.data = no;
        this.next = null;
        this.prev = null;
    }
}

class DoublyLL
{
    private int iCount;
    private node first;

    public DoublyLL()
    {
        this.first = null;
        this.iCount = 0;
    }

    public void Display()
    {
        node temp = first;

        System.out.print("null <=> ");

        while(temp != null)
        {
            System.out.print("| "+temp.data+" | <=> ");
            temp = temp.next;
        }

        System.out.println(" null ");
    }

    public int Count()
    {
        return iCount;
    }

    public void InsertFirst(int iNo)
    {
        node newn = new node(iNo);

        if(first == null)
        {
            first = newn;
        }
        else
        {
            newn.next = first;
            first.prev = newn;
            first = newn;
        }

        iCount++;
    }

    public void InsertLast(int iNo)
    {
        node newn = new node(iNo);

        if(first == null)
        {
            first = newn;
        }
        else
        {
            node temp = first;

            while(temp.next != null)
            {
                temp = temp.next;
            }

            temp.next = newn;
            newn.prev = temp;
        }

        iCount++;
    }

    public void InsertAtPos(int iNo , int iPos)
    {
        node newn = new node(iNo);

        if((iPos < 1) || (iPos > iCount+1))
        {
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
            int i = 0;
            node temp = first;

            for(i = 1; i < iPos-1; i++)
            {
                temp = temp.next;
            }

            newn.next = temp.next;
            temp.next.prev = newn;
            newn.prev = temp;
            temp.next = newn;

            iCount++;          
        }
    }

    public void DeleteFirst()
    {
        if(first == null)
        {
            return;
        }
        else if(first.next == null)
        {
            first = null;
        }
        else
        {
            first = first.next;
            first.prev = null;
        }

        iCount--;
    }

    public void DeleteLast()
    {
        if(first == null)
        {
            return;
        }
        else if(first.next == null)
        {
            first = null;
        }
        else
        {
            node temp = first;

            while(temp.next.next != null)
            {
                temp = temp.next;
            }

            temp.next = null;
        }

        iCount--;
    }

    public void DeleteAtPos(int iPos)
    {
        if((iPos < 1) || (iPos > iCount))
        {
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
            int i = 0;
            node temp = first;

            for(i = 1; i < iPos-1; i++)
            {
                temp = temp.next;
            }

            temp.next = temp.next.next;
            temp.next.prev = temp;

            iCount--;          
        }
    }
}


/*
C:\Users\ASUS\Desktop\LB\DS>java program458.java
null <=> | 11 | <=> | 21 | <=> | 51 | <=> | 101 | <=> | 111 | <=> | 121 | <=>  null
Number of nodes are : 6
null <=> | 21 | <=> | 51 | <=> | 101 | <=> | 111 | <=> | 121 | <=>  null
Number of nodes are : 5
null <=> | 21 | <=> | 51 | <=> | 101 | <=> | 111 | <=>  null
Number of nodes are : 4
null <=> | 21 | <=> | 51 | <=> | 101 | <=> | 105 | <=> | 111 | <=>  null
Number of nodes are : 5
null <=> | 21 | <=> | 51 | <=> | 101 | <=> | 111 | <=>  null
Number of nodes are : 4
*/