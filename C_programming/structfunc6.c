//14.create a structure array to produce result of student.
struct student
{
	int rno;
	char name[20];
	int marks1,marks2,marks3;
};
void display(struct student s1);

int main()
{
	struct student stud[3];
	int i=0;
	while(i<3)
	{
		printf("\n enter a roll no. :");
		scanf("%d",&stud[i].rno);
		
		printf("enter a name of student :");
		scanf("%s",&stud[i].name);
		
		printf("enter a marks1 :");
		scanf("%d",&stud[i].marks1);
		
		printf("enter a marks2 :");
		scanf("%d",&stud[i].marks2);
		
		printf("enter a marks3 :");
		scanf("%d",&stud[i].marks3);
		
		printf("\n-----------student[%d] details are--------",i+1);
		display(stud[i]);
		printf("\n-----------------------",i+1);
		i++;
	}
}
void display(struct student s1)
{
	int total;
	float per;
	printf("\n rno=%d",s1.rno);
	printf("\n name=%s",s1.name);
	total=s1.marks1+s1.marks2+s1.marks3;
	printf("\n total marks=%d",total);
	per=(float)(total/300.0f)*100.0f;
	printf("\n percentage=%f",per);
	
	if(per>=75)
	{
		printf("\n grade=distinction");
	}
	else if(per>=60 && per<75)
	{
		printf("\n grade=first");
	}
	else
	{
		printf("\n grade=fail");
	}
	
}
	

