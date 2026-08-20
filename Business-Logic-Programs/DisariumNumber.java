/*
    Write a program to check whether a given number is Disarium Number or not.
    Description : A number is called Disarium Number if sum of digits raised to thier position
    (starting from 1) equals the number.

    Input : One integer num
    Output : Print: Disarium Number or Not Disarium Number.
*/
import java.io.*;

class DisariumNumber
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

        DisariumNumberLogic dobj = new DisariumNumberLogic();

        iRet = dobj.CheckDisariumNumber(iNo);

        if(iRet == 1)
        {
            System.out.println("It is Disarium Number");
        }
        else
        {
            System.out.println("It is not Disarium Number");
        }
    }
}

class DisariumNumberLogic
{
    int CheckDisariumNumber(int iNo)
    {
        int iTemp = 0;
        int iDigit = 0;
        int iCount = 0;
        int iSum = 0;
        int iPower = 1;

        iTemp = iNo;

        while(iTemp != 0)
        {
            iCount++;
            iTemp = iTemp / 10;
        }

        iTemp = iNo;

        while(iTemp != 0)
        {
            iDigit = iTemp % 10;

            iPower = 1;

            for(int i = 1; i <= iCount; i++)
            {
                iPower = iPower * iDigit;
            }

            iSum = iSum + iPower;

            iCount--;
            iTemp = iTemp / 10;
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