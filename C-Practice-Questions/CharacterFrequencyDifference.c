/*
    Write a program which accepts string from user and return difference
    between frequency of small character and frequency of capital character
    Input : "MarvellouS"
    Output : 6
*/

#include<stdio.h>

int Difference(char *str)
{
    int iCnt = 0;
    int iDiff = 0, iSmall = 0;

    while(*str != '\0')
    {
        if(*str >= 'A' && *str <= 'Z')
        {
            iCnt++;
        }
        else if(*str >= 'a' && *str <= 'z') 
        {
            iSmall++;
        }
        str++;
    }
    if(iSmall > iCnt)
        {
            iDiff = iSmall - iCnt;
        }
        else
        {
            iDiff = iCnt - iSmall;
        }
    return iDiff;
}
int main()
{
    char Arr[20];
    int iRet = 0;

    printf("Enter String : \n");
    scanf("%[^'\n']s",Arr);

    iRet = Difference(Arr);

    printf("Difference between small and capital characters : %d\n",iRet);

    return 0;
}