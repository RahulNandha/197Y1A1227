#include<iostream>
using namespace std;
int main()
{
    int a,i,n;
    cout<<"enter a number";
    cin>>n;
    for(i=2;i<n;i++)
    {
        if(n%i==0)
        {
            cout<<"number is not a prime";
            break;
        }
    }
    if(i==n)
    cout<<"number is prime";
}