import java.util.*;

class MatrixTransposer
{
    public void Transpose(int Arr[][], int iRow, int iCol)
    {
        int i = 0, j = 0;

        for(i = 0; i < iCol; i++)
        {
            for(j = 0; j < iRow; j++)
            {
                System.out.print(Arr[j][i] + " ");
            }

            System.out.println();
        }
    }
}

class MatrixTranspose
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

        MatrixTransposer mobj = new MatrixTransposer();

        System.out.println("Transpose of matrix : ");

        mobj.Transpose(Arr, iRow, iCol);
    }
}