/*
    Write application which accept file name and one string from user.
    Write that string at the end of file.

    Input : Demo.txt
            Hello World
    Output : Write Hello World at the end of Demo.txt
*/

#include<stdio.h>
#include<unistd.h>
#include<fcntl.h>
#include<string.h>

#define ERR_OPEN -1

int WriteFile(char *FileName, char *Data)
{
    int fd = 0;

    fd = open(FileName, O_WRONLY | O_APPEND);

    if(fd == -1)
    {
        return ERR_OPEN;
    }

    write(fd, Data, strlen(Data));

    close(fd);

    return 0;
}

int main()
{
    char Fname[30];
    char Arr[100];
    int iRet = 0;

    printf("Enter the file name : ");
    scanf("%s", Fname);

    getchar();

    printf("Enter the string : ");
    scanf("%[^\n]", Arr);

    iRet = WriteFile(Fname, Arr);

    if(iRet == ERR_OPEN)
    {
        printf("Unable to open file\n");
    }
    else
    {
        printf("String written successfully\n");
    }

    return 0;
}