/*
    Write a program whhich accepts string from user and accept one 
    character. Check whether that character is present in string or not.

    Input : "Marvellous"
             e
    output : TRUE

    Input : "Marvellous"
             W
    output : FALSE
*/

#include<stdio.h>

#define TRUE 1
#define FALSE 0

typedef int BOOL;

BOOL ChkChar(char *str, char ch)
{
    while(*str != '\0')
    {
        if(*str == ch)
        {
            return TRUE;
        }
        str++;
    }
    return FALSE;
}

int main()
{
    char arr[20];
    char cValue ;
    BOOL bRet = FALSE;

    printf("Enter String : \n");
    scanf("%[^'\n']s",arr);
 
    printf("Enter character : \n");
    scanf(" %c",&cValue);

    bRet = ChkChar(arr,cValue);

    if(bRet == TRUE)
    {
        printf("Character Found");
    }
    else
    {
        printf("Character Not Found");
    }

}