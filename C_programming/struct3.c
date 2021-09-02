//3.create a structure employee with members empno,empname,designation and salary.
struct employee
{
	int empno;
	char empname[10];
	char designation[20];
	float salary;

};
int main()
{
	struct employee emp1;
	emp1.empno=101;
	strcpy(emp1.empname,"ramesh");
	strcpy(emp1.designation,"manager");
	emp1.salary=30,000.0f;
	
	printf("\n empno=%d",emp1.empno);
	printf("\n empname=%s",emp1.empname);
	printf("\n designation=%s",emp1.designation);
	printf("\n salary=%f",emp1.salary);
}
