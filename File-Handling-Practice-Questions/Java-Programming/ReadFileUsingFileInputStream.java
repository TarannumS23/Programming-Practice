/*
    Develop a Java program that accepts a filename from the user
    and displays the complete contents of that file.

    Use FileInputStream.
*/

import java.util.*;
import java.io.*;

class ReadFileUsingFileInputStream
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        try
        {
            System.out.print("Enter file name : ");
            String fileName = sobj.nextLine();

            FileInputStream fis = new FileInputStream(fileName);

            System.out.println();
            System.out.println("File contents :");
            System.out.println();

            int iRet = 0;

            while((iRet = fis.read()) != -1)
            {
                System.out.print((char)iRet);
            }

            fis.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File does not exist");
        }
        catch(Exception e)
        {
            System.out.println("Exception Occured : " + e);
        }

        sobj.close();
    }
}