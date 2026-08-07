/*
    Write Java program to accept file name from user and create new file
    of that name if it is not existing.
*/

import java.util.Scanner;
import java.io.*;

class CreateFileIfNotExists
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        String FileName = null;
        boolean bRet = false;

        System.out.println("Enter file name : ");
        FileName = sobj.nextLine();

        bRet = FileX.CreateFile(FileName);

        if(bRet == true)
        {
            System.out.println("File created successfully");
        }
        else
        {
            System.out.println("File already exists or unable to create file");
        }
    }
}

class FileX
{
    public static boolean CreateFile(String FileName)
    {
        try
        {
            File fobj = new File(FileName);

            if(fobj.exists())
            {
                return false;
            }

            fobj.createNewFile();

            return true;
        }
        catch(IOException obj)
        {
            return false;
        }
    }
}

