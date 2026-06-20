/*
    Write a program which accepts string from user and check whether it contains vowels in it or not.
    Input : "Marvellous"
    Output :  TRUE

    Input : Demo
    Output : TRUE

     Input : xyz
    Output : FALSE
*/

#include<stdio.h>

typedef int BOOL;

#define TRUE 1
#define FALSE 0

BOOL ChkVowel(char *str)
{

    while(*str != '\0')
    {
        if(*str == 'a' || *str == 'e' || *str == 'i' || *str == 'o' || *str == 'u' ||
        *str == 'A' || *str == 'E' || *str == 'I' || *str == 'O' || *str == 'U')
        {
            return TRUE;
        }
        str++;
    }
    return FALSE;
}
int main()
{
    char Arr[20];
    BOOL bRet = 0;

    printf("Enter String : \n");
    scanf("%[^'\n']s",Arr);

    bRet = ChkVowel(Arr);
    if(bRet == TRUE)
    {
        printf("Contains Vowels");
    }
    else
    {
        printf("There is no Vowels");
    }

    return 0;
}