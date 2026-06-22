/*
    Accept character from user. If it is capital then display all the characters from the input characters
    til Z.If input character is small then print all the characters in reverse order till a.
    In other cases return directly.
*/

#include<stdio.h>

void Display(char ch)
{
    char i = 0;

    if(ch >= 'A' && ch <= 'Z')
    {
        for(i = ch; i <= 'Z'; i++)
        {
            printf("%c",i);
        }
    }
    else if(ch >= 'a' && ch <= 'z')
    {
        for(i = ch; i >= 'a'; i--)
        {
            printf("%c",i);
        }
    }
    else
    {
        printf("%c",ch);
    }

}

int main()
{
    char cValue = '\0';

    printf("Enter the character :");
    scanf("%c",&cValue);

    Display(cValue);

    return 0;
}