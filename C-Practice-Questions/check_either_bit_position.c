/*
    Write a program which accept one number , two positions from user and check whether bit 
    at first or bit at second position id ON or OFF.
    Input : 10  3  7
    Output : TRUE
*/
#include<stdio.h>

typedef int BOOL;
typedef unsigned int UINT;

#define TRUE 1
#define FALSE 0

BOOL ChkBit(UINT iNo,int iPos1,int iPos2)
{
    UINT iMask1 = 1;
    UINT iMask2 = 1;

    if((iPos1 < 1) || (iPos1 > 32) || (iPos2 < 1) || (iPos2 > 32))
    {
        return FALSE;
    }

    iMask1 = iMask1 << (iPos1 - 1);
    iMask2 = iMask2 << (iPos2 - 1);

    if((iNo & iMask1) || (iNo & iMask2))
    {
        return TRUE;
    }

    return FALSE;
}

int main()
{
    UINT iValue = 0;
    int iPos1 = 0, iPos2 = 0;
    BOOL bRet = FALSE;

    printf("Enter number : ");
    scanf("%u",&iValue);

    printf("Enter first position : ");
    scanf("%d",&iPos1);

    printf("Enter second position : ");
    scanf("%d",&iPos2);

    bRet = ChkBit(iValue,iPos1,iPos2);

    if(bRet == TRUE)
    {
        printf("TRUE\n");
    }
    else
    {
        printf("FALSE\n");
    }

    return 0;
}