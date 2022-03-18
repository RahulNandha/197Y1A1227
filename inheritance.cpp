#include<bits/stdc++.h>
using namespace std;
class Parent
{
public:
int id_p;
};
class child:public Parent
{
    public:
    int id_c;
};
int main()
{
    child obj1;
    obj1.id_c=5;
    obj1.id_p=56;
    cout<<"child id is:"<<obj1.id_c<<'\n';
    cout<<"parent id is:"<<obj1.id_p<<'\n';
    return 0;
}