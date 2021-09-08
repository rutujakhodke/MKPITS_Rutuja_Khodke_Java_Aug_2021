//
int main()
{
	int i,n;
	printf("enter even numbers till :");
	scanf("%d",&n);
	 
	printf("\n even numbers between from 1 to %d are : \n",n);
	
	for(i=1;i<=n;i++)
	{
		if(i%2==0)
		{
			printf("\n %d",i);
		}
	} 
	return 0;
}
