// Write generic program to accept N values and search last occurrence of any specific value.

#include<iostream>
using namespace std;

template<class T>
int SearchLast(T *arr, int iSize, T iNo)
{
    int iPos = -1;

    for(int i = 0; i < iSize; i++)
    {
        if(arr[i] == iNo)
        {
            iPos = i + 1;
        }
    }

    return iPos;
}

int main()
{
    int iSize;

    cout<<"Enter number of elements : ";
    cin>>iSize;

    int *arr = new int[iSize];

    cout<<"Enter elements :\n";
    for(int i = 0; i < iSize; i++)
    {
        cin>>arr[i];
    }

    int iValue;

    cout<<"Enter value to search : ";
    cin>>iValue;

    int iRet = SearchLast(arr,iSize,iValue);

    if(iRet == -1)
    {
        cout<<"Value not found"<<endl;
    }
    else
    {
        cout<<"Last occurrence position is : "<<iRet<<endl;
    }

    delete [] arr;

    return 0;
}