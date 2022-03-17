#include<stdio.h>
#include<stdalign.h>
#define SIZE 40
struct queue
{
    int items[SIZE];
    int front;
    int rear;
    int p;
};
struct queue*createQueue();
void enqueue(struct queue*q,int);
int dequeue(struct queue*q);
void display(struct queue*q);
int isEmpty(struct queue*q);
void printQueue(struct queue*q);
struct node
{
    int p,vertex;
    struct node*next;
}
struct node*createNode(int);
struct Graph
{
int numVertices;
struct node**adjLists;
int*visited;
}
void bfs(struct Graph*graph,int startVertex)
{
    struct queue*q=createQueue();
    graph->visited[startVertex]=1;
    enqueue(q,startVertex);
    while(listEmpty(p))
    {
        printQueue(p);
        int currentVertex=dequeue(q);
        printf("\nVisited %d!\n",currentVertex);
        struct node*temp=graph->adjList[currentVertex];
        while(temp)
        {
            if adjVertex=temp->vertex;
            if(graph->visited[adjVertex]==0)
        {
         graph->visited[adjVertex]==1;
         enqueue(q,adjVertex);
        }
        temp=temp->next;
        }
    }
}
struct node*createNode(int v)
{
    struct node*newNode=malloc(sizeof(struct noce));
    newNode->vertex=v;
    newNode->next=NULL;
    return newNode;
}
struct Graph*createGraph(int vertices)
{
    struct Graph*graph=malloc(sizeof(struct Graph));
    graph->numVertices=vertices;
    graph->adjList=malloc(vertices*sizeof(stuct node*));
    graph->visited=malloc(vertice*sizeof(int));
    int i;
    for(i=0;i<verices;i++)
    {
        graph->adjLists[i]=NULL;
        graph->visited[i]=0;
    }
    return graph;
}
void addEdge(structGraph*graph,int src,int dest)
{
    struct node*newNode=createNode(dest);
    newNode->next=graph->adjList[src];
    graph->adjLists[src]=newnode;
    newNode=createNode(src);
    newNode->next=graph->adjLists[dest];
    graph->adjList[dest]=newNode;
}
struct queue*createQueue()
{
    struct queue*q=malloc(sizeof(stuct queue));
    q->front=-1;
    q->rear=-1;
    return q;
}
int is empty(struct queue*q)
{
    if(q->rear==-1)
    return1;
    else
    return 0;
}
void enqueue(struct queue*q,int value)
{
    if(q->rear==SIZE-1)
    printf("\n Queue is Full!!");
    else
    {
     if(q->front ==-1)
     q->front=0;
     q->rear++;
     q->items[q->rear]=value;
    }
}
int dequeue(struct queue*q)
{
    int item;
    if((is Empty(q))
    {
        printf("Queue is empty");
        item=-1;
    }
    else
    {
        item=q->items[q->front];
        q->front++;
        if (q->front>q->rear)
        {
            printf("reseting queue!");
            q->front=q->rear=-1;
        }
    }
    return item;
}
void printQueue(struct queue*q)
{
    int i=q->front;
    if(isEmpty(q))
    {
        printf("Queue is Empty");
    }
    else
    {
        printf("\nQueue contains:\n");
        for(i=q->front;i<-q->rear+1;i++)
        {
            printf("%d",q->items[i]);
        }
    }
}
int main()
{
    struct Graph*graph=createGraph(6);
    addEdge(graph,0,1);
    addEdge(graph,0,2);
    addEdge(graph,1,2);
    addEdge(graph,1,4);
    addEdge(graph,1,3);
    addEdge(graph,2,4);
    addEdge(graph,3,4);
    bfs(graph,0);
    return 0;
}
















