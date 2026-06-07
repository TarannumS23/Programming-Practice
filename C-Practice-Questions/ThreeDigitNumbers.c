/*
    Accept N numbers from user and display all such numbers which contains 3 digits in it
    Input:     N : 6
                Elements : 8225 665 3 66 953 858
    Output:     665 953 858
*/

#include <stdio.h>
#include <stdlib.h>

void Digits(int Arr[], int iSize)
{
    int iCnt = 0, iDigit = 0, iTemp = 0;

    printf("Three digit numbers are : \n");

    for (iCnt = 0; iCnt < iSize; iCnt++)
    {
        iTemp = Arr[iCnt];
        iDigit = 0;

        while (iTemp != 0)
        {
            iTemp = iTemp / 10;
            iDigit++;
        }

        if (iDigit == 3)
        {
            printf("%d\n", Arr[iCnt]);
        }
    }
}

int main()
{
    int iLength = 0, iCnt = 0, iRet = 0;
    int *p = NULL;

    printf("Enter number of elements : \n");
    scanf("%d", &iLength);

    p = (int *)malloc(iLength * sizeof(int));

    if (p == NULL)
    {
        printf("Unable to allocate memory\n");
        return -1;
    }

    printf("Enter %d elements : \n", iLength);

    for (iCnt = 0; iCnt < iLength; iCnt++)
    {
        printf("Enter element %d : \n", iCnt + 1);
        scanf("%d", &p[iCnt]);
    }

    Digits(p, iLength);

    free(p);

    return 0;
}