/*
    Write Java program to accept directory name from user and display
    all file names from that directory with their sizes.
*/

import java.io.*;
import java.util.Scanner;

class DisplayFilesWithSize
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        String DirectoryName = null;

        System.out.println("Enter directory name : ");
        DirectoryName = sobj.nextLine();

        FileX.DisplayFiles(DirectoryName);
    }
}

class FileX
{
    public static void DisplayFiles(String DirectoryName)
    {
        File fobj = new File(DirectoryName);

        File Files[] = fobj.listFiles();

        for(int i = 0; i < Files.length; i++)
        {
            if(Files[i].isFile())
            {
                System.out.println(
                    Files[i].getName()+" : "+Files[i].length()+" bytes"
                );
            }
        }
    }
}
