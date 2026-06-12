// Write a program to count the total number of factors of a number.

class CountFactors 
{
    public static void main(String A[]) 
    {
        Logic obj = new Logic();
        obj.countFactors(20);
    }  
}

class Logic
{
    void countFactors(int num)
    {
        int count = 0;
        for(int i = 1; i <= num; i++)
        {
            if(num % i == 0)
            {
                count++;
            }
        }
        System.out.println("Total number of factors of " + num + " is: " + count);
    }
}
