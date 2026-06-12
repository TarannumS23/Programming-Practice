// Write a Java program to print all odd numbers up to N.
class PrintOddNumbers 
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.printOddNumbers(20);
    }
}

class Logic
{
    void printOddNumbers(int num)
    {
        System.out.println("Odd numbers up to " + num + " are:");
        for(int iCnt = 1; iCnt <= num; iCnt++)
        {
            if(iCnt % 2 != 0)
            {
                System.out.print(iCnt + " ");
            }
        }
    }
}
