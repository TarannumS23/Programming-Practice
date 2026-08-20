/*
    Write a program to check whether a given string is a Pangram or Not.
    Description : A string is called Pangram if it contains all aplhabets from 'a' to 'z' at least once.

    Input : One string str
    Output : Print : Pangram String or NOt Pangram String.
*/
import java.util.*;

class PangramStringLogic
{
    public boolean checkPangram(String str)
    {
        str = str.toLowerCase();

        boolean Arr[] = new boolean[26];

        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);

            if(ch >= 'a' && ch <= 'z')
            {
                Arr[ch - 'a'] = true;
            }
        }

        for(int i = 0; i < 26; i++)
        {
            if(Arr[i] == false)
            {
                return false;
            }
        }

        return true;
    }
}

class PangramString
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter a sentence : ");
        String str = sobj.nextLine();

        PangramStringLogic lobj = new PangramStringLogic();

        if(lobj.checkPangram(str))
        {
            System.out.println("Pangram");
        }
        else
        {
            System.out.println("Not Pangram");
        }
    }
}