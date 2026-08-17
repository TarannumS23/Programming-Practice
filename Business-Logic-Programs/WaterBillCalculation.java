/*
    Water Bill with Progressive Slabs + Late Fee

    Slabs + fixed meter charge.
    If paid after due date, add 2% penalty per week late
    with maximum penalty of 10%.

    Input : units, weeksLate
    Output : billAmount

    Assumptions:
    Fixed meter charge = Rs.100
    First 100 units    -> Rs.5 per unit
    Next 100 units     -> Rs.7 per unit
    Above 200 units    -> Rs.10 per unit
*/

import java.util.*;

class WaterBillCalculation
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Water Units Consumed : ");
        int units = sobj.nextInt();

        System.out.println("Enter Weeks Late : ");
        int weeksLate = sobj.nextInt();

        if(units < 0 || weeksLate < 0)
        {
            System.out.println("Values cannot be negative");
            return;
        }

        int meterCharge = 0;
        double billAmount = 0.0;

        meterCharge = 100;
        billAmount = meterCharge;

        if(units <= 100)
        {
            billAmount = billAmount + (units * 5);
        }
        else if(units <= 200)
        {
            billAmount = billAmount + (100 * 5);
            billAmount = billAmount + ((units - 100) * 7);
        }
        else
        {
            billAmount = billAmount + (100 * 5);
            billAmount = billAmount + (100 * 7);
            billAmount = billAmount + ((units - 200) * 10);
        }

        double penaltyPercent = Math.min(weeksLate * 2, 10);

        double lateFee = (billAmount * penaltyPercent) / 100;

        billAmount = billAmount + lateFee;

        System.out.println("Water Units: " + units);
        System.out.println("Meter Charge: Rs." + meterCharge);
        System.out.println("Late Fee: Rs." + lateFee);
        System.out.println("Final Bill Amount: Rs." + billAmount);
    }
}