//11.
int main()
{
	int i,n;
	printf("enter odd numbers till :");
	scanf("%d",&n);
	 
	printf("\n odd numbers between 1 to %d are : \n",n);
	
	for(i=1;i<=n;i++)
	{
		if(i%2!=0)
		{
			printf("\n %d",i);
		}
	} 
	return 0;
}
