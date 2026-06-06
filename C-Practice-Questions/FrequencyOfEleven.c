/*
    Accept N numbers from user and return frequency of 11 from it.
    Input : N : 6
            Elements : 85 66 3 80 93 88
    Output : 0
    Input : N : 6
            Elements : 85 66 11 80 93 11
    Output : 2
*/

#include<stdio.h>

int main()
{
    int iSize = 0, iCnt = 0, iRet = 0;
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

    printf("%d", iRet);

    free(p);

    return 0;
}