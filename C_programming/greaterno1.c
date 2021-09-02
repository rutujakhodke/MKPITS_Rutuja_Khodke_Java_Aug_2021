//5.wap to print greater of 3 no.

int main()
{
	int num1,num2,num3;
	printf("enter a 3 no.");
	scanf("%d %d %d",&num1,&num2,&num3);
	if(num1>num2 && num1>num3)
	{
		printf("%d is greater",num1);
	}
	else if(num2>num1 && num2>num3)
	{
		printf("%d is greater",num2);
	}
	else
	{
		printf("%d is greater",num3);
	}
	
	
}
