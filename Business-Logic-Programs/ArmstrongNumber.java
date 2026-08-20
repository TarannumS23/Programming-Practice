/*
    Write a program to check whether a given number is an Armstrong Number or Not.
    Description : A number is Armstrong Number if sum of each digit raised to power of total digits.

    Input : One integer num
    Output : Armstrong Number or Not Armstrong Number
*/
import java.io.*;

class ArmstrongNumber
{
    public static void main(String A[]) throws Exception      // bcoz BufferedRader generates exception
    {
        int iNo = 0;
        int iCount = 0;
        int iTemp = 0;

        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter number as a base : ");
        iNo = Integer.parseInt(bobj.readLine());   // parseInt converts string to integer, here in bufferedreader readLine() is for string

        iTemp = iNo;

        while(iNo != 0)
        {
            iCount++;
            iNo = iNo / 10;
        }

        iNo = iTemp;
        int iDigit = 0;
        int iSum = 0;

        // 153 -> 3^3 + 5^3 + 1^3
        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iSum = iSum + (int)Math.pow(iDigit, iCount);           // In built function
            iNo = iNo / 10;
        }

        if(iSum == iTemp)
        {
            System.out.println("It is Armstrong number");
        }
        else
        {
            System.out.println("It is not Armstrong number");
        }
    }
}
