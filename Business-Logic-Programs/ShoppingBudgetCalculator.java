import java.util.*;

class ShoppingBudgetCalculator
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Budget Amount : ");
        int budget = sobj.nextInt();

        System.out.println("Enter Number of Items : ");
        int n = sobj.nextInt();

        if(budget < 0)
        {
            System.out.println("Budget cannot be negative");
            return;
        }

        if(n < 0)
        {
            System.out.println("Number of items cannot be negative");
            return;
        }

        int balance = budget;
        int count = 0;
        int price = 0;

        for(int i = 1; i <= n; i++)
        {
            System.out.println("Enter Price of Item " + i + " : ");
            price = sobj.nextInt();

            if(price <= 0)
            {
                System.out.println("Price must be greater than 0");
                return;
            }

            if(price <= balance)
            {
                balance = balance - price;
                count++;
            }
            else
            {
                break;
            }
        }

        System.out.println("Items Purchased: " + count);
        System.out.println("Remaining Balance: Rs." + balance);
    }
}