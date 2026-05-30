// Write a program which accepts distance in kilometers and converts it into meters.(1 km = 1000 m)
// Input: 5
// Output : 5000
// Input: 12
// Output : 12000

#include <stdio.h>

int KMToMeter(int iKilometer)
{
    int iMeter = 0;

    iMeter = iKilometer * 1000;

    return iMeter;
}

int main()
{
    int iValue = 0, iRet = 0;

    printf("Enter distance : ");
    scanf("%d", &iValue);

    iRet = KMToMeter(iValue);

    printf("Distance in meters is : %d", iRet);

    return 0;
}