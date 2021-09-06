//11.wap to print prime no.between 1 and 20.
int main()
{
	int i,j,end,isprime;
	printf("enter prime numbers till :");
	scanf("%d",&end);
	 
	printf("\n prime numbers between  1 to %d are : \n",end);
	
	for(i=2;i<=end;i++)
	{
		isprime=1;
		for(j=2;j<=i/2;j++)
		{
			if(i%j ==0)
			{
				isprime=0;
				break;
			}
		}
		if(isprime ==1)
		{
			printf("%d, ",i);
		}
    }
    return 0;
	
}
