/*
    Write a program which accept one number from user and range of positions from user. Toggle all bits
    from that range.
    Input : 897     9  13
    toggle all bits from position 9 to 13 of input number i.e 879.
*/
#include<stdio.h>

typedef unsigned int UINT;

UINT ToggleBitRange(UINT iNo,int iStart,int iEnd)
{
    UINT iMask = 0;
    int iCnt = 0;

    if((iStart < 1) || (iEnd > 32) || (iStart > iEnd))
    {
        return iNo;
    }

    for(iCnt = iStart; iCnt <= iEnd; iCnt++)
    {
        iMask = iMask | (1 << (iCnt - 1));
    }

    return (iNo ^ iMask);
}

int main()
{
    UINT iValue = 0;
    UINT iRet = 0;
    int iStart = 0, iEnd = 0;

    printf("Enter number : ");
    scanf("%u",&iValue);

    printf("Enter starting position : ");
    scanf("%d",&iStart);

    printf("Enter ending position : ");
    scanf("%d",&iEnd);

    iRet = ToggleBitRange(iValue,iStart,iEnd);

    printf("Modified number : %u\n",iRet);

    return 0;
}