/*
    Write a program which accept two numbers from user and display position of common ON bits
    from that two numbers.
    Input : 10  15   (1010   1111)
    Output : 2  4
*/
#include<stdio.h>

typedef unsigned int UINT;

void CommonBits(UINT iNo1, UINT iNo2)
{
    UINT iResult = iNo1 & iNo2;
    int iPos = 1;

    while(iResult != 0)
    {
        if((iResult & 1) == 1)
        {
            printf("%d ",iPos);
        }

        iResult = iResult >> 1;
        iPos++;
    }
}

int main()
{
    UINT iValue1 = 0, iValue2 = 0;

    printf("Enter first number : ");
    scanf("%u",&iValue1);

    printf("Enter second number : ");
    scanf("%u",&iValue2);

    printf("Common ON bit positions : ");
    CommonBits(iValue1,iValue2);

    return 0;
}