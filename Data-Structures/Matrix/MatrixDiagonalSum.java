import java.util.*;

class MatrixDiagonal
{
    public int AddDiagonal(int Arr[][], int iRow, int iCol)
    {
        int i = 0;
        int iSum = 0;

        for(i = 0; i < iRow && i < iCol; i++)
        {
            iSum = iSum + Arr[i][i];
        }

        return iSum;
    }
}

class MatrixDiagonalSum
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

        MatrixDiagonal mobj = new MatrixDiagonal();

        int iRet = mobj.AddDiagonal(Arr, iRow, iCol);

        System.out.println("Addition of diagonal elements : " + iRet);
    }
}
