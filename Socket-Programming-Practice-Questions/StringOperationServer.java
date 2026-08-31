/*
    ***** SERVER SIDE *****

    Develop a client-server application that performs different string operations.

    The client should send commands containing an operation and a string.

    Supported commands : 

    LENGTH <string>
    UPPER <string>
    LOWER <string>
    REVERSE <string>
    PALINDROME <string>
    VOWELS <string>
*/

import java.util.*;
import java.io.*;
import java.net.*;

class StringOperationServer
{
    public static void main(String A[])
    {
        try
        {
            // class         object                       port number
            ServerSocket serversocket = new ServerSocket(9000);

            System.out.println("----------------------------------------------------------");
            System.out.println("-------------------- Server Started ----------------------");
            System.out.println("----------------------------------------------------------");

            while(true)
            {
                System.out.println("Server is waiting for client request");

                Socket clientsocket = serversocket.accept();

                System.out.println("Client Connected Successfully");

                // 1 Thread for 1 Client
                Thread t = new Thread(() -> HandleClientRequest(clientsocket));

                t.start();
            }
        }
        catch(Exception e)
        {
            System.out.println("Exception Occured : " + e);
        }
    }


    public static void HandleClientRequest(Socket socket)
    {
        try
        {
            DataInputStream dis =
                new DataInputStream(socket.getInputStream());

            DataOutputStream dos =
                new DataOutputStream(socket.getOutputStream());

            dos.writeUTF("Connected to Marvellous Server");

            while(true)
            {
                String command = dis.readUTF();

                System.out.println("Command Received from Client : " + command);

                if(command.trim().equalsIgnoreCase("QUIT"))
                {
                    dos.writeUTF("Disconnected from server");
                    break;
                }

                int space = command.indexOf(" ");

                if(space == -1)
                {
                    dos.writeUTF("Invalid Command Format");
                    continue;
                }

                String operation = command.substring(0, space).toUpperCase();

                String str = command.substring(space + 1);

                if(str.length() == 0)
                {
                    dos.writeUTF("String is missing");
                    continue;
                }

                String result;

                if(operation.equals("LENGTH"))
                {
                    result = FindLength(str);
                }
                else if(operation.equals("UPPER"))
                {
                    result = ConvertUpper(str);
                }
                else if(operation.equals("LOWER"))
                {
                    result = ConvertLower(str);
                }
                else if(operation.equals("REVERSE"))
                {
                    result = ReverseString(str);
                }
                else if(operation.equals("PALINDROME"))
                {
                    result = CheckPalindrome(str);
                }
                else if(operation.equals("VOWELS"))
                {
                    result = CountVowels(str);
                }
                else
                {
                    result = "Invalid operation";
                }

                dos.writeUTF(result);
            }

            socket.close();

            System.out.println("Client Disconnected");
        }
        catch(Exception e)
        {
            System.out.println("Exception Occured : " + e);
        }
    }

    public static String FindLength(String str)
    {
        int iLength = str.length();

        return "Length of string is : " + iLength;
    }

    public static String ConvertUpper(String str)
    {
        return str.toUpperCase();
    }

    public static String ConvertLower(String str)
    {
        return str.toLowerCase();
    }

    public static String ReverseString(String str)
    {
        String reverse = "";

        int iCnt = 0;

        for(iCnt = str.length() - 1; iCnt >= 0; iCnt--)
        {
            reverse = reverse + str.charAt(iCnt);
        }

        return reverse;
    }

    public static String CheckPalindrome(String str)
    {
        String reverse = ReverseString(str);

        if(str.equalsIgnoreCase(reverse))
        {
            return str + " is a Palindrome";
        }
        else
        {
            return str + " is Not a Palindrome";
        }
    }

    public static String CountVowels(String str)
    {
        int iCnt = 0;
        int iVowels = 0;

        char ch;

        for(iCnt = 0; iCnt < str.length(); iCnt++)
        {
            ch = Character.toLowerCase(str.charAt(iCnt));

            if(ch == 'a' || ch == 'e' || ch == 'i' ||
               ch == 'o' || ch == 'u')
            {
                iVowels++;
            }
        }

        return "Number of vowels : " + iVowels;
    }
}