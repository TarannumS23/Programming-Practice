/*
    Write a program which checks whether first and last bit is ON or OFF.
    First bit means bit number 1 and last bit means bit number 32.
*/

#include<stdio.h>

typedef int BOOL;
typedef unsigned int UINT;

#define TRUE 1
#define FALSE 0

BOOL ChkBit(UINT iNo)
{
    UINT iMask = 0x80000001;

    if((iNo & iMask) == iMask)
    {
        return TRUE;
    }
    return FALSE;
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
        printf("First and last bit is ON\n");
    }
    else
    {
        printf("First and last bit is OFF\n");
    }

    return 0;
}