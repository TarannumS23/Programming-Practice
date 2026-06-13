// Write a program to print numbers from N down to 1 in reverse order.
class ReverseOrderNumbers 
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.printReverse(10);
    }
}

class Logic
{
    void printReverse(int num)
    {
        int iCnt = 0;

        System.out.println("Numbers from " + num + " down to 1 in reverse order are: ");
        for(iCnt = num; iCnt >= 1; iCnt--)
        {
            System.out.print(iCnt + " ");
        }
    }
}
