import java.util.*;

class ReverseWordsLogic
{
    public String reverseWords(String str)
    {
        String Arr[] = str.split(" ");
        String result = "";

        for(int i = 0; i < Arr.length; i++)
        {
            String word = Arr[i];

            for(int j = word.length() - 1; j >= 0; j--)
            {
                result = result + word.charAt(j);
            }

            if(i < Arr.length - 1)
            {
                result = result + " ";
            }
        }

        return result;
    }
}

class ReverseWords
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter a sentence : ");
        String str = sobj.nextLine();

        ReverseWordsLogic lobj = new ReverseWordsLogic();

        String result = lobj.reverseWords(str);

        System.out.println("Sentence with reversed words : " + result);
    }
}
