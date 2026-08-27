import java.util.*;

class ColumnAddition
{
    public void AddColumn(int Arr[][], int iRow, int iCol)
    {
        int i = 0, j = 0;
        int iSum = 0;

        for(j = 0; j < iCol; j++)
        {
            iSum = 0;

            for(i = 0; i < iRow; i++)
            {
                iSum = iSum + Arr[i][j];
            }

            System.out.print(iSum + " ");
        }
    }
}

class MatrixColumnSum
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

        ColumnAddition mobj = new ColumnAddition();

        System.out.print("Addition of elements from each column : ");
        mobj.AddColumn(Arr, iRow, iCol);

        System.out.println();
    }
}