/*
    ***** CLIENT SIDE *****

    Develop a client-server application where the client can check
    whether a particular file exists on the server.

    Command:

    EXISTS <filename>
*/

import java.util.*;
import java.io.*;
import java.net.*;

class FileExistsClient
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
                System.out.println("File Commands");
                System.out.println("----------------------------------------------------------");

                System.out.println("EXISTS <filename>");
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