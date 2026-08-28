/*
    ***** SERVER SIDE *****

    Develoope a multithreaded client-server application in java that performs mathematical operations remotely.
    The client should accept a command from the user and send that command to server.
    The server should parse the recieved command, perform the requested mathematical operation, and return the result to the client.
    
    The server should support the following commands:
    
    ADD <NO1> <NO2>
    SUB <NO1> <NO2>
    MULT <NO1> <NO2>
    DIV <NO1> <NO2>
    MOD <NO1> <NO2>
    MAX <NO1> <NO2>
    MIN <NO1> <NO2>
    QUIT
*/

import java.util.*;
import java.io.*;
import java.net.*;

class MathOperationServer
{
    public static void main(String A[])
    {
        try
        {
            // class         object                       port number
            ServerSocket serversocket = new ServerSocket(9000);

            System.out.println("----------------------------------------------------------");
            System.out.println("--------------- Marvellous Server Started ----------------");
            System.out.println("----------------------------------------------------------");

            // Loop for multiple client request
            while(true)        // Unconditional loop
            {
                System.out.println("Server is waiting for client request");

                Socket clientsocket = serversocket.accept();

                System.out.println("Client Connected Successfully");

                // Thread gets created for client ( 1 thread for 1 client)
                Thread t = new Thread(() -> HandleClientRequest(clientsocket));  

                t.start();
            }  // End of while      
        }
        catch(Exception e)
        {
            System.out.println("Exception Occured : "+e);
        }
    }   // End of main

    public static void HandleClientRequest(Socket socket)
    {
        try
        {
            DataInputStream dis = new DataInputStream(socket.getInputStream());

            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());

            dos.writeUTF("Connected to Marvellous Server"); // UTF -> Unicode Transformation Format , it converts string,character,ymbol,emoji,etc. into binery data

            while(true)
            {
                String command = dis.readUTF();

                System.out.println("Command Recieved from Client : "+command);

                String parts[] = command.split("\\s+");      // Tokenization

                String operation = parts[0].toUpperCase();      // for operations like addition , subtraction ,etc.

                if(operation.equals("QUIT"))
                {
                    dos.writeUTF("Disconnected from server");

                    break;      
                }

                if(parts.length != 3)
                {
                    dos.writeUTF("Invalid Command Format");
                    continue;        
                }

                double no1 = Double.parseDouble(parts[1]);
                double no2 = Double.parseDouble(parts[2]);

                double result = 0.0;

                if(operation.equals("ADD"))
                {
                    result = no1 + no2;

                    dos.writeUTF("Result is : "+result);
                }
                else if(operation.equals("SUB"))
                {
                    result = no1 - no2;

                    dos.writeUTF("Result is : "+result);
                }
                else if(operation.equals("MULT"))
                {
                    result = no1 * no2;

                    dos.writeUTF("Result is : "+result);
                }
                else if(operation.equals("DIV"))
                {
                    if(no2 == 0)
                    {
                        dos.writeUTF("Cannot divide by zero");
                    }
                    else
                    {
                        result = no1 / no2;

                        dos.writeUTF("Result is : "+result);
                    }    
                }
                else if(operation.equals("MOD"))
                {
                    result = no1 % no2;

                    dos.writeUTF("Result is : "+result);
                }
                else if(operation.equals("MAX"))
                {
                    if(no1 > no2)
                    {
                        result = no1;
                    }
                    else
                    {
                        result = no2;
                    }

                    dos.writeUTF("Result is : "+result);
                }
                else if(operation.equals("MIN"))
                {
                    if(no1 < no2)
                    {
                        result = no1;
                    }
                    else
                    {
                        result = no2;
                    }

                    dos.writeUTF("Result is : "+result);
                }
                else
                {
                    dos.writeUTF("Invalid operation");
                }

            }  // End of while

            socket.close();

            System.out.println("Client Disconnected");
        }
        catch(Exception e)
        {
            System.out.println("Exception Occured : "+e);
        }
    }

}   // Endd of class