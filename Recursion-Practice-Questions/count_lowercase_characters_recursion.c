/*
    Write a recursive program which accept string from user and count number of small characters.
    Input : HElloWOrlD
    Output : 5
*/

#include<stdio.h>

int Small(char *str)
{
    static int iCount = 0;

    if(*str != '\0')
    {
        if(*str >= 'a' && *str <= 'z')
        {
            iCount++;
        }

        Small(str + 1);
    }

    return iCount;
}

int main()
{
    char cValue[50];
    int iRet = 0;

    printf("Enter string : \n");
    scanf(" %[^\n]", cValue);

    iRet = Small(cValue);

    printf("count of small characters are : %d\n",iRet);
    
    return 0;
}