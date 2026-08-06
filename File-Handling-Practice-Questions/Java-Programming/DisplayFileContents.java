/*
    Write Java program to accept file name from user and open that file
    and display the contents on screen.
*/

import java.io.*;
import java.util.Scanner;

class DisplayFileContents
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        String FileName = null;
        boolean bRet = false;

        System.out.println("Enter the file name : ");
        FileName = sobj.nextLine();

        bRet = FileX.DisplayFile(FileName);

        if(bRet == false)
        {
            System.out.println("Unable to open file");
        }
    }
}

class FileX
{
    public static boolean DisplayFile(String FileName)
    {
        byte Buffer[] = new byte[1024];
        int iRet = 0;

        try
        {
            FileInputStream fiobj = new FileInputStream(FileName);

            while((iRet = fiobj.read(Buffer)) != -1)
            {
                System.out.print(new String(Buffer, 0, iRet));
            }

            fiobj.close();

            return true;
        }
        catch(IOException obj)
        {
            return false;
        }
    }
}