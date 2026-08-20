// Write a program to find thelongest word in a sentence.
import java.util.*;

class LongestWordLogic
{
    public String findLongestWord(String str)
    {
        String Arr[] = str.split(" ");

        String longestWord = "";

        for(int i = 0; i < Arr.length; i++)
        {
            if(Arr[i].length() > longestWord.length())
            {
                longestWord = Arr[i];
            }
        }

        return longestWord;
    }
}

class LongestWord
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter a sentence : ");
        String str = sobj.nextLine();

        LongestWordLogic lobj = new LongestWordLogic();

        String result = lobj.findLongestWord(str);

        System.out.println("Longest word : " + result);
    }
}