// Write a program to find smallest digit in a given number.
class SmallestDigit 
{
    public static void main(String A[]) 
    {
        Logic obj = new Logic();
        obj.findSmallestDigit(45872);
    }   
}

class Logic
{
    void findSmallestDigit(int num)
    {
        int iDigit = 0;
        int iSmall = 9;

        while(num != 0)
        {
            iDigit = num % 10;

            if(iDigit < iSmall)
            {
                iSmall = iDigit;
            }

            num = num / 10;
        }

        System.out.println("Smallest digit is: " + iSmall);
    }
}
