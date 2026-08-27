import java.util.*;

class ColumnReverser
{
    public void ReverseCol(int Arr[][], int iRow, int iCol)
    {
        int i = 0, j = 0;
        int iTemp = 0;

        for(j = 0; j < iCol; j++)
        {
            for(i = 0; i < iRow / 2; i++)
            {
                iTemp = Arr[i][j];
                Arr[i][j] = Arr[iRow - 1 - i][j];
                Arr[iRow - 1 - i][j] = iTemp;
            }
        }
    }
}

class ReverseMatrixColumns
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter number of rows : ");
        int iRow = sobj.nextInt();

        System.out.print("Enter number of columns : ");
        int iCol = sobj.nextInt();

        int Arr[][] = new int[iRow][iCol];

        System.out.println("Enter matrix elements : ");

        for(int i = 0; i < iRow; i++)
        {
            for(int j = 0; j < iCol; j++)
            {
                Arr[i][j] = sobj.nextInt();
            }
        }

        ColumnReverser mobj = new ColumnReverser();

        mobj.ReverseCol(Arr, iRow, iCol);

        System.out.println("Matrix after reversing each column : ");

        for(int i = 0; i < iRow; i++)
        {
            for(int j = 0; j < iCol; j++)
            {
                System.out.print(Arr[i][j] + " ");
            }

            System.out.println();
        }
    }
}