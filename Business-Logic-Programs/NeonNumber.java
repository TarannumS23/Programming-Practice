/*
    Write a program to check whether a given number is Neon Number or not.
    Description : A number is called Neon Number if the sum of digits of its square equals the number.

    Input : One integer num
    Output : Print: Neon Number or Not Neon Number.
*/
import java.io.*;

class NeonNumber
{
    public static void main(String A[]) throws Exception
    {
        int iNo = 0;
        int iRet = 0;

        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter number : ");
        iNo = Integer.parseInt(bobj.readLine());

        if(iNo < 0)
        {
            System.out.println("Invalid Number");
            return;
        }

        NeonNumberLogic nobj = new NeonNumberLogic();

        iRet = nobj.CheckNeonNumber(iNo);

        if(iRet == 1)
        {
            System.out.println("It is Neon Number");
        }
        else
        {
            System.out.println("It is not Neon Number");
        }
    }
}

class NeonNumberLogic
{
    int CheckNeonNumber(int iNo)
    {
        int iSquare = 0;
        int iDigit = 0;
        int iSum = 0;

        iSquare = iNo * iNo;

        while(iSquare != 0)
        {
            iDigit = iSquare % 10;
            iSum = iSum + iDigit;
            iSquare = iSquare / 10;
        }

        if(iSum == iNo)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
}