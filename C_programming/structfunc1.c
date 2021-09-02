//9.create a structure student with members rno,name,and address ,pass this structure to a function.
struct student
{
	int rno;
	char name[30];
	char address[30];
};
//creating function declaration
void display(struct student s1);
#include<stdio.h>
int main()
{
	struct student s1;
	printf("enter rno :");
	scanf("%d",&s1.rno);
	
	printf("enter a name :");
	scanf("%s",&s1.name);
	
	printf("enter address :");
	fflush(stdin);
	gets(s1.address);
	
	printf("\n student details are :");
	display(s1);//passing structure to function.
}
//creating function display with structure parameter to accept structure of type student.
    void display(struct student s1)
    {
    	printf("\n rno=%d",s1.rno);
    	printf("\n name=%s",s1.name);
    	printf("\n address=%s",s1.address);
    }
	
