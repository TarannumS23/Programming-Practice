import java.util.*;

class SparseChecker
{
    public boolean ChkSparse(int Arr[][], int iRow, int iCol)
    {
        int i = 0, j = 0;
        int iZeroCount = 0;
        int iTotal = iRow * iCol;

        for(i = 0; i < iRow; i++)
        {
            for(j = 0; j < iCol; j++)
            {
                if(Arr[i][j] == 0)
                {
                    iZeroCount++;
                }
            }
        }

        if(iZeroCount > iTotal / 2)
        {
            return true;
        }

        return false;
    }
}

class SparseMatrix
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

        SparseChecker mobj = new SparseChecker();

        boolean bRet = mobj.ChkSparse(Arr, iRow, iCol);

        System.out.println("Is Sparse Matrix : " + bRet);
    }
}