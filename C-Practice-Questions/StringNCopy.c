/*
    Write a program which accept string from user and copy the contents of that string into another string.
    (Implement strcpy() function).
    Input : "Marvellous Multi OS"
             10
    Output : "Marvellous"        
*/

#include<stdio.h>

void StrNCpyX(char *src, char *dest, int iCnt)
{
    while((*src != '\0') && (iCnt != 0))
    {
        *dest = *src;
        src++;
        dest++;
        iCnt--;
    }
    *dest = '\0';
}

int main()
{
    char arr[30] = "Marvellous Multi OS";
    char brr[30];     // Empty string

    StrNCpyX(arr,brr,10);

    printf("%s",brr);      // Marvellous 

    return 0;
}