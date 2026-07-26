/*
    Write a recursive program which display below pattern.
    Input : 6
    Output : a b c d e f
*/

#include<stdio.h>

void Display(int iNo)
{
    static char i = 'a';

    if(i <= ('a' + iNo - 1))
    {
        printf("%c\t", i);
        i++;
        Display(iNo);
    }
}

int main()
{
    int iValue = 0;

    printf("Enter Number : ");
    scanf("%d",&iValue);

    Display(iValue);

    return 0;
}
