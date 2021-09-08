//6.create a structure employee with members empid,empname,designation,salary
//accept the values from the user to store employee record in structure then display it.
struct employee
{
	int empId;
	char empname[20];
	char designation[20];
	float salary;
	
};
int main()
{
	struct employee emp1;
	printf("enter empId :");
	scanf("%d",&emp1.empId);
	
	printf(" enter a empname :");
	scanf("%s",&emp1.empname);
	
	printf("enter a designation :");
	scanf("%s",&emp1.designation);
	
	printf("enter a salary :");
	scanf("%f",&emp1.salary);
	
	printf("\n employee details are :");
	printf("\n empId=%d",emp1.empId);//displaying the employee details.
	printf("\n empname=%s",emp1.empname);
	printf("\n designation=%s",emp1.designation);
	printf("\n salary=%f",emp1.salary);
	
}
