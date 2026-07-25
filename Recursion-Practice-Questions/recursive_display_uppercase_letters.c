/*
    Write a recursive program which display below pattern.
    Output : A B C D E F 
*/

#include<stdio.h>

void Display()
{
    static char i = 'A';

    if(i <= 'F')
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