// Write a Java program to print even numbers up to N.
class PrintEvenNumbers 
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.printEvenNumbers(20);
    }
}

class Logic
{
    void printEvenNumbers(int num)
    {
        System.out.println("Even numbers up to " + num + " are:");
        for(int iCnt = 1; iCnt <= num; iCnt++)
        {
            if(iCnt % 2 == 0)
            {
                System.out.print(iCnt + " ");
            }
        }
    }
}
