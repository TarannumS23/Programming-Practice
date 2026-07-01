/*
    Write a program which accept one number and position from user and ON that bit.
    Return modified number.
    Input : 10     3
    Output : 14
*/

#include<stdio.h>

typedef unsigned int UINT;

UINT OnBit(UINT iNo,int iPos)
{
    UINT iMask = 1;

    if((iPos < 1) || (iPos > 32))
    {
        return iNo;
    }

    iMask = iMask << (iPos-1);

    return (iNo | iMask);
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

    iRet = OnBit(iValue,iPos);

    printf("Modified number : %u\n",iRet);

    return 0;
}