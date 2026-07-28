/*
    Write a recursive program which accept number from user and return smallest digit.
    Input : 87983
    Output : 3
*/

#include<stdio.h>

int Min(int iNo)
{
    static int iMin = 9;
    int iDigit = 0;

    if(iNo != 0)
    {
        iDigit = iNo % 10;
        
        if(iMin > iDigit)
        {
            iMin = iDigit;
        }
        Min(iNo / 10);
    }

    return iMin;
}

int main()
{
    int iValue = 0, iRet = 0;

    printf("Enter number : \n");
    scanf("%d",&iValue);

    iRet = Min(iValue);

    printf("Smallest number is : %d\n",iRet);
    
    return 0;
}