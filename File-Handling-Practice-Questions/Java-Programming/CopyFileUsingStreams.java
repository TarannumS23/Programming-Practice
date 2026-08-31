/*
    Develop a Java application that accepts the names of a source
    file and destination file and copies all data from the source
    into the destination.

    Use FileInputStream and FileOutputStream.
*/

import java.util.*;
import java.io.*;

class CopyFileUsingStreams
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        try
        {
            System.out.print("Enter source file : ");
            String source = sobj.nextLine();

            System.out.print("Enter destination file : ");
            String destination = sobj.nextLine();

            FileInputStream fis = new FileInputStream(source);

            FileOutputStream fos = new FileOutputStream(destination);

            int iRet = 0;

            while((iRet = fis.read()) != -1)
            {
                fos.write(iRet);
            }

            fis.close();
            fos.close();

            System.out.println("File copied successfully");
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Source file does not exist");
        }
        catch(Exception e)
        {
            System.out.println("Exception Occured : " + e);
        }

        sobj.close();
    }
}