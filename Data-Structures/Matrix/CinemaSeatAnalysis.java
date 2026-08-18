/*
    A cinema hall uses a 2D array to represent seat availability.

    0 = Empty seat
    1 = Booked seat

    Requirements :
        1] Count total booked seats.
        2] Find the row with maximum bookings.
        3] Check whether any row is completely full.

    Input : Number of rows, Number of columns, Seat Matrix
    Validations :
        Rows and columns must be greater than 0.
        Seat value must be either 0 or 1.

    Expected Output :
        Total Booked Seats : <count>
        Row with Maximum Bookings : <row>
        Any Full Row : Yes/No
*/

import java.util.*;

class CinemaSeatAnalysis
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of rows : ");
        int rows = sobj.nextInt();

        System.out.println("Enter number of columns : ");
        int columns = sobj.nextInt();

        if(rows <= 0 || columns <= 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        int[][] seats = new int[rows][columns];

        System.out.println("Enter seat status (0 = Empty, 1 = Booked) : ");

        for(int i = 0; i < rows; i++)
        {
            System.out.println("Enter seats for Row " + (i + 1) + " : ");

            for(int j = 0; j < columns; j++)
            {
                seats[i][j] = sobj.nextInt();

                if(seats[i][j] != 0 && seats[i][j] != 1)
                {
                    System.out.println("Invalid Seat Value");
                    return;
                }
            }
        }

        CinemaSeat cobj = new CinemaSeat(seats);

        int totalBooked = cobj.calculateBookedSeats();
        int maxRow = cobj.findMaximumBookedRow();
        boolean fullRow = cobj.checkFullRow();

        System.out.println();
        System.out.println("----- Cinema Seat Analysis -----");

        System.out.println("Total Booked Seats : " + totalBooked);
        System.out.println("Row with Maximum Bookings : Row " + (maxRow + 1));

        if(fullRow)
        {
            System.out.println("Any Full Row : Yes");
        }
        else
        {
            System.out.println("Any Full Row : No");
        }
    }
}


class CinemaSeat
{
    private int[][] seats;

    public CinemaSeat(int[][] seats)
    {
        this.seats = seats;
    }

    public int calculateBookedSeats()
    {
        int totalBooked = 0;

        for(int i = 0; i < seats.length; i++)
        {
            for(int j = 0; j < seats[i].length; j++)
            {
                if(seats[i][j] == 1)
                {
                    totalBooked++;
                }
            }
        }

        return totalBooked;
    }

    public int findMaximumBookedRow()
    {
        int maxBookings = 0;
        int maxRow = 0;

        for(int i = 0; i < seats.length; i++)
        {
            int rowBookings = 0;

            for(int j = 0; j < seats[i].length; j++)
            {
                if(seats[i][j] == 1)
                {
                    rowBookings++;
                }
            }

            if(rowBookings > maxBookings)
            {
                maxBookings = rowBookings;
                maxRow = i;
            }
        }

        return maxRow;
    }

    public boolean checkFullRow()
    {
        boolean fullRow = false;

        for(int i = 0; i < seats.length; i++)
        {
            boolean currentRowFull = true;

            for(int j = 0; j < seats[i].length; j++)
            {
                if(seats[i][j] == 0)
                {
                    currentRowFull = false;
                    break;
                }
            }

            if(currentRowFull)
            {
                fullRow = true;
                break;
            }
        }

        return fullRow;
    }
}