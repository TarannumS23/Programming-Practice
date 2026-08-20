/*
    Write a program to check whether a given number is Harshad Number or not.
    Description : A number is called Harshad NUmber if it is divisible by the sum of its digits.

    Input : One integer num
    Output : Print: Harshad Number or Not Harshad Number.
*/
import java.io.*;

class HarshadNumber
{
    public static void main(String A[]) throws Exception      // bcoz BufferedRader generates exception
    {
        int iNo = 0;
        int iSum = 0;
        int iDigit = 0;
        int iTemp = 0;

        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter number as a base : ");
        iNo = Integer.parseInt(bobj.readLine());   // parseInt converts string to integer, here in bufferedreader readLine() is for string

        iTemp = iNo;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iSum = iSum + iDigit;
            iNo = iNo / 10;
        }

        if(iTemp % iSum == 0)
        {
            System.out.println("It is Harshad Number");
        }
        else
        {
            System.out.println("It is not Harshad Number");
        }

    }
}
