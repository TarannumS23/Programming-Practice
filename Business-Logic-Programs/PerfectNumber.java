/*
    Write a program to check whether a given number is Perfect Number or not.
    Description : A number is called Perfect Number if the sum of all proper divisors(Excluding the number) is equal to the number.

    Input : One integer num
    Output : Print: Perfect Number or Not Perfect Number.
*/
import java.io.*;

class PerfectNumber
{
    public static void main(String A[]) throws Exception
    {
        int iNo = 0;
        int iRet = 0;

        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter number : ");
        iNo = Integer.parseInt(bobj.readLine());

        if(iNo <= 0)
        {
            System.out.println("Invalid Number");
            return;
        }

        PerfectNumberLogic pobj = new PerfectNumberLogic();

        iRet = pobj.CheckPerfectNumber(iNo);

        if(iRet == 1)
        {
            System.out.println("It is Perfect Number");
        }
        else
        {
            System.out.println("It is not Perfect Number");
        }
    }
}

class PerfectNumberLogic
{
    int CheckPerfectNumber(int iNo)
    {
        int iSum = 0;
        int i = 0;

        for(i = 1; i <= iNo / 2; i++)
        {
            if(iNo % i == 0)
            {
                iSum = iSum + i;
            }
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