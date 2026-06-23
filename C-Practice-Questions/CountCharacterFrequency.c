/*
    Write a program whhich accepts string from user and accept one 
    character. Return frequency of that character.

    Input : "Marvellous"
             e
    output : 1

    Input : "Marvellous"
             l
    output : 2
*/

#include<stdio.h>

int CountChar(char *str, char ch)
{
    int i = 0;
    while(*str != '\0')
    {
        if(*str == ch)
        {
            i++;
        }
        str++;
    }
    return i;
}

int main()
{
    char arr[20];
    char cValue ;
    int iRet = 0;

    printf("Enter String : \n");
    scanf("%[^'\n']s",arr);
 
    printf("Enter character : \n");
    scanf(" %c",&cValue);

    iRet = CountChar(arr,cValue);

    printf("Character frequency is : %d",iRet);

    return 0;
}