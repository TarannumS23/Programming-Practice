// Write generic program to accept N values and count frequency of any specific value.

#include<iostream>
using namespace std;

template<class T>
int Frequency(T *arr, int iSize, T iNo)
{
    int iCount = 0;

    for(int i = 0; i < iSize; i++)
    {
        if(arr[i] == iNo)
        {
            iCount++;
        }
    }

    return iCount;
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

    cout<<"Enter value to search frequency : ";
    cin>>iValue;

    int iRet = Frequency(arr,iSize,iValue);

    cout<<"Frequency is : "<<iRet<<endl;

    delete [] arr;

    return 0;
}