// Write a program to check whether a number is prime or not.

class CheckPrimeNumber 
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.checkPrime(11);
    }
}

class Logic
{
    void checkPrime(int num)
    {
        int iCnt = 0;
        for(iCnt = 2; iCnt <= num / 2; iCnt++)
        {
            if(num % iCnt == 0)
            {
                break;
            }
        }
        if(iCnt > num / 2)
        {
            System.out.println(num + " is a prime number.");
        }
        else
        {
            System.out.println(num + " is not a prime number.");
        }
    }
}
