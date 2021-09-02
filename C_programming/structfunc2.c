//10.repeat the above program by creating 2 structure variables stud1 and stud2.
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
	struct student stud1,stud2;
	printf("enter a rno :");
	scanf("%d",&stud1.rno);
	
	printf("enter a name :");
	scanf("%s",&stud1.name);
	
	printf("enter a address :");
	fflush(stdin);
	gets(stud1.address);
	
	printf("\n student 1 details are :");
	display(stud1);//passing structure to function.
	
	//accepting values of second student.
	printf("\n");
	printf("\n enter a rno :");
	scanf("%d",&stud2.rno);
	
	printf("enter a name :");
	scanf("%s",&stud2.name);
	
	printf("enter a address :");
	fflush(stdin);
	gets(stud2.address);
	
	printf("\n student 2 details are :");
	display(stud2);//passing structure to function.
}
void display(struct student s1)
{
	printf("\n rno=%d",s1.rno);
	printf("\n name=%s",s1.name);
	printf("\n address=%s",s1.address);
}

