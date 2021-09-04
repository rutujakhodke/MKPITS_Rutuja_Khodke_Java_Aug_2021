//2.wap to accept age from the user and display whether he is eligible to vote or not.
int main()
{
	int age;
	printf("enter your age :");
	scanf("%d",&age);
	if(age>=18)
	{
		printf("\n you are eligible to vote.");
	}
	else
	{
		printf("\n you are not eligible to vote.");
	}
	return 0;
}
