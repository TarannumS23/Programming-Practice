/*
    Write a program which accepts file name and number from user
    and display first N characters from that file.

    Input  : Demo.txt
             12

    Output : Hello World!
*/

#include<stdio.h>
#include<unistd.h>
#include<fcntl.h>

#define BUFFER_SIZE 1024
#define ERR_OPEN -1

void DisplayN(char *FileName, int iSize)
{
    char Buffer[BUFFER_SIZE];
    int fd = 0, iRet = 0, i = 0;

    fd = open(FileName, O_RDONLY);

    if(fd == -1)
    {
        printf("Unable to open file\n");
        return;
    }

    while((iRet = read(fd, Buffer, sizeof(Buffer))) != 0)
    {
        for(i = 0; (i < iRet) && (iSize > 0); i++, iSize--)
        {
            printf("%c", Buffer[i]);
        }

        if(iSize == 0)
        {
            break;
        }
    }

    close(fd);
}

int main()
{
    char Fname[30] = {'\0'};
    int iValue = 0;

    printf("Enter the file name : ");
    scanf("%s", Fname);

    printf("Enter the number of characters : ");
    scanf("%d", &iValue);

    DisplayN(Fname, iValue);

    return 0;
}