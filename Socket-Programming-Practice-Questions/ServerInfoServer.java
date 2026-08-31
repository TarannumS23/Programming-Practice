/*
    ***** SERVER SIDE *****

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
import java.text.*;

class ServerInfoServer
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

                String operation = command.trim().toUpperCase();

                String result;

                if(operation.equals("DATE"))
                {
                    result = GetDate();
                }
                else if(operation.equals("TIME"))
                {
                    result = GetTime();
                }
                else if(operation.equals("SERVERNAME"))
                {
                    result = GetServerName();
                }
                else if(operation.equals("HELP"))
                {
                    result = GetHelp();
                }
                else if(operation.equals("QUIT"))
                {
                    dos.writeUTF("Disconnected from server");
                    break;
                }
                else
                {
                    result = "Invalid Command";
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


    // Method to get current date
    public static String GetDate()
    {
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

        Date date = new Date();

        return dateFormat.format(date);
    }


    // Method to get current time
    public static String GetTime()
    {
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

        Date date = new Date();

        return dateFormat.format(date);
    }


    // Method to get server name
    public static String GetServerName()
    {
        try
        {
            InetAddress address = InetAddress.getLocalHost();

            return "Server Name : " + address.getHostName();
        }
        catch(Exception e)
        {
            return "Unable to get server name";
        }
    }


    // Method to display available commands
    public static String GetHelp()
    {
        return "Available Commands:\n" +
               "DATE\n" +
               "TIME\n" +
               "SERVERNAME\n" +
               "HELP\n" +
               "QUIT";
    }
}