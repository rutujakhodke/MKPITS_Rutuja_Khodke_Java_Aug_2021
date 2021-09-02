//11.wap to create structure array of 3 elements of structure student.
struct student
{
	int rno;
	char name[20];
	char address[20];
};
void display(struct student s1);
#include<stdio.h>
int main()
{
	struct student stud[3];//creating structure array of 3 elements.
	int i=0;
	while(i<3)
	{
		
		printf("\n enter a rno :");
		scanf("%d",&stud[i].rno);
		
		printf("enter a name : ");
		scanf("%s",&stud[i].name);
		
		printf("enter a address : ");
		fflush(stdin);
		gets(stud[i].address);
		
		printf("\n student[%d] details are :",i+1);
		display(stud[i]);//passing structure to function
		i++;
		printf("\n");
		
	}
}
void display(struct student s1)
{
	printf("\n rno=%d",s1.rno);
	printf("\n name=%s",s1.name);
	printf("\n address=%s",s1.address);
}

