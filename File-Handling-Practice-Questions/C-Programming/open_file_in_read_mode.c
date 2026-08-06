/*
    Write application which accept file name from user and open that file in read mode.
    Input : Demo.txt
    Output : File opened successfully.
*/

#include<stdio.h>
#include<unistd.h>
#include<fcntl.h>

#define ERR_OPEN -1

int OpenFile(char *FileName)
{
    int fd = 0;

    fd = open(FileName, O_RDONLY);

    if(fd == -1)
    {
        return ERR_OPEN;
    }

    close(fd);

    return 0;
}

int main()
{
    char Fname[30];
    int iRet = 0;

    printf("Enter the file name : ");
    scanf("%s", Fname);

    iRet = OpenFile(Fname);

    if(iRet == ERR_OPEN)
    {
        printf("Unable to open file\n");
    }
    else
    {
        printf("File opened successfully\n");
    }

    return 0;
}