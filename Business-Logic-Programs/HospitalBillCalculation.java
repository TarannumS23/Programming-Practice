/*
    A hospital bill includes consultation + medicine + room charges per day. if insured,insurance covers
    up to ₹50,000 or 70% of bill(whichever is lower). ICU ward costs extra.

    Input : days, wardType(Normal/ICU),medicineBill,consultationFee, insured(Yes/No)
    Output : totalBill, insuranceCover, finalPay

    Validations : all non-negative , wardType valid.
*/
import java.util.*;

class HospitalBillCalculation 
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of days stayed in hospital : ");
        int days = sobj.nextInt();

        System.out.println("Enter the ward type : ");
        String wardType = sobj.next();

        System.out.println("Enter medicine bill : ");
        double medicineBill = sobj.nextDouble();

        System.out.println("Enter consultation fees : ");
        double consultationFee = sobj.nextDouble();

        System.out.println("Enter if you are insured or not(Yes/No) : ");
        String insured = sobj.next();

        if(days < 0 || medicineBill < 0 || consultationFee < 0)
        {
            System.out.println("Invalid data");
            return;
        }

        if(!wardType.equalsIgnoreCase("Normal") && !wardType.equalsIgnoreCase("ICU"))
        {
            System.out.println("Invalid ward type");
            return;
        }

        if(!insured.equalsIgnoreCase("Yes") &&
           !insured.equalsIgnoreCase("No"))
        {
            System.out.println("Invalid insurance input");
            return;
        }

        double totalBill;
        double finalPay;
        double insuranceCover = 0.0;

        int roomCharge = 0;

        if(wardType.equalsIgnoreCase("Normal"))
        {
            roomCharge = 1000;
        }
        else
        {
            roomCharge = 2000;
        }

        totalBill = consultationFee + medicineBill + (roomCharge * days);

        if(insured.equalsIgnoreCase("Yes"))
        {
            insuranceCover = Math.min((totalBill * 70) / 100, 50000);

            finalPay = totalBill - insuranceCover;
        }
        else
        {
            finalPay = totalBill;
        }
        
        System.out.println("Your total bill is : Rs."+totalBill);
        System.out.println("Insurance cover : Rs."+insuranceCover);
        System.out.println("Your final pay is : Rs."+finalPay);
    }
}
