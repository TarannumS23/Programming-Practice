// Write a program to check whether a number is perfect number or not.
class CheckPerfectNumber 
{
    public static void main(String A[]) 
    {
        Logic obj = new Logic();
        obj.checkPerfect(6);
    }
}

class Logic
{
    void checkPerfect(int num)
    {
        int sum = 0;
        int iCnt = 0;

        for(iCnt = 1; iCnt < num; iCnt++)
        {
            if(num % iCnt == 0)
            {
                sum = sum + iCnt;
            }
        }
        
        if(sum == num)
        {
            System.out.println(num + " is a perfect number.");
        }
        else
        {
            System.out.println(num + " is not a perfect number.");
        }
    }
}
