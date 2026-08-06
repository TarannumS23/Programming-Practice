/*
    Write application which accept file name from user and display size of file.

    Input : Demo.txt
    Output : File size is 79 bytes.
*/

#include<stdio.h>
#include<unistd.h>
#include<fcntl.h>

#define BUFFER_SIZE 1024
#define ERR_OPEN -1

int GetFileSize(char *FileName)
{
    char Buffer[BUFFER_SIZE];
    int fd = 0, iRet = 0, iSize = 0;

    fd = open(FileName, O_RDONLY);

    if(fd == -1)
    {
        return ERR_OPEN;
    }

    while((iRet = read(fd, Buffer, sizeof(Buffer))) != 0)
    {
        iSize = iSize + iRet;
    }

    close(fd);

    return iSize;
}

int main()
{
    char Fname[30];
    int iRet = 0;

    printf("Enter the file name : ");
    scanf("%s", Fname);

    iRet = GetFileSize(Fname);

    if(iRet == ERR_OPEN)
    {
        printf("Unable to open file\n");
    }
    else
    {
        printf("File size is %d bytes\n", iRet);
    }

    return 0;
}