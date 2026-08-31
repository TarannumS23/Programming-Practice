/*
    ***** SERVER SIDE *****

    Develop a client-server application where the server performs
    different number-related operations requested by the client.

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

class NumberOperationServer
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
            DataInputStream dis = new DataInputStream(socket.getInputStream());

            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());

            dos.writeUTF("Connected to Marvellous Server");

            while(true)
            {
                String command = dis.readUTF();

                System.out.println("Command Received from Client : " + command);

                String parts[] = command.split("\\s+");

                String operation = parts[0].toUpperCase();

                // QUIT command
                if(operation.equals("QUIT"))
                {
                    dos.writeUTF("Disconnected from server");
                    break;
                }

                // Command should contain operation and number
                if(parts.length != 2)
                {
                    dos.writeUTF("Invalid Command Format");
                    continue;
                }

                int no;

                try
                {
                    no = Integer.parseInt(parts[1]);
                }
                catch(NumberFormatException e)
                {
                    dos.writeUTF("Invalid Number");
                    continue;
                }

                String result;

                if(operation.equals("EVEN"))
                {
                    result = CheckEven(no);
                }
                else if(operation.equals("ODD"))
                {
                    result = CheckOdd(no);
                }
                else if(operation.equals("PRIME"))
                {
                    result = CheckPrime(no);
                }
                else if(operation.equals("PERFECT"))
                {
                    result = CheckPerfect(no);
                }
                else if(operation.equals("FACTORIAL"))
                {
                    result = CalculateFactorial(no);
                }
                else if(operation.equals("REVERSE"))
                {
                    result = ReverseNumber(no);
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


    // Method to check Even Number
    public static String CheckEven(int no)
    {
        if(no % 2 == 0)
        {
            return no + " is an Even Number";
        }
        else
        {
            return no + " is Not an Even Number";
        }
    }


    // Method to check Odd Number
    public static String CheckOdd(int no)
    {
        if(no % 2 != 0)
        {
            return no + " is an Odd Number";
        }
        else
        {
            return no + " is Not an Odd Number";
        }
    }


    // Method to check Prime Number
    public static String CheckPrime(int no)
    {
        if(no <= 1)
        {
            return no + " is Not a Prime Number";
        }

        int iCnt = 0;

        for(iCnt = 2; iCnt <= no / 2; iCnt++)
        {
            if(no % iCnt == 0)
            {
                break;
            }
        }

        if(iCnt > no / 2)
        {
            return no + " is a Prime Number";
        }
        else
        {
            return no + " is Not a Prime Number";
        }
    }


    // Method to check Perfect Number
    public static String CheckPerfect(int no)
    {
        if(no <= 0)
        {
            return no + " is Not a Perfect Number";
        }

        int sum = 0;
        int iCnt = 0;

        for(iCnt = 1; iCnt < no; iCnt++)
        {
            if(no % iCnt == 0)
            {
                sum = sum + iCnt;
            }
        }

        if(sum == no)
        {
            return no + " is a Perfect Number";
        }
        else
        {
            return no + " is Not a Perfect Number";
        }
    }


    // Method to calculate Factorial
    public static String CalculateFactorial(int no)
    {
        if(no < 0)
        {
            return "Factorial is not defined for negative numbers";
        }

        long iFact = 1;
        int iCnt = 0;

        for(iCnt = no; iCnt > 0; iCnt--)
        {
            iFact = iFact * iCnt;
        }

        return "Factorial of " + no + " is : " + iFact;
    }


    // Method to reverse a number
    public static String ReverseNumber(int no)
    {
        int iDigit = 0;
        int iRev = 0;
        int temp = Math.abs(no);

        while(temp != 0)
        {
            iDigit = temp % 10;

            iRev = (iRev * 10) + iDigit;

            temp = temp / 10;
        }

        if(no < 0)
        {
            iRev = -iRev;
        }

        return "Reverse of " + no + " is : " + iRev;
    }
}