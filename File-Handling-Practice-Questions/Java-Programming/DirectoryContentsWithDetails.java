/*
    Extend the previous assignment to distinguish between files
    and directories.

    For files, also display their sizes.
*/

import java.util.*;
import java.io.*;

class DirectoryContentsWithDetails
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
                if(arr[iCnt].isFile())
                {
                    System.out.println("[FILE] " +
                                       arr[iCnt].getName() +
                                       "    " +
                                       arr[iCnt].length() +
                                       " bytes");
                }
                else if(arr[iCnt].isDirectory())
                {
                    System.out.println("[DIR]  " +
                                       arr[iCnt].getName());
                }
            }
        }
        catch(Exception e)
        {
            System.out.println("Exception Occured : " + e);
        }

        sobj.close();
    }
}