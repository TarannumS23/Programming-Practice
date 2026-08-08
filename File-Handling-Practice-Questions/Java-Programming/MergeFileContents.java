/*
    Write Java program to accept directory name from user and write
    contents of all files from that directory into Marvellous.txt file.
*/

import java.io.*;
import java.util.*;

class FileX
{
    public static void MergeContents(String DirectoryName) throws IOException
    {
        File fobjfolder = new File(DirectoryName);

        File fArr[] = fobjfolder.listFiles();

        FileOutputStream foobj = new FileOutputStream("Marvellous.txt");

        for(int i = 0; i < fArr.length; i++)
        {
            if(fArr[i].isFile())
            {
                FileInputStream fiobj = new FileInputStream(fArr[i]);

                byte Buffer[] = new byte[1024];
                int iRet = 0;

                while((iRet = fiobj.read(Buffer)) != -1)
                {
                    foobj.write(Buffer, 0, iRet);
                }

                fiobj.close();
            }
        }

        foobj.close();
    }
}

class MergeFileContents
{
    public static void main(String A[]) throws IOException
    {
        Scanner sobj = new Scanner(System.in);

        String DirectoryName = null;

        System.out.println("Enter Directory Name : ");
        DirectoryName = sobj.nextLine();

        FileX.MergeContents(DirectoryName);
    }
}