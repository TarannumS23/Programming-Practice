/*
    Write a program to check whether a given number is Disarium Number or not.
    Description : A number is called Disarium Number if sum of digits raised to thier position
    (starting from 1) equals the number.

    Input : One integer num
    Output : Print: Disarium Number or Not Disarium Number.
*/
import java.io.*;

class TrimorphicNumber
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

        TrimorphicNumberLogic tobj = new TrimorphicNumberLogic();

        iRet = tobj.CheckTrimorphicNumber(iNo);

        if(iRet == 1)
        {
            System.out.println("It is Trimorphic Number");
        }
        else
        {
            System.out.println("It is not Trimorphic Number");
        }
    }
}

class TrimorphicNumberLogic
{
    int CheckTrimorphicNumber(int iNo)
    {
        int iCube = 0;
        int iTemp = 0;
        int iDigits = 0;
        int iPower = 1;
        int iLastDigits = 0;

        iCube = iNo * iNo * iNo;
        iTemp = iNo;

        while(iTemp != 0)
        {
            iDigits++;
            iTemp = iTemp / 10;
        }

        for(int i = 1; i <= iDigits; i++)
        {
            iPower = iPower * 10;
        }

        iLastDigits = iCube % iPower;

        if(iLastDigits == iNo)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
}