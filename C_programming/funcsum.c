//17.wap to create a function sum which return sum of two numbers.
int sum()
{
	int n1,n2,sum;
	printf("enter a number :");
	scanf("%d%d",&n1,&n2);
	sum=n1+n2;
	return sum;
	
}
int main()
{
	int result;
	result=sum();
	printf("sum=%d",result);
}
