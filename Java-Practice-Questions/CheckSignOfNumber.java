// Write a program to check whether a number is positive, negative, or zero.

class Logic
{
    void checkSign(int num)
    {
        if(num > 0)
        {
            System.out.println(num + " is a positive number.");
        }
        else if(num < 0)
        {
            System.out.println(num + " is a negative number.");
        }
        else
        {
            System.out.println(num + " is zero.");
        }
    }
}

class CheckSignOfNumber
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.checkSign(-8);
    }
}