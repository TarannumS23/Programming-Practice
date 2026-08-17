/*
    A hotel charges Rs.3000 per day. For long stays, hotel provides discount
    to retain customers.

    Rules : 1] Rs.3000/day
            2] If stay > 7 days -> 5% discount on total bill
    Input : Number of days stayed
    Validations : Days must be >= 0
    Expected Output : Total Stay Duration : <days> days
                      Final Bill Amount : Rs.<amount>
*/
import java.util.*;

class HotelBillCalculation 
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        HotelBill hobj = new HotelBill();

        int iRet = 0;

        System.out.println("Enter number of days : ");
        int days = sobj.nextInt();

        if(days < 0)
        {
            System.out.println("Invalid Days");
            return;
        }

        System.out.println("Total Stay Duration : "+days);

        iRet = hobj.CalculateBill(days);

        System.out.println("Final Bill Amount : Rs."+iRet);
    }
}

class HotelBill
{
    public int CalculateBill(int stay)
    {
        int amount = 0;
        int discount = 0;

        amount = stay * 3000;

        if(stay > 7)
        {
            discount = (amount * 5) / 100;

            amount = amount - discount;
        }
        return amount;
    }
}
