//9.wap to accept salary from the user then calculate bonus=1000 if salary is greater than 10000,bonus=500,if salary 
//is greater than 5000 and less than 10000 bonus = 100 if salary is less than 5000.
int main()
{
	char name[20];
	float salary,bonus;
	printf("\n enter name of employee :");
	scanf("%s",&name);
	printf("\n enter a salary of employee :");
	scanf("%f",&salary);
	printf("\n enter bonus of employee :");
	scanf("%f",&bonus);
	bonus=salary+bonus;
	printf("\n employee salary =%.2f",salary);
	printf("\n employee bonus =%.2f",bonus);
	
	if(salary>10000)
	{
		printf("\n employee bonus = 1000.");
	}
	else if(salary>5000 && salary<10000)
	{
		printf("\n employee bonus = 500.");
	}
	else if(salary<5000)
	{
		printf("\n employee bonus = 100.");
	}
	else
	{
		printf("\n employee has not give bonus.");
	}
	return 0;
}
