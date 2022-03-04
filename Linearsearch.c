#include<stdio.h>
int main()
{
    int a[20],i,search,n;
    printf("enter the no of elements:");
    scanf("%d",&n);
    printf("enter the elements:\n");
    for(i=0;i<n;i++)
    {
     printf("element %d:",i+1);
     scanf("%d",&a[i]);
    }
     printf("enter the element you want to search:");
     scanf("%d",search);
     for(i=0;i<n;i++)
     {
         if(a[i]==search)
         {
             printf("element found!\n");
             printf("%d is found at %d position.",search,i+1);
             break;
         }
     }
     if(i==n)
     printf("%d is not found!",search);
}
