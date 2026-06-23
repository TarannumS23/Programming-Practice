/*
    Write a program which accept string from user and reverse that string in place
    Input : "abcd"
    Output : dcba
    Input : "abba"
    Output : abba
*/

#include<stdio.h>

void StrRevX(char *str)
{
    char *start = NULL;
    char *end = NULL;
    char temp = '\0';
    
    start = str;

    while(*str != '\0')
    {
        str++;
    }
    str--;
    end = str;

    while(start < end)
    {
        temp = *start;
        *start = *end;
        *end = temp;

        start++;
        end--;
    }
}

int main()
{
    char arr[20];

    printf("Enter String : \n");
    scanf("%[^'\n']s",arr);

    StrRevX(arr);

    printf("Modified string is : %s",arr);

    return 0;
}