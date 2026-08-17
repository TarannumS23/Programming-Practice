/*
    Base fare depends on distance slabs. Add charges for class(Sleeper/3AC/2AC).
    if booking within 24 hours, add Tatkal 30%. Senior citizen gets 40% discount.

    Input : distance, classType, bookingHoursBefore, age
    Output : finalFare + reason breakdown
*/
import java.util.*;

class TrainFareCalculation 
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the distance to be cover in km : ");
        int distance = sobj.nextInt();

        System.out.println("Enter the class type(Sleeper/3AC/2AC) : ");
        String classType = sobj.next();

        System.out.println("Enter booking hours before : ");
        int bookingHoursBefore = sobj.nextInt();

        System.out.println("Enter Age : ");
        int age = sobj.nextInt();

        if(distance < 0 || age < 0 || bookingHoursBefore < 0)
        {
            System.out.println("Values can not be negative");
            return;
        }

        if(!classType.equalsIgnoreCase("Sleeper") && 
           !classType.equalsIgnoreCase("3AC") &&
           !classType.equalsIgnoreCase("2AC"))
        {
            System.out.println("Invalid class type");
            return;
        }

        int baseFare = 0;
        int finalFare = 0;
        int tatkalCharge =  0;
        int seniorDiscount = 0;

        // Assumption: Base fare = Rs.5 per km
        baseFare = distance * 5;
        int classCharge = 0;

        if(classType.equalsIgnoreCase("3AC"))
        {
            classCharge = 200;
        }
        else if(classType.equalsIgnoreCase("2AC"))
        {
            classCharge = 400;
        }

        finalFare = baseFare + classCharge;

        if(bookingHoursBefore <= 24)
        {
            tatkalCharge = (baseFare * 30) / 100;
            finalFare = finalFare + tatkalCharge; 
            System.out.println("Tatkal Charge   : Rs." + tatkalCharge);
        }
        else
        {
            System.out.println("Tatkal Charge   : Rs.0");
        } 
        
        if(age >= 60)
        {
            seniorDiscount = (finalFare * 40) / 100;
            finalFare = finalFare - seniorDiscount;

            System.out.println("Senior Discount : Rs." + seniorDiscount);
        }
        else
        {
            System.out.println("Senior Discount : Rs.0");
        }

        System.out.println();
        System.out.println("----- Fare Breakdown -----");
        System.out.println("Base Fare       : Rs." + baseFare);
        System.out.println("Class Charge    : Rs." + classCharge);
        System.out.println("Final Fare      : Rs." + finalFare);
    }
}
