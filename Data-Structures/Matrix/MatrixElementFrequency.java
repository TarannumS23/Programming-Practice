import java.util.*;

class MatrixFrequency
{
    public int Frequency(int Arr[][], int iRow, int iCol, int iNo)
    {
        int i = 0, j = 0;
        int iCount = 0;

        for(i = 0; i < iRow; i++)
        {
            for(j = 0; j < iCol; j++)
            {
                if(Arr[i][j] == iNo)
                {
                    iCount++;
                }
            }
        }

        return iCount;
    }
}

class MatrixElementFrequency
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

        System.out.print("Enter number to search : ");
        int iNo = sobj.nextInt();

        MatrixFrequency mobj = new MatrixFrequency();

        int iRet = mobj.Frequency(Arr, iRow, iCol, iNo);

        System.out.println("Frequency of " + iNo + " : " + iRet);
    }
}
