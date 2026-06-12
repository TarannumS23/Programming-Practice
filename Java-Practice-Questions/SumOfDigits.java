class SumOfDigits
{
    public static void main(String A[])
    {
       Logic obj = new Logic();
       obj.sumOfDigits(1234); 
    }
}
class Logic
{
    void sumOfDigits(int num)
    {
        int Sum = 0;

        while(num > 0)
        {
            Sum = Sum + num % 10;
            num =num / 10;
        }
        System.out.println("Sum of digits: " + Sum);
    }
}
