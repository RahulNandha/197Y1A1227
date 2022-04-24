#include<stdio.h>
int main()
{
    int i,n,a[20],low,high,middle,search;
    printf("enter the nof elements:");
    scanf("%d",&n);
    printf("enter the elements:\n");
    for(i=0;i<n;i++)
    {
        printf("element %d:",i+1);
        scanf("%d",&a[i]);
    }
    printf("enter the element yu want to search:");
    scanf("%d",&search);
    low=0;
    high=n-1;
    middle=(low+high)/2;
    while (low<=high)
    {
        if(a[middle]<search)
        low=middle+1;
        else if(a[middle]==search)
        {
            printf("element found!\n");
            printf("%d is found at %d position.",search,middle+1);
            break;
        }
        else 
        high=middle-1;
        middle=(low+high)/2;
    }
    if(low>high)
    printf("%d is not found!",search);
}
