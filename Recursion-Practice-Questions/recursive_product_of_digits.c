/*
    Write a recursive program which accept number from user and return it's product of digits.

    Input  : 523
    Output : 30
*/

#include<stdio.h>

int Mult(int iNo)
{
    int iDigit = 0;
    static int iMult = 1;

    if(iNo != 0)
    {
        iDigit = iNo % 10;
        iMult = iMult * iDigit;
        Mult(iNo / 10);
    }

    return iMult;
}

int main()
{
    int iValue = 0, iRet = 0;

    printf("Enter number : \n");
    scanf("%d",&iValue);

    iRet = Mult(iValue);

    printf("Product of digits is : %d\n",iRet);
    
    return 0;
}