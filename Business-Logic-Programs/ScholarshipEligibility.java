import java.util.*;

class ScholarshipEligibility 
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Marks in Percentage : ");
        int Marks = sobj.nextInt();

        System.out.println("Enter Attendance in percentage : ");
        int Attendance = sobj.nextInt();

        System.out.println("Enter Family Income : ");
        int Income = sobj.nextInt();

        if((Marks < 0 || Marks > 100) || (Attendance < 0 || Attendance > 100))
        {
            System.out.println("Invalid Data");
            return;
        }

        if(Income < 0)
        {
            System.out.println("Income must be positive");
            return;
        }

        if(Marks < 80)
        {
            System.out.println("Scholarship Rejected : Marks must be 80% or above");
        }
        else if(Attendance < 75)
        {
            System.out.println("Scholarship Rejected : Attendance Must be 75% or above");
        }
        else if(Income > 300000)
        {
            System.out.println("Scholarship Rejected : Income must be Rs.300000 or below");
        }
        else
        {
            System.out.println("Scholarship Approved");
        }
    }
}
