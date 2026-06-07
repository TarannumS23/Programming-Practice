/*
    Accept N numbers from user and display summation of digits of each number
    Input:     N : 6
                Elements : 8225 665 3 76 953 858
    Output:     17 17 3 13 17 21
*/

#include <stdio.h>
#include <stdlib.h>

void DigitsSum(int Arr[], int iSize)
{
    int iCnt = 0, iDigit = 0, iTemp = 0, iSum = 0;

    printf("Summation of digits of each number is : \n");

    for (iCnt = 0; iCnt < iSize; iCnt++)
    {
        iTemp = Arr[iCnt];
        iSum = 0;

        while (iTemp != 0)
        {
            iDigit = iTemp % 10;
            iSum = iSum + iDigit;
            iTemp = iTemp / 10;
        }

        printf("%d\n", iSum);
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

    DigitsSum(p, iLength);

    free(p);

    return 0;
}