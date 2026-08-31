/*
    Develop a Java application that accepts a directory path and
    a filename from the user.

    Search for the specified file inside the directory.
*/

import java.util.*;
import java.io.*;

class SearchFileInDirectory
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        try
        {
            System.out.print("Enter directory : ");

            String path = sobj.nextLine();

            System.out.print("Enter file to search : ");

            String fileName = sobj.nextLine();

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

            boolean bFound = false;

            for(int iCnt = 0; iCnt < arr.length; iCnt++)
            {
                if(arr[iCnt].isFile() &&
                   arr[iCnt].getName().equalsIgnoreCase(fileName))
                {
                    System.out.println();
                    System.out.println("File found");
                    System.out.println();

                    System.out.println("Name : " +
                                       arr[iCnt].getName());

                    System.out.println("Size : " +
                                       arr[iCnt].length() +
                                       " bytes");

                    System.out.println("Path : " +
                                       arr[iCnt].getAbsolutePath());

                    bFound = true;

                    break;
                }
            }

            if(bFound == false)
            {
                System.out.println();
                System.out.println(fileName + " not found");
            }
        }
        catch(Exception e)
        {
            System.out.println("Exception Occured : " + e);
        }

        sobj.close();
    }
}