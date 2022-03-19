#include<stdio.h>
int main()
{
  int i,n,m=0,status;
  status=0;
  printf("enter the nbr to check prime or not:");
  scanf("%d",&n);
  m=n/2;
  for(i=2;i<+m;i++)
 {
    if(n%i==0)

 {
     printf("nbr is not a primenbr");
     status=1;
     break;
 }
 }
  if(status==0)
 {
    printf("nbr is prime");
    return 0;
 }
}