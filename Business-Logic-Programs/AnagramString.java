/*
    Write a program to check whether a given string is a Anagram or Not.
    Description : Two strings is called Anagram if they contain the same characters with the same frequency,
                  regardless of order.

    Input : One string str
    Output : Print : Anagram String or NOt Anagram String.
*/
import java.util.*;

class AnagramStringLogic
{
    public boolean checkAnagram(String str1, String str2)
    {
        if(str1.length() != str2.length())
        {
            return false;
        }

        char Arr1[] = str1.toCharArray();
        char Arr2[] = str2.toCharArray();

        Arrays.sort(Arr1);
        Arrays.sort(Arr2);

        return Arrays.equals(Arr1, Arr2);
    }
}

class AnagramString
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter first string : ");
        String str1 = sobj.nextLine();

        System.out.print("Enter second string : ");
        String str2 = sobj.nextLine();

        AnagramStringLogic lobj = new AnagramStringLogic();

        if(lobj.checkAnagram(str1, str2))
        {
            System.out.println("Anagram");
        }
        else
        {
            System.out.println("Not Anagram");
        }
    }
}