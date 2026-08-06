/*
    Write application which accept file name from user and read all data
    from that file and display contents on screen.

    Input : Demo.txt
    Output : Display all the data of file.
*/

#include<stdio.h>
#include<unistd.h>
#include<fcntl.h>

#define BUFFER_SIZE 1024
#define ERR_OPEN -1

int DisplayFile(char *FileName)
{
    char Buffer[BUFFER_SIZE];
    int fd = 0, iRet = 0;

    fd = open(FileName, O_RDONLY);

    if(fd == -1)
    {
        return ERR_OPEN;
    }

    while((iRet = read(fd, Buffer, sizeof(Buffer))) != 0)
    {
        write(1, Buffer, iRet);
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

    iRet = DisplayFile(Fname);

    if(iRet == ERR_OPEN)
    {
        printf("Unable to open file\n");
    }

    return 0;
}