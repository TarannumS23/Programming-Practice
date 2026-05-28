//Write a program which accepts number from user and return difference between summation of all its factors and non factors.
//Input : 12
//Output : -34   (16 - 50)
//Input : 10
//Output : -29  (8 - 37)

#include<stdio.h>

int FactDiff(int iNo)
{
    int iCnt = 0;
    int SumFact = 0;
    int SumNonFact = 0;

    for(iCnt = 1; iCnt < iNo; iCnt++)
    {
        if((iNo % iCnt) == 0)
        {
            SumFact = SumFact + iCnt;
        }
        else
        {
            SumNonFact = SumNonFact + iCnt;
        }
    }
    return (SumFact - SumNonFact);
}
int main()
{
    int iValue = 0;
    int iRet = 0;

    printf("Enter number");
    scanf("%d",&iValue);

    iRet = FactDiff(iValue);
    printf("%d",iRet);

    return 0;
}