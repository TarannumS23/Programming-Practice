/*
    Write a program to check whether a given number is Automorphic Number or not.
    Description : A number is called Automorphic Number if its square ends with the same digits as the number.

    Input : One integer num
    Output : Print: Automorphic Number or Not Automorphic Number.
*/
import java.io.*;

class AutomorphicNumber
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

        AutomorphicNumberLogic aobj = new AutomorphicNumberLogic();

        iRet = aobj.CheckAutomorphicNumber(iNo);

        if(iRet == 1)
        {
            System.out.println("It is Automorphic Number");
        }
        else
        {
            System.out.println("It is not Automorphic Number");
        }
    }
}

class AutomorphicNumberLogic
{
    int CheckAutomorphicNumber(int iNo)
    {
        int iSquare = 0;
        int iTemp = 0;
        int iDigits = 0;
        int iPower = 1;
        int iLastDigits = 0;

        iSquare = iNo * iNo;
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

        iLastDigits = iSquare % iPower;

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