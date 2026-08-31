/*
    Develop a Java application that accepts the path of a directory
    and displays all files and directories present inside it.
*/

import java.util.*;
import java.io.*;

class DirectoryListing
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        try
        {
            System.out.print("Enter directory : ");

            String path = sobj.nextLine();

            File dobj = new File(path);

            if(dobj.exists() == false)
            {
                System.out.println("Directory does not exist");
                return;
            }

            if(dobj.isDirectory() == false)
            {
                System.out.println("Specified path is not a directory");
                return;
            }

            File arr[] = dobj.listFiles();

            System.out.println();
            System.out.println("Contents :");
            System.out.println();

            for(int iCnt = 0; iCnt < arr.length; iCnt++)
            {
                System.out.println(arr[iCnt].getName());
            }
        }
        catch(Exception e)
        {
            System.out.println("Exception Occured : " + e);
        }

        sobj.close();
    }
}