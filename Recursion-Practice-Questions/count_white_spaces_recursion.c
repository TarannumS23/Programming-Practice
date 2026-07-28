/*
    Write a recursive program which accept string from user and count white spaces.
    Input : HE llo WOr lD
    Output : 3
*/

#include<stdio.h>

int WhiteSpace(char *str)
{
    static int iCount = 0;

    if(*str != '\0')
    {
        if(*str == ' ')
        {
            iCount++;
        }

        WhiteSpace(str + 1);
    }

    return iCount;
}

int main()
{
    char cValue[50];
    int iRet = 0;

    printf("Enter string : \n");
    scanf(" %[^\n]", cValue);

    iRet = WhiteSpace(cValue);

    printf("count of white spaces are : %d\n",iRet);
    
    return 0;
}