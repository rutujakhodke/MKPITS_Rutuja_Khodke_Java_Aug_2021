//8.wap to accept a no.and print whether it is a prime no.or not.
int main()
{
	int num,result;
	int i;
	printf("enter a number :");
	scanf("%d",&num);
	for(i=2;i<num;i++)
	{
		if(num%i ==0)
		{
			printf("\n not a prime number.");
			break;
		}
	}
	if(i==num)
	{
		printf("\n number is prime.");
	}
}
