// Write a Java program to find the largest digit in a given number.
class LargestDigit 
{
    public static void main(String A[]) 
    {
        Logic obj = new Logic();
        obj.findLargestDigit(83429);
    }      
}

class Logic
{
    void findLargestDigit(int num)
    {
        int iDigit = 0;
        int iLarge = 0;

        while(num != 0)
        {
            iDigit = num % 10;

            if(iDigit > iLarge)
            {
                iLarge = iDigit;
            }

            num = num / 10;
        }

        System.out.println("Largest digit is: " + iLarge);
    }
}
