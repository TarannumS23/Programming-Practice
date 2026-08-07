/*
    Write Java program to accept file name from user and check whether
    that file is a regular file or not.
*/

import java.io.*;
import java.util.Scanner;

class CheckRegularFile
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        String FileName = null;
        boolean bRet = false;

        System.out.println("Enter file name : ");
        FileName = sobj.nextLine();

        bRet = FileX.CheckRegular(FileName);

        if(bRet == true)
        {
            System.out.println("It is a regular file");
        }
        else
        {
            System.out.println("It is not a regular file");
        }
    }
}

class FileX
{
    public static boolean CheckRegular(String FileName)
    {
        File fobj = new File(FileName);

        return fobj.isFile();
    }
}
