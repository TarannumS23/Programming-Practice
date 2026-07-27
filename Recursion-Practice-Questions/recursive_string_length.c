/*
    Write a recursive program which accept string from user
    and count number of characters.

    Input  : Hello
    Output : 5
*/

#include<stdio.h>

int Strlen(char *str)
{
    static int iCount = 0;

    if(*str != '\0')
    {
        iCount++;
        Strlen(str + 1);
    }

    return iCount;
}

int main()
{
    int iRet = 0;
    char arr[20];

    printf("Enter string : ");
    scanf("%s", arr);

    iRet = Strlen(arr);

    printf("Number of characters are : %d\n", iRet);

    return 0;
}