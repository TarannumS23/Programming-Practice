import java.util.*;

class EcommerceDiscountCalculation 
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Purchased Amount : ");
        int Amount = sobj.nextInt();

        System.out.println("Enter Membership Type");
        String MemberType = sobj.next();
        
        if(Amount <= 0)
        {
            System.out.println("Amount must be greater than 0");
            return;
        }

        if(MemberType.equalsIgnoreCase("Premium") && MemberType.equalsIgnoreCase("Regular"))
        {
            System.out.println("Invalid Membership Type");
            return;
        }

        double discount = 0;

        if(Amount > 5000)
        {
            discount = Amount * 0.20;
        }
        else if(Amount > 2000)
        {
            discount = Amount * 0.10;
        }

        double discountedAmount = Amount - discount;

        if(MemberType.equalsIgnoreCase("Premium"))
        {
            double premiumDiscount = discountedAmount * 0.05;
            discount = discount + premiumDiscount;
            discountedAmount = discountedAmount - premiumDiscount;
        }

        System.out.println("Original Amount: Rs." + Amount);
        System.out.println("Total Discount: Rs." + discount);
        System.out.println("Final Payable Amount: Rs." + discountedAmount);

    }
}
