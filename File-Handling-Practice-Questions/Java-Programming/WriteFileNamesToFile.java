/*
    Write Java program to accept directory name from user and write
    names of all files from that directory into Marvellous.txt file.
*/

import java.io.*;
import java.util.*;

class FileX
{
    public static void WriteFileNames(String DirectoryName) throws IOException
    {
        File fobjfolder = new File(DirectoryName);

        File fArr[] = fobjfolder.listFiles();

        FileOutputStream foobj = new FileOutputStream("Marvellous.txt");

        for(int i = 0; i < fArr.length; i++)
        {
            if(fArr[i].isFile())
            {
                String FileName = fArr[i].getName();

                foobj.write(FileName.getBytes());
                foobj.write('\n');
            }
        }

        foobj.close();
    }
}

class WriteFileNamesToFile
{
    public static void main(String A[]) throws IOException
    {
        Scanner sobj = new Scanner(System.in);

        String DirectoryName = null;

        System.out.println("Enter Directory Name : ");
        DirectoryName = sobj.nextLine();

        FileX.WriteFileNames(DirectoryName);
    }
}