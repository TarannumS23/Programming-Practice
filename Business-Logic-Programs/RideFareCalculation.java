import java.util.*;

class RideFareCalculation 
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Distance in KM : ");
        int distance = sobj.nextInt();

        System.out.println("Travelling in peak hour? (Yes/No) : ");
        String peakHour = sobj.next();

        if(distance < 0)
        {
            System.out.println("Invalid Distance");
            return;
        }

        int fare = 0;
        fare = 50;

        if(distance <= 10)
        {
            fare = fare + (distance * 12);
        }
        else
        {
            fare = fare + (10 * 12);
            fare = fare + ((distance - 10) * 15);
        }

        if(peakHour.equalsIgnoreCase("Yes"))
        {
            fare = fare + (fare * 20 / 100);
        }

        System.out.println("Distance : "+distance+" km");
        System.out.println("Peak Hour : "+peakHour);
        System.out.println("Total Fare : Rs."+fare);

    }
}
