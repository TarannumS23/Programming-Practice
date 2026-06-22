/*
    Write a program which accepts string from user and toggle case.
    Input : "Marvellous Multi OS"
    Output : MARVELLOUS MULTI OS
*/

#include<stdio.h>

void strtogglex(char *str)
{
    while(*str != '\0')
    {
        if(*str >= 'A' && *str <= 'Z')
        {
            *str = *str + 32;
        }
        else if(*str >= 'a' && *str <= 'z')
        {
            *str = *str - 32;
        }
        str++;
    }
}
int main()
{
    char arr[20] = {'\0'};

    printf("Enter string : \n");
    scanf("%[^'\n']s",arr);

    strtogglex(arr);

    printf("Modified string is : %s",arr);

    return 0;
}