/*
    Write a recursive program which display below pattern.
    Output : a b c d e f 
*/

#include<stdio.h>

void Display()
{
    static char i = 'a';

    if(i <= 'f')
    {
        printf("%c\t",i);
        i++;
        Display();
    }
}

int main()
{
    Display();

    return 0;
}