import java.util.*;

class TrafficViolationFine
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Helmet worn? (Yes/No) : ");
        String helmet = sobj.next();

        System.out.println("License available? (Yes/No) : ");
        String license = sobj.next();

        System.out.println("Overspeeding? (Yes/No) : ");
        String overspeeding = sobj.next();

        if(!helmet.equalsIgnoreCase("Yes") && !helmet.equalsIgnoreCase("No"))
        {
            System.out.println("Invalid Helmet Input");
            return;
        }

        if(!license.equalsIgnoreCase("Yes") && !license.equalsIgnoreCase("No"))
        {
            System.out.println("Invalid License Input");
            return;
        }

        if(!overspeeding.equalsIgnoreCase("Yes") && !overspeeding.equalsIgnoreCase("No"))
        {
            System.out.println("Invalid Overspeeding Input");
            return;
        }

        int amount = 0;

        if(helmet.equalsIgnoreCase("No"))
        {
            amount = amount + 500;
        }

        if(license.equalsIgnoreCase("No"))
        {
            amount = amount + 1000;
        }

        if(overspeeding.equalsIgnoreCase("Yes"))
        {
            amount = amount + 1500;
        }

        System.out.println("Total Fine Amount: ₹" + amount);
    }
}