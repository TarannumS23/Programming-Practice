/*
    Write a program which accepts file name from user and count number of small character from that file.

    Input : Demo.txt
    Output : Number of small characters are 58
*/

#include<stdio.h>
#include<unistd.h>
#include<fcntl.h>
#include<string.h>

# define BUFFER_SIZE 1024

#define ERR_OPEN -1

int CountCapital(char *FileName)
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
            if(Buffer[i] >= 'a' && Buffer[i]<= 'z')
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

    iRet = CountCapital(Fname);

    if(iRet == ERR_OPEN)
    {
        printf("Unable to open file\n");
    }
    else
    {
        printf("Number of capital characters are : %d\n",iRet);
    }
    
    return 0;
}


