/*
    Accept N numbers from user and accept one another number as NO, return frequency of NO from it.
    Input : N : 6
          NO : 66
            Elements : 85 66 3 66 93 88
    Output : 2
    Input : N : 6
            NO : 12
            Elements : 85 66 3 80 93 88
    Output : 0
*/

#include<stdio.h>

int Frequency(int *arr, int iLength, int iNo)
{
    int iCnt = 0, iFreq = 0;

    for(iCnt = 0; iCnt < iLength; iCnt++)
    {
        if(arr[iCnt] == iNo)
        {
            iFreq++;
        }
    }

    return iFreq;
}

int main()
{
    int iSize = 0, iCnt = 0, iRet = 0, iValue = 0;
    int *p = NULL;

    printf("Enter number of elements : \n");
    scanf("%d", &iSize);

    printf("Enter the number : \n");
    scanf("%d", &iValue);

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

    iRet = Frequency(p, iSize, iValue);

    printf("%d", iRet);

    free(p);

    return 0;
}