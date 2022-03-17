#include<stdio.h>
#include<stdalign.h>
struct node
{
    int data;
    struct node*next;
};
struct node*header=NULL;
struct node*ptr=NULL,*temp=NULL;
 void create();
 void insert_at_front();
 void insert_at_end();
 void insert_at_middle();
 void delete_at_front();
 void delete_at_end();
 void delete_at_middle();
 void display();
int main()
{
    int ch;
    header=(struct node*)malloc(sizeof(struct node));
    header->next=NULL;
    ptr=header;
    printf("\n1.create\n2.insert at front\n3.insert at middle\n4.insert at end\n5.Display\n6.Delete at front\n7.dlete at middle\n8.delete at end\n9.Exit\n");
    while (1)
    {
        printf("\n enter your choice:");
        scanf("%d",&ch);
        {
            switch (ch)
            {
            case 1:create();
            break;
            case 2:insert_at_front();
            break;
            case 3:insert_at_middle
            break;
            case 4:insert_at_end();
            break;
            case 5:display
            break;
            case 6:delete_at_front;
            break;
            case 7:delete_at_middle;
            break;
            case 8:delete_at_end();
            break;
            case 9:exit(0); 
            default:printf("Wrong coice.\n");
            }
        }
    }
   void create()
   {
    char ch;
    while(1)
    {
        insert_at_end();
        printf("if you want to continue press 'y' or 'Y':\n");
        scanf("\n%c",&ch);
        if(ch=='y'||ch=='Y')
        continue;
        else 
        break;
    }      
   }   
   void insert_at_front()
   {
       int ele;
       struct node*new1;
       new1=(struct node*)malloc(sizeof(struct node));
       if(new1==NULL)
       {
           printf("Out of space.\n");
           return;
       }
       printf("Enter the element:");
       scanf("%d",&ele);
       new1->next=header->next;
       header->next=new1;
       new1->data=ele;
       printf("inserted successfully.\n");
   }
   void insert_at_end()
   {
       struct node*new1;
       int ele;
       new1=(struct node*)malloc(sizeof(struct node));
       ptr=header;
       if(new1=NULL)
       {
        printf("Out of space.\n");
        scanf("%d",&ele);
        while(ptr->next!=NULL)
        {
            ptr=ptr->next;
        }
        new1->next=NULL;
        ptr->next=new1;
        new1->data=ele;
        printf("inserted successfully.\n");
       }
       void insert_at_middle()
       {
           struct node*new1;
           int ele;
           int pos;
           int cout=0;
           new1=(struct node*)malloc(sizeof(struct node));
           ptr=header;
           if(new1=NULL)
           {
            printf("out of space.\n");
            return;
           }
        printf("enter the element:");
        scanf("%d",&ele);
        printf("enter the position where you want to insert the element:");
        scanf("%d",&pos);
        while(ptr->next1=NULL)
        {
            count++;
            ptr=ptr->next;
        }
        if(cout<pos)
       }
       printf("position is out of range.\n");
       return;
   }
   ptr=header;
   count=0;
   while(count<pos-1)
   {
       ptr=ptr->next;
       count++;
   }
   new1->next=ptr->next;
   ptr->next=new1;
   new1->data=ele;
   printf("inserted successfully.\n");
}
void display()
{
    ptr=header;
    if(ptr->next==NULL)
    {
        printf("List is empty.\n");
        return;
    }
    while(ptr->next!=NULL)
    {
        printf("%d->",ptr->next->data);
        ptr=ptr->next;
    }
    printf("NULL\n");
}
    void delete_at_front()
    {
        ptr=header;
        if(ptr->next==NULL)
        {
            printf("list is empty,deletion is not possible,\n");
            return;
        }
        temp=ptr->next;
        ptr->next=ptr->next->next;
        free(temp);
        printf("deleted successfully.\n");
    }
    void delete_at_end()
    {
        ptr=header;
        if(ptr->next==NULL)
        {
            printf("list is empty,deletion not possible.\n");
            return;
        }
        while(ptr->next->next!=NULL)
        {
          ptr=ptr->next;
        }
        temp=ptr->next;
        ptr->next=NULL;
        free(temp);
        printf("deleted successfully.\n");
    }
    void delete_at_middle()
    {
        int pos,count;
        ptr=header;
        if(ptr->next!==NULL)
        {
            ptr=ptr->next;
            count++;
        }
    printf("enter the position at which deletion has to be done:");
    scanf("%d",&pos);
    if(count<pos)
    {
        printf("position out of range.\n");
        return;
    }
    ptr=header;
    count=0;
    while(ptr->next->next!=NULL&&count<pos-1)
    {
     ptr=ptr->next;
     count++;
    }
    temp=ptr->next;
    ptr->next=ptr->next->next;
    free(temp);
    printf("deleted successfully.\n");w
}





