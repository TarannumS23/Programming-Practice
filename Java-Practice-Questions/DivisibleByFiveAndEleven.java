// Write a program to check whether a number is divisible by 5 and 11 or not.
class DivisibleByFiveAndEleven 
{
    public static void main(String A[]) 
    {
        Logic obj = new Logic();
        obj.checkDivisibile(55);
    }
}

class Logic
{
    void checkDivisibile(int num)
    {
        if(num % 5 == 0 && num % 11 == 0)
        {
            System.out.println(num + " is divisible by both 5 and 11.");
        }
        else
        {
            System.out.println(num + " is not divisible by both 5 and 11.");
        }
    }
}
