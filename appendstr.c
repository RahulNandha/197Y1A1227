#include<stdio.h>
#include<string.h>
int main()
{
    char str[6]="Rahul";
    char ch='s';
    printf("oringional string:%s\n,str");
    printf("char to be appended:%c\n",ch);
    strncat(str,&ch,1);
    printf("appended string:%s\n",str);
    return 0;
}