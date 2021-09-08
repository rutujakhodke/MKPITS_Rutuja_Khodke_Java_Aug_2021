//wap to print prime nos.between 1 and 20 using while loop.
int main()
{
	int i,num=1,count;
	printf("prime numbers from 1 to 20 are :\n");
	while(num<=20)
	{
		count=0;
		i=2;
		while(i<=num/2)
		{
			if(num%i==0)
			{
				count++;
				break;
			}
			i++;
		}
		if(count==0 && num!=1)
		{
			printf("%d ",num);
		}
		num++;
	}
}
