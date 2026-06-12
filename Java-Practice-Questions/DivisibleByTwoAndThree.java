// Write a program to print all numbers from 1 to N which are divisible by both 2 and 3.

class DivisibleByTwoAndThree 
{
    public static void main(String A[]) 
    {
        Logic obj = new Logic();
        obj.printDivisibleBy2and3(30);
    }   
}

class Logic
{
    void printDivisibleBy2and3(int num)
    {
        System.out.println("Numbers from 1 to " + num + " which are divisible by both 2 and 3 are: ");
        for(int i = 1; i <= num; i++)
        {
            if(i % 2 == 0 && i % 3 == 0)
            {
                System.out.print(i + " ");
            }
        }
    }
}
