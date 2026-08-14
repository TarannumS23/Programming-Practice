import java.util.*;

class ATMWithdrawalValidation 
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Current balance : ");
        int Balance = sobj.nextInt();

        System.out.println("Enter withdrawal amount : ");
        int withdraAmount = sobj.nextInt();

        if(Balance < 0 || withdraAmount <=0 )
        {
            System.out.println("Invalid input");
            return;
        }

        int newBalance = 0;

        if((withdraAmount % 100) != 0)
        { 
            System.out.println("Transaction Failed: Withdrawal amount must be a multiple of Rs.100");
        }
        else if(withdraAmount > 25000)
        {
            System.out.println("Transaction Failed: Maximum withdrawal is Rs.25000");
        }      
        else
        {
            newBalance = Balance - withdraAmount;

            if(newBalance >= 1000)
            {
                System.out.println("Transaction Successful");
                System.out.println("Remaining Balance is : Rs."+newBalance);
            }
            else
            {
                System.out.println("Transaction Failed: Minimum balance of Rs.1000 must be maintained");
            }
        }
    }
}
