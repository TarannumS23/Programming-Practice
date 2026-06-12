// Write a program to find the maximum of two numbers.

class FindMaxNumber
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.findMax(20, 15);
    }
}

class Logic
{
    void findMax(int num1, int num2)
    {
        if(num1 > num2)
        {
            System.out.println("Maximum number is: " + num1);
        }
        else
        {
            System.out.println("Maximum number is: " + num2);
        }
    }
}