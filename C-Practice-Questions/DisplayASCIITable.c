/*
    Write a program which displays ASCII table. Table contains symbol,
    Decimal,hexadecimal and octal presentation of every member from 0 to 255.
*/

#include<stdio.h>

void DisplayASCII()
{
      int i = 0;

    printf("Symbol\tDecimal\tHexadecimal\tOctal\n");

    for(i = 0; i <= 255; i++)
    {
        printf("%c\t%d\t%X\t\t%o\n", i, i, i, i);
    }
}

int main()
{
    DisplayASCII();

    return 0;
}