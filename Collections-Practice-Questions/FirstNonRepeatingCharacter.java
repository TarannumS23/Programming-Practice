/*
    A messaging application wants to identify the first character in a message that occurs only once.
    Input : Programming
    Output : First non-repeating Character : P
*/

import java.util.*;

class FirstNonRepeatingCharacter 
{
    public static void main(String A[])
    {
        if(A.length != 1)
        {
            System.out.println("Invalid number of arguments");
            return;
        }

        String str = A[0];

        LinkedHashMap <Character,Integer> frequency = new LinkedHashMap<Character,Integer>();

        for(char ch : str.toCharArray())
        {
            frequency.put(ch,frequency.getOrDefault(ch, 0) + 1);
        }
        
        for(Map.Entry<Character,Integer> eobj : frequency.entrySet())
        {
            if(eobj.getValue() == 1)
            {
                System.out.println("First non-repeating character : "+eobj.getKey());
                break;
            }
        }
    }
}
