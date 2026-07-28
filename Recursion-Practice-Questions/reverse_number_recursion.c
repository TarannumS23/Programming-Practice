/*
    Write a recursive program which accept number from user and return its reverse number.

    Input :  523
    Output : 325
*/

#include<stdio.h>

int Reverse(int iNo)
{
    int iDigit = 0;
    static int iRev = 0;

    if(iNo != 0)
    {
        iDigit = iNo % 10;
        iRev = (iRev * 10) + iDigit;

        Reverse(iNo / 10);
    }

    return iRev;
}

int main()
{
    int iValue = 0;
    int iRet = 0;

    printf("Enter number : ");
    scanf("%d",&iValue);

    iRet = Reverse(iValue);

    printf("Reversed number is : %d\n",iRet);

    return 0;
}