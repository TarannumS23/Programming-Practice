/*
    Write a program which accept one number and position from user and OFF that  bit.
    return modified number
    Input : 10     2
    Output : 8
*/

#include<stdio.h>

typedef unsigned int UINT;

UINT OffBit(UINT iNo,int iPos)
{
    UINT iMask = 1;

    if((iPos < 1) || (iPos > 32))
    {
        return iNo;
    }

    iMask = ~(iMask << (iPos-1));

    return (iNo & iMask);
}

int main()
{
    UINT iValue = 0;
    UINT iRet = 0;
    int iPos = 0;

    printf("Enter number : ");
    scanf("%u",&iValue);

    printf("Enter position : ");
    scanf("%d",&iPos);

    iRet = OffBit(iValue,iPos);

    printf("Modified number : %u\n",iRet);

    return 0;
}