/*
    Accept N numbers from user and accept Range , display all elements from that range.
    Input : N : 6
            Start: 60
            End: 90
            Elements : 85 66 3 76 93 88
    Output : 85 66 76 88
    Input : N : 6
            Start: 30
            End: 50
            Elements : 85 66 3 76 93 88
    Output : 3
*/
#include<stdio.h>

void Range(int Arr[], int iLength, int iStart, int iEnd)
{
    int iCnt = 0;

    for(iCnt = 0; iCnt < iLength; iCnt++)
    {
        if((Arr[iCnt] >= iStart) && (Arr[iCnt] <= iEnd))
        {
            printf("%d\t",Arr[iCnt]);
        }
    }
}

int main()
{
    int iSize = 0, iRet = 0, iCnt = 0, iStart = 0, iEnd = 0;
    int *p = NULL;

    printf("Enter number of elements : \n");
    scanf("%d",&iSize);

    p = (int *)malloc(iSize * sizeof(int));

    if(p == NULL)
    {
        printf("Unable to allocate memory\n");
        return -1;
    }

    printf("Enter %d elements : \n",iSize);
    for(iCnt = 0; iCnt < iSize; iCnt++)
    {
        scanf("%d",&p[iCnt]);
    }

    printf("Enter the starting point of range : \n");
    scanf("%d",&iStart);

    printf("Enter the ending point of range : \n");
    scanf("%d",&iEnd);

    Range(p, iSize, iStart, iEnd);

    free(p);

    return 0;
}