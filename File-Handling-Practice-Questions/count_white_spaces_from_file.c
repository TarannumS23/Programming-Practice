/*
    Write a program which accepts file name from user and count number of white spaces from that file.

    Input : Demo.txt
    Output : Number of white spaces are 11
*/

#include<stdio.h>
#include<unistd.h>
#include<fcntl.h>
#include<string.h>

# define BUFFER_SIZE 1024

#define ERR_OPEN -1

int CountWhite(char *FileName)
{
    char Buffer[BUFFER_SIZE] = {'\0'};
    int fd = 0, iRet = 0, iCount = 0, i = 0;

    fd = open(FileName,O_RDONLY);
    if(fd == -1)
    {
        return ERR_OPEN;
    }

    while((iRet = read(fd,Buffer,sizeof(Buffer))) != 0)
    {
        for(i = 0; i < iRet; i++)
        {
            if(Buffer[i] == ' ' )
            {
                iCount++;
            }
        }

        memset(Buffer,'\0',sizeof(Buffer));
    }

    close(fd);

    return iCount;
}

int main()
{   
    char Fname[30] = {'\0'};
    int iRet = 0;

    printf("Enter the file name : \n");
    scanf("%[^'\n']s",Fname);

    iRet = CountWhite(Fname);

    if(iRet == ERR_OPEN)
    {
        printf("Unable to open file\n");
    }
    else
    {
        printf("Number of white spaces are : %d\n",iRet);
    }
    
    return 0;
}


