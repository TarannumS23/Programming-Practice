/*
    Develop a Java application that accepts the name of a text file
    and performs analysis on its contents.

    Calculate:
    Total characters
    Total words
    Total lines
    Uppercase characters
    Lowercase characters
    Digits
    Spaces
*/

import java.util.*;
import java.io.*;

class FileContentAnalysis
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        try
        {
            System.out.print("Enter file name : ");

            String fileName = sobj.nextLine();

            FileInputStream fis =
                new FileInputStream(fileName);

            int iRet = 0;

            int iCharacters = 0;
            int iWords = 0;
            int iLines = 0;
            int iUppercase = 0;
            int iLowercase = 0;
            int iDigits = 0;
            int iSpaces = 0;

            boolean bWord = false;

            while((iRet = fis.read()) != -1)
            {
                char ch = (char)iRet;

                iCharacters++;

                if(Character.isUpperCase(ch))
                {
                    iUppercase++;
                }

                if(Character.isLowerCase(ch))
                {
                    iLowercase++;
                }

                if(Character.isDigit(ch))
                {
                    iDigits++;
                }

                if(ch == ' ')
                {
                    iSpaces++;
                }

                if(ch == '\n')
                {
                    iLines++;
                }

                if(Character.isWhitespace(ch))
                {
                    bWord = false;
                }
                else
                {
                    if(bWord == false)
                    {
                        iWords++;
                        bWord = true;
                    }
                }
            }

            fis.close();

            System.out.println();
            System.out.println("File : " + fileName);
            System.out.println();

            System.out.println("Characters : " + iCharacters);
            System.out.println("Words      : " + iWords);
            System.out.println("Lines      : " + iLines);
            System.out.println("Uppercase  : " + iUppercase);
            System.out.println("Lowercase  : " + iLowercase);
            System.out.println("Digits     : " + iDigits);
            System.out.println("Spaces     : " + iSpaces);
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File does not exist");
        }
        catch(Exception e)
        {
            System.out.println("Exception Occured : " + e);
        }

        sobj.close();
    }
}