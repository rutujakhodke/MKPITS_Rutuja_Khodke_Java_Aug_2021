//7.wap to accept a no. and print table of that no.using for loop.
int main()
{
	int i;
	int num,result;
	printf("enter a number :");
	scanf("%d",&num);
	for(i=1;i<=10;i++)
	{
		result=num*i;
		printf("\n %d * %d =%d",num,i,result);
	}
}
