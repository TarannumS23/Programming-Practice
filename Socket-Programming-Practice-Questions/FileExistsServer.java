/*
    ***** SERVER SIDE *****

    Develop a client-server application where the client can check
    whether a particular file exists on the server.

    Command:

    EXISTS <filename>
*/

import java.util.*;
import java.io.*;
import java.net.*;

class FileExistsServer
{
    public static void main(String A[])
    {
        try
        {
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
                Thread t = new Thread(() ->
                    HandleClientRequest(clientsocket));

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

            dos.writeUTF("Connected to Server");

            while(true)
            {
                String command = dis.readUTF();

                System.out.println("Command Received from Client : "
                                   + command);

                String parts[] = command.split("\\s+", 2);

                String operation = parts[0].toUpperCase();

                if(operation.equals("QUIT"))
                {
                    dos.writeUTF("Disconnected from server");
                    break;
                }

                if(operation.equals("EXISTS"))
                {
                    if(parts.length != 2)
                    {
                        dos.writeUTF("Invalid Command Format");
                        continue;
                    }

                    String fileName = parts[1];

                    File fobj = new File(fileName);

                    if(fobj.exists())
                    {
                        dos.writeUTF(fileName +
                                     " exists on server");
                    }
                    else
                    {
                        dos.writeUTF(fileName +
                                     " does not exist");
                    }
                }
                else
                {
                    dos.writeUTF("Invalid operation");
                }
            }

            socket.close();

            System.out.println("Client Disconnected");
        }
        catch(Exception e)
        {
            System.out.println("Exception Occured : " + e);
        }
    }
}