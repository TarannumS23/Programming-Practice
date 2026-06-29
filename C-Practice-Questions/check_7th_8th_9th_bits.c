/*
    Write a program which checks whether 7th & 8th & 9th bit is ON or OFF.
*/

#include<stdio.h>

typedef int BOOL;
typedef unsigned int UINT;

#define TRUE 1
#define FALSE 0

BOOL ChkBit(UINT iNo)
{
    UINT iMask = (1 << 6) | (1 << 7) | (1 << 8);

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
    BOOL bRet = FALSE;

    printf("Enter number : ");
    scanf("%u",&iValue);

    bRet = ChkBit(iValue);

    if(bRet == TRUE)
    {
        printf("7th & 8th & 9th bit is ON\n");
    }
    else
    {
        printf("7th & 8th & 9th bit is OFF\n");
    }

    return 0;
}