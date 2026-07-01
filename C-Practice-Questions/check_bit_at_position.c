/*
    Write a program which accept one number and position from user and check whether bit at that
    position is ON or OFF. If bit is one return TRUE otherwise return FALSE.
    Input : 10     2
    Output : TRUE
*/

#include<stdio.h>

typedef int BOOL;
typedef unsigned int UINT;

#define TRUE 1
#define FALSE 0

BOOL ChkBit(UINT iNo, int iPos)
{
    UINT iMask = 1;

    if((iPos < 1) || (iPos > 32))
    {
        return FALSE;
    }

    iMask = iMask << (iPos - 1);

    if((iNo & iMask) == iMask)
    {
        return TRUE;
    }
    else
    {
        return FALSE;
    }
}

int main()
{
    UINT iValue = 0;
    int iPos = 0;
    BOOL bRet = FALSE;

    printf("Enter number : ");
    scanf("%u",&iValue);

    printf("Enter position : ");
    scanf("%d",&iPos);

    bRet = ChkBit(iValue,iPos);

    if(bRet == TRUE)
    {
        printf("Bit is ON\n");
    }
    else
    {
        printf("Bit is OFF\n");
    }

    return 0;
}