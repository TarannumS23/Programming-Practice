/*
    Write a program whhich accepts string from user and accept one 
    character. Return index of first occurrence of that character.

    Input : "Marvellous"
             M
    output : 0

    Input : "Marvellous"
             W
    output : -1

     Input : "Marvellous"
             e
    output : 4
*/

#include<stdio.h>

int FirstChar(char *str, char ch)
{
    int i = 0;
    while(*str != '\0')
    {
        if(*str == ch)
        {
            return i;
        }
        i++;
        str++;
    }
    return -1;
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

    iRet = FirstChar(arr,cValue);

    printf("Character location is : %d",iRet);

    return 0;
}