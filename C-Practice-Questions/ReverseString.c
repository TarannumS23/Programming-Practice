/*
    Write a program which accepts string from user and displays it in reverse order.
    Input : "Marvellous"
    Output : "suollevraM"
*/

#include<stdio.h>

void Reverse(char *str)
{
    char *start = str;

    while(*str != '\0')
    {
        str++;
    }
    str--;

    while(str >= start)
    {
        printf("%c",*str);
        str--;
    }
}
int main()
{
    char Arr[20];

    printf("Enter String : \n");
    scanf("%[^'\n']s",Arr);

    printf("Reversed string is : %c\n");

    Reverse(Arr);

    return 0;
}