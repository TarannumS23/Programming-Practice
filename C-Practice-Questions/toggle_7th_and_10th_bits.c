/*
    Write a program which accept one number from user and toggle
    7th and  10th bit of that number. Return modified number.
    Input : 137
    Output : 201
*/
#include<stdio.h>

typedef unsigned int UINT;

UINT ToggleBit(UINT iNo)
{
    UINT iMask = (1 << 6) | (1 << 9);

    return (iNo ^ iMask);
}

int main()
{
    UINT iValue = 0;
    UINT iRet = 0;

    printf("Enter number : ");
    scanf("%u",&iValue);

    iRet = ToggleBit(iValue);

    printf("Modified number is : %u\n",iRet);

    return 0;
}