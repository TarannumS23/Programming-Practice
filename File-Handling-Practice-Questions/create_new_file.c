/*
    Write application which accept file name from user and create that file.

    Input  : Demo.txt
    Output : File created successfully.
*/

#include<stdio.h>
#include<unistd.h>
#include<fcntl.h>

#define ERR_CREATE -1

int CreateFile(char *FileName)
{
    int fd = 0;

    fd = creat(FileName, 0777);

    if(fd == -1)
    {
        return ERR_CREATE;
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

    iRet = CreateFile(Fname);

    if(iRet == ERR_CREATE)
    {
        printf("Unable to create file\n");
    }
    else
    {
        printf("File created successfully\n");
    }

    return 0;
}