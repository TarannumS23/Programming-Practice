/*
    ***** CLIENT SIDE *****

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

class MathOperationClient 
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        try
        {
            System.out.println("----------------------------------------------------------");
            System.out.println("--------------- Marvellous Client Started ----------------");
            System.out.println("----------------------------------------------------------");

            Socket socket = new Socket(
                                            "127.0.0.1",        // Ip address
                                            9000
                                       );

            System.out.println("Connection with server is successfull");

            DataInputStream dis = new DataInputStream(socket.getInputStream());       // here InputStream and InputStream are connected of server and client

            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());      // OutputStream connected to OutputStream of server and client

            System.out.println(dis.readUTF());  
            
            while(true)
            {
                System.out.println("----------------------------------------------------------");
                System.out.println("Mathematical Commands");
                System.out.println("----------------------------------------------------------");
                System.out.println("ADD  : ADD <NO1> <NO2>");
                System.out.println("SUB  : SUB <NO1> <NO2>");
                System.out.println("MULT : MULT <NO1> <NO2>");
                System.out.println("DIV  : DIV <NO1> <NO2>");
                System.out.println("MOD  : MOD <NO1> <NO2>");
                System.out.println("MAX  : MAX <NO1> <NO2>");
                System.out.println("MIN  : MIN <NO1> <NO2>");
                System.out.println("QUIT");
                System.out.println("----------------------------------------------------------");

                System.out.println("Enter Command : ");

                String command = sobj.nextLine();

                dos.writeUTF(command);
 
                String response = dis.readUTF();

                System.out.println(response);

                if(command.equalsIgnoreCase("QUIT"))
                {
                    break;
                }
            }
        }
        catch(Exception e)
        {
            System.out.println("Exception Occured : "+e);
        }
    }
}
