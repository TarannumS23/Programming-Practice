// Write a program which accepts number from user and its multiplication of factors
// Input : 12
// Output : 144  (1*2*3*4*6)
// Input : 13
// Output : 1 (1)
// Input : 10
// Output : 120 (1*2*5)

#include<stdio.h>

int MultFact(int iNo)
{
    int iMult = 1;
    int iCnt = 0;

    for(iCnt = 1; iCnt <= (iNo/2); iCnt++)
    {
        if((iNo % iCnt) == 0)
        {
            iMult = iMult * iCnt;
        }
    }
    return iMult;
}
int main()
{
    int ivalue = 0;
    int iRet = 0;

    printf("Enter number");
    scanf("%d", &ivalue);

    iRet = MultFact(ivalue);

    printf("%d", iRet);
    return 0;
}