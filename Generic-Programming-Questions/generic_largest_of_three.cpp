// Write generic program to find largest number from three numbers.

#include<iostream>
using namespace std;

template<class T>                
T Max(T No1, T No2, T No3)
{
    if(No1 > No2 && No1 > No3)
    {
        return No1;
    }
    else if(No2 > No1 && No2 > No3)
    {
        return No2;
    }
    else
    {
        return No3;
    }
}

int main()                                              
{
    cout<<Max(21.5f,11.2f,18.9f)<<"\n";
    cout<<Max(21.5,11.2,56.3)<<"\n";
    cout<<Max(21,51,7)<<"\n";

    return 0;
}