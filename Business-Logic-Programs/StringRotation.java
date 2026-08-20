// Write a program to check whether one string is rotation or another.
import java.util.*;

class StringRotationLogic
{
    public boolean checkRotation(String str1, String str2)
    {
        if(str1.length() != str2.length())
        {
            return false;
        }

        String temp = str1 + str1;

        return temp.contains(str2);
    }
}

class StringRotation
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter first string : ");
        String str1 = sobj.nextLine();

        System.out.print("Enter second string : ");
        String str2 = sobj.nextLine();

        StringRotationLogic lobj = new StringRotationLogic();

        if(lobj.checkRotation(str1, str2))
        {
            System.out.println("Rotation");
        }
        else
        {
            System.out.println("Not Rotation");
        }
    }
}
