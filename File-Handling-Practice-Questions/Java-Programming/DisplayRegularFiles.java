/*
    Write Java program to accept directory name from user and display
    names of all regular files from that directory.
*/

import java.io.*;
import java.util.*;

class DisplayRegularFiles
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        String DirectoryName = null;

        System.out.println("Enter Directory Name : ");
        DirectoryName = sobj.nextLine();

        FileX.DisplayRegularFiles(DirectoryName);
    }
}

class FileX
{
    public static void DisplayRegularFiles(String DirectoryName)
    {
        File fobjfolder = new File(DirectoryName);

        File fArr[] = fobjfolder.listFiles();

        for(int i = 0; i < fArr.length; i++)
        {
            if(fArr[i].isFile())
            {
                System.out.println(fArr[i].getName());
            }
        }
    }
}