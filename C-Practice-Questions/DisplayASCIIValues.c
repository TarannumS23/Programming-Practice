/*
    Accept character from user and display its ASCII value in decimal,
    octal and hexadecimal format.

    Input : A
    Output : Decimal       65
             Octal         0101
             Hexadecimal   0X41
*/

#include<stdio.h>

void Display(char ch)
{
    if(ch >= 'A' && ch <= 'Z')
    {
        printf("Decimal\n%d\n",ch);
        printf("Hexadecimal\n%X\n",ch);
        printf("Octal\n%o\n",ch);
    }
    
}

int main()
{
    char cValue = '\0';

    printf("Enter character : \n");
    scanf("%c",&cValue);

    Display(cValue);

    return 0;
}