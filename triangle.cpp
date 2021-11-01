#include<iostream.h>
using namespace std;
void main()
{
    int a,b,c;
    cout<<"enter 3 sides";cin>>a>>b>>c;
    if(a+b>c&&b+c>a&&c+a>b)
    {
        if((a*a+b*b)==c*c||(b*b+c*c)==a*a||(c*c+a*a)==b*b)
    {
        cout<<"right angled";
    }
    else if((a==b&&b!=c)||(b==c&&c!=a)||(c==a&&a!=b
    {
        cout<<"isosceles";
    }
    else if (a==b&&b==c)
    {
        cout<<"equileteral";
    }
    else 
    {
        cout<<"any valid triangle";
    }
    cout<<"cannot form a valid triangle";
    }
}