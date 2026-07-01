/*
    Write a program which accept one number from user and toggle
    7th and  10th bit of that number. Return modified number.
    Input : 137
    Output : 201
*/

#include<stdio.h>

typedef unsigned int UINT;

UINT OnBit(UINT iNo)
{
    UINT iMask = 0x0000000F;

    return (iNo | iMask);
}

int main()
{
    UINT iValue = 0;
    UINT iRet = 0;

    printf("Enter number : ");
    scanf("%u",&iValue);

    iRet = OnBit(iValue);

    printf("Modified number is : %u\n",iRet);

    return 0;
}