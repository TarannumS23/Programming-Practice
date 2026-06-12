// Write a program to count how many even and odd numbers are present in between 1 to N.

class CountEvenAndOdd 
{
    public static void main(String A[]) 
    {
        Logic obj = new Logic();
        obj.countEvenOddRange(10);
    }
}

class Logic
{
    void countEvenOddRange(int num)
    {
        int iEvenCount = 0;
        int iOddCount = 0;

        for(int i = 1; i <= num; i++)
        {
            if(i % 2 == 0)
            {
                iEvenCount++;
            }
            else
            {
                iOddCount++;
            }
        }

        System.out.println("Even Count is : " +iEvenCount);
        System.out.println("Odd Count is : " +iOddCount);
    }
}
