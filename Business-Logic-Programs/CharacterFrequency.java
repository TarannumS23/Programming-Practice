// Write a program to count frequency of each character.
import java.util.*;

class CharacterFrequencyLogic
{
    public void displayFrequency(String str)
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

            System.out.println(str.charAt(i) + " -> " + iCount);
        }
    }
}

class CharacterFrequency
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter a string : ");
        String str = sobj.nextLine();

        CharacterFrequencyLogic lobj = new CharacterFrequencyLogic();

        lobj.displayFrequency(str);
    }
}
