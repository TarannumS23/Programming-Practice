// Singly Circular Linked List in Java

class program459
{
    public static void main(String A[])
    {
        int iRet = 0;

        SinglyCL dobj = new SinglyCL();

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

    node(int no)
    {
        this.data = no;
        this.next = null;
    }
}

class SinglyCL
{
    private int iCount;
    private node first;
    private node last;

    public SinglyCL()
    {
        this.first = null;
        this.last = null;
        this.iCount = 0;
    }

    public void Display()
    {
        node temp = first;

        if(first == null && last == null)      // filter
        {
            return;
        }

        System.out.print(" <=> ");
        
        do
        {
            System.out.print("| "+temp.data+" | <=> ");
            temp = temp.next;
        }while(temp != last.next);

        System.out.println("\n");
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
            last = newn;
        }
        else
        {
            newn.next = first;
            first = newn;
        }

        last.next = first;

        iCount++;
    }

    public void InsertLast(int iNo)
    {
        node newn = new node(iNo);

        if(first == null)
        {
            first = newn;
            last = newn;
        }
        else
        {
            last.next = newn;
            last = newn;
        }

        last.next = first;

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
            temp.next = newn;   
            
            iCount++;
        }
    }

    public void DeleteFirst()
    {
        if(first == null && last == null)
        {
            return;
        }
        else if(first == last)
        {
            first = null;
            last = null;
        }
        else
        {
            first = first.next;
        }

        last.next = first;

        iCount--;
    }

    public void DeleteLast()
    {
        if(first == null && last == null)
        {
            return;
        }
        else if(first == last)
        {
            first = null;
            last = null;
        }
        else
        {
            last.next = first;
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
            
            iCount--;
        }
    }
}


/*
C:\Users\ASUS\Desktop\LB\DS>java program459.java
 <=> | 11 | <=> | 21 | <=> | 51 | <=> | 101 | <=> | 111 | <=> | 121 | <=>

Number of nodes are : 6
 <=> | 21 | <=> | 51 | <=> | 101 | <=> | 111 | <=> | 121 | <=>

Number of nodes are : 5
 <=> | 21 | <=> | 51 | <=> | 101 | <=> | 111 | <=>

Number of nodes are : 4
 <=> | 21 | <=> | 51 | <=> | 101 | <=> | 105 | <=> | 111 | <=>

Number of nodes are : 5
 <=> | 21 | <=> | 51 | <=> | 101 | <=> | 111 | <=>

Number of nodes are : 4
*/