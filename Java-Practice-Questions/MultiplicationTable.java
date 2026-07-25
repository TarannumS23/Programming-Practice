// Write a program to display the multiplication table of a number.
class MultiplicationTable 
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.printTable(5);
    }
}

class Logic
{
    void printTable(int num)
    {
        int iCnt = 0;
        for(iCnt = 1; iCnt <= 10; iCnt++)
        {
            System.out.println( (num * iCnt));
        }
    }
}
