//9.wap to accept 5 subject marks using for loop and print total and percentage.
//and calculate and display grade using if else statement.
int main()
{
	int marks,total;
	int i;
	float per;
	for(i=1;i<=5;i++)
	{
		printf("enter a marks :");
		scanf("%d",&marks);
		total=total+marks;
		
	}
	printf("\n total marks =%d",total);
	per=(float)(total/500.0f)*100.0f;
	printf("\n percentage =%.2f",per);
	if(per>=75)
	{
		printf("\n grade = first");
	}
	else
	{
		printf("\n grade = fail");
	}
}






