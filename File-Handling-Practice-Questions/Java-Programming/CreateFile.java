/*
    Develop a Java program that accepts a filename from the user
    and creates a new file on the local machine.

    Display:
    - File name
    - Absolute path
    - Whether file creation was successful

    Use the File class.
*/

import java.util.*;
import java.io.*;

class CreateFile
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        try
        {
            System.out.print("Enter file name : ");

            String fileName = sobj.nextLine();

            File fobj = new File(fileName);

            System.out.println("File Name : " + fobj.getName());

            System.out.println("Absolute Path : " +
                               fobj.getAbsolutePath());

            if(fobj.exists())
            {
                System.out.println(fileName + " already exists");
            }
            else
            {
                if(fobj.createNewFile())
                {
                    System.out.println(fileName +
                                       " created successfully");
                }
                else
                {
                    System.out.println("File creation failed");
                }
            }
        }
        catch(Exception e)
        {
            System.out.println("Exception Occured : " + e);
        }

        sobj.close();
    }
}