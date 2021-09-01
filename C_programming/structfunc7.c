//15.create a structure array to produce employee salary statement.
struct employee
{
	int empno;
	char name[20];
	float salary;
};
void display(struct employee e1);

int main()
{
	struct employee emp[3];
	int i=0;
	while(i<3)
	{
		printf("\n enter employee no. :");
		scanf(" %d",&emp[i].empno);
		
		printf("enter a employee name :");
		scanf("%s",&emp[i].name);
		
		printf("enter a employee salary :");
		scanf("%f",&emp[i].salary);
		
		printf("\n-------------employee details[%d] are-----------\n\n",i+1);
		display(emp[i]);
		printf("\n------------------------",i+1);
		i++;
	}
}
void display(struct employee e1)
{
	float hra,da,totalsalary;
	
	printf("\n empno=%d",e1.empno);
	printf("\n name=%s",e1.name);
	
	hra=e1.salary*.15f;
	da=e1.salary*.35f;
	totalsalary=hra+da+e1.salary;
	
	printf("\n hra=%f",hra);
	printf("\n da=%f",da);
	printf("\n totalsalary=%f",totalsalary);
}
