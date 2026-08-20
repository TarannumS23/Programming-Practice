/*
    Write a program to check whether a given string is a Pallindrome or Not.
    Description : A string is called pallindrome if it reads the same forward and backwords.

    Input : One string str
    Output : Print : Palindrome String or NOt Palindrome String.
*/
import java.util.*;

class PalindromeString
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter a string : ");
        String str = sobj.nextLine();

        PalindromeStringLogic lobj = new PalindromeStringLogic();

        if(lobj.checkPalindrome(str))
        {
            System.out.println("Palindrome String");
        }
        else
        {
            System.out.println("Not Palindrome String");
        }
    }
}

class PalindromeStringLogic
{
    public boolean checkPalindrome(String str)
    {
        int iStart = 0;
        int iEnd = str.length() - 1;

        while(iStart < iEnd)
        {
            if(str.charAt(iStart) != str.charAt(iEnd))
            {
                return false;
            }

            iStart++;
            iEnd--;
        }

        return true;
    }
}