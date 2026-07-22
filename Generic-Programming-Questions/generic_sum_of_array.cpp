// Write a generic program to accept N values from user and return addition of that values.

#include<iostream>
using namespace std;

template<class T>
T AddN(T *arr, int iSize)
{
    T iSum = 0;

    for(int i = 0; i < iSize; i++)
    {
        iSum = iSum + arr[i];
    }

    return iSum;
}

int main()
{
    int arr[] = {10,20,30,40,50};
    float brr[] = {10.0f,3.7f,9.8f,8.7f};

    int iRet = AddN(arr,5);
    cout<<"Addition of integers : "<<iRet<<"\n";

    float fRet = AddN(brr,4);
    cout<<"Addition of floats : "<<fRet<<"\n";

    return 0;
}