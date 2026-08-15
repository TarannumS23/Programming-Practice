import java.util.*;

class ParkingFeeCalculation 
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Total Parking Duration : ");
        int hours = sobj.nextInt();

        if(hours < 0)
        {
            System.out.println("Hours cannot be negative");
            return;
        }

        int amount = 0;

        if(hours > 10)
        {
            amount = 20 + ((hours - 2) * 10) + 50;
        }
        else if(hours > 2)
        {
            amount = 20 + ((hours - 2) * 10);
        }
        else
        {
            amount = 20;
        }

        System.out.println("Total Parking Fee : Rs."+amount);
    }   
}