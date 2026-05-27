//write a program which accept one number from user and point that number of even numbers on screen
// Input : 7
// Output : 2  4 6 8 10 12 14

#include<stdio.h>

void PrintEven(int iNo)
{
    int iCnt = 0;

    if(iNo <= 0)
    {
            return;
    }
    for(iCnt = 2; iCnt <= (iNo * 2); iCnt += 2)
    {
        printf("%d\t", iCnt);
    } 
}
int main()
{
    int iValue = 0;

    printf("Enter number : ");
    scanf("%d", &iValue);

    PrintEven(iValue);
    
    return 0;
}