import java.util.*;

class LibraryFineCalculator
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter the number of days the book was kept : ");
        int daysKept = sobj.nextInt();

        if(daysKept < 1)
        {
            System.out.println("Number of days are invalid!");
            System.out.println("Please provide correct data");
            return;
        }

        int fineAmount = 0;

        if(daysKept <= 7)
        {
            System.out.println("Returned on time.");
        }
        else if(daysKept <= 12)
        {
            fineAmount = (daysKept-7) * 5;
            System.out.println("Total fine to be paid : Rs."+fineAmount);
        }
        else
        {
            fineAmount = 25 + (daysKept - 12) * 10;
            System.out.println("Total fine to be paid : Rs."+fineAmount);
        }
    }
}