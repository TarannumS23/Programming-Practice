/*
    A telecom company bills calls based on duration slabs.

    Rules :
        1] First 5 minutes -> Free
        2] Next 10 minutes (6-15) -> Rs.1 per minute
        3] Beyond 15 minutes -> Rs.2 per minute

    Input : Call duration in minutes
    Validations : Minutes must be >= 0
    Expected Output :
        Call Duration : <minutes> minutes
        Total Call Charge: Rs.<amount>
*/
import java.util.*;

class CallChargeCalculation 
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Call Duration in minutes : ");
        int minutes = sobj.nextInt();

        if(minutes < 0)
        {
            System.out.println("Invalid Minutes");
            return;
        }

        int charge = 0;

        if(minutes <= 5)
        {
            charge = 0;
        }
        else if(minutes <= 15)
        {
            charge = (minutes - 5) * 1;
        }
        else
        {
            charge = 10 + (minutes - 15) * 2;
        }

        System.out.println("Call Duration : " + minutes + " minutes");
        System.out.println("Total Call Charge: Rs." + charge);
    }
}