import java.util.*;

class ElectricityBillCalculation 
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Units Consumed : ");
        int units = sobj.nextInt();

        if(units < 0)
        {
            System.out.println("Units cannot be negative");
            return;
        }

        int amount = 0;

        if(units <= 100)
        {
            amount = units * 5;
            System.out.println("Total Electricity Bill : Rs."+amount);
        }
        else if(units <= 200)
        {
            amount = 500 + (units - 100) * 7;
            System.out.println("Total Electricity Bill : Rs."+amount);
        }
        else
        {
            amount = 1200 + (units - 200) * 10;
            System.out.println("Total Electricity Bill : Rs."+amount);
        }
    }
}
