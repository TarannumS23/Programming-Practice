/*
    Accept number of rows and number of columns from user and display below pattern.
    Input : iRow = 4   iCol = 4
    output : A B C D
             a b c d
             A B C D
             a b c d
*/

#include<stdio.h>

void Pattern(int iRow , int iCol)
{
    int i = 0, j = 0;
    char ch1 = '\0', ch2 = '\0';

    for(i = 0; i <= iRow; i++)
    {
        for(j = 0, ch1 = 'A',ch2 = 'a'; j <= iCol; j++, ch1++,ch2++)
        {
            if(i % 2 == 0)
            {
                printf("%C ",ch1);
            }
            else
            {
                printf("%c ",ch2);
            }
        }
        printf("\n");
    }
}

int main()
{
    int iValue1 = 0, iValue2 = 0;

    printf("Enter number of rows and columns : ");
    scanf("%d%d",&iValue1,&iValue2);

    Pattern(iValue1,iValue2);

    return 0;
}