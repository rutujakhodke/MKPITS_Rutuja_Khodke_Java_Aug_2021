//6.wap to print odd no. between 1 and 10 using while loop.
int main()
{
	int num=1;
	while(num<=10)
	{
		if(num%2!=0)
		{
			printf("\n odd number=%d",num);
		}
		num=num+1;
	}
	printf("\n bye");
}
