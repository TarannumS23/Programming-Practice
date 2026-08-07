/*
    Write Java program to accept directory name from user and create
    that directory.
*/

import java.io.*;
import java.util.Scanner;

class CreateDirectory
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        String DirectoryName = null;
        boolean bRet = false;

        System.out.println("Enter directory name : ");
        DirectoryName = sobj.nextLine();

        bRet = FileX.CreateDirectory(DirectoryName);

        if(bRet == true)
        {
            System.out.println("Directory created successfully");
        }
        else
        {
            System.out.println("Unable to create directory");
        }
    }
}

class FileX
{
    public static boolean CreateDirectory(String DirectoryName)
    {
        File fobj = new File(DirectoryName);

        return fobj.mkdir();
    }
}
