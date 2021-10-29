#include<stdio.h>
struct marks
{
    int eng;
    int cds;
    int phy;
    int tot;
    int student;
};
int main()
{
    int i;
    static struct marks;
    student[3]={{74,83,73},{93,90,91},{83,96,90}};
    struct marks total;
    for(i=0;i<3;i++)
{
    student[i].tot=student[i].eng+student[i].cds+student[i].phy;
    total.eng=total.eng+student[i].eng;
    total.cds=total.cds+student[i].cds;
    total.phy=total.phy+student[i].phy;
    total.tot=total.tot+student[i].tot;
}
printf("STUDENT TOTAL\n\n");
for(i=0;i<3;i++)
printf("stu[%d]:%d\n",i+1,student[i].tot");
printf("\n\nSUBJECT TOTAL\n\n");
printf("english:%d\ncds:%d\nphy %d\n",total.eng,total.cds,total.phy);
printf("\nGrand total:%d\n",total.tot);
}