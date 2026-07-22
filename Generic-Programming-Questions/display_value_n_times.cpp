// Write generic program which accept one value and one number from user.Print that value that number of times on screen.

#include<iostream>
using namespace std;

template<class T>
void Display(T value, int iSize)
{
    for(int i = 0; i < iSize; i++)
    {
        cout << value << "\t";
    }

    cout << endl;
}

int main()
{
    char ch;
    int iNo;

    cout<<"Enter character : ";
    cin>>ch;

    cout<<"Enter number of times : ";
    cin>>iNo;

    Display(ch,iNo);

    cout<<"\n";

    int iValue;

    cout<<"Enter integer value : ";
    cin>>iValue;

    cout<<"Enter number of times : ";
    cin>>iNo;

    Display(iValue,iNo);

    cout<<"\n";

    float fValue;

    cout<<"Enter float value : ";
    cin>>fValue;

    cout<<"Enter number of times : ";
    cin>>iNo;

    Display(fValue,iNo);

    return 0;
}