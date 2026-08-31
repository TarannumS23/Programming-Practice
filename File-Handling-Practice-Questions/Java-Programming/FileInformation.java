/*
    Develop a Java application that accepts a filename and displays
    detailed information about that file.

    Display:
    File Name
    Absolute Path
    File Size
    Readable
    Writable
    Hidden
    Last Modified

    Use File class.
*/

import java.util.*;
import java.io.*;
import java.text.*;

class FileInformation
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        try
        {
            System.out.print("Enter file name : ");

            String fileName = sobj.nextLine();

            File fobj = new File(fileName);

            if(fobj.exists() == false)
            {
                System.out.println("File does not exist");
                return;
            }

            System.out.println();

            System.out.println("File Name      : " + fobj.getName());

            System.out.println("Absolute Path  : " +
                               fobj.getAbsolutePath());

            System.out.println("File Size      : " +
                               fobj.length() + " bytes");

            System.out.println("Readable       : " +
                               fobj.canRead());

            System.out.println("Writable       : " +
                               fobj.canWrite());

            System.out.println("Hidden         : " +
                               fobj.isHidden());

            Date date = new Date(fobj.lastModified());

            DateFormat df = new SimpleDateFormat(
                                                "dd-MM-yyyy HH:mm:ss"
                                                );

            System.out.println("Last Modified  : " +
                               df.format(date));
        }
        catch(Exception e)
        {
            System.out.println("Exception Occured : " + e);
        }

        sobj.close();
    }
}