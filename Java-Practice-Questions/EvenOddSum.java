// Write a program to find the sum of even and odd digits separately in a number.
class EvenOddSum 
{
    public static void main(String A[]) 
    {
        Logic obj = new Logic();
        obj.sumEvenOddDigits(123456);
    }
}

class Logic
{
    void sumEvenOddDigits(int num)
    {
        int iDigit = 0;
        int iEvenSum = 0;
        int iOddSum = 0;

        while(num != 0)
        {
            iDigit = num % 10;

            if(iDigit % 2 == 0)
            {
                iEvenSum = iEvenSum + iDigit;
            }
            else
            {
                iOddSum = iOddSum + iDigit;
            }

            num = num / 10;
        }

        System.out.println("Even Sum : " +iEvenSum);
        System.out.println("Odd Sum : " +iOddSum);
    }
}

