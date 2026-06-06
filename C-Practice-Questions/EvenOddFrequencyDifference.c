/*
    Accept N numbers from user and return difference between frequency of even numbers and odd numbers.
    Input : N : 7
            Elements : 85 66 3 80 93 88 90
    Output : 1 (4 - 3)
*/

#include <stdio.h>

int Frequency(int Arr[], int iLength)
{
    int iCnt = 0, iEvenCount = 0, iOddCount = 0;

    for(iCnt = 0; iCnt < iLength; iCnt++)
    {
        if(Arr[iCnt] % 2 == 0)
        {
            iEvenCount++;
        }
        else
        {
            iOddCount++;
        }
    }

    return iEvenCount - iOddCount;
}

int main()
{
    int iSize = 0, iRet = 0, iCnt = 0;
    int *p = NULL;

    printf("Enter number of elements : \n");
    scanf("%d", &iSize);

    p = (int *)malloc(iSize * sizeof(int));

    if(p == NULL)
    {
        printf("Unable to allocate memory\n");
        return -1;
    }

    printf("Enter %d elements : \n", iSize);

    for(iCnt = 0; iCnt < iSize; iCnt++)
    {
        printf("Enter element %d : \n", iCnt + 1);
        scanf("%d", &p[iCnt]);
    }

    iRet = Frequency(p, iSize);

    printf(" %d\n", iRet);

    free(p);

    return 0;
}