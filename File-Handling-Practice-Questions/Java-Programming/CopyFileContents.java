/*
    Write Java program to accept two file names from user and copy
    contents of first file into second file.
*/

import java.io.*;
import java.util.Scanner;

class CopyFileContents
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        String Source = null;
        String Destination = null;

        System.out.println("Enter source file name : ");
        Source = sobj.nextLine();

        System.out.println("Enter destination file name : ");
        Destination = sobj.nextLine();

        FileX.CopyFile(Source, Destination);
    }
}

class FileX
{
    public static void CopyFile(String Source, String Destination)
    {
        try
        {
            FileInputStream fiobj = new FileInputStream(Source);
            FileOutputStream foobj = new FileOutputStream(Destination);

            byte Buffer[] = new byte[1024];
            int iRet = 0;

            while((iRet = fiobj.read(Buffer)) != -1)
            {
                foobj.write(Buffer, 0, iRet);
            }

            fiobj.close();
            foobj.close();
        }
        catch(IOException obj)
        {
            System.out.println("Unable to perform file operation");
        }
    }
}
