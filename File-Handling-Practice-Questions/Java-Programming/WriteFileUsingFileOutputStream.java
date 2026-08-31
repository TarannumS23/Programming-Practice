/*
    Develop a Java program that accepts a filename and textual data
    from the user and stores that data inside the specified file.

    Use FileOutputStream.
*/

import java.util.*;
import java.io.*;

class WriteFileUsingFileOutputStream
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        try
        {
            System.out.print("Enter file name : ");
            String fileName = sobj.nextLine();

            System.out.print("Enter data : ");
            String data = sobj.nextLine();

            FileOutputStream fos = new FileOutputStream(fileName);

            byte arr[] = data.getBytes();

            fos.write(arr);

            fos.close();

            System.out.println("Data written successfully");
        }
        catch(Exception e)
        {
            System.out.println("Exception Occured : " + e);
        }

        sobj.close();
    }
}