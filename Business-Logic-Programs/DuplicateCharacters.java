/*
    Write a program to check whether a given string is a Pangram or Not.
    Description : Find and display characters that appear more than once.

    Input : One string str
    Output : Duplicate characters printed in one line.
*/
import java.util.*;

class DuplicateCharactersLogic
{
    public void displayDuplicates(String str)
    {
        for(int i = 0; i < str.length(); i++)
        {
            boolean bFound = false;

            for(int j = 0; j < i; j++)
            {
                if(str.charAt(i) == str.charAt(j))
                {
                    bFound = true;
                    break;
                }
            }

            if(bFound == true)
            {
                continue;
            }

            int iCount = 0;

            for(int j = i; j < str.length(); j++)
            {
                if(str.charAt(i) == str.charAt(j))
                {
                    iCount++;
                }
            }

            if(iCount > 1)
            {
                System.out.print(str.charAt(i) + " ");
            }
        }

        System.out.println();
    }
}

class DuplicateCharacters
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter a string : ");
        String str = sobj.nextLine();

        DuplicateCharactersLogic lobj = new DuplicateCharactersLogic();

        System.out.print("Duplicate characters : ");
        lobj.displayDuplicates(str);
    }
}