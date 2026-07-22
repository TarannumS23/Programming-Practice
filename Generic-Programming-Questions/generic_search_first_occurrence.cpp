// Write generic program to accept N values and search first occurrence of any specific value.

#include<iostream>
using namespace std;

template<class T>
int SearchFirst(T *arr, int iSize, T iNo)
{
    for(int i = 0; i < iSize; i++)
    {
        if(arr[i] == iNo)
        {
            return (i + 1);
        }
    }

    return -1;
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

    int iRet = SearchFirst(arr,iSize,iValue);

    if(iRet == -1)
    {
        cout<<"Value not found"<<endl;
    }
    else
    {
        cout<<"First occurrence position is : "<<iRet<<endl;
    }

    delete [] arr;

    return 0;
}