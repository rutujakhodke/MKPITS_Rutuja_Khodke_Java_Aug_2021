//12.wap to print fibonacci series.(1,1,2,3,5,8,13)
int main()
{
	int num,i=0,next,n1=0,n2=1;//n1 and n2 are first and second value
	printf("\n enter the range of fibonacci series :");
	scanf("%d",&num);
	while(i<num)
	{
		if(i<=1)
		{
			next=i;
		}
		else
		{
			next=n1+n2;
			n1=n2;
			n2=next;
		}
		printf("%d \t",next);
		i++;
	}
	return 0;
}
