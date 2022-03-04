#include<iostream>
using namespace std;
class time
{
    int hours,minutes;
    public:
    void gettime(int h,int m)
    {
        hours=h,minutes=m;
    }
    void sum(time,time);
    void display(void);
};
void time::sum(time t1,time t2)
{
    minutes=t1.minutes+t2.minutes;
    hours=minutes/60;
    minutes=minutes%60;
    hours=hours+t1.hours+t2.hours;
}
void time::display()
{
 cout<<hours<<":"<<minutes<<endl;   
};
void mian()
{
    time; T1,T2,T3;
    T1.gettime(2,56);
    T2.gettime(5,25);
    T3.sum(T1,T2);
    T1.display();
    T2.display();
    cout<<"addition of above two time is";
    T3.display();
}