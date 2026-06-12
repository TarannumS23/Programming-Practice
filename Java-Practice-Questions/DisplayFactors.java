// Write a program to display all the factors of a number.
class DisplayFactors 
{
    public static void main(String A[]) 
    {
        Logic obj = new Logic();
        obj.displayFactors(12);
    }
    
}

class Logic
{
    void displayFactors(int num)
    {
        System.out.print("Factors of " + num + " are: ");
        for(int i = 1; i <= num; i++)
        {
            if(num % i == 0)
            {
                System.out.print(i + " ");
            }
        }
    }
}
