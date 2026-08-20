// Write a program to count vowels and consonants in a string.
import java.util.*;

class VowelConsonantCountLogic
{
    public void countVowelsConsonants(String str)
    {
        int iVowelCount = 0;
        int iConsonantCount = 0;

        str = str.toLowerCase();

        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);

            if(ch >= 'a' && ch <= 'z')
            {
                if(ch == 'a' || ch == 'e' || ch == 'i' ||
                   ch == 'o' || ch == 'u')
                {
                    iVowelCount++;
                }
                else
                {
                    iConsonantCount++;
                }
            }
        }

        System.out.println("Vowels : " + iVowelCount);
        System.out.println("Consonants : " + iConsonantCount);
    }
}

class VowelConsonantCount
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter a string : ");
        String str = sobj.nextLine();

        VowelConsonantCountLogic lobj = new VowelConsonantCountLogic();

        lobj.countVowelsConsonants(str);
    }
}
