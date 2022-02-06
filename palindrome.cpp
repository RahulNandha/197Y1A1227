#include<iostream>
using namespace std;
int main()
{
    int a,b,rn=0,n;
    cout<<"enter a number";
    cin>>n;
    b=n;
    while(n!=0)
    {
        a=n%10;
        n=rn%10+a;
        n=n/10;
    }
    if(b==rn)
    {
        cout<<"palindrome";
    }
    else
    {
     cout<<"not palindrome";
    }
}