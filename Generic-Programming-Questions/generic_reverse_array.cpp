// Write generic program to accept N values and reverse the contents.

#include<iostream>
using namespace std;

template<class T>
void Reverse(T *arr, int iSize)
{
    int iStart = 0;
    int iEnd = iSize - 1;

    while(iStart < iEnd)
    {
        T temp = arr[iStart];
        arr[iStart] = arr[iEnd];
        arr[iEnd] = temp;

        iStart++;
        iEnd--;
    }
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

    cout<<"\nArray before reverse:\n";

    for(int i = 0; i < iSize; i++)
    {
        cout<<arr[i]<<"\t";
    }

    Reverse(arr,iSize);

    cout<<"\n\nArray after reverse:\n";

    for(int i = 0; i < iSize; i++)
    {
        cout<<arr[i]<<"\t";
    }

    cout<<endl;

    delete [] arr;

    return 0;
}