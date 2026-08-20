/*
    Write a program to check whether a given number is Spy Number or not.
    Description : A number is called Spy Number if its square ends with the same digits as the number.

    Input : One integer num
    Output : Print: Spy Number or Not Spy Number.
*/
import java.io.*;

class SpyNumber
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

        SpyNumberLogic sobj = new SpyNumberLogic();

        iRet = sobj.CheckSpyNumber(iNo);

        if(iRet == 1)
        {
            System.out.println("It is Spy Number");
        }
        else
        {
            System.out.println("It is not Spy Number");
        }
    }
}

class SpyNumberLogic
{
    int CheckSpyNumber(int iNo)
    {
        int iDigit = 0;
        int iSum = 0;
        int iProduct = 1;

        while(iNo != 0)
        {
            iDigit = iNo % 10;

            iSum = iSum + iDigit;
            iProduct = iProduct * iDigit;

            iNo = iNo / 10;
        }

        if(iSum == iProduct)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
}