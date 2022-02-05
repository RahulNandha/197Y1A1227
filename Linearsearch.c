#include<stdio.h>
int main()
{
    int a[20],i,x,n;
    printf("how many elements:");
    scanf("%d",&a[i]);
    printf("enter array elements:");
    for(i=0;i<n;i++)
    scanf("%d",&a[i]);
    printf("element to search:");
    scanf("%d",&x);
    for(i=0;i<n;i++)
    if(a[i]==x)
    break;
    if(i<n)
    printf("element found at index %d",i);
    else
    printf("element not found");
    return 0;
}
