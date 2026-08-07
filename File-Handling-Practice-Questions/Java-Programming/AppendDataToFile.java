/*
    Write Java program to accept file name from user and open that file
    in write mode and write some data at the end of file.
*/

import java.util.Scanner;
import java.io.*;

class AppendDataToFile
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        String FileName = null;
        String Data = null;
        boolean bRet = false;

        System.out.println("Enter file name : ");
        FileName = sobj.nextLine();

        System.out.println("Enter data : ");
        Data = sobj.nextLine();

        bRet = FileX.WriteData(FileName, Data);

        if(bRet == true)
        {
            System.out.println("Data written successfully");
        }
        else
        {
            System.out.println("Unable to write data");
        }
    }
}

class FileX
{
    public static boolean WriteData(String FileName, String Data)
    {
        try
        {
            FileOutputStream fobj = new FileOutputStream(FileName, true);

            byte Buffer[] = Data.getBytes();

            fobj.write(Buffer);

            fobj.close();

            return true;
        }
        catch(IOException obj)
        {
            return false;
        }
    }
}

