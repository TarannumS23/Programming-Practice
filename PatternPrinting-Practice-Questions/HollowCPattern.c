/*
Accept number of rows and columns from user and display below pattern.
Input : iRow = 5      iCol = 5

output : * * * * * 
         *     * *
         *   *   *
         * *     *
         * * * * * 
*/
#include<stdio.h>

void Pattern(int iRow, int iCol)
{
    int i = 0, j = 0;
    int iNo = 0;

    if(iRow != iCol)                  
        {
            printf("Invalid Parameters");
            printf("Number of rows and columns should be same for printing diagonal");
            return;
        }

    for(i = 1, iNo = iCol; i <= iRow; i++)
    {
        for(j = 1; j <= iCol; j++)
        {
           if(j == iNo || i == 1 || j == 1 || i == iRow || j == iCol)
           {
               printf("*\t");
           }
           else 
           {
               printf(" \t");
           }
        }
        iNo--;
        printf("\n");
    }
}

int main()
{
    int iValue1 = 0, iValue2 = 0;

    printf("Enter number of rows and columns : ");
    scanf("%d %d",&iValue1,&iValue2);

    Pattern(iValue1,iValue2);

    return 0;
}