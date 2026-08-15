import java.util.*;

class CourierChargeCalculation 
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Parcel Weight in kg : ");
        int Weight = sobj.nextInt();

        if(Weight < 0)
        {
            System.out.println("Weight must be positive");
            return;
        }

        int amount = 0;

        if(Weight == 1)
        {
            amount = 50; 
        }
        else if(Weight >= 2 && Weight <= 5)
        {
            amount = 50 + (Weight - 1) * 20;
        }
        else
        {
            amount = 150 + (Weight - 5) * 30;
        }

        System.out.println("Total weight : "+Weight+" kg");
        System.out.println("Courier Charge : Rs."+amount);
    }
}
