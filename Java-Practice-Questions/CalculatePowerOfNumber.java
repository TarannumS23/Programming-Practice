// Write a program to calculate the power of a number using a loop.
class CalculatePowerOfNumber 
{
    public static void main(String A[]) 
    {
        Logic obj = new Logic();
        obj.calculatePower(2, 5);
    }
}

class Logic
{
    void calculatePower(int base, int exp)
    {
        int result = 1;
        for(int i = 0; i < exp; i++)
        {
            result *= base;
        }
        System.out.println("The power of number is : " + result);
    }
}
