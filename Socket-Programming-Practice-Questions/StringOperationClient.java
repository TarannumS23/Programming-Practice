/*
    ***** CLIENT SIDE *****

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

class StringOperationClient
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        try
        {
            System.out.println("----------------------------------------------------------");
            System.out.println("-------------------- Client Started ----------------------");
            System.out.println("----------------------------------------------------------");

            Socket socket = new Socket(
                                            "127.0.0.1",
                                            9000
                                       );

            System.out.println("Connection with server is successful");

            DataInputStream dis =
                new DataInputStream(socket.getInputStream());

            DataOutputStream dos =
                new DataOutputStream(socket.getOutputStream());

            System.out.println(dis.readUTF());

            while(true)
            {
                System.out.println("----------------------------------------------------------");
                System.out.println("String Operation Commands");
                System.out.println("----------------------------------------------------------");

                System.out.println("LENGTH    : LENGTH <string>");
                System.out.println("UPPER     : UPPER <string>");
                System.out.println("LOWER     : LOWER <string>");
                System.out.println("REVERSE   : REVERSE <string>");
                System.out.println("PALINDROME: PALINDROME <string>");
                System.out.println("VOWELS    : VOWELS <string>");
                System.out.println("QUIT");

                System.out.println("----------------------------------------------------------");

                System.out.print("Enter Command : ");

                String command = sobj.nextLine();

                dos.writeUTF(command);

                String response = dis.readUTF();

                System.out.println("Server Response : " + response);

                if(command.trim().equalsIgnoreCase("QUIT"))
                {
                    break;
                }
            }

            socket.close();
            sobj.close();
        }
        catch(Exception e)
        {
            System.out.println("Exception Occured : " + e);
        }
    }
}