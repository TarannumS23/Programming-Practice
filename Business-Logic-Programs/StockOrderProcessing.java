import java.util.*;

class StockOrderProcessing
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Current Stock : ");
        int stock = sobj.nextInt();

        System.out.println("Enter Requested Quantity : ");
        int quantity = sobj.nextInt();

        if(stock < 0)
        {
            System.out.println("Stock cannot be negative");
            return;
        }

        if(quantity <= 0)
        {
            System.out.println("Requested quantity must be greater than 0");
            return;
        }

        if(quantity > stock)
        {
            System.out.println("Order Failed: Insufficient Stock.");
        }
        else
        {
            stock = stock - quantity;

            System.out.println("Order Processed Successfully.");
            System.out.println("Remaining Stock: " + stock);

            if(stock < 5)
            {
                System.out.println("Low Stock Alert!");
            }
        }
    }
}