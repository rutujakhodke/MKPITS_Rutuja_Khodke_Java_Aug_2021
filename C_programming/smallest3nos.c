//8.wap to accept 3 no. and print smallest no.
int main()
{
	int n1,n2,n3;
	printf("enter a 3 numbers :");
	scanf("%d %d %d",&n1,&n2,&n3);
	if(n1<n2 && n1<n3)
	{
		printf("\n n1 is smaller.");
	}
	else if(n2<n1 && n2<n3)
	{
		printf("\n n2 is smaller .");
	}
	else
	{
		printf("\n n3 is smaller.");
		return 0;
	}
}
