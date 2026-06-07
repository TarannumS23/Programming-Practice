/*
    Accept N number from user and return the largest number.
    Input:     N : 6
                Elements : 85 66 3 66 93 88
    Output:    Largest element is : 93           
*/

#include <stdio.h>
#include <stdlib.h>

#define TRUE 1
#define FALSE 0

typedef int BOOL;

int Maximum(int Arr[], int iSize)
{
    int iMax = Arr[0], iCnt = 0;

    for (iCnt = 1; iCnt < iSize; iCnt++)
    {
        if (Arr[iCnt] > iMax)
        {
            iMax = Arr[iCnt];
        }
    }

    return iMax;
}

int main()
{
    int iLength = 0, iCnt = 0, iRet = 0, iValue = 0;
    int *p = NULL;

    printf("Enter number of elements : \n");
    scanf("%d", &iLength);

    printf("Enter the number :\n");
    scanf("%d", &iValue);

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

    iRet = Maximum(p, iLength);

    printf("Largest number is : %d\n", iRet);

    free(p);

    return 0;
}