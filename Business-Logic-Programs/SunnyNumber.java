/*
    Write a program to check whether a given number is Sunny Number or not.
    Description : A number is called Sunny Number if num + 1 is a perfect square.

    Input : One integer num
    Output : Print: Sunny Number or Not Sunny Number.
*/
import java.io.*;

class SunnyNumber
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

        SunnyNumberLogic sobj = new SunnyNumberLogic();

        iRet = sobj.CheckSunnyNumber(iNo);

        if(iRet == 1)
        {
            System.out.println("It is Sunny Number");
        }
        else
        {
            System.out.println("It is not Sunny Number");
        }
    }
}

class SunnyNumberLogic
{
    int CheckSunnyNumber(int iNo)
    {
        int iNext = 0;
        int iSquare = 0;
        int i = 0;

        iNext = iNo + 1;

        for(i = 1; i * i <= iNext; i++)
        {
            if(i * i == iNext)
            {
                return 1;
            }
        }

        return 0;
    }
}