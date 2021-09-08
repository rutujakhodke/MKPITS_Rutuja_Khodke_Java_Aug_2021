//6.wap to accept a no.and print factorial of that no.using for loop.
int main()
{
	int num,fact=1;
	int i;
	printf("enter a number :");
	scanf("%d",&num);
	for(i=num;i>0;i--)
	{
	    fact=fact*i;	
	}
	printf("fact =%d",fact);
}
