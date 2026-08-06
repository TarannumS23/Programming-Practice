/*
    Write Java program to accept file name from user and open that file.
*/

import java.util.Scanner;
import java.io.*;

class OpenFile
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        String FileName = null;
        boolean bRet = false;

        System.out.println("Enter file name : ");
        FileName = sobj.nextLine();

        bRet = FileX.OpenFile(FileName);

        if(bRet == true)
        {
            System.out.println("File opened successfully");
        }
        else
        {
            System.out.println("Unable to open file");
        }
    }
}

class FileX
{
    public static boolean OpenFile(String FileName)
    {
        File fobj = new File(FileName);

        if(fobj.exists())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}