// Write a program to calculate the product of digits of a number.
class DigitsProduct 
{
    public static void main(String A[]) 
    {
        Logic obj = new Logic();
        obj.productOfDigits(1234);
    }
    
}

class Logic
{
    void productOfDigits(int num)
    {
        int Product = 1;

        while(num > 0)
        {
            Product = Product * (num % 10);
            num = num / 10;
        }
        System.out.println("Product of digits: " + Product);
    }
}
