#include<iostream>
using namespace std;
class Employee
{
    char name[30];
    int age;
    public:
    void getdata(void);
void putdata(void);
};
void Employee::getdata(void)
{
    cout<<"enter name and age:";cin>>name>>age;
}
void Employee::putdata(void)
{
    cout<<name<<"\t"<<age<<endl;
}
int main()
{
    Employee e[5];int i;
    for(i=0;i<5;i++)
{
e[i].getdata();
}
for(i=0;i<5;i++)
{
    e[i].putdata();
}
}