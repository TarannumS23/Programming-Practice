/*
    Accept N numbers from user and accept one another number as NO , check whether NO is present or not.
    Input : N : 6
            NO: 66
            Elements : 85 66 3 66 93 88
    Output : TRUE
    Input : N : 6
            NO: 12
            Elements : 85 11 3 15 11 111
    Output : FALSE
*/
#include<stdio.h>

#define TRUE 1
#define FALSE 0

typedef int BOOL;

BOOL Check(int Arr[], int iLength, int iNo)
{
    int iCnt = 0;

    for(iCnt = 0; iCnt < iLength; iCnt++)
    {
        if(Arr[iCnt] == iNo)
        {
            return TRUE;
        }
    }

    return FALSE;
}
int main()
{
    int iSize = 0, iRet = 0, iCnt = 0, iValue = 0;
    int *p = NULL;
    BOOL bRet = FALSE;

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

    printf("Enter the number to search : \n");
    scanf("%d",&iValue);

    for(iCnt = 0; iCnt < iSize; iCnt++)
    {
        if(p[iCnt] == iValue)
        {
            bRet = TRUE;
            break;
        }
    }

    if(bRet == TRUE)
    {
        printf("TRUE\n");
    }
    else
    {
        printf("FALSE\n");
    }

    free(p);

    return 0;
}