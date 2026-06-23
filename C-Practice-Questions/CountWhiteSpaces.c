/*
    Write a program which accepts string from user and count number of white spaces.
    Input : "Marvellous"
    Output : 0
    Input : "Marvellous Infosystems"
    Output : 1
*/

#include<stdio.h>

int CountWhite(char *str)
{
    int i = 0;
    while(*str != '\0')
    {
        if(*str == ' ')
        {
            i++;
        }
        str++;
    }
    return i;
}
int main()
{
    char arr[20] = {'\0'};
    int iRet = 0;

    printf("Enter string : \n");
    scanf("%[^'\n']s",arr);

    iRet = CountWhite(arr);

    printf("white spaces are : %d",iRet);

    return 0;
}