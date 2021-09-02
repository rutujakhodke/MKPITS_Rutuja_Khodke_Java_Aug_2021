//11.wap to accept a no. and print factorial of that no.

int main()
{
	int i,n,f=1;//f=1 initalize as a factorial
	printf("Enter a number : ");
	scanf("%d",&n);
	//to check condition 
	for(i=1;i<=n;i++)
	  f=f*i;
	  printf("the factorial of %d is : %d ",n,f);
		
	
}
