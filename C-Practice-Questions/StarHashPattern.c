// write a program which accepts number from user and display below pattern.
// input: 5
// output: * * * * * # # # # #
// input: 6
// output: * * * * * * # # # # # #
// input: -5
// output: * * * * * # # # # #

#include <stdio.h>

void Display(int iNo)
{
    int iCnt = 0;

    for(iCnt = 1; iCnt <= iNo; iCnt++)
    {
        printf("* ");
    }
    for(iCnt = 1; iCnt <= iNo; iCnt++)
    {
        printf("# ");
    }
}
int main()
{
    int iValue = 0;

    printf("Enter number : ");
    scanf("%d", &iValue);

    Display(iValue);

    return 0;
}