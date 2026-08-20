/*
    Write a program to check whether a given number is Pallindrome Number or not.
    Description : A number is called Pallindrome Number if it remains the same when reversed.

    Input : One integer num
    Output : Print: Pallindrome Number or Not Pallindrome Number.
*/
import java.io.*;

class PalindromeNumber
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

        PalindromeNumberLogic pobj = new PalindromeNumberLogic();

        iRet = pobj.CheckPalindromeNumber(iNo);

        if(iRet == 1)
        {
            System.out.println("It is Palindrome Number");
        }
        else
        {
            System.out.println("It is not Palindrome Number");
        }
    }
}

class PalindromeNumberLogic
{
    int CheckPalindromeNumber(int iNo)
    {
        int iDigit = 0;
        int iReverse = 0;
        int iTemp = 0;

        iTemp = iNo;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iReverse = (iReverse * 10) + iDigit;
            iNo = iNo / 10;
        }

        if(iTemp == iReverse)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
}