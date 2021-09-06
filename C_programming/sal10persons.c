//13.wap to accept salary of 10 persons using for loop and print total salary and average salary.
int main()
{
	float salary,totalsal,avgsal;
	int num, i;
	for(i=1;i<=10;i++)
	{
		printf("\n enter a salary of 10 employees :");
		scanf("%f",&salary);
		totalsal=totalsal+salary;
	}
	
	printf("\n total salary of employee are :%.2f",totalsal);
	avgsal=(float)totalsal/10.0f;
	printf("\n average salary of employee =%.2f",avgsal);
}
