import java.util.*;

class RowSwapper
{
    public void SwapRows(int Arr[][], int iRow, int iCol)
    {
        int i = 0, j = 0;
        int iTemp = 0;

        for(i = 0; i < iRow - 1; i = i + 2)
        {
            for(j = 0; j < iCol; j++)
            {
                iTemp = Arr[i][j];
                Arr[i][j] = Arr[i + 1][j];
                Arr[i + 1][j] = iTemp;
            }
        }
    }
}

class SwapConsecutiveRows
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

        RowSwapper mobj = new RowSwapper();

        mobj.SwapRows(Arr, iRow, iCol);

        System.out.println("Matrix after swapping consecutive rows : ");

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