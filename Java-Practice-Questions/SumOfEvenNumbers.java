// Write a program to find the sum of all even numbers up to N.

class SumOfEvenNumbers 
{
    public static void main(String A[]) 
    {
        Logic obj = new Logic();
        int sum = obj.sumEvenNumbers(10);
    }   
}

class Logic
{
    int sumEvenNumbers(int num)
    {
        int sum = 0;
        for(int i = 1; i <= num; i++)
        {
            if(i % 2 == 0)
            {
                sum = sum + i;
            }
        }
        System.out.println("The sum of all even numbers up to " + num + " is: " + sum);
        return sum;
    }
}   