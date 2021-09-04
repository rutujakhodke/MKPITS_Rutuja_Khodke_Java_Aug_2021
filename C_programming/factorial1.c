//8.wap to accept a no.to print factorial of that no.
int main()
{
	int num,fact=1;
	printf("enter a number :");
	scanf("%d",&num);//5
	
	while(num>0)
	{
		fact=fact*num;
		num=num-1;
	}
	printf("\n factorial of a number is %d ",fact);
	
}
