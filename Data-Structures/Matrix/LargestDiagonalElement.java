import java.util.*;

class DiagonalMaximum
{
    public int MaxDiagonal(int Arr[][], int iRow, int iCol)
    {
        int i = 0;
        int iMax = Arr[0][0];

        for(i = 0; i < iRow && i < iCol; i++)
        {
            if(Arr[i][i] > iMax)
            {
                iMax = Arr[i][i];
            }

            if(Arr[i][iCol - 1 - i] > iMax)
            {
                iMax = Arr[i][iCol - 1 - i];
            }
        }

        return iMax;
    }
}

class LargestDiagonalElement
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

        DiagonalMaximum mobj = new DiagonalMaximum();

        int iRet = mobj.MaxDiagonal(Arr, iRow, iCol);

        System.out.println("Largest element from both diagonals : " + iRet);
    }
}
