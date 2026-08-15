import java.util.*;

class PersonalLoanEligibility
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Age : ");
        int age = sobj.nextInt();

        System.out.println("Enter Monthly Income : ");
        int income = sobj.nextInt();

        System.out.println("Enter Credit Score : ");
        int creditScore = sobj.nextInt();

        System.out.println("Do you have existing unpaid loan? (Yes/No) : ");
        String loan = sobj.next();

        if(age < 0 || income < 0 || creditScore < 0)
        {
            System.out.println("Invalid Data");
            return;
        }

        if(!loan.equalsIgnoreCase("Yes") && !loan.equalsIgnoreCase("No"))
        {
            System.out.println("Invalid Data");
            return;
        }

        if(age < 21 || age > 60)
        {
            System.out.println("Loan Rejected: Age must be between 21 and 60");
        }
        else if(income < 25000)
        {
            System.out.println("Loan Rejected: Monthly income must be at least Rs.25000");
        }
        else if(creditScore < 700)
        {
            System.out.println("Loan Rejected: Credit score must be at least 700");
        }
        else if(loan.equalsIgnoreCase("Yes"))
        {
            System.out.println("Loan Rejected: Existing unpaid loan");
        }
        else
        {
            System.out.println("Loan Approved");
        }
    }
}