// Write a program to remove duplicate characters from a string.
import java.util.*;

class RemoveDuplicateCharactersLogic
{
    public String removeDuplicates(String str)
    {
        String result = "";

        for(int i = 0; i < str.length(); i++)
        {
            boolean bFound = false;

            for(int j = 0; j < result.length(); j++)
            {
                if(str.charAt(i) == result.charAt(j))
                {
                    bFound = true;
                    break;
                }
            }

            if(bFound == false)
            {
                result = result + str.charAt(i);
            }
        }

        return result;
    }
}

class RemoveDuplicateCharacters
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter a string : ");
        String str = sobj.nextLine();

        RemoveDuplicateCharactersLogic lobj = new RemoveDuplicateCharactersLogic();

        String result = lobj.removeDuplicates(str);

        System.out.println("String without duplicate characters : " + result);
    }
}
