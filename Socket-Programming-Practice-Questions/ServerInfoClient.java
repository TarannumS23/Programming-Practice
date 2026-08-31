/*
    ***** CLIENT SIDE *****

    Extend the existing client-server application by implementing
    commands that provide information about the server.

    Supported commands:

    DATE
    TIME
    SERVERNAME
    HELP
    QUIT
*/

import java.util.*;
import java.io.*;
import java.net.*;

class ServerInfoClient
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
                System.out.println("Server Information Commands");
                System.out.println("----------------------------------------------------------");

                System.out.println("DATE       : Current Date");
                System.out.println("TIME       : Current Time");
                System.out.println("SERVERNAME : Server Name");
                System.out.println("HELP       : Available Commands");
                System.out.println("QUIT       : Disconnect");

                System.out.println("----------------------------------------------------------");

                System.out.print("Enter Command : ");

                String command = sobj.nextLine();

                dos.writeUTF(command);

                String response = dis.readUTF();

                System.out.println("Server Response : ");
                System.out.println(response);

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