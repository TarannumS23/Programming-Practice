/*
    Write a program whhich accepts string from user and accept one 
    character. Return index of last occurrence of that character.

    Input : "Marvellous"
             l
    output : 7

    Input : "Marvellous Multi OS"
             M
    output : 11

     Input : "Marvellous"
             W
    output : -1
*/

#include<stdio.h>

int LastChar(char *str, char ch)
{
    int i = 0;
    int j = 0;
    j = -1;

    while(*str != '\0')
    {
        if(*str == ch)
        {
            j = i;
        }
        i++;
        str++;
    }
    return j;
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

    iRet = LastChar(arr,cValue);

    printf("Character location is : %d",iRet);

    return 0;
}