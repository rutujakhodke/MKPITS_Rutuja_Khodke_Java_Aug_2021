//9.wap to accept a no.and print the table of that no.
int main()
{
	int num,result;
	int i=1;
	printf("enter a number :");
	scanf("%d",&num);
	
	while(i<=10)
	{
		result=num*i;
		printf("\n %d * %d = %d",num,i,result);
		i=i+1;
	}
}
