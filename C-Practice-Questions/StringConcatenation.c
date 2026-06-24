/*
    Write a program which accept 2 strings from user and concat second string
    after first string .(Implement strcat() function).
    Input : "Marvellous Infosystems"
            "Logic Building"
    Output : "Marvellous Infosystems Logic Building"        
*/

#include<stdio.h>

void StrCatX(char *src, char *dest)
{
    while((*src != '\0'))
    {
        src++;
    }
    while(*dest != '\0')
    {
        *dest = *src;
        dest++;
        src--;
    }
    *dest = '\0';
}

int main()
{
    char arr[30] = "Marvellous multi OS";
    char brr[30] = "Logic Building";

    StrCatX(arr,brr);

    printf("%s",brr);      // Marvellous Infosystems Logic Building

    return 0;
}