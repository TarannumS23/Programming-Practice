/*
    Write Java program to accept file name from user and calculate
    checksum of that file.
*/

import java.io.*;
import java.util.Scanner;

class CalculateFileChecksum
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        String FileName = null;
        int iRet = 0;

        System.out.println("Enter file name : ");
        FileName = sobj.nextLine();

        iRet = FileX.CalculateChecksum(FileName);

        System.out.println("Checksum of file is : "+iRet);
    }
}

class FileX
{
    public static int CalculateChecksum(String FileName)
    {
        int iSum = 0;
        int iRet = 0;

        try
        {
            FileInputStream fiobj = new FileInputStream(FileName);

            while((iRet = fiobj.read()) != -1)
            {
                iSum = iSum + iRet;
            }

            fiobj.close();
        }
        catch(IOException obj)
        {
            System.out.println("Unable to open file");
        }

        return iSum;
    }
}
