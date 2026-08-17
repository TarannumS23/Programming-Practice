/*
    Cinema Seat Booking with Row Pricing + Group Discount

    Seats have different prices per row.
    User tries booking multiple seats; Reject if already booked.
    If group size >= 6, give 10% discount.

    Input : rows, cols, bookedSeatList, requestedSeatList
    Output : success/fail + total cost + remaining seats

    Assumptions:
    Row 1 -> Rs.300
    Row 2 -> Rs.250
    Row 3 -> Rs.200
    Row 4 and above -> Rs.150

    Seat format:
    A1,A2,B3
*/

import java.util.*;

class CinemaSeatBooking
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number of Rows : ");
        int rows = sobj.nextInt();

        System.out.println("Enter Number of Columns : ");
        int cols = sobj.nextInt();

        sobj.nextLine();

        if(rows <= 0 || cols <= 0)
        {
            System.out.println("Rows and columns must be greater than 0");
            return;
        }

        System.out.println("Enter Booked Seats (example: A1,B2) : ");
        String bookedInput = sobj.nextLine();

        System.out.println("Enter Requested Seats (example: A2,C3) : ");
        String requestedInput = sobj.nextLine();

        boolean[][] booked = new boolean[rows][cols];

        if(!bookedInput.trim().isEmpty())
        {
            String[] bookedSeats = bookedInput.split(",");

            for(String seat : bookedSeats)
            {
                seat = seat.trim().toUpperCase();

                int row = seat.charAt(0) - 'A';
                int col = Integer.parseInt(seat.substring(1)) - 1;

                if(row < 0 || row >= rows || col < 0 || col >= cols)
                {
                    System.out.println("Invalid booked seat: " + seat);
                    return;
                }

                booked[row][col] = true;
            }
        }

        String[] requestedSeats = requestedInput.split(",");

        for(String seat : requestedSeats)
        {
            seat = seat.trim().toUpperCase();

            int row = seat.charAt(0) - 'A';
            int col = Integer.parseInt(seat.substring(1)) - 1;

            if(row < 0 || row >= rows || col < 0 || col >= cols)
            {
                System.out.println("Invalid requested seat: " + seat);
                return;
            }

            if(booked[row][col])
            {
                System.out.println("Booking Failed: Seat " + seat + " is already booked.");
                return;
            }
        }

        double totalCost = 0;

        for(String seat : requestedSeats)
        {
            seat = seat.trim().toUpperCase();

            int row = seat.charAt(0) - 'A';

            int rowPrice;

            if(row == 0)
            {
                rowPrice = 300;
            }
            else if(row == 1)
            {
                rowPrice = 250;
            }
            else if(row == 2)
            {
                rowPrice = 200;
            }
            else
            {
                rowPrice = 150;
            }

            totalCost = totalCost + rowPrice;
        }

        int groupSize = requestedSeats.length;

        double discount = 0;

        if(groupSize >= 6)
        {
            discount = (totalCost * 10) / 100;
            totalCost = totalCost - discount;
        }

        for(String seat : requestedSeats)
        {
            seat = seat.trim().toUpperCase();

            int row = seat.charAt(0) - 'A';
            int col = Integer.parseInt(seat.substring(1)) - 1;

            booked[row][col] = true;
        }

        int remainingSeats = 0;

        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < cols; j++)
            {
                if(!booked[i][j])
                {
                    remainingSeats++;
                }
            }
        }

        System.out.println("Booking Successful");
        System.out.println("Seats Booked: " + groupSize);
        System.out.println("Discount: Rs." + discount);
        System.out.println("Total Cost: Rs." + totalCost);
        System.out.println("Remaining Seats: " + remainingSeats);
    }
}