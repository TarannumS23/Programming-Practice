/*
    ***** CLIENT SIDE *****

    Develop a client-server application where the server performs different number-realted operations
    requested by the client

    The client should send commands in the following format:

    EVEN <number>
    ODD <number>
    PRIME <number>
    PERFECT <number>
    FACTORIAL <number>
    REVERSE <number>
*/

import java.util.*;
import java.io.*;
import java.net.*;

class NumberOperationClient 
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
                System.out.println("EVEN      : EVEN <number>");
                System.out.println("ODD       : ODD <number>");
                System.out.println("PRIME     : PRIME <number>");
                System.out.println("PERFECT   : PERFECT <number>");
                System.out.println("FACTORIAL : FACTORIAL <number>");
                System.out.println("REVERSE   : REVERSE <number>");
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
