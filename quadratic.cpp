#include<iostream.h>
#include<math.h>
void main()
{
int a,b,c;
float r1,r2,x,y;
cout<<"enter the co-efficients";
cin>>a>>b>>c;
d=(b*b)-(4*a*c);
if(d>0)
{
    r1=(-b+pow(d,0.5))/2*a;
    r2=(-b-pow(d,0.5))/2*a;
    cout<<"roots are real and the roots are"<<r1<<"and"<<r2;
}
else if(d==0)
{
    r1=-b/2*a;
    cout<<"roots are equal and the root is"<<r1;
}
else 
{
    x=-b/2*a;
    y=pow(-d,0.5)/2*a;
    cout<<"roots ar3e imaginary and the roots are"<<endl;
    cout<<x<<"+i"<<y<<endl;
    cout<<x<<"-i"<<y;
}
}