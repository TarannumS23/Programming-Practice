// Accept one character from user and convert case of that character 
// Input: a        output : A
// Input: D        output : d

#include<stdio.h>

void DisplayConvert( char CValue)
{
    if( 'A' <= CValue >= 'Z')
    {
        CValue = CValue + 32;
        printf("%C\t", CValue);
    }
    else if( 'a' <= CValue >= 'z')
    {
        CValue = CValue - 32;
        printf("%C\t", CValue);
    }
}
int main()
{
    int iValue = 0;

    printf("Enter number : ");
    scanf("%d", &iValue);

    return 0;
}