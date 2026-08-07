/*
    Write Java program to accept directory name from user and display
    all names of files from that directory.
*/

import java.util.Scanner;
import java.io.*;

class DisplayFilesFromDirectory
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        String DirectoryName = null;
        boolean bRet = false;

        System.out.println("Enter directory name : ");
        DirectoryName = sobj.nextLine();

        bRet = FileX.DisplayFiles(DirectoryName);

        if(bRet == false)
        {
            System.out.println("Invalid directory name");
        }
    }
}

class FileX
{
    public static boolean DisplayFiles(String DirectoryName)
    {
        File fobj = new File(DirectoryName);

        if((fobj.exists() == false) || (fobj.isDirectory() == false))
        {
            return false;
        }

        File Files[] = fobj.listFiles();

        if(Files != null)
        {
            for(int i = 0; i < Files.length; i++)
            {
                System.out.println(Files[i].getName());
            }
        }

        return true;
    }
}