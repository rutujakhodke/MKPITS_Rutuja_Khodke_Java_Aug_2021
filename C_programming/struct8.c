//8.create a structure student and accept values from the user.
#include<stdio.h>
struct student
{
	int rno;
	char name[10];
	char course[10];
	char address[10];
	 double mobileno;
	
};
int main()
{
	struct student s1;
	printf("enter rno :");
	scanf("%d",&s1.rno);
	
	printf(" enter a name :");
	scanf("%s",&s1.name);
	
	printf("enter a course :");
	scanf("%s",&s1.course);
	
	printf("enter a address :");
	fflush(stdin);
	gets(s1.address);
	
	printf("enter a mobileno :");
	scanf("%Lf",&s1.mobileno);
	
	printf("\n student details are :");
	printf("\n rno=%d",s1.rno);//displaying the employee details.
	printf("\n name=%s",s1.name);
	printf("\n course=%s",s1.course);
	printf("\n address=%s",s1.address);
	printf("\n mobileno=%ld",s1.mobileno);
}
